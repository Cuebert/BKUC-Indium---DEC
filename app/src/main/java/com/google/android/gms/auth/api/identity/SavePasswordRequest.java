package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new C1330h();

    /* renamed from: n */
    private final SignInPassword f6031n;

    /* renamed from: o */
    private final String f6032o;

    /* renamed from: p */
    private final int f6033p;

    /* renamed from: com.google.android.gms.auth.api.identity.SavePasswordRequest$a */
    /* loaded from: classes.dex */
    public static final class C1322a {

        /* renamed from: a */
        private SignInPassword f6034a;

        /* renamed from: b */
        private String f6035b;

        /* renamed from: c */
        private int f6036c;

        /* renamed from: a */
        public SavePasswordRequest m7308a() {
            return new SavePasswordRequest(this.f6034a, this.f6035b, this.f6036c);
        }

        /* renamed from: b */
        public C1322a m7309b(SignInPassword signInPassword) {
            this.f6034a = signInPassword;
            return this;
        }

        /* renamed from: c */
        public final C1322a m7310c(String str) {
            this.f6035b = str;
            return this;
        }

        /* renamed from: d */
        public final C1322a m7311d(int i10) {
            this.f6036c = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SavePasswordRequest(SignInPassword signInPassword, String str, int i10) {
        this.f6031n = (SignInPassword) C5984j.m21286j(signInPassword);
        this.f6032o = str;
        this.f6033p = i10;
    }

    /* renamed from: x */
    public static C1322a m7305x() {
        return new C1322a();
    }

    /* renamed from: z */
    public static C1322a m7306z(SavePasswordRequest savePasswordRequest) {
        C5984j.m21286j(savePasswordRequest);
        C1322a m7305x = m7305x();
        m7305x.m7309b(savePasswordRequest.m7307y());
        m7305x.m7311d(savePasswordRequest.f6033p);
        String str = savePasswordRequest.f6032o;
        if (str != null) {
            m7305x.m7310c(str);
        }
        return m7305x;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return C5980h.m21269b(this.f6031n, savePasswordRequest.f6031n) && C5980h.m21269b(this.f6032o, savePasswordRequest.f6032o) && this.f6033p == savePasswordRequest.f6033p;
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6031n, this.f6032o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 1, m7307y(), i10, false);
        C0029b.m215s(parcel, 2, this.f6032o, false);
        C0029b.m208l(parcel, 3, this.f6033p);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: y */
    public SignInPassword m7307y() {
        return this.f6031n;
    }
}
