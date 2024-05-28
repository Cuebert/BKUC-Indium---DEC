package p161m3;

import com.google.android.gms.fido.fido2.api.common.InterfaceC1454a;

/* renamed from: m3.a */
/* loaded from: classes.dex */
public enum EnumC3932a implements InterfaceC1454a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);


    /* renamed from: n */
    private final int f16327n;

    EnumC3932a(int i10) {
        this.f16327n = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.InterfaceC1454a
    /* renamed from: b */
    public int mo7873b() {
        return this.f16327n;
    }
}
