package p085g4;

/* renamed from: g4.d */
/* loaded from: classes.dex */
public final class C3247d extends IllegalStateException {
    private C3247d(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static IllegalStateException m14484a(AbstractC3263l<?> abstractC3263l) {
        String str;
        if (!abstractC3263l.mo14507n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception mo14503j = abstractC3263l.mo14503j();
        if (mo14503j != null) {
            str = "failure";
        } else if (abstractC3263l.mo14508o()) {
            str = "result ".concat(String.valueOf(abstractC3263l.mo14504k()));
        } else {
            str = abstractC3263l.mo14506m() ? "cancellation" : "unknown issue";
        }
        return new C3247d("Complete with: ".concat(str), mo14503j);
    }
}
