package p069f2;

/* renamed from: f2.b */
/* loaded from: classes.dex */
public final class C3125b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m13774a(int i10, TInput tinput, InterfaceC3124a<TInput, TResult, TException> interfaceC3124a, InterfaceC3126c<TInput, TResult> interfaceC3126c) throws Throwable {
        TResult mo7195a;
        if (i10 < 1) {
            return interfaceC3124a.mo7195a(tinput);
        }
        do {
            mo7195a = interfaceC3124a.mo7195a(tinput);
            tinput = interfaceC3126c.mo7196a(tinput, mo7195a);
            if (tinput == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return mo7195a;
    }
}
