package p176n6;

import android.content.Context;
import android.text.TextUtils;
import backtraceio.library.events.OnBeforeSendEventListener;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceExceptionHandler;
import backtraceio.library.watchdog.BacktraceWatchdogTimeoutException;
import backtraceio.library.watchdog.OnApplicationNotRespondingEvent;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2872n;
import com.roblox.client.C2877p0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.UUID;
import p023b9.C1079c;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1157q;
import p159m1.C3929a;
import p159m1.C3930b;
import p300x7.C5563e;

/* renamed from: n6.b */
/* loaded from: classes.dex */
public class C4068b {

    /* renamed from: a */
    public C3929a f16491a;

    /* renamed from: b */
    private UUID f16492b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n6.b$a */
    /* loaded from: classes.dex */
    public class a extends ArrayList<String> {

        /* renamed from: n */
        final /* synthetic */ String f16493n;

        a(String str) {
            this.f16493n = str;
            add(str);
        }
    }

    /* renamed from: n6.b$b */
    /* loaded from: classes.dex */
    public static class b implements OnApplicationNotRespondingEvent {

        /* renamed from: a */
        private final C3929a f16495a;

        public b(C3929a c3929a) {
            this.f16495a = c3929a;
        }

        /* renamed from: a */
        private static String m16895a(boolean z10) {
            return C2877p0.m12935m0() ? z10 ? "Quest-Backtrace-ANRException-Sent" : "Quest-Backtrace-ANRException-NotSent" : z10 ? "Android-Backtrace-ANRException-Sent" : "Android-Backtrace-ANRException-NotSent";
        }

        /* renamed from: b */
        private boolean m16896b() {
            return ((int) (Math.random() * 100.0d)) < C1134c.m6537a().mo6601d0();
        }

        /* renamed from: c */
        private void m16897c(boolean z10) {
            C5563e.m20379h().m20388A(m16895a(z10));
            if (!C1134c.m6537a().mo6592a0() || C2877p0.m12911c0()) {
                return;
            }
            C5563e.m20379h().m20388A(m16895a(z10) + "-Channel-" + C2877p0.m12890T());
        }

        @Override // backtraceio.library.watchdog.OnApplicationNotRespondingEvent
        public void onEvent(BacktraceWatchdogTimeoutException backtraceWatchdogTimeoutException) {
            C1151k.m6707a("rbx.backtrace", "OnApplicationNotRespondingEvent()");
            if (m16896b()) {
                m16897c(true);
                this.f16495a.m16668c(backtraceWatchdogTimeoutException);
            } else {
                m16897c(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n6.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        static final C4068b f16496a = new C4068b(null);
    }

    /* renamed from: n6.b$d */
    /* loaded from: classes.dex */
    public static class d implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        private final Thread.UncaughtExceptionHandler f16497a = Thread.getDefaultUncaughtExceptionHandler();

        /* renamed from: b */
        private final Thread.UncaughtExceptionHandler f16498b;

        public d(C3929a c3929a) {
            BacktraceExceptionHandler.enable(c3929a);
            this.f16498b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }

        /* renamed from: a */
        private static String m16898a(boolean z10) {
            return C2877p0.m12935m0() ? z10 ? "Quest-Backtrace-UnhandledException-Sent" : "Quest-Backtrace-UnhandledException-NotSent" : z10 ? "Android-Backtrace-UnhandledException-Sent" : "Android-Backtrace-UnhandledException-NotSent";
        }

        /* renamed from: b */
        private boolean m16899b(Throwable th) {
            return this.f16498b != null && (th instanceof Exception);
        }

        /* renamed from: c */
        private boolean m16900c() {
            return ((int) (Math.random() * 100.0d)) < C1134c.m6537a().mo6594b();
        }

        /* renamed from: d */
        private void m16901d(boolean z10) {
            C5563e.m20379h().m20388A(m16898a(z10));
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (m16900c() && m16899b(th)) {
                C1151k.m6707a("rbx.backtrace", "uncaughtException() using: " + this.f16498b);
                m16901d(true);
                this.f16498b.uncaughtException(thread, th);
                return;
            }
            C1151k.m6707a("rbx.backtrace", "uncaughtException() using: " + this.f16497a);
            if (this.f16497a != null) {
                m16901d(false);
                this.f16497a.uncaughtException(thread, th);
            }
        }
    }

    /* synthetic */ C4068b(a aVar) {
        this();
    }

    /* renamed from: b */
    private void m16891b(Context context) {
        try {
            Process start = new ProcessBuilder("logcat", "-t", C1134c.m6537a().mo6545D(), "-v", "time").start();
            File file = new File(context.getCacheDir(), "androidLog.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    bufferedWriter.write(readLine);
                    bufferedWriter.newLine();
                } else {
                    bufferedReader.close();
                    bufferedWriter.close();
                    start.destroy();
                    return;
                }
            }
        } catch (Exception e10) {
            C1151k.m6716j("rbx.backtrace", "Bypass Java log due to " + e10);
        }
    }

    /* renamed from: c */
    public static C4068b m16892c() {
        return c.f16496a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ BacktraceData m16893e(Context context, BacktraceData backtraceData) {
        backtraceData.attributes.put("BaseUrl", C2877p0.m12926i());
        backtraceData.attributes.put("UserId", Long.toString(C1079c.m6380c().m6389j()));
        backtraceData.attributes.put("IsInGame", Boolean.toString(C2872n.m12830h().m12836f().m13868i()));
        backtraceData.attributes.put("BuildVariant", "googleProd" + C1157q.m6751a(BuildConfig.BUILD_TYPE));
        backtraceData.attributes.put("BuildId", C2877p0.m12866H());
        UUID uuid = this.f16492b;
        if (uuid != null) {
            backtraceData.attributes.put("symbolication_id", uuid.toString());
        }
        m16891b(context);
        return backtraceData;
    }

    /* renamed from: d */
    public void m16894d(final Context context) {
        if (this.f16491a == null) {
            C3929a c3929a = new C3929a(context, new C3930b(C1134c.m6537a().mo6579U(), C1134c.m6537a().mo6555I()), new a(context.getCacheDir() + "/androidLog.txt"));
            this.f16491a = c3929a;
            if (this.f16492b != null) {
                c3929a.enableProguard();
            }
            this.f16491a.m16666a(C1134c.m6537a().mo6539A(), new b(this.f16491a));
            this.f16491a.setOnBeforeSendEventListener(new OnBeforeSendEventListener() { // from class: n6.a
                @Override // backtraceio.library.events.OnBeforeSendEventListener
                public final BacktraceData onEvent(BacktraceData backtraceData) {
                    BacktraceData m16893e;
                    m16893e = C4068b.this.m16893e(context, backtraceData);
                    return m16893e;
                }
            });
            new d(this.f16491a);
        }
    }

    private C4068b() {
        this.f16492b = null;
        if (C1134c.m6537a().mo6552G0()) {
            if (!TextUtils.isEmpty("8a82d513-2fc8-4450-b42f-4de7face24f8")) {
                try {
                    this.f16492b = UUID.fromString("8a82d513-2fc8-4450-b42f-4de7face24f8");
                    return;
                } catch (IllegalArgumentException unused) {
                    C1151k.m6712f("rbx.backtrace", "Could not parse provided symbolication ID.");
                    return;
                }
            }
            C1151k.m6712f("rbx.backtrace", "No symbolication ID provided.");
        }
    }
}
