package p242t;

import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p279w.AbstractC5035h2;
import p279w.InterfaceC5092x1;

/* renamed from: t.o */
/* loaded from: classes.dex */
public class C4580o implements InterfaceC5092x1 {

    /* renamed from: a */
    private static final List<String> f18337a = Arrays.asList("SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610F", "SM-G610M");

    /* renamed from: t.o$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18338a;

        static {
            int[] iArr = new int[AbstractC5035h2.b.values().length];
            f18338a = iArr;
            try {
                iArr[AbstractC5035h2.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18338a[AbstractC5035h2.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18338a[AbstractC5035h2.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: b */
    private static boolean m18676b() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && f18337a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m18677c() {
        return m18676b();
    }

    /* renamed from: a */
    public Size m18678a(AbstractC5035h2.b bVar) {
        if (!m18676b()) {
            return null;
        }
        int i10 = a.f18338a[bVar.ordinal()];
        if (i10 == 1) {
            return new Size(1920, 1080);
        }
        if (i10 == 2) {
            return new Size(1280, 720);
        }
        if (i10 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
