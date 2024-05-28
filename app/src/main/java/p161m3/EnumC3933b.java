package p161m3;

import com.google.android.gms.fido.fido2.api.common.InterfaceC1454a;

/* renamed from: m3.b */
/* loaded from: classes.dex */
public enum EnumC3933b implements InterfaceC1454a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* renamed from: n */
    private final int f16337n;

    EnumC3933b(int i10) {
        this.f16337n = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.InterfaceC1454a
    /* renamed from: b */
    public int mo7873b() {
        return this.f16337n;
    }
}
