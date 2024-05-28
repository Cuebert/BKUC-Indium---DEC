package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import p004a3.C0029b;
import p161m3.C3945n;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new C1471r();

    /* renamed from: n */
    private final Attachment f6508n;

    /* renamed from: o */
    private final Boolean f6509o;

    /* renamed from: p */
    private final zzay f6510p;

    /* renamed from: q */
    private final ResidentKeyRequirement f6511q;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria$a */
    /* loaded from: classes.dex */
    public static class C1447a {

        /* renamed from: a */
        private Attachment f6512a;

        /* renamed from: b */
        private Boolean f6513b;

        /* renamed from: c */
        private ResidentKeyRequirement f6514c;

        /* renamed from: a */
        public AuthenticatorSelectionCriteria m7811a() {
            Attachment attachment = this.f6512a;
            String attachment2 = attachment == null ? null : attachment.toString();
            Boolean bool = this.f6513b;
            ResidentKeyRequirement residentKeyRequirement = this.f6514c;
            return new AuthenticatorSelectionCriteria(attachment2, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        /* renamed from: b */
        public C1447a m7812b(Attachment attachment) {
            this.f6512a = attachment;
            return this;
        }

        /* renamed from: c */
        public C1447a m7813c(Boolean bool) {
            this.f6513b = bool;
            return this;
        }

        /* renamed from: d */
        public C1447a m7814d(ResidentKeyRequirement residentKeyRequirement) {
            this.f6514c = residentKeyRequirement;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment m7779b;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            m7779b = null;
        } else {
            try {
                m7779b = Attachment.m7779b(str);
            } catch (Attachment.C1444a | ResidentKeyRequirement.C1452a | C3945n e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f6508n = m7779b;
        this.f6509o = bool;
        this.f6510p = str2 == null ? null : zzay.m7874b(str2);
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.m7863b(str3);
        }
        this.f6511q = residentKeyRequirement;
    }

    /* renamed from: A */
    public String m7807A() {
        if (m7810z() == null) {
            return null;
        }
        return m7810z().toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return C5980h.m21269b(this.f6508n, authenticatorSelectionCriteria.f6508n) && C5980h.m21269b(this.f6509o, authenticatorSelectionCriteria.f6509o) && C5980h.m21269b(this.f6510p, authenticatorSelectionCriteria.f6510p) && C5980h.m21269b(m7810z(), authenticatorSelectionCriteria.m7810z());
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6508n, this.f6509o, this.f6510p, m7810z());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, m7808x(), false);
        C0029b.m200d(parcel, 3, m7809y(), false);
        zzay zzayVar = this.f6510p;
        C0029b.m215s(parcel, 4, zzayVar == null ? null : zzayVar.toString(), false);
        C0029b.m215s(parcel, 5, m7807A(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7808x() {
        Attachment attachment = this.f6508n;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    /* renamed from: y */
    public Boolean m7809y() {
        return this.f6509o;
    }

    /* renamed from: z */
    public ResidentKeyRequirement m7810z() {
        ResidentKeyRequirement residentKeyRequirement = this.f6511q;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f6509o;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }
}
