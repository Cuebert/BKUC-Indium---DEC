package p283w3;

/* renamed from: w3.z9 */
/* loaded from: classes.dex */
public enum EnumC5453z9 implements InterfaceC5432y1 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);


    /* renamed from: n */
    private final int f20334n;

    EnumC5453z9(int i10) {
        this.f20334n = i10;
    }

    @Override // p283w3.InterfaceC5432y1
    public final int zza() {
        return this.f20334n;
    }
}
