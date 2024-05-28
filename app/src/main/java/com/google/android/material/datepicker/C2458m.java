package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0912g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
class C2458m extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.m$a */
    /* loaded from: classes.dex */
    class a extends C0912g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0912g
        /* renamed from: v */
        protected float mo5795v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2458m(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: I1 */
    public void mo5071I1(RecyclerView recyclerView, RecyclerView.C0871a0 c0871a0, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.m5570p(i10);
        m5412J1(aVar);
    }
}
