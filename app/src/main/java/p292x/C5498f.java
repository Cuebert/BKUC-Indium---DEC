package p292x;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x.f */
/* loaded from: classes.dex */
public final class C5498f {

    /* renamed from: a */
    private static volatile ScheduledExecutorService f20504a;

    private C5498f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ScheduledExecutorService m20232a() {
        if (f20504a != null) {
            return f20504a;
        }
        synchronized (C5498f.class) {
            if (f20504a == null) {
                f20504a = new ScheduledExecutorServiceC5495c(new Handler(Looper.getMainLooper()));
            }
        }
        return f20504a;
    }
}
