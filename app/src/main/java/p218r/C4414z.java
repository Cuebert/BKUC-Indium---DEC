package p218r;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* renamed from: r.z */
/* loaded from: classes.dex */
public class C4414z {

    /* renamed from: a */
    private final Map<CameraCharacteristics.Key<?>, Object> f17986a = new HashMap();

    /* renamed from: b */
    private final a f17987b;

    /* renamed from: r.z$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        <T> T mo18189a(CameraCharacteristics.Key<T> key);
    }

    private C4414z(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17987b = new C4412x(cameraCharacteristics);
        } else {
            this.f17987b = new C4413y(cameraCharacteristics);
        }
    }

    /* renamed from: b */
    private boolean m18190b(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    /* renamed from: c */
    public static C4414z m18191c(CameraCharacteristics cameraCharacteristics) {
        return new C4414z(cameraCharacteristics);
    }

    /* renamed from: a */
    public <T> T m18192a(CameraCharacteristics.Key<T> key) {
        if (m18190b(key)) {
            return (T) this.f17987b.mo18189a(key);
        }
        synchronized (this) {
            T t10 = (T) this.f17986a.get(key);
            if (t10 != null) {
                return t10;
            }
            T t11 = (T) this.f17987b.mo18189a(key);
            if (t11 != null) {
                this.f17986a.put(key, t11);
            }
            return t11;
        }
    }
}
