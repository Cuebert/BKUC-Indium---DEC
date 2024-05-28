package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: androidx.core.graphics.b */
/* loaded from: classes.dex */
public final class C0602b {

    /* renamed from: e */
    public static final C0602b f3318e = new C0602b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f3319a;

    /* renamed from: b */
    public final int f3320b;

    /* renamed from: c */
    public final int f3321c;

    /* renamed from: d */
    public final int f3322d;

    /* renamed from: androidx.core.graphics.b$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static Insets m3186a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private C0602b(int i10, int i11, int i12, int i13) {
        this.f3319a = i10;
        this.f3320b = i11;
        this.f3321c = i12;
        this.f3322d = i13;
    }

    /* renamed from: a */
    public static C0602b m3181a(C0602b c0602b, C0602b c0602b2) {
        return m3182b(Math.max(c0602b.f3319a, c0602b2.f3319a), Math.max(c0602b.f3320b, c0602b2.f3320b), Math.max(c0602b.f3321c, c0602b2.f3321c), Math.max(c0602b.f3322d, c0602b2.f3322d));
    }

    /* renamed from: b */
    public static C0602b m3182b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f3318e;
        }
        return new C0602b(i10, i11, i12, i13);
    }

    /* renamed from: c */
    public static C0602b m3183c(Rect rect) {
        return m3182b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C0602b m3184d(Insets insets) {
        return m3182b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets m3185e() {
        return a.m3186a(this.f3319a, this.f3320b, this.f3321c, this.f3322d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0602b.class != obj.getClass()) {
            return false;
        }
        C0602b c0602b = (C0602b) obj;
        return this.f3322d == c0602b.f3322d && this.f3319a == c0602b.f3319a && this.f3321c == c0602b.f3321c && this.f3320b == c0602b.f3320b;
    }

    public int hashCode() {
        return (((((this.f3319a * 31) + this.f3320b) * 31) + this.f3321c) * 31) + this.f3322d;
    }

    public String toString() {
        return "Insets{left=" + this.f3319a + ", top=" + this.f3320b + ", right=" + this.f3321c + ", bottom=" + this.f3322d + '}';
    }
}
