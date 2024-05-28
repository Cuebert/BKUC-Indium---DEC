package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p004a3.C0029b;
import p295x2.C5509d;
import p295x2.InterfaceC5518m;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements InterfaceC5518m, ReflectedParcelable {

    /* renamed from: n */
    final int f6132n;

    /* renamed from: o */
    private final int f6133o;

    /* renamed from: p */
    private final String f6134p;

    /* renamed from: q */
    private final PendingIntent f6135q;

    /* renamed from: r */
    private final ConnectionResult f6136r;

    /* renamed from: s */
    public static final Status f6124s = new Status(-1);

    /* renamed from: t */
    public static final Status f6125t = new Status(0);

    /* renamed from: u */
    public static final Status f6126u = new Status(14);

    /* renamed from: v */
    public static final Status f6127v = new Status(8);

    /* renamed from: w */
    public static final Status f6128w = new Status(15);

    /* renamed from: x */
    public static final Status f6129x = new Status(16);

    /* renamed from: z */
    public static final Status f6131z = new Status(17);

    /* renamed from: y */
    public static final Status f6130y = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C1344b();

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f6132n = i10;
        this.f6133o = i11;
        this.f6134p = str;
        this.f6135q = pendingIntent;
        this.f6136r = connectionResult;
    }

    /* renamed from: A */
    public boolean m7409A() {
        return this.f6135q != null;
    }

    /* renamed from: B */
    public boolean m7410B() {
        return this.f6133o <= 0;
    }

    /* renamed from: C */
    public void m7411C(Activity activity, int i10) throws IntentSender.SendIntentException {
        if (m7409A()) {
            PendingIntent pendingIntent = this.f6135q;
            C5984j.m21286j(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    /* renamed from: D */
    public final String m7412D() {
        String str = this.f6134p;
        return str != null ? str : C5509d.m20261a(this.f6133o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f6132n == status.f6132n && this.f6133o == status.f6133o && C5980h.m21269b(this.f6134p, status.f6134p) && C5980h.m21269b(this.f6135q, status.f6135q) && C5980h.m21269b(this.f6136r, status.f6136r);
    }

    public int hashCode() {
        return C5980h.m21270c(Integer.valueOf(this.f6132n), Integer.valueOf(this.f6133o), this.f6134p, this.f6135q, this.f6136r);
    }

    @Override // p295x2.InterfaceC5518m
    /* renamed from: q */
    public Status mo7413q() {
        return this;
    }

    public String toString() {
        C5980h.a m21271d = C5980h.m21271d(this);
        m21271d.m21272a("statusCode", m7412D());
        m21271d.m21272a("resolution", this.f6135q);
        return m21271d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, m7415y());
        C0029b.m215s(parcel, 2, m7416z(), false);
        C0029b.m213q(parcel, 3, this.f6135q, i10, false);
        C0029b.m213q(parcel, 4, m7414x(), i10, false);
        C0029b.m208l(parcel, 1000, this.f6132n);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public ConnectionResult m7414x() {
        return this.f6136r;
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: y */
    public int m7415y() {
        return this.f6133o;
    }

    /* renamed from: z */
    public String m7416z() {
        return this.f6134p;
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(1, i10, str, pendingIntent, null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i10) {
        this(1, i10, str, connectionResult.m7382z(), connectionResult);
    }
}
