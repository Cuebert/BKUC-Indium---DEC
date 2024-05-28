package p283w3;

/* renamed from: w3.r7 */
/* loaded from: classes.dex */
public enum EnumC5347r7 implements InterfaceC5432y1 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);


    /* renamed from: n */
    private final int f20117n;

    EnumC5347r7(int i10) {
        this.f20117n = i10;
    }

    @Override // p283w3.InterfaceC5432y1
    public final int zza() {
        return this.f20117n;
    }
}
