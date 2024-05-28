package p224r5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.List;
import p070f3.C3137k;
import p098h5.C3399c;

/* renamed from: r5.j */
/* loaded from: classes.dex */
public final class C4438j {

    /* renamed from: a */
    private final Context f18028a;

    /* renamed from: b */
    private String f18029b;

    /* renamed from: c */
    private String f18030c;

    /* renamed from: d */
    private int f18031d;

    /* renamed from: e */
    private int f18032e = 0;

    public C4438j(Context context) {
        this.f18028a = context;
    }

    /* renamed from: b */
    private final PackageInfo m18240b(String str) {
        try {
            return this.f18028a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    /* renamed from: c */
    public static String m18241c(C3399c c3399c) {
        String m15002d = c3399c.m14989k().m15002d();
        if (m15002d != null) {
            return m15002d;
        }
        String m15001c = c3399c.m14989k().m15001c();
        if (!m15001c.startsWith("1:")) {
            return m15001c;
        }
        String[] split = m15001c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public static String m18242d(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: h */
    private final synchronized void m18243h() {
        PackageInfo m18240b = m18240b(this.f18028a.getPackageName());
        if (m18240b != null) {
            this.f18029b = Integer.toString(m18240b.versionCode);
            this.f18030c = m18240b.versionName;
        }
    }

    /* renamed from: a */
    public final synchronized int m18244a() {
        int i10 = this.f18032e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f18028a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C3137k.m13804h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f18032e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f18032e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (C3137k.m13804h()) {
            this.f18032e = 2;
        } else {
            this.f18032e = 1;
        }
        return this.f18032e;
    }

    /* renamed from: e */
    public final synchronized String m18245e() {
        if (this.f18029b == null) {
            m18243h();
        }
        return this.f18029b;
    }

    /* renamed from: f */
    public final synchronized String m18246f() {
        if (this.f18030c == null) {
            m18243h();
        }
        return this.f18030c;
    }

    /* renamed from: g */
    public final synchronized int m18247g() {
        PackageInfo m18240b;
        if (this.f18031d == 0 && (m18240b = m18240b("com.google.android.gms")) != null) {
            this.f18031d = m18240b.versionCode;
        }
        return this.f18031d;
    }
}
