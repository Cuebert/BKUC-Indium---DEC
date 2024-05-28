package p242t;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import p218r.C4414z;
import p279w.InterfaceC5092x1;

/* renamed from: t.a */
/* loaded from: classes.dex */
public class C4563a implements InterfaceC5092x1 {

    /* renamed from: a */
    private final Range<Integer> f18332a;

    public C4563a(C4414z c4414z) {
        this.f18332a = m18647d((Range[]) c4414z.m18192a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: a */
    private Range<Integer> m18645a(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m18646c(C4414z c4414z) {
        Integer num = (Integer) c4414z.m18192a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: d */
    private Range<Integer> m18647d(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> m18645a = m18645a(range2);
                if (m18645a.getUpper().intValue() == 30 && (range == null || m18645a.getLower().intValue() < range.getLower().intValue())) {
                    range = m18645a;
                }
            }
        }
        return range;
    }

    /* renamed from: b */
    public Range<Integer> m18648b() {
        return this.f18332a;
    }
}
