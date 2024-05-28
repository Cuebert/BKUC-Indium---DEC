package p255u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.C0315k0;
import androidx.camera.camera2.internal.InterfaceC0313j2;
import androidx.concurrent.futures.C0541c;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p231s.C4487g;
import p242t.C4574i;
import p255u.C4777u;
import p279w.AbstractC5073r0;
import p279w.C5095y1;
import p292x.C5493a;
import p305y.C5584d;
import p305y.C5586f;
import p305y.InterfaceC5581a;

/* renamed from: u.u */
/* loaded from: classes.dex */
public class C4777u {

    /* renamed from: a */
    private final boolean f18631a;

    /* renamed from: c */
    private final InterfaceFutureC2565m<Void> f18633c;

    /* renamed from: d */
    C0541c.a<Void> f18634d;

    /* renamed from: e */
    private boolean f18635e;

    /* renamed from: b */
    private final Object f18632b = new Object();

    /* renamed from: f */
    private final CameraCaptureSession.CaptureCallback f18636f = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u.u$a */
    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            C0541c.a<Void> aVar = C4777u.this.f18634d;
            if (aVar != null) {
                aVar.m2520d();
                C4777u.this.f18634d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            C0541c.a<Void> aVar = C4777u.this.f18634d;
            if (aVar != null) {
                aVar.m2519c(null);
                C4777u.this.f18634d = null;
            }
        }
    }

    @FunctionalInterface
    /* renamed from: u.u$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        InterfaceFutureC2565m<Void> mo1683a(CameraDevice cameraDevice, C4487g c4487g, List<AbstractC5073r0> list);
    }

    @FunctionalInterface
    /* renamed from: u.u$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int mo1771a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    public C4777u(C5095y1 c5095y1) {
        this.f18631a = c5095y1.m19724a(C4574i.class);
        if (m18965i()) {
            this.f18633c = C0541c.m2515a(new C0541c.c() { // from class: u.s
                public /* synthetic */ C4775s() {
                }

                @Override // androidx.concurrent.futures.C0541c.c
                /* renamed from: a */
                public final Object mo1498a(C0541c.a aVar) {
                    Object m18959d;
                    m18959d = C4777u.this.m18959d(aVar);
                    return m18959d;
                }
            });
        } else {
            this.f18633c = C5586f.m20508h(null);
        }
    }

    /* renamed from: d */
    public /* synthetic */ Object m18959d(C0541c.a aVar) throws Exception {
        this.f18634d = aVar;
        return "WaitForRepeatingRequestStart[" + this + "]";
    }

    /* renamed from: c */
    public InterfaceFutureC2565m<Void> m18961c() {
        return C5586f.m20510j(this.f18633c);
    }

    /* renamed from: f */
    public void m18962f() {
        synchronized (this.f18632b) {
            if (m18965i() && !this.f18635e) {
                this.f18633c.cancel(true);
            }
        }
    }

    /* renamed from: g */
    public InterfaceFutureC2565m<Void> m18963g(CameraDevice cameraDevice, C4487g c4487g, List<AbstractC5073r0> list, List<InterfaceC0313j2> list2, b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC0313j2> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo1586h());
        }
        return C5584d.m20496a(C5586f.m20514n(arrayList)).m20500f(new InterfaceC5581a() { // from class: u.t

            /* renamed from: b */
            public final /* synthetic */ CameraDevice f18628b;

            /* renamed from: c */
            public final /* synthetic */ C4487g f18629c;

            /* renamed from: d */
            public final /* synthetic */ List f18630d;

            public /* synthetic */ C4776t(CameraDevice cameraDevice2, C4487g c4487g2, List list3) {
                r2 = cameraDevice2;
                r3 = c4487g2;
                r4 = list3;
            }

            @Override // p305y.InterfaceC5581a
            /* renamed from: a */
            public final InterfaceFutureC2565m mo1404a(Object obj) {
                InterfaceFutureC2565m mo1683a;
                mo1683a = C4777u.b.this.mo1683a(r2, r3, r4);
                return mo1683a;
            }
        }, C5493a.m20219a());
    }

    /* renamed from: h */
    public int m18964h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, c cVar) throws CameraAccessException {
        int mo1771a;
        synchronized (this.f18632b) {
            if (m18965i()) {
                captureCallback = C0315k0.m1600b(this.f18636f, captureCallback);
                this.f18635e = true;
            }
            mo1771a = cVar.mo1771a(captureRequest, captureCallback);
        }
        return mo1771a;
    }

    /* renamed from: i */
    public boolean m18965i() {
        return this.f18631a;
    }
}
