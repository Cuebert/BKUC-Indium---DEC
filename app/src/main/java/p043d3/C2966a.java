package p043d3;

import java.util.concurrent.ScheduledExecutorService;

@Deprecated
/* renamed from: d3.a */
/* loaded from: classes.dex */
public class C2966a {

    /* renamed from: a */
    private static a f12640a;

    /* renamed from: d3.a$a */
    /* loaded from: classes.dex */
    public interface a {
        @Deprecated
        /* renamed from: a */
        ScheduledExecutorService mo13429a();
    }

    @Deprecated
    /* renamed from: a */
    public static synchronized a m13428a() {
        a aVar;
        synchronized (C2966a.class) {
            if (f12640a == null) {
                f12640a = new C2967b();
            }
            aVar = f12640a;
        }
        return aVar;
    }
}
