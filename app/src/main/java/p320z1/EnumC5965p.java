package p320z1;

import android.util.SparseArray;

/* renamed from: z1.p */
/* loaded from: classes.dex */
public enum EnumC5965p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* renamed from: u */
    private static final SparseArray<EnumC5965p> f22018u;

    /* renamed from: n */
    private final int f22020n;

    static {
        EnumC5965p enumC5965p = DEFAULT;
        EnumC5965p enumC5965p2 = UNMETERED_ONLY;
        EnumC5965p enumC5965p3 = UNMETERED_OR_DAILY;
        EnumC5965p enumC5965p4 = FAST_IF_RADIO_AWAKE;
        EnumC5965p enumC5965p5 = NEVER;
        EnumC5965p enumC5965p6 = UNRECOGNIZED;
        SparseArray<EnumC5965p> sparseArray = new SparseArray<>();
        f22018u = sparseArray;
        sparseArray.put(0, enumC5965p);
        sparseArray.put(1, enumC5965p2);
        sparseArray.put(2, enumC5965p3);
        sparseArray.put(3, enumC5965p4);
        sparseArray.put(4, enumC5965p5);
        sparseArray.put(-1, enumC5965p6);
    }

    EnumC5965p(int i10) {
        this.f22020n = i10;
    }
}
