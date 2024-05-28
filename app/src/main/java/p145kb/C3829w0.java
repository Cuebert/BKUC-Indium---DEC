package p145kb;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C3844i;

/* renamed from: kb.w0 */
/* loaded from: classes.dex */
public final class C3829w0 extends CancellationException {

    /* renamed from: n */
    public final transient InterfaceC3827v0 f15891n;

    public C3829w0(String str, Throwable th, InterfaceC3827v0 interfaceC3827v0) {
        super(str);
        this.f15891n = interfaceC3827v0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C3829w0) {
                C3829w0 c3829w0 = (C3829w0) obj;
                if (!C3844i.m16248a(c3829w0.getMessage(), getMessage()) || !C3844i.m16248a(c3829w0.f15891n, this.f15891n) || !C3844i.m16248a(c3829w0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C3844i.m16250c(message);
        int hashCode = ((message.hashCode() * 31) + this.f15891n.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f15891n;
    }
}
