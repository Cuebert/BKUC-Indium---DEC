package p243t0;

import kotlin.jvm.internal.C3844i;

/* renamed from: t0.d */
/* loaded from: classes.dex */
public final class C4595d extends AbstractC4596e {

    /* renamed from: p */
    private final String f18353p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4595d(String type, CharSequence charSequence) {
        super(type, charSequence);
        C3844i.m16253f(type, "type");
        this.f18353p = type;
        if (!(m18699a().length() > 0)) {
            throw new IllegalArgumentException("type must not be empty".toString());
        }
    }

    /* renamed from: a */
    public String m18699a() {
        return this.f18353p;
    }
}
