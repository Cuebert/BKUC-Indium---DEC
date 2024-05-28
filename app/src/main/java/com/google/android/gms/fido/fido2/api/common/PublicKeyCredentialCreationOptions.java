package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import java.util.Arrays;
import java.util.List;
import p004a3.C0029b;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new C1456c();

    /* renamed from: n */
    private final PublicKeyCredentialRpEntity f6540n;

    /* renamed from: o */
    private final PublicKeyCredentialUserEntity f6541o;

    /* renamed from: p */
    private final byte[] f6542p;

    /* renamed from: q */
    private final List f6543q;

    /* renamed from: r */
    private final Double f6544r;

    /* renamed from: s */
    private final List f6545s;

    /* renamed from: t */
    private final AuthenticatorSelectionCriteria f6546t;

    /* renamed from: u */
    private final Integer f6547u;

    /* renamed from: v */
    private final TokenBinding f6548v;

    /* renamed from: w */
    private final AttestationConveyancePreference f6549w;

    /* renamed from: x */
    private final AuthenticationExtensions f6550x;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$a */
    /* loaded from: classes.dex */
    public static final class C1450a {

        /* renamed from: a */
        private PublicKeyCredentialRpEntity f6551a;

        /* renamed from: b */
        private PublicKeyCredentialUserEntity f6552b;

        /* renamed from: c */
        private byte[] f6553c;

        /* renamed from: d */
        private List f6554d;

        /* renamed from: e */
        private Double f6555e;

        /* renamed from: f */
        private List f6556f;

        /* renamed from: g */
        private AuthenticatorSelectionCriteria f6557g;

        /* renamed from: h */
        private Integer f6558h;

        /* renamed from: i */
        private TokenBinding f6559i;

        /* renamed from: j */
        private AttestationConveyancePreference f6560j;

        /* renamed from: k */
        private AuthenticationExtensions f6561k;

        /* renamed from: a */
        public PublicKeyCredentialCreationOptions m7840a() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.f6551a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f6552b;
            byte[] bArr = this.f6553c;
            List list = this.f6554d;
            Double d10 = this.f6555e;
            List list2 = this.f6556f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f6557g;
            Integer num = this.f6558h;
            TokenBinding tokenBinding = this.f6559i;
            AttestationConveyancePreference attestationConveyancePreference = this.f6560j;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d10, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.f6561k);
        }

        /* renamed from: b */
        public C1450a m7841b(AttestationConveyancePreference attestationConveyancePreference) {
            this.f6560j = attestationConveyancePreference;
            return this;
        }

        /* renamed from: c */
        public C1450a m7842c(AuthenticationExtensions authenticationExtensions) {
            this.f6561k = authenticationExtensions;
            return this;
        }

        /* renamed from: d */
        public C1450a m7843d(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.f6557g = authenticatorSelectionCriteria;
            return this;
        }

        /* renamed from: e */
        public C1450a m7844e(byte[] bArr) {
            this.f6553c = (byte[]) C5984j.m21286j(bArr);
            return this;
        }

        /* renamed from: f */
        public C1450a m7845f(List<PublicKeyCredentialDescriptor> list) {
            this.f6556f = list;
            return this;
        }

        /* renamed from: g */
        public C1450a m7846g(List<PublicKeyCredentialParameters> list) {
            this.f6554d = (List) C5984j.m21286j(list);
            return this;
        }

        /* renamed from: h */
        public C1450a m7847h(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.f6551a = (PublicKeyCredentialRpEntity) C5984j.m21286j(publicKeyCredentialRpEntity);
            return this;
        }

        /* renamed from: i */
        public C1450a m7848i(Double d10) {
            this.f6555e = d10;
            return this;
        }

        /* renamed from: j */
        public C1450a m7849j(PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.f6552b = (PublicKeyCredentialUserEntity) C5984j.m21286j(publicKeyCredentialUserEntity);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d10, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        this.f6540n = (PublicKeyCredentialRpEntity) C5984j.m21286j(publicKeyCredentialRpEntity);
        this.f6541o = (PublicKeyCredentialUserEntity) C5984j.m21286j(publicKeyCredentialUserEntity);
        this.f6542p = (byte[]) C5984j.m21286j(bArr);
        this.f6543q = (List) C5984j.m21286j(list);
        this.f6544r = d10;
        this.f6545s = list2;
        this.f6546t = authenticatorSelectionCriteria;
        this.f6547u = num;
        this.f6548v = tokenBinding;
        if (str != null) {
            try {
                this.f6549w = AttestationConveyancePreference.m7780b(str);
            } catch (AttestationConveyancePreference.C1445a e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f6549w = null;
        }
        this.f6550x = authenticationExtensions;
    }

    /* renamed from: A */
    public byte[] m7829A() {
        return this.f6542p;
    }

    /* renamed from: B */
    public List<PublicKeyCredentialDescriptor> m7830B() {
        return this.f6545s;
    }

    /* renamed from: C */
    public List<PublicKeyCredentialParameters> m7831C() {
        return this.f6543q;
    }

    /* renamed from: D */
    public Integer m7832D() {
        return this.f6547u;
    }

    /* renamed from: E */
    public PublicKeyCredentialRpEntity m7833E() {
        return this.f6540n;
    }

    /* renamed from: F */
    public Double m7834F() {
        return this.f6544r;
    }

    /* renamed from: G */
    public TokenBinding m7835G() {
        return this.f6548v;
    }

    /* renamed from: H */
    public PublicKeyCredentialUserEntity m7836H() {
        return this.f6541o;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return C5980h.m21269b(this.f6540n, publicKeyCredentialCreationOptions.f6540n) && C5980h.m21269b(this.f6541o, publicKeyCredentialCreationOptions.f6541o) && Arrays.equals(this.f6542p, publicKeyCredentialCreationOptions.f6542p) && C5980h.m21269b(this.f6544r, publicKeyCredentialCreationOptions.f6544r) && this.f6543q.containsAll(publicKeyCredentialCreationOptions.f6543q) && publicKeyCredentialCreationOptions.f6543q.containsAll(this.f6543q) && (((list = this.f6545s) == null && publicKeyCredentialCreationOptions.f6545s == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f6545s) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.f6545s.containsAll(this.f6545s))) && C5980h.m21269b(this.f6546t, publicKeyCredentialCreationOptions.f6546t) && C5980h.m21269b(this.f6547u, publicKeyCredentialCreationOptions.f6547u) && C5980h.m21269b(this.f6548v, publicKeyCredentialCreationOptions.f6548v) && C5980h.m21269b(this.f6549w, publicKeyCredentialCreationOptions.f6549w) && C5980h.m21269b(this.f6550x, publicKeyCredentialCreationOptions.f6550x);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6540n, this.f6541o, Integer.valueOf(Arrays.hashCode(this.f6542p)), this.f6543q, this.f6544r, this.f6545s, this.f6546t, this.f6547u, this.f6548v, this.f6549w, this.f6550x);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 2, m7833E(), i10, false);
        C0029b.m213q(parcel, 3, m7836H(), i10, false);
        C0029b.m202f(parcel, 4, m7829A(), false);
        C0029b.m219w(parcel, 5, m7831C(), false);
        C0029b.m205i(parcel, 6, m7834F(), false);
        C0029b.m219w(parcel, 7, m7830B(), false);
        C0029b.m213q(parcel, 8, m7839z(), i10, false);
        C0029b.m210n(parcel, 9, m7832D(), false);
        C0029b.m213q(parcel, 10, m7835G(), i10, false);
        C0029b.m215s(parcel, 11, m7837x(), false);
        C0029b.m213q(parcel, 12, m7838y(), i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7837x() {
        AttestationConveyancePreference attestationConveyancePreference = this.f6549w;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    /* renamed from: y */
    public AuthenticationExtensions m7838y() {
        return this.f6550x;
    }

    /* renamed from: z */
    public AuthenticatorSelectionCriteria m7839z() {
        return this.f6546t;
    }
}
