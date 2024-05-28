package p218r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.C0463q1;
import androidx.core.util.C0654h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p218r.C4373a0;
import p218r.C4384g;
import p231s.C4482b;
import p231s.C4487g;

/* renamed from: r.i0 */
/* loaded from: classes.dex */
public class C4389i0 implements C4373a0.a {

    /* renamed from: a */
    final CameraDevice f17927a;

    /* renamed from: b */
    final Object f17928b;

    /* renamed from: r.i0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Handler f17929a;

        public a(Handler handler) {
            this.f17929a = handler;
        }
    }

    public C4389i0(CameraDevice cameraDevice, Object obj) {
        this.f17927a = (CameraDevice) C0654h.m3467f(cameraDevice);
        this.f17928b = obj;
    }

    /* renamed from: b */
    private static void m18158b(CameraDevice cameraDevice, List<C4482b> list) {
        String id = cameraDevice.getId();
        Iterator<C4482b> it = list.iterator();
        while (it.hasNext()) {
            String m18433a = it.next().m18433a();
            if (m18433a != null && !m18433a.isEmpty()) {
                C0463q1.m2212k("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + m18433a + ". Ignoring.");
            }
        }
    }

    /* renamed from: c */
    public static void m18159c(CameraDevice cameraDevice, C4487g c4487g) {
        C0654h.m3467f(cameraDevice);
        C0654h.m3467f(c4487g);
        C0654h.m3467f(c4487g.m18453e());
        List<C4482b> m18451c = c4487g.m18451c();
        if (m18451c != null) {
            if (c4487g.m18449a() != null) {
                m18158b(cameraDevice, m18451c);
                return;
            }
            throw new IllegalArgumentException("Invalid executor");
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }

    /* renamed from: d */
    public static C4389i0 m18160d(CameraDevice cameraDevice, Handler handler) {
        return new C4389i0(cameraDevice, new a(handler));
    }

    /* renamed from: f */
    public static List<Surface> m18161f(List<C4482b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C4482b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m18434b());
        }
        return arrayList;
    }

    @Override // p218r.C4373a0.a
    /* renamed from: a */
    public void mo18102a(C4487g c4487g) throws C4382f {
        m18159c(this.f17927a, c4487g);
        if (c4487g.m18450b() == null) {
            if (c4487g.m18452d() != 1) {
                C4384g.c cVar = new C4384g.c(c4487g.m18449a(), c4487g.m18453e());
                m18162e(this.f17927a, m18161f(c4487g.m18451c()), cVar, ((a) this.f17928b).f17929a);
                return;
            }
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
    }

    /* renamed from: e */
    public void m18162e(CameraDevice cameraDevice, List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws C4382f {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (CameraAccessException e10) {
            throw C4382f.m18119e(e10);
        }
    }
}
