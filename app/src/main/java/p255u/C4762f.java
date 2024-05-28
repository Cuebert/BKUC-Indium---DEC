package p255u;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.C0463q1;
import java.nio.BufferUnderflowException;
import p218r.C4414z;
import p242t.C4577l;
import p242t.C4582q;

/* renamed from: u.f */
/* loaded from: classes.dex */
public final class C4762f {
    /* renamed from: a */
    private static boolean m18937a(C4414z c4414z) {
        Boolean bool = (Boolean) c4414z.m18192a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            C0463q1.m2212k("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m18938b(C4414z c4414z) {
        try {
            return m18937a(c4414z);
        } catch (BufferUnderflowException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m18939c(C4414z c4414z) {
        if (C4577l.m18665a(C4582q.class) != null) {
            C0463q1.m2202a("FlashAvailability", "Device has quirk " + C4582q.class.getSimpleName() + ". Checking for flash availability safely...");
            return m18938b(c4414z);
        }
        return m18937a(c4414z);
    }
}
