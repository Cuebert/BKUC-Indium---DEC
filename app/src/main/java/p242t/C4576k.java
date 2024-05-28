package p242t;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p279w.InterfaceC5092x1;

/* renamed from: t.k */
/* loaded from: classes.dex */
public class C4576k implements InterfaceC5092x1 {

    /* renamed from: a */
    static final List<String> f18335a = Arrays.asList("SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18664a() {
        return f18335a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
