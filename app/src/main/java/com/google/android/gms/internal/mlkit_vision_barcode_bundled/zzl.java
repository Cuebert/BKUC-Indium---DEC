package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5530g;

/* loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C5530g();

    /* renamed from: n */
    private final String f7579n;

    /* renamed from: o */
    private final String f7580o;

    /* renamed from: p */
    private final String f7581p;

    /* renamed from: q */
    private final String f7582q;

    /* renamed from: r */
    private final String f7583r;

    /* renamed from: s */
    private final String f7584s;

    /* renamed from: t */
    private final String f7585t;

    public zzl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7579n = str;
        this.f7580o = str2;
        this.f7581p = str3;
        this.f7582q = str4;
        this.f7583r = str5;
        this.f7584s = str6;
        this.f7585t = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7579n, false);
        C0029b.m215s(parcel, 2, this.f7580o, false);
        C0029b.m215s(parcel, 3, this.f7581p, false);
        C0029b.m215s(parcel, 4, this.f7582q, false);
        C0029b.m215s(parcel, 5, this.f7583r, false);
        C0029b.m215s(parcel, 6, this.f7584s, false);
        C0029b.m215s(parcel, 7, this.f7585t, false);
        C0029b.m198b(parcel, m197a);
    }
}
