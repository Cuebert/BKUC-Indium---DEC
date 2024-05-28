package com.roblox.client.login.mvp;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2817d1;
import com.roblox.client.C2822f0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2915y;
import com.roblox.client.components.InterfaceC2804e;
import com.roblox.client.components.RbxButton;
import com.roblox.client.components.RbxEditText;
import com.roblox.client.components.RbxProgressButton;
import com.roblox.client.components.RbxTextView;
import p035c9.C1151k;
import p250t7.C4736a;
import p326z7.C6020g;

/* renamed from: com.roblox.client.login.mvp.a */
/* loaded from: classes.dex */
public class C2862a extends C6020g {

    /* renamed from: R0 */
    private EditText f11363R0;

    /* renamed from: S0 */
    private EditText f11364S0;

    /* renamed from: T0 */
    protected RbxEditText f11365T0;

    /* renamed from: U0 */
    private RbxEditText f11366U0;

    /* renamed from: V0 */
    private RbxTextView f11367V0;

    /* renamed from: W0 */
    private RbxTextView f11368W0;

    /* renamed from: X0 */
    private RbxProgressButton f11369X0;

    /* renamed from: Y0 */
    private RbxButton f11370Y0;

    /* renamed from: Z0 */
    private RbxButton f11371Z0;

    /* renamed from: a1 */
    private RbxButton f11372a1;

    /* renamed from: b1 */
    private View f11373b1;

    /* renamed from: c1 */
    protected m f11374c1;

    /* renamed from: d1 */
    private boolean f11375d1;

    /* renamed from: e1 */
    private boolean f11376e1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.login.mvp.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Context f11377n;

