package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0173j;
import androidx.appcompat.view.menu.InterfaceC0174k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC0164a implements InterfaceC0173j {

    /* renamed from: n */
    protected Context f797n;

    /* renamed from: o */
    protected Context f798o;

    /* renamed from: p */
    protected C0168e f799p;

    /* renamed from: q */
    protected LayoutInflater f800q;

    /* renamed from: r */
    protected LayoutInflater f801r;

    /* renamed from: s */
    private InterfaceC0173j.a f802s;

    /* renamed from: t */
    private int f803t;

    /* renamed from: u */
    private int f804u;

    /* renamed from: v */
    protected InterfaceC0174k f805v;

    /* renamed from: w */
    private int f806w;

    public AbstractC0164a(Context context, int i10, int i11) {
        this.f797n = context;
        this.f800q = LayoutInflater.from(context);
        this.f803t = i10;
        this.f804u = i11;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: a */
    public void mo932a(C0168e c0168e, boolean z10) {
        InterfaceC0173j.a aVar = this.f802s;
        if (aVar != null) {
            aVar.mo824a(c0168e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: b */
    public void mo933b(Context context, C0168e c0168e) {
        this.f798o = context;
        this.f801r = LayoutInflater.from(context);
        this.f799p = c0168e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: c */
    public boolean mo934c(SubMenuC0176m subMenuC0176m) {
        InterfaceC0173j.a aVar = this.f802s;
        SubMenuC0176m subMenuC0176m2 = subMenuC0176m;
        if (aVar == null) {
            return false;
        }
        if (subMenuC0176m == null) {
            subMenuC0176m2 = this.f799p;
        }
        return aVar.mo825b(subMenuC0176m2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: d */
    public void mo935d(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f805v;
        if (viewGroup == null) {
            return;
        }
        C0168e c0168e = this.f799p;
        int i10 = 0;
        if (c0168e != null) {
            c0168e.m1021r();
            ArrayList<C0170g> m985E = this.f799p.m985E();
            int size = m985E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                C0170g c0170g = m985E.get(i12);
                if (mo947r(i11, c0170g)) {
                    View childAt = viewGroup.getChildAt(i11);
                    C0170g itemData = childAt instanceof InterfaceC0174k.a ? ((InterfaceC0174k.a) childAt).getItemData() : null;
                    View mo944o = mo944o(c0170g, childAt, viewGroup);
                    if (c0170g != itemData) {
                        mo944o.setPressed(false);
                        mo944o.jumpDrawablesToCurrentState();
                    }
                    if (mo944o != childAt) {
                        m939j(mo944o, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!mo942m(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: g */
    public boolean mo936g(C0168e c0168e, C0170g c0170g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: h */
    public boolean mo937h(C0168e c0168e, C0170g c0170g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: i */
    public void mo938i(InterfaceC0173j.a aVar) {
        this.f802s = aVar;
    }

    /* renamed from: j */
    protected void m939j(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f805v).addView(view, i10);
    }

    /* renamed from: k */
    public abstract void mo940k(C0170g c0170g, InterfaceC0174k.a aVar);

    /* renamed from: l */
    public InterfaceC0174k.a m941l(ViewGroup viewGroup) {
        return (InterfaceC0174k.a) this.f800q.inflate(this.f804u, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo942m(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    /* renamed from: n */
    public InterfaceC0173j.a m943n() {
        return this.f802s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public View mo944o(C0170g c0170g, View view, ViewGroup viewGroup) {
        InterfaceC0174k.a aVar;
        if (view instanceof InterfaceC0174k.a) {
            aVar = (InterfaceC0174k.a) view;
        } else {
            aVar = m941l(viewGroup);
        }
        mo940k(c0170g, aVar);
        return (View) aVar;
    }

    /* renamed from: p */
    public InterfaceC0174k mo945p(ViewGroup viewGroup) {
        if (this.f805v == null) {
            InterfaceC0174k interfaceC0174k = (InterfaceC0174k) this.f800q.inflate(this.f803t, viewGroup, false);
            this.f805v = interfaceC0174k;
            interfaceC0174k.initialize(this.f799p);
            mo935d(true);
        }
        return this.f805v;
    }

    /* renamed from: q */
    public void m946q(int i10) {
        this.f806w = i10;
    }

    /* renamed from: r */
    public abstract boolean mo947r(int i10, C0170g c0170g);
}
