package p224r5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p057e3.C3062a;
import p259u3.HandlerC4845e;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r5.p */
/* loaded from: classes.dex */
public final class ServiceConnectionC4444p implements ServiceConnection {

    /* renamed from: a */
    int f18041a;

    /* renamed from: b */
    final Messenger f18042b;

    /* renamed from: c */
    C4435g f18043c;

    /* renamed from: d */
    final Queue<AbstractC4437i<?>> f18044d;

    /* renamed from: e */
    final SparseArray<AbstractC4437i<?>> f18045e;

    /* renamed from: f */
    final /* synthetic */ C4443o f18046f;

    private ServiceConnectionC4444p(C4443o c4443o) {
        this.f18046f = c4443o;
        this.f18041a = 0;
        this.f18042b = new Messenger(new HandlerC4845e(Looper.getMainLooper(), new Handler.Callback(this) { // from class: r5.s

            /* renamed from: a */
            private final ServiceConnectionC4444p f18048a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f18048a = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f18048a.m18262d(message);
            }
        }));
        this.f18044d = new ArrayDeque();
        this.f18045e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m18259a() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f18046f.f18038b;
        scheduledExecutorService.execute(new Runnable(this) { // from class: r5.b

            /* renamed from: n */
            private final ServiceConnectionC4444p f18015n;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f18015n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC4437i<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final ServiceConnectionC4444p serviceConnectionC4444p = this.f18015n;
                while (true) {
                    synchronized (serviceConnectionC4444p) {
                        if (serviceConnectionC4444p.f18041a != 2) {
                            return;
                        }
                        if (serviceConnectionC4444p.f18044d.isEmpty()) {
                            serviceConnectionC4444p.m18264f();
                            return;
                        }
                        poll = serviceConnectionC4444p.f18044d.poll();
                        serviceConnectionC4444p.f18045e.put(poll.f18024a, poll);
                        scheduledExecutorService2 = serviceConnectionC4444p.f18046f.f18038b;
                        scheduledExecutorService2.schedule(new Runnable(serviceConnectionC4444p, poll) { // from class: r5.d

                            /* renamed from: n */
                            private final ServiceConnectionC4444p f18018n;

                            /* renamed from: o */
                            private final AbstractC4437i f18019o;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.f18018n = serviceConnectionC4444p;
                                this.f18019o = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f18018n.m18260b(this.f18019o.f18024a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    context = serviceConnectionC4444p.f18046f.f18037a;
                    Messenger messenger = serviceConnectionC4444p.f18042b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f18026c;
                    obtain.arg1 = poll.f18024a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo18235d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", poll.f18027d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC4444p.f18043c.m18236a(obtain);
                    } catch (RemoteException e10) {
                        serviceConnectionC4444p.m18261c(2, e10.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void m18260b(int i10) {
        AbstractC4437i<?> abstractC4437i = this.f18045e.get(i10);
        if (abstractC4437i != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f18045e.remove(i10);
            abstractC4437i.m18239c(new C4436h(3, "Timed out waiting for response"));
            m18264f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void m18261c(int i10, String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.f18041a;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    return;
                }
                int i12 = this.f18041a;
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown state: ");
                sb2.append(i12);
                throw new IllegalStateException(sb2.toString());
            }
            this.f18041a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f18041a = 4;
        C3062a m13522b = C3062a.m13522b();
        context = this.f18046f.f18037a;
        m13522b.m13528c(context, this);
        C4436h c4436h = new C4436h(i10, str);
        Iterator<AbstractC4437i<?>> it = this.f18044d.iterator();
        while (it.hasNext()) {
            it.next().m18239c(c4436h);
        }
        this.f18044d.clear();
        for (int i13 = 0; i13 < this.f18045e.size(); i13++) {
            this.f18045e.valueAt(i13).m18239c(c4436h);
        }
        this.f18045e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m18262d(Message message) {
        int i10 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Received response to request: ");
            sb2.append(i10);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        synchronized (this) {
            AbstractC4437i<?> abstractC4437i = this.f18045e.get(i10);
            if (abstractC4437i == null) {
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("Received response for unknown request: ");
                sb3.append(i10);
                Log.w("MessengerIpcClient", sb3.toString());
                return true;
            }
            this.f18045e.remove(i10);
            m18264f();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                abstractC4437i.m18239c(new C4436h(4, "Not supported by GmsCore"));
            } else {
                abstractC4437i.mo18234a(data);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized boolean m18263e(AbstractC4437i<?> abstractC4437i) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i10 = this.f18041a;
        if (i10 == 0) {
            this.f18044d.add(abstractC4437i);
            C5984j.m21289m(this.f18041a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f18041a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            C3062a m13522b = C3062a.m13522b();
            context = this.f18046f.f18037a;
            if (!m13522b.m13527a(context, intent, this, 1)) {
                m18261c(0, "Unable to bind to service");
            } else {
                scheduledExecutorService = this.f18046f.f18038b;
                scheduledExecutorService.schedule(new Runnable(this) { // from class: r5.r

                    /* renamed from: n */
                    private final ServiceConnectionC4444p f18047n;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f18047n = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18047n.m18265g();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
            return true;
        }
        if (i10 == 1) {
            this.f18044d.add(abstractC4437i);
            return true;
        }
        if (i10 == 2) {
            this.f18044d.add(abstractC4437i);
            m18259a();
            return true;
        }
        if (i10 != 3 && i10 != 4) {
            int i11 = this.f18041a;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unknown state: ");
            sb2.append(i11);
            throw new IllegalStateException(sb2.toString());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void m18264f() {
        Context context;
        if (this.f18041a == 2 && this.f18044d.isEmpty() && this.f18045e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f18041a = 3;
            C3062a m13522b = C3062a.m13522b();
            context = this.f18046f.f18037a;
            m13522b.m13528c(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void m18265g() {
        if (this.f18041a == 1) {
            m18261c(1, "Timed out while binding");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f18046f.f18038b;
        scheduledExecutorService.execute(new Runnable(this, iBinder) { // from class: r5.c

            /* renamed from: n */
            private final ServiceConnectionC4444p f18016n;

            /* renamed from: o */
            private final IBinder f18017o;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f18016n = this;
                this.f18017o = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4444p serviceConnectionC4444p = this.f18016n;
                IBinder iBinder2 = this.f18017o;
                synchronized (serviceConnectionC4444p) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC4444p.m18261c(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC4444p.f18043c = new C4435g(iBinder2);
                            serviceConnectionC4444p.f18041a = 2;
                            serviceConnectionC4444p.m18259a();
                        } catch (RemoteException e10) {
                            serviceConnectionC4444p.m18261c(0, e10.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f18046f.f18038b;
        scheduledExecutorService.execute(new Runnable(this) { // from class: r5.e

            /* renamed from: n */
            private final ServiceConnectionC4444p f18020n;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f18020n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18020n.m18261c(2, "Service disconnected");
            }
        });
    }
}
