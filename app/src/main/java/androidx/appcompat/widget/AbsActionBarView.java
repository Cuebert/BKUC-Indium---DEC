package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0665b0;
import androidx.core.view.C0690v;
import androidx.core.view.InterfaceC0667c0;
import p039d.C2948a;
import p039d.C2957j;

/* loaded from: classes.dex */
public abstract class AbsActionBarView extends ViewGroup {
    private static final int FADE_DURATION = 200;
    protected C0249b mActionMenuPresenter;
    protected int mContentHeight;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected final VisibilityAnimListener mVisAnimListener;
    protected C0665b0 mVisibilityAnim;

    /* loaded from: classes.dex */
    public class VisibilityAnimListener implements InterfaceC0667c0 {
        private boolean mCanceled = false;
        int mFinalVisibility;

        protected VisibilityAnimListener() {
        }

        @Override // androidx.core.view.InterfaceC0667c0
        public void onAnimationCancel(View view) {
            this.mCanceled = true;
        }

        @Override // androidx.core.view.InterfaceC0667c0
        public void onAnimationEnd(View view) {
            if (this.mCanceled) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.mVisibilityAnim = null;
            AbsActionBarView.super.setVisibility(this.mFinalVisibility);
        }

        @Override // androidx.core.view.InterfaceC0667c0
        public void onAnimationStart(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(C0665b0 c0665b0, int i10) {
            AbsActionBarView.this.mVisibilityAnim = c0665b0;
            this.mFinalVisibility = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.AbsActionBarView$a */
    /* loaded from: classes.dex */
    public class RunnableC0177a implements Runnable {
        RunnableC0177a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsActionBarView.this.showOverflowMenu();
        }
    }

    AbsActionBarView(Context context) {
        this(context, null);
    }

    public static int next(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public void animateToVisibility(int i10) {
        setupAnimatorToVisibility(i10, 200L).m3608l();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        C0249b c0249b = this.mActionMenuPresenter;
        if (c0249b != null) {
            c0249b.m1173z();
        }
    }

    public int getAnimatedVisibility() {
        if (this.mVisibilityAnim != null) {
            return this.mVisAnimListener.mFinalVisibility;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public boolean hideOverflowMenu() {
        C0249b c0249b = this.mActionMenuPresenter;
        if (c0249b != null) {
            return c0249b.m1161C();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        C0249b c0249b = this.mActionMenuPresenter;
        if (c0249b != null) {
            return c0249b.m1163E();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        C0249b c0249b = this.mActionMenuPresenter;
        if (c0249b != null) {
            return c0249b.m1164F();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        C0249b c0249b = this.mActionMenuPresenter;
        return c0249b != null && c0249b.m1165G();
    }

    public int measureChildView(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C2957j.f12466a, C2948a.f12151c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C2957j.f12512j, 0));
        obtainStyledAttributes.recycle();
        C0249b c0249b = this.mActionMenuPresenter;
        if (c0249b != null) {
            c0249b.m1166H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public int positionChild(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public void postShowOverflowMenu() {
        post(new RunnableC0177a());
    }

    public void setContentHeight(int i10) {
        this.mContentHeight = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C0665b0 c0665b0 = this.mVisibilityAnim;
            if (c0665b0 != null) {
                c0665b0.m3601c();
            }
            super.setVisibility(i10);
        }
    }

    public C0665b0 setupAnimatorToVisibility(int i10, long j10) {
        C0665b0 c0665b0 = this.mVisibilityAnim;
        if (c0665b0 != null) {
            c0665b0.m3601c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0665b0 m3600b = C0690v.m3828e(this).m3600b(1.0f);
            m3600b.m3603f(j10);
            m3600b.m3605h(this.mVisAnimListener.withFinalVisibility(m3600b, i10));
            return m3600b;
        }
        C0665b0 m3600b2 = C0690v.m3828e(this).m3600b(0.0f);
        m3600b2.m3603f(j10);
        m3600b2.m3605h(this.mVisAnimListener.withFinalVisibility(m3600b2, i10));
        return m3600b2;
    }

    public boolean showOverflowMenu() {
        C0249b c0249b = this.mActionMenuPresenter;
        if (c0249b != null) {
            return c0249b.m1171M();
        }
        return false;
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mVisAnimListener = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C2948a.f12149a, typedValue, true) && typedValue.resourceId != 0) {
            this.mPopupContext = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.mPopupContext = context;
        }
    }
}
