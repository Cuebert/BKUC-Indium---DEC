package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C2443a();

    /* renamed from: n */
    private final long f9315n;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    /* loaded from: classes.dex */
    static class C2443a implements Parcelable.Creator<DateValidatorPointForward> {
        C2443a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i10) {
            return new DateValidatorPointForward[i10];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j10, C2443a c2443a) {
        this(j10);
    }

    /* renamed from: a */
    public static DateValidatorPointForward m11021a(long j10) {
        return new DateValidatorPointForward(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f9315n == ((DateValidatorPointForward) obj).f9315n;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9315n)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: m */
    public boolean mo11008m(long j10) {
        return j10 >= this.f9315n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9315n);
    }

    private DateValidatorPointForward(long j10) {
        this.f9315n = j10;
    }
}
