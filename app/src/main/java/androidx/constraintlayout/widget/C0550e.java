package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public class C0550e extends ViewGroup {

    /* renamed from: n */
    C0549d f2654n;

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public C0549d getConstraintSet() {
        if (this.f2654n == null) {
            this.f2654n = new C0549d();
        }
        this.f2654n.m2586h(this);
        return this.f2654n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0544b(layoutParams);
    }

    /* renamed from: androidx.constraintlayout.widget.e$a */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.C0544b {

        /* renamed from: A0 */
        public float f2655A0;

        /* renamed from: B0 */
        public float f2656B0;

        /* renamed from: p0 */
        public float f2657p0;

        /* renamed from: q0 */
        public boolean f2658q0;

        /* renamed from: r0 */
        public float f2659r0;

        /* renamed from: s0 */
        public float f2660s0;

        /* renamed from: t0 */
        public float f2661t0;

        /* renamed from: u0 */
        public float f2662u0;

        /* renamed from: v0 */
        public float f2663v0;

        /* renamed from: w0 */
        public float f2664w0;

        /* renamed from: x0 */
        public float f2665x0;

        /* renamed from: y0 */
        public float f2666y0;

        /* renamed from: z0 */
        public float f2667z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f2657p0 = 1.0f;
            this.f2658q0 = false;
            this.f2659r0 = 0.0f;
            this.f2660s0 = 0.0f;
            this.f2661t0 = 0.0f;
            this.f2662u0 = 0.0f;
            this.f2663v0 = 1.0f;
            this.f2664w0 = 1.0f;
            this.f2665x0 = 0.0f;
            this.f2666y0 = 0.0f;
            this.f2667z0 = 0.0f;
            this.f2655A0 = 0.0f;
            this.f2656B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2657p0 = 1.0f;
            this.f2658q0 = false;
            this.f2659r0 = 0.0f;
            this.f2660s0 = 0.0f;
            this.f2661t0 = 0.0f;
            this.f2662u0 = 0.0f;
            this.f2663v0 = 1.0f;
            this.f2664w0 = 1.0f;
            this.f2665x0 = 0.0f;
            this.f2666y0 = 0.0f;
            this.f2667z0 = 0.0f;
            this.f2655A0 = 0.0f;
            this.f2656B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0554i.f2930p2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0554i.f2936q2) {
                    this.f2657p0 = obtainStyledAttributes.getFloat(index, this.f2657p0);
                } else if (index == C0554i.f2680B2) {
                    this.f2659r0 = obtainStyledAttributes.getFloat(index, this.f2659r0);
                    this.f2658q0 = true;
                } else if (index == C0554i.f2984y2) {
                    this.f2661t0 = obtainStyledAttributes.getFloat(index, this.f2661t0);
                } else if (index == C0554i.f2990z2) {
                    this.f2662u0 = obtainStyledAttributes.getFloat(index, this.f2662u0);
                } else if (index == C0554i.f2978x2) {
                    this.f2660s0 = obtainStyledAttributes.getFloat(index, this.f2660s0);
                } else if (index == C0554i.f2966v2) {
                    this.f2663v0 = obtainStyledAttributes.getFloat(index, this.f2663v0);
                } else if (index == C0554i.f2972w2) {
                    this.f2664w0 = obtainStyledAttributes.getFloat(index, this.f2664w0);
                } else if (index == C0554i.f2942r2) {
                    this.f2665x0 = obtainStyledAttributes.getFloat(index, this.f2665x0);
                } else if (index == C0554i.f2948s2) {
                    this.f2666y0 = obtainStyledAttributes.getFloat(index, this.f2666y0);
                } else if (index == C0554i.f2954t2) {
                    this.f2667z0 = obtainStyledAttributes.getFloat(index, this.f2667z0);
                } else if (index == C0554i.f2960u2) {
                    this.f2655A0 = obtainStyledAttributes.getFloat(index, this.f2655A0);
                } else if (index == C0554i.f2674A2) {
                    this.f2656B0 = obtainStyledAttributes.getFloat(index, this.f2656B0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
