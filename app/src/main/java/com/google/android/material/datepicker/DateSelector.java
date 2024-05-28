package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.C0650d;
import java.util.Collection;

/* loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    /* renamed from: i */
    String m11013i(Context context);

    /* renamed from: k */
    int m11014k(Context context);

    /* renamed from: l */
    Collection<C0650d<Long, Long>> m11015l();

    /* renamed from: o */
    boolean m11016o();

    /* renamed from: p */
    Collection<Long> m11017p();

    /* renamed from: r */
    S m11018r();

    /* renamed from: u */
    void m11019u(long j10);

    /* renamed from: v */
    View m11020v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, AbstractC2456k<S> abstractC2456k);
}
