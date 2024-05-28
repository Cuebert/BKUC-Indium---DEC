package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.camera2.internal.C0350t;
import androidx.camera.core.C0463q1;
import androidx.camera.core.InterfaceC0408f3;
import androidx.lifecycle.C0851r;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import p206q.C4288a;
import p218r.C4414z;
import p318z.AbstractC5938f;

/* renamed from: androidx.camera.camera2.internal.z2 */
/* loaded from: classes.dex */
public final class C0377z2 {

    /* renamed from: a */
    private final C0350t f1700a;

    /* renamed from: b */
    private final Executor f1701b;

    /* renamed from: c */
    private final C0271a3 f1702c;

    /* renamed from: d */
    private final C0851r<InterfaceC0408f3> f1703d;

    /* renamed from: e */
    final b f1704e;

    /* renamed from: f */
    private boolean f1705f = false;

    /* renamed from: g */
    private C0350t.c f1706g = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.z2$a */
    /* loaded from: classes.dex */
    public class a implements C0350t.c {
        a() {
        }

        @Override // androidx.camera.camera2.internal.C0350t.c
        /* renamed from: a */
        public boolean mo1400a(TotalCaptureResult totalCaptureResult) {
            C0377z2.this.f1704e.mo1327a(totalCaptureResult);
            return false;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.z2$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo1327a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        float mo1328b();

        /* renamed from: c */
        void mo1329c(C4288a.a aVar);

        /* renamed from: d */
        float mo1330d();

        /* renamed from: e */
        void mo1331e();
    }

    public C0377z2(C0350t c0350t, C4414z c4414z, Executor executor) {
        this.f1700a = c0350t;
        this.f1701b = executor;
        b m1833b = m1833b(c4414z);
        this.f1704e = m1833b;
        C0271a3 c0271a3 = new C0271a3(m1833b.mo1328b(), m1833b.mo1330d());
        this.f1702c = c0271a3;
        c0271a3.m1343f(1.0f);
        this.f1703d = new C0851r<>(AbstractC5938f.m21131e(c0271a3));
        c0350t.m1735s(this.f1706g);
    }

    /* renamed from: b */
    private static b m1833b(C4414z c4414z) {
        if (m1835e(c4414z)) {
            return new C0267a(c4414z);
        }
        return new C0356u1(c4414z);
    }

    /* renamed from: c */
    private static Range<Float> m1834c(C4414z c4414z) {
        try {
            return (Range) c4414z.m18192a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e10) {
            C0463q1.m2213l("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    /* renamed from: e */
    static boolean m1835e(C4414z c4414z) {
        return Build.VERSION.SDK_INT >= 30 && m1834c(c4414z) != null;
    }

    /* renamed from: g */
    private void m1836g(InterfaceC0408f3 interfaceC0408f3) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f1703d.mo4867o(interfaceC0408f3);
        } else {
            this.f1703d.mo4865m(interfaceC0408f3);
        }
    }

    /* renamed from: a */
    public void m1837a(C4288a.a aVar) {
        this.f1704e.mo1329c(aVar);
    }

    /* renamed from: d */
    public LiveData<InterfaceC0408f3> m1838d() {
        return this.f1703d;
    }

    /* renamed from: f */
    public void m1839f(boolean z10) {
        InterfaceC0408f3 m21131e;
        if (this.f1705f == z10) {
            return;
        }
        this.f1705f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f1702c) {
            this.f1702c.m1343f(1.0f);
            m21131e = AbstractC5938f.m21131e(this.f1702c);
        }
        m1836g(m21131e);
        this.f1704e.mo1331e();
        this.f1700a.m1732f0();
    }
}
