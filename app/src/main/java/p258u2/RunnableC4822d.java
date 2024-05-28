package p258u2;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p029c3.C1127a;
import p295x2.AbstractC5513h;
import p295x2.C5514i;
import p308y2.C5624n;
import p321z2.C5984j;

/* renamed from: u2.d */
/* loaded from: classes.dex */
public final class RunnableC4822d implements Runnable {

    /* renamed from: p */
    private static final C1127a f18696p = new C1127a("RevokeAccessOperation", new String[0]);

    /* renamed from: n */
    private final String f18697n;

    /* renamed from: o */
    private final C5624n f18698o = new C5624n(null);

    public RunnableC4822d(String str) {
        this.f18697n = C5984j.m21282f(str);
    }

    /* renamed from: a */
    public static AbstractC5513h m19017a(String str) {
        if (str == null) {
            return C5514i.m20287a(new Status(4), null);
        }
        RunnableC4822d runnableC4822d = new RunnableC4822d(str);
        new Thread(runnableC4822d).start();
        return runnableC4822d.f18698o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f6127v;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f18697n).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f6125t;
            } else {
                f18696p.m6516b("Unable to revoke access!", new Object[0]);
            }
            f18696p.m6515a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f18696p.m6516b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f18696p.m6516b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f18698o.m7426g(status);
    }
}
