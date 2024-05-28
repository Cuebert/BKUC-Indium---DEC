package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.C1379b;
import com.google.android.gms.common.C1381d;
import com.google.android.gms.internal.measurement.C1608hd;
import com.google.android.gms.internal.measurement.InterfaceC1613i1;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p018b4.C0999m;
import p018b4.C1000n;
import p018b4.C1001o;
import p018b4.C1002p;
import p070f3.C3131e;
import p096h3.C3393c;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.h9 */
/* loaded from: classes.dex */
public final class C2169h9 extends AbstractC2165h5 {

    /* renamed from: g */
    private static final String[] f8146g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f8147h = {"_err"};

    /* renamed from: i */
    public static final /* synthetic */ int f8148i = 0;

    /* renamed from: c */
    private SecureRandom f8149c;

    /* renamed from: d */
    private final AtomicLong f8150d;

    /* renamed from: e */
    private int f8151e;

    /* renamed from: f */
    private Integer f8152f;

    public C2169h9(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8152f = null;
        this.f8150d = new AtomicLong(0L);
    }

    /* renamed from: V */
    public static boolean m9926V(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: W */
    public static boolean m9927W(String str) {
        C5984j.m21282f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: X */
    public static boolean m9928X(Context context) {
        ActivityInfo receiverInfo;
        C5984j.m21286j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: Y */
    public static boolean m9929Y(Context context, boolean z10) {
        C5984j.m21286j(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m9937i0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m9937i0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: Z */
    public static boolean m9930Z(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: a0 */
    public static boolean m9931a0(String str) {
        return !f8147h[0].equals(str);
    }

    /* renamed from: d0 */
    static final boolean m9932d0(Bundle bundle, int i10) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    /* renamed from: e0 */
    static final boolean m9933e0(String str) {
        C5984j.m21286j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: f0 */
    private final int m9934f0(String str) {
        if ("_ldl".equals(str)) {
            this.f8118a.m10134z();
            return 2048;
        }
        if (!"_id".equals(str)) {
            if (this.f8118a.m10134z().m9861B(null, C2335x2.f8703d0) && "_lgclid".equals(str)) {
                this.f8118a.m10134z();
                return 100;
            }
            this.f8118a.m10134z();
            return 36;
        }
        this.f8118a.m10134z();
        return 256;
    }

    /* renamed from: g0 */
    private final Object m9935g0(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle m9980u0 = m9980u0((Bundle) parcelable);
                    if (!m9980u0.isEmpty()) {
                        arrayList.add(m9980u0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return m9974q(obj.toString(), i10, z10);
    }

    /* renamed from: h0 */
    private static boolean m9936h0(String str, String[] strArr) {
        C5984j.m21286j(strArr);
        for (String str2 : strArr) {
            if (m9930Z(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    private static boolean m9937i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: q0 */
    public static long m9938q0(byte[] bArr) {
        C5984j.m21286j(bArr);
        int length = bArr.length;
        int i10 = 0;
        C5984j.m21289m(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    /* renamed from: s */
    public static MessageDigest m9939s() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: u */
    public static ArrayList<Bundle> m9940u(List<zzab> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzab zzabVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzabVar.f8826n);
            bundle.putString("origin", zzabVar.f8827o);
            bundle.putLong("creation_timestamp", zzabVar.f8829q);
            bundle.putString("name", zzabVar.f8828p.f8843o);
            C0999m.m6229b(bundle, C5984j.m21286j(zzabVar.f8828p.m10411x()));
            bundle.putBoolean("active", zzabVar.f8830r);
            String str = zzabVar.f8831s;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzat zzatVar = zzabVar.f8832t;
            if (zzatVar != null) {
                bundle.putString("timed_out_event_name", zzatVar.f8838n);
                zzar zzarVar = zzatVar.f8839o;
                if (zzarVar != null) {
                    bundle.putBundle("timed_out_event_params", zzarVar.m10410z());
                }
            }
            bundle.putLong("trigger_timeout", zzabVar.f8833u);
            zzat zzatVar2 = zzabVar.f8834v;
            if (zzatVar2 != null) {
                bundle.putString("triggered_event_name", zzatVar2.f8838n);
                zzar zzarVar2 = zzatVar2.f8839o;
                if (zzarVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzarVar2.m10410z());
                }
            }
            bundle.putLong("triggered_timestamp", zzabVar.f8828p.f8844p);
            bundle.putLong("time_to_live", zzabVar.f8835w);
            zzat zzatVar3 = zzabVar.f8836x;
            if (zzatVar3 != null) {
                bundle.putString("expired_event_name", zzatVar3.f8838n);
                zzar zzarVar3 = zzatVar3.f8839o;
                if (zzarVar3 != null) {
                    bundle.putBundle("expired_event_params", zzarVar3.m10410z());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: x */
    public static void m9941x(C2276r6 c2276r6, Bundle bundle, boolean z10) {
        if (bundle != null && c2276r6 != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = c2276r6.f8505a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c2276r6.f8506b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c2276r6.f8507c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && c2276r6 == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: A */
    public final void m9942A(InterfaceC2158g9 interfaceC2158g9, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m9932d0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        interfaceC2158g9.mo9727a(str, "_err", bundle);
    }

    /* renamed from: B */
    public final void m9943B(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f8118a.mo9765d().m10054x().m9895c("Not putting event parameter. Invalid value type. name, type", this.f8118a.m10105D().m9810e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* renamed from: C */
    public final void m9944C(InterfaceC1613i1 interfaceC1613i1, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            interfaceC1613i1.mo7941m(bundle);
        } catch (RemoteException e10) {
            this.f8118a.mo9765d().m10053w().m9894b("Error returning boolean value to wrapper", e10);
        }
    }

    /* renamed from: D */
    public final void m9945D(InterfaceC1613i1 interfaceC1613i1, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC1613i1.mo7941m(bundle);
        } catch (RemoteException e10) {
            this.f8118a.mo9765d().m10053w().m9894b("Error returning bundle list to wrapper", e10);
        }
    }

    /* renamed from: E */
    public final void m9946E(InterfaceC1613i1 interfaceC1613i1, Bundle bundle) {
        try {
            interfaceC1613i1.mo7941m(bundle);
        } catch (RemoteException e10) {
            this.f8118a.mo9765d().m10053w().m9894b("Error returning bundle value to wrapper", e10);
        }
    }

    /* renamed from: F */
    public final void m9947F(InterfaceC1613i1 interfaceC1613i1, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC1613i1.mo7941m(bundle);
        } catch (RemoteException e10) {
            this.f8118a.mo9765d().m10053w().m9894b("Error returning byte array to wrapper", e10);
        }
    }

    /* renamed from: G */
    public final void m9948G(InterfaceC1613i1 interfaceC1613i1, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            interfaceC1613i1.mo7941m(bundle);
        } catch (RemoteException e10) {
            this.f8118a.mo9765d().m10053w().m9894b("Error returning int value to wrapper", e10);
        }
    }

    /* renamed from: H */
    public final void m9949H(InterfaceC1613i1 interfaceC1613i1, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            interfaceC1613i1.mo7941m(bundle);
        } catch (RemoteException e10) {
            this.f8118a.mo9765d().m10053w().m9894b("Error returning long value to wrapper", e10);
        }
    }

    /* renamed from: I */
    public final void m9950I(InterfaceC1613i1 interfaceC1613i1, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC1613i1.mo7941m(bundle);
        } catch (RemoteException e10) {
            this.f8118a.mo9765d().m10053w().m9894b("Error returning string value to wrapper", e10);
        }
    }

    /* renamed from: J */
    final void m9951J(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int i10;
        String str4;
        int m9956O;
        if (bundle == null) {
            return;
        }
        this.f8118a.m10134z();
        int i11 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int m9968m0 = !z10 ? m9968m0(str5) : 0;
                if (m9968m0 == 0) {
                    m9968m0 = m9967l0(str5);
                }
                i10 = m9968m0;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                m9983w(bundle, i10, str5, str5, i10 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (m9961T(bundle.get(str5))) {
                    this.f8118a.mo9765d().m10054x().m9896d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    str4 = str5;
                    m9956O = 22;
                } else {
                    str4 = str5;
                    m9956O = m9956O(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (m9956O != 0 && !"_ev".equals(str4)) {
                    m9983w(bundle, m9956O, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (m9927W(str4) && !m9936h0(str4, C1001o.f5188d) && (i11 = i11 + 1) > 0) {
                    this.f8118a.mo9765d().m10049s().m9895c("Item cannot contain custom parameters", this.f8118a.m10105D().m9809d(str2), this.f8118a.m10105D().m9807b(bundle));
                    m9932d0(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    /* renamed from: K */
    public final boolean m9952K(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (m9933e0(str)) {
                return true;
            }
            if (this.f8118a.m10129q()) {
                this.f8118a.mo9765d().m10049s().m9894b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2174i3.m10044z(str));
            }
            return false;
        }
        C1608hd.m8291b();
        if (this.f8118a.m10134z().m9861B(null, C2335x2.f8705e0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (m9933e0(str2)) {
                return true;
            }
            this.f8118a.mo9765d().m10049s().m9894b("Invalid admob_app_id. Analytics disabled.", C2174i3.m10044z(str2));
            return false;
        }
        if (this.f8118a.m10129q()) {
            this.f8118a.mo9765d().m10049s().m9893a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m9953L(String str, int i10, String str2) {
        if (str2 == null) {
            this.f8118a.mo9765d().m10049s().m9894b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.f8118a.mo9765d().m10049s().m9896d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    /* renamed from: M */
    public final boolean m9954M(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f8118a.mo9765d().m10049s().m9894b("Name is required and can't be null. Type", str);
            return false;
        }
        C5984j.m21286j(str2);
        String[] strArr3 = f8146g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f8118a.mo9765d().m10049s().m9895c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m9936h0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m9936h0(str2, strArr2)) {
            return true;
        }
        this.f8118a.mo9765d().m10049s().m9895c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* renamed from: N */
    public final boolean m9955N(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i10) {
                this.f8118a.mo9765d().m10054x().m9896d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int m9956O(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2169h9.m9956O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: P */
    public final boolean m9957P(String str, String str2) {
        if (str2 == null) {
            this.f8118a.mo9765d().m10049s().m9894b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f8118a.mo9765d().m10049s().m9894b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.f8118a.mo9765d().m10049s().m9895c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f8118a.mo9765d().m10049s().m9895c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: Q */
    public final boolean m9958Q(String str, String str2) {
        if (str2 == null) {
            this.f8118a.mo9765d().m10049s().m9894b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f8118a.mo9765d().m10049s().m9894b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.f8118a.mo9765d().m10049s().m9895c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f8118a.mo9765d().m10049s().m9895c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: R */
    public final boolean m9959R(String str) {
        mo9917h();
        if (C3393c.m14952a(this.f8118a.mo9763c()).m14946a(str) == 0) {
            return true;
        }
        this.f8118a.mo9765d().m10047q().m9894b("Permission not granted", str);
        return false;
    }

    /* renamed from: S */
    public final boolean m9960S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String m9878u = this.f8118a.m10134z().m9878u();
        this.f8118a.mo9768f();
        return m9878u.equals(str);
    }

    /* renamed from: T */
    public final boolean m9961T(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: U */
    public final boolean m9962U(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo m14949d = C3393c.m14952a(context).m14949d(str, 64);
            if (m14949d == null || (signatureArr = m14949d.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            this.f8118a.mo9765d().m10048r().m9894b("Package name not found", e10);
            return true;
        } catch (CertificateException e11) {
            this.f8118a.mo9765d().m10048r().m9894b("Error obtaining certificate", e11);
            return true;
        }
    }

    /* renamed from: b0 */
    public final boolean m9963b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C5984j.m21286j(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: c0 */
    public final byte[] m9964c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2165h5
    /* renamed from: i */
    protected final void mo9919i() {
        mo9917h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f8118a.mo9765d().m10053w().m9893a("Utils falling back to Random for random id");
            }
        }
        this.f8150d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2165h5
    /* renamed from: j */
    protected final boolean mo9920j() {
        return true;
    }

    /* renamed from: j0 */
    public final int m9965j0(String str, Object obj) {
        boolean m9955N;
        if ("_ldl".equals(str)) {
            m9955N = m9955N("user property referrer", str, m9934f0(str), obj);
        } else {
            m9955N = m9955N("user property", str, m9934f0(str), obj);
        }
        return m9955N ? 0 : 7;
    }

    /* renamed from: k0 */
    public final int m9966k0(String str) {
        if (!m9957P("event", str)) {
            return 2;
        }
        if (!m9954M("event", C1000n.f5181a, C1000n.f5182b, str)) {
            return 13;
        }
        this.f8118a.m10134z();
        return !m9953L("event", 40, str) ? 2 : 0;
    }

    /* renamed from: l0 */
    final int m9967l0(String str) {
        if (!m9957P("event param", str)) {
            return 3;
        }
        if (!m9954M("event param", null, null, str)) {
            return 14;
        }
        this.f8118a.m10134z();
        return !m9953L("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: m0 */
    final int m9968m0(String str) {
        if (!m9958Q("event param", str)) {
            return 3;
        }
        if (!m9954M("event param", null, null, str)) {
            return 14;
        }
        this.f8118a.m10134z();
        return !m9953L("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: n0 */
    public final int m9969n0(String str) {
        if (!m9957P("user property", str)) {
            return 6;
        }
        if (!m9954M("user property", C1002p.f5189a, null, str)) {
            return 15;
        }
        this.f8118a.m10134z();
        return !m9953L("user property", 24, str) ? 6 : 0;
    }

    /* renamed from: o */
    public final Object m9970o(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.f8118a.m10134z();
            return m9935g0(256, obj, true, true);
        }
        if (m9926V(str)) {
            this.f8118a.m10134z();
        } else {
            this.f8118a.m10134z();
            i10 = 100;
        }
        return m9935g0(i10, obj, false, true);
    }

    /* renamed from: o0 */
    public final int m9971o0() {
        if (this.f8152f == null) {
            this.f8152f = Integer.valueOf(C1379b.m7589f().m7590a(this.f8118a.mo9763c()) / 1000);
        }
        return this.f8152f.intValue();
    }

    /* renamed from: p */
    public final Object m9972p(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m9935g0(m9934f0(str), obj, true, false);
        }
        return m9935g0(m9934f0(str), obj, false, false);
    }

    /* renamed from: p0 */
    public final int m9973p0(int i10) {
        return C1379b.m7589f().mo7391h(this.f8118a.mo9763c(), C1381d.f6259a);
    }

    /* renamed from: q */
    public final String m9974q(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    /* renamed from: r */
    public final URL m9975r(long j10, String str, String str2, long j11) {
        try {
            C5984j.m21282f(str2);
            C5984j.m21282f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 46000L, Integer.valueOf(m9971o0())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f8118a.m10134z().m9879v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            this.f8118a.mo9765d().m10048r().m9894b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    /* renamed from: r0 */
    public final long m9976r0() {
        long andIncrement;
        long j10;
        if (this.f8150d.get() == 0) {
            synchronized (this.f8150d) {
                long nextLong = new Random(System.nanoTime() ^ this.f8118a.mo9767e().mo13781a()).nextLong();
                int i10 = this.f8151e + 1;
                this.f8151e = i10;
                j10 = nextLong + i10;
            }
            return j10;
        }
        synchronized (this.f8150d) {
            this.f8150d.compareAndSet(-1L, 1L);
            andIncrement = this.f8150d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: s0 */
    public final long m9977s0(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    /* renamed from: t */
    public final SecureRandom m9978t() {
        mo9917h();
        if (this.f8149c == null) {
            this.f8149c = new SecureRandom();
        }
        return this.f8149c;
    }

    /* renamed from: t0 */
    public final Bundle m9979t0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                this.f8118a.mo9765d().m10053w().m9894b("Install referrer url isn't a hierarchical URI", e10);
            }
        }
        return null;
    }

    /* renamed from: u0 */
    public final Bundle m9980u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m9970o = m9970o(str, bundle.get(str));
                if (m9970o == null) {
                    this.f8118a.mo9765d().m10054x().m9894b("Param value can't be null", this.f8118a.m10105D().m9810e(str));
                } else {
                    m9943B(bundle2, str, m9970o);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: v */
    public final void m9981v(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f8118a.mo9765d().m10053w().m9894b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0108 A[SYNTHETIC] */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m9982v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List<java.lang.String> r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2169h9.m9982v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* renamed from: w */
    final void m9983w(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (m9932d0(bundle, i10)) {
            this.f8118a.m10134z();
            bundle.putString("_ev", m9974q(str, 40, true));
            if (obj != null) {
                C5984j.m21286j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* renamed from: w0 */
    public final zzat m9984w0(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m9966k0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle m9982v0 = m9982v0(str, str2, bundle3, C3131e.m13783a("_o"), true);
            if (z10) {
                m9982v0 = m9980u0(m9982v0);
            }
            C5984j.m21286j(m9982v0);
            return new zzat(str2, new zzar(m9982v0), str3, j10);
        }
        this.f8118a.mo9765d().m10048r().m9894b("Invalid conditional property event name", this.f8118a.m10105D().m9811f(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: y */
    public final void m9985y(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f8118a.m10114N().m9943B(bundle, str, bundle2.get(str));
            }
        }
    }

    /* renamed from: z */
    public final void m9986z(C2185j3 c2185j3, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(c2185j3.f8203d.keySet())) {
            if (m9927W(str) && (i11 = i11 + 1) > i10) {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Event can't contain more than ");
                sb2.append(i10);
                sb2.append(" params");
                this.f8118a.mo9765d().m10049s().m9895c(sb2.toString(), this.f8118a.m10105D().m9809d(c2185j3.f8200a), this.f8118a.m10105D().m9807b(c2185j3.f8203d));
                m9932d0(c2185j3.f8203d, 5);
                c2185j3.f8203d.remove(str);
            }
        }
    }
}
