package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class C2453h<S> extends AbstractC2457l<S> {

    /* renamed from: p0 */
    private int f9403p0;

    /* renamed from: q0 */
    private DateSelector<S> f9404q0;

    /* renamed from: r0 */
    private CalendarConstraints f9405r0;

    /* renamed from: com.google.android.material.datepicker.h$a */
    /* loaded from: classes.dex */
    class a extends AbstractC2456k<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.AbstractC2456k
        /* renamed from: a */
        public void mo11095a(S s10) {
            Iterator<AbstractC2456k<S>> it = C2453h.this.f9422o0.iterator();
            while (it.hasNext()) {
                it.next().mo11095a(s10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z1 */
    public static <T> C2453h<T> m11097Z1(DateSelector<T> dateSelector, int i10, CalendarConstraints calendarConstraints) {
        C2453h<T> c2453h = new C2453h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        c2453h.m4282H1(bundle);
        return c2453h;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f9404q0.m11020v(layoutInflater.cloneInContext(new ContextThemeWrapper(m4384w(), this.f9403p0)), viewGroup, bundle, this.f9405r0, new a());
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: V0 */
    public void mo4322V0(Bundle bundle) {
        super.mo4322V0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9403p0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9404q0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9405r0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        if (bundle == null) {
            bundle = m4378u();
        }
        this.f9403p0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f9404q0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9405r0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
