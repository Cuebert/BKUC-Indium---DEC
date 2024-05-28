package p242t;

import android.os.Build;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p279w.InterfaceC5092x1;

/* renamed from: t.q */
/* loaded from: classes.dex */
public class C4582q implements InterfaceC5092x1 {

    /* renamed from: a */
    private static final Set<Pair<String, String>> f18342a = new HashSet(Arrays.asList(new Pair("sprd", "lemp")));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18687a() {
        Set<Pair<String, String>> set = f18342a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
