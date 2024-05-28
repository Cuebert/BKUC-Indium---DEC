package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p004a3.C0029b;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new C1323a();

    /* renamed from: n */
    private final PasswordRequestOptions f5977n;

    /* renamed from: o */
    private final GoogleIdTokenRequestOptions f5978o;

    /* renamed from: p */
    private final String f5979p;

    /* renamed from: q */
    private final boolean f5980q;

    /* renamed from: r */
    private final int f5981r;

    /* renamed from: s */
    private final PasskeysRequestOptions f5982s;

    /* renamed from: t */
    private final PasskeyJsonRequestOptions f5983t;

    /* loaded from: classes.dex */
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new C1326d();

        /* renamed from: n */
        private final boolean f5984n;

        /* renamed from: o */
        private final String f5985o;

        /* renamed from: p */
        private final String f5986p;

        /* renamed from: q */
        private final boolean f5987q;

        /* renamed from: r */
        private final String f5988r;

        /* renamed from: s */
        private final List f5989s;

        /* renamed from: t */
        private final boolean f5990t;

        /* renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$a */
        /* loaded from: classes.dex */
        public static final class C1315a {

            /* renamed from: a */
            private boolean f5991a = false;

            /* renamed from: b */
            private String f5992b = null;

            /* renamed from: c */
            private String f5993c = null;

            /* renamed from: d */
            private boolean f5994d = true;

            /* renamed from: e */
            private String f5995e = null;

            /* renamed from: f */
            private List f5996f = null;

            /* renamed from: g */
            private boolean f5997g = false;

            /* renamed from: a */
            public C1315a m7256a(String str, List<String> list) {
                this.f5995e = (String) C5984j.m21287k(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f5996f = list;
                return this;
            }

            /* renamed from: b */
            public GoogleIdTokenRequestOptions m7257b() {
                return new GoogleIdTokenRequestOptions(this.f5991a, this.f5992b, this.f5993c, this.f5994d, this.f5995e, this.f5996f, this.f5997g);
            }

            /* renamed from: c */
            public C1315a m7258c(boolean z10) {
                this.f5994d = z10;
                return this;
            }

            /* renamed from: d */
            public C1315a m7259d(String str) {
                this.f5993c = str;
                return this;
            }

            @Deprecated
            /* renamed from: e */
            public C1315a m7260e(boolean z10) {
                this.f5997g = z10;
                return this;
            }

            /* renamed from: f */
            public C1315a m7261f(String str) {
                this.f5992b = C5984j.m21282f(str);
                return this;
            }

            /* renamed from: g */
            public C1315a m7262g(boolean z10) {
                this.f5991a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public GoogleIdTokenRequestOptions(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            C5984j.m21278b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f5984n = z10;
            if (z10) {
                C5984j.m21287k(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f5985o = str;
            this.f5986p = str2;
            this.f5987q = z11;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f5989s = arrayList;
            this.f5988r = str3;
            this.f5990t = z12;
        }

        /* renamed from: x */
        public static C1315a m7248x() {
            return new C1315a();
        }

        /* renamed from: A */
        public String m7249A() {
            return this.f5988r;
        }

        /* renamed from: B */
        public String m7250B() {
            return this.f5986p;
        }

        /* renamed from: C */
        public String m7251C() {
            return this.f5985o;
        }

        /* renamed from: D */
        public boolean m7252D() {
            return this.f5984n;
        }

        @Deprecated
        /* renamed from: E */
        public boolean m7253E() {
            return this.f5990t;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f5984n == googleIdTokenRequestOptions.f5984n && C5980h.m21269b(this.f5985o, googleIdTokenRequestOptions.f5985o) && C5980h.m21269b(this.f5986p, googleIdTokenRequestOptions.f5986p) && this.f5987q == googleIdTokenRequestOptions.f5987q && C5980h.m21269b(this.f5988r, googleIdTokenRequestOptions.f5988r) && C5980h.m21269b(this.f5989s, googleIdTokenRequestOptions.f5989s) && this.f5990t == googleIdTokenRequestOptions.f5990t;
        }

        public int hashCode() {
            return C5980h.m21270c(Boolean.valueOf(this.f5984n), this.f5985o, this.f5986p, Boolean.valueOf(this.f5987q), this.f5988r, this.f5989s, Boolean.valueOf(this.f5990t));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m197a = C0029b.m197a(parcel);
            C0029b.m199c(parcel, 1, m7252D());
            C0029b.m215s(parcel, 2, m7251C(), false);
            C0029b.m215s(parcel, 3, m7250B(), false);
            C0029b.m199c(parcel, 4, m7254y());
            C0029b.m215s(parcel, 5, m7249A(), false);
            C0029b.m217u(parcel, 6, m7255z(), false);
            C0029b.m199c(parcel, 7, m7253E());
            C0029b.m198b(parcel, m197a);
        }

        /* renamed from: y */
        public boolean m7254y() {
            return this.f5987q;
        }

        /* renamed from: z */
        public List<String> m7255z() {
            return this.f5989s;
        }
    }

    /* loaded from: classes.dex */
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new C1327e();

        /* renamed from: n */
        private final boolean f5998n;

        /* renamed from: o */
        private final String f5999o;

        /* renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$a */
        /* loaded from: classes.dex */
        public static final class C1316a {

            /* renamed from: a */
            private boolean f6000a = false;

            /* renamed from: b */
            private String f6001b;

            /* renamed from: a */
            public PasskeyJsonRequestOptions m7266a() {
                return new PasskeyJsonRequestOptions(this.f6000a, this.f6001b);
            }

            /* renamed from: b */
            public C1316a m7267b(String str) {
                this.f6001b = str;
                return this;
            }

            /* renamed from: c */
            public C1316a m7268c(boolean z10) {
                this.f6000a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PasskeyJsonRequestOptions(boolean z10, String str) {
            if (z10) {
                C5984j.m21286j(str);
            }
            this.f5998n = z10;
            this.f5999o = str;
        }

        /* renamed from: x */
        public static C1316a m7263x() {
            return new C1316a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f5998n == passkeyJsonRequestOptions.f5998n && C5980h.m21269b(this.f5999o, passkeyJsonRequestOptions.f5999o);
        }

        public int hashCode() {
            return C5980h.m21270c(Boolean.valueOf(this.f5998n), this.f5999o);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m197a = C0029b.m197a(parcel);
            C0029b.m199c(parcel, 1, m7265z());
            C0029b.m215s(parcel, 2, m7264y(), false);
            C0029b.m198b(parcel, m197a);
        }

        /* renamed from: y */
        public String m7264y() {
            return this.f5999o;
        }

        /* renamed from: z */
        public boolean m7265z() {
            return this.f5998n;
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new C1328f();

        /* renamed from: n */
        private final boolean f6002n;

        /* renamed from: o */
        private final byte[] f6003o;

        /* renamed from: p */
        private final String f6004p;

        /* renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$a */
        /* loaded from: classes.dex */
        public static final class C1317a {

            /* renamed from: a */
            private boolean f6005a = false;

            /* renamed from: b */
            private byte[] f6006b;

            /* renamed from: c */
            private String f6007c;

            /* renamed from: a */
            public PasskeysRequestOptions m7273a() {
                return new PasskeysRequestOptions(this.f6005a, this.f6006b, this.f6007c);
            }

            /* renamed from: b */
            public C1317a m7274b(byte[] bArr) {
                this.f6006b = bArr;
                return this;
            }

            /* renamed from: c */
            public C1317a m7275c(String str) {
                this.f6007c = str;
                return this;
            }

            /* renamed from: d */
            public C1317a m7276d(boolean z10) {
                this.f6005a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PasskeysRequestOptions(boolean z10, byte[] bArr, String str) {
            if (z10) {
                C5984j.m21286j(bArr);
                C5984j.m21286j(str);
            }
            this.f6002n = z10;
            this.f6003o = bArr;
            this.f6004p = str;
        }

        /* renamed from: x */
        public static C1317a m7269x() {
            return new C1317a();
        }

        /* renamed from: A */
        public boolean m7270A() {
            return this.f6002n;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f6002n == passkeysRequestOptions.f6002n && Arrays.equals(this.f6003o, passkeysRequestOptions.f6003o) && ((str = this.f6004p) == (str2 = passkeysRequestOptions.f6004p) || (str != null && str.equals(str2)));
        }

        public int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f6002n), this.f6004p}) * 31) + Arrays.hashCode(this.f6003o);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m197a = C0029b.m197a(parcel);
            C0029b.m199c(parcel, 1, m7270A());
            C0029b.m202f(parcel, 2, m7271y(), false);
            C0029b.m215s(parcel, 3, m7272z(), false);
            C0029b.m198b(parcel, m197a);
        }

        /* renamed from: y */
        public byte[] m7271y() {
            return this.f6003o;
        }

        /* renamed from: z */
        public String m7272z() {
            return this.f6004p;
        }
    }

    /* loaded from: classes.dex */
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new C1329g();

        /* renamed from: n */
        private final boolean f6008n;

        /* renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$a */
        /* loaded from: classes.dex */
        public static final class C1318a {

            /* renamed from: a */
            private boolean f6009a = false;

            /* renamed from: a */
            public PasswordRequestOptions m7279a() {
                return new PasswordRequestOptions(this.f6009a);
            }

            /* renamed from: b */
            public C1318a m7280b(boolean z10) {
                this.f6009a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PasswordRequestOptions(boolean z10) {
            this.f6008n = z10;
        }

        /* renamed from: x */
        public static C1318a m7277x() {
            return new C1318a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f6008n == ((PasswordRequestOptions) obj).f6008n;
        }

        public int hashCode() {
            return C5980h.m21270c(Boolean.valueOf(this.f6008n));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m197a = C0029b.m197a(parcel);
            C0029b.m199c(parcel, 1, m7278y());
            C0029b.m198b(parcel, m197a);
        }

        /* renamed from: y */
        public boolean m7278y() {
            return this.f6008n;
        }
    }

    /* renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$a */
    /* loaded from: classes.dex */
    public static final class C1319a {

        /* renamed from: a */
        private PasswordRequestOptions f6010a;

        /* renamed from: b */
        private GoogleIdTokenRequestOptions f6011b;

        /* renamed from: c */
        private PasskeysRequestOptions f6012c;

        /* renamed from: d */
        private PasskeyJsonRequestOptions f6013d;

        /* renamed from: e */
        private String f6014e;

        /* renamed from: f */
        private boolean f6015f;

        /* renamed from: g */
        private int f6016g;

        public C1319a() {
            PasswordRequestOptions.C1318a m7277x = PasswordRequestOptions.m7277x();
            m7277x.m7280b(false);
            this.f6010a = m7277x.m7279a();
            GoogleIdTokenRequestOptions.C1315a m7248x = GoogleIdTokenRequestOptions.m7248x();
            m7248x.m7262g(false);
            this.f6011b = m7248x.m7257b();
            PasskeysRequestOptions.C1317a m7269x = PasskeysRequestOptions.m7269x();
            m7269x.m7276d(false);
            this.f6012c = m7269x.m7273a();
            PasskeyJsonRequestOptions.C1316a m7263x = PasskeyJsonRequestOptions.m7263x();
            m7263x.m7268c(false);
            this.f6013d = m7263x.m7266a();
        }

        /* renamed from: a */
        public BeginSignInRequest m7281a() {
            return new BeginSignInRequest(this.f6010a, this.f6011b, this.f6014e, this.f6015f, this.f6016g, this.f6012c, this.f6013d);
        }

        /* renamed from: b */
        public C1319a m7282b(boolean z10) {
            this.f6015f = z10;
            return this;
        }

        /* renamed from: c */
        public C1319a m7283c(GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.f6011b = (GoogleIdTokenRequestOptions) C5984j.m21286j(googleIdTokenRequestOptions);
            return this;
        }

        /* renamed from: d */
        public C1319a m7284d(PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.f6013d = (PasskeyJsonRequestOptions) C5984j.m21286j(passkeyJsonRequestOptions);
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public C1319a m7285e(PasskeysRequestOptions passkeysRequestOptions) {
            this.f6012c = (PasskeysRequestOptions) C5984j.m21286j(passkeysRequestOptions);
            return this;
        }

        /* renamed from: f */
        public C1319a m7286f(PasswordRequestOptions passwordRequestOptions) {
            this.f6010a = (PasswordRequestOptions) C5984j.m21286j(passwordRequestOptions);
            return this;
        }

        /* renamed from: g */
        public final C1319a m7287g(String str) {
            this.f6014e = str;
            return this;
        }

        /* renamed from: h */
        public final C1319a m7288h(int i10) {
            this.f6016g = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z10, int i10, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
        this.f5977n = (PasswordRequestOptions) C5984j.m21286j(passwordRequestOptions);
        this.f5978o = (GoogleIdTokenRequestOptions) C5984j.m21286j(googleIdTokenRequestOptions);
        this.f5979p = str;
        this.f5980q = z10;
        this.f5981r = i10;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.C1317a m7269x = PasskeysRequestOptions.m7269x();
            m7269x.m7276d(false);
            passkeysRequestOptions = m7269x.m7273a();
        }
        this.f5982s = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.C1316a m7263x = PasskeyJsonRequestOptions.m7263x();
            m7263x.m7268c(false);
            passkeyJsonRequestOptions = m7263x.m7266a();
        }
        this.f5983t = passkeyJsonRequestOptions;
    }

    /* renamed from: D */
    public static C1319a m7241D(BeginSignInRequest beginSignInRequest) {
        C5984j.m21286j(beginSignInRequest);
        C1319a m7242x = m7242x();
        m7242x.m7283c(beginSignInRequest.m7246y());
        m7242x.m7286f(beginSignInRequest.m7244B());
        m7242x.m7285e(beginSignInRequest.m7243A());
        m7242x.m7284d(beginSignInRequest.m7247z());
        m7242x.m7282b(beginSignInRequest.f5980q);
        m7242x.m7288h(beginSignInRequest.f5981r);
        String str = beginSignInRequest.f5979p;
        if (str != null) {
            m7242x.m7287g(str);
        }
        return m7242x;
    }

    /* renamed from: x */
    public static C1319a m7242x() {
        return new C1319a();
    }

    /* renamed from: A */
    public PasskeysRequestOptions m7243A() {
        return this.f5982s;
    }

    /* renamed from: B */
    public PasswordRequestOptions m7244B() {
        return this.f5977n;
    }

    /* renamed from: C */
    public boolean m7245C() {
        return this.f5980q;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return C5980h.m21269b(this.f5977n, beginSignInRequest.f5977n) && C5980h.m21269b(this.f5978o, beginSignInRequest.f5978o) && C5980h.m21269b(this.f5982s, beginSignInRequest.f5982s) && C5980h.m21269b(this.f5983t, beginSignInRequest.f5983t) && C5980h.m21269b(this.f5979p, beginSignInRequest.f5979p) && this.f5980q == beginSignInRequest.f5980q && this.f5981r == beginSignInRequest.f5981r;
    }

    public int hashCode() {
        return C5980h.m21270c(this.f5977n, this.f5978o, this.f5982s, this.f5983t, this.f5979p, Boolean.valueOf(this.f5980q));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 1, m7244B(), i10, false);
        C0029b.m213q(parcel, 2, m7246y(), i10, false);
        C0029b.m215s(parcel, 3, this.f5979p, false);
        C0029b.m199c(parcel, 4, m7245C());
        C0029b.m208l(parcel, 5, this.f5981r);
        C0029b.m213q(parcel, 6, m7243A(), i10, false);
        C0029b.m213q(parcel, 7, m7247z(), i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: y */
    public GoogleIdTokenRequestOptions m7246y() {
        return this.f5978o;
    }

    /* renamed from: z */
    public PasskeyJsonRequestOptions m7247z() {
        return this.f5983t;
    }
}
