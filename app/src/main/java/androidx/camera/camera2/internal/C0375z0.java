package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import androidx.camera.core.C0463q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p267v.C4932j;
import p279w.AbstractC5073r0;
import p279w.C5045k0;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5068q;

/* renamed from: androidx.camera.camera2.internal.z0 */
/* loaded from: classes.dex */
class C0375z0 {

    /* renamed from: androidx.camera.camera2.internal.z0$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static CaptureRequest.Builder m1815a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    /* renamed from: a */
    private static void m1811a(CaptureRequest.Builder builder, InterfaceC5061o0 interfaceC5061o0) {
        C4932j m19352d = C4932j.a.m19350e(interfaceC5061o0).m19352d();
        for (InterfaceC5061o0.a aVar : m19352d.mo1367c()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.mo19484d();
            try {
                builder.set(key, m19352d.mo1366b(aVar));
            } catch (IllegalArgumentException unused) {
                C0463q1.m2204c("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    /* renamed from: b */
    public static CaptureRequest m1812b(C5045k0 c5045k0, CameraDevice cameraDevice, Map<AbstractC5073r0, Surface> map) throws CameraAccessException {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> m1814d = m1814d(c5045k0.m19584e(), map);
        if (m1814d.isEmpty()) {
            return null;
        }
        InterfaceC5068q m19582c = c5045k0.m19582c();
        if (Build.VERSION.SDK_INT >= 23 && c5045k0.m19586g() == 5 && m19582c != null && (m19582c.mo1387e() instanceof TotalCaptureResult)) {
            createCaptureRequest = a.m1815a(cameraDevice, (TotalCaptureResult) m19582c.mo1387e());
        } else {
            createCaptureRequest = cameraDevice.createCaptureRequest(c5045k0.m19586g());
        }
        m1811a(createCaptureRequest, c5045k0.m19583d());
        InterfaceC5061o0 m19583d = c5045k0.m19583d();
        InterfaceC5061o0.a<Integer> aVar = C5045k0.f19211h;
        if (m19583d.mo1369e(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c5045k0.m19583d().mo1366b(aVar));
        }
        InterfaceC5061o0 m19583d2 = c5045k0.m19583d();
        InterfaceC5061o0.a<Integer> aVar2 = C5045k0.f19212i;
        if (m19583d2.mo1369e(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c5045k0.m19583d().mo1366b(aVar2)).byteValue()));
        }
        Iterator<Surface> it = m1814d.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget(it.next());
        }
        createCaptureRequest.setTag(c5045k0.m19585f());
        return createCaptureRequest.build();
    }

    /* renamed from: c */
    public static CaptureRequest m1813c(C5045k0 c5045k0, CameraDevice cameraDevice) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(c5045k0.m19586g());
        m1811a(createCaptureRequest, c5045k0.m19583d());
        return createCaptureRequest.build();
    }

    /* renamed from: d */
    private static List<Surface> m1814d(List<AbstractC5073r0> list, Map<AbstractC5073r0, Surface> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC5073r0> it = list.iterator();
        while (it.hasNext()) {
            Surface surface = map.get(it.next());
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        return arrayList;
    }
}
