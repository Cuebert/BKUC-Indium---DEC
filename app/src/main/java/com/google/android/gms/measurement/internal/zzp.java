package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p004a3.C0029b;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C2224m9();

    /* renamed from: A */
    public final int f8849A;

    /* renamed from: B */
    public final boolean f8850B;

    /* renamed from: C */
    public final boolean f8851C;

    /* renamed from: D */
    public final String f8852D;

    /* renamed from: E */
    public final Boolean f8853E;

    /* renamed from: F */
    public final long f8854F;

    /* renamed from: G */
    public final List<String> f8855G;

    /* renamed from: H */
    public final String f8856H;

    /* renamed from: I */
    public final String f8857I;

    /* renamed from: n */
    public final String f8858n;

    /* renamed from: o */
    public final String f8859o;

    /* renamed from: p */
    public final String f8860p;

    /* renamed from: q */
    public final String f8861q;

    /* renamed from: r */
    public final long f8862r;

    /* renamed from: s */
    public final long f8863s;

    /* renamed from: t */
    public final String f8864t;

    /* renamed from: u */
    public final boolean f8865u;

    /* renamed from: v */
    public final boolean f8866v;

    /* renamed from: w */
    public final long f8867w;

    /* renamed from: x */
    public final String f8868x;

    /* renamed from: y */
    public final long f8869y;

    /* renamed from: z */
    public final long f8870z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9) {
        C5984j.m21282f(str);
        this.f8858n = str;
        this.f8859o = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f8860p = str3;
        this.f8867w = j10;
        this.f8861q = str4;
        this.f8862r = j11;
        this.f8863s = j12;
        this.f8864t = str5;
        this.f8865u = z10;
        this.f8866v = z11;
        this.f8868x = str6;
        this.f8869y = j13;
        this.f8870z = j14;
        this.f8849A = i10;
        this.f8850B = z12;
        this.f8851C = z13;
        this.f8852D = str7;
        this.f8853E = bool;
        this.f8854F = j15;
        this.f8855G = list;
        this.f8856H = str8;
        this.f8857I = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, this.f8858n, false);
        C0029b.m215s(parcel, 3, this.f8859o, false);
        C0029b.m215s(parcel, 4, this.f8860p, false);
        C0029b.m215s(parcel, 5, this.f8861q, false);
        C0029b.m211o(parcel, 6, this.f8862r);
        C0029b.m211o(parcel, 7, this.f8863s);
        C0029b.m215s(parcel, 8, this.f8864t, false);
        C0029b.m199c(parcel, 9, this.f8865u);
        C0029b.m199c(parcel, 10, this.f8866v);
        C0029b.m211o(parcel, 11, this.f8867w);
        C0029b.m215s(parcel, 12, this.f8868x, false);
        C0029b.m211o(parcel, 13, this.f8869y);
        C0029b.m211o(parcel, 14, this.f8870z);
        C0029b.m208l(parcel, 15, this.f8849A);
        C0029b.m199c(parcel, 16, this.f8850B);
        C0029b.m199c(parcel, 18, this.f8851C);
        C0029b.m215s(parcel, 19, this.f8852D, false);
        C0029b.m200d(parcel, 21, this.f8853E, false);
        C0029b.m211o(parcel, 22, this.f8854F);
        C0029b.m217u(parcel, 23, this.f8855G, false);
        C0029b.m215s(parcel, 24, this.f8856H, false);
        C0029b.m215s(parcel, 25, this.f8857I, false);
        C0029b.m198b(parcel, m197a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9) {
        this.f8858n = str;
        this.f8859o = str2;
        this.f8860p = str3;
        this.f8867w = j12;
        this.f8861q = str4;
        this.f8862r = j10;
        this.f8863s = j11;
        this.f8864t = str5;
        this.f8865u = z10;
        this.f8866v = z11;
        this.f8868x = str6;
        this.f8869y = j13;
        this.f8870z = j14;
        this.f8849A = i10;
        this.f8850B = z12;
        this.f8851C = z13;
        this.f8852D = str7;
        this.f8853E = bool;
        this.f8854F = j15;
        this.f8855G = list;
        this.f8856H = str8;
        this.f8857I = str9;
    }
}
