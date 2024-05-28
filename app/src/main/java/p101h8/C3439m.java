package p101h8;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.C0581n;
import com.roblox.client.C2822f0;
import p033c7.C1134c;
import p035c9.C1151k;
import p115i8.C3546a;
import p129j8.C3669l;
import p129j8.C3671n;
import p129j8.EnumC3668k;

/* renamed from: h8.m */
/* loaded from: classes.dex */
public class C3439m {

    /* renamed from: c */
    private static C3439m f14322c;

    /* renamed from: a */
    private Bundle f14323a;

    /* renamed from: b */
    private b f14324b = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.m$a */
    /* loaded from: classes.dex */
    public class a implements b {
        a() {
        }

        @Override // p101h8.C3439m.b
        /* renamed from: a */
        public void mo15140a(C3671n c3671n, Context context) {
            if (context == null || c3671n.m15612a() == null || C3439m.this.m15124h(context) == null) {
                return;
            }
            C3439m.this.m15139s(context, c3671n.m15612a(), new C3444r(), C3439m.this.m15124h(context).mo12507b());
        }
    }

    /* renamed from: h8.m$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo15140a(C3671n c3671n, Context context);
    }

    /* renamed from: c */
    public static C3439m m15122c() {
        if (f14322c == null) {
            synchronized (C3439m.class) {
                if (f14322c == null) {
                    f14322c = new C3439m();
                }
            }
        }
        return f14322c;
    }

    /* renamed from: d */
    private String m15123d(String str, Context context, C3444r c3444r, String str2) {
        if (c3444r == null || str2 == null) {
            return null;
        }
        String m15156a = c3444r.m15156a(context, str2);
        if (m15156a == null || !m15156a.equals(str)) {
            return m15156a;
        }
        return null;
    }

    /* renamed from: h */
    public InterfaceC3440n m15124h(Context context) {
        return C3441o.m15141a().m15142b(context);
    }

    /* renamed from: b */
    public Bundle m15125b() {
        Bundle bundle = this.f14323a;
        if (bundle != null) {
            this.f14323a = null;
        }
        return bundle;
    }

    /* renamed from: e */
    public String m15126e(Context context) {
        InterfaceC3440n m15124h = m15124h(context);
        if (m15124h != null) {
            return m15124h.mo12507b();
        }
        return null;
    }

    /* renamed from: f */
    public EnumC3668k m15127f(Context context) {
        InterfaceC3440n m15124h = m15124h(context);
        if (m15124h != null) {
            return m15124h.mo12506a();
        }
        return EnumC3668k.NONE;
    }

    /* renamed from: g */
    String m15128g(Context context, String str, C3444r c3444r, String str2) {
        String m15123d = m15123d(str, context, c3444r, str2);
        m15139s(context, str, c3444r, str2);
        return m15123d;
    }

    /* renamed from: i */
    public String m15129i(Context context) {
        InterfaceC3440n m15124h = m15124h(context);
        if (m15124h != null) {
            return m15124h.mo12508c();
        }
        return null;
    }

    /* renamed from: j */
    public void m15130j(Context context) {
        C3444r c3444r = new C3444r();
        boolean m2963a = C0581n.m2959b(context).m2963a();
        C1151k.m6712f("rbx.push", "AndroidNotifState: " + m2963a);
        if (c3444r.m15158e(context, "AndroidNotifStatePrefKey") && m2963a == c3444r.m15157b(context, "AndroidNotifStatePrefKey")) {
            return;
        }
        C1151k.m6712f("rbx.push", "Different value. Reporting new state: " + m2963a);
        c3444r.m15159f(context, "AndroidNotifStatePrefKey", m2963a);
        C2822f0.m12492n("osSettings", m2963a);
        if (C1134c.m6537a().mo6657w0()) {
            m15136p(context, m2963a, new C3546a(), c3444r, this.f14324b);
        }
    }

    /* renamed from: k */
    public boolean m15131k() {
        return this.f14323a != null;
    }

    /* renamed from: l */
    public void m15132l(C3669l c3669l) {
        if (c3669l.m15609a() == null || c3669l.m15610b() == null) {
            return;
        }
        C1151k.m6707a("rbx.push", c3669l.m15610b());
        C3444r c3444r = new C3444r();
        Context m15609a = c3669l.m15609a();
        InterfaceC3440n m15124h = m15124h(m15609a);
        if (m15124h != null) {
            String mo12508c = m15124h.mo12508c();
            String m15610b = c3669l.m15610b();
            m15137q(m15609a, m15610b, m15128g(m15609a, m15610b, c3444r, mo12508c), c3669l.m15611c(), new C3546a(), this.f14324b);
        }
    }

    /* renamed from: m */
    public void m15133m(Context context) {
        m15134n(context, false);
    }

    /* renamed from: n */
    public void m15134n(Context context, boolean z10) {
        if (context != null) {
            m15135o(context, z10, m15124h(context));
        }
    }

    /* renamed from: o */
    void m15135o(Context context, boolean z10, InterfaceC3440n interfaceC3440n) {
        if (interfaceC3440n != null) {
            interfaceC3440n.mo12509d(context, z10);
        }
    }

    /* renamed from: p */
    public void m15136p(Context context, boolean z10, C3546a c3546a, C3444r c3444r, b bVar) {
        if (!z10) {
            c3546a.m15343a();
            return;
        }
        InterfaceC3440n m15124h = m15124h(context);
        if (m15124h == null) {
            return;
        }
        if (C1134c.m6537a().mo6642r() && Build.VERSION.SDK_INT >= 33) {
            m15134n(context, true);
            return;
        }
        String mo12508c = m15124h.mo12508c();
        String m15123d = m15123d(null, context, c3444r, mo12508c);
        if (m15123d == null || mo12508c == null) {
            return;
        }
        m15137q(context, m15123d, null, true, c3546a, bVar);
    }

    /* renamed from: q */
    void m15137q(Context context, String str, String str2, boolean z10, C3546a c3546a, b bVar) {
        if (c3546a == null || str == null || bVar == null) {
            return;
        }
        c3546a.m15347f(context, str, str2, z10, bVar);
    }

    /* renamed from: r */
    public void m15138r(Bundle bundle) {
        this.f14323a = bundle;
    }

    /* renamed from: s */
    void m15139s(Context context, String str, C3444r c3444r, String str2) {
        if (str2 == null || c3444r == null) {
            return;
        }
        C1151k.m6707a("rbx.push", str2 + " " + str);
        c3444r.m15160g(context, str2, str);
    }
}
