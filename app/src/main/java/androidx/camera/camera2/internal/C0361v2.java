package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.InterfaceC0313j2;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p231s.C4482b;
import p231s.C4487g;
import p255u.C4763g;
import p255u.C4764h;
import p255u.C4777u;
import p279w.AbstractC5073r0;
import p279w.C5095y1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.v2 */
/* loaded from: classes.dex */
public final class C0361v2 {

    /* renamed from: a */
    private final b f1631a;

    /* renamed from: androidx.camera.camera2.internal.v2$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private final Executor f1632a;

        /* renamed from: b */
        private final ScheduledExecutorService f1633b;

        /* renamed from: c */
        private final Handler f1634c;

        /* renamed from: d */
        private final C0352t1 f1635d;

        /* renamed from: e */
        private final C5095y1 f1636e;

        /* renamed from: f */
        private final C5095y1 f1637f;

        /* renamed from: g */
        private final boolean f1638g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C0352t1 c0352t1, C5095y1 c5095y1, C5095y1 c5095y12) {
            this.f1632a = executor;
            this.f1633b = scheduledExecutorService;
            this.f1634c = handler;
            this.f1635d = c0352t1;
            this.f1636e = c5095y1;
            this.f1637f = c5095y12;
            this.f1638g = new C4764h(c5095y1, c5095y12).m18945b() || new C4777u(c5095y1).m18965i() || new C4763g(c5095y12).m18943d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C0361v2 m1798a() {
            return new C0361v2(this.f1638g ? new C0357u2(this.f1636e, this.f1637f, this.f1635d, this.f1632a, this.f1633b, this.f1634c) : new C0337p2(this.f1635d, this.f1632a, this.f1633b, this.f1634c));
        }
    }

    /* renamed from: androidx.camera.camera2.internal.v2$b */
    /* loaded from: classes.dex */
    interface b {
        /* renamed from: c */
        Executor mo1662c();

        /* renamed from: d */
        C4487g mo1663d(int i10, List<C4482b> list, InterfaceC0313j2.a aVar);

        /* renamed from: f */
        InterfaceFutureC2565m<List<Surface>> mo1664f(List<AbstractC5073r0> list, long j10);

        /* renamed from: l */
        InterfaceFutureC2565m<Void> mo1665l(CameraDevice cameraDevice, C4487g c4487g, List<AbstractC5073r0> list);

        boolean stop();
    }

    C0361v2(b bVar) {
        this.f1631a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C4487g m1793a(int i10, List<C4482b> list, InterfaceC0313j2.a aVar) {
        return this.f1631a.mo1663d(i10, list, aVar);
    }

    /* renamed from: b */
    public Executor m1794b() {
        return this.f1631a.mo1662c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public InterfaceFutureC2565m<Void> m1795c(CameraDevice cameraDevice, C4487g c4487g, List<AbstractC5073r0> list) {
        return this.f1631a.mo1665l(cameraDevice, c4487g, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceFutureC2565m<List<Surface>> m1796d(List<AbstractC5073r0> list, long j10) {
        return this.f1631a.mo1664f(list, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m1797e() {
        return this.f1631a.stop();
    }
}
