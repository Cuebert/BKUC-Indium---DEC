package p198p3;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import p197p2.InterfaceC4215b;

/* renamed from: p3.f0 */
/* loaded from: classes.dex */
public final class C4233f0 implements InterfaceC4215b {

    /* renamed from: n */
    private final Status f17424n;

    /* renamed from: o */
    private final Credential f17425o;

    public C4233f0(Status status, Credential credential) {
        this.f17424n = status;
        this.f17425o = credential;
    }

    @Override // p197p2.InterfaceC4215b
    /* renamed from: c */
    public final Credential mo17640c() {
        return this.f17425o;
    }

    @Override // p295x2.InterfaceC5518m
    /* renamed from: q */
    public final Status mo7413q() {
        return this.f17424n;
    }
}
