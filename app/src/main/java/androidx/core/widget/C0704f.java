package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.f */
/* loaded from: classes.dex */
public class C0704f extends AbstractViewOnTouchListenerC0699a {

    /* renamed from: F */
    private final ListView f3723F;

    public C0704f(ListView listView) {
        super(listView);
        this.f3723F = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0699a
    /* renamed from: a */
    public boolean mo4097a(int i10) {
        return false;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0699a
    /* renamed from: b */
    public boolean mo4098b(int i10) {
        ListView listView = this.f3723F;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0699a
    /* renamed from: j */
    public void mo4100j(int i10, int i11) {
        C0705g.m4151b(this.f3723F, i11);
    }
}