        a(Context context) {
            this.f11377n = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2822f0.m12481c("login", "submit");
            String obj = C2862a.this.f11363R0.getText().toString();
            if (obj.isEmpty()) {
                C2862a.this.f11365T0.mo12338w(C4736a.m18881c(this.f11377n, C2748c0.f10586U, new Object[0]));
                C2862a.this.f11375d1 = true;
            } else {
                C2862a.this.f11365T0.m12335r();
            }
            String obj2 = C2862a.this.f11364S0.getText().toString();
            if (obj2.isEmpty()) {
                C2862a.this.f11366U0.mo12338w(C4736a.m18881c(this.f11377n, C2748c0.f10581T, new Object[0]));
                C2862a.this.f11376e1 = true;
                C2862a.this.f11364S0.requestFocus();
                C2817d1.m12477p(C2862a.this.f11373b1, C2862a.this.f11364S0);
            } else {
                C2862a.this.f11366U0.m12335r();
            }
            if (!obj.isEmpty() && !obj2.isEmpty()) {
                C2862a c2862a = C2862a.this;
                if (c2862a.f11374c1 != null) {
                    c2862a.m12786O2(obj, obj2);
                    return;
                }
                return;
            }
            C2862a.this.m12784X2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.login.mvp.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2862a.this.f11363R0.setText(BuildConfig.FLAVOR);
            C2862a.this.f11363R0.requestFocus();
            C2817d1.m12477p(C2862a.this.f11373b1, C2862a.this.f11363R0);
        }
    }

    /* renamed from: com.roblox.client.login.mvp.a$c */
    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2862a.this.f11364S0.setText(BuildConfig.FLAVOR);
            C2862a.this.f11364S0.requestFocus();
            C2817d1.m12477p(C2862a.this.f11373b1, C2862a.this.f11364S0);
        }
    }

    /* renamed from: com.roblox.client.login.mvp.a$d */
    /* loaded from: classes.dex */
    class d implements TextView.OnEditorActionListener {
        d() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 2 && i10 != 6) {
                return false;
            }
            C2862a.this.m12781Q2();
            return true;
        }
    }

    /* renamed from: com.roblox.client.login.mvp.a$e */
    /* loaded from: classes.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2862a.this.f11374c1.mo12724c();
        }
    }

    /* renamed from: com.roblox.client.login.mvp.a$f */
    /* loaded from: classes.dex */
    class f implements InterfaceC2804e {
        f() {
        }

        @Override // com.roblox.client.components.InterfaceC2804e
        public void onClick(View view) {
            C2862a.this.m12781Q2();
        }
    }

    /* renamed from: com.roblox.client.login.mvp.a$g */
    /* loaded from: classes.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2817d1.m12471j(C2862a.this.m4384w(), view);
            C2862a.this.f11374c1.mo12725c0();
        }
    }

    /* renamed from: com.roblox.client.login.mvp.a$h */
    /* loaded from: classes.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2862a.this.f11374c1.mo12723b0();
        }
    }

    /* renamed from: com.roblox.client.login.mvp.a$i */
    /* loaded from: classes.dex */
    class i implements View.OnFocusChangeListener {
        i() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            C2862a.this.m12782R2("username", z10);
        }
    }

    /* renamed from: com.roblox.client.login.mvp.a$j */
    /* loaded from: classes.dex */
    class j implements View.OnFocusChangeListener {
        j() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            C2862a.this.m12782R2("password", z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.login.mvp.a$k */
    /* loaded from: classes.dex */
    public class k implements TextWatcher {
        k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C2862a.this.f11375d1) {
                C2862a.this.f11375d1 = false;
                C2862a.this.f11365T0.m12335r();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.login.mvp.a$l */
    /* loaded from: classes.dex */
    public class l implements TextWatcher {
        l() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C2862a.this.f11376e1) {
                C2862a.this.f11376e1 = false;
                C2862a.this.f11366U0.m12335r();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: com.roblox.client.login.mvp.a$m */
    /* loaded from: classes.dex */
    public interface m {
        /* renamed from: A */
        void mo12707A(String str, String str2);

        /* renamed from: b0 */
        void mo12723b0();

        /* renamed from: c */
        void mo12724c();

        /* renamed from: c0 */
        void mo12725c0();

        /* renamed from: t */
        void mo12731t();
    }

    /* renamed from: M2 */
    private void m12778M2() {
        new Handler(Looper.getMainLooper()).postDelayed(new b(), 100L);
    }

    /* renamed from: N2 */
    private void m12779N2() {
        this.f11365T0.m12334q();
        this.f11366U0.m12334q();
        this.f11370Y0.m12308b();
        this.f11371Z0.m12308b();
        this.f11372a1.m12308b();
    }

    /* renamed from: P2 */
    public static C2862a m12780P2() {
        return new C2862a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q2 */
    public void m12781Q2() {
        C1151k.m6712f("rbx.authlogin", "onLoginButtonClick: ENTER");
        Context m4384w = m4384w();
        if (m12821q2() || m4384w == null) {
            return;
        }
        this.f11363R0.clearFocus();
        this.f11364S0.clearFocus();
        this.f11369X0.m12391z(RbxProgressButton.EnumC2789j.SHOW_PROGRESS, C4736a.m18881c(m4384w, C2748c0.f10644e3, new Object[0]));
        C2817d1.m12472k(this.f11373b1);
        m12779N2();
        new Handler(Looper.getMainLooper()).postDelayed(new a(m4384w), 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R2 */
    public void m12782R2(String str, boolean z10) {
        C2822f0.m12487i("login", str, z10 ? "focus" : "offFocus");
    }

    /* renamed from: S2 */
    private void m12783S2() {
        this.f11363R0.addTextChangedListener(new k());
        this.f11364S0.addTextChangedListener(new l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X2 */
    public void m12784X2() {
        this.f11369X0.m12391z(RbxProgressButton.EnumC2789j.SHOW_BUTTON, C4736a.m18881c(m4384w(), C2748c0.f10760y, new Object[0]));
        this.f11365T0.m12330D();
        this.f11366U0.m12330D();
        this.f11370Y0.m12309c();
        this.f11371Z0.m12309c();
        this.f11372a1.m12309c();
    }

    @Override // p326z7.C6020g, androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context m4384w = m4384w();
        int i10 = C2877p0.m12933l0() ? C2738a0.f10426q : C2738a0.f10427r;
        View inflate = layoutInflater.inflate(C2738a0.f10428s, viewGroup, false);
        layoutInflater.inflate(C2738a0.f10425p, (LinearLayout) layoutInflater.inflate(i10, (LinearLayout) inflate.findViewById(C2915y.f11815M)).findViewById(C2915y.f11804I));
        ((LinearLayout) inflate.findViewById(C2915y.f11789D)).setOnClickListener(null);
        this.f11370Y0 = (RbxButton) inflate.findViewById(C2915y.f11792E);
        RbxTextView rbxTextView = (RbxTextView) inflate.findViewById(C2915y.f11810K);
        this.f11368W0 = rbxTextView;
        rbxTextView.setText(C4736a.m18881c(m4384w, C2748c0.f10516G, new Object[0]));
        this.f11370Y0.setText(C4736a.m18881c(m4384w, C2748c0.f10736u, new Object[0]));
        this.f11367V0 = (RbxTextView) inflate.findViewById(C2915y.f11807J);
        RbxEditText rbxEditText = (RbxEditText) inflate.findViewById(C2915y.f11817N);
        this.f11365T0 = rbxEditText;
        EditText textBox = rbxEditText.getTextBox();
        this.f11363R0 = textBox;
        textBox.setId(C2915y.f11788C1);
        this.f11365T0.getBottomLabel().setId(C2915y.f11785B1);
        this.f11373b1 = inflate;
        RbxEditText rbxEditText2 = (RbxEditText) inflate.findViewById(C2915y.f11813L);
        this.f11366U0 = rbxEditText2;
        EditText textBox2 = rbxEditText2.getTextBox();
        this.f11364S0 = textBox2;
        textBox2.setId(C2915y.f11782A1);
        this.f11366U0.getBottomLabel().setId(C2915y.f11920z1);
        this.f11364S0.setImeOptions(6);
        this.f11364S0.setOnEditorActionListener(new d());
        this.f11370Y0.setOnClickListener(new e());
        RbxProgressButton rbxProgressButton = (RbxProgressButton) inflate.findViewById(C2915y.f11798G);
        this.f11369X0 = rbxProgressButton;
        rbxProgressButton.setOnRbxClickedListener(new f());
        this.f11371Z0 = (RbxButton) inflate.findViewById(C2915y.f11801H);
        this.f11367V0.setText(C4736a.m18881c(m4384w, C2748c0.f10511F, new Object[0]));
        this.f11369X0.setText(C4736a.m18881c(m4384w, C2748c0.f10760y, new Object[0]));
        this.f11370Y0.setContentDescription(C4736a.m18881c(m4384w, C2748c0.f10489B, new Object[0]));
        this.f11369X0.setContentDescription(C4736a.m18881c(m4384w, C2748c0.f10495C, new Object[0]));
        this.f11366U0.setContentDescription(C4736a.m18881c(m4384w, C2748c0.f10501D, new Object[0]));
        this.f11366U0.setHintText(C4736a.m18881c(m4384w, C2748c0.f10521H, new Object[0]));
        this.f11365T0.setContentDescription(C4736a.m18881c(m4384w, C2748c0.f10506E, new Object[0]));
        this.f11365T0.setHintText(C4736a.m18881c(m4384w, C2748c0.f10526I, new Object[0]));
        this.f11371Z0.setText(C4736a.m18881c(m4384w, C2748c0.f10483A, new Object[0]));
        this.f11363R0.setInputType(32);
        this.f11365T0.setHintText(C4736a.m18881c(m4384w, C2748c0.f10531J, new Object[0]));
        this.f11363R0.setImeOptions(5);
        this.f11371Z0.setOnClickListener(new g());
        RbxButton rbxButton = (RbxButton) inflate.findViewById(C2915y.f11795F);
        this.f11372a1 = rbxButton;
        rbxButton.setText(C4736a.m18881c(m4384w, C2748c0.f10754x, new Object[0]));
        this.f11372a1.setOnClickListener(new h());
        this.f11363R0.setOnFocusChangeListener(new i());
        this.f11364S0.setOnFocusChangeListener(new j());
        m12783S2();
        if (bundle == null) {
            this.f11374c1.mo12731t();
        }
        return inflate;
    }

    @Override // p326z7.C6020g, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public void mo267H0() {
        super.mo267H0();
        C1151k.m6712f("rbx.authlogin", "onDetach()");
        this.f11374c1 = null;
    }

    /* renamed from: L2 */
    public void m12785L2() {
        new Handler(Looper.getMainLooper()).postDelayed(new c(), 100L);
    }

    /* renamed from: O2 */
    protected void m12786O2(String str, String str2) {
        this.f11374c1.mo12707A(str, str2);
    }

    /* renamed from: T2 */
    public void m12787T2() {
        this.f11363R0.setInputType(524289);
        this.f11363R0.setHint(C4736a.m18881c(m4384w(), C2748c0.f10526I, new Object[0]));
        m12778M2();
    }

    /* renamed from: U2 */
    public void m12788U2(String str, String str2) {
        this.f11363R0.setText(str);
        this.f11364S0.setText(str2);
    }

    /* renamed from: V2 */
    public void m12789V2(String str) {
        if (TextUtils.isEmpty(this.f11363R0.getText().toString())) {
            this.f11363R0.setText(str);
        }
    }

    @Override // p326z7.C6020g, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        C2822f0.m12498t("login");
    }

    /* renamed from: W2 */
    public void m12790W2() {
        this.f11369X0.m12389x(RbxProgressButton.EnumC2789j.SHOW_BUTTON);
        m12784X2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p326z7.C6020g, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo269w0(Context context) {
        super.mo269w0(context);
        C1151k.m6712f("rbx.authlogin", "onAttach()");
        if (context instanceof m) {
            this.f11374c1 = (m) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // p326z7.C6020g, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        if (!C2877p0.m12933l0()) {
            m4606m2(1, m4600f2());
        } else {
            m4606m2(0, R.style.Theme.Black.NoTitleBar.Fullscreen);
        }
    }
}
