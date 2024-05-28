package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C0690v;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0699a implements View.OnTouchListener {

    /* renamed from: E */
    private static final int f3690E = ViewConfiguration.getTapTimeout();

    /* renamed from: A */
    boolean f3691A;

    /* renamed from: B */
    boolean f3692B;

    /* renamed from: C */
    private boolean f3693C;

    /* renamed from: D */
    private boolean f3694D;

    /* renamed from: p */
    final View f3697p;

    /* renamed from: q */
    private Runnable f3698q;

    /* renamed from: t */
    private int f3701t;

    /* renamed from: u */
    private int f3702u;

    /* renamed from: y */
    private boolean f3706y;

    /* renamed from: z */
    boolean f3707z;

    /* renamed from: n */
    final a f3695n = new a();

    /* renamed from: o */
    private final Interpolator f3696o = new AccelerateInterpolator();

    /* renamed from: r */
    private float[] f3699r = {0.0f, 0.0f};

    /* renamed from: s */
    private float[] f3700s = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: v */
    private float[] f3703v = {0.0f, 0.0f};

    /* renamed from: w */
    private float[] f3704w = {0.0f, 0.0f};

    /* renamed from: x */
    private float[] f3705x = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f3708a;

        /* renamed from: b */
        private int f3709b;

        /* renamed from: c */
        private float f3710c;

        /* renamed from: d */
        private float f3711d;

        /* renamed from: j */
        private float f3717j;

        /* renamed from: k */
        private int f3718k;

        /* renamed from: e */
        private long f3712e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f3716i = -1;

        /* renamed from: f */
        private long f3713f = 0;

        /* renamed from: g */
        private int f3714g = 0;

        /* renamed from: h */
        private int f3715h = 0;

        a() {
        }

        /* renamed from: e */
        private float m4112e(long j10) {
            long j11 = this.f3712e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f3716i;
            if (j12 >= 0 && j10 >= j12) {
                float f10 = this.f3717j;
                return (1.0f - f10) + (f10 * AbstractViewOnTouchListenerC0699a.m4091e(((float) (j10 - j12)) / this.f3718k, 0.0f, 1.0f));
            }
            return AbstractViewOnTouchListenerC0699a.m4091e(((float) (j10 - j11)) / this.f3708a, 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: g */
        private float m4113g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        /* renamed from: a */
        public void m4114a() {
            if (this.f3713f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float m4113g = m4113g(m4112e(currentAnimationTimeMillis));
                long j10 = currentAnimationTimeMillis - this.f3713f;
                this.f3713f = currentAnimationTimeMillis;
                float f10 = ((float) j10) * m4113g;
                this.f3714g = (int) (this.f3710c * f10);
                this.f3715h = (int) (f10 * this.f3711d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int m4115b() {
            return this.f3714g;
        }

        /* renamed from: c */
        public int m4116c() {
            return this.f3715h;
        }

        /* renamed from: d */
        public int m4117d() {
            float f10 = this.f3710c;
            return (int) (f10 / Math.abs(f10));
        }

        /* renamed from: f */
        public int m4118f() {
            float f10 = this.f3711d;
            return (int) (f10 / Math.abs(f10));
        }

        /* renamed from: h */
        public boolean m4119h() {
            return this.f3716i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3716i + ((long) this.f3718k);
        }

        /* renamed from: i */
        public void m4120i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3718k = AbstractViewOnTouchListenerC0699a.m4092f((int) (currentAnimationTimeMillis - this.f3712e), 0, this.f3709b);
            this.f3717j = m4112e(currentAnimationTimeMillis);
            this.f3716i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m4121j(int i10) {
            this.f3709b = i10;
        }

        /* renamed from: k */
        public void m4122k(int i10) {
            this.f3708a = i10;
        }

        /* renamed from: l */
        public void m4123l(float f10, float f11) {
            this.f3710c = f10;
            this.f3711d = f11;
        }

        /* renamed from: m */
        public void m4124m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3712e = currentAnimationTimeMillis;
            this.f3716i = -1L;
            this.f3713f = currentAnimationTimeMillis;
            this.f3717j = 0.5f;
            this.f3714g = 0;
            this.f3715h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0699a abstractViewOnTouchListenerC0699a = AbstractViewOnTouchListenerC0699a.this;
            if (abstractViewOnTouchListenerC0699a.f3692B) {
                if (abstractViewOnTouchListenerC0699a.f3707z) {
                    abstractViewOnTouchListenerC0699a.f3707z = false;
                    abstractViewOnTouchListenerC0699a.f3695n.m4124m();
                }
                a aVar = AbstractViewOnTouchListenerC0699a.this.f3695n;
                if (!aVar.m4119h() && AbstractViewOnTouchListenerC0699a.this.m4111u()) {
                    AbstractViewOnTouchListenerC0699a abstractViewOnTouchListenerC0699a2 = AbstractViewOnTouchListenerC0699a.this;
                    if (abstractViewOnTouchListenerC0699a2.f3691A) {
                        abstractViewOnTouchListenerC0699a2.f3691A = false;
                        abstractViewOnTouchListenerC0699a2.m4099c();
                    }
                    aVar.m4114a();
                    AbstractViewOnTouchListenerC0699a.this.mo4100j(aVar.m4115b(), aVar.m4116c());
                    C0690v.m3837i0(AbstractViewOnTouchListenerC0699a.this.f3697p, this);
                    return;
                }
                AbstractViewOnTouchListenerC0699a.this.f3692B = false;
            }
        }
    }

    public AbstractViewOnTouchListenerC0699a(View view) {
        this.f3697p = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        m4105o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        m4106p(f12, f12);
        m4102l(1);
        m4104n(Float.MAX_VALUE, Float.MAX_VALUE);
        m4109s(0.2f, 0.2f);
        m4110t(1.0f, 1.0f);
        m4101k(f3690E);
        m4108r(500);
        m4107q(500);
    }

    /* renamed from: d */
    private float m4090d(int i10, float f10, float f11, float f12) {
        float m4094h = m4094h(this.f3699r[i10], f11, this.f3700s[i10], f10);
        if (m4094h == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f3703v[i10];
        float f14 = this.f3704w[i10];
        float f15 = this.f3705x[i10];
        float f16 = f13 * f12;
        if (m4094h > 0.0f) {
            return m4091e(m4094h * f16, f14, f15);
        }
        return -m4091e((-m4094h) * f16, f14, f15);
    }

    /* renamed from: e */
    static float m4091e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* renamed from: f */
    static int m4092f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    /* renamed from: g */
    private float m4093g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f3701t;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f3692B && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m4094h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float m4091e = m4091e(f10 * f11, 0.0f, f12);
        float m4093g = m4093g(f11 - f13, m4091e) - m4093g(f13, m4091e);
        if (m4093g < 0.0f) {
            interpolation = -this.f3696o.getInterpolation(-m4093g);
        } else {
            if (m4093g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f3696o.getInterpolation(m4093g);
        }
        return m4091e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m4095i() {
        if (this.f3707z) {
            this.f3692B = false;
        } else {
            this.f3695n.m4120i();
        }
    }

    /* renamed from: v */
    private void m4096v() {
        int i10;
        if (this.f3698q == null) {
            this.f3698q = new b();
        }
        this.f3692B = true;
        this.f3707z = true;
        if (!this.f3706y && (i10 = this.f3702u) > 0) {
            C0690v.m3839j0(this.f3697p, this.f3698q, i10);
        } else {
            this.f3698q.run();
        }
        this.f3706y = true;
    }

    /* renamed from: a */
    public abstract boolean mo4097a(int i10);

    /* renamed from: b */
    public abstract boolean mo4098b(int i10);

    /* renamed from: c */
    void m4099c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3697p.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo4100j(int i10, int i11);

    /* renamed from: k */
    public AbstractViewOnTouchListenerC0699a m4101k(int i10) {
        this.f3702u = i10;
        return this;
    }

    /* renamed from: l */
    public AbstractViewOnTouchListenerC0699a m4102l(int i10) {
        this.f3701t = i10;
        return this;
    }

    /* renamed from: m */
    public AbstractViewOnTouchListenerC0699a m4103m(boolean z10) {
        if (this.f3693C && !z10) {
            m4095i();
        }
        this.f3693C = z10;
        return this;
    }

    /* renamed from: n */
    public AbstractViewOnTouchListenerC0699a m4104n(float f10, float f11) {
        float[] fArr = this.f3700s;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* renamed from: o */
    public AbstractViewOnTouchListenerC0699a m4105o(float f10, float f11) {
        float[] fArr = this.f3705x;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3693C
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m4095i()
            goto L58
        L1a:
            r5.f3691A = r2
            r5.f3706y = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3697p
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m4090d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3697p
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m4090d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3695n
            r7.m4123l(r0, r6)
            boolean r6 = r5.f3692B
            if (r6 != 0) goto L58
            boolean r6 = r5.m4111u()
            if (r6 == 0) goto L58
            r5.m4096v()
        L58:
            boolean r6 = r5.f3694D
            if (r6 == 0) goto L61
            boolean r6 = r5.f3692B
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC0699a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractViewOnTouchListenerC0699a m4106p(float f10, float f11) {
        float[] fArr = this.f3704w;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractViewOnTouchListenerC0699a m4107q(int i10) {
        this.f3695n.m4121j(i10);
        return this;
    }

    /* renamed from: r */
    public AbstractViewOnTouchListenerC0699a m4108r(int i10) {
        this.f3695n.m4122k(i10);
        return this;
    }

    /* renamed from: s */
    public AbstractViewOnTouchListenerC0699a m4109s(float f10, float f11) {
        float[] fArr = this.f3699r;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* renamed from: t */
    public AbstractViewOnTouchListenerC0699a m4110t(float f10, float f11) {
        float[] fArr = this.f3703v;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m4111u() {
        a aVar = this.f3695n;
        int m4118f = aVar.m4118f();
        int m4117d = aVar.m4117d();
        return (m4118f != 0 && mo4098b(m4118f)) || (m4117d != 0 && mo4097a(m4117d));
    }
}
