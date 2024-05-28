package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C2535a();

    /* renamed from: n */
    private final C2543a f10014n;

    /* renamed from: o */
    private final C2543a f10015o;

    /* renamed from: p */
    final int f10016p;

    /* renamed from: q */
    int f10017q;

    /* renamed from: r */
    int f10018r;

    /* renamed from: s */
    int f10019s;

    /* renamed from: t */
    int f10020t;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    /* loaded from: classes.dex */
    static class C2535a implements Parcelable.Creator<TimeModel> {
        C2535a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    public static String m11730a(Resources resources, CharSequence charSequence) {
        return m11731b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m11731b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    /* renamed from: c */
    private static int m11732c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f10017q == timeModel.f10017q && this.f10018r == timeModel.f10018r && this.f10016p == timeModel.f10016p && this.f10019s == timeModel.f10019s;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10016p), Integer.valueOf(this.f10017q), Integer.valueOf(this.f10018r), Integer.valueOf(this.f10019s)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10017q);
        parcel.writeInt(this.f10018r);
        parcel.writeInt(this.f10019s);
        parcel.writeInt(this.f10016p);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f10017q = i10;
        this.f10018r = i11;
        this.f10019s = i12;
        this.f10016p = i13;
        this.f10020t = m11732c(i10);
        this.f10014n = new C2543a(59);
        this.f10015o = new C2543a(i13 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
