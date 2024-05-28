package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p004a3.C0029b;
import p246t3.C4687p;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class TokenBinding extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenBinding> CREATOR = new C1461h();

    /* renamed from: p */
    public static final TokenBinding f6583p = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);

    /* renamed from: q */
    public static final TokenBinding f6584q = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* renamed from: n */
    private final TokenBindingStatus f6585n;

    /* renamed from: o */
    private final String f6586o;

    /* loaded from: classes.dex */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new C1460g();

        /* renamed from: n */
        private final String f6591n;

        TokenBindingStatus(String str) {
            this.f6591n = str;
        }

        /* renamed from: b */
        public static TokenBindingStatus m7866b(String str) throws C1453a {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.f6591n)) {
                    return tokenBindingStatus;
                }
            }
            throw new C1453a(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f6591n;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f6591n);
        }
    }

    /* renamed from: com.google.android.gms.fido.fido2.api.common.TokenBinding$a */
    /* loaded from: classes.dex */
    public static class C1453a extends Exception {
        public C1453a(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TokenBinding(String str, String str2) {
        C5984j.m21286j(str);
        try {
            this.f6585n = TokenBindingStatus.m7866b(str);
            this.f6586o = str2;
        } catch (C1453a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return C4687p.m18799a(this.f6585n, tokenBinding.f6585n) && C4687p.m18799a(this.f6586o, tokenBinding.f6586o);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6585n, this.f6586o});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, m7865y(), false);
        C0029b.m215s(parcel, 3, m7864x(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7864x() {
        return this.f6586o;
    }

    /* renamed from: y */
    public String m7865y() {
        return this.f6585n.toString();
    }
}
