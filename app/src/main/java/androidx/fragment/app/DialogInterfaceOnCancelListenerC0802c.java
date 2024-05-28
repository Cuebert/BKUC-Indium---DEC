package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0833a0;
import androidx.lifecycle.C0835b0;
import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0852s;
import androidx.savedstate.C0929d;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0802c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0 */
    private boolean f3999A0;

    /* renamed from: B0 */
    private boolean f4000B0;

    /* renamed from: C0 */
    private boolean f4001C0;

    /* renamed from: o0 */
    private Handler f4003o0;

    /* renamed from: x0 */
    private boolean f4012x0;

    /* renamed from: z0 */
    private Dialog f4014z0;

    /* renamed from: p0 */
    private Runnable f4004p0 = new a();

    /* renamed from: q0 */
    private DialogInterface.OnCancelListener f4005q0 = new b();

    /* renamed from: r0 */
    private DialogInterface.OnDismissListener f4006r0 = new c();

    /* renamed from: s0 */
    private int f4007s0 = 0;

    /* renamed from: t0 */
    private int f4008t0 = 0;

    /* renamed from: u0 */
    private boolean f4009u0 = true;

    /* renamed from: v0 */
    private boolean f4010v0 = true;

    /* renamed from: w0 */
    private int f4011w0 = -1;

    /* renamed from: y0 */
    private InterfaceC0852s<InterfaceC0845l> f4013y0 = new d();

    /* renamed from: D0 */
    private boolean f4002D0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogInterfaceOnCancelListenerC0802c.this.f4006r0.onDismiss(DialogInterfaceOnCancelListenerC0802c.this.f4014z0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$b */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0802c.this.f4014z0 != null) {
                DialogInterfaceOnCancelListenerC0802c dialogInterfaceOnCancelListenerC0802c = DialogInterfaceOnCancelListenerC0802c.this;
                dialogInterfaceOnCancelListenerC0802c.onCancel(dialogInterfaceOnCancelListenerC0802c.f4014z0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$c */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0802c.this.f4014z0 != null) {
                DialogInterfaceOnCancelListenerC0802c dialogInterfaceOnCancelListenerC0802c = DialogInterfaceOnCancelListenerC0802c.this;
                dialogInterfaceOnCancelListenerC0802c.onDismiss(dialogInterfaceOnCancelListenerC0802c.f4014z0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC0852s<InterfaceC0845l> {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC0852s
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo1522a(InterfaceC0845l interfaceC0845l) {
            if (interfaceC0845l == null || !DialogInterfaceOnCancelListenerC0802c.this.f4010v0) {
                return;
            }
            View m4265A1 = DialogInterfaceOnCancelListenerC0802c.this.m4265A1();
            if (m4265A1.getParent() == null) {
                if (DialogInterfaceOnCancelListenerC0802c.this.f4014z0 != null) {
                    if (FragmentManager.m4403H0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC0802c.this.f4014z0);
                    }
                    DialogInterfaceOnCancelListenerC0802c.this.f4014z0.setContentView(m4265A1);
                    return;
                }
                return;
            }
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    /* loaded from: classes.dex */
    class e extends AbstractC0805f {

        /* renamed from: a */
        final /* synthetic */ AbstractC0805f f4019a;

        e(AbstractC0805f abstractC0805f) {
            this.f4019a = abstractC0805f;
        }

        @Override // androidx.fragment.app.AbstractC0805f
        /* renamed from: c */
        public View mo4397c(int i10) {
            if (this.f4019a.mo4398d()) {
                return this.f4019a.mo4397c(i10);
            }
            return DialogInterfaceOnCancelListenerC0802c.this.m4602h2(i10);
        }

        @Override // androidx.fragment.app.AbstractC0805f
        /* renamed from: d */
        public boolean mo4398d() {
            return this.f4019a.mo4398d() || DialogInterfaceOnCancelListenerC0802c.this.m4603i2();
        }
    }

    /* renamed from: c2 */
    private void m4594c2(boolean z10, boolean z11) {
        if (this.f4000B0) {
            return;
        }
        this.f4000B0 = true;
        this.f4001C0 = false;
        Dialog dialog = this.f4014z0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4014z0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f4003o0.getLooper()) {
                    onDismiss(this.f4014z0);
                } else {
                    this.f4003o0.post(this.f4004p0);
                }
            }
        }
        this.f3999A0 = true;
        if (this.f4011w0 >= 0) {
            m4289K().m4478X0(this.f4011w0, 1);
            this.f4011w0 = -1;
            return;
        }
        AbstractC0819t m4504m = m4289K().m4504m();
        m4504m.mo4564n(this);
        if (z10) {
            m4504m.mo4560i();
        } else {
            m4504m.mo4559h();
        }
    }

    /* renamed from: j2 */
    private void m4595j2(Bundle bundle) {
        if (this.f4010v0 && !this.f4002D0) {
            try {
                this.f4012x0 = true;
                Dialog mo4601g2 = mo4601g2(bundle);
                this.f4014z0 = mo4601g2;
                if (this.f4010v0) {
                    m4607n2(mo4601g2, this.f4007s0);
                    Context m4384w = m4384w();
                    if (m4384w instanceof Activity) {
                        this.f4014z0.setOwnerActivity((Activity) m4384w);
                    }
                    this.f4014z0.setCancelable(this.f4009u0);
                    this.f4014z0.setOnCancelListener(this.f4005q0);
                    this.f4014z0.setOnDismissListener(this.f4006r0);
                    this.f4002D0 = true;
                } else {
                    this.f4014z0 = null;
                }
            } finally {
                this.f4012x0 = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: G0 */
    public void mo4280G0() {
        super.mo4280G0();
        Dialog dialog = this.f4014z0;
        if (dialog != null) {
            this.f3999A0 = true;
            dialog.setOnDismissListener(null);
            this.f4014z0.dismiss();
            if (!this.f4000B0) {
                onDismiss(this.f4014z0);
            }
            this.f4014z0 = null;
            this.f4002D0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public void mo267H0() {
        super.mo267H0();
        if (!this.f4001C0 && !this.f4000B0) {
            this.f4000B0 = true;
        }
        m4336c0().mo4866n(this.f4013y0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: I0 */
    public LayoutInflater mo4284I0(Bundle bundle) {
        LayoutInflater mo4284I0 = super.mo4284I0(bundle);
        if (this.f4010v0 && !this.f4012x0) {
            m4595j2(bundle);
            if (FragmentManager.m4403H0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4014z0;
            return dialog != null ? mo4284I0.cloneInContext(dialog.getContext()) : mo4284I0;
        }
        if (FragmentManager.m4403H0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f4010v0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            } else {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            }
        }
        return mo4284I0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: V0 */
    public void mo4322V0(Bundle bundle) {
        super.mo4322V0(bundle);
        Dialog dialog = this.f4014z0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f4007s0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f4008t0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f4009u0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f4010v0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f4011w0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        Dialog dialog = this.f4014z0;
        if (dialog != null) {
            this.f3999A0 = false;
            dialog.show();
            View decorView = this.f4014z0.getWindow().getDecorView();
            C0833a0.m4885a(decorView, this);
            C0835b0.m4886a(decorView, this);
            C0929d.m5901a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        super.mo4327X0();
        Dialog dialog = this.f4014z0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Z0 */
    public void mo4331Z0(Bundle bundle) {
        Bundle bundle2;
        super.mo4331Z0(bundle);
        if (this.f4014z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4014z0.onRestoreInstanceState(bundle2);
    }

    /* renamed from: a2 */
    public void m4596a2() {
        m4594c2(false, false);
    }

    /* renamed from: b2 */
    public void m4597b2() {
        m4594c2(true, false);
    }

    /* renamed from: d2 */
    public Dialog m4598d2() {
        return this.f4014z0;
    }

    /* renamed from: e2 */
    public boolean m4599e2() {
        return this.f4010v0;
    }

    /* renamed from: f2 */
    public int m4600f2() {
        return this.f4008t0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g1 */
    public void mo4343g1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo4343g1(layoutInflater, viewGroup, bundle);
        if (this.f3802U != null || this.f4014z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4014z0.onRestoreInstanceState(bundle2);
    }

    /* renamed from: g2 */
    public Dialog mo4601g2(Bundle bundle) {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m4393z1(), m4600f2());
    }

    /* renamed from: h2 */
    View m4602h2(int i10) {
        Dialog dialog = this.f4014z0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: i */
    public AbstractC0805f mo4347i() {
        return new e(super.mo4347i());
    }

    /* renamed from: i2 */
    boolean m4603i2() {
        return this.f4002D0;
    }

    /* renamed from: k2 */
    public final Dialog m4604k2() {
        Dialog m4598d2 = m4598d2();
        if (m4598d2 != null) {
            return m4598d2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: l2 */
    public void m4605l2(boolean z10) {
        this.f4010v0 = z10;
    }

    /* renamed from: m2 */
    public void m4606m2(int i10, int i11) {
        if (FragmentManager.m4403H0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i10 + ", " + i11);
        }
        this.f4007s0 = i10;
        if (i10 == 2 || i10 == 3) {
            this.f4008t0 = R.style.Theme.Panel;
        }
        if (i11 != 0) {
            this.f4008t0 = i11;
        }
    }

    /* renamed from: n2 */
    public void m4607n2(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: o2 */
    public void mo4608o2(FragmentManager fragmentManager, String str) {
        this.f4000B0 = false;
        this.f4001C0 = true;
        AbstractC0819t m4504m = fragmentManager.m4504m();
        m4504m.m4749e(this, str);
        m4504m.mo4559h();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f3999A0) {
            return;
        }
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m4594c2(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo269w0(Context context) {
        super.mo269w0(context);
        m4336c0().m4862j(this.f4013y0);
        if (this.f4001C0) {
            return;
        }
        this.f4000B0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        this.f4003o0 = new Handler();
        this.f4010v0 = this.f3792K == 0;
        if (bundle != null) {
            this.f4007s0 = bundle.getInt("android:style", 0);
            this.f4008t0 = bundle.getInt("android:theme", 0);
            this.f4009u0 = bundle.getBoolean("android:cancelable", true);
            this.f4010v0 = bundle.getBoolean("android:showsDialog", this.f4010v0);
            this.f4011w0 = bundle.getInt("android:backStackId", -1);
        }
    }
}
