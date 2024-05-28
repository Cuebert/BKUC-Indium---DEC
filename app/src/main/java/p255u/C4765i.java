package p255u;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import p206q.C4288a;
import p242t.C4577l;
import p242t.C4584s;

/* renamed from: u.i */
/* loaded from: classes.dex */
public class C4765i {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m18946a(int i10, C4288a.a aVar) {
        if (((C4584s) C4577l.m18665a(C4584s.class)) == null) {
            return;
        }
        if (i10 == 0) {
            aVar.m17775e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i10 != 1) {
                return;
            }
            aVar.m17775e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
