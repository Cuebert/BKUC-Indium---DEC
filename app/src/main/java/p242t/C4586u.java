package p242t;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p014b0.InterfaceC0964e;
import p218r.C4414z;

/* renamed from: t.u */
/* loaded from: classes.dex */
public final class C4586u implements InterfaceC0964e {

    /* renamed from: a */
    private static final Set<String> f18346a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18691a(C4414z c4414z) {
        return f18346a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
