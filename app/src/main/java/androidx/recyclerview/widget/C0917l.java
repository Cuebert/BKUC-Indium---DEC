package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
class C0917l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5839a(RecyclerView.C0871a0 c0871a0, AbstractC0914i abstractC0914i, View view, View view2, RecyclerView.AbstractC0889p abstractC0889p, boolean z10) {
        if (abstractC0889p.m5411J() == 0 || c0871a0.m5251b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(abstractC0889p.m5451h0(view) - abstractC0889p.m5451h0(view2)) + 1;
        }
        return Math.min(abstractC0914i.mo5818n(), abstractC0914i.mo5808d(view2) - abstractC0914i.mo5811g(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m5840b(RecyclerView.C0871a0 c0871a0, AbstractC0914i abstractC0914i, View view, View view2, RecyclerView.AbstractC0889p abstractC0889p, boolean z10, boolean z11) {
        int max;
        if (abstractC0889p.m5411J() == 0 || c0871a0.m5251b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(abstractC0889p.m5451h0(view), abstractC0889p.m5451h0(view2));
        int max2 = Math.max(abstractC0889p.m5451h0(view), abstractC0889p.m5451h0(view2));
        if (z11) {
            max = Math.max(0, (c0871a0.m5251b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(abstractC0914i.mo5808d(view2) - abstractC0914i.mo5811g(view)) / (Math.abs(abstractC0889p.m5451h0(view) - abstractC0889p.m5451h0(view2)) + 1))) + (abstractC0914i.mo5817m() - abstractC0914i.mo5811g(view)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m5841c(RecyclerView.C0871a0 c0871a0, AbstractC0914i abstractC0914i, View view, View view2, RecyclerView.AbstractC0889p abstractC0889p, boolean z10) {
        if (abstractC0889p.m5411J() == 0 || c0871a0.m5251b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c0871a0.m5251b();
        }
        return (int) (((abstractC0914i.mo5808d(view2) - abstractC0914i.mo5811g(view)) / (Math.abs(abstractC0889p.m5451h0(view) - abstractC0889p.m5451h0(view2)) + 1)) * c0871a0.m5251b());
    }
}
