package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p147l0.C3856a;
import p147l0.C3860e;

/* loaded from: classes.dex */
public class Barrier extends AbstractC0547b {

    /* renamed from: w */
    private int f2410w;

    /* renamed from: x */
    private int f2411x;

    /* renamed from: y */
    private C3856a f2412y;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: p */
    private void m2526p(C3860e c3860e, int i10, boolean z10) {
        this.f2411x = i10;
        if (z10) {
            int i11 = this.f2410w;
            if (i11 == 5) {
                this.f2411x = 1;
            } else if (i11 == 6) {
                this.f2411x = 0;
            }
        } else {
            int i12 = this.f2410w;
            if (i12 == 5) {
                this.f2411x = 0;
            } else if (i12 == 6) {
                this.f2411x = 1;
            }
        }
        if (c3860e instanceof C3856a) {
            ((C3856a) c3860e).m16294j1(this.f2411x);
        }
    }

    public int getMargin() {
        return this.f2412y.m16288f1();
    }

    public int getType() {
        return this.f2410w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0547b
    /* renamed from: h */
    public void mo2527h(AttributeSet attributeSet) {
        super.mo2527h(attributeSet);
        this.f2412y = new C3856a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0554i.f2829a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0554i.f2892j1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0554i.f2885i1) {
                    this.f2412y.m16293i1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0554i.f2899k1) {
                    this.f2412y.m16295k1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2532q = this.f2412y;
        m2569n();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0547b
    /* renamed from: i */
    public void mo2528i(C3860e c3860e, boolean z10) {
        m2526p(c3860e, this.f2410w, z10);
    }

    /* renamed from: o */
    public boolean m2529o() {
        return this.f2412y.m16284d1();
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f2412y.m16293i1(z10);
    }

    public void setDpMargin(int i10) {
        this.f2412y.m16295k1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f2412y.m16295k1(i10);
    }

    public void setType(int i10) {
        this.f2410w = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
