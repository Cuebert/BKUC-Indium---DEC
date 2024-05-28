package p218r;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: r.f */
/* loaded from: classes.dex */
public class C4382f extends Exception {

    /* renamed from: p */
    static final Set<Integer> f17911p = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: q */
    static final Set<Integer> f17912q = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* renamed from: n */
    private final int f17913n;

    /* renamed from: o */
    private final CameraAccessException f17914o;

    public C4382f(int i10, String str, Throwable th) {
        super(m18116a(i10, str), th);
        this.f17913n = i10;
        this.f17914o = f17911p.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, str, th) : null;
    }

    /* renamed from: a */
    private static String m18116a(int i10, String str) {
        return String.format("%s (%d): %s", m18118c(i10), Integer.valueOf(i10), str);
    }

    /* renamed from: b */
    private static String m18117b(int i10) {
        if (i10 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i10 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i10 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i10 == 4) {
            return "The camera device is in use already";
        }
        if (i10 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i10 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i10 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    /* renamed from: c */
    private static String m18118c(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 1000 ? i10 != 10001 ? i10 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    /* renamed from: e */
    public static C4382f m18119e(CameraAccessException cameraAccessException) {
        Objects.requireNonNull(cameraAccessException, "cameraAccessException should not be null");
        return new C4382f(cameraAccessException);
    }

    /* renamed from: d */
    public final int m18120d() {
        return this.f17913n;
    }

    public C4382f(int i10, Throwable th) {
        super(m18117b(i10), th);
        this.f17913n = i10;
        this.f17914o = f17911p.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, null, th) : null;
    }

    private C4382f(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f17913n = cameraAccessException.getReason();
        this.f17914o = cameraAccessException;
    }
}
