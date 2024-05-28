package androidx.camera.camera2.internal;

import androidx.camera.core.C0477u;
import p218r.C4382f;

/* renamed from: androidx.camera.camera2.internal.j1 */
/* loaded from: classes.dex */
public final class C0312j1 {
    /* renamed from: a */
    public static C0477u m1581a(C4382f c4382f) {
        int m18120d = c4382f.m18120d();
        int i10 = 5;
        if (m18120d == 1) {
            i10 = 1;
        } else if (m18120d == 2) {
            i10 = 2;
        } else if (m18120d == 3) {
            i10 = 3;
        } else if (m18120d == 4) {
            i10 = 4;
        } else if (m18120d != 5) {
            i10 = m18120d != 10001 ? 0 : 6;
        }
        return new C0477u(i10, c4382f);
    }
}
