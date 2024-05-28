package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.k5 */
/* loaded from: classes.dex */
public final class C2198k5 {

    /* renamed from: a */
    final Context f8238a;

    /* renamed from: b */
    String f8239b;

    /* renamed from: c */
    String f8240c;

    /* renamed from: d */
    String f8241d;

    /* renamed from: e */
    Boolean f8242e;

    /* renamed from: f */
    long f8243f;

    /* renamed from: g */
    zzcl f8244g;

    /* renamed from: h */
    boolean f8245h;

    /* renamed from: i */
    final Long f8246i;

    /* renamed from: j */
    String f8247j;

    public C2198k5(Context context, zzcl zzclVar, Long l10) {
        this.f8245h = true;
        C5984j.m21286j(context);
        Context applicationContext = context.getApplicationContext();
        C5984j.m21286j(applicationContext);
        this.f8238a = applicationContext;
        this.f8246i = l10;
        if (zzclVar != null) {
            this.f8244g = zzclVar;
            this.f8239b = zzclVar.f7362s;
            this.f8240c = zzclVar.f7361r;
            this.f8241d = zzclVar.f7360q;
            this.f8245h = zzclVar.f7359p;
            this.f8243f = zzclVar.f7358o;
            this.f8247j = zzclVar.f7364u;
            Bundle bundle = zzclVar.f7363t;
            if (bundle != null) {
                this.f8242e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
