package p218r;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.p0 */
/* loaded from: classes.dex */
public class C4403p0 extends C4401o0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4403p0(Context context) {
        super(context);
    }

    @Override // p218r.C4401o0, p218r.C4405q0, p218r.C4397m0.b
    /* renamed from: c */
    public CameraCharacteristics mo18179c(String str) throws C4382f {
        try {
            return this.f17969a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C4382f.m18119e(e10);
        }
    }

    @Override // p218r.C4401o0, p218r.C4405q0, p218r.C4397m0.b
    /* renamed from: d */
    public void mo18180d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C4382f {
        try {
            this.f17969a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C4382f.m18119e(e10);
        }
    }
}
