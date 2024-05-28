package p010a9;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2817d1;
import com.roblox.client.C2822f0;
import com.roblox.client.C2871m0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2913x;
import com.roblox.client.C2915y;
import com.roblox.client.components.InterfaceC2804e;
import com.roblox.client.components.RbxEditText;
import com.roblox.client.components.RbxProgressButton;
import p010a9.C0061b;
import p035c9.C1151k;
import p049d9.C3025b;
import p049d9.C3027d;
import p100h7.C3415h;
import p250t7.C4736a;
import p300x7.C5563e;

/* renamed from: a9.a */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0060a extends C2871m0 implements View.OnClickListener {

    /* renamed from: Q0 */
    protected String f213Q0;

    /* renamed from: R0 */
    protected String f214R0;

    /* renamed from: S0 */
    protected String f215S0;

    /* renamed from: T0 */
    protected CheckBox f216T0;

    /* renamed from: U0 */
    protected EditText f217U0;

    /* renamed from: V0 */
    protected e f218V0;

    /* renamed from: W0 */
    private RbxEditText f219W0;

    /* renamed from: X0 */
    private TextView f220X0;

    /* renamed from: Y0 */
    private TextView f221Y0;

    /* renamed from: Z0 */
    private RbxProgressButton f222Z0;

    /* renamed from: a1 */
    private C0061b f223a1;

    /* renamed from: b1 */
    private View.OnTouchListener f224b1 = new a();

    /* renamed from: c1 */
    C0061b.c f225c1 = new d();

    /* renamed from: a9.a$a */
    /* loaded from: classes.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: a9.a$b */
    /* loaded from: classes.dex */
    class b implements TextView.OnEditorActionListener {
        b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 2 && i10 != 6) {
                return false;
            }
            ViewOnClickListenerC0060a.this.m263C2();
            return true;
        }
    }

    /* renamed from: a9.a$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC2804e {
        c() {
        }

        @Override // com.roblox.client.components.InterfaceC2804e
        public void onClick(View view) {
            ViewOnClickListenerC0060a.this.m263C2();
        }
    }

    /* renamed from: a9.a$d */
    /* loaded from: classes.dex */
    class d implements C0061b.c {
        d() {
        }

        /* renamed from: d */
        private String m271d(int i10) {
            C1151k.m6712f("Fragment2SV", "ErrorCode = " + i10);
            Context m4384w = ViewOnClickListenerC0060a.this.m4384w();
            switch (i10) {
                case -1005:
                    return C4736a.m18881c(m4384w, C2748c0.f10486A2, new Object[0]);
                case -1004:
                    return C4736a.m18881c(m4384w, C2748c0.f10757x2, new Object[0]);
                case -1003:
                    return C4736a.m18881c(m4384w, C2748c0.f10745v2, new Object[0]);
                case -1002:
                    return C4736a.m18881c(m4384w, C2748c0.f10504D2, new Object[0]);
                case -1001:
                    return C4736a.m18881c(m4384w, C2748c0.f10498C2, new Object[0]);
                case -1000:
                    return C4736a.m18881c(m4384w, C2748c0.f10769z2, new Object[0]);
                default:
                    return C4736a.m18881c(m4384w, C2748c0.f10769z2, new Object[0]);
            }
        }

        @Override // p010a9.C0061b.c
        /* renamed from: a */
        public void mo272a() {
            ViewOnClickListenerC0060a viewOnClickListenerC0060a = ViewOnClickListenerC0060a.this;
            viewOnClickListenerC0060a.m265D2(true, C4736a.m18881c(viewOnClickListenerC0060a.m4384w(), C2748c0.f10763y2, new Object[0]));
        }

        @Override // p010a9.C0061b.c
        /* renamed from: b */
        public void mo273b(int i10) {
            ViewOnClickListenerC0060a.this.m12822r2(m271d(i10));
            ViewOnClickListenerC0060a.this.m265D2(false, BuildConfig.FLAVOR);
        }

        @Override // p010a9.C0061b.c
        /* renamed from: c */
        public void mo274c(String str, String str2) {
            ViewOnClickListenerC0060a viewOnClickListenerC0060a = ViewOnClickListenerC0060a.this;
            viewOnClickListenerC0060a.f213Q0 = str;
            viewOnClickListenerC0060a.f214R0 = str2;
            viewOnClickListenerC0060a.m12829y2(C4736a.m18881c(viewOnClickListenerC0060a.m4384w(), C2748c0.f10751w2, new Object[0]), 0);
            ViewOnClickListenerC0060a.this.m265D2(false, BuildConfig.FLAVOR);
        }

        @Override // p010a9.C0061b.c
        /* renamed from: e */
        public void mo275e(long j10) {
            e eVar = ViewOnClickListenerC0060a.this.f218V0;
            if (eVar != null) {
                eVar.mo276e(j10);
            }
        }
    }

    /* renamed from: a9.a$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: e */
        void mo276e(long j10);
    }

    /* renamed from: B2 */
    public static ViewOnClickListenerC0060a m260B2(String str, String str2, String str3) {
        ViewOnClickListenerC0060a viewOnClickListenerC0060a = new ViewOnClickListenerC0060a();
        Bundle bundle = new Bundle();
        bundle.putString("nonce", str);
        bundle.putString("mediaType", str2);
        bundle.putString("username", str3);
        viewOnClickListenerC0060a.m4282H1(bundle);
        return viewOnClickListenerC0060a;
    }

    /* renamed from: z2 */
    private void m261z2() {
        m266E2(true);
        this.f217U0.setText(BuildConfig.FLAVOR);
        this.f223a1.m278a(this.f215S0, this.f213Q0, this.f225c1);
    }

    /* renamed from: A2 */
    protected boolean m262A2(String str) {
        return !TextUtils.isEmpty(str.trim());
    }

    /* renamed from: C2 */
    protected void m263C2() {
        m266E2(false);
        Editable text = this.f217U0.getText();
        if (text != null && m262A2(text.toString())) {
            this.f223a1.m279b(this.f215S0, text.toString(), this.f213Q0, this.f216T0.isChecked(), this.f225c1);
        } else {
            this.f217U0.setText(BuildConfig.FLAVOR);
            m265D2(true, C4736a.m18881c(m4384w(), C2748c0.f10492B2, new Object[0]));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2738a0.f10421l, viewGroup, false);
        RbxEditText rbxEditText = (RbxEditText) inflate.findViewById(C2915y.f11915y);
        this.f219W0 = rbxEditText;
        EditText textBox = rbxEditText.getTextBox();
        this.f217U0 = textBox;
        textBox.setOnEditorActionListener(new b());
        this.f220X0 = (TextView) inflate.findViewById(C2915y.f11884n1);
        this.f221Y0 = (TextView) inflate.findViewById(C2915y.f11887o1);
        this.f222Z0 = (RbxProgressButton) inflate.findViewById(C2915y.f11861g);
        this.f216T0 = (CheckBox) inflate.findViewById(C2915y.f11867i);
        TextView textView = (TextView) inflate.findViewById(C2915y.f11881m1);
        TextView textView2 = (TextView) inflate.findViewById(C2915y.f11890p1);
        ImageView imageView = (ImageView) inflate.findViewById(C2915y.f11865h0);
        Context m4384w = m4384w();
        String m18881c = C4736a.m18881c(m4384w, C2748c0.f10722r3, new Object[0]);
        this.f220X0.setText(C4736a.m18881c(m4384w, C2748c0.f10697n2, new Object[0]));
        this.f222Z0.setText(C4736a.m18881c(m4384w, C2748c0.f10703o2, new Object[0]));
        this.f219W0.setHintText(C4736a.m18881c(m4384w, C2748c0.f10709p2, new Object[0]));
        textView.setText(C4736a.m18881c(m4384w, C2748c0.f10715q2, new Object[0]));
        this.f216T0.setText(C4736a.m18881c(m4384w, C2748c0.f10733t2, new Object[0]));
        int i10 = C2748c0.f10739u2;
        textView2.setText(C4736a.m18881c(m4384w, i10, new Object[0]));
        imageView.setContentDescription(C4736a.m18881c(m4384w, i10, new Object[0]));
        this.f222Z0.setContentDescription(C4736a.m18881c(m4384w, i10, new Object[0]));
        String m18881c2 = C4736a.m18881c(m4384w, C2748c0.f10727s2, m18881c);
        int indexOf = m18881c2.indexOf(m18881c);
        C3025b.m13495e(this.f221Y0, m18881c2, new C3027d(C2877p0.m12950u(), m4363p(), m18881c, indexOf, indexOf + m18881c.length()));
        if ("Sms".equals(this.f214R0)) {
            imageView.setImageResource(C2913x.f11751X);
            textView.setText(C4736a.m18881c(m4384w, C2748c0.f10721r2, new Object[0]));
        }
        this.f220X0.setOnClickListener(this);
        this.f217U0.requestFocus();
        this.f222Z0.setOnRbxClickedListener(new c());
        return inflate;
    }

    /* renamed from: D2 */
    protected void m265D2(boolean z10, String str) {
        if (z10) {
            this.f219W0.mo12338w(str);
        }
        this.f222Z0.m12391z(RbxProgressButton.EnumC2789j.SHOW_BUTTON, C4736a.m18881c(m4384w(), C2748c0.f10703o2, new Object[0]));
        this.f220X0.setOnTouchListener(null);
        this.f221Y0.setOnTouchListener(null);
        this.f217U0.setEnabled(true);
    }

    /* renamed from: E2 */
    protected void m266E2(boolean z10) {
        if (!z10) {
            this.f222Z0.m12390y(RbxProgressButton.EnumC2789j.SHOW_PROGRESS, C2748c0.f10644e3);
        }
        this.f219W0.m12335r();
        this.f217U0.clearFocus();
        this.f220X0.setOnTouchListener(this.f224b1);
        this.f221Y0.setOnTouchListener(this.f224b1);
        this.f217U0.setEnabled(false);
        C2817d1.m12472k(this.f217U0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public void mo267H0() {
        super.mo267H0();
        C1151k.m6712f("Fragment2SV", "onDetach()");
        this.f218V0 = null;
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        C2822f0.m12498t("twoStepVerification");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C2915y.f11884n1) {
            m261z2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo269w0(Context context) {
        super.mo269w0(context);
        C1151k.m6712f("Fragment2SV", "onAttach()");
        if (context instanceof e) {
            this.f218V0 = (e) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener.");
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        if (m4378u() != null) {
            this.f213Q0 = m4378u().getString("nonce");
            this.f214R0 = m4378u().getString("mediaType");
            this.f215S0 = m4378u().getString("username");
            this.f223a1 = new C0061b(C5563e.m20379h(), new C3415h());
        }
    }
}
