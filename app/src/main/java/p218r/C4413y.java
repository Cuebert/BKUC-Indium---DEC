package p218r;

import android.hardware.camera2.CameraCharacteristics;
import p218r.C4414z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.y */
/* loaded from: classes.dex */
public class C4413y implements C4414z.a {

    /* renamed from: a */
    protected final CameraCharacteristics f17985a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4413y(CameraCharacteristics cameraCharacteristics) {
        this.f17985a = cameraCharacteristics;
    }

    @Override // p218r.C4414z.a
    /* renamed from: a */
    public <T> T mo18189a(CameraCharacteristics.Key<T> key) {
        return (T) this.f17985a.get(key);
    }
}
