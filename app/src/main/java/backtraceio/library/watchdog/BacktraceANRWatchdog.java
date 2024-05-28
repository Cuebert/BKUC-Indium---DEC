package backtraceio.library.watchdog;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import backtraceio.library.logger.BacktraceLogger;
import java.util.Calendar;
import p159m1.C3929a;

/* loaded from: classes.dex */
public class BacktraceANRWatchdog extends Thread {
    private static final transient int DEFAULT_ANR_TIMEOUT = 5000;
    private static final transient String LOG_TAG = BacktraceANRWatchdog.class.getSimpleName();
    private final C3929a backtraceClient;
    private final boolean debug;
    private final Handler mainThreadHandler;
    private OnApplicationNotRespondingEvent onApplicationNotRespondingEvent;
    private volatile boolean shouldStop;
    private final int timeout;

    /* renamed from: backtraceio.library.watchdog.BacktraceANRWatchdog$1 */
    /* loaded from: classes.dex */
    class RunnableC10961 implements Runnable {
        final /* synthetic */ BacktraceThreadWatcher val$threadWatcher;

        RunnableC10961(BacktraceThreadWatcher backtraceThreadWatcher) {
            r2 = backtraceThreadWatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            r2.tickCounter();
        }
    }

    public BacktraceANRWatchdog(C3929a c3929a) {
        this(c3929a, DEFAULT_ANR_TIMEOUT);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Boolean bool = Boolean.FALSE;
        while (!this.shouldStop && !isInterrupted()) {
            String date = Calendar.getInstance().getTime().toString();
            String str = LOG_TAG;
            BacktraceLogger.m6448d(str, "ANR WATCHDOG - " + date);
            BacktraceThreadWatcher backtraceThreadWatcher = new BacktraceThreadWatcher(0, 0);
            this.mainThreadHandler.post(new Runnable() { // from class: backtraceio.library.watchdog.BacktraceANRWatchdog.1
                final /* synthetic */ BacktraceThreadWatcher val$threadWatcher;

                RunnableC10961(BacktraceThreadWatcher backtraceThreadWatcher2) {
                    r2 = backtraceThreadWatcher2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.tickCounter();
                }
            });
            try {
                Thread.sleep(this.timeout);
                backtraceThreadWatcher2.tickPrivateCounter();
                if (backtraceThreadWatcher2.getCounter() == backtraceThreadWatcher2.getPrivateCounter()) {
                    bool = Boolean.FALSE;
                    BacktraceLogger.m6448d(str, "ANR is not detected");
                } else if (this.debug && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                    BacktraceLogger.m6451w(str, "ANR detected but will be ignored because debug mode is on and connected debugger");
                } else if (!bool.booleanValue()) {
                    bool = Boolean.TRUE;
                    BacktraceWatchdogShared.sendReportCauseBlockedThread(this.backtraceClient, Looper.getMainLooper().getThread(), this.onApplicationNotRespondingEvent, str);
                }
            } catch (InterruptedException e10) {
                BacktraceLogger.m6450e(LOG_TAG, "Thread is interrupted", e10);
                return;
            }
        }
    }

    public void setOnApplicationNotRespondingEvent(OnApplicationNotRespondingEvent onApplicationNotRespondingEvent) {
        this.onApplicationNotRespondingEvent = onApplicationNotRespondingEvent;
    }

    public void stopMonitoringAnr() {
        BacktraceLogger.m6448d(LOG_TAG, "Stop monitoring ANR");
        this.shouldStop = true;
    }

    public BacktraceANRWatchdog(C3929a c3929a, int i10) {
        this(c3929a, i10, false);
    }

    public BacktraceANRWatchdog(C3929a c3929a, int i10, boolean z10) {
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        this.shouldStop = false;
        BacktraceLogger.m6448d(LOG_TAG, "Start monitoring ANR");
        this.backtraceClient = c3929a;
        this.timeout = i10;
        this.debug = z10;
        start();
    }
}
