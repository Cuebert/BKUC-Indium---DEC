package p255u;

import android.hardware.camera2.CaptureRequest;
import java.util.Iterator;
import java.util.List;
import p242t.C4577l;
import p242t.C4591z;

/* renamed from: u.o */
/* loaded from: classes.dex */
public class C4771o {

    /* renamed from: a */
    private final boolean f18621a;

    public C4771o() {
        this.f18621a = ((C4591z) C4577l.m18665a(C4591z.class)) != null;
    }

    /* renamed from: a */
    public boolean m18953a(List<CaptureRequest> list, boolean z10) {
        if (this.f18621a && z10) {
            Iterator<CaptureRequest> it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next().get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
