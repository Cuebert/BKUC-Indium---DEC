package p242t;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.C0463q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p279w.InterfaceC5092x1;

/* renamed from: t.n */
/* loaded from: classes.dex */
public class C4579n implements InterfaceC5092x1 {
    /* renamed from: b */
    private List<Size> m18668b(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i10 == 34 || i10 == 35)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    /* renamed from: c */
    private List<Size> m18669c(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<Size> m18670d(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: e */
    private static boolean m18671e() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: f */
    private static boolean m18672f() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: g */
    private static boolean m18673g() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m18674h() {
        return m18672f() || m18673g() || m18671e();
    }

    /* renamed from: a */
    public List<Size> m18675a(String str, int i10) {
        if (m18672f()) {
            return m18669c(str, i10);
        }
        if (m18673g()) {
            return m18670d(str, i10);
        }
        if (m18671e()) {
            return m18668b(str, i10);
        }
        C0463q1.m2212k("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}
