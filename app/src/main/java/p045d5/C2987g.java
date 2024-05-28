package p045d5;

import android.util.Base64;
import com.appsflyer.oaid.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: d5.g */
/* loaded from: classes.dex */
public final class C2987g {
    /* renamed from: a */
    public static String m13459a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
