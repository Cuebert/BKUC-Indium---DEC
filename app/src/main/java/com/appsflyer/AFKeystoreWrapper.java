package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.internal.C1215aa;
import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public class AFKeystoreWrapper {
    public KeyStore AFInAppEventParameterName;
    private Context AFKeystoreWrapper;
    public final Object values = new Object();
    public String AFInAppEventType = BuildConfig.FLAVOR;
    public int valueOf = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFKeystoreWrapper = context;
        AFLogger.AFKeystoreWrapper("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFInAppEventParameterName = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.AFInAppEventType("Couldn't load keystore instance of type: AndroidKeyStore", e10);
        }
    }

    private static boolean values(String str) {
        return str.startsWith("com.appsflyer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
    
        r1 = r4.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:
    
        if (r1.length != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        com.appsflyer.AFLogger.AFKeystoreWrapper("Found a matching AF key with alias:\n".concat(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r3.length != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (r1.length != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        r7.AFInAppEventType = r3[1].trim();
        r7.valueOf = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        r3 = new java.lang.StringBuilder("Couldn't list KeyStore Aliases: ");
        r3.append(r1.getClass().getName());
        com.appsflyer.AFLogger.AFInAppEventType(r3.toString(), r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AFInAppEventParameterName() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.values
            monitor-enter(r0)
            java.security.KeyStore r1 = r7.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L89
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L86
            java.util.Enumeration r1 = r1.aliases()     // Catch: java.lang.Throwable -> L6a
        Ld:
            boolean r4 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L86
            java.lang.Object r4 = r1.nextElement()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto Ld
            boolean r5 = values(r4)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto Ld
            java.lang.String r1 = ","
            java.lang.String[] r1 = r4.split(r1)     // Catch: java.lang.Throwable -> L6a
            int r5 = r1.length     // Catch: java.lang.Throwable -> L6a
            r6 = 3
            if (r5 != r6) goto L86
            java.lang.String r5 = "Found a matching AF key with alias:\n"
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> L6a
            com.appsflyer.AFLogger.AFKeystoreWrapper(r4)     // Catch: java.lang.Throwable -> L6a
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L68
            r4 = 2
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "="
            java.lang.String[] r1 = r1.split(r5)     // Catch: java.lang.Throwable -> L68
            int r5 = r3.length     // Catch: java.lang.Throwable -> L68
            if (r5 != r4) goto L87
            int r5 = r1.length     // Catch: java.lang.Throwable -> L68
            if (r5 != r4) goto L87
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L68
            r7.AFInAppEventType = r3     // Catch: java.lang.Throwable -> L68
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L68
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L68
            r7.valueOf = r1     // Catch: java.lang.Throwable -> L68
            goto L87
        L68:
            r1 = move-exception
            goto L6c
        L6a:
            r1 = move-exception
            r2 = 0
        L6c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = "Couldn't list KeyStore Aliases: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L89
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L89
            r3.append(r4)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L89
            com.appsflyer.AFLogger.AFInAppEventType(r3, r1)     // Catch: java.lang.Throwable -> L89
            goto L87
        L86:
            r2 = 0
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            return r2
        L89:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.AFInAppEventParameterName():boolean");
    }

    public final void AFInAppEventType(String str) {
        AFLogger.AFKeystoreWrapper("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.values) {
                if (!this.AFInAppEventParameterName.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    } else if (!C1215aa.values()) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.AFKeystoreWrapper).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                    }
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(algorithmParameterSpec);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.AFKeystoreWrapper("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Exception ");
            sb2.append(th.getMessage());
            sb2.append(" occurred");
            AFLogger.AFInAppEventType(sb2.toString(), th);
        }
    }

    public final int valueOf() {
        int i10;
        synchronized (this.values) {
            i10 = this.valueOf;
        }
        return i10;
    }

    public final String values() {
        String str;
        synchronized (this.values) {
            str = this.AFInAppEventType;
        }
        return str;
    }

    public final String AFInAppEventType() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appsflyer,");
        synchronized (this.values) {
            sb2.append("KSAppsFlyerId=");
            sb2.append(this.AFInAppEventType);
            sb2.append(",");
            sb2.append("KSAppsFlyerRICounter=");
            sb2.append(this.valueOf);
        }
        return sb2.toString();
    }
}
