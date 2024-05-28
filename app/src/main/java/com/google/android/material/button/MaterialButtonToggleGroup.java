package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C0656a;
import androidx.core.view.C0676h;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C2489l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import p111i4.C3520b;
import p111i4.C3529k;
import p310y4.C5882a;
import p310y4.C5892k;
import p310y4.InterfaceC5884c;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: x */
    private static final String f9154x = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: y */
    private static final int f9155y = C3529k.f14710t;

    /* renamed from: n */
    private final List<C2427d> f9156n;

    /* renamed from: o */
    private final C2426c f9157o;

    /* renamed from: p */
    private final C2429f f9158p;

    /* renamed from: q */
    private final LinkedHashSet<InterfaceC2428e> f9159q;

    /* renamed from: r */
    private final Comparator<MaterialButton> f9160r;

    /* renamed from: s */
    private Integer[] f9161s;

    /* renamed from: t */
    private boolean f9162t;

    /* renamed from: u */
    private boolean f9163u;

    /* renamed from: v */
    private boolean f9164v;

    /* renamed from: w */
    private int f9165w;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    /* loaded from: classes.dex */
    class C2424a implements Comparator<MaterialButton> {
        C2424a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    /* loaded from: classes.dex */
    class C2425b extends C0656a {
        C2425b() {
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            super.mo3484g(view, c0660c);
            c0660c.m3538c0(C0660c.d.m3580a(0, 1, MaterialButtonToggleGroup.this.m10744n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    /* loaded from: classes.dex */
    public class C2426c implements MaterialButton.InterfaceC2422a {
        private C2426c() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC2422a
        /* renamed from: a */
        public void mo10731a(MaterialButton materialButton, boolean z10) {
            if (MaterialButtonToggleGroup.this.f9162t) {
                return;
            }
            if (MaterialButtonToggleGroup.this.f9163u) {
                MaterialButtonToggleGroup.this.f9165w = z10 ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.m10750u(materialButton.getId(), z10)) {
                MaterialButtonToggleGroup.this.m10742l(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C2426c(MaterialButtonToggleGroup materialButtonToggleGroup, C2424a c2424a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    /* loaded from: classes.dex */
    public static class C2427d {

        /* renamed from: e */
        private static final InterfaceC5884c f9169e = new C5882a(0.0f);

        /* renamed from: a */
        InterfaceC5884c f9170a;

        /* renamed from: b */
        InterfaceC5884c f9171b;

        /* renamed from: c */
        InterfaceC5884c f9172c;

        /* renamed from: d */
        InterfaceC5884c f9173d;

        C2427d(InterfaceC5884c interfaceC5884c, InterfaceC5884c interfaceC5884c2, InterfaceC5884c interfaceC5884c3, InterfaceC5884c interfaceC5884c4) {
            this.f9170a = interfaceC5884c;
            this.f9171b = interfaceC5884c3;
            this.f9172c = interfaceC5884c4;
            this.f9173d = interfaceC5884c2;
        }

        /* renamed from: a */
        public static C2427d m10757a(C2427d c2427d) {
            InterfaceC5884c interfaceC5884c = f9169e;
            return new C2427d(interfaceC5884c, c2427d.f9173d, interfaceC5884c, c2427d.f9172c);
        }

        /* renamed from: b */
        public static C2427d m10758b(C2427d c2427d, View view) {
            return C2489l.m11382d(view) ? m10759c(c2427d) : m10760d(c2427d);
        }

        /* renamed from: c */
        public static C2427d m10759c(C2427d c2427d) {
            InterfaceC5884c interfaceC5884c = c2427d.f9170a;
            InterfaceC5884c interfaceC5884c2 = c2427d.f9173d;
            InterfaceC5884c interfaceC5884c3 = f9169e;
            return new C2427d(interfaceC5884c, interfaceC5884c2, interfaceC5884c3, interfaceC5884c3);
        }

        /* renamed from: d */
        public static C2427d m10760d(C2427d c2427d) {
            InterfaceC5884c interfaceC5884c = f9169e;
            return new C2427d(interfaceC5884c, interfaceC5884c, c2427d.f9171b, c2427d.f9172c);
        }

        /* renamed from: e */
        public static C2427d m10761e(C2427d c2427d, View view) {
            return C2489l.m11382d(view) ? m10760d(c2427d) : m10759c(c2427d);
        }

        /* renamed from: f */
        public static C2427d m10762f(C2427d c2427d) {
            InterfaceC5884c interfaceC5884c = c2427d.f9170a;
            InterfaceC5884c interfaceC5884c2 = f9169e;
            return new C2427d(interfaceC5884c, interfaceC5884c2, c2427d.f9171b, interfaceC5884c2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2428e {
        /* renamed from: a */
        void mo10763a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    /* loaded from: classes.dex */
    public class C2429f implements MaterialButton.InterfaceC2423b {
        private C2429f() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC2423b
        /* renamed from: a */
        public void mo10732a(MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C2429f(MaterialButtonToggleGroup materialButtonToggleGroup, C2424a c2424a) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14532r);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (m10746p(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m10746p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && m10746p(i11)) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: h */
    private void m10739h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton m10743m = m10743m(i10);
            int min = Math.min(m10743m.getStrokeWidth(), m10743m(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams m10740i = m10740i(m10743m);
            if (getOrientation() == 0) {
                C0676h.m3721c(m10740i, 0);
                C0676h.m3722d(m10740i, -min);
                m10740i.topMargin = 0;
            } else {
                m10740i.bottomMargin = 0;
                m10740i.topMargin = -min;
                C0676h.m3722d(m10740i, 0);
            }
            m10743m.setLayoutParams(m10740i);
        }
        m10747r(firstVisibleChildIndex);
    }

    /* renamed from: i */
    private LinearLayout.LayoutParams m10740i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: j */
    private void m10741j(int i10, boolean z10) {
        MaterialButton materialButton = (MaterialButton) findViewById(i10);
        if (materialButton != null) {
            materialButton.setChecked(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m10742l(int i10, boolean z10) {
        Iterator<InterfaceC2428e> it = this.f9159q.iterator();
        while (it.hasNext()) {
            it.next().mo10763a(this, i10, z10);
        }
    }

    /* renamed from: m */
    private MaterialButton m10743m(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public int m10744n(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && m10746p(i11)) {
                i10++;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private C2427d m10745o(int i10, int i11, int i12) {
        C2427d c2427d = this.f9156n.get(i10);
        if (i11 == i12) {
            return c2427d;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? C2427d.m10761e(c2427d, this) : C2427d.m10762f(c2427d);
        }
        if (i10 == i12) {
            return z10 ? C2427d.m10758b(c2427d, this) : C2427d.m10757a(c2427d);
        }
        return null;
    }

    /* renamed from: p */
    private boolean m10746p(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    /* renamed from: r */
    private void m10747r(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m10743m(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            C0676h.m3721c(layoutParams, 0);
            C0676h.m3722d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: s */
    private void m10748s(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof MaterialButton) {
            this.f9162t = true;
            ((MaterialButton) findViewById).setChecked(z10);
            this.f9162t = false;
        }
    }

    private void setCheckedId(int i10) {
        this.f9165w = i10;
        m10742l(i10, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C0690v.m3844m());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.m10724a(this.f9157o);
        materialButton.setOnPressedChangeListenerInternal(this.f9158p);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: t */
    private static void m10749t(C5892k.b bVar, C2427d c2427d) {
        if (c2427d == null) {
            bVar.m20907o(0.0f);
        } else {
            bVar.m20901B(c2427d.f9170a).m20912t(c2427d.f9173d).m20905F(c2427d.f9171b).m20916x(c2427d.f9172c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public boolean m10750u(int i10, boolean z10) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f9164v && checkedButtonIds.isEmpty()) {
            m10748s(i10, true);
            this.f9165w = i10;
            return false;
        }
        if (z10 && this.f9163u) {
            checkedButtonIds.remove(Integer.valueOf(i10));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                m10748s(intValue, false);
                m10742l(intValue, false);
            }
        }
        return true;
    }

    /* renamed from: v */
    private void m10751v() {
        TreeMap treeMap = new TreeMap(this.f9160r);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(m10743m(i10), Integer.valueOf(i10));
        }
        this.f9161s = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f9154x, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            m10750u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C5892k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f9156n.add(new C2427d(shapeAppearanceModel.m20879r(), shapeAppearanceModel.m20872j(), shapeAppearanceModel.m20881t(), shapeAppearanceModel.m20874l()));
        C0690v.m3853q0(materialButton, new C2425b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m10751v();
        super.dispatchDraw(canvas);
    }

    /* renamed from: g */
    public void m10752g(InterfaceC2428e interfaceC2428e) {
        this.f9159q.add(interfaceC2428e);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f9163u) {
            return this.f9165w;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton m10743m = m10743m(i10);
            if (m10743m.isChecked()) {
                arrayList.add(Integer.valueOf(m10743m.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f9161s;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w(f9154x, "Child order wasn't updated");
        return i11;
    }

    /* renamed from: k */
    public void m10753k() {
        this.f9162t = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton m10743m = m10743m(i10);
            m10743m.setChecked(false);
            m10742l(m10743m.getId(), false);
        }
        this.f9162t = false;
        setCheckedId(-1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f9165w;
        if (i10 != -1) {
            m10741j(i10, true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0660c.m3511z0(accessibilityNodeInfo).m3536b0(C0660c.c.m3579a(1, getVisibleButtonCount(), false, m10754q() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        m10755w();
        m10739h();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.m10726h(this.f9157o);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f9156n.remove(indexOfChild);
        }
        m10755w();
        m10739h();
    }

    /* renamed from: q */
    public boolean m10754q() {
        return this.f9163u;
    }

    public void setSelectionRequired(boolean z10) {
        this.f9164v = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f9163u != z10) {
            this.f9163u = z10;
            m10753k();
        }
    }

    /* renamed from: w */
    void m10755w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton m10743m = m10743m(i10);
            if (m10743m.getVisibility() != 8) {
                C5892k.b m20883v = m10743m.getShapeAppearanceModel().m20883v();
                m10749t(m20883v, m10745o(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                m10743m.setShapeAppearanceModel(m20883v.m20906m());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f9155y
            android.content.Context r7 = p323z4.C6011a.m21324c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f9156n = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.f9157o = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.f9158p = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f9159q = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f9160r = r7
            r7 = 0
            r6.f9162t = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = p111i4.C3530l.f15060t2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C2487j.m11374h(r0, r1, r2, r3, r4, r5)
            int r9 = p111i4.C3530l.f15084w2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = p111i4.C3530l.f15068u2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f9165w = r9
            int r9 = p111i4.C3530l.f15076v2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f9164v = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.C0690v.m3871z0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
