package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5984j;

@Deprecated
/* loaded from: classes.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new C1314c();

    /* renamed from: n */
    final int f5959n;

    /* renamed from: o */
    private final boolean f5960o;

    /* renamed from: p */
    private final String[] f5961p;

    /* renamed from: q */
    private final CredentialPickerConfig f5962q;

    /* renamed from: r */
    private final CredentialPickerConfig f5963r;

    /* renamed from: s */
    private final boolean f5964s;

    /* renamed from: t */
    private final String f5965t;

    /* renamed from: u */
    private final String f5966u;

    /* renamed from: v */
    private final boolean f5967v;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest$a */
    /* loaded from: classes.dex */
    public static final class C1311a {

        /* renamed from: a */
        private boolean f5968a;

        /* renamed from: b */
        private String[] f5969b;

        /* renamed from: c */
        private CredentialPickerConfig f5970c;

        /* renamed from: d */
        private CredentialPickerConfig f5971d;

        /* renamed from: e */
        private boolean f5972e = false;

        /* renamed from: f */
        private String f5973f = null;

        /* renamed from: g */
        private String f5974g;

        /* renamed from: a */
        public CredentialRequest m7237a() {
            if (this.f5969b == null) {
                this.f5969b = new String[0];
            }
            if (!this.f5968a && this.f5969b.length == 0) {
                throw new IllegalStateException("At least one authentication method must be specified");
            }
            return new CredentialRequest(4, this.f5968a, this.f5969b, this.f5970c, this.f5971d, this.f5972e, this.f5973f, this.f5974g, false);
        }

        /* renamed from: b */
        public C1311a m7238b(boolean z10) {
            this.f5968a = z10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialRequest(int i10, boolean z10, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z11, String str, String str2, boolean z12) {
        this.f5959n = i10;
        this.f5960o = z10;
        this.f5961p = (String[]) C5984j.m21286j(strArr);
        this.f5962q = credentialPickerConfig == null ? new CredentialPickerConfig.C1310a().m7229a() : credentialPickerConfig;
        this.f5963r = credentialPickerConfig2 == null ? new CredentialPickerConfig.C1310a().m7229a() : credentialPickerConfig2;
        if (i10 < 3) {
            this.f5964s = true;
            this.f5965t = null;
            this.f5966u = null;
        } else {
            this.f5964s = z11;
            this.f5965t = str;
            this.f5966u = str2;
        }
        this.f5967v = z12;
    }

    /* renamed from: A */
    public String m7230A() {
        return this.f5966u;
    }

    /* renamed from: B */
    public String m7231B() {
        return this.f5965t;
    }

    /* renamed from: C */
    public boolean m7232C() {
        return this.f5964s;
    }

    /* renamed from: D */
    public boolean m7233D() {
        return this.f5960o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m199c(parcel, 1, m7233D());
        C0029b.m216t(parcel, 2, m7234x(), false);
        C0029b.m213q(parcel, 3, m7236z(), i10, false);
        C0029b.m213q(parcel, 4, m7235y(), i10, false);
        C0029b.m199c(parcel, 5, m7232C());
        C0029b.m215s(parcel, 6, m7231B(), false);
        C0029b.m215s(parcel, 7, m7230A(), false);
        C0029b.m199c(parcel, 8, this.f5967v);
        C0029b.m208l(parcel, 1000, this.f5959n);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String[] m7234x() {
        return this.f5961p;
    }

    /* renamed from: y */
    public CredentialPickerConfig m7235y() {
        return this.f5963r;
    }

    /* renamed from: z */
    public CredentialPickerConfig m7236z() {
        return this.f5962q;
    }
}
