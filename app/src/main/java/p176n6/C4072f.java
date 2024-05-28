package p176n6;

import android.os.AsyncTask;
import com.roblox.engine.jni.NativeReportingInterface;

/* renamed from: n6.f */
/* loaded from: classes.dex */
public class C4072f {

    /* renamed from: a */
    private static boolean f16533a;

    /* renamed from: b */
    private static boolean f16534b;

    /* renamed from: n6.f$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeReportingInterface.reportStopwatchAllStats();
        }
    }

    /* renamed from: a */
    public static void m16936a(String str) {
        if (m16938c()) {
            NativeReportingInterface.addStopwatchCheckpoint(str);
        }
    }

    /* renamed from: b */
    public static void m16937b() {
        if (f16534b) {
            return;
        }
        f16533a = true;
        NativeReportingInterface.initStopwatch();
    }

    /* renamed from: c */
    private static boolean m16938c() {
        return f16533a && !f16534b;
    }

    /* renamed from: d */
    public static void m16939d() {
        if (m16938c()) {
            f16534b = true;
            AsyncTask.execute(new a());
        }
    }
}
