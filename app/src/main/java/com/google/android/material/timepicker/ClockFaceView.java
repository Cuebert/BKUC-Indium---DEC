package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C0656a;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p066f.C3121a;
import p111i4.C3520b;
import p111i4.C3521c;
import p111i4.C3522d;
import p111i4.C3524f;
import p111i4.C3526h;
import p111i4.C3529k;
import p111i4.C3530l;
import p272v4.C4981c;

/* loaded from: classes.dex */
class ClockFaceView extends C2544b implements ClockHandView.InterfaceC2534d {

    /* renamed from: N */
    private final ClockHandView f9979N;

    /* renamed from: O */
    private final Rect f9980O;

    /* renamed from: P */
    private final RectF f9981P;

    /* renamed from: Q */
    private final SparseArray<TextView> f9982Q;

    /* renamed from: R */
    private final C0656a f9983R;

    /* renamed from: S */
    private final int[] f9984S;

    /* renamed from: T */
    private final float[] f9985T;

    /* renamed from: U */
    private final int f9986U;

    /* renamed from: V */
    private final int f9987V;

    /* renamed from: W */
    private final int f9988W;

    /* renamed from: a0 */
    private final int f9989a0;

    /* renamed from: b0 */
    private String[] f9990b0;

    /* renamed from: c0 */
    private float f9991c0;

    /* renamed from: d0 */
    private final ColorStateList f9992d0;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    /* loaded from: classes.dex */
    class ViewTreeObserverOnPreDrawListenerC2529a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC2529a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo11715w(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f9979N.m11725g()) - ClockFaceView.this.f9986U);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    /* loaded from: classes.dex */
    class C2530b extends C0656a {
        C2530b() {
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            super.mo3484g(view, c0660c);
            int intValue = ((Integer) view.getTag(C3524f.f14636n)).intValue();
            if (intValue > 0) {
                c0660c.m3570w0((View) ClockFaceView.this.f9982Q.get(intValue - 1));
            }
            c0660c.m3538c0(C0660c.d.m3580a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14534t);
    }

    /* renamed from: D */
    private void m11709D() {
        RectF m11723d = this.f9979N.m11723d();
        for (int i10 = 0; i10 < this.f9982Q.size(); i10++) {
            TextView textView = this.f9982Q.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.f9980O);
                this.f9980O.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f9980O);
                this.f9981P.set(this.f9980O);
                textView.getPaint().setShader(m11710E(m11723d, this.f9981P));
                textView.invalidate();
            }
        }
    }

    /* renamed from: E */
    private RadialGradient m11710E(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.f9981P.left, rectF.centerY() - this.f9981P.top, rectF.width() * 0.5f, this.f9984S, this.f9985T, Shader.TileMode.CLAMP);
        }
        return null;
    }

    /* renamed from: F */
    private static float m11711F(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    /* renamed from: H */
    private void m11712H(int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f9982Q.size();
        for (int i11 = 0; i11 < Math.max(this.f9990b0.length, size); i11++) {
            TextView textView = this.f9982Q.get(i11);
            if (i11 >= this.f9990b0.length) {
                removeView(textView);
                this.f9982Q.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C3526h.f14656f, (ViewGroup) this, false);
                    this.f9982Q.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f9990b0[i11]);
                textView.setTag(C3524f.f14636n, Integer.valueOf(i11));
                C0690v.m3853q0(textView, this.f9983R);
                textView.setTextColor(this.f9992d0);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f9990b0[i11]));
                }
            }
        }
    }

    /* renamed from: G */
    public void m11713G(String[] strArr, int i10) {
        this.f9990b0 = strArr;
        m11712H(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC2534d
    /* renamed from: a */
    public void mo11714a(float f10, boolean z10) {
        if (Math.abs(this.f9991c0 - f10) > 0.001f) {
            this.f9991c0 = f10;
            m11709D();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0660c.m3511z0(accessibilityNodeInfo).m3536b0(C0660c.c.m3579a(1, this.f9990b0.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m11709D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int m11711F = (int) (this.f9989a0 / m11711F(this.f9987V / displayMetrics.heightPixels, this.f9988W / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m11711F, 1073741824);
        setMeasuredDimension(m11711F, m11711F);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.C2544b
    /* renamed from: w */
    public void mo11715w(int i10) {
        if (i10 != m11747v()) {
            super.mo11715w(i10);
            this.f9979N.m11726j(m11747v());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9980O = new Rect();
        this.f9981P = new RectF();
        this.f9982Q = new SparseArray<>();
        this.f9985T = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f14892Y0, i10, C3529k.f14712v);
        Resources resources = getResources();
        ColorStateList m19404a = C4981c.m19404a(context, obtainStyledAttributes, C3530l.f14907a1);
        this.f9992d0 = m19404a;
        LayoutInflater.from(context).inflate(C3526h.f14657g, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C3524f.f14630h);
        this.f9979N = clockHandView;
        this.f9986U = resources.getDimensionPixelSize(C3522d.f14585l);
        int colorForState = m19404a.getColorForState(new int[]{R.attr.state_selected}, m19404a.getDefaultColor());
        this.f9984S = new int[]{colorForState, colorForState, m19404a.getDefaultColor()};
        clockHandView.m11722b(this);
        int defaultColor = C3121a.m13769c(context, C3521c.f14542b).getDefaultColor();
        ColorStateList m19404a2 = C4981c.m19404a(context, obtainStyledAttributes, C3530l.f14899Z0);
        setBackgroundColor(m19404a2 != null ? m19404a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2529a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f9983R = new C2530b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        m11713G(strArr, 0);
        this.f9987V = resources.getDimensionPixelSize(C3522d.f14598y);
        this.f9988W = resources.getDimensionPixelSize(C3522d.f14599z);
        this.f9989a0 = resources.getDimensionPixelSize(C3522d.f14587n);
    }
}
