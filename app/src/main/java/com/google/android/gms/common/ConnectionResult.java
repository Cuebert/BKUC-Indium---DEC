package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5980h;

/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: n */
    final int f6109n;

    /* renamed from: o */
    private final int f6110o;

    /* renamed from: p */
    private final PendingIntent f6111p;

    /* renamed from: q */
    private final String f6112q;

    /* renamed from: r */
    public static final ConnectionResult f6108r = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C1384g();

    public ConnectionResult(int i10) {
        this(i10, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f6109n = i10;
        this.f6110o = i11;
        this.f6111p = pendingIntent;
        this.f6112q = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static String m7377C(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    /* renamed from: A */
    public boolean m7378A() {
        return (this.f6110o == 0 || this.f6111p == null) ? false : true;
    }

    /* renamed from: B */
    public boolean m7379B() {
        return this.f6110o == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f6110o == connectionResult.f6110o && C5980h.m21269b(this.f6111p, connectionResult.f6111p) && C5980h.m21269b(this.f6112q, connectionResult.f6112q);
    }

    public int hashCode() {
        return C5980h.m21270c(Integer.valueOf(this.f6110o), this.f6111p, this.f6112q);
    }

    public String toString() {
        C5980h.a m21271d = C5980h.m21271d(this);
        m21271d.m21272a("statusCode", m7377C(this.f6110o));
        m21271d.m21272a("resolution", this.f6111p);
        m21271d.m21272a("message", this.f6112q);
        return m21271d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f6109n);
        C0029b.m208l(parcel, 2, m7380x());
        C0029b.m213q(parcel, 3, m7382z(), i10, false);
        C0029b.m215s(parcel, 4, m7381y(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public int m7380x() {
        return this.f6110o;
    }

    /* renamed from: y */
    public String m7381y() {
        return this.f6112q;
    }

    /* renamed from: z */
    public PendingIntent m7382z() {
        return this.f6111p;
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
