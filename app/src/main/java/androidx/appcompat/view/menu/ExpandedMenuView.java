package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0168e;
import androidx.appcompat.widget.TintTypedArray;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0168e.b, InterfaceC0174k, AdapterView.OnItemClickListener {

    /* renamed from: p */
    private static final int[] f777p = {R.attr.background, R.attr.divider};

    /* renamed from: n */
    private C0168e f778n;

    /* renamed from: o */
    private int f779o;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public int getWindowAnimations() {
        return this.f779o;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0174k
    public void initialize(C0168e c0168e) {
        this.f778n = c0168e;
    }

    @Override // androidx.appcompat.view.menu.C0168e.b
    public boolean invokeItem(C0170g c0170g) {
        return this.f778n.m992L(c0170g, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        invokeItem((C0170g) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, f777p, i10, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider(obtainStyledAttributes.getDrawable(1));
        }
        obtainStyledAttributes.recycle();
    }
}
