package p309y3;

/* renamed from: y3.m4 */
/* loaded from: classes.dex */
public enum EnumC5761m4 implements InterfaceC5706g8 {
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
    private final int f21187n;

    EnumC5761m4(int i10) {
        this.f21187n = i10;
    }

    @Override // p309y3.InterfaceC5706g8
    public final int zza() {
        return this.f21187n;
    }
}
