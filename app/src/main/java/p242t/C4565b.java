package p242t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p218r.C4414z;
import p279w.InterfaceC5092x1;

/* renamed from: t.b */
/* loaded from: classes.dex */
public class C4565b implements InterfaceC5092x1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18650a(C4414z c4414z) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && ((Integer) c4414z.m18192a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
