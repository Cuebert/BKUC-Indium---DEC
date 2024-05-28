package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
/* loaded from: classes.dex */
public final class C2174i3 extends AbstractC2165h5 {

    /* renamed from: c */
    private char f8166c;

    /* renamed from: d */
    private long f8167d;

    /* renamed from: e */
    private String f8168e;

    /* renamed from: f */
    private final C2152g3 f8169f;

    /* renamed from: g */
    private final C2152g3 f8170g;

    /* renamed from: h */
    private final C2152g3 f8171h;

    /* renamed from: i */
    private final C2152g3 f8172i;

    /* renamed from: j */
    private final C2152g3 f8173j;

    /* renamed from: k */
    private final C2152g3 f8174k;

    /* renamed from: l */
    private final C2152g3 f8175l;

    /* renamed from: m */
    private final C2152g3 f8176m;

    /* renamed from: n */
    private final C2152g3 f8177n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2174i3(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8166c = (char) 0;
        this.f8167d = -1L;
        this.f8169f = new C2152g3(this, 6, false, false);
        this.f8170g = new C2152g3(this, 6, true, false);
        this.f8171h = new C2152g3(this, 6, false, true);
        this.f8172i = new C2152g3(this, 5, false, false);
        this.f8173j = new C2152g3(this, 5, true, false);
        this.f8174k = new C2152g3(this, 5, false, true);
        this.f8175l = new C2152g3(this, 4, false, false);
        this.f8176m = new C2152g3(this, 3, false, false);
        this.f8177n = new C2152g3(this, 2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static String m10037A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String m10038B = m10038B(z10, obj);
        String m10038B2 = m10038B(z10, obj2);
        String m10038B3 = m10038B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m10038B)) {
            sb2.append(str2);
            sb2.append(m10038B);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(m10038B2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(m10038B2);
        }
        if (!TextUtils.isEmpty(m10038B3)) {
            sb2.append(str3);
            sb2.append(m10038B3);
        }
        return sb2.toString();
    }

    /* renamed from: B */
    static String m10038B(boolean z10, Object obj) {
        String str;
        String className;
        String str2 = BuildConfig.FLAVOR;
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder(str2.length() + 43 + str2.length());
            sb2.append(str2);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str2);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            StringBuilder sb3 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
            String m10041G = m10041G(C2219m4.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m10041G(className).equals(m10041G)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
                i10++;
            }
            return sb3.toString();
        }
        if (!(obj instanceof C2163h3)) {
            return z10 ? "-" : obj.toString();
        }
        str = ((C2163h3) obj).f8133a;
        return str;
    }

    /* renamed from: G */
    private static String m10041G(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public static Object m10044z(String str) {
        if (str == null) {
            return null;
        }
        return new C2163h3(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final String m10045C() {
        String str;
        synchronized (this) {
            if (this.f8168e == null) {
                if (this.f8118a.m10117Q() != null) {
                    this.f8168e = this.f8118a.m10117Q();
                } else {
                    this.f8168e = this.f8118a.m10134z().m9880w();
                }
            }
            C5984j.m21286j(this.f8168e);
            str = this.f8168e;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public final void m10046F(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(m10045C(), i10)) {
            Log.println(i10, m10045C(), m10037A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        C5984j.m21286j(str);
        C2197k4 m10108G = this.f8118a.m10108G();
        if (m10108G == null) {
            Log.println(6, m10045C(), "Scheduler not set. Not logging error/warn");
        } else if (!m10108G.m9924n()) {
            Log.println(6, m10045C(), "Scheduler not initialized. Not logging error/warn");
        } else {
            m10108G.m10081z(new RunnableC2141f3(this, i10 >= 9 ? 8 : i10, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2165h5
    /* renamed from: j */
    protected final boolean mo9920j() {
        return false;
    }

    /* renamed from: q */
    public final C2152g3 m10047q() {
        return this.f8176m;
    }

    /* renamed from: r */
    public final C2152g3 m10048r() {
        return this.f8169f;
    }

    /* renamed from: s */
    public final C2152g3 m10049s() {
        return this.f8171h;
    }

    /* renamed from: t */
    public final C2152g3 m10050t() {
        return this.f8170g;
    }

    /* renamed from: u */
    public final C2152g3 m10051u() {
        return this.f8175l;
    }

    /* renamed from: v */
    public final C2152g3 m10052v() {
        return this.f8177n;
    }

    /* renamed from: w */
    public final C2152g3 m10053w() {
        return this.f8172i;
    }

    /* renamed from: x */
    public final C2152g3 m10054x() {
        return this.f8174k;
    }

    /* renamed from: y */
    public final C2152g3 m10055y() {
        return this.f8173j;
    }
}
