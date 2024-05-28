package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p018b4.C1000n;
import p018b4.C1001o;
import p018b4.C1002p;
import p018b4.InterfaceC0991e;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.d3 */
/* loaded from: classes.dex */
public final class C2119d3 {

    /* renamed from: b */
    protected static final AtomicReference<String[]> f8042b = new AtomicReference<>();

    /* renamed from: c */
    protected static final AtomicReference<String[]> f8043c = new AtomicReference<>();

    /* renamed from: d */
    protected static final AtomicReference<String[]> f8044d = new AtomicReference<>();

    /* renamed from: a */
    private final InterfaceC0991e f8045a;

    public C2119d3(InterfaceC0991e interfaceC0991e) {
        this.f8045a = interfaceC0991e;
    }

    /* renamed from: g */
    private static final String m9805g(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C5984j.m21286j(strArr);
        C5984j.m21286j(strArr2);
        C5984j.m21286j(atomicReference);
        C5984j.m21277a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (C2169h9.m9930Z(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    protected final String m9806a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = m9807b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(valueOf);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m9807b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f8045a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(m9810e(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = m9806a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = m9806a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = m9806a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb2.append(valueOf);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final String m9808c(zzat zzatVar) {
        String m9807b;
        if (!this.f8045a.zza()) {
            return zzatVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzatVar.f8840p);
        sb2.append(",name=");
        sb2.append(m9809d(zzatVar.f8838n));
        sb2.append(",params=");
        zzar zzarVar = zzatVar.f8839o;
        if (zzarVar == null) {
            m9807b = null;
        } else if (!this.f8045a.zza()) {
            m9807b = zzarVar.toString();
        } else {
            m9807b = m9807b(zzarVar.m10410z());
        }
        sb2.append(m9807b);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final String m9809d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f8045a.zza() ? str : m9805g(str, C1000n.f5183c, C1000n.f5181a, f8042b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final String m9810e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f8045a.zza() ? str : m9805g(str, C1001o.f5186b, C1001o.f5185a, f8043c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final String m9811f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f8045a.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return m9805g(str, C1002p.f5190b, C1002p.f5189a, f8044d);
    }
}
