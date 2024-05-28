package p070f3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p096h3.C3393c;

/* renamed from: f3.a */
/* loaded from: classes.dex */
public class C3127a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m13775a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest m13776b;
        PackageInfo m14949d = C3393c.m14952a(context).m14949d(str, 64);
        Signature[] signatureArr = m14949d.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (m13776b = m13776b("SHA1")) == null) {
            return null;
        }
        return m13776b.digest(m14949d.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m13776b(String str) {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
