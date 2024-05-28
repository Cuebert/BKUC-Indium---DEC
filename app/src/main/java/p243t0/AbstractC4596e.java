package p243t0;

import kotlin.jvm.internal.C3844i;

/* renamed from: t0.e */
/* loaded from: classes.dex */
public abstract class AbstractC4596e extends Exception {

    /* renamed from: n */
    private final String f18354n;

    /* renamed from: o */
    private final CharSequence f18355o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4596e(String type, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        C3844i.m16253f(type, "type");
        this.f18354n = type;
        this.f18355o = charSequence;
    }
}
