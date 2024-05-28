package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C1343a();

    /* renamed from: n */
    final int f6122n;

    /* renamed from: o */
    private final String f6123o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i10, String str) {
        C5984j.m21283g(str, "scopeUri must not be null or empty");
        this.f6122n = i10;
        this.f6123o = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f6123o.equals(((Scope) obj).f6123o);
        }
        return false;
    }

    public int hashCode() {
        return this.f6123o.hashCode();
    }

    public String toString() {
        return this.f6123o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f6122n);
        C0029b.m215s(parcel, 2, m7408x(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7408x() {
        return this.f6123o;
    }

    public Scope(String str) {
        this(1, str);
    }
}
