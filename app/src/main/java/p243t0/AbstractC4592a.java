package p243t0;

import kotlin.jvm.internal.C3844i;

/* renamed from: t0.a */
/* loaded from: classes.dex */
public abstract class AbstractC4592a extends Exception {

    /* renamed from: n */
    private final String f18349n;

    /* renamed from: o */
    private final CharSequence f18350o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4592a(String type, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        C3844i.m16253f(type, "type");
        this.f18349n = type;
        this.f18350o = charSequence;
    }
}
