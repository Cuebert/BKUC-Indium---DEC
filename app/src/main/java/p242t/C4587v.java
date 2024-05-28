package p242t;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p279w.InterfaceC5092x1;

/* renamed from: t.v */
/* loaded from: classes.dex */
public class C4587v implements InterfaceC5092x1 {

    /* renamed from: a */
    private static final List<String> f18347a = Arrays.asList("NEXUS 4");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m18692b() {
        return "GOOGLE".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 23 && f18347a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: a */
    public int m18693a() {
        return 2;
    }
}
