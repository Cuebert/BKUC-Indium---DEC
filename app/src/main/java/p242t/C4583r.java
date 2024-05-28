package p242t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p218r.C4414z;

/* renamed from: t.r */
/* loaded from: classes.dex */
public class C4583r implements InterfaceC4566b0 {

    /* renamed from: a */
    private static final List<String> f18343a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18688a(C4414z c4414z) {
        return f18343a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c4414z.m18192a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
