package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0690v;
import androidx.fragment.app.AbstractC0819t;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p066f.C3121a;
import p111i4.C3520b;
import p111i4.C3522d;
import p111i4.C3523e;
import p111i4.C3524f;
import p111i4.C3526h;
import p111i4.C3528j;
import p111i4.C3529k;
import p199p4.ViewOnTouchListenerC4268a;
import p272v4.C4980b;
import p310y4.C5888g;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public final class C2451f<S> extends DialogInterfaceOnCancelListenerC0802c {

    /* renamed from: V0 */
    static final Object f9379V0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: W0 */
    static final Object f9380W0 = "CANCEL_BUTTON_TAG";

    /* renamed from: X0 */
    static final Object f9381X0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: E0 */
    private final LinkedHashSet<InterfaceC2452g<? super S>> f9382E0 = new LinkedHashSet<>();

    /* renamed from: F0 */
    private final LinkedHashSet<View.OnClickListener> f9383F0 = new LinkedHashSet<>();

    /* renamed from: G0 */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f9384G0 = new LinkedHashSet<>();

    /* renamed from: H0 */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f9385H0 = new LinkedHashSet<>();

    /* renamed from: I0 */
    private int f9386I0;

    /* renamed from: J0 */
    private DateSelector<S> f9387J0;

    /* renamed from: K0 */
    private AbstractC2457l<S> f9388K0;

    /* renamed from: L0 */
    private CalendarConstraints f9389L0;

    /* renamed from: M0 */
    private C2450e<S> f9390M0;

    /* renamed from: N0 */
    private int f9391N0;

    /* renamed from: O0 */
    private CharSequence f9392O0;

    /* renamed from: P0 */
    private boolean f9393P0;

    /* renamed from: Q0 */
    private int f9394Q0;

    /* renamed from: R0 */
    private TextView f9395R0;

    /* renamed from: S0 */
    private CheckableImageButton f9396S0;

    /* renamed from: T0 */
    private C5888g f9397T0;

    /* renamed from: U0 */
    private Button f9398U0;

    /* renamed from: com.google.android.material.datepicker.f$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C2451f.this.f9382E0.iterator();
            while (it.hasNext()) {
                ((InterfaceC2452g) it.next()).m11096a(C2451f.this.m11093B2());
            }
            C2451f.this.m4596a2();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C2451f.this.f9383F0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C2451f.this.m4596a2();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$c */
    /* loaded from: classes.dex */
    public class c extends AbstractC2456k<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.AbstractC2456k
        /* renamed from: a */
        public void mo11095a(S s10) {
            C2451f.this.m11081I2();
            C2451f.this.f9398U0.setEnabled(C2451f.this.f9387J0.m11016o());
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2451f.this.f9398U0.setEnabled(C2451f.this.f9387J0.m11016o());
            C2451f.this.f9396S0.toggle();
            C2451f c2451f = C2451f.this;
            c2451f.m11082J2(c2451f.f9396S0);
            C2451f.this.m11080H2();
        }
    }

    /* renamed from: A2 */
    private static int m11074A2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C3522d.f14554H);
        int i10 = Month.m11030e().f9322q;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C3522d.f14556J) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(C3522d.f14559M));
    }

    /* renamed from: C2 */
    private int m11075C2(Context context) {
        int i10 = this.f9386I0;
        return i10 != 0 ? i10 : this.f9387J0.m11014k(context);
    }

    /* renamed from: D2 */
    private void m11076D2(Context context) {
        this.f9396S0.setTag(f9381X0);
        this.f9396S0.setImageDrawable(m11091x2(context));
        this.f9396S0.setChecked(this.f9394Q0 != 0);
        C0690v.m3853q0(this.f9396S0, null);
        m11082J2(this.f9396S0);
        this.f9396S0.setOnClickListener(new d());
    }

    /* renamed from: E2 */
    public static boolean m11077E2(Context context) {
        return m11079G2(context, R.attr.windowFullscreen);
    }

    /* renamed from: F2 */
    public static boolean m11078F2(Context context) {
        return m11079G2(context, C3520b.f14536v);
    }

    /* renamed from: G2 */
    static boolean m11079G2(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C4980b.m19402c(context, C3520b.f14533s, C2450e.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    /* renamed from: H2 */
    public void m11080H2() {
        int m11075C2 = m11075C2(m4393z1());
        this.f9390M0 = C2450e.m11062o2(this.f9387J0, m11075C2, this.f9389L0);
        this.f9388K0 = this.f9396S0.isChecked() ? C2453h.m11097Z1(this.f9387J0, m11075C2, this.f9389L0) : this.f9390M0;
        m11081I2();
        AbstractC0819t m4504m = m4381v().m4504m();
        m4504m.m4753o(C3524f.f14645w, this.f9388K0);
        m4504m.mo4561j();
        this.f9388K0.mo11064X1(new c());
    }

    /* renamed from: I2 */
    public void m11081I2() {
        String m11094z2 = m11094z2();
        this.f9395R0.setContentDescription(String.format(m4328Y(C3528j.f14683m), m11094z2));
        this.f9395R0.setText(m11094z2);
    }

    /* renamed from: J2 */
    public void m11082J2(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f9396S0.isChecked()) {
            string = checkableImageButton.getContext().getString(C3528j.f14686p);
        } else {
            string = checkableImageButton.getContext().getString(C3528j.f14688r);
        }
        this.f9396S0.setContentDescription(string);
    }

    /* renamed from: x2 */
    private static Drawable m11091x2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C3121a.m13770d(context, C3523e.f14601b));
        stateListDrawable.addState(new int[0], C3121a.m13770d(context, C3523e.f14602c));
        return stateListDrawable;
    }

    /* renamed from: y2 */
    private static int m11092y2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C3522d.f14562P) + resources.getDimensionPixelOffset(C3522d.f14563Q) + resources.getDimensionPixelOffset(C3522d.f14561O);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C3522d.f14557K);
        int i10 = C2454i.f9407s;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C3522d.f14555I) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(C3522d.f14560N)) + resources.getDimensionPixelOffset(C3522d.f14553G);
    }

    /* renamed from: B2 */
    public final S m11093B2() {
        return this.f9387J0.m11018r();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public final View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f9393P0 ? C3526h.f14669s : C3526h.f14668r, viewGroup);
        Context context = inflate.getContext();
        if (this.f9393P0) {
            inflate.findViewById(C3524f.f14645w).setLayoutParams(new LinearLayout.LayoutParams(m11074A2(context), -2));
        } else {
            View findViewById = inflate.findViewById(C3524f.f14646x);
            View findViewById2 = inflate.findViewById(C3524f.f14645w);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m11074A2(context), -1));
            findViewById2.setMinimumHeight(m11092y2(m4393z1()));
        }
        TextView textView = (TextView) inflate.findViewById(C3524f.f14609C);
        this.f9395R0 = textView;
        C0690v.m3857s0(textView, 1);
        this.f9396S0 = (CheckableImageButton) inflate.findViewById(C3524f.f14610D);
        TextView textView2 = (TextView) inflate.findViewById(C3524f.f14611E);
        CharSequence charSequence = this.f9392O0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f9391N0);
        }
        m11076D2(context);
        this.f9398U0 = (Button) inflate.findViewById(C3524f.f14625c);
        if (this.f9387J0.m11016o()) {
            this.f9398U0.setEnabled(true);
        } else {
            this.f9398U0.setEnabled(false);
        }
        this.f9398U0.setTag(f9379V0);
        this.f9398U0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(C3524f.f14623a);
        button.setTag(f9380W0);
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: V0 */
    public final void mo4322V0(Bundle bundle) {
        super.mo4322V0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f9386I0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9387J0);
        CalendarConstraints.C2442b c2442b = new CalendarConstraints.C2442b(this.f9389L0);
        if (this.f9390M0.m11067k2() != null) {
            c2442b.m11012b(this.f9390M0.m11067k2().f9324s);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2442b.m11011a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f9391N0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f9392O0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        Window window = m4604k2().getWindow();
        if (this.f9393P0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f9397T0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m4307Q().getDimensionPixelOffset(C3522d.f14558L);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f9397T0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC4268a(m4604k2(), rect));
        }
        m11080H2();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        this.f9388K0.m11118Y1();
        super.mo4327X0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c
    /* renamed from: g2 */
    public final Dialog mo4601g2(Bundle bundle) {
        Dialog dialog = new Dialog(m4393z1(), m11075C2(m4393z1()));
        Context context = dialog.getContext();
        this.f9393P0 = m11077E2(context);
        int m19402c = C4980b.m19402c(context, C3520b.f14526l, C2451f.class.getCanonicalName());
        C5888g c5888g = new C5888g(context, null, C3520b.f14533s, C3529k.f14711u);
        this.f9397T0 = c5888g;
        c5888g.m20828M(context);
        this.f9397T0.m20835X(ColorStateList.valueOf(m19402c));
        this.f9397T0.m20834W(C0690v.m3868y(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f9384G0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f9385H0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) m4334b0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public final void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        if (bundle == null) {
            bundle = m4378u();
        }
        this.f9386I0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f9387J0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9389L0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9391N0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f9392O0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f9394Q0 = bundle.getInt("INPUT_MODE_KEY");
    }

    /* renamed from: z2 */
    public String m11094z2() {
        return this.f9387J0.m11013i(m4384w());
    }
}
