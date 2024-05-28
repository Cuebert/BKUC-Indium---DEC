package p080g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0609a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g.b */
/* loaded from: classes.dex */
public class C3218b extends Drawable implements Drawable.Callback {

    /* renamed from: n */
    private d f13543n;

    /* renamed from: o */
    private Rect f13544o;

    /* renamed from: p */
    private Drawable f13545p;

    /* renamed from: q */
    private Drawable f13546q;

    /* renamed from: s */
    private boolean f13548s;

    /* renamed from: u */
    private boolean f13550u;

    /* renamed from: v */
    private Runnable f13551v;

    /* renamed from: w */
    private long f13552w;

    /* renamed from: x */
    private long f13553x;

    /* renamed from: y */
    private c f13554y;

    /* renamed from: r */
    private int f13547r = 255;

    /* renamed from: t */
    private int f13549t = -1;

    /* renamed from: g.b$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3218b.this.m14347a(true);
            C3218b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g.b$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static boolean m14351a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m14352b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m14353c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g.b$c */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: n */
        private Drawable.Callback f13556n;

        c() {
        }

        /* renamed from: a */
        public Drawable.Callback m14354a() {
            Drawable.Callback callback = this.f13556n;
            this.f13556n = null;
            return callback;
        }

        /* renamed from: b */
        public c m14355b(Drawable.Callback callback) {
            this.f13556n = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f13556n;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f13556n;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g.b$d */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {

        /* renamed from: A */
        int f13557A;

        /* renamed from: B */
        int f13558B;

        /* renamed from: C */
        boolean f13559C;

        /* renamed from: D */
        ColorFilter f13560D;

        /* renamed from: E */
        boolean f13561E;

        /* renamed from: F */
        ColorStateList f13562F;

        /* renamed from: G */
        PorterDuff.Mode f13563G;

        /* renamed from: H */
        boolean f13564H;

        /* renamed from: I */
        boolean f13565I;

        /* renamed from: a */
        final C3218b f13566a;

        /* renamed from: b */
        Resources f13567b;

        /* renamed from: c */
        int f13568c;

        /* renamed from: d */
        int f13569d;

        /* renamed from: e */
        int f13570e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f13571f;

        /* renamed from: g */
        Drawable[] f13572g;

        /* renamed from: h */
        int f13573h;

        /* renamed from: i */
        boolean f13574i;

        /* renamed from: j */
        boolean f13575j;

        /* renamed from: k */
        Rect f13576k;

        /* renamed from: l */
        boolean f13577l;

        /* renamed from: m */
        boolean f13578m;

        /* renamed from: n */
        int f13579n;

        /* renamed from: o */
        int f13580o;

        /* renamed from: p */
        int f13581p;

        /* renamed from: q */
        int f13582q;

        /* renamed from: r */
        boolean f13583r;

        /* renamed from: s */
        int f13584s;

        /* renamed from: t */
        boolean f13585t;

        /* renamed from: u */
        boolean f13586u;

        /* renamed from: v */
        boolean f13587v;

        /* renamed from: w */
        boolean f13588w;

        /* renamed from: x */
        boolean f13589x;

        /* renamed from: y */
        boolean f13590y;

        /* renamed from: z */
        int f13591z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(d dVar, C3218b c3218b, Resources resources) {
            Resources resources2;
            this.f13574i = false;
            this.f13577l = false;
            this.f13589x = true;
            this.f13557A = 0;
            this.f13558B = 0;
            this.f13566a = c3218b;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = dVar != null ? dVar.f13567b : null;
            }
            this.f13567b = resources2;
            int m14346f = C3218b.m14346f(resources, dVar != null ? dVar.f13568c : 0);
            this.f13568c = m14346f;
            if (dVar != null) {
                this.f13569d = dVar.f13569d;
                this.f13570e = dVar.f13570e;
                this.f13587v = true;
                this.f13588w = true;
                this.f13574i = dVar.f13574i;
                this.f13577l = dVar.f13577l;
                this.f13589x = dVar.f13589x;
                this.f13590y = dVar.f13590y;
                this.f13591z = dVar.f13591z;
                this.f13557A = dVar.f13557A;
                this.f13558B = dVar.f13558B;
                this.f13559C = dVar.f13559C;
                this.f13560D = dVar.f13560D;
                this.f13561E = dVar.f13561E;
                this.f13562F = dVar.f13562F;
                this.f13563G = dVar.f13563G;
                this.f13564H = dVar.f13564H;
                this.f13565I = dVar.f13565I;
                if (dVar.f13568c == m14346f) {
                    if (dVar.f13575j) {
                        this.f13576k = dVar.f13576k != null ? new Rect(dVar.f13576k) : null;
                        this.f13575j = true;
                    }
                    if (dVar.f13578m) {
                        this.f13579n = dVar.f13579n;
                        this.f13580o = dVar.f13580o;
                        this.f13581p = dVar.f13581p;
                        this.f13582q = dVar.f13582q;
                        this.f13578m = true;
                    }
                }
                if (dVar.f13583r) {
                    this.f13584s = dVar.f13584s;
                    this.f13583r = true;
                }
                if (dVar.f13585t) {
                    this.f13586u = dVar.f13586u;
                    this.f13585t = true;
                }
                Drawable[] drawableArr = dVar.f13572g;
                this.f13572g = new Drawable[drawableArr.length];
                this.f13573h = dVar.f13573h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f13571f;
                if (sparseArray != null) {
                    this.f13571f = sparseArray.clone();
                } else {
                    this.f13571f = new SparseArray<>(this.f13573h);
                }
                int i10 = this.f13573h;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null) {
                        Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                        if (constantState != null) {
                            this.f13571f.put(i11, constantState);
                        } else {
                            this.f13572g[i11] = drawableArr[i11];
                        }
                    }
                }
                return;
            }
            this.f13572g = new Drawable[10];
            this.f13573h = 0;
        }

        /* renamed from: e */
        private void m14356e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f13571f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f13572g[this.f13571f.keyAt(i10)] = m14357s(this.f13571f.valueAt(i10).newDrawable(this.f13567b));
                }
                this.f13571f = null;
            }
        }

        /* renamed from: s */
        private Drawable m14357s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                C0609a.m3258m(drawable, this.f13591z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f13566a);
            return mutate;
        }

        /* renamed from: a */
        public final int m14358a(Drawable drawable) {
            int i10 = this.f13573h;
            if (i10 >= this.f13572g.length) {
                mo14371o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f13566a);
            this.f13572g[i10] = drawable;
            this.f13573h++;
            this.f13570e = drawable.getChangingConfigurations() | this.f13570e;
            m14372p();
            this.f13576k = null;
            this.f13575j = false;
            this.f13578m = false;
            this.f13587v = false;
            return i10;
        }

        /* renamed from: b */
        final void m14359b(Resources.Theme theme) {
            if (theme != null) {
                m14356e();
                int i10 = this.f13573h;
                Drawable[] drawableArr = this.f13572g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && C0609a.m3247b(drawableArr[i11])) {
                        C0609a.m3246a(drawableArr[i11], theme);
                        this.f13570e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                m14379y(b.m14353c(theme));
            }
        }

        /* renamed from: c */
        public boolean m14360c() {
            if (this.f13587v) {
                return this.f13588w;
            }
            m14356e();
            this.f13587v = true;
            int i10 = this.f13573h;
            Drawable[] drawableArr = this.f13572g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f13588w = false;
                    return false;
                }
            }
            this.f13588w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f13573h;
            Drawable[] drawableArr = this.f13572g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    if (C0609a.m3247b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f13571f.get(i11);
                    if (constantState != null && b.m14351a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        protected void m14361d() {
            this.f13578m = true;
            m14356e();
            int i10 = this.f13573h;
            Drawable[] drawableArr = this.f13572g;
            this.f13580o = -1;
            this.f13579n = -1;
            this.f13582q = 0;
            this.f13581p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f13579n) {
                    this.f13579n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f13580o) {
                    this.f13580o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f13581p) {
                    this.f13581p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f13582q) {
                    this.f13582q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public final int m14362f() {
            return this.f13572g.length;
        }

        /* renamed from: g */
        public final Drawable m14363g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f13572g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f13571f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable m14357s = m14357s(this.f13571f.valueAt(indexOfKey).newDrawable(this.f13567b));
            this.f13572g[i10] = m14357s;
            this.f13571f.removeAt(indexOfKey);
            if (this.f13571f.size() == 0) {
                this.f13571f = null;
            }
            return m14357s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13569d | this.f13570e;
        }

        /* renamed from: h */
        public final int m14364h() {
            return this.f13573h;
        }

        /* renamed from: i */
        public final int m14365i() {
            if (!this.f13578m) {
                m14361d();
            }
            return this.f13580o;
        }

        /* renamed from: j */
        public final int m14366j() {
            if (!this.f13578m) {
                m14361d();
            }
            return this.f13582q;
        }

        /* renamed from: k */
        public final int m14367k() {
            if (!this.f13578m) {
                m14361d();
            }
            return this.f13581p;
        }

        /* renamed from: l */
        public final Rect m14368l() {
            Rect rect = null;
            if (this.f13574i) {
                return null;
            }
            Rect rect2 = this.f13576k;
            if (rect2 != null || this.f13575j) {
                return rect2;
            }
            m14356e();
            Rect rect3 = new Rect();
            int i10 = this.f13573h;
            Drawable[] drawableArr = this.f13572g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f13575j = true;
            this.f13576k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int m14369m() {
            if (!this.f13578m) {
                m14361d();
            }
            return this.f13579n;
        }

        /* renamed from: n */
        public final int m14370n() {
            if (this.f13583r) {
                return this.f13584s;
            }
            m14356e();
            int i10 = this.f13573h;
            Drawable[] drawableArr = this.f13572g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f13584s = opacity;
            this.f13583r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo14371o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f13572g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f13572g = drawableArr;
        }

        /* renamed from: p */
        void m14372p() {
            this.f13583r = false;
            this.f13585t = false;
        }

        /* renamed from: q */
        public final boolean m14373q() {
            return this.f13577l;
        }

        /* renamed from: r */
        abstract void mo14339r();

        /* renamed from: t */
        public final void m14374t(boolean z10) {
            this.f13577l = z10;
        }

        /* renamed from: u */
        public final void m14375u(int i10) {
            this.f13557A = i10;
        }

        /* renamed from: v */
        public final void m14376v(int i10) {
            this.f13558B = i10;
        }

        /* renamed from: w */
        final boolean m14377w(int i10, int i11) {
            int i12 = this.f13573h;
            Drawable[] drawableArr = this.f13572g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean m3258m = Build.VERSION.SDK_INT >= 23 ? C0609a.m3258m(drawableArr[i13], i10) : false;
                    if (i13 == i11) {
                        z10 = m3258m;
                    }
                }
            }
            this.f13591z = i10;
            return z10;
        }

        /* renamed from: x */
        public final void m14378x(boolean z10) {
            this.f13574i = z10;
        }

        /* renamed from: y */
        final void m14379y(Resources resources) {
            if (resources != null) {
                this.f13567b = resources;
                int m14346f = C3218b.m14346f(resources, this.f13568c);
                int i10 = this.f13568c;
                this.f13568c = m14346f;
                if (i10 != m14346f) {
                    this.f13578m = false;
                    this.f13575j = false;
                }
            }
        }
    }

    /* renamed from: d */
    private void m14344d(Drawable drawable) {
        if (this.f13554y == null) {
            this.f13554y = new c();
        }
        drawable.setCallback(this.f13554y.m14355b(drawable.getCallback()));
        try {
            if (this.f13543n.f13557A <= 0 && this.f13548s) {
                drawable.setAlpha(this.f13547r);
            }
            d dVar = this.f13543n;
            if (dVar.f13561E) {
                drawable.setColorFilter(dVar.f13560D);
            } else {
                if (dVar.f13564H) {
                    C0609a.m3260o(drawable, dVar.f13562F);
                }
                d dVar2 = this.f13543n;
                if (dVar2.f13565I) {
                    C0609a.m3261p(drawable, dVar2.f13563G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f13543n.f13589x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C0609a.m3258m(drawable, C0609a.m3251f(this));
            }
            C0609a.m3255j(drawable, this.f13543n.f13559C);
            Rect rect = this.f13544o;
            if (rect != null) {
                C0609a.m3257l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f13554y.m14354a());
        }
    }

    /* renamed from: e */
    private boolean m14345e() {
        return isAutoMirrored() && C0609a.m3251f(this) == 1;
    }

    /* renamed from: f */
    static int m14346f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m14347a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f13548s = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f13545p
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f13552w
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f13547r
            r3.setAlpha(r9)
            r13.f13552w = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            g.b$d r9 = r13.f13543n
            int r9 = r9.f13557A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f13547r
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f13552w = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f13546q
            if (r9 == 0) goto L65
            long r10 = r13.f13553x
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f13546q = r0
            r13.f13553x = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b$d r4 = r13.f13543n
            int r4 = r4.f13558B
            int r3 = r3 / r4
            int r4 = r13.f13547r
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f13553x = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f13551v
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p080g.C3218b.m14347a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f13543n.m14359b(theme);
    }

    /* renamed from: b */
    d mo14324b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m14348c() {
        return this.f13549t;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f13543n.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f13545p;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f13546q;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m14349g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f13549t
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b$d r0 = r9.f13543n
            int r0 = r0.f13558B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f13546q
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f13545p
            if (r0 == 0) goto L29
            r9.f13546q = r0
            g.b$d r0 = r9.f13543n
            int r0 = r0.f13558B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f13553x = r0
            goto L35
        L29:
            r9.f13546q = r4
            r9.f13553x = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f13545p
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.b$d r0 = r9.f13543n
            int r1 = r0.f13573h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m14363g(r10)
            r9.f13545p = r0
            r9.f13549t = r10
            if (r0 == 0) goto L5a
            g.b$d r10 = r9.f13543n
            int r10 = r10.f13557A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f13552w = r2
        L51:
            r9.m14344d(r0)
            goto L5a
        L55:
            r9.f13545p = r4
            r10 = -1
            r9.f13549t = r10
        L5a:
            long r0 = r9.f13552w
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f13553x
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f13551v
            if (r0 != 0) goto L73
            g.b$a r0 = new g.b$a
            r0.<init>()
            r9.f13551v = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m14347a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p080g.C3218b.m14349g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f13547r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f13543n.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f13543n.m14360c()) {
            return null;
        }
        this.f13543n.f13569d = getChangingConfigurations();
        return this.f13543n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f13545p;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f13544o;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f13543n.m14373q()) {
            return this.f13543n.m14365i();
        }
        Drawable drawable = this.f13545p;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f13543n.m14373q()) {
            return this.f13543n.m14369m();
        }
        Drawable drawable = this.f13545p;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f13543n.m14373q()) {
            return this.f13543n.m14366j();
        }
        Drawable drawable = this.f13545p;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f13543n.m14373q()) {
            return this.f13543n.m14367k();
        }
        Drawable drawable = this.f13545p;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f13545p;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f13543n.m14370n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f13545p;
        if (drawable != null) {
            b.m14352b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m14368l = this.f13543n.m14368l();
        if (m14368l != null) {
            rect.set(m14368l);
            padding = (m14368l.right | ((m14368l.left | m14368l.top) | m14368l.bottom)) != 0;
        } else {
            Drawable drawable = this.f13545p;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (m14345e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14325h(d dVar) {
        this.f13543n = dVar;
        int i10 = this.f13549t;
        if (i10 >= 0) {
            Drawable m14363g = dVar.m14363g(i10);
            this.f13545p = m14363g;
            if (m14363g != null) {
                m14344d(m14363g);
            }
        }
        this.f13546q = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m14350i(Resources resources) {
        this.f13543n.m14379y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f13543n;
        if (dVar != null) {
            dVar.m14372p();
        }
        if (drawable != this.f13545p || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f13543n.f13559C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f13546q;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f13546q = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f13545p;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f13548s) {
                this.f13545p.setAlpha(this.f13547r);
            }
        }
        if (this.f13553x != 0) {
            this.f13553x = 0L;
            z10 = true;
        }
        if (this.f13552w != 0) {
            this.f13552w = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f13550u && super.mutate() == this) {
            d mo14324b = mo14324b();
            mo14324b.mo14339r();
            mo14325h(mo14324b);
            this.f13550u = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13546q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f13545p;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f13543n.m14377w(i10, m14348c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f13546q;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f13545p;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f13546q;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f13545p;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f13545p || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f13548s && this.f13547r == i10) {
            return;
        }
        this.f13548s = true;
        this.f13547r = i10;
        Drawable drawable = this.f13545p;
        if (drawable != null) {
            if (this.f13552w == 0) {
                drawable.setAlpha(i10);
            } else {
                m14347a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f13543n;
        if (dVar.f13559C != z10) {
            dVar.f13559C = z10;
            Drawable drawable = this.f13545p;
            if (drawable != null) {
                C0609a.m3255j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f13543n;
        dVar.f13561E = true;
        if (dVar.f13560D != colorFilter) {
            dVar.f13560D = colorFilter;
            Drawable drawable = this.f13545p;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f13543n;
        if (dVar.f13589x != z10) {
            dVar.f13589x = z10;
            Drawable drawable = this.f13545p;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f13545p;
        if (drawable != null) {
            C0609a.m3256k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f13544o;
        if (rect == null) {
            this.f13544o = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f13545p;
        if (drawable != null) {
            C0609a.m3257l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f13543n;
        dVar.f13564H = true;
        if (dVar.f13562F != colorStateList) {
            dVar.f13562F = colorStateList;
            C0609a.m3260o(this.f13545p, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f13543n;
        dVar.f13565I = true;
        if (dVar.f13563G != mode) {
            dVar.f13563G = mode;
            C0609a.m3261p(this.f13545p, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f13546q;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f13545p;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f13545p || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
