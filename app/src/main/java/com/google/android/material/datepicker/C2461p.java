package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C2450e;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import p111i4.C3526h;
import p111i4.C3528j;

/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes.dex */
public class C2461p extends RecyclerView.AbstractC0881h<b> {

    /* renamed from: d */
    private final C2450e<?> f9428d;

    /* renamed from: com.google.android.material.datepicker.p$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: n */
        final /* synthetic */ int f9429n;

        a(int i10) {
            this.f9429n = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2461p.this.f9428d.m11070q2(C2461p.this.f9428d.m11065i2().m11001e(Month.m11028c(this.f9429n, C2461p.this.f9428d.m11067k2().f9320o)));
            C2461p.this.f9428d.m11071r2(C2450e.k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.p$b */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.AbstractC0877d0 {

        /* renamed from: u */
        final TextView f9431u;

        b(TextView textView) {
            super(textView);
            this.f9431u = textView;
        }
    }

    public C2461p(C2450e<?> c2450e) {
        this.f9428d = c2450e;
    }

    /* renamed from: w */
    private View.OnClickListener m11136w(int i10) {
        return new a(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0881h
    /* renamed from: A */
    public b mo5337m(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C3526h.f14667q, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0881h
    /* renamed from: d */
    public int mo5328d() {
        return this.f9428d.m11065i2().m11007q();
    }

    /* renamed from: x */
    public int m11138x(int i10) {
        return i10 - this.f9428d.m11065i2().m11006n().f9321p;
    }

    /* renamed from: y */
    int m11139y(int i10) {
        return this.f9428d.m11065i2().m11006n().f9321p + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0881h
    /* renamed from: z */
    public void mo5335k(b bVar, int i10) {
        int m11139y = m11139y(i10);
        String string = bVar.f9431u.getContext().getString(C3528j.f14685o);
        bVar.f9431u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(m11139y)));
        bVar.f9431u.setContentDescription(String.format(string, Integer.valueOf(m11139y)));
        C2447b m11066j2 = this.f9428d.m11066j2();
        Calendar m11130i = C2460o.m11130i();
        C2446a c2446a = m11130i.get(1) == m11139y ? m11066j2.f9337f : m11066j2.f9335d;
        Iterator<Long> it = this.f9428d.m11068l2().m11017p().iterator();
        while (it.hasNext()) {
            m11130i.setTimeInMillis(it.next().longValue());
            if (m11130i.get(1) == m11139y) {
                c2446a = m11066j2.f9336e;
            }
        }
        c2446a.m11044d(bVar.f9431u);
        bVar.f9431u.setOnClickListener(m11136w(m11139y));
    }
}
