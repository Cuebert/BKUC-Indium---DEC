package p285w5;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p098h5.C3399c;

/* renamed from: w5.b */
/* loaded from: classes.dex */
public class C5459b {

    /* renamed from: c */
    private static final String[] f20364c = {"*", "FCM", "GCM", BuildConfig.FLAVOR};

    /* renamed from: a */
    private final SharedPreferences f20365a;

    /* renamed from: b */
    private final String f20366b;

    public C5459b(C3399c c3399c) {
        this.f20365a = c3399c.m14987h().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f20366b = m20066b(c3399c);
    }

    /* renamed from: a */
    private String m20065a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m20066b(C3399c c3399c) {
        String m15002d = c3399c.m14989k().m15002d();
        if (m15002d != null) {
            return m15002d;
        }
        String m15001c = c3399c.m14989k().m15001c();
        if (!m15001c.startsWith("1:") && !m15001c.startsWith("2:")) {
            return m15001c;
        }
        String[] split = m15001c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m20067c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m20068d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m20069e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    /* renamed from: g */
    private String m20070g() {
        String string;
        synchronized (this.f20365a) {
            string = this.f20365a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    private String m20071h() {
        synchronized (this.f20365a) {
            String string = this.f20365a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m20069e = m20069e(string);
            if (m20069e == null) {
                return null;
            }
            return m20067c(m20069e);
        }
    }

    /* renamed from: f */
    public String m20072f() {
        synchronized (this.f20365a) {
            String m20070g = m20070g();
            if (m20070g != null) {
                return m20070g;
            }
            return m20071h();
        }
    }

    /* renamed from: i */
    public String m20073i() {
        synchronized (this.f20365a) {
            for (String str : f20364c) {
                String string = this.f20365a.getString(m20065a(this.f20366b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m20068d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
