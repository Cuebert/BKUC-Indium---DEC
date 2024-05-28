package com.google.android.gms.measurement.internal;

import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.o */
/* loaded from: classes.dex */
final class C2236o {

    /* renamed from: a */
    final String f8377a;

    /* renamed from: b */
    final String f8378b;

    /* renamed from: c */
    final long f8379c;

    /* renamed from: d */
    final long f8380d;

    /* renamed from: e */
    final long f8381e;

    /* renamed from: f */
    final long f8382f;

    /* renamed from: g */
    final long f8383g;

    /* renamed from: h */
    final Long f8384h;

    /* renamed from: i */
    final Long f8385i;

    /* renamed from: j */
    final Long f8386j;

    /* renamed from: k */
    final Boolean f8387k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2236o(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        C5984j.m21282f(str);
        C5984j.m21282f(str2);
        C5984j.m21277a(j10 >= 0);
        C5984j.m21277a(j11 >= 0);
        C5984j.m21277a(j12 >= 0);
        C5984j.m21277a(j14 >= 0);
        this.f8377a = str;
        this.f8378b = str2;
        this.f8379c = j10;
        this.f8380d = j11;
        this.f8381e = j12;
        this.f8382f = j13;
        this.f8383g = j14;
        this.f8384h = l10;
        this.f8385i = l11;
        this.f8386j = l12;
        this.f8387k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2236o m10196a(Long l10, Long l11, Boolean bool) {
        return new C2236o(this.f8377a, this.f8378b, this.f8379c, this.f8380d, this.f8381e, this.f8382f, this.f8383g, this.f8384h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2236o m10197b(long j10, long j11) {
        return new C2236o(this.f8377a, this.f8378b, this.f8379c, this.f8380d, this.f8381e, this.f8382f, j10, Long.valueOf(j11), this.f8385i, this.f8386j, this.f8387k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C2236o m10198c(long j10) {
        return new C2236o(this.f8377a, this.f8378b, this.f8379c, this.f8380d, this.f8381e, j10, this.f8383g, this.f8384h, this.f8385i, this.f8386j, this.f8387k);
    }
}
