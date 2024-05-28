package p206q;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.InterfaceC0414h0;
import p267v.C4932j;
import p279w.C5070q1;
import p279w.C5083u1;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5066p1;

/* renamed from: q.a */
/* loaded from: classes.dex */
public final class C4288a extends C4932j {

    /* renamed from: A */
    public static final InterfaceC5061o0.a<Integer> f17503A = InterfaceC5061o0.a.m19653a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: B */
    public static final InterfaceC5061o0.a<CameraDevice.StateCallback> f17504B = InterfaceC5061o0.a.m19653a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: C */
    public static final InterfaceC5061o0.a<CameraCaptureSession.StateCallback> f17505C = InterfaceC5061o0.a.m19653a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: D */
    public static final InterfaceC5061o0.a<CameraCaptureSession.CaptureCallback> f17506D = InterfaceC5061o0.a.m19653a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: E */
    public static final InterfaceC5061o0.a<C4290c> f17507E = InterfaceC5061o0.a.m19653a("camera2.cameraEvent.callback", C4290c.class);

    /* renamed from: F */
    public static final InterfaceC5061o0.a<Object> f17508F = InterfaceC5061o0.a.m19653a("camera2.captureRequest.tag", Object.class);

    /* renamed from: G */
    public static final InterfaceC5061o0.a<String> f17509G = InterfaceC5061o0.a.m19653a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: q.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0414h0<C4288a> {

        /* renamed from: a */
        private final C5070q1 f17510a = C5070q1.m19660L();

        @Override // androidx.camera.core.InterfaceC0414h0
        /* renamed from: a */
        public InterfaceC5066p1 mo1926a() {
            return this.f17510a;
        }

        /* renamed from: c */
        public C4288a m17773c() {
            return new C4288a(C5083u1.m19702J(this.f17510a));
        }

        /* renamed from: d */
        public a m17774d(InterfaceC5061o0 interfaceC5061o0) {
            for (InterfaceC5061o0.a<?> aVar : interfaceC5061o0.mo1367c()) {
                this.f17510a.mo19659g(aVar, interfaceC5061o0.mo1366b(aVar));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public <ValueT> a m17775e(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f17510a.mo19659g(C4288a.m17764H(key), valuet);
            return this;
        }
    }

    public C4288a(InterfaceC5061o0 interfaceC5061o0) {
        super(interfaceC5061o0);
    }

    /* renamed from: H */
    public static InterfaceC5061o0.a<Object> m17764H(CaptureRequest.Key<?> key) {
        return InterfaceC5061o0.a.m19654b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    /* renamed from: I */
    public C4290c m17765I(C4290c c4290c) {
        return (C4290c) mo1373o().mo1365a(f17507E, c4290c);
    }

    /* renamed from: J */
    public C4932j m17766J() {
        return C4932j.a.m19350e(mo1373o()).m19352d();
    }

    /* renamed from: K */
    public Object m17767K(Object obj) {
        return mo1373o().mo1365a(f17508F, obj);
    }

    /* renamed from: L */
    public int m17768L(int i10) {
        return ((Integer) mo1373o().mo1365a(f17503A, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: M */
    public CameraDevice.StateCallback m17769M(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) mo1373o().mo1365a(f17504B, stateCallback);
    }

    /* renamed from: N */
    public String m17770N(String str) {
        return (String) mo1373o().mo1365a(f17509G, str);
    }

    /* renamed from: O */
    public CameraCaptureSession.CaptureCallback m17771O(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) mo1373o().mo1365a(f17506D, captureCallback);
    }

    /* renamed from: P */
    public CameraCaptureSession.StateCallback m17772P(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) mo1373o().mo1365a(f17505C, stateCallback);
    }
}
