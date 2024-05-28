package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.InterfaceC0000a;

/* renamed from: androidx.core.app.n */
/* loaded from: classes.dex */
public final class C0581n {

    /* renamed from: d */
    private static String f3209d;

    /* renamed from: g */
    private static d f3212g;

    /* renamed from: a */
    private final Context f3213a;

    /* renamed from: b */
    private final NotificationManager f3214b;

    /* renamed from: c */
    private static final Object f3208c = new Object();

    /* renamed from: e */
    private static Set<String> f3210e = new HashSet();

    /* renamed from: f */
    private static final Object f3211f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.n$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static boolean m2966a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        /* renamed from: b */
        static int m2967b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.n$b */
    /* loaded from: classes.dex */
    public static class b implements e {

        /* renamed from: a */
        final String f3215a;

        /* renamed from: b */
        final int f3216b;

        /* renamed from: c */
        final String f3217c;

        /* renamed from: d */
        final Notification f3218d;

        b(String str, int i10, String str2, Notification notification) {
            this.f3215a = str;
            this.f3216b = i10;
            this.f3217c = str2;
            this.f3218d = notification;
        }

        @Override // androidx.core.app.C0581n.e
        /* renamed from: a */
        public void mo2968a(InterfaceC0000a interfaceC0000a) throws RemoteException {
            interfaceC0000a.mo0x0(this.f3215a, this.f3216b, this.f3217c, this.f3218d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f3215a + ", id:" + this.f3216b + ", tag:" + this.f3217c + "]";
        }
    }

    /* renamed from: androidx.core.app.n$c */
    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a */
        final ComponentName f3219a;

        /* renamed from: b */
        final IBinder f3220b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f3219a = componentName;
            this.f3220b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.n$d */
    /* loaded from: classes.dex */
    public static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: a */
        private final Context f3221a;

        /* renamed from: b */
        private final HandlerThread f3222b;

        /* renamed from: c */
        private final Handler f3223c;

        /* renamed from: d */
        private final Map<ComponentName, a> f3224d = new HashMap();

        /* renamed from: e */
        private Set<String> f3225e = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.n$d$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ComponentName f3226a;

            /* renamed from: c */
            InterfaceC0000a f3228c;

            /* renamed from: b */
            boolean f3227b = false;

            /* renamed from: d */
            ArrayDeque<e> f3229d = new ArrayDeque<>();

            /* renamed from: e */
            int f3230e = 0;

            a(ComponentName componentName) {
                this.f3226a = componentName;
            }
        }

        d(Context context) {
            this.f3221a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f3222b = handlerThread;
            handlerThread.start();
            this.f3223c = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m2969a(a aVar) {
            if (aVar.f3227b) {
                return true;
            }
            boolean bindService = this.f3221a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f3226a), this, 33);
            aVar.f3227b = bindService;
            if (bindService) {
                aVar.f3230e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f3226a);
                this.f3221a.unbindService(this);
            }
            return aVar.f3227b;
        }

        /* renamed from: b */
        private void m2970b(a aVar) {
            if (aVar.f3227b) {
                this.f3221a.unbindService(this);
                aVar.f3227b = false;
            }
            aVar.f3228c = null;
        }

        /* renamed from: c */
        private void m2971c(e eVar) {
            m2977j();
            for (a aVar : this.f3224d.values()) {
                aVar.f3229d.add(eVar);
                m2975g(aVar);
            }
        }

        /* renamed from: d */
        private void m2972d(ComponentName componentName) {
            a aVar = this.f3224d.get(componentName);
            if (aVar != null) {
                m2975g(aVar);
            }
        }

        /* renamed from: e */
        private void m2973e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f3224d.get(componentName);
            if (aVar != null) {
                aVar.f3228c = InterfaceC0000a.a.m1i(iBinder);
                aVar.f3230e = 0;
                m2975g(aVar);
            }
        }

        /* renamed from: f */
        private void m2974f(ComponentName componentName) {
            a aVar = this.f3224d.get(componentName);
            if (aVar != null) {
                m2970b(aVar);
            }
        }

        /* renamed from: g */
        private void m2975g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f3226a + ", " + aVar.f3229d.size() + " queued tasks");
            }
            if (aVar.f3229d.isEmpty()) {
                return;
            }
            if (m2969a(aVar) && aVar.f3228c != null) {
                while (true) {
                    e peek = aVar.f3229d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo2968a(aVar.f3228c);
                        aVar.f3229d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f3226a);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f3226a, e10);
                    }
                }
                if (aVar.f3229d.isEmpty()) {
                    return;
                }
                m2976i(aVar);
                return;
            }
            m2976i(aVar);
        }

        /* renamed from: i */
        private void m2976i(a aVar) {
            if (this.f3223c.hasMessages(3, aVar.f3226a)) {
                return;
            }
            int i10 = aVar.f3230e + 1;
            aVar.f3230e = i10;
            if (i10 > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + aVar.f3229d.size() + " tasks to " + aVar.f3226a + " after " + aVar.f3230e + " retries");
                aVar.f3229d.clear();
                return;
            }
            int i11 = (1 << (i10 - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            this.f3223c.sendMessageDelayed(this.f3223c.obtainMessage(3, aVar.f3226a), i11);
        }

        /* renamed from: j */
        private void m2977j() {
            Set<String> m2960c = C0581n.m2960c(this.f3221a);
            if (m2960c.equals(this.f3225e)) {
                return;
            }
            this.f3225e = m2960c;
            List<ResolveInfo> queryIntentServices = this.f3221a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (m2960c.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f3224d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f3224d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f3224d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    m2970b(next.getValue());
                    it.remove();
                }
            }
        }

        /* renamed from: h */
        public void m2978h(e eVar) {
            this.f3223c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                m2971c((e) message.obj);
                return true;
            }
            if (i10 == 1) {
                c cVar = (c) message.obj;
                m2973e(cVar.f3219a, cVar.f3220b);
                return true;
            }
            if (i10 == 2) {
                m2974f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            m2972d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f3223c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f3223c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.n$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo2968a(InterfaceC0000a interfaceC0000a) throws RemoteException;
    }

    private C0581n(Context context) {
        this.f3213a = context;
        this.f3214b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: b */
    public static C0581n m2959b(Context context) {
        return new C0581n(context);
    }

    /* renamed from: c */
    public static Set<String> m2960c(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f3208c) {
            if (string != null) {
                if (!string.equals(f3209d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f3210e = hashSet;
                    f3209d = string;
                }
            }
            set = f3210e;
        }
        return set;
    }

    /* renamed from: f */
    private void m2961f(e eVar) {
        synchronized (f3211f) {
            if (f3212g == null) {
                f3212g = new d(this.f3213a.getApplicationContext());
            }
            f3212g.m2978h(eVar);
        }
    }

    /* renamed from: g */
    private static boolean m2962g(Notification notification) {
        Bundle m2796a = C0578k.m2796a(notification);
        return m2796a != null && m2796a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    public boolean m2963a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.m2966a(this.f3214b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f3213a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f3213a.getApplicationInfo();
        String packageName = this.f3213a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: d */
    public void m2964d(int i10, Notification notification) {
        m2965e(null, i10, notification);
    }

    /* renamed from: e */
    public void m2965e(String str, int i10, Notification notification) {
        if (m2962g(notification)) {
            m2961f(new b(this.f3213a.getPackageName(), i10, str, notification));
            this.f3214b.cancel(str, i10);
        } else {
            this.f3214b.notify(str, i10, notification);
        }
    }
}
