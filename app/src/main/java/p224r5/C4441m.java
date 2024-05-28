package p224r5;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/* renamed from: r5.m */
/* loaded from: classes.dex */
public final class C4441m {
    /* renamed from: a */
    public static KeyPair m18251a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }
}
