package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.j3 */
/* loaded from: classes.dex */
public final class C2185j3 {

    /* renamed from: a */
    public final String f8200a;

    /* renamed from: b */
    public final String f8201b;

    /* renamed from: c */
    public final long f8202c;

    /* renamed from: d */
    public final Bundle f8203d;

    public C2185j3(String str, String str2, Bundle bundle, long j10) {
        this.f8200a = str;
        this.f8201b = str2;
        this.f8203d = bundle;
        this.f8202c = j10;
    }

    /* renamed from: b */
    public static C2185j3 m10060b(zzat zzatVar) {
        return new C2185j3(zzatVar.f8838n, zzatVar.f8840p, zzatVar.f8839o.m10410z(), zzatVar.f8841q);
    }

    /* renamed from: a */
    public final zzat m10061a() {
        return new zzat(this.f8200a, new zzar(new Bundle(this.f8203d)), this.f8201b, this.f8202c);
    }

    public final String toString() {
        String str = this.f8201b;
        String str2 = this.f8200a;
        String obj = this.f8203d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + obj.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(obj);
        return sb2.toString();
    }
}
