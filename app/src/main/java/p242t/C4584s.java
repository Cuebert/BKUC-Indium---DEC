package p242t;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import p279w.InterfaceC5092x1;

/* renamed from: t.s */
/* loaded from: classes.dex */
public class C4584s implements InterfaceC5092x1 {

    /* renamed from: a */
    public static final List<String> f18344a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18689a() {
        return f18344a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
