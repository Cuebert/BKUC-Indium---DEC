package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C0675g0;
import androidx.core.view.C0690v;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import p015b1.C0968c;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public final class C0806g extends FrameLayout {

    /* renamed from: n */
    private ArrayList<View> f4047n;

    /* renamed from: o */
    private ArrayList<View> f4048o;

    /* renamed from: p */
    private View.OnApplyWindowInsetsListener f4049p;

    /* renamed from: q */
    private boolean f4050q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0806g(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.f4050q = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0968c.f5135h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C0968c.f5136i) : classAttribute;
        String string = obtainStyledAttributes.getString(C0968c.f5137j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment m4495i0 = fragmentManager.m4495i0(id);
        if (classAttribute != null && m4495i0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = BuildConfig.FLAVOR;
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment mo4533a = fragmentManager.m4515s0().mo4533a(context.getClassLoader(), classAttribute);
            mo4533a.m4293L0(context, attributeSet, null);
            fragmentManager.m4504m().m4756s(true).m4748d(this, mo4533a, string).mo4562k();
        }
        fragmentManager.m4473U0(this);
    }

    /* renamed from: a */
    private void m4630a(View view) {
        ArrayList<View> arrayList = this.f4048o;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f4047n == null) {
            this.f4047n = new ArrayList<>();
        }
        this.f4047n.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.m4402B0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (FragmentManager.m4402B0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0675g0 m3825c0;
        C0675g0 m3656v = C0675g0.m3656v(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4049p;
        if (onApplyWindowInsetsListener != null) {
            m3825c0 = C0675g0.m3656v(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            m3825c0 = C0690v.m3825c0(this, m3656v);
        }
        if (!m3825c0.m3671o()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C0690v.m3836i(getChildAt(i10), m3825c0);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f4050q && this.f4047n != null) {
            for (int i10 = 0; i10 < this.f4047n.size(); i10++) {
                super.drawChild(canvas, this.f4047n.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f4050q || (arrayList = this.f4047n) == null || arrayList.size() <= 0 || !this.f4047n.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f4048o;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f4047n;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f4050q = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m4630a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        if (z10) {
            m4630a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m4630a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        m4630a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m4630a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            m4630a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            m4630a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f4050q = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f4049p = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f4048o == null) {
                this.f4048o = new ArrayList<>();
            }
            this.f4048o.add(view);
        }
        super.startViewTransition(view);
    }
}
