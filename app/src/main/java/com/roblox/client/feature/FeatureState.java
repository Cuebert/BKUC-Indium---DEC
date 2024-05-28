package com.roblox.client.feature;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class FeatureState implements Parcelable {
    public static final Parcelable.Creator<FeatureState> CREATOR = new C2826a();

    /* renamed from: n */
    private String f11191n;

    /* renamed from: o */
    private Bundle f11192o;

    /* renamed from: com.roblox.client.feature.FeatureState$a */
    /* loaded from: classes.dex */
    class C2826a implements Parcelable.Creator<FeatureState> {
        C2826a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FeatureState createFromParcel(Parcel parcel) {
            return new FeatureState(parcel, (C2826a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FeatureState[] newArray(int i10) {
            return new FeatureState[i10];
        }
    }

    /* synthetic */ FeatureState(Parcel parcel, C2826a c2826a) {
        this(parcel);
    }

    /* renamed from: a */
    public Bundle m12512a() {
        if (this.f11192o == null) {
            this.f11192o = new Bundle();
        }
        return this.f11192o;
    }

    /* renamed from: b */
    public long m12513b(String str, long j10) {
        return m12512a().getLong(str, j10);
    }

    /* renamed from: c */
    public String m12514c() {
        return this.f11191n;
    }

    /* renamed from: d */
    public void m12515d(String str, long j10) {
        m12512a().putLong(str, j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11191n);
        parcel.writeBundle(this.f11192o);
    }

    public FeatureState(String str) {
        this(str, new Bundle());
    }

    public FeatureState(String str, Bundle bundle) {
        this.f11191n = str;
        this.f11192o = bundle;
    }

    private FeatureState(Parcel parcel) {
        this.f11191n = parcel.readString();
        this.f11192o = parcel.readBundle();
    }
}
