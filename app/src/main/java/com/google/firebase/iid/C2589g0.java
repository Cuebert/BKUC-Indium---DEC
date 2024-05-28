package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.C0587a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
import p224r5.C4438j;
import p224r5.C4441m;
import p259u3.C4852l;

/* renamed from: com.google.firebase.iid.g0 */
/* loaded from: classes.dex */
public final class C2589g0 {
    /* renamed from: b */
    private final C2591h0 m11942b(Context context, String str, C2591h0 c2591h0, boolean z10) {
        long j10;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing ID to properties file");
        }
        Properties properties = new Properties();
        properties.setProperty("id", c2591h0.m11967b());
        j10 = c2591h0.f10195b;
        properties.setProperty("cre", String.valueOf(j10));
        File m11956q = m11956q(context, str);
        try {
            m11956q.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(m11956q, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.lock();
                    if (z10 && channel.size() > 0) {
                        try {
                            channel.position(0L);
                            C2591h0 m11945e = m11945e(channel);
                            m11951k(null, channel);
                            m11950j(null, randomAccessFile);
                            return m11945e;
                        } catch (C2593i0 | IOException e10) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf = String.valueOf(e10);
                                StringBuilder sb2 = new StringBuilder(valueOf.length() + 58);
                                sb2.append("Tried reading ID before writing new one, but failed with: ");
                                sb2.append(valueOf);
                                Log.d("FirebaseInstanceId", sb2.toString());
                            }
                        }
                    }
                    channel.truncate(0L);
                    properties.store(Channels.newOutputStream(channel), (String) null);
                    m11951k(null, channel);
                    m11950j(null, randomAccessFile);
                    return c2591h0;
                } finally {
                }
            } finally {
            }
        } catch (IOException e11) {
            String valueOf2 = String.valueOf(e11);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 21);
            sb3.append("Failed to write key: ");
            sb3.append(valueOf2);
            Log.w("FirebaseInstanceId", sb3.toString());
            return null;
        }
    }

    /* renamed from: c */
    private static C2591h0 m11943c(SharedPreferences sharedPreferences, String str) throws C2593i0 {
        long m11952l = m11952l(sharedPreferences, str);
        String string = sharedPreferences.getString(C2596k.m11972c(str, "id"), null);
        if (string == null) {
            String string2 = sharedPreferences.getString(C2596k.m11972c(str, "|P|"), null);
            if (string2 == null) {
                return null;
            }
            string = C4438j.m18242d(m11946f(string2));
        }
        return new C2591h0(string, m11952l);
    }

    /* renamed from: d */
    private final C2591h0 m11944d(File file) throws C2593i0, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                channel.lock(0L, Long.MAX_VALUE, true);
                C2591h0 m11945e = m11945e(channel);
                m11951k(null, channel);
                m11949i(null, fileInputStream);
                return m11945e;
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: e */
    private static C2591h0 m11945e(FileChannel fileChannel) throws C2593i0, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        try {
            long parseLong = Long.parseLong(properties.getProperty("cre"));
            String property = properties.getProperty("id");
            if (property == null) {
                String property2 = properties.getProperty("pub");
                if (property2 != null) {
                    property = C4438j.m18242d(m11946f(property2));
                } else {
                    throw new C2593i0("Invalid properties file");
                }
            }
            return new C2591h0(property, parseLong);
        } catch (NumberFormatException e10) {
            throw new C2593i0(e10);
        }
    }

    /* renamed from: f */
    private static PublicKey m11946f(String str) throws C2593i0 {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 19);
                sb2.append("Invalid key stored ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new C2593i0(e10);
            }
        } catch (IllegalArgumentException e11) {
            throw new C2593i0(e11);
        }
    }

    /* renamed from: g */
    public static void m11947g(Context context) {
        for (File file : m11953n(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: h */
    private final void m11948h(Context context, String str, C2591h0 c2591h0) {
        long j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (c2591h0.equals(m11943c(sharedPreferences, str))) {
                return;
            }
        } catch (C2593i0 unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C2596k.m11972c(str, "id"), c2591h0.m11967b());
        String m11972c = C2596k.m11972c(str, "cre");
        j10 = c2591h0.f10195b;
        edit.putString(m11972c, String.valueOf(j10));
        edit.commit();
    }

    /* renamed from: i */
    private static /* synthetic */ void m11949i(Throwable th, FileInputStream fileInputStream) {
        if (th == null) {
            fileInputStream.close();
            return;
        }
        try {
            fileInputStream.close();
        } catch (Throwable th2) {
            C4852l.m19040b(th, th2);
        }
    }

    /* renamed from: j */
    private static /* synthetic */ void m11950j(Throwable th, RandomAccessFile randomAccessFile) {
        if (th == null) {
            randomAccessFile.close();
            return;
        }
        try {
            randomAccessFile.close();
        } catch (Throwable th2) {
            C4852l.m19040b(th, th2);
        }
    }

    /* renamed from: k */
    private static /* synthetic */ void m11951k(Throwable th, FileChannel fileChannel) {
        if (th == null) {
            fileChannel.close();
            return;
        }
        try {
            fileChannel.close();
        } catch (Throwable th2) {
            C4852l.m19040b(th, th2);
        }
    }

    /* renamed from: l */
    private static long m11952l(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C2596k.m11972c(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: n */
    private static File m11953n(Context context) {
        File m3033g = C0587a.m3033g(context);
        if (m3033g != null && m3033g.isDirectory()) {
            return m3033g;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: o */
    private final C2591h0 m11954o(Context context, String str) throws C2593i0 {
        C2591h0 m11955p;
        try {
            m11955p = m11955p(context, str);
        } catch (C2593i0 e10) {
            e = e10;
        }
        if (m11955p != null) {
            m11948h(context, str, m11955p);
            return m11955p;
        }
        e = null;
        try {
            C2591h0 m11943c = m11943c(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (m11943c != null) {
                m11942b(context, str, m11943c, false);
                return m11943c;
            }
        } catch (C2593i0 e11) {
            e = e11;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    /* renamed from: p */
    private final C2591h0 m11955p(Context context, String str) throws C2593i0 {
        File m11956q = m11956q(context, str);
        if (!m11956q.exists()) {
            return null;
        }
        try {
            return m11944d(m11956q);
        } catch (C2593i0 | IOException e10) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
                sb2.append("Failed to read ID from file, retrying: ");
                sb2.append(valueOf);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            try {
                return m11944d(m11956q);
            } catch (IOException e11) {
                String valueOf2 = String.valueOf(e11);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 45);
                sb3.append("IID file exists, but failed to read from it: ");
                sb3.append(valueOf2);
                Log.w("FirebaseInstanceId", sb3.toString());
                throw new C2593i0(e11);
            }
        }
    }

    /* renamed from: q */
    private static File m11956q(Context context, String str) {
        String sb2;
        if (TextUtils.isEmpty(str)) {
            sb2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb3 = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb3.append("com.google.InstanceId_");
                sb3.append(encodeToString);
                sb3.append(".properties");
                sb2 = sb3.toString();
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
        return new File(m11953n(context), sb2);
    }

    /* renamed from: a */
    public final C2591h0 m11957a(Context context, String str) throws C2593i0 {
        C2591h0 m11954o = m11954o(context, str);
        return m11954o != null ? m11954o : m11958m(context, str);
    }

    /* renamed from: m */
    public final C2591h0 m11958m(Context context, String str) {
        C2591h0 c2591h0 = new C2591h0(C4438j.m18242d(C4441m.m18251a().getPublic()), System.currentTimeMillis());
        C2591h0 m11942b = m11942b(context, str, c2591h0, true);
        if (m11942b != null && !m11942b.equals(c2591h0)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            }
            return m11942b;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Generated new key");
        }
        m11948h(context, str, c2591h0);
        return c2591h0;
    }
}
