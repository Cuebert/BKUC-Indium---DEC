package p242t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p218r.C4414z;

/* renamed from: t.t */
/* loaded from: classes.dex */
public class C4585t implements InterfaceC4566b0 {

    /* renamed from: a */
    public static final List<String> f18345a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18690a(C4414z c4414z) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && f18345a.contains(Build.MODEL.toUpperCase(locale)) && ((Integer) c4414z.m18192a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
