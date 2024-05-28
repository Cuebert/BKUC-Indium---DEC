package p266ub;

/* renamed from: ub.b */
/* loaded from: classes.dex */
public enum EnumC4910b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* renamed from: n */
    public final int f18793n;

    EnumC4910b(int i10) {
        this.f18793n = i10;
    }

    /* renamed from: b */
    public static EnumC4910b m19167b(int i10) {
        for (EnumC4910b enumC4910b : values()) {
            if (enumC4910b.f18793n == i10) {
                return enumC4910b;
            }
        }
        return null;
    }
}
