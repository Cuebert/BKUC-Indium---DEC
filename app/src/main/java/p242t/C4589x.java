package p242t;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p279w.InterfaceC5092x1;

/* renamed from: t.x */
/* loaded from: classes.dex */
public class C4589x implements InterfaceC5092x1 {

    /* renamed from: a */
    private static final List<String> f18348a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18695a() {
        return "Google".equals(Build.MANUFACTURER) && f18348a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
