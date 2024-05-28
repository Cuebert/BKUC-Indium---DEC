package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.appsflyer.internal.af */
/* loaded from: classes.dex */
public final class C1220af {
    private static String AFInAppEventParameterName(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b10 : bArr) {
            formatter.format("%02x", Byte.valueOf(b10));
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    public static String AFInAppEventType(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to MD5");
            AFLogger.AFInAppEventType(sb2.toString(), e10);
            return null;
        }
    }

    public static String AFKeystoreWrapper(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to SHA1");
            AFLogger.AFInAppEventType(sb2.toString(), e10);
            return null;
        }
    }

    public static String values(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return values(messageDigest.digest());
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to SHA-256");
            AFLogger.AFInAppEventType(sb2.toString(), e10);
            return null;
        }
    }

    private static String values(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(Integer.toString((b10 & 255) + 256, 16).substring(1));
        }
        return sb2.toString();
    }

    public static String values(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            return values(mac.doFinal(str.getBytes())).toLowerCase();
        } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
            AFLogger.AFInAppEventParameterName(e10.getMessage(), e10);
            return e10.getMessage();
        }
    }
}
