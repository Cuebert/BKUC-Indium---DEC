package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzkv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkv> CREATOR = new C2136e9();

    /* renamed from: n */
    public final int f8842n;

    /* renamed from: o */
    public final String f8843o;

    /* renamed from: p */
    public final long f8844p;

    /* renamed from: q */
    public final Long f8845q;

    /* renamed from: r */
    public final String f8846r;

    /* renamed from: s */
    public final String f8847s;

    /* renamed from: t */
    public final Double f8848t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkv(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f8842n = i10;
        this.f8843o = str;
        this.f8844p = j10;
        this.f8845q = l10;
        if (i10 == 1) {
            this.f8848t = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f8848t = d10;
        }
        this.f8846r = str2;
        this.f8847s = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C2136e9.m9856a(this, parcel, i10);
    }

    /* renamed from: x */
    public final Object m10411x() {
        Long l10 = this.f8845q;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f8848t;
        if (d10 != null) {
            return d10;
        }
        String str = this.f8846r;
        if (str != null) {
            return str;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkv(C2147f9 c2147f9) {
        this(c2147f9.f8095c, c2147f9.f8096d, c2147f9.f8097e, c2147f9.f8094b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkv(String str, long j10, Object obj, String str2) {
        C5984j.m21282f(str);
        this.f8842n = 2;
        this.f8843o = str;
        this.f8844p = j10;
        this.f8847s = str2;
        if (obj == null) {
            this.f8845q = null;
            this.f8848t = null;
            this.f8846r = null;
            return;
        }
        if (obj instanceof Long) {
            this.f8845q = (Long) obj;
            this.f8848t = null;
            this.f8846r = null;
        } else if (obj instanceof String) {
            this.f8845q = null;
            this.f8848t = null;
            this.f8846r = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f8845q = null;
                this.f8848t = (Double) obj;
                this.f8846r = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
