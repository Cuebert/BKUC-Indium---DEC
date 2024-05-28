package p153l6;

/* renamed from: l6.b */
/* loaded from: classes.dex */
public class C3882b {
    /* renamed from: a */
    public static int m16489a(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 90) {
            return 1;
        }
        if (i10 == 180) {
            return 2;
        }
        if (i10 == 270) {
            return 3;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Invalid rotation: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
