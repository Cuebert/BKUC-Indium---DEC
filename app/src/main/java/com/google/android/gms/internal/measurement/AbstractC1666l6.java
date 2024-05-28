package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.l6 */
/* loaded from: classes.dex */
public abstract class AbstractC1666l6<T> {

    /* renamed from: h */
    private static volatile AbstractC1634j6 f6975h;

    /* renamed from: l */
    public static final /* synthetic */ int f6979l = 0;

    /* renamed from: a */
    final C1618i6 f6980a;

    /* renamed from: b */
    final String f6981b;

    /* renamed from: c */
    private final T f6982c;

    /* renamed from: d */
    private volatile int f6983d = -1;

    /* renamed from: e */
    private volatile T f6984e;

    /* renamed from: f */
    private final boolean f6985f;

    /* renamed from: g */
    private static final Object f6974g = new Object();

    /* renamed from: i */
    private static final AtomicReference<Collection<AbstractC1666l6<?>>> f6976i = new AtomicReference<>();

    /* renamed from: j */
    private static final C1698n6 f6977j = new C1698n6(C1516c6.f6721a, null);

    /* renamed from: k */
    private static final AtomicInteger f6978k = new AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AbstractC1666l6(C1618i6 c1618i6, String str, Object obj, boolean z10, C1650k6 c1650k6) {
        if (c1618i6.f6845b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f6980a = c1618i6;
        this.f6981b = str;
        this.f6982c = obj;
        this.f6985f = true;
    }

    @Deprecated
    /* renamed from: d */
    public static void m8378d(Context context) {
        synchronized (f6974g) {
            AbstractC1634j6 abstractC1634j6 = f6975h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (abstractC1634j6 == null || abstractC1634j6.mo8329a() != context) {
                C1761r5.m8760e();
                C1682m6.m8458c();
                C1873y5.m9066e();
                f6975h = new C1697n5(context, C1858x6.m8990a(new InterfaceC1794t6() { // from class: com.google.android.gms.internal.measurement.d6

                    /* renamed from: n */
                    public final /* synthetic */ Context f6745n;

                    public /* synthetic */ C1533d6(Context context2) {
                        r1 = context2;
                    }

                    @Override // com.google.android.gms.internal.measurement.InterfaceC1794t6
                    public final Object zza() {
                        AbstractC1746q6 m8727c;
                        AbstractC1746q6 m8727c2;
                        Context context2 = r1;
                        int i10 = AbstractC1666l6.f6979l;
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                            return AbstractC1746q6.m8727c();
                        }
                        if (C1681m5.m8456a() && !context2.isDeviceProtectedStorage()) {
                            context2 = context2.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                m8727c = file.exists() ? AbstractC1746q6.m8728d(file) : AbstractC1746q6.m8727c();
                            } catch (RuntimeException e10) {
                                Log.e("HermeticFileOverrides", "no data dir", e10);
                                m8727c = AbstractC1746q6.m8727c();
                            }
                            if (m8727c.mo8639b()) {
                                File file2 = (File) m8727c.mo8638a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        HashMap hashMap = new HashMap();
                                        HashMap hashMap2 = new HashMap();
                                        while (true) {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null) {
                                                break;
                                            }
                                            String[] split = readLine.split(" ", 3);
                                            if (split.length != 3) {
                                                Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                                            } else {
                                                String str3 = new String(split[0]);
                                                String decode = Uri.decode(new String(split[1]));
                                                String str4 = (String) hashMap2.get(split[2]);
                                                if (str4 == null) {
                                                    String str5 = new String(split[2]);
                                                    str4 = Uri.decode(str5);
                                                    if (str4.length() < 1024 || str4 == str5) {
                                                        hashMap2.put(str5, str4);
                                                    }
                                                }
                                                if (!hashMap.containsKey(str3)) {
                                                    hashMap.put(str3, new HashMap());
                                                }
                                                ((Map) hashMap.get(str3)).put(decode, str4);
                                            }
                                        }
                                        String obj = file2.toString();
                                        StringBuilder sb2 = new StringBuilder(obj.length() + 7);
                                        sb2.append("Parsed ");
                                        sb2.append(obj);
                                        Log.i("HermeticFileOverrides", sb2.toString());
                                        C1889z5 c1889z5 = new C1889z5(hashMap);
                                        bufferedReader.close();
                                        m8727c2 = AbstractC1746q6.m8728d(c1889z5);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable unused) {
                                        }
                                        throw th;
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            } else {
                                m8727c2 = AbstractC1746q6.m8727c();
                            }
                            return m8727c2;
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    }
                }));
                f6978k.incrementAndGet();
            }
        }
    }

    /* renamed from: e */
    public static void m8379e() {
        f6978k.incrementAndGet();
    }

    /* renamed from: a */
    abstract T mo8088a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:21:0x0067, B:22:0x0061, B:26:0x00de, B:28:0x00ee, B:30:0x0102, B:31:0x0105, B:32:0x0109, B:33:0x00b6, B:35:0x00bc, B:38:0x00ce, B:40:0x00d4, B:42:0x00dc, B:43:0x00cc, B:45:0x006c, B:47:0x0072, B:49:0x0080, B:51:0x00a5, B:53:0x00af, B:55:0x0097, B:56:0x010e, B:57:0x0113, B:59:0x0114), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:21:0x0067, B:22:0x0061, B:26:0x00de, B:28:0x00ee, B:30:0x0102, B:31:0x0105, B:32:0x0109, B:33:0x00b6, B:35:0x00bc, B:38:0x00ce, B:40:0x00d4, B:42:0x00dc, B:43:0x00cc, B:45:0x006c, B:47:0x0072, B:49:0x0080, B:51:0x00a5, B:53:0x00af, B:55:0x0097, B:56:0x010e, B:57:0x0113, B:59:0x0114), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:21:0x0067, B:22:0x0061, B:26:0x00de, B:28:0x00ee, B:30:0x0102, B:31:0x0105, B:32:0x0109, B:33:0x00b6, B:35:0x00bc, B:38:0x00ce, B:40:0x00d4, B:42:0x00dc, B:43:0x00cc, B:45:0x006c, B:47:0x0072, B:49:0x0080, B:51:0x00a5, B:53:0x00af, B:55:0x0097, B:56:0x010e, B:57:0x0113, B:59:0x0114), top: B:7:0x0016 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T m8380b() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC1666l6.m8380b():java.lang.Object");
    }

    /* renamed from: c */
    public final String m8381c() {
        String str = this.f6980a.f6847d;
        return this.f6981b;
    }
}
