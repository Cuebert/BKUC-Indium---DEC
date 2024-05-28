package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC0164a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0168e;
import androidx.appcompat.view.menu.C0170g;
import androidx.appcompat.view.menu.C0172i;
import androidx.appcompat.view.menu.InterfaceC0173j;
import androidx.appcompat.view.menu.InterfaceC0174k;
import androidx.appcompat.view.menu.SubMenuC0176m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.AbstractC0664b;
import java.util.ArrayList;
import p039d.C2948a;
import p039d.C2954g;
import p120j.C3582a;
import p133k.InterfaceC3703e;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public class C0249b extends AbstractC0164a implements AbstractC0664b.a {

    /* renamed from: A */
    private boolean f1084A;

    /* renamed from: B */
    private boolean f1085B;

    /* renamed from: C */
    private int f1086C;

    /* renamed from: D */
    private int f1087D;

    /* renamed from: E */
    private int f1088E;

    /* renamed from: F */
    private boolean f1089F;

    /* renamed from: G */
    private boolean f1090G;

    /* renamed from: H */
    private boolean f1091H;

    /* renamed from: I */
    private boolean f1092I;

    /* renamed from: J */
    private int f1093J;

    /* renamed from: K */
    private final SparseBooleanArray f1094K;

    /* renamed from: L */
    e f1095L;

    /* renamed from: M */
    a f1096M;

    /* renamed from: N */
    c f1097N;

    /* renamed from: O */
    private b f1098O;

    /* renamed from: P */
    final f f1099P;

    /* renamed from: Q */
    int f1100Q;

    /* renamed from: x */
    d f1101x;

    /* renamed from: y */
    private Drawable f1102y;

    /* renamed from: z */
    private boolean f1103z;

    /* renamed from: androidx.appcompat.widget.b$a */
    /* loaded from: classes.dex */
    public class a extends C0172i {
        public a(Context context, SubMenuC0176m subMenuC0176m, View view) {
            super(context, subMenuC0176m, view, false, C2948a.f12162n);
            if (!((C0170g) subMenuC0176m.getItem()).m1045l()) {
                View view2 = C0249b.this.f1101x;
                m1073h(view2 == null ? (View) ((AbstractC0164a) C0249b.this).f805v : view2);
            }
            m1077l(C0249b.this.f1099P);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.C0172i
        /* renamed from: g */
        public void mo1072g() {
            C0249b c0249b = C0249b.this;
            c0249b.f1096M = null;
            c0249b.f1100Q = 0;
            super.mo1072g();
        }
    }

    /* renamed from: androidx.appcompat.widget.b$b */
    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.AbstractC0163b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0163b
        /* renamed from: a */
        public InterfaceC3703e mo925a() {
            a aVar = C0249b.this.f1096M;
            if (aVar != null) {
                return aVar.m1070e();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.b$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: n */
        private e f1106n;

        public c(e eVar) {
            this.f1106n = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0164a) C0249b.this).f799p != null) {
                ((AbstractC0164a) C0249b.this).f799p.m1010d();
            }
            View view = (View) ((AbstractC0164a) C0249b.this).f805v;
            if (view != null && view.getWindowToken() != null && this.f1106n.m1079o()) {
                C0249b.this.f1095L = this.f1106n;
            }
            C0249b.this.f1097N = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.b$d */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.widget.b$d$a */
        /* loaded from: classes.dex */
        public class a extends ForwardingListener {

            /* renamed from: n */
            final /* synthetic */ C0249b f1109n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C0249b c0249b) {
                super(view);
                this.f1109n = c0249b;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public InterfaceC3703e getPopup() {
                e eVar = C0249b.this.f1095L;
                if (eVar == null) {
                    return null;
                }
                return eVar.m1070e();
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStarted() {
                C0249b.this.m1171M();
                return true;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStopped() {
                C0249b c0249b = C0249b.this;
                if (c0249b.f1097N != null) {
                    return false;
                }
                c0249b.m1161C();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C2948a.f12161m);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new a(this, C0249b.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0249b.this.m1171M();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0609a.m3257l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.b$e */
    /* loaded from: classes.dex */
    public class e extends C0172i {
        public e(Context context, C0168e c0168e, View view, boolean z10) {
            super(context, c0168e, view, z10, C2948a.f12162n);
            m1075j(8388613);
            m1077l(C0249b.this.f1099P);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.C0172i
        /* renamed from: g */
        public void mo1072g() {
            if (((AbstractC0164a) C0249b.this).f799p != null) {
                ((AbstractC0164a) C0249b.this).f799p.close();
            }
            C0249b.this.f1095L = null;
            super.mo1072g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.b$f */
    /* loaded from: classes.dex */
    public class f implements InterfaceC0173j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0173j.a
        /* renamed from: a */
        public void mo824a(C0168e c0168e, boolean z10) {
            if (c0168e instanceof SubMenuC0176m) {
                c0168e.mo984D().m1012e(false);
            }
            InterfaceC0173j.a m943n = C0249b.this.m943n();
            if (m943n != null) {
                m943n.mo824a(c0168e, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0173j.a
        /* renamed from: b */
        public boolean mo825b(C0168e c0168e) {
            if (c0168e == ((AbstractC0164a) C0249b.this).f799p) {
                return false;
            }
            C0249b.this.f1100Q = ((SubMenuC0176m) c0168e).getItem().getItemId();
            InterfaceC0173j.a m943n = C0249b.this.m943n();
            if (m943n != null) {
                return m943n.mo825b(c0168e);
            }
            return false;
        }
    }

    public C0249b(Context context) {
        super(context, C2954g.f12294c, C2954g.f12293b);
        this.f1094K = new SparseBooleanArray();
        this.f1099P = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    private View m1152A(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f805v;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof InterfaceC0174k.a) && ((InterfaceC0174k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: B */
    public Drawable m1160B() {
        d dVar = this.f1101x;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1103z) {
            return this.f1102y;
        }
        return null;
    }

    /* renamed from: C */
    public boolean m1161C() {
        Object obj;
        c cVar = this.f1097N;
        if (cVar != null && (obj = this.f805v) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f1097N = null;
            return true;
        }
        e eVar = this.f1095L;
        if (eVar == null) {
            return false;
        }
        eVar.m1067b();
        return true;
    }

    /* renamed from: D */
    public boolean m1162D() {
        a aVar = this.f1096M;
        if (aVar == null) {
            return false;
        }
        aVar.m1067b();
        return true;
    }

    /* renamed from: E */
    public boolean m1163E() {
        return this.f1097N != null || m1164F();
    }

    /* renamed from: F */
    public boolean m1164F() {
        e eVar = this.f1095L;
        return eVar != null && eVar.m1071f();
    }

    /* renamed from: G */
    public boolean m1165G() {
        return this.f1084A;
    }

    /* renamed from: H */
    public void m1166H(Configuration configuration) {
        if (!this.f1089F) {
            this.f1088E = C3582a.m15368b(this.f798o).m15371d();
        }
        C0168e c0168e = this.f799p;
        if (c0168e != null) {
            c0168e.m991K(true);
        }
    }

    /* renamed from: I */
    public void m1167I(boolean z10) {
        this.f1092I = z10;
    }

    /* renamed from: J */
    public void m1168J(ActionMenuView actionMenuView) {
        this.f805v = actionMenuView;
        actionMenuView.initialize(this.f799p);
    }

    /* renamed from: K */
    public void m1169K(Drawable drawable) {
        d dVar = this.f1101x;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1103z = true;
            this.f1102y = drawable;
        }
    }

    /* renamed from: L */
    public void m1170L(boolean z10) {
        this.f1084A = z10;
        this.f1085B = true;
    }

    /* renamed from: M */
    public boolean m1171M() {
        C0168e c0168e;
        if (!this.f1084A || m1164F() || (c0168e = this.f799p) == null || this.f805v == null || this.f1097N != null || c0168e.m1029z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f798o, this.f799p, this.f1101x, true));
        this.f1097N = cVar;
        ((View) this.f805v).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0164a, androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: a */
    public void mo932a(C0168e c0168e, boolean z10) {
        m1173z();
        super.mo932a(c0168e, z10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0164a, androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: b */
    public void mo933b(Context context, C0168e c0168e) {
        super.mo933b(context, c0168e);
        Resources resources = context.getResources();
        C3582a m15368b = C3582a.m15368b(context);
        if (!this.f1085B) {
            this.f1084A = m15368b.m15375h();
        }
        if (!this.f1091H) {
            this.f1086C = m15368b.m15370c();
        }
        if (!this.f1089F) {
            this.f1088E = m15368b.m15371d();
        }
        int i10 = this.f1086C;
        if (this.f1084A) {
            if (this.f1101x == null) {
                d dVar = new d(this.f797n);
                this.f1101x = dVar;
                if (this.f1103z) {
                    dVar.setImageDrawable(this.f1102y);
                    this.f1102y = null;
                    this.f1103z = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1101x.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1101x.getMeasuredWidth();
        } else {
            this.f1101x = null;
        }
        this.f1087D = i10;
        this.f1093J = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0164a, androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: c */
    public boolean mo934c(SubMenuC0176m subMenuC0176m) {
        boolean z10 = false;
        if (!subMenuC0176m.hasVisibleItems()) {
            return false;
        }
        SubMenuC0176m subMenuC0176m2 = subMenuC0176m;
        while (subMenuC0176m2.m1082e0() != this.f799p) {
            subMenuC0176m2 = (SubMenuC0176m) subMenuC0176m2.m1082e0();
        }
        View m1152A = m1152A(subMenuC0176m2.getItem());
        if (m1152A == null) {
            return false;
        }
        this.f1100Q = subMenuC0176m.getItem().getItemId();
        int size = subMenuC0176m.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = subMenuC0176m.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f798o, subMenuC0176m, m1152A);
        this.f1096M = aVar;
        aVar.m1074i(z10);
        this.f1096M.m1078m();
        super.mo934c(subMenuC0176m);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0164a, androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: d */
    public void mo935d(boolean z10) {
        super.mo935d(z10);
        ((View) this.f805v).requestLayout();
        C0168e c0168e = this.f799p;
        boolean z11 = false;
        if (c0168e != null) {
            ArrayList<C0170g> m1022s = c0168e.m1022s();
            int size = m1022s.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC0664b mo1037b = m1022s.get(i10).mo1037b();
                if (mo1037b != null) {
                    mo1037b.setSubUiVisibilityListener(this);
                }
            }
        }
        C0168e c0168e2 = this.f799p;
        ArrayList<C0170g> m1029z = c0168e2 != null ? c0168e2.m1029z() : null;
        if (this.f1084A && m1029z != null) {
            int size2 = m1029z.size();
            if (size2 == 1) {
                z11 = !m1029z.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1101x == null) {
                this.f1101x = new d(this.f797n);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1101x.getParent();
            if (viewGroup != this.f805v) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1101x);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f805v;
                actionMenuView.addView(this.f1101x, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            d dVar = this.f1101x;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f805v;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1101x);
                }
            }
        }
        ((ActionMenuView) this.f805v).setOverflowReserved(this.f1084A);
    }

    @Override // androidx.core.view.AbstractC0664b.a
    /* renamed from: e */
    public void mo1172e(boolean z10) {
        if (z10) {
            super.mo934c(null);
            return;
        }
        C0168e c0168e = this.f799p;
        if (c0168e != null) {
            c0168e.m1012e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: f */
    public boolean mo956f() {
        ArrayList<C0170g> arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        C0249b c0249b = this;
        C0168e c0168e = c0249b.f799p;
        View view = null;
        int i14 = 0;
        if (c0168e != null) {
            arrayList = c0168e.m985E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i15 = c0249b.f1088E;
        int i16 = c0249b.f1087D;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0249b.f805v;
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            C0170g c0170g = arrayList.get(i19);
            if (c0170g.m1048o()) {
                i17++;
            } else if (c0170g.m1047n()) {
                i18++;
            } else {
                z10 = true;
            }
            if (c0249b.f1092I && c0170g.isActionViewExpanded()) {
                i15 = 0;
            }
        }
        if (c0249b.f1084A && (z10 || i18 + i17 > i15)) {
            i15--;
        }
        int i20 = i15 - i17;
        SparseBooleanArray sparseBooleanArray = c0249b.f1094K;
        sparseBooleanArray.clear();
        if (c0249b.f1090G) {
            int i21 = c0249b.f1093J;
            i12 = i16 / i21;
            i11 = i21 + ((i16 % i21) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i22 = 0;
        int i23 = 0;
        while (i22 < i10) {
            C0170g c0170g2 = arrayList.get(i22);
            if (c0170g2.m1048o()) {
                View mo944o = c0249b.mo944o(c0170g2, view, viewGroup);
                if (c0249b.f1090G) {
                    i12 -= ActionMenuView.measureChildForCells(mo944o, i11, i12, makeMeasureSpec, i14);
                } else {
                    mo944o.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo944o.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i23 == 0) {
                    i23 = measuredWidth;
                }
                int groupId = c0170g2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0170g2.m1054u(true);
                i13 = i10;
            } else if (c0170g2.m1047n()) {
                int groupId2 = c0170g2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i20 > 0 || z11) && i16 > 0 && (!c0249b.f1090G || i12 > 0);
                boolean z13 = z12;
                i13 = i10;
                if (z12) {
                    View mo944o2 = c0249b.mo944o(c0170g2, null, viewGroup);
                    if (c0249b.f1090G) {
                        int measureChildForCells = ActionMenuView.measureChildForCells(mo944o2, i11, i12, makeMeasureSpec, 0);
                        i12 -= measureChildForCells;
                        if (measureChildForCells == 0) {
                            z13 = false;
                        }
                    } else {
                        mo944o2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = mo944o2.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i23 == 0) {
                        i23 = measuredWidth2;
                    }
                    z12 = z14 & (!c0249b.f1090G ? i16 + i23 <= 0 : i16 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i24 = 0; i24 < i22; i24++) {
                        C0170g c0170g3 = arrayList.get(i24);
                        if (c0170g3.getGroupId() == groupId2) {
                            if (c0170g3.m1045l()) {
                                i20++;
                            }
                            c0170g3.m1054u(false);
                        }
                    }
                }
                if (z12) {
                    i20--;
                }
                c0170g2.m1054u(z12);
            } else {
                i13 = i10;
                c0170g2.m1054u(false);
                i22++;
                view = null;
                c0249b = this;
                i10 = i13;
                i14 = 0;
            }
            i22++;
            view = null;
            c0249b = this;
            i10 = i13;
            i14 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0164a
    /* renamed from: k */
    public void mo940k(C0170g c0170g, InterfaceC0174k.a aVar) {
        aVar.mo923b(c0170g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f805v);
        if (this.f1098O == null) {
            this.f1098O = new b();
        }
        actionMenuItemView.setPopupCallback(this.f1098O);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0164a
    /* renamed from: m */
    public boolean mo942m(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1101x) {
            return false;
        }
        return super.mo942m(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0164a
    /* renamed from: o */
    public View mo944o(C0170g c0170g, View view, ViewGroup viewGroup) {
        View actionView = c0170g.getActionView();
        if (actionView == null || c0170g.m1043j()) {
            actionView = super.mo944o(c0170g, view, viewGroup);
        }
        actionView.setVisibility(c0170g.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0164a
    /* renamed from: p */
    public InterfaceC0174k mo945p(ViewGroup viewGroup) {
        InterfaceC0174k interfaceC0174k = this.f805v;
        InterfaceC0174k mo945p = super.mo945p(viewGroup);
        if (interfaceC0174k != mo945p) {
            ((ActionMenuView) mo945p).setPresenter(this);
        }
        return mo945p;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0164a
    /* renamed from: r */
    public boolean mo947r(int i10, C0170g c0170g) {
        return c0170g.m1045l();
    }

    /* renamed from: z */
    public boolean m1173z() {
        return m1161C() | m1162D();
    }
}
