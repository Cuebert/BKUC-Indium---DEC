package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.C0690v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p111i4.C3520b;
import p111i4.C3522d;
import p111i4.C3529k;
import p111i4.C3530l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: A */
    private boolean f9995A;

    /* renamed from: B */
    private InterfaceC2533c f9996B;

    /* renamed from: C */
    private double f9997C;

    /* renamed from: D */
    private int f9998D;

    /* renamed from: n */
    private ValueAnimator f9999n;

    /* renamed from: o */
    private boolean f10000o;

    /* renamed from: p */
    private float f10001p;

    /* renamed from: q */
    private float f10002q;

    /* renamed from: r */
    private boolean f10003r;

    /* renamed from: s */
    private int f10004s;

    /* renamed from: t */
    private final List<InterfaceC2534d> f10005t;

    /* renamed from: u */
    private final int f10006u;

    /* renamed from: v */
    private final float f10007v;

    /* renamed from: w */
    private final Paint f10008w;

    /* renamed from: x */
    private final RectF f10009x;

    /* renamed from: y */
    private final int f10010y;

    /* renamed from: z */
    private float f10011z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    /* loaded from: classes.dex */
    public class C2531a implements ValueAnimator.AnimatorUpdateListener {
        C2531a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m11721m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    /* loaded from: classes.dex */
    public class C2532b extends AnimatorListenerAdapter {
        C2532b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2533c {
        /* renamed from: a */
        void m11729a(float f10, boolean z10);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2534d {
        /* renamed from: a */
        void mo11714a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14534t);
    }

    /* renamed from: c */
    private void m11717c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.f9998D * ((float) Math.cos(this.f9997C))) + width;
        float f10 = height;
        float sin = (this.f9998D * ((float) Math.sin(this.f9997C))) + f10;
        this.f10008w.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f10006u, this.f10008w);
        double sin2 = Math.sin(this.f9997C);
        double cos2 = Math.cos(this.f9997C);
        this.f10008w.setStrokeWidth(this.f10010y);
        canvas.drawLine(width, f10, r1 + ((int) (cos2 * r6)), height + ((int) (r6 * sin2)), this.f10008w);
        canvas.drawCircle(width, f10, this.f10007v, this.f10008w);
    }

    /* renamed from: e */
    private int m11718e(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: h */
    private Pair<Float, Float> m11719h(float f10) {
        float m11724f = m11724f();
        if (Math.abs(m11724f - f10) > 180.0f) {
            if (m11724f > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (m11724f < 180.0f && f10 > 180.0f) {
                m11724f += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(m11724f), Float.valueOf(f10));
    }

    /* renamed from: i */
    private boolean m11720i(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float m11718e = m11718e(f10, f11);
        boolean z13 = false;
        boolean z14 = m11724f() != m11718e;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f10000o) {
            z13 = true;
        }
        m11728l(m11718e, z13);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m11721m(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f10011z = f11;
        this.f9997C = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.f9998D * ((float) Math.cos(this.f9997C)));
        float sin = height + (this.f9998D * ((float) Math.sin(this.f9997C)));
        RectF rectF = this.f10009x;
        int i10 = this.f10006u;
        rectF.set(width - i10, sin - i10, width + i10, sin + i10);
        Iterator<InterfaceC2534d> it = this.f10005t.iterator();
        while (it.hasNext()) {
            it.next().mo11714a(f11, z10);
        }
        invalidate();
    }

    /* renamed from: b */
    public void m11722b(InterfaceC2534d interfaceC2534d) {
        this.f10005t.add(interfaceC2534d);
    }

    /* renamed from: d */
    public RectF m11723d() {
        return this.f10009x;
    }

    /* renamed from: f */
    public float m11724f() {
        return this.f10011z;
    }

    /* renamed from: g */
    public int m11725g() {
        return this.f10006u;
    }

    /* renamed from: j */
    public void m11726j(int i10) {
        this.f9998D = i10;
        invalidate();
    }

    /* renamed from: k */
    public void m11727k(float f10) {
        m11728l(f10, false);
    }

    /* renamed from: l */
    public void m11728l(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f9999n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            m11721m(f10, false);
            return;
        }
        Pair<Float, Float> m11719h = m11719h(f10);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) m11719h.first).floatValue(), ((Float) m11719h.second).floatValue());
        this.f9999n = ofFloat;
        ofFloat.setDuration(200L);
        this.f9999n.addUpdateListener(new C2531a());
        this.f9999n.addListener(new C2532b());
        this.f9999n.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m11717c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m11727k(m11724f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        InterfaceC2533c interfaceC2533c;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i10 = (int) (x10 - this.f10001p);
                int i11 = (int) (y10 - this.f10002q);
                this.f10003r = (i10 * i10) + (i11 * i11) > this.f10004s;
                boolean z13 = this.f9995A;
                z10 = actionMasked == 1;
                z11 = z13;
            } else {
                z10 = false;
                z11 = false;
            }
            z12 = false;
        } else {
            this.f10001p = x10;
            this.f10002q = y10;
            this.f10003r = true;
            this.f9995A = false;
            z10 = false;
            z11 = false;
            z12 = true;
        }
        boolean m11720i = m11720i(x10, y10, z11, z12, z10) | this.f9995A;
        this.f9995A = m11720i;
        if (m11720i && z10 && (interfaceC2533c = this.f9996B) != null) {
            interfaceC2533c.m11729a(m11718e(x10, y10), this.f10003r);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10005t = new ArrayList();
        Paint paint = new Paint();
        this.f10008w = paint;
        this.f10009x = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f14915b1, i10, C3529k.f14712v);
        this.f9998D = obtainStyledAttributes.getDimensionPixelSize(C3530l.f14931d1, 0);
        this.f10006u = obtainStyledAttributes.getDimensionPixelSize(C3530l.f14939e1, 0);
        this.f10010y = getResources().getDimensionPixelSize(C3522d.f14586m);
        this.f10007v = r6.getDimensionPixelSize(C3522d.f14584k);
        int color = obtainStyledAttributes.getColor(C3530l.f14923c1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m11727k(0.0f);
        this.f10004s = ViewConfiguration.get(context).getScaledTouchSlop();
        C0690v.m3871z0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
