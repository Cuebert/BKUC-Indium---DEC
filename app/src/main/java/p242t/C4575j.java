package p242t;

import android.hardware.camera2.CameraCharacteristics;
import p218r.C4414z;
import p279w.InterfaceC5092x1;

/* renamed from: t.j */
/* loaded from: classes.dex */
public class C4575j implements InterfaceC5092x1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18663a(C4414z c4414z) {
        Integer num = (Integer) c4414z.m18192a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
