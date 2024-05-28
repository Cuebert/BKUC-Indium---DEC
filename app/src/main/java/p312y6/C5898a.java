package p312y6;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import p035c9.C1151k;

/* renamed from: y6.a */
/* loaded from: classes.dex */
public class C5898a {

    /* renamed from: y6.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final String f21736a;

        /* renamed from: b */
        private final String f21737b;

        public a(String str, String str2) {
            this.f21736a = str;
            this.f21737b = str2;
        }

        /* renamed from: a */
        public String m20988a() {
            return this.f21737b;
        }

        /* renamed from: b */
        public String m20989b() {
            return this.f21736a;
        }
    }

    /* renamed from: a */
    public static String m20984a(String str, String str2) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            try {
                KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry("encryption_alias", null);
                if (secretKeyEntry == null) {
                    C1151k.m6707a("Encryption", "No key entry found");
                    return null;
                }
                SecretKey secretKey = secretKeyEntry.getSecretKey();
                byte[] decode = Base64.decode(str2, 0);
                if (decode == null) {
                    C1151k.m6707a("Encryption", "Error getting encryption IV.");
                    return null;
                }
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, secretKey, new GCMParameterSpec(128, decode));
                    return new String(cipher.doFinal(Base64.decode(str, 0)), StandardCharsets.UTF_8);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
                    C1151k.m6707a("Encryption", e10.getMessage());
                    return null;
                }
            } catch (UnsupportedOperationException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e11) {
                C1151k.m6707a("Encryption", e11.getMessage());
                return null;
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e12) {
            C1151k.m6707a("Encryption", e12.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static a m20985b(String str) {
        SecretKey m20987d = m20987d();
        if (m20987d == null) {
            C1151k.m6707a("Encryption", "Error getting secret key");
            return null;
        }
        Cipher m20986c = m20986c(m20987d);
        if (m20986c == null) {
            C1151k.m6707a("Encryption", "Error getting encrypt cipher.");
            return null;
        }
        try {
            return new a(new String(Base64.encode(m20986c.getIV(), 0)), new String(Base64.encode(m20986c.doFinal(str.getBytes(StandardCharsets.UTF_8)), 0)));
        } catch (BadPaddingException | IllegalBlockSizeException e10) {
            C1151k.m6707a("Encryption", e10.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    private static Cipher m20986c(SecretKey secretKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            return cipher;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e10) {
            C1151k.m6707a("Encryption", e10.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    private static SecretKey m20987d() {
        KeyGenerator keyGenerator;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                try {
                    keyGenerator.init(new KeyGenParameterSpec.Builder("encryption_alias", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                } catch (InvalidAlgorithmParameterException e10) {
                    C1151k.m6707a("Encryption", e10.getLocalizedMessage());
                    return null;
                }
            } catch (NoSuchAlgorithmException | NoSuchProviderException e11) {
                C1151k.m6707a("Encryption", e11.getMessage());
                return null;
            }
        } else {
            try {
                keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new SecureRandom());
            } catch (NoSuchAlgorithmException | NoSuchProviderException e12) {
                C1151k.m6707a("Encryption", e12.getMessage());
                return null;
            }
        }
        return keyGenerator.generateKey();
    }
}
