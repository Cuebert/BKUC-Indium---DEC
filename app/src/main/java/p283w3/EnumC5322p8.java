package p283w3;

/* renamed from: w3.p8 */
/* loaded from: classes.dex */
public enum EnumC5322p8 implements InterfaceC5432y1 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);


    /* renamed from: n */
    private final int f20011n;

    EnumC5322p8(int i10) {
        this.f20011n = i10;
    }

    @Override // p283w3.InterfaceC5432y1
    public final int zza() {
        return this.f20011n;
    }
}
