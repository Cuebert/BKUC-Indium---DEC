package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p258u2.C4819a;
import p258u2.C4839u;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C4839u();

    /* renamed from: n */
    private final String f6099n;

    /* renamed from: o */
    private final GoogleSignInOptions f6100o;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f6099n = C5984j.m21282f(str);
        this.f6100o = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f6099n.equals(signInConfiguration.f6099n)) {
            GoogleSignInOptions googleSignInOptions = this.f6100o;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f6100o;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C4819a().m19002a(this.f6099n).m19002a(this.f6100o).m19003b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, this.f6099n, false);
        C0029b.m213q(parcel, 5, this.f6100o, i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final GoogleSignInOptions m7371x() {
        return this.f6100o;
    }
}
