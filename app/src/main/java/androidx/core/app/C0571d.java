package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.d */
/* loaded from: classes.dex */
public final class C0571d {

    /* renamed from: a */
    protected static final Class<?> f3059a;

    /* renamed from: b */
    protected static final Field f3060b;

    /* renamed from: c */
    protected static final Field f3061c;

    /* renamed from: d */
    protected static final Method f3062d;

    /* renamed from: e */
    protected static final Method f3063e;

    /* renamed from: f */
    protected static final Method f3064f;

    /* renamed from: g */
    private static final Handler f3065g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ d f3066n;

        /* renamed from: o */
        final /* synthetic */ Object f3067o;

        a(d dVar, Object obj) {
            this.f3066n = dVar;
            this.f3067o = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3066n.f3072n = this.f3067o;
        }
    }

    /* renamed from: androidx.core.app.d$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Application f3068n;

        /* renamed from: o */
        final /* synthetic */ d f3069o;

        b(Application application, d dVar) {
            this.f3068n = application;
            this.f3069o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3068n.unregisterActivityLifecycleCallbacks(this.f3069o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.d$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Object f3070n;

        /* renamed from: o */
        final /* synthetic */ Object f3071o;

        c(Object obj, Object obj2) {
            this.f3070n = obj;
            this.f3071o = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C0571d.f3062d;
                if (method != null) {
                    method.invoke(this.f3070n, this.f3071o, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C0571d.f3063e.invoke(this.f3070n, this.f3071o, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d */
    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: n */
        Object f3072n;

        /* renamed from: o */
        private Activity f3073o;

        /* renamed from: p */
        private final int f3074p;

        /* renamed from: q */
        private boolean f3075q = false;

        /* renamed from: r */
        private boolean f3076r = false;

        /* renamed from: s */
        private boolean f3077s = false;

        d(Activity activity) {
            this.f3073o = activity;
            this.f3074p = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3073o == activity) {
                this.f3073o = null;
                this.f3076r = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f3076r || this.f3077s || this.f3075q || !C0571d.m2751h(this.f3072n, this.f3074p, activity)) {
                return;
            }
            this.f3077s = true;
            this.f3072n = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3073o == activity) {
                this.f3075q = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> m2744a = m2744a();
        f3059a = m2744a;
        f3060b = m2745b();
        f3061c = m2749f();
        f3062d = m2747d(m2744a);
        f3063e = m2746c(m2744a);
        f3064f = m2748e(m2744a);
    }

    /* renamed from: a */
    private static Class<?> m2744a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m2745b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m2746c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m2747d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m2748e(Class<?> cls) {
        if (m2750g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m2749f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m2750g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    /* renamed from: h */
    protected static boolean m2751h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f3061c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f3065g.postAtFrontOfQueue(new c(f3060b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m2752i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m2750g() && f3064f == null) {
            return false;
        }
        if (f3063e == null && f3062d == null) {
            return false;
        }
        try {
            Object obj2 = f3061c.get(activity);
            if (obj2 == null || (obj = f3060b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f3065g;
            handler.post(new a(dVar, obj2));
            try {
                if (m2750g()) {
                    Method method = f3064f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f3065g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
