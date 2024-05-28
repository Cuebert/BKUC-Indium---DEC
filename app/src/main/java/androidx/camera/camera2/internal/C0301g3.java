package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import p218r.C4414z;

/* renamed from: androidx.camera.camera2.internal.g3 */
/* loaded from: classes.dex */
final class C0301g3 {
    /* renamed from: a */
    public static boolean m1497a(C4414z c4414z, int i10) {
        int[] iArr = (int[]) c4414z.m18192a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }
}
