package androidx.camera.core.impl.utils;

import androidx.camera.core.C0463q1;

/* renamed from: androidx.camera.core.impl.utils.b */
/* loaded from: classes.dex */
public final class C0422b {
    /* renamed from: a */
    public static int m2052a(int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i12 = ((i11 - i10) + 360) % 360;
        } else {
            i12 = (i11 + i10) % 360;
        }
        if (C0463q1.m2207f("CameraOrientationUtil")) {
            C0463q1.m2202a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(i12)));
        }
        return i12;
    }

    /* renamed from: b */
    public static int m2053b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i10);
    }
}
