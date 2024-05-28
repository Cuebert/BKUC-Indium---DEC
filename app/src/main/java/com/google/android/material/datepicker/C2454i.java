package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public class C2454i extends BaseAdapter {

    /* renamed from: s */
    static final int f9407s = C2460o.m11132k().getMaximum(4);

    /* renamed from: n */
    final Month f9408n;

    /* renamed from: o */
    final DateSelector<?> f9409o;

    /* renamed from: p */
    private Collection<Long> f9410p;

    /* renamed from: q */
    C2447b f9411q;

    /* renamed from: r */
    final CalendarConstraints f9412r;

    public C2454i(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f9408n = month;
        this.f9409o = dateSelector;
        this.f9412r = calendarConstraints;
        this.f9410p = dateSelector.m11017p();
    }

    /* renamed from: e */
    private void m11098e(Context context) {
        if (this.f9411q == null) {
            this.f9411q = new C2447b(context);
        }
    }

    /* renamed from: h */
    private boolean m11099h(long j10) {
        Iterator<Long> it = this.f9409o.m11017p().iterator();
        while (it.hasNext()) {
            if (C2460o.m11122a(j10) == C2460o.m11122a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m11100k(TextView textView, long j10) {
        C2446a c2446a;
        if (textView == null) {
            return;
        }
        if (this.f9412r.m11002f().mo11008m(j10)) {
            textView.setEnabled(true);
            if (m11099h(j10)) {
                c2446a = this.f9411q.f9333b;
            } else if (C2460o.m11130i().getTimeInMillis() == j10) {
                c2446a = this.f9411q.f9334c;
            } else {
                c2446a = this.f9411q.f9332a;
            }
        } else {
            textView.setEnabled(false);
            c2446a = this.f9411q.f9338g;
        }
        c2446a.m11044d(textView);
    }

    /* renamed from: l */
    private void m11101l(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.m11029d(j10).equals(this.f9408n)) {
            m11100k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().m11102a(this.f9408n.m11034h(j10)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    /* renamed from: a */
    public int m11102a(int i10) {
        return m11103b() + (i10 - 1);
    }

    /* renamed from: b */
    public int m11103b() {
        return this.f9408n.m11032f();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i10) {
        if (i10 < this.f9408n.m11032f() || i10 > m11108i()) {
            return null;
        }
        return Long.valueOf(this.f9408n.m11033g(m11109j(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m11098e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p111i4.C3526h.f14662l
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.m11103b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.Month r8 = r5.f9408n
            int r2 = r8.f9323r
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f9408n
            long r7 = r8.m11033g(r7)
            com.google.android.material.datepicker.Month r3 = r5.f9408n
            int r3 = r3.f9321p
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m11030e()
            int r4 = r4.f9321p
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.C2448c.m11045a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.C2448c.m11048d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.m11100k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C2454i.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* renamed from: f */
    public boolean m11106f(int i10) {
        return i10 % this.f9408n.f9322q == 0;
    }

    /* renamed from: g */
    public boolean m11107g(int i10) {
        return (i10 + 1) % this.f9408n.f9322q == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9408n.f9323r + m11103b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f9408n.f9322q;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public int m11108i() {
        return (this.f9408n.m11032f() + this.f9408n.f9323r) - 1;
    }

    /* renamed from: j */
    int m11109j(int i10) {
        return (i10 - this.f9408n.m11032f()) + 1;
    }

    /* renamed from: m */
    public void m11110m(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f9410p.iterator();
        while (it.hasNext()) {
            m11101l(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f9409o;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.m11017p().iterator();
            while (it2.hasNext()) {
                m11101l(materialCalendarGridView, it2.next().longValue());
            }
            this.f9410p = this.f9409o.m11017p();
        }
    }

    /* renamed from: n */
    public boolean m11111n(int i10) {
        return i10 >= m11103b() && i10 <= m11108i();
    }
}
