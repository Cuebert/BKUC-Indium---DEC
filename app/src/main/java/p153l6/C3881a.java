package p153l6;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import com.appsflyer.oaid.BuildConfig;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import p140k6.C3759a;
import p321z2.C5970c;
import p321z2.C5984j;

/* renamed from: l6.a */
/* loaded from: classes.dex */
public class C3881a {

    /* renamed from: c */
    private static final C5970c f16119c = new C5970c("StreamingFormatChecker", BuildConfig.FLAVOR);

    /* renamed from: a */
    private final LinkedList<Long> f16120a = new LinkedList<>();

    /* renamed from: b */
    private long f16121b = -1;

    /* renamed from: a */
    public void m16488a(@RecentlyNonNull C3759a c3759a) {
        if (c3759a.m15972d() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f16120a.add(Long.valueOf(elapsedRealtime));
        if (this.f16120a.size() > 5) {
            this.f16120a.removeFirst();
        }
        if (this.f16120a.size() != 5 || elapsedRealtime - ((Long) C5984j.m21286j(this.f16120a.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j10 = this.f16121b;
        if (j10 == -1 || elapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f16121b = elapsedRealtime;
            f16119c.m21261f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
