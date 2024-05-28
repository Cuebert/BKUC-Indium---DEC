package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0170g;
import androidx.appcompat.view.menu.InterfaceC0174k;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.C0596h;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.C0656a;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import androidx.core.widget.C0707i;
import p039d.C2948a;
import p111i4.C3522d;
import p111i4.C3523e;
import p111i4.C3524f;
import p111i4.C3526h;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends C2481d implements InterfaceC0174k.a {

    /* renamed from: D */
    private static final int[] f9542D = {R.attr.state_checked};

    /* renamed from: A */
    private boolean f9543A;

    /* renamed from: B */
    private Drawable f9544B;

    /* renamed from: C */
    private final C0656a f9545C;

    /* renamed from: t */
    private int f9546t;

    /* renamed from: u */
    private boolean f9547u;

    /* renamed from: v */
    boolean f9548v;

    /* renamed from: w */
    private final CheckedTextView f9549w;

    /* renamed from: x */
    private FrameLayout f9550x;

    /* renamed from: y */
    private C0170g f9551y;

    /* renamed from: z */
    private ColorStateList f9552z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes.dex */
    class C2477a extends C0656a {
        C2477a() {
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            super.mo3484g(view, c0660c);
            c0660c.m3530X(NavigationMenuItemView.this.f9548v);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private void m11275c() {
        if (m11277e()) {
            this.f9549w.setVisibility(8);
            FrameLayout frameLayout = this.f9550x;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f9550x.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f9549w.setVisibility(0);
        FrameLayout frameLayout2 = this.f9550x;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f9550x.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: d */
    private StateListDrawable m11276d() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C2948a.f12172x, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f9542D, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: e */
    private boolean m11277e() {
        return this.f9551y.getTitle() == null && this.f9551y.getIcon() == null && this.f9551y.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f9550x == null) {
                this.f9550x = (FrameLayout) ((ViewStub) findViewById(C3524f.f14626d)).inflate();
            }
            this.f9550x.removeAllViews();
            this.f9550x.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0174k.a
    /* renamed from: a */
    public boolean mo922a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0174k.a
    /* renamed from: b */
    public void mo923b(C0170g c0170g, int i10) {
        this.f9551y = c0170g;
        if (c0170g.getItemId() > 0) {
            setId(c0170g.getItemId());
        }
        setVisibility(c0170g.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0690v.m3859t0(this, m11276d());
        }
        setCheckable(c0170g.isCheckable());
        setChecked(c0170g.isChecked());
        setEnabled(c0170g.isEnabled());
        setTitle(c0170g.getTitle());
        setIcon(c0170g.getIcon());
        setActionView(c0170g.getActionView());
        setContentDescription(c0170g.getContentDescription());
        TooltipCompat.setTooltipText(this, c0170g.getTooltipText());
        m11275c();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0174k.a
    public C0170g getItemData() {
        return this.f9551y;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        C0170g c0170g = this.f9551y;
        if (c0170g != null && c0170g.isCheckable() && this.f9551y.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f9542D);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f9548v != z10) {
            this.f9548v = z10;
            this.f9545C.mo3488l(this.f9549w, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f9549w.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, 0, i10, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f9543A) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0609a.m3263r(drawable).mutate();
                C0609a.m3260o(drawable, this.f9552z);
            }
            int i10 = this.f9546t;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f9547u) {
            if (this.f9544B == null) {
                Drawable m3129e = C0596h.m3129e(getResources(), C3523e.f14606g, getContext().getTheme());
                this.f9544B = m3129e;
                if (m3129e != null) {
                    int i11 = this.f9546t;
                    m3129e.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f9544B;
        }
        C0707i.m4172k(this.f9549w, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f9549w.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f9546t = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f9552z = colorStateList;
        this.f9543A = colorStateList != null;
        C0170g c0170g = this.f9551y;
        if (c0170g != null) {
            setIcon(c0170g.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f9549w.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f9547u = z10;
    }

    public void setTextAppearance(int i10) {
        C0707i.m4177p(this.f9549w, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f9549w.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f9549w.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C2477a c2477a = new C2477a();
        this.f9545C = c2477a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C3526h.f14653c, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C3522d.f14578e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C3524f.f14627e);
        this.f9549w = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0690v.m3853q0(checkedTextView, c2477a);
    }
}
