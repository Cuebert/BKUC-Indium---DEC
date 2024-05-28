package p309y3;

import android.os.SystemClock;

/* renamed from: y3.r7 */
/* loaded from: classes.dex */
public final class C5809r7 {
    /* renamed from: a */
    public static void m20757a(C5695f7 c5695f7, int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        c5695f7.m20681b(m20758b(i10, i11, j10, i12, i13, i14, i15), EnumC5869y4.INPUT_IMAGE_CONSTRUCTION);
    }

    /* renamed from: b */
    private static C5800q7 m20758b(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        return new C5800q7(i10, i11, i14, i12, i13, SystemClock.elapsedRealtime() - j10, i15);
    }
}
