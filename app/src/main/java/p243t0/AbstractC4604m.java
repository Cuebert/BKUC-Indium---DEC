package p243t0;

import kotlin.jvm.internal.C3844i;

/* renamed from: t0.m */
/* loaded from: classes.dex */
public abstract class AbstractC4604m extends Exception {

    /* renamed from: n */
    private final String f18363n;

    /* renamed from: o */
    private final CharSequence f18364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4604m(String type, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        C3844i.m16253f(type, "type");
        this.f18363n = type;
        this.f18364o = charSequence;
    }
}
