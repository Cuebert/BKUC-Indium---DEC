package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C2445a();

    /* renamed from: n */
    private final Calendar f9319n;

    /* renamed from: o */
    final int f9320o;

    /* renamed from: p */
    final int f9321p;

    /* renamed from: q */
    final int f9322q;

    /* renamed from: r */
    final int f9323r;

    /* renamed from: s */
    final long f9324s;

    /* renamed from: t */
    private String f9325t;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    /* loaded from: classes.dex */
    static class C2445a implements Parcelable.Creator<Month> {
        C2445a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.m11028c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m11125d = C2460o.m11125d(calendar);
        this.f9319n = m11125d;
        this.f9320o = m11125d.get(2);
        this.f9321p = m11125d.get(1);
        this.f9322q = m11125d.getMaximum(7);
        this.f9323r = m11125d.getActualMaximum(5);
        this.f9324s = m11125d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Month m11028c(int i10, int i11) {
        Calendar m11132k = C2460o.m11132k();
        m11132k.set(1, i10);
        m11132k.set(2, i11);
        return new Month(m11132k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Month m11029d(long j10) {
        Calendar m11132k = C2460o.m11132k();
        m11132k.setTimeInMillis(j10);
        return new Month(m11132k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Month m11030e() {
        return new Month(C2460o.m11130i());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f9319n.compareTo(month.f9319n);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f9320o == month.f9320o && this.f9321p == month.f9321p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m11032f() {
        int firstDayOfWeek = this.f9319n.get(7) - this.f9319n.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f9322q : firstDayOfWeek;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public long m11033g(int i10) {
        Calendar m11125d = C2460o.m11125d(this.f9319n);
        m11125d.set(5, i10);
        return m11125d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m11034h(long j10) {
        Calendar m11125d = C2460o.m11125d(this.f9319n);
        m11125d.setTimeInMillis(j10);
        return m11125d.get(5);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9320o), Integer.valueOf(this.f9321p)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public String m11035j(Context context) {
        if (this.f9325t == null) {
            this.f9325t = C2448c.m11047c(context, this.f9319n.getTimeInMillis());
        }
        return this.f9325t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public long m11036n() {
        return this.f9319n.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public Month m11037q(int i10) {
        Calendar m11125d = C2460o.m11125d(this.f9319n);
        m11125d.add(2, i10);
        return new Month(m11125d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public int m11038t(Month month) {
        if (this.f9319n instanceof GregorianCalendar) {
            return ((month.f9321p - this.f9321p) * 12) + (month.f9320o - this.f9320o);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9321p);
        parcel.writeInt(this.f9320o);
    }
}
