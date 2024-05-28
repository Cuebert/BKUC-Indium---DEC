package p258u2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p321z2.C5984j;

/* renamed from: u2.b */
/* loaded from: classes.dex */
public class C4820b {

    /* renamed from: c */
    private static final Lock f18692c = new ReentrantLock();

    /* renamed from: d */
    private static C4820b f18693d;

    /* renamed from: a */
    private final Lock f18694a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f18695b;

    C4820b(Context context) {
        this.f18695b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C4820b m19005b(Context context) {
        C5984j.m21286j(context);
        Lock lock = f18692c;
        lock.lock();
        try {
            if (f18693d == null) {
                f18693d = new C4820b(context.getApplicationContext());
            }
            C4820b c4820b = f18693d;
            lock.unlock();
            return c4820b;
        } catch (Throwable th) {
            f18692c.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    private static final String m19006i(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public void m19007a() {
        this.f18694a.lock();
        try {
            this.f18695b.edit().clear().apply();
        } finally {
            this.f18694a.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount m19008c() {
        String m19012g;
        String m19012g2 = m19012g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m19012g2) || (m19012g = m19012g(m19006i("googleSignInAccount", m19012g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m7325H(m19012g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions m19009d() {
        String m19012g;
        String m19012g2 = m19012g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m19012g2) || (m19012g = m19012g(m19006i("googleSignInOptions", m19012g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m7339F(m19012g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String m19010e() {
        return m19012g("refreshToken");
    }

    /* renamed from: f */
    public void m19011f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C5984j.m21286j(googleSignInAccount);
        C5984j.m21286j(googleSignInOptions);
        m19013h("defaultGoogleSignInAccount", googleSignInAccount.m7332I());
        C5984j.m21286j(googleSignInAccount);
        C5984j.m21286j(googleSignInOptions);
        String m7332I = googleSignInAccount.m7332I();
        m19013h(m19006i("googleSignInAccount", m7332I), googleSignInAccount.m7333J());
        m19013h(m19006i("googleSignInOptions", m7332I), googleSignInOptions.m7354J());
    }

    /* renamed from: g */
    protected final String m19012g(String str) {
        this.f18694a.lock();
        try {
            return this.f18695b.getString(str, null);
        } finally {
            this.f18694a.unlock();
        }
    }

    /* renamed from: h */
    protected final void m19013h(String str, String str2) {
        this.f18694a.lock();
        try {
            this.f18695b.edit().putString(str, str2).apply();
        } finally {
            this.f18694a.unlock();
        }
    }
}
