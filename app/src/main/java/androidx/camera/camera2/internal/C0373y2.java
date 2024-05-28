package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C0350t;
import androidx.camera.core.C0445m;
import androidx.camera.core.impl.utils.C0432l;
import androidx.concurrent.futures.C0541c;
import androidx.lifecycle.C0851r;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import p218r.C4414z;
import p255u.C4762f;

/* renamed from: androidx.camera.camera2.internal.y2 */
/* loaded from: classes.dex */
public final class C0373y2 {

    /* renamed from: a */
    private final C0350t f1665a;

    /* renamed from: b */
    private final C0851r<Integer> f1666b = new C0851r<>(0);

    /* renamed from: c */
    private final boolean f1667c;

    /* renamed from: d */
    private final Executor f1668d;

    /* renamed from: e */
    private boolean f1669e;

    /* renamed from: f */
    C0541c.a<Void> f1670f;

    /* renamed from: g */
    boolean f1671g;

    public C0373y2(C0350t c0350t, C4414z c4414z, Executor executor) {
        this.f1665a = c0350t;
        this.f1668d = executor;
        this.f1667c = C4762f.m18939c(c4414z);
        c0350t.m1735s(new C0350t.c() { // from class: androidx.camera.camera2.internal.x2
            public /* synthetic */ C0369x2() {
            }

            @Override // androidx.camera.camera2.internal.C0350t.c
            /* renamed from: a */
            public final boolean mo1400a(TotalCaptureResult totalCaptureResult) {
                boolean m1806d;
                m1806d = C0373y2.this.m1806d(totalCaptureResult);
                return m1806d;
            }
        });
    }

    /* renamed from: d */
    public /* synthetic */ boolean m1806d(TotalCaptureResult totalCaptureResult) {
        if (this.f1670f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f1671g) {
                this.f1670f.m2519c(null);
                this.f1670f = null;
            }
        }
        return false;
    }

    /* renamed from: f */
    private <T> void m1807f(C0851r<T> c0851r, T t10) {
        if (C0432l.m2120b()) {
            c0851r.mo4867o(t10);
        } else {
            c0851r.mo4865m(t10);
        }
    }

    /* renamed from: b */
    public void m1808b(C0541c.a<Void> aVar, boolean z10) {
        if (!this.f1667c) {
            if (aVar != null) {
                aVar.m2521f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f1669e) {
                m1807f(this.f1666b, 0);
                if (aVar != null) {
                    aVar.m2521f(new C0445m("Camera is not active."));
                    return;
                }
                return;
            }
            this.f1671g = z10;
            this.f1665a.m1738v(z10);
            m1807f(this.f1666b, Integer.valueOf(z10 ? 1 : 0));
            C0541c.a<Void> aVar2 = this.f1670f;
            if (aVar2 != null) {
                aVar2.m2521f(new C0445m("There is a new enableTorch being set"));
            }
            this.f1670f = aVar;
        }
    }

    /* renamed from: c */
    public LiveData<Integer> m1809c() {
        return this.f1666b;
    }

    /* renamed from: e */
    public void m1810e(boolean z10) {
        if (this.f1669e == z10) {
            return;
        }
        this.f1669e = z10;
        if (z10) {
            return;
        }
        if (this.f1671g) {
            this.f1671g = false;
            this.f1665a.m1738v(false);
            m1807f(this.f1666b, 0);
        }
        C0541c.a<Void> aVar = this.f1670f;
        if (aVar != null) {
            aVar.m2521f(new C0445m("Camera is not active."));
            this.f1670f = null;
        }
    }
}
