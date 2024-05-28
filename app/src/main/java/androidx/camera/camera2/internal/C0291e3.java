package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0444l2;
import androidx.camera.core.C0451n1;
import androidx.camera.core.InterfaceC0443l1;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import p001a0.C0001a;
import p218r.C4414z;
import p279w.AbstractC5032h;
import p279w.AbstractC5073r0;
import p279w.C5015c2;
import p279w.C5038i1;
import p279w.InterfaceC5034h1;
import p279w.InterfaceC5068q;
import p292x.C5493a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.e3 */
/* loaded from: classes.dex */
public final class C0291e3 implements InterfaceC0276b3 {

    /* renamed from: a */
    final Queue<InterfaceC0443l1> f1282a = new LinkedList();

    /* renamed from: b */
    final Queue<TotalCaptureResult> f1283b = new LinkedList();

    /* renamed from: c */
    private boolean f1284c = false;

    /* renamed from: d */
    private boolean f1285d;

    /* renamed from: e */
    private boolean f1286e;

    /* renamed from: f */
    C0444l2 f1287f;

    /* renamed from: g */
    private AbstractC5073r0 f1288g;

    /* renamed from: h */
    ImageWriter f1289h;

    /* renamed from: androidx.camera.camera2.internal.e3$a */
    /* loaded from: classes.dex */
    class a extends AbstractC5032h {
        a() {
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: b */
        public void mo1399b(InterfaceC5068q interfaceC5068q) {
            super.mo1399b(interfaceC5068q);
            CaptureResult mo1387e = interfaceC5068q.mo1387e();
            if (mo1387e == null || !(mo1387e instanceof TotalCaptureResult)) {
                return;
            }
            C0291e3.this.f1283b.add((TotalCaptureResult) mo1387e);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.e3$b */
    /* loaded from: classes.dex */
    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                C0291e3.this.f1289h = C0001a.m6c(inputSurface, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0291e3(C4414z c4414z) {
        this.f1285d = false;
        this.f1286e = false;
        this.f1285d = C0301g3.m1497a(c4414z, 7);
        this.f1286e = C0301g3.m1497a(c4414z, 4);
    }

    /* renamed from: f */
    private void m1397f() {
        Queue<InterfaceC0443l1> queue = this.f1282a;
        while (!queue.isEmpty()) {
            queue.remove().close();
        }
        this.f1283b.clear();
        AbstractC5073r0 abstractC5073r0 = this.f1288g;
        if (abstractC5073r0 != null) {
            C0444l2 c0444l2 = this.f1287f;
            if (c0444l2 != null) {
                abstractC5073r0.m19682i().mo2501b(new RunnableC0281c3(c0444l2), C5493a.m20222d());
            }
            abstractC5073r0.m19676c();
        }
        ImageWriter imageWriter = this.f1289h;
        if (imageWriter != null) {
            imageWriter.close();
            this.f1289h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m1398g(InterfaceC5034h1 interfaceC5034h1) {
        InterfaceC0443l1 mo1871c = interfaceC5034h1.mo1871c();
        if (mo1871c != null) {
            this.f1282a.add(mo1871c);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0276b3
    /* renamed from: a */
    public void mo1350a(Size size, C5015c2.b bVar) {
        if (this.f1284c) {
            return;
        }
        if (this.f1285d || this.f1286e) {
            m1397f();
            int i10 = this.f1285d ? 35 : 34;
            C0444l2 c0444l2 = new C0444l2(C0451n1.m2162a(size.getWidth(), size.getHeight(), i10, 2));
            this.f1287f = c0444l2;
            c0444l2.mo1873e(new InterfaceC5034h1.a() { // from class: androidx.camera.camera2.internal.d3
                @Override // p279w.InterfaceC5034h1.a
                /* renamed from: a */
                public final void mo1382a(InterfaceC5034h1 interfaceC5034h1) {
                    C0291e3.this.m1398g(interfaceC5034h1);
                }
            }, C5493a.m20221c());
            C5038i1 c5038i1 = new C5038i1(this.f1287f.mo1870a(), new Size(this.f1287f.mo1875g(), this.f1287f.getHeight()), i10);
            this.f1288g = c5038i1;
            C0444l2 c0444l22 = this.f1287f;
            InterfaceFutureC2565m<Void> m19682i = c5038i1.m19682i();
            Objects.requireNonNull(c0444l22);
            m19682i.mo2501b(new RunnableC0281c3(c0444l22), C5493a.m20222d());
            bVar.m19512k(this.f1288g);
            bVar.m19505d(new a());
            bVar.m19511j(new b());
            bVar.m19518r(new InputConfiguration(this.f1287f.mo1875g(), this.f1287f.getHeight(), this.f1287f.mo1872d()));
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0276b3
    /* renamed from: b */
    public void mo1351b(boolean z10) {
        this.f1284c = z10;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0276b3
    /* renamed from: c */
    public boolean mo1352c(InterfaceC0443l1 interfaceC0443l1) {
        ImageWriter imageWriter;
        Image mo1852J = interfaceC0443l1.mo1852J();
        if (Build.VERSION.SDK_INT < 23 || (imageWriter = this.f1289h) == null || mo1852J == null) {
            return false;
        }
        C0001a.m8e(imageWriter, mo1852J);
        return true;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0276b3
    /* renamed from: d */
    public InterfaceC0443l1 mo1353d() {
        try {
            return this.f1282a.remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }
}
