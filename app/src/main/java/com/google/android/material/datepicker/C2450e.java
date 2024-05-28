package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C0650d;
import androidx.core.view.C0656a;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import androidx.recyclerview.widget.C0915j;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p111i4.C3522d;
import p111i4.C3524f;
import p111i4.C3525g;
import p111i4.C3526h;
import p111i4.C3528j;

/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public final class C2450e<S> extends AbstractC2457l<S> {

    /* renamed from: p0 */
    private int f9348p0;

    /* renamed from: q0 */
    private DateSelector<S> f9349q0;

    /* renamed from: r0 */
    private CalendarConstraints f9350r0;

    /* renamed from: s0 */
    private Month f9351s0;

    /* renamed from: t0 */
    private k f9352t0;

    /* renamed from: u0 */
    private C2447b f9353u0;

    /* renamed from: v0 */
    private RecyclerView f9354v0;

    /* renamed from: w0 */
    private RecyclerView f9355w0;

    /* renamed from: x0 */
    private View f9356x0;

    /* renamed from: y0 */
    private View f9357y0;

    /* renamed from: z0 */
    static final Object f9347z0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: A0 */
    static final Object f9344A0 = "NAVIGATION_PREV_TAG";

    /* renamed from: B0 */
    static final Object f9345B0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: C0 */
    static final Object f9346C0 = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.e$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ int f9358n;

        a(int i10) {
            this.f9358n = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2450e.this.f9355w0.m5224o1(this.f9358n);
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$b */
    /* loaded from: classes.dex */
    class b extends C0656a {
        b() {
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            super.mo3484g(view, c0660c);
            c0660c.m3536b0(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$c */
    /* loaded from: classes.dex */
    class c extends C2458m {

        /* renamed from: I */
        final /* synthetic */ int f9361I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f9361I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: M1 */
        protected void mo5073M1(RecyclerView.C0871a0 c0871a0, int[] iArr) {
            if (this.f9361I == 0) {
                iArr[0] = C2450e.this.f9355w0.getWidth();
                iArr[1] = C2450e.this.f9355w0.getWidth();
            } else {
                iArr[0] = C2450e.this.f9355w0.getHeight();
                iArr[1] = C2450e.this.f9355w0.getHeight();
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$d */
    /* loaded from: classes.dex */
    class d implements l {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.C2450e.l
        /* renamed from: a */
        public void mo11073a(long j10) {
            if (C2450e.this.f9350r0.m11002f().mo11008m(j10)) {
                C2450e.this.f9349q0.m11019u(j10);
                Iterator<AbstractC2456k<S>> it = C2450e.this.f9422o0.iterator();
                while (it.hasNext()) {
                    it.next().mo11095a(C2450e.this.f9349q0.m11018r());
                }
                C2450e.this.f9355w0.getAdapter().m5333i();
                if (C2450e.this.f9354v0 != null) {
                    C2450e.this.f9354v0.getAdapter().m5333i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.e$e */
    /* loaded from: classes.dex */
    public class e extends RecyclerView.AbstractC0888o {

        /* renamed from: a */
        private final Calendar f9364a = C2460o.m11132k();

        /* renamed from: b */
        private final Calendar f9365b = C2460o.m11132k();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0888o
        /* renamed from: g */
        public void mo5380g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0871a0 c0871a0) {
            int width;
            if ((recyclerView.getAdapter() instanceof C2461p) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C2461p c2461p = (C2461p) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C0650d<Long, Long> c0650d : C2450e.this.f9349q0.m11015l()) {
                    Long l10 = c0650d.f3493a;
                    if (l10 != null && c0650d.f3494b != null) {
                        this.f9364a.setTimeInMillis(l10.longValue());
                        this.f9365b.setTimeInMillis(c0650d.f3494b.longValue());
                        int m11138x = c2461p.m11138x(this.f9364a.get(1));
                        int m11138x2 = c2461p.m11138x(this.f9365b.get(1));
                        View mo5068C = gridLayoutManager.mo5068C(m11138x);
                        View mo5068C2 = gridLayoutManager.mo5068C(m11138x2);
                        int m5016T2 = m11138x / gridLayoutManager.m5016T2();
                        int m5016T22 = m11138x2 / gridLayoutManager.m5016T2();
                        int i10 = m5016T2;
                        while (i10 <= m5016T22) {
                            View mo5068C3 = gridLayoutManager.mo5068C(gridLayoutManager.m5016T2() * i10);
                            if (mo5068C3 != null) {
                                int top = mo5068C3.getTop() + C2450e.this.f9353u0.f9335d.m11043c();
                                int bottom = mo5068C3.getBottom() - C2450e.this.f9353u0.f9335d.m11042b();
                                int left = i10 == m5016T2 ? mo5068C.getLeft() + (mo5068C.getWidth() / 2) : 0;
                                if (i10 == m5016T22) {
                                    width = mo5068C2.getLeft() + (mo5068C2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(left, top, width, bottom, C2450e.this.f9353u0.f9339h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.e$f */
    /* loaded from: classes.dex */
    public class f extends C0656a {
        f() {
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            String m4328Y;
            super.mo3484g(view, c0660c);
            if (C2450e.this.f9357y0.getVisibility() == 0) {
                m4328Y = C2450e.this.m4328Y(C3528j.f14689s);
            } else {
                m4328Y = C2450e.this.m4328Y(C3528j.f14687q);
            }
            c0660c.m3548j0(m4328Y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.e$g */
    /* loaded from: classes.dex */
    public class g extends RecyclerView.AbstractC0894u {

        /* renamed from: a */
        final /* synthetic */ C2455j f9368a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f9369b;

        g(C2455j c2455j, MaterialButton materialButton) {
            this.f9368a = c2455j;
            this.f9369b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0894u
        /* renamed from: a */
        public void mo5501a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f9369b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0894u
        /* renamed from: b */
        public void mo5502b(RecyclerView recyclerView, int i10, int i11) {
            int m5082a2;
            if (i10 < 0) {
                m5082a2 = C2450e.this.m11069n2().m5080Y1();
            } else {
                m5082a2 = C2450e.this.m11069n2().m5082a2();
            }
            C2450e.this.f9351s0 = this.f9368a.m11114w(m5082a2);
            this.f9369b.setText(this.f9368a.m11115x(m5082a2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.e$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2450e.this.m11072s2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.e$i */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {

        /* renamed from: n */
        final /* synthetic */ C2455j f9372n;

        i(C2455j c2455j) {
            this.f9372n = c2455j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m5080Y1 = C2450e.this.m11069n2().m5080Y1() + 1;
            if (m5080Y1 < C2450e.this.f9355w0.getAdapter().mo5328d()) {
                C2450e.this.m11070q2(this.f9372n.m11114w(m5080Y1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.e$j */
    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {

        /* renamed from: n */
        final /* synthetic */ C2455j f9374n;

        j(C2455j c2455j) {
            this.f9374n = c2455j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m5082a2 = C2450e.this.m11069n2().m5082a2() - 1;
            if (m5082a2 >= 0) {
                C2450e.this.m11070q2(this.f9374n.m11114w(m5082a2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.e$k */
    /* loaded from: classes.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.e$l */
    /* loaded from: classes.dex */
    public interface l {
        /* renamed from: a */
        void mo11073a(long j10);
    }

    /* renamed from: g2 */
    private void m11059g2(View view, C2455j c2455j) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C3524f.f14638p);
        materialButton.setTag(f9346C0);
        C0690v.m3853q0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C3524f.f14640r);
        materialButton2.setTag(f9344A0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C3524f.f14639q);
        materialButton3.setTag(f9345B0);
        this.f9356x0 = view.findViewById(C3524f.f14648z);
        this.f9357y0 = view.findViewById(C3524f.f14643u);
        m11071r2(k.DAY);
        materialButton.setText(this.f9351s0.m11035j(view.getContext()));
        this.f9355w0.m5212j(new g(c2455j, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(c2455j));
        materialButton2.setOnClickListener(new j(c2455j));
    }

    /* renamed from: h2 */
    private RecyclerView.AbstractC0888o m11060h2() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m2 */
    public static int m11061m2(Context context) {
        return context.getResources().getDimensionPixelSize(C3522d.f14555I);
    }

    /* renamed from: o2 */
    public static <T> C2450e<T> m11062o2(DateSelector<T> dateSelector, int i10, CalendarConstraints calendarConstraints) {
        C2450e<T> c2450e = new C2450e<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m11005j());
        c2450e.m4282H1(bundle);
        return c2450e;
    }

    /* renamed from: p2 */
    private void m11063p2(int i10) {
        this.f9355w0.post(new a(i10));
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m4384w(), this.f9348p0);
        this.f9353u0 = new C2447b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month m11006n = this.f9350r0.m11006n();
        if (C2451f.m11077E2(contextThemeWrapper)) {
            i10 = C3526h.f14666p;
            i11 = 1;
        } else {
            i10 = C3526h.f14664n;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C3524f.f14644v);
        C0690v.m3853q0(gridView, new b());
        gridView.setAdapter((ListAdapter) new C2449d());
        gridView.setNumColumns(m11006n.f9322q);
        gridView.setEnabled(false);
        this.f9355w0 = (RecyclerView) inflate.findViewById(C3524f.f14647y);
        this.f9355w0.setLayoutManager(new c(m4384w(), i11, false, i11));
        this.f9355w0.setTag(f9347z0);
        C2455j c2455j = new C2455j(contextThemeWrapper, this.f9349q0, this.f9350r0, new d());
        this.f9355w0.setAdapter(c2455j);
        int integer = contextThemeWrapper.getResources().getInteger(C3525g.f14650b);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C3524f.f14648z);
        this.f9354v0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f9354v0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f9354v0.setAdapter(new C2461p(this));
            this.f9354v0.m5206g(m11060h2());
        }
        if (inflate.findViewById(C3524f.f14638p) != null) {
            m11059g2(inflate, c2455j);
        }
        if (!C2451f.m11077E2(contextThemeWrapper)) {
            new C0915j().m5861b(this.f9355w0);
        }
        this.f9355w0.m5207g1(c2455j.m11116y(this.f9351s0));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: V0 */
    public void mo4322V0(Bundle bundle) {
        super.mo4322V0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9348p0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f9349q0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9350r0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f9351s0);
    }

    @Override // com.google.android.material.datepicker.AbstractC2457l
    /* renamed from: X1 */
    public boolean mo11064X1(AbstractC2456k<S> abstractC2456k) {
        return super.mo11064X1(abstractC2456k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i2 */
    public CalendarConstraints m11065i2() {
        return this.f9350r0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j2 */
    public C2447b m11066j2() {
        return this.f9353u0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k2 */
    public Month m11067k2() {
        return this.f9351s0;
    }

    /* renamed from: l2 */
    public DateSelector<S> m11068l2() {
        return this.f9349q0;
    }

    /* renamed from: n2 */
    LinearLayoutManager m11069n2() {
        return (LinearLayoutManager) this.f9355w0.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q2 */
    public void m11070q2(Month month) {
        C2455j c2455j = (C2455j) this.f9355w0.getAdapter();
        int m11116y = c2455j.m11116y(month);
        int m11116y2 = m11116y - c2455j.m11116y(this.f9351s0);
        boolean z10 = Math.abs(m11116y2) > 3;
        boolean z11 = m11116y2 > 0;
        this.f9351s0 = month;
        if (z10 && z11) {
            this.f9355w0.m5207g1(m11116y - 3);
            m11063p2(m11116y);
        } else if (z10) {
            this.f9355w0.m5207g1(m11116y + 3);
            m11063p2(m11116y);
        } else {
            m11063p2(m11116y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2 */
    public void m11071r2(k kVar) {
        this.f9352t0 = kVar;
        if (kVar == k.YEAR) {
            this.f9354v0.getLayoutManager().mo5100x1(((C2461p) this.f9354v0.getAdapter()).m11138x(this.f9351s0.f9321p));
            this.f9356x0.setVisibility(0);
            this.f9357y0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f9356x0.setVisibility(8);
            this.f9357y0.setVisibility(0);
            m11070q2(this.f9351s0);
        }
    }

    /* renamed from: s2 */
    void m11072s2() {
        k kVar = this.f9352t0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            m11071r2(k.DAY);
        } else if (kVar == k.DAY) {
            m11071r2(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        if (bundle == null) {
            bundle = m4378u();
        }
        this.f9348p0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f9349q0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f9350r0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9351s0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }
}
