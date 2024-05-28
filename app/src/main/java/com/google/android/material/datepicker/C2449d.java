package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p111i4.C3526h;
import p111i4.C3528j;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
class C2449d extends BaseAdapter {

    /* renamed from: q */
    private static final int f9340q;

    /* renamed from: n */
    private final Calendar f9341n;

    /* renamed from: o */
    private final int f9342o;

    /* renamed from: p */
    private final int f9343p;

    static {
        f9340q = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C2449d() {
        Calendar m11132k = C2460o.m11132k();
        this.f9341n = m11132k;
        this.f9342o = m11132k.getMaximum(7);
        this.f9343p = m11132k.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m11050b(int i10) {
        int i11 = i10 + this.f9343p;
        int i12 = this.f9342o;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f9342o) {
            return null;
        }
        return Integer.valueOf(m11050b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9342o;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C3526h.f14663m, viewGroup, false);
        }
        this.f9341n.set(7, m11050b(i10));
        textView.setText(this.f9341n.getDisplayName(7, f9340q, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C3528j.f14684n), this.f9341n.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
