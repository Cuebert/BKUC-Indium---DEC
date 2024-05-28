package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0174k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public class C0167d extends BaseAdapter {

    /* renamed from: n */
    C0168e f855n;

    /* renamed from: o */
    private int f856o = -1;

    /* renamed from: p */
    private boolean f857p;

    /* renamed from: q */
    private final boolean f858q;

    /* renamed from: r */
    private final LayoutInflater f859r;

    /* renamed from: s */
    private final int f860s;

    public C0167d(C0168e c0168e, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f858q = z10;
        this.f859r = layoutInflater;
        this.f855n = c0168e;
        this.f860s = i10;
        m970a();
    }

    /* renamed from: a */
    void m970a() {
        C0170g m1025v = this.f855n.m1025v();
        if (m1025v != null) {
            ArrayList<C0170g> m1029z = this.f855n.m1029z();
            int size = m1029z.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (m1029z.get(i10) == m1025v) {
                    this.f856o = i10;
                    return;
                }
            }
        }
        this.f856o = -1;
    }

    /* renamed from: b */
    public C0168e m971b() {
        return this.f855n;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0170g getItem(int i10) {
        ArrayList<C0170g> m1029z = this.f858q ? this.f855n.m1029z() : this.f855n.m985E();
        int i11 = this.f856o;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return m1029z.get(i10);
    }

    /* renamed from: d */
    public void m973d(boolean z10) {
        this.f857p = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0170g> m1029z = this.f858q ? this.f855n.m1029z() : this.f855n.m985E();
        if (this.f856o < 0) {
            return m1029z.size();
        }
        return m1029z.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f859r.inflate(this.f860s, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f855n.mo986F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        InterfaceC0174k.a aVar = (InterfaceC0174k.a) view;
        if (this.f857p) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo923b(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m970a();
        super.notifyDataSetChanged();
    }
}
