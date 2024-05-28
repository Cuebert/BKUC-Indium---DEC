package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5155cc;

/* loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C5155cc();

    /* renamed from: n */
    public String f7416n;

    /* renamed from: o */
    public String f7417o;

    /* renamed from: p */
    public String f7418p;

    /* renamed from: q */
    public String f7419q;

    /* renamed from: r */
    public String f7420r;

    /* renamed from: s */
    public String f7421s;

    /* renamed from: t */
    public String f7422t;

    public zzl() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, this.f7416n, false);
        C0029b.m215s(parcel, 3, this.f7417o, false);
        C0029b.m215s(parcel, 4, this.f7418p, false);
        C0029b.m215s(parcel, 5, this.f7419q, false);
        C0029b.m215s(parcel, 6, this.f7420r, false);
        C0029b.m215s(parcel, 7, this.f7421s, false);
        C0029b.m215s(parcel, 8, this.f7422t, false);
        C0029b.m198b(parcel, m197a);
    }

    public zzl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7416n = str;
        this.f7417o = str2;
        this.f7418p = str3;
        this.f7419q = str4;
        this.f7420r = str5;
        this.f7421s = str6;
        this.f7422t = str7;
    }
}
