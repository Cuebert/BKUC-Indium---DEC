package p224r5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import p084g3.ThreadFactoryC3239a;
import p085g4.AbstractC3263l;
import p259u3.C4841a;
import p259u3.C4846f;

/* renamed from: r5.o */
/* loaded from: classes.dex */
public final class C4443o {

    /* renamed from: e */
    private static C4443o f18036e;

    /* renamed from: a */
    private final Context f18037a;

    /* renamed from: b */
    private final ScheduledExecutorService f18038b;

    /* renamed from: c */
    private ServiceConnectionC4444p f18039c = new ServiceConnectionC4444p(this);

    /* renamed from: d */
    private int f18040d = 1;

    private C4443o(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f18038b = scheduledExecutorService;
        this.f18037a = context.getApplicationContext();
    }

    /* renamed from: a */
    private final synchronized int m18252a() {
        int i10;
        i10 = this.f18040d;
        this.f18040d = i10 + 1;
        return i10;
    }

    /* renamed from: d */
    private final synchronized <T> AbstractC3263l<T> m18254d(AbstractC4437i<T> abstractC4437i) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(abstractC4437i);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f18039c.m18263e(abstractC4437i)) {
            ServiceConnectionC4444p serviceConnectionC4444p = new ServiceConnectionC4444p(this);
            this.f18039c = serviceConnectionC4444p;
            serviceConnectionC4444p.m18263e(abstractC4437i);
        }
        return abstractC4437i.f18025b.m14512a();
    }

    /* renamed from: e */
    public static synchronized C4443o m18255e(Context context) {
        C4443o c4443o;
        synchronized (C4443o.class) {
            if (f18036e == null) {
                f18036e = new C4443o(context, C4841a.m19031a().mo19032a(1, new ThreadFactoryC3239a("MessengerIpcClient"), C4846f.f18712a));
            }
            c4443o = f18036e;
        }
        return c4443o;
    }

    /* renamed from: c */
    public final AbstractC3263l<Void> m18257c(int i10, Bundle bundle) {
        return m18254d(new C4434f(m18252a(), 2, bundle));
    }

    /* renamed from: f */
    public final AbstractC3263l<Bundle> m18258f(int i10, Bundle bundle) {
        return m18254d(new C4439k(m18252a(), 1, bundle));
    }
}
