package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.C0690v;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C2450e;
import p111i4.C3524f;
import p111i4.C3526h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
public class C2455j extends RecyclerView.AbstractC0881h<b> {

    /* renamed from: d */
    private final Context f9413d;

    /* renamed from: e */
    private final CalendarConstraints f9414e;

    /* renamed from: f */
    private final DateSelector<?> f9415f;

    /* renamed from: g */
    private final C2450e.l f9416g;

    /* renamed from: h */
    private final int f9417h;

    /* renamed from: com.google.android.material.datepicker.j$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: n */
        final /* synthetic */ MaterialCalendarGridView f9418n;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f9418n = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f9418n.getAdapter().m11111n(i10)) {
                C2455j.this.f9416g.mo11073a(this.f9418n.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.j$b */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.AbstractC0877d0 {

        /* renamed from: u */
        final TextView f9420u;

        /* renamed from: v */
        final MaterialCalendarGridView f9421v;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C3524f.f14641s);
            this.f9420u = textView;
            C0690v.m3855r0(textView, true);
            this.f9421v = (MaterialCalendarGridView) linearLayout.findViewById(C3524f.f14637o);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public C2455j(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, C2450e.l lVar) {
        Month m11006n = calendarConstraints.m11006n();
        Month m11003g = calendarConstraints.m11003g();
        Month m11005j = calendarConstraints.m11005j();
        if (m11006n.compareTo(m11005j) <= 0) {
            if (m11005j.compareTo(m11003g) <= 0) {
                int m11061m2 = C2454i.f9407s * C2450e.m11061m2(context);
                int m11061m22 = C2451f.m11077E2(context) ? C2450e.m11061m2(context) : 0;
                this.f9413d = context;
                this.f9417h = m11061m2 + m11061m22;
                this.f9414e = calendarConstraints;
                this.f9415f = dateSelector;
                this.f9416g = lVar;
                m5344t(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0881h
    /* renamed from: A */
    public b mo5337m(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C3526h.f14665o, viewGroup, false);
        if (C2451f.m11077E2(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.C0890q(-1, this.f9417h));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0881h
    /* renamed from: d */
    public int mo5328d() {
        return this.f9414e.m11004h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0881h
    /* renamed from: e */
    public long mo5329e(int i10) {
        return this.f9414e.m11006n().m11037q(i10).m11036n();
    }

    /* renamed from: w */
    public Month m11114w(int i10) {
        return this.f9414e.m11006n().m11037q(i10);
    }

    /* renamed from: x */
    public CharSequence m11115x(int i10) {
        return m11114w(i10).m11035j(this.f9413d);
    }

    /* renamed from: y */
    public int m11116y(Month month) {
        return this.f9414e.m11006n().m11038t(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0881h
    /* renamed from: z */
    public void mo5335k(b bVar, int i10) {
        Month m11037q = this.f9414e.m11006n().m11037q(i10);
        bVar.f9420u.setText(m11037q.m11035j(bVar.f4502a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f9421v.findViewById(C3524f.f14637o);
        if (materialCalendarGridView.getAdapter() != null && m11037q.equals(materialCalendarGridView.getAdapter().f9408n)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m11110m(materialCalendarGridView);
        } else {
            C2454i c2454i = new C2454i(m11037q, this.f9415f, this.f9414e);
            materialCalendarGridView.setNumColumns(m11037q.f9322q);
            materialCalendarGridView.setAdapter((ListAdapter) c2454i);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }
}
