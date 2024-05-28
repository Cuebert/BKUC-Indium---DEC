package p218r;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.o0 */
/* loaded from: classes.dex */
public class C4401o0 extends C4405q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4401o0(Context context) {
        super(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C4401o0 m18183g(Context context) {
        return new C4401o0(context);
    }

    /* renamed from: h */
    private boolean m18184h(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && m18185i(th);
    }

    /* renamed from: i */
    private static boolean m18185i(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    /* renamed from: j */
    private void m18186j(Throwable th) throws C4382f {
        throw new C4382f(10001, th);
    }

    @Override // p218r.C4405q0, p218r.C4397m0.b
    /* renamed from: a */
    public void mo18177a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f17969a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // p218r.C4405q0, p218r.C4397m0.b
    /* renamed from: b */
    public void mo18178b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f17969a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // p218r.C4405q0, p218r.C4397m0.b
    /* renamed from: c */
    public CameraCharacteristics mo18179c(String str) throws C4382f {
        try {
            return super.mo18179c(str);
        } catch (RuntimeException e10) {
            if (m18184h(e10)) {
                m18186j(e10);
            }
            throw e10;
        }
    }

    @Override // p218r.C4405q0, p218r.C4397m0.b
    /* renamed from: d */
    public void mo18180d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C4382f {
        try {
            this.f17969a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C4382f.m18119e(e10);
        } catch (IllegalArgumentException e11) {
            throw e11;
        } catch (SecurityException e12) {
        } catch (RuntimeException e13) {
            if (m18184h(e13)) {
                m18186j(e13);
            }
            throw e13;
        }
    }
}
