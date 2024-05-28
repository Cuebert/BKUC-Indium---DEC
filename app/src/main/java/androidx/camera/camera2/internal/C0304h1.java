package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.C0459p1;
import androidx.camera.core.C0469s;
import androidx.camera.core.C0477u;
import androidx.camera.core.InterfaceC0465r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p218r.C4382f;
import p218r.C4397m0;
import p279w.InterfaceC5009b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.h1 */
/* loaded from: classes.dex */
public class C0304h1 {
    /* renamed from: a */
    private static String m1499a(C4397m0 c4397m0, Integer num, List<String> list) throws C4382f {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) c4397m0.m18165c("0").m18192a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) c4397m0.m18165c("1").m18192a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    /* renamed from: b */
    public static List<String> m1500b(C0358v c0358v, C0469s c0469s) throws C0459p1 {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(c0358v.mo1784b().m18166d());
            if (c0469s == null) {
                Iterator it = asList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return arrayList;
            }
            try {
                str = m1499a(c0358v.mo1784b(), c0469s.m2218d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : asList) {
                if (!str2.equals(str)) {
                    arrayList2.add(c0358v.m1786e(str2));
                }
            }
            Iterator<InterfaceC0465r> it2 = c0469s.m2216b(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((InterfaceC5009b0) it2.next()).mo1569c());
            }
            return arrayList;
        } catch (C0477u e10) {
            throw new C0459p1(e10);
        } catch (C4382f e11) {
            throw new C0459p1(C0312j1.m1581a(e11));
        }
    }
}
