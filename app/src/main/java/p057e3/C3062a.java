package p057e3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p070f3.C3137k;
import p096h3.C3393c;
import p321z2.C5984j;
import p321z2.InterfaceC5997p0;

/* renamed from: e3.a */
/* loaded from: classes.dex */
public class C3062a {

    /* renamed from: b */
    private static final Object f12899b = new Object();

    /* renamed from: c */
    private static volatile C3062a f12900c;

    /* renamed from: a */
    public final ConcurrentHashMap f12901a = new ConcurrentHashMap();

    private C3062a() {
    }

    /* renamed from: b */
    public static C3062a m13522b() {
        if (f12900c == null) {
            synchronized (f12899b) {
                if (f12900c == null) {
                    f12900c = new C3062a();
                }
            }
        }
        C3062a c3062a = f12900c;
        C5984j.m21286j(c3062a);
        return c3062a;
    }

    /* renamed from: e */
    private static void m13523e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m13524f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C3393c.m14952a(context).m14947b(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (m13525g(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f12901a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean m13526h = m13526h(context, intent, serviceConnection, i10, executor);
                if (m13526h) {
                    return m13526h;
                }
                return false;
            } finally {
                this.f12901a.remove(serviceConnection, serviceConnection);
            }
        }
        return m13526h(context, intent, serviceConnection, i10, executor);
    }

    /* renamed from: g */
    private static boolean m13525g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC5997p0);
    }

    /* renamed from: h */
    private static final boolean m13526h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return (!C3137k.m13806j() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: a */
    public boolean m13527a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return m13524f(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    /* renamed from: c */
    public void m13528c(Context context, ServiceConnection serviceConnection) {
        if (m13525g(serviceConnection) && this.f12901a.containsKey(serviceConnection)) {
            try {
                m13523e(context, (ServiceConnection) this.f12901a.get(serviceConnection));
                return;
            } finally {
                this.f12901a.remove(serviceConnection);
            }
        }
        m13523e(context, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: d */
    public final boolean m13529d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return m13524f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
