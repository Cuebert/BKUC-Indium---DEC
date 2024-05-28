package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p147l0.C3866k;

/* renamed from: androidx.constraintlayout.widget.j */
/* loaded from: classes.dex */
public abstract class AbstractC0555j extends AbstractC0547b {

    /* renamed from: w */
    private boolean f2993w;

    /* renamed from: x */
    private boolean f2994x;

    @Override // androidx.constraintlayout.widget.AbstractC0547b
    /* renamed from: h */
    public void mo2527h(AttributeSet attributeSet) {
        super.mo2527h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0554i.f2829a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0554i.f2843c1) {
                    this.f2993w = true;
                } else if (index == C0554i.f2878h1) {
                    this.f2994x = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o */
    public void m2610o(C3866k c3866k, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC0547b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2993w || this.f2994x) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f2530o; i10++) {
                View m2541i = constraintLayout.m2541i(this.f2529n[i10]);
                if (m2541i != null) {
                    if (this.f2993w) {
                        m2541i.setVisibility(visibility);
                    }
                    if (this.f2994x && elevation > 0.0f) {
                        m2541i.setTranslationZ(m2541i.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m2563d();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        m2563d();
    }
}
