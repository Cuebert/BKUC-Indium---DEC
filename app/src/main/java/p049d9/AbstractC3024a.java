package p049d9;

import android.content.Context;
import android.text.style.ClickableSpan;

/* renamed from: d9.a */
/* loaded from: classes.dex */
public abstract class AbstractC3024a extends ClickableSpan {

    /* renamed from: n */
    protected String f12882n;

    /* renamed from: o */
    protected Context f12883o;

    /* renamed from: p */
    private String f12884p;

    /* renamed from: q */
    private int f12885q;

    /* renamed from: r */
    private int f12886r;

    public AbstractC3024a(String str, Context context, String str2, int i10, int i11) {
        this.f12883o = context;
        this.f12882n = str;
        this.f12884p = str2;
        this.f12885q = i10;
        this.f12886r = i11;
    }

    /* renamed from: a */
    public String m13488a() {
        return this.f12884p;
    }

    /* renamed from: b */
    public int m13489b() {
        return this.f12886r;
    }

    /* renamed from: c */
    public int m13490c() {
        return this.f12885q;
    }
}
