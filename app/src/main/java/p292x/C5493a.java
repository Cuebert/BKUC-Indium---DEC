package p292x;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: x.a */
/* loaded from: classes.dex */
public final class C5493a {
    /* renamed from: a */
    public static Executor m20219a() {
        return ExecutorC5494b.m20225a();
    }

    /* renamed from: b */
    public static Executor m20220b() {
        return ExecutorC5496d.m20230a();
    }

    /* renamed from: c */
    public static Executor m20221c() {
        return ExecutorC5497e.m20231a();
    }

    /* renamed from: d */
    public static ScheduledExecutorService m20222d() {
        return C5498f.m20232a();
    }

    /* renamed from: e */
    public static ScheduledExecutorService m20223e(Handler handler) {
        return new ScheduledExecutorServiceC5495c(handler);
    }

    /* renamed from: f */
    public static Executor m20224f(Executor executor) {
        return new ExecutorC5499g(executor);
    }
}
