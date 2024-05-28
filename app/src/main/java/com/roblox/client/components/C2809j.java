package com.roblox.client.components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.roblox.client.C2819e0;
import p027c1.C1119a;
import p027c1.C1121c;

/* renamed from: com.roblox.client.components.j */
/* loaded from: classes.dex */
public class C2809j {

    /* renamed from: a */
    private View f10968a;

    /* renamed from: b */
    private float f10969b;

    /* renamed from: c */
    private float f10970c;

    /* renamed from: d */
    private float f10971d;

    /* renamed from: e */
    private float f10972e;

    /* renamed from: f */
    private int f10973f;

    /* renamed from: g */
    private int f10974g;

    /* renamed from: h */
    private int f10975h;

    /* renamed from: i */
    private int f10976i;

    /* renamed from: j */
    private int f10977j;

    /* renamed from: k */
    private int f10978k;

    /* renamed from: l */
    private int f10979l;

    /* renamed from: m */
    private int f10980m;

    /* renamed from: n */
    private boolean f10981n = false;

    /* renamed from: o */
    private ValueAnimator f10982o = null;

    /* renamed from: p */
    private ValueAnimator f10983p = null;

    /* renamed from: q */
    private ValueAnimator f10984q = null;

    /* renamed from: r */
    private Rect f10985r = null;

    /* renamed from: s */
    private final int f10986s = 60;

    /* renamed from: t */
    private final int f10987t = 10;

    /* renamed from: u */
    private final int f10988u = 12105912;

    /* renamed from: v */
    private final int f10989v = 3500;

    /* renamed from: w */
    private final int f10990w = 300;

    /* renamed from: x */
    private final float f10991x = 50.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.j$a */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2809j.this.f10971d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2809j.this.f10968a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.j$b */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2809j.this.f10975h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.j$c */
    /* loaded from: classes.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2809j.this.f10975h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C2809j.this.f10968a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.j$d */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C2809j.this.f10981n = false;
            C2809j.this.m12441h();
        }
    }

    public C2809j(View view, AttributeSet attributeSet) {
        this.f10968a = null;
        if (view != null) {
            this.f10968a = view;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C2819e0.f11174w1);
                float f10 = obtainStyledAttributes.getFloat(C2819e0.f11027D1, 50.0f);
                this.f10971d = f10;
                this.f10972e = f10;
                this.f10976i = obtainStyledAttributes.getInt(C2819e0.f11183z1, 3500);
                this.f10977j = obtainStyledAttributes.getInt(C2819e0.f11018A1, 300);
                this.f10973f = obtainStyledAttributes.getInt(C2819e0.f11021B1, 60);
                this.f10974g = obtainStyledAttributes.getInt(C2819e0.f11177x1, 10);
                this.f10978k = obtainStyledAttributes.getColor(C2819e0.f11024C1, 12105912);
                this.f10980m = obtainStyledAttributes.getColor(C2819e0.f11180y1, 12105912);
                obtainStyledAttributes.recycle();
                return;
            }
            this.f10971d = 50.0f;
            this.f10972e = 50.0f;
            this.f10976i = 3500;
            this.f10977j = 300;
            this.f10973f = 60;
            this.f10974g = 10;
            this.f10978k = 12105912;
            this.f10980m = 12105912;
        }
    }

    /* renamed from: f */
    private boolean m12439f() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f10982o;
        return valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator = this.f10983p) != null && valueAnimator.isRunning() && (valueAnimator2 = this.f10984q) != null && valueAnimator2.isRunning();
    }

    /* renamed from: g */
    private float m12440g(int i10, int i11) {
        int i12;
        Rect rect = this.f10985r;
        int i13 = 0;
        if (rect != null) {
            int i14 = rect.left;
            int i15 = i10 - i14;
            int i16 = rect.right;
            int i17 = i15 > i16 - i10 ? i10 - i14 : i16 - i10;
            int i18 = rect.top;
            int i19 = i11 - i18;
            int i20 = rect.bottom;
            int i21 = i17;
            i13 = i19 > i20 - i11 ? i11 - i18 : i20 - i11;
            i12 = i21;
        } else {
            i12 = 0;
        }
        if (i13 <= i12) {
            i13 = i12;
        }
        return i13 + 300.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m12441h() {
        ValueAnimator valueAnimator = this.f10982o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10982o.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f10983p;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f10983p.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f10984q;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f10984q.removeAllListeners();
        }
    }

    /* renamed from: j */
    private void m12442j() {
        if (m12439f()) {
            m12441h();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f10975h, 0);
        this.f10983p = ofInt;
        ofInt.addUpdateListener(new c());
        this.f10983p.addListener(new d());
        this.f10983p.setDuration(this.f10977j);
        this.f10983p.setInterpolator(new DecelerateInterpolator());
        this.f10983p.start();
    }

    /* renamed from: k */
    private boolean m12443k(int i10, int i11) {
        int[] iArr = new int[2];
        this.f10968a.getLocationInWindow(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        return i10 >= i12 && i10 <= i12 + this.f10968a.getWidth() && i11 >= i13 && i11 <= i13 + this.f10968a.getHeight();
    }

    /* renamed from: n */
    private void m12444n() {
        if (m12439f()) {
            m12441h();
        }
        float f10 = this.f10972e;
        this.f10971d = f10;
        this.f10975h = this.f10973f;
        this.f10979l = this.f10978k;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, m12440g((int) this.f10969b, (int) this.f10970c));
        this.f10982o = ofFloat;
        ofFloat.addUpdateListener(new a());
        this.f10982o.setDuration(this.f10976i);
        this.f10982o.setInterpolator(new C1121c());
        this.f10982o.start();
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f10975h, this.f10974g);
        this.f10983p = ofInt;
        ofInt.addUpdateListener(new b());
        this.f10983p.setDuration(this.f10976i);
        this.f10983p.setInterpolator(new C1119a());
        this.f10983p.start();
    }

    /* renamed from: i */
    public void m12445i(Canvas canvas) {
        if (this.f10981n) {
            Paint paint = new Paint(1);
            paint.setColor(this.f10979l);
            paint.setAlpha(this.f10975h);
            canvas.drawCircle(this.f10969b, this.f10970c, this.f10971d, paint);
        }
    }

    /* renamed from: l */
    public void m12446l(MotionEvent motionEvent) {
        if (this.f10985r == null) {
            Rect rect = new Rect();
            this.f10985r = rect;
            this.f10968a.getDrawingRect(rect);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f10981n = true;
            this.f10969b = motionEvent.getX();
            this.f10970c = motionEvent.getY();
            m12444n();
            return;
        }
        if (action == 1) {
            m12442j();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            m12442j();
        } else {
            if (m12443k((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return;
            }
            m12442j();
        }
    }

    /* renamed from: m */
    public void m12447m(int i10) {
        this.f10978k = i10;
    }
}
