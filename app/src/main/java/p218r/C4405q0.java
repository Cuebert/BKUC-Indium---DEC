package p218r;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.core.util.C0654h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p218r.C4373a0;
import p218r.C4397m0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.q0 */
/* loaded from: classes.dex */
public class C4405q0 implements C4397m0.b {

    /* renamed from: a */
    final CameraManager f17969a;

    /* renamed from: b */
    final Object f17970b;

    /* renamed from: r.q0$a */
    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a */
        final Map<CameraManager.AvailabilityCallback, C4397m0.a> f17971a = new HashMap();

        /* renamed from: b */
        final Handler f17972b;

        a(Handler handler) {
            this.f17972b = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4405q0(Context context, Object obj) {
        this.f17969a = (CameraManager) context.getSystemService("camera");
        this.f17970b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C4405q0 m18187f(Context context, Handler handler) {
        return new C4405q0(context, new a(handler));
    }

    @Override // p218r.C4397m0.b
    /* renamed from: a */
    public void mo18177a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        if (executor != null) {
            C4397m0.a aVar = null;
            a aVar2 = (a) this.f17970b;
            if (availabilityCallback != null) {
                synchronized (aVar2.f17971a) {
                    aVar = aVar2.f17971a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new C4397m0.a(executor, availabilityCallback);
                        aVar2.f17971a.put(availabilityCallback, aVar);
                    }
                }
            }
            this.f17969a.registerAvailabilityCallback(aVar, aVar2.f17972b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @Override // p218r.C4397m0.b
    /* renamed from: b */
    public void mo18178b(CameraManager.AvailabilityCallback availabilityCallback) {
        C4397m0.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f17970b;
            synchronized (aVar2.f17971a) {
                aVar = aVar2.f17971a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.m18176g();
        }
        this.f17969a.unregisterAvailabilityCallback(aVar);
    }

    @Override // p218r.C4397m0.b
    /* renamed from: c */
    public CameraCharacteristics mo18179c(String str) throws C4382f {
        try {
            return this.f17969a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C4382f.m18119e(e10);
        }
    }

    @Override // p218r.C4397m0.b
    /* renamed from: d */
    public void mo18180d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C4382f {
        C0654h.m3467f(executor);
        C0654h.m3467f(stateCallback);
        try {
            this.f17969a.openCamera(str, new C4373a0.b(executor, stateCallback), ((a) this.f17970b).f17972b);
        } catch (CameraAccessException e10) {
            throw C4382f.m18119e(e10);
        }
    }

    @Override // p218r.C4397m0.b
    /* renamed from: e */
    public String[] mo18181e() throws C4382f {
        try {
            return this.f17969a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw C4382f.m18119e(e10);
        }
    }
}
