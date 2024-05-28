package p279w;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0469s;

/* renamed from: w.i0 */
/* loaded from: classes.dex */
public final class C5037i0 {

    /* renamed from: w.i0$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    public static void m19572a(Context context, C5021e0 c5021e0, C0469s c0469s) throws a {
        Integer m2218d;
        if (c0469s != null) {
            try {
                m2218d = c0469s.m2218d();
                if (m2218d == null) {
                    C0463q1.m2212k("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e10) {
                C0463q1.m2205d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            m2218d = null;
        }
        C0463q1.m2202a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + m2218d);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c0469s == null || m2218d.intValue() == 1)) {
                C0469s.f2081c.m2219e(c5021e0.m19538a());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (c0469s == null || m2218d.intValue() == 0) {
                    C0469s.f2080b.m2219e(c5021e0.m19538a());
                }
            }
        } catch (IllegalArgumentException e11) {
            C0463q1.m2204c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + c5021e0.m19538a());
            throw new a("Expected camera missing from device.", e11);
        }
    }
}
