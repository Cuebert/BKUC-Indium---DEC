package com.roblox.client.signup;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0152b;
import androidx.fragment.app.ActivityC0803d;
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
import com.roblox.client.components.InterfaceC2805f;
import com.roblox.client.components.InterfaceC2806g;
import com.roblox.client.components.RbxBirthdayPicker;
import com.roblox.client.components.RbxButton;
import com.roblox.client.components.RbxEditText;
import com.roblox.client.components.RbxGenderPicker;
import com.roblox.client.components.RbxLoadingEditText;
import com.roblox.client.components.RbxProgressButton;
import com.roblox.client.components.RbxTextView;
import com.roblox.client.signup.AbstractAsyncTaskC2900d;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1146f;
import p035c9.C1151k;
import p035c9.C1157q;
import p049d9.C3025b;
import p100h7.C3415h;
import p100h7.C3417j;
import p250t7.C4736a;
import p251t8.AbstractC4739c;
import p251t8.AbstractC4740d;
import p251t8.C4737a;
import p251t8.C4738b;
import p300x7.C5563e;
import p300x7.C5565g;

/* renamed from: com.roblox.client.signup.a */
/* loaded from: classes.dex */
public class C2897a extends C2871m0 {

    /* renamed from: F1 */
    private static x f11519F1 = new k();

    /* renamed from: A1 */
    private String f11520A1;

    /* renamed from: B1 */
    private String f11521B1;

    /* renamed from: C1 */
    private String f11522C1;

    /* renamed from: D1 */
    private String f11523D1;

    /* renamed from: E1 */
    private AbstractAsyncTaskC2900d.a f11524E1;

    /* renamed from: W0 */
    private RbxTextView f11531W0;

    /* renamed from: X0 */
    private RbxTextView f11532X0;

    /* renamed from: d1 */
    private C2901e f11538d1;

    /* renamed from: e1 */
    private C5563e f11539e1;

    /* renamed from: n1 */
    private a0 f11548n1;

    /* renamed from: o1 */
    private a0 f11549o1;

    /* renamed from: p1 */
    private a0 f11550p1;

    /* renamed from: q1 */
    private a0 f11551q1;

    /* renamed from: r1 */
    private a0 f11552r1;

    /* renamed from: s1 */
    private View f11553s1;

    /* renamed from: t1 */
    private long f11554t1;

    /* renamed from: u1 */
    x f11555u1;

    /* renamed from: v1 */
    private final int f11556v1;

    /* renamed from: w1 */
    private final int f11557w1;

    /* renamed from: x1 */
    private b0 f11558x1;

    /* renamed from: y1 */
    private w f11559y1;

    /* renamed from: z1 */
    private String f11560z1;

    /* renamed from: Q0 */
    private RbxButton f11525Q0 = null;

    /* renamed from: R0 */
    private UsernameSignUpEditText f11526R0 = null;

    /* renamed from: S0 */
    private EditText f11527S0 = null;

    /* renamed from: T0 */
    private RbxProgressButton f11528T0 = null;

    /* renamed from: U0 */
    private TextView f11529U0 = null;

    /* renamed from: V0 */
    private RbxButton f11530V0 = null;

    /* renamed from: Y0 */
    EditText f11533Y0 = null;

    /* renamed from: Z0 */
    RbxEditText f11534Z0 = null;

    /* renamed from: a1 */
    RbxLoadingEditText f11535a1 = null;

    /* renamed from: b1 */
    RbxGenderPicker f11536b1 = null;

    /* renamed from: c1 */
    RbxBirthdayPicker f11537c1 = null;

    /* renamed from: f1 */
    private String f11540f1 = null;

    /* renamed from: g1 */
    private String f11541g1 = null;

    /* renamed from: h1 */
    private String f11542h1 = null;

    /* renamed from: i1 */
    private int f11543i1 = -1;

    /* renamed from: j1 */
    private int f11544j1 = -1;

    /* renamed from: k1 */
    private int f11545k1 = -1;

    /* renamed from: l1 */
    private int f11546l1 = 0;

    /* renamed from: m1 */
    private boolean f11547m1 = false;

