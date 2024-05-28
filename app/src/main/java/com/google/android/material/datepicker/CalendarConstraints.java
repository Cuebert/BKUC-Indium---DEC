package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.C0649c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C2441a();

    /* renamed from: n */
    private final Month f9303n;

    /* renamed from: o */
    private final Month f9304o;

    /* renamed from: p */
    private final DateValidator f9305p;

    /* renamed from: q */
    private Month f9306q;

    /* renamed from: r */
    private final int f9307r;

    /* renamed from: s */
    private final int f9308s;

    /* loaded from: classes.dex */
    public interface DateValidator extends Parcelable {
        /* renamed from: m */
        boolean mo11008m(long j10);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    /* loaded from: classes.dex */
    static class C2441a implements Parcelable.Creator<CalendarConstraints> {
        C2441a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    /* loaded from: classes.dex */
    public static final class C2442b {

        /* renamed from: e */
        static final long f9309e = C2460o.m11122a(Month.m11028c(1900, 0).f9324s);

        /* renamed from: f */
        static final long f9310f = C2460o.m11122a(Month.m11028c(2100, 11).f9324s);

        /* renamed from: a */
        private long f9311a;

        /* renamed from: b */
        private long f9312b;

        /* renamed from: c */
        private Long f9313c;

        /* renamed from: d */
        private DateValidator f9314d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2442b(CalendarConstraints calendarConstraints) {
            this.f9311a = f9309e;
            this.f9312b = f9310f;
            this.f9314d = DateValidatorPointForward.m11021a(Long.MIN_VALUE);
            this.f9311a = calendarConstraints.f9303n.f9324s;
            this.f9312b = calendarConstraints.f9304o.f9324s;
            this.f9313c = Long.valueOf(calendarConstraints.f9306q.f9324s);
            this.f9314d = calendarConstraints.f9305p;
        }

        /* renamed from: a */
        public CalendarConstraints m11011a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f9314d);
            Month m11029d = Month.m11029d(this.f9311a);
            Month m11029d2 = Month.m11029d(this.f9312b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f9313c;
            return new CalendarConstraints(m11029d, m11029d2, dateValidator, l10 == null ? null : Month.m11029d(l10.longValue()), null);
        }

        /* renamed from: b */
        public C2442b m11012b(long j10) {
            this.f9313c = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, C2441a c2441a) {
        this(month, month2, dateValidator, month3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Month m11001e(Month month) {
        if (month.compareTo(this.f9303n) < 0) {
            return this.f9303n;
        }
        return month.compareTo(this.f9304o) > 0 ? this.f9304o : month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f9303n.equals(calendarConstraints.f9303n) && this.f9304o.equals(calendarConstraints.f9304o) && C0649c.m3452a(this.f9306q, calendarConstraints.f9306q) && this.f9305p.equals(calendarConstraints.f9305p);
    }

    /* renamed from: f */
    public DateValidator m11002f() {
        return this.f9305p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Month m11003g() {
        return this.f9304o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m11004h() {
        return this.f9308s;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9303n, this.f9304o, this.f9306q, this.f9305p});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Month m11005j() {
        return this.f9306q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public Month m11006n() {
        return this.f9303n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m11007q() {
        return this.f9307r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f9303n, 0);
        parcel.writeParcelable(this.f9304o, 0);
        parcel.writeParcelable(this.f9306q, 0);
        parcel.writeParcelable(this.f9305p, 0);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f9303n = month;
        this.f9304o = month2;
        this.f9306q = month3;
        this.f9305p = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f9308s = month.m11038t(month2) + 1;
        this.f9307r = (month2.f9321p - month.f9321p) + 1;
    }
}
