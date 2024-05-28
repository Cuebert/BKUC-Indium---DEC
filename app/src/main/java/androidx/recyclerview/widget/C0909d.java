package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C0690v;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C0909d extends RecyclerView.AbstractC0888o implements RecyclerView.InterfaceC0893t {

    /* renamed from: D */
    private static final int[] f4724D = {R.attr.state_pressed};

    /* renamed from: E */
    private static final int[] f4725E = new int[0];

    /* renamed from: A */
    int f4726A;

    /* renamed from: B */
    private final Runnable f4727B;

    /* renamed from: C */
    private final RecyclerView.AbstractC0894u f4728C;

    /* renamed from: a */
    private final int f4729a;

    /* renamed from: b */
    private final int f4730b;

    /* renamed from: c */
    final StateListDrawable f4731c;

    /* renamed from: d */
    final Drawable f4732d;

    /* renamed from: e */
    private final int f4733e;

    /* renamed from: f */
    private final int f4734f;

    /* renamed from: g */
    private final StateListDrawable f4735g;

    /* renamed from: h */
    private final Drawable f4736h;

    /* renamed from: i */
    private final int f4737i;

    /* renamed from: j */
    private final int f4738j;

    /* renamed from: k */
    int f4739k;

    /* renamed from: l */
    int f4740l;

    /* renamed from: m */
    float f4741m;

    /* renamed from: n */
    int f4742n;

    /* renamed from: o */
    int f4743o;

    /* renamed from: p */
    float f4744p;

    /* renamed from: s */
    private RecyclerView f4747s;

    /* renamed from: z */
    final ValueAnimator f4754z;

    /* renamed from: q */
    private int f4745q = 0;

    /* renamed from: r */
    private int f4746r = 0;

    /* renamed from: t */
    private boolean f4748t = false;

    /* renamed from: u */
    private boolean f4749u = false;

    /* renamed from: v */
    private int f4750v = 0;

    /* renamed from: w */
    private int f4751w = 0;

    /* renamed from: x */
    private final int[] f4752x = new int[2];

    /* renamed from: y */
    private final int[] f4753y = new int[2];

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0909d.this.m5765q(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    class b extends RecyclerView.AbstractC0894u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0894u
        /* renamed from: b */
        public void mo5502b(RecyclerView recyclerView, int i10, int i11) {
            C0909d.this.m5763B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4757a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4757a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4757a) {
                this.f4757a = false;
                return;
            }
            if (((Float) C0909d.this.f4754z.getAnimatedValue()).floatValue() == 0.0f) {
                C0909d c0909d = C0909d.this;
                c0909d.f4726A = 0;
                c0909d.m5769y(0);
            } else {
                C0909d c0909d2 = C0909d.this;
                c0909d2.f4726A = 2;
                c0909d2.m5768v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0909d.this.f4731c.setAlpha(floatValue);
            C0909d.this.f4732d.setAlpha(floatValue);
            C0909d.this.m5768v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0909d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4754z = ofFloat;
        this.f4726A = 0;
        this.f4727B = new a();
        this.f4728C = new b();
        this.f4731c = stateListDrawable;
        this.f4732d = drawable;
        this.f4735g = stateListDrawable2;
        this.f4736h = drawable2;
        this.f4733e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f4734f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f4737i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f4738j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f4729a = i11;
        this.f4730b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        m5764j(recyclerView);
    }

    /* renamed from: C */
    private void m5750C(float f10) {
        int[] m5756p = m5756p();
        float max = Math.max(m5756p[0], Math.min(m5756p[1], f10));
        if (Math.abs(this.f4740l - max) < 2.0f) {
            return;
        }
        int m5760x = m5760x(this.f4741m, max, m5756p, this.f4747s.computeVerticalScrollRange(), this.f4747s.computeVerticalScrollOffset(), this.f4746r);
        if (m5760x != 0) {
            this.f4747s.scrollBy(0, m5760x);
        }
        this.f4741m = max;
    }

    /* renamed from: k */
    private void m5751k() {
        this.f4747s.removeCallbacks(this.f4727B);
    }

    /* renamed from: l */
    private void m5752l() {
        this.f4747s.m5190V0(this);
        this.f4747s.m5192W0(this);
        this.f4747s.m5194X0(this.f4728C);
        m5751k();
    }

    /* renamed from: m */
    private void m5753m(Canvas canvas) {
        int i10 = this.f4746r;
        int i11 = this.f4737i;
        int i12 = this.f4743o;
        int i13 = this.f4742n;
        this.f4735g.setBounds(0, 0, i13, i11);
        this.f4736h.setBounds(0, 0, this.f4745q, this.f4738j);
        canvas.translate(0.0f, i10 - i11);
        this.f4736h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f4735g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: n */
    private void m5754n(Canvas canvas) {
        int i10 = this.f4745q;
        int i11 = this.f4733e;
        int i12 = i10 - i11;
        int i13 = this.f4740l;
        int i14 = this.f4739k;
        int i15 = i13 - (i14 / 2);
        this.f4731c.setBounds(0, 0, i11, i14);
        this.f4732d.setBounds(0, 0, this.f4734f, this.f4746r);
        if (m5758s()) {
            this.f4732d.draw(canvas);
            canvas.translate(this.f4733e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f4731c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f4733e, -i15);
            return;
        }
        canvas.translate(i12, 0.0f);
        this.f4732d.draw(canvas);
        canvas.translate(0.0f, i15);
        this.f4731c.draw(canvas);
        canvas.translate(-i12, -i15);
    }

    /* renamed from: o */
    private int[] m5755o() {
        int[] iArr = this.f4753y;
        int i10 = this.f4730b;
        iArr[0] = i10;
        iArr[1] = this.f4745q - i10;
        return iArr;
    }

    /* renamed from: p */
    private int[] m5756p() {
        int[] iArr = this.f4752x;
        int i10 = this.f4730b;
        iArr[0] = i10;
        iArr[1] = this.f4746r - i10;
        return iArr;
    }

    /* renamed from: r */
    private void m5757r(float f10) {
        int[] m5755o = m5755o();
        float max = Math.max(m5755o[0], Math.min(m5755o[1], f10));
        if (Math.abs(this.f4743o - max) < 2.0f) {
            return;
        }
        int m5760x = m5760x(this.f4744p, max, m5755o, this.f4747s.computeHorizontalScrollRange(), this.f4747s.computeHorizontalScrollOffset(), this.f4745q);
        if (m5760x != 0) {
            this.f4747s.scrollBy(m5760x, 0);
        }
        this.f4744p = max;
    }

    /* renamed from: s */
    private boolean m5758s() {
        return C0690v.m3791E(this.f4747s) == 1;
    }

    /* renamed from: w */
    private void m5759w(int i10) {
        m5751k();
        this.f4747s.postDelayed(this.f4727B, i10);
    }

    /* renamed from: x */
    private int m5760x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    /* renamed from: z */
    private void m5761z() {
        this.f4747s.m5206g(this);
        this.f4747s.m5209i(this);
        this.f4747s.m5212j(this.f4728C);
    }

    /* renamed from: A */
    public void m5762A() {
        int i10 = this.f4726A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f4754z.cancel();
            }
        }
        this.f4726A = 1;
        ValueAnimator valueAnimator = this.f4754z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4754z.setDuration(500L);
        this.f4754z.setStartDelay(0L);
        this.f4754z.start();
    }

    /* renamed from: B */
    void m5763B(int i10, int i11) {
        int computeVerticalScrollRange = this.f4747s.computeVerticalScrollRange();
        int i12 = this.f4746r;
        this.f4748t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f4729a;
        int computeHorizontalScrollRange = this.f4747s.computeHorizontalScrollRange();
        int i13 = this.f4745q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f4729a;
        this.f4749u = z10;
        boolean z11 = this.f4748t;
        if (!z11 && !z10) {
            if (this.f4750v != 0) {
                m5769y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f4740l = (int) ((f10 * (i11 + (f10 / 2.0f))) / computeVerticalScrollRange);
            this.f4739k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (this.f4749u) {
            float f11 = i13;
            this.f4743o = (int) ((f11 * (i10 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f4742n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = this.f4750v;
        if (i14 == 0 || i14 == 1) {
            m5769y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0893t
    /* renamed from: a */
    public boolean mo5498a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f4750v;
        if (i10 == 1) {
            boolean m5767u = m5767u(motionEvent.getX(), motionEvent.getY());
            boolean m5766t = m5766t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m5767u && !m5766t) {
                return false;
            }
            if (m5766t) {
                this.f4751w = 1;
                this.f4744p = (int) motionEvent.getX();
            } else if (m5767u) {
                this.f4751w = 2;
                this.f4741m = (int) motionEvent.getY();
            }
            m5769y(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0893t
    /* renamed from: b */
    public void mo5499b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4750v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m5767u = m5767u(motionEvent.getX(), motionEvent.getY());
            boolean m5766t = m5766t(motionEvent.getX(), motionEvent.getY());
            if (m5767u || m5766t) {
                if (m5766t) {
                    this.f4751w = 1;
                    this.f4744p = (int) motionEvent.getX();
                } else if (m5767u) {
                    this.f4751w = 2;
                    this.f4741m = (int) motionEvent.getY();
                }
                m5769y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f4750v == 2) {
            this.f4741m = 0.0f;
            this.f4744p = 0.0f;
            m5769y(1);
            this.f4751w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f4750v == 2) {
            m5762A();
            if (this.f4751w == 1) {
                m5757r(motionEvent.getX());
            }
            if (this.f4751w == 2) {
                m5750C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0893t
    /* renamed from: c */
    public void mo5500c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0888o
    /* renamed from: i */
    public void mo5382i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0871a0 c0871a0) {
        if (this.f4745q == this.f4747s.getWidth() && this.f4746r == this.f4747s.getHeight()) {
            if (this.f4726A != 0) {
                if (this.f4748t) {
                    m5754n(canvas);
                }
                if (this.f4749u) {
                    m5753m(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f4745q = this.f4747s.getWidth();
        this.f4746r = this.f4747s.getHeight();
        m5769y(0);
    }

    /* renamed from: j */
    public void m5764j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4747s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m5752l();
        }
        this.f4747s = recyclerView;
        if (recyclerView != null) {
            m5761z();
        }
    }

    /* renamed from: q */
    void m5765q(int i10) {
        int i11 = this.f4726A;
        if (i11 == 1) {
            this.f4754z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f4726A = 3;
        ValueAnimator valueAnimator = this.f4754z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4754z.setDuration(i10);
        this.f4754z.start();
    }

    /* renamed from: t */
    boolean m5766t(float f10, float f11) {
        if (f11 >= this.f4746r - this.f4737i) {
            int i10 = this.f4743o;
            int i11 = this.f4742n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    boolean m5767u(float f10, float f11) {
        if (!m5758s() ? f10 >= this.f4745q - this.f4733e : f10 <= this.f4733e) {
            int i10 = this.f4740l;
            int i11 = this.f4739k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    void m5768v() {
        this.f4747s.invalidate();
    }

    /* renamed from: y */
    void m5769y(int i10) {
        if (i10 == 2 && this.f4750v != 2) {
            this.f4731c.setState(f4724D);
            m5751k();
        }
        if (i10 == 0) {
            m5768v();
        } else {
            m5762A();
        }
        if (this.f4750v == 2 && i10 != 2) {
            this.f4731c.setState(f4725E);
            m5759w(1200);
        } else if (i10 == 1) {
            m5759w(1500);
        }
        this.f4750v = i10;
    }
}
