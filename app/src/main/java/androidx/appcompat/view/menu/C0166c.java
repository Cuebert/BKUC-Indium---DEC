package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0173j;
import androidx.appcompat.view.menu.InterfaceC0174k;
import java.util.ArrayList;
import p039d.C2954g;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public class C0166c implements InterfaceC0173j, AdapterView.OnItemClickListener {

    /* renamed from: n */
    Context f844n;

    /* renamed from: o */
    LayoutInflater f845o;

    /* renamed from: p */
    C0168e f846p;

    /* renamed from: q */
    ExpandedMenuView f847q;

    /* renamed from: r */
    int f848r;

    /* renamed from: s */
    int f849s;

    /* renamed from: t */
    int f850t;

    /* renamed from: u */
    private InterfaceC0173j.a f851u;

    /* renamed from: v */
    a f852v;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: n */
        private int f853n = -1;

        public a() {
            m968a();
        }

        /* renamed from: a */
        void m968a() {
            C0170g m1025v = C0166c.this.f846p.m1025v();
            if (m1025v != null) {
                ArrayList<C0170g> m1029z = C0166c.this.f846p.m1029z();
                int size = m1029z.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (m1029z.get(i10) == m1025v) {
                        this.f853n = i10;
                        return;
                    }
                }
            }
            this.f853n = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public C0170g getItem(int i10) {
            ArrayList<C0170g> m1029z = C0166c.this.f846p.m1029z();
            int i11 = i10 + C0166c.this.f848r;
            int i12 = this.f853n;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return m1029z.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0166c.this.f846p.m1029z().size() - C0166c.this.f848r;
            return this.f853n < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0166c c0166c = C0166c.this;
                view = c0166c.f845o.inflate(c0166c.f850t, viewGroup, false);
            }
            ((InterfaceC0174k.a) view).mo923b(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m968a();
            super.notifyDataSetChanged();
        }
    }

    public C0166c(Context context, int i10) {
        this(i10, 0);
        this.f844n = context;
        this.f845o = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: a */
    public void mo932a(C0168e c0168e, boolean z10) {
        InterfaceC0173j.a aVar = this.f851u;
        if (aVar != null) {
            aVar.mo824a(c0168e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: b */
    public void mo933b(Context context, C0168e c0168e) {
        if (this.f849s != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f849s);
            this.f844n = contextThemeWrapper;
            this.f845o = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f844n != null) {
            this.f844n = context;
            if (this.f845o == null) {
                this.f845o = LayoutInflater.from(context);
            }
        }
        this.f846p = c0168e;
        a aVar = this.f852v;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: c */
    public boolean mo934c(SubMenuC0176m subMenuC0176m) {
        if (!subMenuC0176m.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0169f(subMenuC0176m).m1031d(null);
        InterfaceC0173j.a aVar = this.f851u;
        if (aVar == null) {
            return true;
        }
        aVar.mo825b(subMenuC0176m);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: d */
    public void mo935d(boolean z10) {
        a aVar = this.f852v;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    public ListAdapter m966e() {
        if (this.f852v == null) {
            this.f852v = new a();
        }
        return this.f852v;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: f */
    public boolean mo956f() {
        return false;
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
        this.f851u = aVar;
    }

    /* renamed from: j */
    public InterfaceC0174k m967j(ViewGroup viewGroup) {
        if (this.f847q == null) {
            this.f847q = (ExpandedMenuView) this.f845o.inflate(C2954g.f12300i, viewGroup, false);
            if (this.f852v == null) {
                this.f852v = new a();
            }
            this.f847q.setAdapter((ListAdapter) this.f852v);
            this.f847q.setOnItemClickListener(this);
        }
        return this.f847q;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f846p.m993M(this.f852v.getItem(i10), this, 0);
    }

    public C0166c(int i10, int i11) {
        this.f850t = i10;
        this.f849s = i11;
    }
}
