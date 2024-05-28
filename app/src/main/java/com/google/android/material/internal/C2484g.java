package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.C0654h;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Constructor;

/* renamed from: com.google.android.material.internal.g */
/* loaded from: classes.dex */
final class C2484g {

    /* renamed from: n */
    static final int f9637n;

    /* renamed from: o */
    private static boolean f9638o;

    /* renamed from: p */
    private static Constructor<StaticLayout> f9639p;

    /* renamed from: q */
    private static Object f9640q;

    /* renamed from: a */
    private CharSequence f9641a;

    /* renamed from: b */
    private final TextPaint f9642b;

    /* renamed from: c */
    private final int f9643c;

    /* renamed from: e */
    private int f9645e;

    /* renamed from: l */
    private boolean f9652l;

    /* renamed from: d */
    private int f9644d = 0;

    /* renamed from: f */
    private Layout.Alignment f9646f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    private int f9647g = Integer.MAX_VALUE;

    /* renamed from: h */
    private float f9648h = 0.0f;

    /* renamed from: i */
    private float f9649i = 1.0f;

    /* renamed from: j */
    private int f9650j = f9637n;

    /* renamed from: k */
    private boolean f9651k = true;

    /* renamed from: m */
    private TextUtils.TruncateAt f9653m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.g$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        f9637n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private C2484g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f9641a = charSequence;
        this.f9642b = textPaint;
        this.f9643c = i10;
        this.f9645e = charSequence.length();
    }

    /* renamed from: b */
    private void m11347b() throws a {
        if (f9638o) {
            return;
        }
        try {
            f9640q = this.f9652l && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f9639p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f9638o = true;
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    /* renamed from: c */
    public static C2484g m11348c(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new C2484g(charSequence, textPaint, i10);
    }

    /* renamed from: a */
    public StaticLayout m11349a() throws a {
        if (this.f9641a == null) {
            this.f9641a = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.f9643c);
        CharSequence charSequence = this.f9641a;
        if (this.f9647g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f9642b, max, this.f9653m);
        }
        int min = Math.min(charSequence.length(), this.f9645e);
        this.f9645e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f9652l && this.f9647g == 1) {
                this.f9646f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f9644d, min, this.f9642b, max);
            obtain.setAlignment(this.f9646f);
            obtain.setIncludePad(this.f9651k);
            obtain.setTextDirection(this.f9652l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f9653m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f9647g);
            float f10 = this.f9648h;
            if (f10 != 0.0f || this.f9649i != 1.0f) {
                obtain.setLineSpacing(f10, this.f9649i);
            }
            if (this.f9647g > 1) {
                obtain.setHyphenationFrequency(this.f9650j);
            }
            return obtain.build();
        }
        m11347b();
        try {
            return (StaticLayout) ((Constructor) C0654h.m3467f(f9639p)).newInstance(charSequence, Integer.valueOf(this.f9644d), Integer.valueOf(this.f9645e), this.f9642b, Integer.valueOf(max), this.f9646f, C0654h.m3467f(f9640q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f9651k), null, Integer.valueOf(max), Integer.valueOf(this.f9647g));
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    /* renamed from: d */
    public C2484g m11350d(Layout.Alignment alignment) {
        this.f9646f = alignment;
        return this;
    }

    /* renamed from: e */
    public C2484g m11351e(TextUtils.TruncateAt truncateAt) {
        this.f9653m = truncateAt;
        return this;
    }

    /* renamed from: f */
    public C2484g m11352f(int i10) {
        this.f9650j = i10;
        return this;
    }

    /* renamed from: g */
    public C2484g m11353g(boolean z10) {
        this.f9651k = z10;
        return this;
    }

    /* renamed from: h */
    public C2484g m11354h(boolean z10) {
        this.f9652l = z10;
        return this;
    }

    /* renamed from: i */
    public C2484g m11355i(float f10, float f11) {
        this.f9648h = f10;
        this.f9649i = f11;
        return this;
    }

    /* renamed from: j */
    public C2484g m11356j(int i10) {
        this.f9647g = i10;
        return this;
    }
}
