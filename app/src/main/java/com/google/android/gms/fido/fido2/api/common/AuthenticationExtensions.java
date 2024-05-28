package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new C1467n();

    /* renamed from: n */
    private final FidoAppIdExtension f6471n;

    /* renamed from: o */
    private final zzs f6472o;

    /* renamed from: p */
    private final UserVerificationMethodExtension f6473p;

    /* renamed from: q */
    private final zzz f6474q;

    /* renamed from: r */
    private final zzab f6475r;

    /* renamed from: s */
    private final zzad f6476s;

    /* renamed from: t */
    private final zzu f6477t;

    /* renamed from: u */
    private final zzag f6478u;

    /* renamed from: v */
    private final GoogleThirdPartyPaymentExtension f6479v;

    /* renamed from: w */
    private final zzai f6480w;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions$a */
    /* loaded from: classes.dex */
    public static final class C1446a {

        /* renamed from: a */
        private FidoAppIdExtension f6481a;

        /* renamed from: b */
        private UserVerificationMethodExtension f6482b;

        /* renamed from: c */
        private zzs f6483c;

        /* renamed from: d */
        private zzz f6484d;

        /* renamed from: e */
        private zzab f6485e;

        /* renamed from: f */
        private zzad f6486f;

        /* renamed from: g */
        private zzu f6487g;

        /* renamed from: h */
        private zzag f6488h;

        /* renamed from: i */
        private GoogleThirdPartyPaymentExtension f6489i;

        /* renamed from: j */
        private zzai f6490j;

        /* renamed from: a */
        public AuthenticationExtensions m7783a() {
            return new AuthenticationExtensions(this.f6481a, this.f6483c, this.f6482b, this.f6484d, this.f6485e, this.f6486f, this.f6487g, this.f6488h, this.f6489i, this.f6490j);
        }

        /* renamed from: b */
        public C1446a m7784b(FidoAppIdExtension fidoAppIdExtension) {
            this.f6481a = fidoAppIdExtension;
            return this;
        }

        /* renamed from: c */
        public C1446a m7785c(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.f6489i = googleThirdPartyPaymentExtension;
            return this;
        }

        /* renamed from: d */
        public C1446a m7786d(UserVerificationMethodExtension userVerificationMethodExtension) {
            this.f6482b = userVerificationMethodExtension;
            return this;
        }
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzaiVar) {
        this.f6471n = fidoAppIdExtension;
        this.f6473p = userVerificationMethodExtension;
        this.f6472o = zzsVar;
        this.f6474q = zzzVar;
        this.f6475r = zzabVar;
        this.f6476s = zzadVar;
        this.f6477t = zzuVar;
        this.f6478u = zzagVar;
        this.f6479v = googleThirdPartyPaymentExtension;
        this.f6480w = zzaiVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return C5980h.m21269b(this.f6471n, authenticationExtensions.f6471n) && C5980h.m21269b(this.f6472o, authenticationExtensions.f6472o) && C5980h.m21269b(this.f6473p, authenticationExtensions.f6473p) && C5980h.m21269b(this.f6474q, authenticationExtensions.f6474q) && C5980h.m21269b(this.f6475r, authenticationExtensions.f6475r) && C5980h.m21269b(this.f6476s, authenticationExtensions.f6476s) && C5980h.m21269b(this.f6477t, authenticationExtensions.f6477t) && C5980h.m21269b(this.f6478u, authenticationExtensions.f6478u) && C5980h.m21269b(this.f6479v, authenticationExtensions.f6479v) && C5980h.m21269b(this.f6480w, authenticationExtensions.f6480w);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6471n, this.f6472o, this.f6473p, this.f6474q, this.f6475r, this.f6476s, this.f6477t, this.f6478u, this.f6479v, this.f6480w);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 2, m7781x(), i10, false);
        C0029b.m213q(parcel, 3, this.f6472o, i10, false);
        C0029b.m213q(parcel, 4, m7782y(), i10, false);
        C0029b.m213q(parcel, 5, this.f6474q, i10, false);
        C0029b.m213q(parcel, 6, this.f6475r, i10, false);
        C0029b.m213q(parcel, 7, this.f6476s, i10, false);
        C0029b.m213q(parcel, 8, this.f6477t, i10, false);
        C0029b.m213q(parcel, 9, this.f6478u, i10, false);
        C0029b.m213q(parcel, 10, this.f6479v, i10, false);
        C0029b.m213q(parcel, 11, this.f6480w, i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public FidoAppIdExtension m7781x() {
        return this.f6471n;
    }

    /* renamed from: y */
    public UserVerificationMethodExtension m7782y() {
        return this.f6473p;
    }
}
