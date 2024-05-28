package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p279w.AbstractC5032h;
import p279w.C5036i;

/* renamed from: androidx.camera.camera2.internal.m1 */
/* loaded from: classes.dex */
final class C0324m1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static CameraCaptureSession.CaptureCallback m1604a(AbstractC5032h abstractC5032h) {
        if (abstractC5032h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m1605b(abstractC5032h, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return C0315k0.m1599a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m1605b(AbstractC5032h abstractC5032h, List<CameraCaptureSession.CaptureCallback> list) {
        if (abstractC5032h instanceof C5036i) {
            Iterator<AbstractC5032h> it = ((C5036i) abstractC5032h).m19571d().iterator();
            while (it.hasNext()) {
                m1605b(it.next(), list);
            }
        } else if (abstractC5032h instanceof C0320l1) {
            list.add(((C0320l1) abstractC5032h).m1603e());
        } else {
            list.add(new C0316k1(abstractC5032h));
        }
    }
}
