package p242t;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.C0463q1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p218r.C4414z;
import p279w.InterfaceC5092x1;

/* renamed from: t.e */
/* loaded from: classes.dex */
public class C4570e implements InterfaceC5092x1 {

    /* renamed from: a */
    private final List<Size> f18333a;

    public C4570e(C4414z c4414z) {
        List<Size> emptyList;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c4414z.m18192a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C0463q1.m2204c("CamcorderProfileResolutionQuirk", "StreamConfigurationMap is null");
        }
        Size[] sizeArr = null;
        if (Build.VERSION.SDK_INT < 23) {
            if (streamConfigurationMap != null) {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            }
        } else if (streamConfigurationMap != null) {
            sizeArr = streamConfigurationMap.getOutputSizes(34);
        }
        if (sizeArr != null) {
            emptyList = Arrays.asList((Size[]) sizeArr.clone());
        } else {
            emptyList = Collections.emptyList();
        }
        this.f18333a = emptyList;
        C0463q1.m2202a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + emptyList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m18657b(C4414z c4414z) {
        Integer num = (Integer) c4414z.m18192a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: a */
    public List<Size> m18658a() {
        return new ArrayList(this.f18333a);
    }
}
