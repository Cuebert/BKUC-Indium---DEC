package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;

@Deprecated
/* loaded from: classes.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C1313b();

    /* renamed from: n */
    final int f5952n;

    /* renamed from: o */
    private final boolean f5953o;

    /* renamed from: p */
    private final boolean f5954p;

    /* renamed from: q */
    private final int f5955q;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    /* loaded from: classes.dex */
    public static class C1310a {

        /* renamed from: a */
        private boolean f5956a = false;

        /* renamed from: b */
        private boolean f5957b = true;

        /* renamed from: c */
        private int f5958c = 1;

        /* renamed from: a */
        public CredentialPickerConfig m7229a() {
            return new CredentialPickerConfig(2, this.f5956a, this.f5957b, false, this.f5958c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialPickerConfig(int i10, boolean z10, boolean z11, boolean z12, int i11) {
        this.f5952n = i10;
        this.f5953o = z10;
        this.f5954p = z11;
        if (i10 < 2) {
            this.f5955q = true == z12 ? 3 : 1;
        } else {
            this.f5955q = i11;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m199c(parcel, 1, m7227y());
        C0029b.m199c(parcel, 2, m7228z());
        C0029b.m199c(parcel, 3, m7226x());
        C0029b.m208l(parcel, 4, this.f5955q);
        C0029b.m208l(parcel, 1000, this.f5952n);
        C0029b.m198b(parcel, m197a);
    }

    @Deprecated
    /* renamed from: x */
    public boolean m7226x() {
        return this.f5955q == 3;
    }

    /* renamed from: y */
    public boolean m7227y() {
        return this.f5953o;
    }

    /* renamed from: z */
    public boolean m7228z() {
        return this.f5954p;
    }
}
