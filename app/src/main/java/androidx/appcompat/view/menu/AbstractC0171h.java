package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import p133k.InterfaceC3703e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public abstract class AbstractC0171h implements InterfaceC3703e, InterfaceC0173j, AdapterView.OnItemClickListener {

    /* renamed from: n */
    private Rect f924n;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static int m1060l(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public static boolean m1061u(C0168e c0168e) {
        int size = c0168e.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0168e.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public static C0167d m1062v(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0167d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0167d) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: b */
    public void mo933b(Context context, C0168e c0168e) {
    }

    /* renamed from: e */
    public abstract void mo955e(C0168e c0168e);

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

    /* renamed from: j */
    protected boolean mo957j() {
        return true;
    }

    /* renamed from: k */
    public Rect m1063k() {
        return this.f924n;
    }

    /* renamed from: m */
    public abstract void mo958m(View view);

    /* renamed from: n */
    public void m1064n(Rect rect) {
        this.f924n = rect;
    }

    /* renamed from: o */
    public abstract void mo959o(boolean z10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m1062v(listAdapter).f855n.m993M((MenuItem) listAdapter.getItem(i10), this, mo957j() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo960p(int i10);

    /* renamed from: q */
    public abstract void mo961q(int i10);

    /* renamed from: r */
    public abstract void mo962r(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: s */
    public abstract void mo963s(boolean z10);

    /* renamed from: t */
    public abstract void mo964t(int i10);
}