    /* renamed from: com.roblox.client.signup.a$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC2805f {
        a() {
        }

        @Override // com.roblox.client.components.InterfaceC2805f
        /* renamed from: a */
        public void mo12420a(int i10, int i11) {
            boolean m13120v3 = C2897a.this.m13120v3();
            if (i10 == 0) {
                C2897a.this.f11545k1 = i11;
                C2897a.this.m13129E3("birthdayDay");
            } else if (i10 == 1) {
                C2897a.this.f11544j1 = i11;
                C2897a.this.m13129E3("birthdayMonth");
            } else if (i10 == 2) {
                C2897a.this.m13129E3("birthdayYear");
                C2897a.this.f11543i1 = i11;
            }
            C2897a.this.m13126A3(m13120v3);
            C2897a.this.m13115p3();
        }
    }

    /* renamed from: com.roblox.client.signup.a$a0 */
    /* loaded from: classes.dex */
    public enum a0 {
        BLANK,
        VALID,
        INVALID
    }

    /* renamed from: com.roblox.client.signup.a$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2817d1.m12471j(C2897a.this.m4384w(), view);
            C2822f0.m12481c("signup", "login");
            C2897a.this.f11555u1.mo13060r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.signup.a$b0 */
    /* loaded from: classes.dex */
    public class b0 extends AsyncTask<Void, Void, Void> implements d0, z {

        /* renamed from: a */
        c0 f11567a;

        /* renamed from: b */
        String f11568b;

        /* renamed from: c */
        String f11569c;

        /* renamed from: d */
        String f11570d = null;

        /* renamed from: e */
        JSONObject f11571e = null;

        /* renamed from: f */
        int f11572f = -1;

        /* renamed from: g */
        private AbstractC4739c f11573g;

        /* renamed from: h */
        private AbstractC4740d f11574h;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        b0(c0 c0Var) {
            this.f11568b = null;
            this.f11569c = null;
            this.f11567a = c0Var;
            Context m4384w = C2897a.this.m4384w();
            String str = "username";
            try {
                this.f11568b = URLEncoder.encode(C2897a.this.f11540f1, "UTF-8");
                try {
                    str = "password";
                    this.f11569c = URLEncoder.encode(C2897a.this.f11541g1, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    C2897a.this.m13076G3(C2897a.this.f11534Z0, C4736a.m18881c(m4384w, C2748c0.f10563P1, new Object[0]));
                    C2822f0.m12488j("signup", str, "NotUTF8", true);
                }
                this.f11574h = new C4737a(C2897a.this.f11539e1, this);
                this.f11573g = new C4738b(C2897a.this.f11539e1, this);
            } catch (UnsupportedEncodingException unused2) {
                C2897a.this.m13076G3(C2897a.this.f11526R0, C4736a.m18881c(m4384w, C2748c0.f10655g2, new Object[0]));
                C2822f0.m12488j("signup", "username", "NotUTF8", true);
            }
        }

        /* renamed from: e */
        private String m13133e() {
            return this.f11567a == c0.USERNAME ? "Username" : "Password";
        }

        @Override // com.roblox.client.signup.C2897a.z
        /* renamed from: a */
        public void mo13134a(a0 a0Var, Integer num) {
            C2897a.this.f11548n1 = a0Var;
            if (a0Var == a0.VALID) {
                C2897a c2897a = C2897a.this;
                c2897a.m13078H3(c2897a.f11526R0, C4736a.m18881c(C2897a.this.m4384w(), num.intValue(), new Object[0]));
                C2897a.this.f11526R0.postDelayed(C2897a.this.f11559y1, 2000L);
                C2897a.this.f11526R0.m13066K();
                return;
            }
            C2897a c2897a2 = C2897a.this;
            c2897a2.m13076G3(c2897a2.f11526R0, C4736a.m18881c(C2897a.this.m4384w(), num.intValue(), new Object[0]));
            C2897a.this.f11526R0.m13063H();
        }

        @Override // com.roblox.client.signup.C2897a.d0
        /* renamed from: b */
        public void mo13135b(a0 a0Var, Integer num) {
            C2897a.this.f11549o1 = a0Var;
            if (a0Var == a0.VALID) {
                C2897a c2897a = C2897a.this;
                c2897a.m13078H3(c2897a.f11534Z0, null);
            } else {
                C2897a c2897a2 = C2897a.this;
                c2897a2.m13076G3(c2897a2.f11534Z0, C4736a.m18881c(c2897a2.m4384w(), num.intValue(), new Object[0]));
            }
        }

        @Override // com.roblox.client.signup.C2897a.z
        /* renamed from: c */
        public void mo13136c() {
            C2897a.this.f11548n1 = a0.INVALID;
            C2897a c2897a = C2897a.this;
            c2897a.m13076G3(c2897a.f11526R0, C4736a.m18881c(C2897a.this.m4384w(), C2748c0.f10625b2, new Object[0]));
            C2897a.this.f11526R0.m13065J();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            String str;
            String str2 = this.f11567a == c0.USERNAME ? "username" : "password";
            if (isCancelled()) {
                return null;
            }
            int i10 = n.f11597a[this.f11567a.ordinal()];
            if (i10 == 1) {
                C3417j mo18888a = this.f11573g.mo18888a(C2897a.this.f11540f1, C1157q.m6755e(AbstractAsyncTaskC2900d.m13151d(C2897a.this.f11544j1, C2897a.this.f11545k1, C2897a.this.f11543i1)), "Signup");
                this.f11570d = mo18888a.m15026a();
                this.f11572f = mo18888a.m15027b();
            } else if (i10 == 2) {
                C3417j mo18884a = this.f11574h.mo18884a(this.f11568b, this.f11569c);
                this.f11570d = mo18884a.m15026a();
                this.f11572f = mo18884a.m15027b();
            }
            if (this.f11570d != null) {
                try {
                    this.f11571e = new JSONObject(this.f11570d);
                    str = BuildConfig.FLAVOR;
                } catch (JSONException unused) {
                    str = "ValidationJSONException";
                }
            } else {
                str = "NoResponse";
            }
            if (!str.isEmpty()) {
                C2822f0.m12488j("signup", str2, str, true);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r92) {
            String str;
            super.onPostExecute(r92);
            m13133e();
            c0 c0Var = this.f11567a;
            c0 c0Var2 = c0.USERNAME;
            if (c0Var != c0Var2 || this == C2897a.this.f11558x1) {
                String str2 = this.f11567a == c0Var2 ? "username" : "password";
                ActivityC0803d m4363p = C2897a.this.m4363p();
                if (m4363p == null) {
                    C2822f0.m12488j("signup", str2, "WindowClosed", true);
                    return;
                }
                if (this.f11570d == null) {
                    if (!C2897a.this.m12821q2()) {
                        C2897a.this.m12824t2(C4736a.m18881c(m4363p, C2748c0.f10538K1, new Object[0]));
                    }
                    C2897a.this.f11539e1.m20388A(this.f11567a == c0Var2 ? "Android-AppSignup-Validation-UsernameResponseNull" : "Android-AppSignup-Validation-PasswordResponseNull");
                    str = "NoResponse";
                } else if (this.f11571e == null) {
                    C2897a.this.m12824t2(C4736a.m18881c(m4363p, C2748c0.f10538K1, new Object[0]));
                    C2897a.this.f11539e1.m20388A(this.f11567a == c0Var2 ? "Android-AppSignup-Validation-UsernameJsonNull" : "Android-AppSignup-Validation-PasswordJsonNull");
                    str = "JSONParseFailure";
                } else {
                    str = BuildConfig.FLAVOR;
                }
                if (!str.isEmpty()) {
                    if (this.f11567a == c0Var2) {
                        C2897a.this.f11548n1 = a0.VALID;
                        C2897a c2897a = C2897a.this;
                        c2897a.m13076G3(c2897a.f11526R0, BuildConfig.FLAVOR);
                    }
                    C2822f0.m12488j("signup", str2, str, true);
                    return;
                }
                int i10 = n.f11597a[this.f11567a.ordinal()];
                if (i10 == 1) {
                    str = this.f11573g.mo18889b(this.f11572f, this.f11571e);
                    C2897a.this.m13086M3();
                } else if (i10 == 2) {
                    str = this.f11574h.mo18885b(this.f11572f, this.f11571e);
                    C2897a.this.m13086M3();
                }
                if (str.isEmpty()) {
                    C2822f0.m12489k("signup", str2, true);
                } else {
                    C2822f0.m12488j("signup", str2, str, true);
                }
            }
        }
    }

    /* renamed from: com.roblox.client.signup.a$c */
    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2897a.this.f11547m1 = true;
            C2822f0.m12481c("signup", "close");
            C2897a.this.f11555u1.mo13057c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.signup.a$c0 */
    /* loaded from: classes.dex */
    public enum c0 {
        USERNAME,
        PASSWORD
    }

    /* renamed from: com.roblox.client.signup.a$d */
    /* loaded from: classes.dex */
    class d implements InterfaceC2804e {
        d() {
        }

        @Override // com.roblox.client.components.InterfaceC2804e
        public void onClick(View view) {
            C2897a.this.m13127B3(true, null, null);
        }
    }

    /* renamed from: com.roblox.client.signup.a$d0 */
    /* loaded from: classes.dex */
    public interface d0 {
        /* renamed from: b */
        void mo13135b(a0 a0Var, Integer num);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.signup.a$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2897a.this.f11547m1) {
                return;
            }
            C2897a.this.m13118s3(c0.USERNAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.signup.a$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2897a.this.f11547m1) {
                return;
            }
            C2897a.this.m13118s3(c0.PASSWORD);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.signup.a$g */
    /* loaded from: classes.dex */
    public class g implements TextWatcher {

        /* renamed from: n */
        final /* synthetic */ Runnable f11583n;

        g(Runnable runnable) {
            this.f11583n = runnable;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C2897a.this.f11548n1 = a0.INVALID;
            C2897a.this.f11526R0.removeCallbacks(C2897a.this.f11559y1);
            C2897a.this.f11533Y0.removeCallbacks(this.f11583n);
            C2897a.this.f11533Y0.postDelayed(this.f11583n, 500L);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.signup.a$h */
    /* loaded from: classes.dex */
    public class h implements TextWatcher {

        /* renamed from: n */
        final /* synthetic */ Runnable f11585n;

        h(Runnable runnable) {
            this.f11585n = runnable;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C2897a.this.f11549o1 = a0.INVALID;
            C2897a.this.f11527S0.removeCallbacks(this.f11585n);
            C2897a.this.f11527S0.postDelayed(this.f11585n, 500L);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C1151k.m6707a("FragmentSignUp", "start: " + i10 + ". before: " + i11 + ". count: " + i12);
            if (i10 == 0 && i11 == 0 && i12 > 0) {
                C2897a.this.f11527S0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C2897a.this.m4307Q().getDrawable(C2913x.f11732E), (Drawable) null);
            } else if (charSequence.length() == 0) {
                C2897a.this.f11527S0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                if (C2897a.this.f11527S0.getTransformationMethod() == null) {
                    C2897a.this.f11527S0.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.signup.a$i */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2897a.this.f11547m1) {
                return;
            }
            C2897a.this.m13116q3();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.signup.a$j */
    /* loaded from: classes.dex */
    public class j implements TextWatcher {

        /* renamed from: n */
        final /* synthetic */ Runnable f11588n;

        j(Runnable runnable) {
            this.f11588n = runnable;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C2897a.this.f11550p1 = a0.INVALID;
            C2897a.this.f11535a1.removeCallbacks(this.f11588n);
            C2897a.this.f11535a1.postDelayed(this.f11588n, 500L);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: com.roblox.client.signup.a$k */
    /* loaded from: classes.dex */
    class k implements x {
        k() {
        }

        @Override // com.roblox.client.signup.C2897a.x
        /* renamed from: c */
        public void mo13057c() {
        }

        @Override // com.roblox.client.signup.C2897a.x
        /* renamed from: i */
        public void mo13058i(String str, String str2) {
        }

        @Override // com.roblox.client.signup.C2897a.x
        /* renamed from: m0 */
        public void mo13059m0() {
        }

        @Override // com.roblox.client.signup.C2897a.x
        /* renamed from: r */
        public void mo13060r() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.signup.a$l */
    /* loaded from: classes.dex */
    public class l implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Context f11590n;

        /* renamed from: o */
        final /* synthetic */ Handler f11591o;

        /* renamed from: p */
        final /* synthetic */ String f11592p;

        /* renamed from: q */
        final /* synthetic */ String f11593q;

        /* renamed from: com.roblox.client.signup.a$l$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2897a.this.f11528T0.m12391z(RbxProgressButton.EnumC2789j.SHOW_PROGRESS, C4736a.m18881c(l.this.f11590n, C2748c0.f10598W1, new Object[0]));
                C2897a.this.f11554t1 = System.currentTimeMillis();
                int i10 = C2897a.this.f11546l1;
                int i11 = C2897a.this.f11543i1;
                int i12 = C2897a.this.f11544j1;
                int i13 = C2897a.this.f11545k1;
                String str = C2897a.this.f11542h1;
                String str2 = C2897a.this.f11540f1;
                String str3 = C2897a.this.f11541g1;
                l lVar = l.this;
                new AsyncTaskC2899c(i10, i11, i12, i13, str, str2, str3, lVar.f11592p, lVar.f11593q, C2897a.this.f11524E1).execute(new Void[0]);
            }
        }

        l(Context context, Handler handler, String str, String str2) {
            this.f11590n = context;
            this.f11591o = handler;
            this.f11592p = str;
            this.f11593q = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3 = "Empty";
            if (C2897a.this.f11540f1.equals(BuildConfig.FLAVOR)) {
                C2897a c2897a = C2897a.this;
                c2897a.m13076G3(c2897a.f11526R0, C4736a.m18881c(this.f11590n, C2748c0.f10593V1, new Object[0]));
                C2897a.this.f11548n1 = a0.INVALID;
                str = "username";
                str2 = "Empty";
            } else {
                str = BuildConfig.FLAVOR;
                str2 = str;
            }
            if (C2897a.this.f11541g1.equals(BuildConfig.FLAVOR)) {
                C2897a c2897a2 = C2897a.this;
                c2897a2.m13076G3(c2897a2.f11534Z0, C4736a.m18881c(this.f11590n, C2748c0.f10588U1, new Object[0]));
                C2897a.this.f11549o1 = a0.INVALID;
                str = "password";
            } else {
                str3 = str2;
            }
            if (!str3.isEmpty() && !str.isEmpty()) {
                C2822f0.m12488j("signup", str, str3, true);
            }
            C2897a.this.m13115p3();
            C2897a.this.m13117r3();
            if (!C2897a.this.m13086M3()) {
                C2897a.this.m13131L3();
            } else {
                this.f11591o.postDelayed(new a(), 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.signup.a$m */
    /* loaded from: classes.dex */
    public class m implements DialogInterface.OnClickListener {
        m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.signup.a$n */
    /* loaded from: classes.dex */
    public static /* synthetic */ class n {

        /* renamed from: a */
        static final /* synthetic */ int[] f11597a;

        static {
            int[] iArr = new int[c0.values().length];
            f11597a = iArr;
            try {
                iArr[c0.USERNAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11597a[c0.PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.roblox.client.signup.a$o */
    /* loaded from: classes.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C2897a.this.f11527S0.getTransformationMethod() == null) {
                C1151k.m6707a("FragmentSignUp", "transformation = null");
                C2897a.this.f11527S0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C2897a.this.m4307Q().getDrawable(C2913x.f11732E), (Drawable) null);
                C2897a.this.f11527S0.setTransformationMethod(new PasswordTransformationMethod());
            } else {
                C1151k.m6707a("FragmentSignUp", "transformation not null");
                C2897a.this.f11527S0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C2897a.this.m4307Q().getDrawable(C2913x.f11754c), (Drawable) null);
                C2897a.this.f11527S0.setTransformationMethod(null);
            }
        }
    }

    /* renamed from: com.roblox.client.signup.a$p */
    /* loaded from: classes.dex */
    class p implements TextView.OnEditorActionListener {
        p() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 5) {
                return false;
            }
            C2897a.this.f11534Z0.requestFocus();
            return true;
        }
    }

    /* renamed from: com.roblox.client.signup.a$q */
    /* loaded from: classes.dex */
    class q implements View.OnFocusChangeListener {
        q() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            C2897a.this.m13128D3("username", z10);
        }
    }

    /* renamed from: com.roblox.client.signup.a$r */
    /* loaded from: classes.dex */
    class r implements TextView.OnEditorActionListener {
        r() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 5) {
                return false;
            }
            C2897a.this.f11527S0.clearFocus();
            C2817d1.m12472k(C2897a.this.f11553s1);
            return true;
        }
    }

    /* renamed from: com.roblox.client.signup.a$s */
    /* loaded from: classes.dex */
    class s implements InterfaceC2806g {

        /* renamed from: a */
        final /* synthetic */ Context f11602a;

        s(Context context) {
            this.f11602a = context;
        }

        @Override // com.roblox.client.components.InterfaceC2806g
        /* renamed from: a */
        public void mo12421a(View view, boolean z10) {
            C2897a.this.m13128D3("password", z10);
            if (C2897a.this.f11549o1 == a0.BLANK) {
                if (z10) {
                    C2897a.this.f11534Z0.m12339y(C4736a.m18881c(this.f11602a, C2748c0.f10737u0, new Object[0]));
                } else {
                    C2897a.this.f11534Z0.m12335r();
                }
            }
        }
    }

    /* renamed from: com.roblox.client.signup.a$t */
    /* loaded from: classes.dex */
    class t implements TextView.OnEditorActionListener {
        t() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 6) {
                return false;
            }
            C2817d1.m12471j(C2897a.this.m4384w(), C2897a.this.f11553s1);
            return true;
        }
    }

    /* renamed from: com.roblox.client.signup.a$u */
    /* loaded from: classes.dex */
    class u implements View.OnFocusChangeListener {
        u() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            C2897a.this.m13128D3("email", z10);
        }
    }

    /* renamed from: com.roblox.client.signup.a$v */
    /* loaded from: classes.dex */
    class v implements RbxGenderPicker.InterfaceC2779e {
        v() {
        }

        @Override // com.roblox.client.components.RbxGenderPicker.InterfaceC2779e
        /* renamed from: a */
        public void mo12363a(RbxButton rbxButton) {
            C2897a.this.m13129E3("gender");
            C2817d1.m12471j(C2897a.this.m4384w(), C2897a.this.f11553s1);
            C2897a.this.m13117r3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.signup.a$w */
    /* loaded from: classes.dex */
    public static class w implements Runnable {

        /* renamed from: n */
        WeakReference<RbxEditText> f11607n;

        w(RbxEditText rbxEditText) {
            this.f11607n = new WeakReference<>(rbxEditText);
        }

        @Override // java.lang.Runnable
        public void run() {
            RbxEditText rbxEditText = this.f11607n.get();
            if (rbxEditText != null) {
                rbxEditText.mo12329B(BuildConfig.FLAVOR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.signup.a$x */
    /* loaded from: classes.dex */
    public interface x {
        /* renamed from: c */
        void mo13057c();

        /* renamed from: i */
        void mo13058i(String str, String str2);

        /* renamed from: m0 */
        void mo13059m0();

        /* renamed from: r */
        void mo13060r();
    }

    /* renamed from: com.roblox.client.signup.a$y */
    /* loaded from: classes.dex */
    private class y implements AbstractAsyncTaskC2900d.a {
        private y() {
        }

        /* renamed from: c */
        private void m13139c(int i10, long j10) {
            C5565g.m20445e().m20461k(C2897a.this.f11540f1, j10);
            C2897a c2897a = C2897a.this;
            c2897a.f11555u1.mo13058i(c2897a.f11540f1, C2897a.this.f11541g1);
            C5563e.m20378g(i10);
        }

        @Override // com.roblox.client.signup.AbstractAsyncTaskC2900d.a
        /* renamed from: a */
        public void mo13140a(C2902f c2902f) {
            m13139c(c2902f.f11636d, c2902f.f11639g);
        }

        @Override // com.roblox.client.signup.AbstractAsyncTaskC2900d.a
        /* renamed from: b */
        public void mo13141b(C2902f c2902f) {
            if (c2902f == null) {
                C2897a c2897a = C2897a.this;
                c2897a.m13114o3(c2897a.f11520A1);
                c2902f = new C2902f();
                c2902f.f11634b = "FailureUnknownError";
                c2902f.f11635c = "Android-AppSignup-UnknownError";
            } else if (c2902f.f11633a.size() != 0 && c2902f.f11633a.get(0) != null) {
                Context m4384w = C2897a.this.m4384w();
                String str = c2902f.f11633a.get(0);
                if (str.equals("UsernameTaken")) {
                    C2897a c2897a2 = C2897a.this;
                    c2897a2.m13076G3(c2897a2.f11526R0, C4736a.m18881c(m4384w, C2748c0.f10625b2, new Object[0]));
                    c2902f.f11634b = "FailureAlreadyTaken";
                    c2902f.f11635c = "Android-AppSignup-UsernameTaken";
                } else if (str.equals("UsernameContainsInvalidCharacters")) {
                    C2897a c2897a3 = C2897a.this;
                    c2897a3.m13076G3(c2897a3.f11526R0, C2897a.this.f11560z1);
                    c2902f.f11634b = "FailureInvalidCharacters";
                    c2902f.f11635c = "Android-AppSignup-UsernameInvalidChars";
                } else if (str.equals("UsernameCannotContainSpaces")) {
                    C2897a c2897a4 = C2897a.this;
                    c2897a4.m13076G3(c2897a4.f11526R0, C4736a.m18881c(m4384w, C2748c0.f10631c2, new Object[0]));
                    c2902f.f11634b = "FailureContainsSpaces";
                    c2902f.f11635c = "Android-AppSignup-UsernameWithSpaces";
                } else if (str.equals("UsernameInvalid")) {
                    C2897a c2897a5 = C2897a.this;
                    c2897a5.m13076G3(c2897a5.f11526R0, C4736a.m18881c(m4384w, C2748c0.f10649f2, new Object[0]));
                    c2902f.f11634b = "FailureInvalidUsername";
                    c2902f.f11635c = "Android-AppSignup-UsernameInvalid";
                } else if (str.equals("BirthdayInvalid")) {
                    C2897a.this.f11537c1.m12297q();
                    c2902f.f11634b = "FailureInvalidBirthday";
                    c2902f.f11635c = "Android-AppSignup-InvalidBirthday";
                } else if (str.equals("GenderInvalid")) {
                    C2897a.this.f11536b1.m12358p();
                    c2902f.f11634b = "FailureInvalidGender";
                    c2902f.f11635c = "Android-AppSignup-InvalidGender";
                } else if (str.equals("PasswordInvalid")) {
                    C2897a c2897a6 = C2897a.this;
                    c2897a6.m13076G3(c2897a6.f11534Z0, C4736a.m18881c(m4384w, C2748c0.f10573R1, new Object[0]));
                    c2902f.f11634b = "FailureInvalidPassword";
                    c2902f.f11635c = "Android-AppSignup-PasswordInvalid";
                } else if (str.equals("Captcha")) {
                    if (m4384w != null) {
                        C2897a.this.m13082J3();
                    }
                    c2902f.f11634b = "FailureAccountCreateFloodcheck";
                    c2902f.f11635c = "Android-AppSignup-Captcha";
                } else if (str.equals("StatusJsonError")) {
                    C2897a c2897a7 = C2897a.this;
                    c2897a7.m13114o3(c2897a7.f11521B1);
                    c2902f.f11634b = "FailureJSONParse";
                    c2902f.f11635c = "Android-AppSignup-JsonError";
                } else if (str.equals("StatusThrottled")) {
                    C2897a.this.m13130K3();
                    c2902f.f11634b = "FailureStatusThrottled";
                    c2902f.f11635c = "Android-AppSignup-Throttled";
                } else if (str.equals("StatusServerError")) {
                    C2897a c2897a8 = C2897a.this;
                    c2897a8.m13114o3(c2897a8.f11522C1);
                    c2902f.f11634b = "FailureServerError";
                    c2902f.f11635c = "Android-AppSignup-ServerError";
                } else if (str.equals("StatusUserIdInvalid")) {
                    C2897a c2897a9 = C2897a.this;
                    c2897a9.m13114o3(c2897a9.f11522C1);
                    c2902f.f11634b = "MissingUserInfo";
                    c2902f.f11635c = "Android-AppSignup-UserIdInvalid";
                } else if (str.equals("PasswordMatchesUsername")) {
                    C2897a c2897a10 = C2897a.this;
                    c2897a10.m13076G3(c2897a10.f11534Z0, C4736a.m18881c(m4384w, C2748c0.f10568Q1, new Object[0]));
                    c2902f.f11634b = "PasswordMatchesUsername";
                    c2902f.f11635c = "Android-AppSignup-PasswordMatchesUsername";
                } else if (str.equals("DumbPassword")) {
                    C2897a c2897a11 = C2897a.this;
                    c2897a11.m13076G3(c2897a11.f11534Z0, C4736a.m18881c(m4384w, C2748c0.f10553N1, new Object[0]));
                    c2902f.f11634b = "DumbPassword";
                    c2902f.f11635c = "Android-AppSignup-DumbPassword";
                } else {
                    C2897a c2897a12 = C2897a.this;
                    c2897a12.m13114o3(c2897a12.f11523D1);
                    c2902f.f11635c = "Android-AppSignup-UnknownError";
                }
            } else {
                C2897a c2897a13 = C2897a.this;
                c2897a13.m13114o3(c2897a13.f11520A1);
                c2902f.f11634b = "FailureUnknownError";
                c2902f.f11635c = "Android-AppSignup-UnknownError";
            }
            C5563e.m20379h().m20423f(c2902f.f11635c, c2902f.f11634b, c2902f.f11636d, c2902f.f11637e, c2902f.f11638f, C2897a.this.f11540f1, System.currentTimeMillis() - C2897a.this.f11554t1);
            if ("Captcha".equals(c2902f.f11633a.get(0))) {
                return;
            }
            C2897a.this.m13131L3();
        }

        /* synthetic */ y(C2897a c2897a, k kVar) {
            this();
        }
    }

    /* renamed from: com.roblox.client.signup.a$z */
    /* loaded from: classes.dex */
    public interface z {
        /* renamed from: a */
        void mo13134a(a0 a0Var, Integer num);

        /* renamed from: c */
        void mo13136c();
    }

    public C2897a() {
        a0 a0Var = a0.BLANK;
        this.f11548n1 = a0Var;
        this.f11549o1 = a0Var;
        this.f11550p1 = a0.VALID;
        this.f11551q1 = a0.INVALID;
        this.f11552r1 = a0Var;
        this.f11553s1 = null;
        this.f11555u1 = f11519F1;
        this.f11556v1 = 500;
        this.f11557w1 = 2000;
        this.f11524E1 = new y(this, null);
    }

    /* renamed from: C3 */
    private void m13070C3(Context context) {
        this.f11560z1 = C4736a.m18881c(context, C2748c0.f10637d2, new Object[0]);
        this.f11520A1 = C4736a.m18881c(context, C2748c0.f10619a2, new Object[0]);
        this.f11521B1 = C4736a.m18881c(context, C2748c0.f10523H1, new Object[0]);
        this.f11522C1 = C4736a.m18881c(context, C2748c0.f10603X1, new Object[0]);
        this.f11523D1 = C4736a.m18881c(context, C2748c0.f10533J1, new Object[0]);
    }

    /* renamed from: F3 */
    private void m13074F3(RbxEditText rbxEditText, int i10) {
        rbxEditText.m12337v(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G3 */
    public void m13076G3(RbxEditText rbxEditText, String str) {
        rbxEditText.mo12338w(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H3 */
    public void m13078H3(RbxEditText rbxEditText, String str) {
        rbxEditText.mo12329B(str);
    }

    /* renamed from: I3 */
    private void m13080I3() {
        e eVar = new e();
        f fVar = new f();
        this.f11559y1 = new w(this.f11526R0);
        this.f11533Y0.addTextChangedListener(new g(eVar));
        this.f11527S0.addTextChangedListener(new h(fVar));
        this.f11535a1.getTextBox().addTextChangedListener(new j(new i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J3 */
    public void m13082J3() {
        if (m4364p0()) {
            this.f11555u1.mo13059m0();
        } else {
            m13131L3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M3 */
    public boolean m13086M3() {
        boolean m13121w3 = m13121w3();
        C1151k.m6712f("FragmentSignUp", "formValid: " + m13121w3);
        this.f11528T0.setEnabled(m13121w3);
        return m13121w3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o3 */
    public void m13114o3(String str) {
        m12820p2(C2748c0.f10740u3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p3 */
    public void m13115p3() {
        a0 a0Var = m13120v3() ? a0.VALID : a0.INVALID;
        this.f11551q1 = a0Var;
        if (a0Var != a0.VALID) {
            this.f11537c1.m12297q();
            C2822f0.m12488j("signup", "birthday", "incomplete", true);
        }
        m13086M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3 */
    public void m13116q3() {
        this.f11550p1 = a0.VALID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r3 */
    public void m13117r3() {
        int value = this.f11536b1.getValue();
        this.f11546l1 = value;
        a0 a0Var = value == 0 ? a0.INVALID : a0.VALID;
        this.f11552r1 = a0Var;
        if (a0Var == a0.INVALID) {
            this.f11536b1.m12358p();
            C2822f0.m12488j("signup", "gender", "not selected", true);
        }
        m13086M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3 */
    public void m13118s3(c0 c0Var) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p == null) {
            return;
        }
        m13132u3();
        Context m4384w = m4384w();
        int i10 = n.f11597a[c0Var.ordinal()];
        String str = "TooShort";
        String str2 = BuildConfig.FLAVOR;
        if (i10 == 1) {
            this.f11548n1 = a0.INVALID;
            if (!C2817d1.m12473l(m4363p)) {
                m13074F3(this.f11526R0, C2748c0.f10692m3);
                str = BuildConfig.FLAVOR;
            } else {
                if (this.f11540f1.isEmpty()) {
                    this.f11526R0.m12339y(C4736a.m18881c(m4384w, C2748c0.f10767z0, new Object[0]));
                    str = "Empty";
                } else if (this.f11540f1.length() < 3) {
                    m13076G3(this.f11526R0, C4736a.m18881c(m4384w, C2748c0.f10667i2, new Object[0]));
                } else if (this.f11540f1.length() > 20) {
                    m13076G3(this.f11526R0, C4736a.m18881c(m4384w, C2748c0.f10667i2, new Object[0]));
                    str = "TooLong";
                } else if (!Pattern.compile("([A-Z]|[a-z]|[0-9]|_)*").matcher(this.f11540f1).matches()) {
                    m13076G3(this.f11526R0, C4736a.m18881c(m4384w, C2748c0.f10655g2, new Object[0]));
                    str = "InvalidCharacters";
                } else {
                    if (this.f11540f1.charAt(0) != '_') {
                        String str3 = this.f11540f1;
                        if (str3.charAt(str3.length() - 1) != '_') {
                            if (C1157q.m6752b(this.f11540f1, '_') > 1) {
                                m13076G3(this.f11526R0, C4736a.m18881c(m4384w, C2748c0.f10685l2, new Object[0]));
                                str = "InvalidUsernameDoubleUnderscore";
                            } else if (!m13120v3()) {
                                m13076G3(this.f11526R0, C4736a.m18881c(m4384w, C2748c0.f10528I1, new Object[0]));
                                str = "BirthdayNotSet";
                            } else {
                                b0 b0Var = this.f11558x1;
                                if (b0Var != null) {
                                    b0Var.cancel(true);
                                }
                                b0 b0Var2 = new b0(c0Var);
                                this.f11558x1 = b0Var2;
                                b0Var2.execute(new Void[0]);
                                this.f11526R0.m12365F();
                                str = BuildConfig.FLAVOR;
                            }
                        }
                    }
                    m13076G3(this.f11526R0, C4736a.m18881c(m4384w, C2748c0.f10661h2, new Object[0]));
                    str = "InvalidFirstOrLastCharacter";
                }
                if (!str.isEmpty()) {
                    this.f11526R0.m13064I();
                }
            }
            str2 = "username";
        } else if (i10 != 2) {
            str = BuildConfig.FLAVOR;
        } else {
            this.f11549o1 = a0.INVALID;
            if (!C2817d1.m12473l(m4363p)) {
                m13074F3(this.f11534Z0, C2748c0.f10692m3);
            } else {
                if (this.f11541g1.isEmpty()) {
                    this.f11534Z0.m12339y(C4736a.m18881c(m4384w, C2748c0.f10737u0, new Object[0]));
                    str = "Empty";
                } else if (this.f11540f1.equals(this.f11541g1)) {
                    m13076G3(this.f11534Z0, C4736a.m18881c(m4384w, C2748c0.f10568Q1, new Object[0]));
                    str = "IsUsername";
                } else if (this.f11541g1.length() < 8) {
                    m13076G3(this.f11534Z0, C4736a.m18881c(m4384w, C2748c0.f10608Y1, new Object[0]));
                } else {
                    new b0(c0Var).execute(new Void[0]);
                }
                str2 = "password";
            }
            str = BuildConfig.FLAVOR;
            str2 = "password";
        }
        m13086M3();
        if (str.isEmpty()) {
            return;
        }
        C2822f0.m12488j("signup", str2, str, true);
    }

    /* renamed from: t3 */
    private void m13119t3(int i10, int i11, int i12) {
        String m18881c;
        Context m4384w = m4384w();
        if (m13122x3(i10, i11, i12)) {
            m18881c = C4736a.m18881c(m4384w, C2748c0.f10702o1, new Object[0]);
        } else {
            m18881c = C4736a.m18881c(m4384w, C2748c0.f10696n1, new Object[0]);
        }
        this.f11535a1.setHintText(m18881c);
        this.f11535a1.m12330D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v3 */
    public boolean m13120v3() {
        return (this.f11543i1 == -1 || this.f11544j1 == -1 || this.f11545k1 == -1) ? false : true;
    }

    /* renamed from: w3 */
    private boolean m13121w3() {
        a0 a0Var = this.f11548n1;
        a0 a0Var2 = a0.VALID;
        return a0Var == a0Var2 && this.f11551q1 == a0Var2 && this.f11549o1 == a0Var2 && this.f11552r1 == a0Var2 && this.f11550p1 == a0Var2;
    }

    /* renamed from: x3 */
    private boolean m13122x3(int i10, int i11, int i12) {
        return C1146f.m6698c(i10, i11, i12) < 13;
    }

    /* renamed from: y3 */
    private void m13123y3() {
        this.f11534Z0.m12334q();
        this.f11526R0.m12334q();
        this.f11536b1.m12357n();
        this.f11537c1.m12295k();
        this.f11535a1.m12334q();
        this.f11525Q0.m12308b();
        this.f11530V0.m12308b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z3 */
    public static C2897a m13125z3() {
        return new C2897a();
    }

    /* renamed from: A3 */
    public void m13126A3(boolean z10) {
        if (m13120v3()) {
            this.f11537c1.m12298r();
            m13119t3(this.f11545k1, this.f11544j1, this.f11543i1);
            String obj = this.f11533Y0.getText().toString();
            this.f11533Y0.setText(obj);
            this.f11533Y0.setSelection(obj.length());
        }
    }

    /* renamed from: B3 */
    public void m13127B3(boolean z10, String str, String str2) {
        if (z10) {
            if (m12821q2()) {
                return;
            } else {
                C2822f0.m12481c("signup", "submit");
            }
        }
        m13115p3();
        if (this.f11551q1 != a0.VALID) {
            return;
        }
        m13132u3();
        this.f11528T0.m12390y(RbxProgressButton.EnumC2789j.SHOW_PROGRESS, C2748c0.f10644e3);
        m13123y3();
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new l(m4384w(), handler, str, str2), 1000L);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2738a0.f10432w, viewGroup, false);
        layoutInflater.inflate(C2738a0.f10431v, (LinearLayout) layoutInflater.inflate(C2738a0.f10430u, (LinearLayout) inflate.findViewById(C2915y.f11839Y)).findViewById(C2915y.f11827S));
        ((LinearLayout) inflate.findViewById(C2915y.f11821P)).setOnClickListener(null);
        this.f11525Q0 = (RbxButton) inflate.findViewById(C2915y.f11825R);
        UsernameSignUpEditText usernameSignUpEditText = (UsernameSignUpEditText) inflate.findViewById(C2915y.f11841Z);
        this.f11526R0 = usernameSignUpEditText;
        EditText textBox = usernameSignUpEditText.getTextBox();
        this.f11533Y0 = textBox;
        textBox.setId(C2915y.f11800G1);
        this.f11526R0.getBottomLabel().setId(C2915y.f11797F1);
        RbxEditText rbxEditText = (RbxEditText) inflate.findViewById(C2915y.f11835W);
        this.f11534Z0 = rbxEditText;
        EditText textBox2 = rbxEditText.getTextBox();
        this.f11527S0 = textBox2;
        textBox2.setId(C2915y.f11794E1);
        this.f11534Z0.getBottomLabel().setId(C2915y.f11791D1);
        this.f11534Z0.setRightDrawableClickListener(new o());
        this.f11536b1 = (RbxGenderPicker) inflate.findViewById(C2915y.f11831U);
        this.f11537c1 = (RbxBirthdayPicker) inflate.findViewById(C2915y.f11823Q);
        this.f11535a1 = (RbxLoadingEditText) inflate.findViewById(C2915y.f11829T);
        RbxProgressButton rbxProgressButton = (RbxProgressButton) inflate.findViewById(C2915y.f11837X);
        this.f11528T0 = rbxProgressButton;
        rbxProgressButton.setEnabled(false);
        this.f11529U0 = (TextView) inflate.findViewById(C2915y.f11819O);
        this.f11530V0 = (RbxButton) inflate.findViewById(C2915y.f11833V);
        this.f11531W0 = (RbxTextView) inflate.findViewById(C2915y.f11847b0);
        this.f11532X0 = (RbxTextView) inflate.findViewById(C2915y.f11844a0);
        this.f11553s1 = inflate;
        Context m4384w = m4384w();
        this.f11525Q0.setText(C4736a.m18881c(m4384w, C2748c0.f10677k0, new Object[0]));
        this.f11530V0.setText(C4736a.m18881c(m4384w, C2748c0.f10683l0, new Object[0]));
        this.f11525Q0.setContentDescription(C4736a.m18881c(m4384w, C2748c0.f10713q0, new Object[0]));
        this.f11534Z0.setHintText(C4736a.m18881c(m4384w, C2748c0.f10650f3, new Object[0]));
        this.f11534Z0.setLongHintText(C4736a.m18881c(m4384w, C2748c0.f10731t0, new Object[0]));
        this.f11534Z0.setContentDescription(C4736a.m18881c(m4384w, C2748c0.f10743v0, new Object[0]));
        this.f11526R0.setContentDescription(C4736a.m18881c(m4384w, C2748c0.f10749w0, new Object[0]));
        this.f11528T0.setContentDescription(C4736a.m18881c(m4384w, C2748c0.f10755x0, new Object[0]));
        this.f11526R0.setHintText(C4736a.m18881c(m4384w, C2748c0.f10761y0, new Object[0]));
        this.f11526R0.setLongHintText(C4736a.m18881c(m4384w, C2748c0.f10484A0, new Object[0]));
        RbxLoadingEditText rbxLoadingEditText = this.f11535a1;
        int i10 = C2748c0.f10696n1;
        rbxLoadingEditText.setHintText(C4736a.m18881c(m4384w, i10, new Object[0]));
        this.f11535a1.setContentDescription(C4736a.m18881c(m4384w, i10, new Object[0]));
        this.f11528T0.setText(C4736a.m18881c(m4384w, C2748c0.f10508E1, new Object[0]));
        this.f11531W0.setText(C4736a.m18881c(m4384w, C2748c0.f10513F1, new Object[0]));
        if (C2877p0.m12933l0()) {
            this.f11537c1.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.5f));
        }
        this.f11526R0.m12339y(C4736a.m18881c(m4384w, C2748c0.f10767z0, new Object[0]));
        this.f11532X0.setVisibility(8);
        this.f11533Y0.setImeOptions(5);
        this.f11533Y0.setOnEditorActionListener(new p());
        this.f11533Y0.setOnFocusChangeListener(new q());
        this.f11527S0.setImeOptions(5);
        this.f11527S0.setOnEditorActionListener(new r());
        this.f11534Z0.setRbxFocusChangedListener(new s(m4384w));
        EditText textBox3 = this.f11535a1.getTextBox();
        textBox3.setImeOptions(6);
        textBox3.setOnEditorActionListener(new t());
        textBox3.setOnFocusChangeListener(new u());
        m13080I3();
        this.f11536b1.setOnGenderButtonPressedListener(new v());
        this.f11537c1.setRbxDateChangedListener(new a());
        this.f11530V0.setOnClickListener(new b());
        this.f11525Q0.setOnClickListener(new c());
        this.f11528T0.setOnRbxClickedListener(new d());
        C3025b.m13491a(m4384w, this.f11529U0);
        this.f11529U0.setTextIsSelectable(false);
        C2822f0.m12498t("signup");
        m13070C3(m4384w);
        return inflate;
    }

    /* renamed from: D3 */
    void m13128D3(String str, boolean z10) {
        C2822f0.m12487i("signup", str, z10 ? "focus" : "offFocus");
    }

    /* renamed from: E3 */
    void m13129E3(String str) {
        C2822f0.m12487i("signup", str, "submit");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: G0 */
    public void mo4280G0() {
        super.mo4280G0();
        this.f11526R0.removeCallbacks(this.f11559y1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public void mo267H0() {
        super.mo267H0();
        this.f11555u1 = f11519F1;
        b0 b0Var = this.f11558x1;
        if (b0Var != null) {
            b0Var.cancel(true);
        }
    }

    /* renamed from: K3 */
    public void m13130K3() {
        Context m4384w = m4384w();
        new DialogC0152b.a(m4384w).m714t(C4736a.m18881c(m4384w, C2748c0.f10734t3, new Object[0])).m702h(C4736a.m18881c(m4384w, C2748c0.f10613Z1, new Object[0])).m711q(C4736a.m18881c(m4384w, C2748c0.f10519G2, new Object[0]), new m()).m698d(false).m695a().show();
    }

    /* renamed from: L3 */
    public void m13131L3() {
        this.f11528T0.m12391z(RbxProgressButton.EnumC2789j.SHOW_BUTTON, C4736a.m18881c(m4384w(), C2748c0.f10508E1, new Object[0]));
        this.f11526R0.m12330D();
        this.f11534Z0.m12330D();
        this.f11536b1.m12360r();
        this.f11537c1.m12299s();
        this.f11525Q0.m12309c();
        this.f11530V0.m12309c();
        if (m13120v3()) {
            this.f11535a1.m12330D();
        }
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        m4363p().getWindow().setSoftInputMode(32);
        C2822f0.m12498t("signup");
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        super.mo4327X0();
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public void mo4376t0(Bundle bundle) {
        super.mo4376t0(bundle);
        this.f11538d1 = new C2901e(new C3415h());
    }

    /* renamed from: u3 */
    public void m13132u3() {
        this.f11540f1 = this.f11533Y0.getText().toString();
        this.f11541g1 = this.f11527S0.getText().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo269w0(Context context) {
        super.mo269w0(context);
        if (context instanceof x) {
            this.f11555u1 = (x) context;
            return;
        }
        C1151k.m6712f("signup_window", "Parent activity does not implement FragmentSignUp.OnFragmentInteractionListener!");
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener.");
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        m4606m2(1, m4600f2());
        this.f11539e1 = C5563e.m20379h();
    }
}
