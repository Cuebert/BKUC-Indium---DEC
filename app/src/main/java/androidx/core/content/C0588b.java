package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0572e;
import androidx.core.util.C0649c;

/* renamed from: androidx.core.content.b */
/* loaded from: classes.dex */
public final class C0588b {
    /* renamed from: a */
    public static int m3052a(Context context, String str, int i10, int i11, String str2) {
        int m2754b;
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String m2755c = C0572e.m2755c(str);
        if (m2755c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Process.myUid() == i11 && C0649c.m3452a(context.getPackageName(), str2)) {
            m2754b = C0572e.m2753a(context, i11, m2755c, str2);
        } else {
            m2754b = C0572e.m2754b(context, m2755c, str2);
        }
        return m2754b == 0 ? 0 : -2;
    }

    /* renamed from: b */
    public static int m3053b(Context context, String str) {
        return m3052a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
