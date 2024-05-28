package p242t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p218r.C4414z;

/* renamed from: t.f */
/* loaded from: classes.dex */
public class C4571f implements InterfaceC4566b0 {

    /* renamed from: a */
    public static final List<String> f18334a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18659a(C4414z c4414z) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && f18334a.contains(Build.MODEL.toUpperCase(locale)) && ((Integer) c4414z.m18192a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
