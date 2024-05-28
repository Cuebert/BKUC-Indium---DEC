package p198p3;

import android.util.Base64;
import java.security.SecureRandom;

/* renamed from: p3.c0 */
/* loaded from: classes.dex */
public final class C4227c0 {

    /* renamed from: a */
    private static final SecureRandom f17422a = new SecureRandom();

    /* renamed from: a */
    public static String m17654a() {
        byte[] bArr = new byte[16];
        f17422a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
