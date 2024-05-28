package lb;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p145kb.InterfaceC3828w;
import va.AbstractC4997a;
import va.InterfaceC5001e;

/* renamed from: lb.b */
/* loaded from: classes.dex */
public final class C3907b extends AbstractC4997a implements InterfaceC3828w {
    private volatile Object _preHandler;

    public C3907b() {
        super(InterfaceC3828w.f15889j);
        this._preHandler = this;
    }

    /* renamed from: j0 */
    private final Method m16575j0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z10 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z10 = true;
                }
            }
            if (z10) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // p145kb.InterfaceC3828w
    /* renamed from: Y */
    public void mo16234Y(InterfaceC5001e interfaceC5001e, Throwable th) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Method m16575j0 = m16575j0();
            Object invoke = m16575j0 != null ? m16575j0.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
