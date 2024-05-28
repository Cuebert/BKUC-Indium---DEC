package p243t0;

import kotlin.jvm.internal.C3844i;

/* renamed from: t0.l */
/* loaded from: classes.dex */
public final class C4603l extends AbstractC4604m {

    /* renamed from: p */
    private final String f18362p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4603l(String type, CharSequence charSequence) {
        super(type, charSequence);
        C3844i.m16253f(type, "type");
        this.f18362p = type;
        if (!(m18700a().length() > 0)) {
            throw new IllegalArgumentException("type must not be empty".toString());
        }
    }

    /* renamed from: a */
    public String m18700a() {
        return this.f18362p;
    }
}
