package p091gc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p091gc.InterfaceC3331c;
import p091gc.InterfaceC3334f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gc.q */
/* loaded from: classes.dex */
public class C3345q {

    /* renamed from: c */
    private static final C3345q f13950c = m14693e();

    /* renamed from: a */
    private final boolean f13951a;

    /* renamed from: b */
    private final Constructor<MethodHandles.Lookup> f13952b;

    /* renamed from: gc.q$a */
    /* loaded from: classes.dex */
    public static final class a extends C3345q {

        /* renamed from: gc.q$a$a */
        /* loaded from: classes.dex */
        static final class ExecutorC6050a implements Executor {

            /* renamed from: n */
            private final Handler f13953n = new Handler(Looper.getMainLooper());

            ExecutorC6050a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f13953n.post(runnable);
            }
        }

        a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // p091gc.C3345q
        /* renamed from: b */
        public Executor mo14696b() {
            return new ExecutorC6050a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p091gc.C3345q
        /* renamed from: g */
        public Object mo14699g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.mo14699g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    C3345q(boolean z10) {
        this.f13951a = z10;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z10) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f13952b = constructor;
    }

    /* renamed from: e */
    private static C3345q m14693e() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new a();
        }
        return new C3345q(true);
    }

    /* renamed from: f */
    public static C3345q m14694f() {
        return f13950c;
    }

    /* renamed from: a */
    public List<? extends InterfaceC3331c.a> m14695a(Executor executor) {
        C3335g c3335g = new C3335g(executor);
        return this.f13951a ? Arrays.asList(C3333e.f13842a, c3335g) : Collections.singletonList(c3335g);
    }

    /* renamed from: b */
    public Executor mo14696b() {
        return null;
    }

    /* renamed from: c */
    public List<? extends InterfaceC3334f.a> m14697c() {
        return this.f13951a ? Collections.singletonList(C3343o.f13903a) : Collections.emptyList();
    }

    /* renamed from: d */
    public int m14698d() {
        return this.f13951a ? 1 : 0;
    }

    @IgnoreJRERequirement
    /* renamed from: g */
    public Object mo14699g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f13952b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    /* renamed from: h */
    public boolean m14700h(Method method) {
        return this.f13951a && method.isDefault();
    }
}
