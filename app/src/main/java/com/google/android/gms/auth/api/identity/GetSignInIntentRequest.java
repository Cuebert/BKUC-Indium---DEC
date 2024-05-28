package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new C1325c();

    /* renamed from: n */
    private final String f6019n;

    /* renamed from: o */
    private final String f6020o;

    /* renamed from: p */
    private final String f6021p;

    /* renamed from: q */
    private final String f6022q;

    /* renamed from: r */
    private final boolean f6023r;

    /* renamed from: s */
    private final int f6024s;

    /* renamed from: com.google.android.gms.auth.api.identity.GetSignInIntentRequest$a */
    /* loaded from: classes.dex */
    public static final class C1321a {

        /* renamed from: a */
        private String f6025a;

        /* renamed from: b */
        private String f6026b;

        /* renamed from: c */
        private String f6027c;

        /* renamed from: d */
        private String f6028d;

        /* renamed from: e */
        private boolean f6029e;

        /* renamed from: f */
        private int f6030f;

        /* renamed from: a */
        public GetSignInIntentRequest m7298a() {
            return new GetSignInIntentRequest(this.f6025a, this.f6026b, this.f6027c, this.f6028d, this.f6029e, this.f6030f);
        }

        /* renamed from: b */
        public C1321a m7299b(String str) {
            this.f6026b = str;
            return this;
        }

        /* renamed from: c */
        public C1321a m7300c(String str) {
            this.f6028d = str;
            return this;
        }

        @Deprecated
        /* renamed from: d */
        public C1321a m7301d(boolean z10) {
            this.f6029e = z10;
            return this;
        }

        /* renamed from: e */
        public C1321a m7302e(String str) {
            C5984j.m21286j(str);
            this.f6025a = str;
            return this;
        }

        /* renamed from: f */
        public final C1321a m7303f(String str) {
            this.f6027c = str;
            return this;
        }

        /* renamed from: g */
        public final C1321a m7304g(int i10) {
            this.f6030f = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z10, int i10) {
        C5984j.m21286j(str);
        this.f6019n = str;
        this.f6020o = str2;
        this.f6021p = str3;
        this.f6022q = str4;
        this.f6023r = z10;
        this.f6024s = i10;
    }

    /* renamed from: C */
    public static C1321a m7292C(GetSignInIntentRequest getSignInIntentRequest) {
        C5984j.m21286j(getSignInIntentRequest);
        C1321a m7293x = m7293x();
        m7293x.m7302e(getSignInIntentRequest.m7294A());
        m7293x.m7300c(getSignInIntentRequest.m7297z());
        m7293x.m7299b(getSignInIntentRequest.m7296y());
        m7293x.m7301d(getSignInIntentRequest.f6023r);
        m7293x.m7304g(getSignInIntentRequest.f6024s);
        String str = getSignInIntentRequest.f6021p;
        if (str != null) {
            m7293x.m7303f(str);
        }
        return m7293x;
    }

    /* renamed from: x */
    public static C1321a m7293x() {
        return new C1321a();
    }

    /* renamed from: A */
    public String m7294A() {
        return this.f6019n;
    }

    @Deprecated
    /* renamed from: B */
    public boolean m7295B() {
        return this.f6023r;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return C5980h.m21269b(this.f6019n, getSignInIntentRequest.f6019n) && C5980h.m21269b(this.f6022q, getSignInIntentRequest.f6022q) && C5980h.m21269b(this.f6020o, getSignInIntentRequest.f6020o) && C5980h.m21269b(Boolean.valueOf(this.f6023r), Boolean.valueOf(getSignInIntentRequest.f6023r)) && this.f6024s == getSignInIntentRequest.f6024s;
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6019n, this.f6020o, this.f6022q, Boolean.valueOf(this.f6023r), Integer.valueOf(this.f6024s));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, m7294A(), false);
        C0029b.m215s(parcel, 2, m7296y(), false);
        C0029b.m215s(parcel, 3, this.f6021p, false);
        C0029b.m215s(parcel, 4, m7297z(), false);
        C0029b.m199c(parcel, 5, m7295B());
        C0029b.m208l(parcel, 6, this.f6024s);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: y */
    public String m7296y() {
        return this.f6020o;
    }

    /* renamed from: z */
    public String m7297z() {
        return this.f6022q;
    }
}
