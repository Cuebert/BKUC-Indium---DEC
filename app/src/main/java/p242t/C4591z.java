package p242t;

import android.os.Build;
import java.util.Locale;
import p279w.InterfaceC5092x1;

/* renamed from: t.z */
/* loaded from: classes.dex */
public class C4591z implements InterfaceC5092x1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18698a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
