package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import com.google.android.material.internal.C2480c;
import java.util.ArrayList;
import java.util.List;
import p111i4.C3520b;
import p111i4.C3529k;

/* loaded from: classes.dex */
public class ChipGroup extends C2480c {

    /* renamed from: A */
    private static final int f9226A = C3529k.f14705o;

    /* renamed from: r */
    private int f9227r;

    /* renamed from: s */
    private int f9228s;

    /* renamed from: t */
    private boolean f9229t;

    /* renamed from: u */
    private boolean f9230u;

    /* renamed from: v */
    private InterfaceC2438d f9231v;

    /* renamed from: w */
    private final C2436b f9232w;

    /* renamed from: x */
    private ViewGroupOnHierarchyChangeListenerC2439e f9233x;

    /* renamed from: y */
    private int f9234y;

    /* renamed from: z */
    private boolean f9235z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    /* loaded from: classes.dex */
    public class C2436b implements CompoundButton.OnCheckedChangeListener {
        private C2436b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (ChipGroup.this.f9235z) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.f9230u) {
                ChipGroup.this.m10851r(compoundButton.getId(), true);
                ChipGroup.this.m10850q(compoundButton.getId(), false);
                return;
            }
            int id = compoundButton.getId();
            if (z10) {
                if (ChipGroup.this.f9234y != -1 && ChipGroup.this.f9234y != id && ChipGroup.this.f9229t) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.m10851r(chipGroup.f9234y, false);
                }
                ChipGroup.this.setCheckedId(id);
                return;
            }
            if (ChipGroup.this.f9234y == id) {
                ChipGroup.this.setCheckedId(-1);
            }
        }

        /* synthetic */ C2436b(ChipGroup chipGroup, C2435a c2435a) {
            this();
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    /* loaded from: classes.dex */
    public static class C2437c extends ViewGroup.MarginLayoutParams {
        public C2437c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2437c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C2437c(int i10, int i11) {
            super(i10, i11);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2438d {
        /* renamed from: a */
        void m10857a(ChipGroup chipGroup, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    /* loaded from: classes.dex */
    public class ViewGroupOnHierarchyChangeListenerC2439e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: n */
        private ViewGroup.OnHierarchyChangeListener f9237n;

        private ViewGroupOnHierarchyChangeListenerC2439e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C0690v.m3844m());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).m10853m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f9232w);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f9237n;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f9237n;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ ViewGroupOnHierarchyChangeListenerC2439e(ChipGroup chipGroup, C2435a c2435a) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14519e);
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: q */
    public void m10850q(int i10, boolean z10) {
        this.f9234y = i10;
        InterfaceC2438d interfaceC2438d = this.f9231v;
        if (interfaceC2438d != null && this.f9229t && z10) {
            interfaceC2438d.m10857a(this, i10);
        }
    }

    /* renamed from: r */
    public void m10851r(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof Chip) {
            this.f9235z = true;
            ((Chip) findViewById).setChecked(z10);
            this.f9235z = false;
        }
    }

    public void setCheckedId(int i10) {
        m10850q(i10, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i11 = this.f9234y;
                if (i11 != -1 && this.f9229t) {
                    m10851r(i11, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // com.google.android.material.internal.C2480c
    /* renamed from: c */
    public boolean mo10852c() {
        return super.mo10852c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2437c);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2437c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2437c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f9229t) {
            return this.f9234y;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f9229t) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f9227r;
    }

    public int getChipSpacingVertical() {
        return this.f9228s;
    }

    /* renamed from: m */
    public void m10853m(int i10) {
        int i11 = this.f9234y;
        if (i10 == i11) {
            return;
        }
        if (i11 != -1 && this.f9229t) {
            m10851r(i11, false);
        }
        if (i10 != -1) {
            m10851r(i10, true);
        }
        setCheckedId(i10);
    }

    /* renamed from: n */
    public void m10854n() {
        this.f9235z = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f9235z = false;
        setCheckedId(-1);
    }

    /* renamed from: o */
    public int m10855o(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                if (((Chip) getChildAt(i11)) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f9234y;
        if (i10 != -1) {
            m10851r(i10, true);
            setCheckedId(this.f9234y);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0660c.m3511z0(accessibilityNodeInfo).m3536b0(C0660c.c.m3579a(getRowCount(), mo10852c() ? getChipCount() : -1, false, m10856p() ? 1 : 2));
    }

    /* renamed from: p */
    public boolean m10856p() {
        return this.f9229t;
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f9227r != i10) {
            this.f9227r = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f9228s != i10) {
            this.f9228s = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC2438d interfaceC2438d) {
        this.f9231v = interfaceC2438d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9233x.f9237n = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f9230u = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.C2480c
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        if (this.f9229t != z10) {
            this.f9229t = z10;
            m10854n();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f9226A
            android.content.Context r8 = p323z4.C6011a.m21324c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>()
            r7.f9232w = r8
            com.google.android.material.chip.ChipGroup$e r8 = new com.google.android.material.chip.ChipGroup$e
            r8.<init>()
            r7.f9233x = r8
            r8 = -1
            r7.f9234y = r8
            r6 = 0
            r7.f9235z = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = p111i4.C3530l.f14829P0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C2487j.m11374h(r0, r1, r2, r3, r4, r5)
            int r10 = p111i4.C3530l.f14843R0
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = p111i4.C3530l.f14850S0
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = p111i4.C3530l.f14857T0
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = p111i4.C3530l.f14871V0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine(r10)
            int r10 = p111i4.C3530l.f14878W0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection(r10)
            int r10 = p111i4.C3530l.f14864U0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = p111i4.C3530l.f14836Q0
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L69
            r7.f9234y = r10
        L69:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$e r8 = r7.f9233x
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            androidx.core.view.C0690v.m3871z0(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2437c(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
