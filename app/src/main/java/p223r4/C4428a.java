package p223r4;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C0601a;
import p111i4.C3520b;
import p186o4.C4133a;
import p272v4.C4980b;

/* renamed from: r4.a */
/* loaded from: classes.dex */
public class C4428a {

    /* renamed from: a */
    private final boolean f18011a;

    /* renamed from: b */
    private final int f18012b;

    /* renamed from: c */
    private final int f18013c;

    /* renamed from: d */
    private final float f18014d;

    public C4428a(Context context) {
        this.f18011a = C4980b.m19401b(context, C3520b.f14529o, false);
        this.f18012b = C4133a.m17128a(context, C3520b.f14528n, 0);
        this.f18013c = C4133a.m17128a(context, C3520b.f14526l, 0);
        this.f18014d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m18229e(int i10) {
        return C0601a.m3180f(i10, 255) == this.f18013c;
    }

    /* renamed from: a */
    public float m18230a(float f10) {
        if (this.f18014d <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m18231b(int i10, float f10) {
        float m18230a = m18230a(f10);
        return C0601a.m3180f(C4133a.m17133f(C0601a.m3180f(i10, 255), this.f18012b, m18230a), Color.alpha(i10));
    }

    /* renamed from: c */
    public int m18232c(int i10, float f10) {
        return (this.f18011a && m18229e(i10)) ? m18231b(i10, f10) : i10;
    }

    /* renamed from: d */
    public boolean m18233d() {
        return this.f18011a;
    }
}
