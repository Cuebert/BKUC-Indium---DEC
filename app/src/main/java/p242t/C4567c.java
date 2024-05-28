package p242t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p218r.C4414z;
import p279w.InterfaceC5092x1;

/* renamed from: t.c */
/* loaded from: classes.dex */
public class C4567c implements InterfaceC5092x1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m18651b(C4414z c4414z) {
        Integer num = (Integer) c4414z.m18192a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2 && Build.VERSION.SDK_INT == 21;
    }

    /* renamed from: a */
    public int m18652a() {
        return 2;
    }
}
