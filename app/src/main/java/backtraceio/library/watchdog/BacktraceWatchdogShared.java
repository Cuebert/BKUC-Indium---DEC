package backtraceio.library.watchdog;

import backtraceio.library.logger.BacktraceLogger;
import p159m1.C3929a;

/* loaded from: classes.dex */
class BacktraceWatchdogShared {
    BacktraceWatchdogShared() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void sendReportCauseBlockedThread(C3929a c3929a, Thread thread, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent, String str) {
        BacktraceWatchdogTimeoutException backtraceWatchdogTimeoutException = new BacktraceWatchdogTimeoutException();
        backtraceWatchdogTimeoutException.setStackTrace(thread.getStackTrace());
        BacktraceLogger.m6450e(str, "Blocked thread detected, sending a report", backtraceWatchdogTimeoutException);
        if (onApplicationNotRespondingEvent != null) {
            onApplicationNotRespondingEvent.onEvent(backtraceWatchdogTimeoutException);
        } else if (c3929a != null) {
            c3929a.m16668c(backtraceWatchdogTimeoutException);
        }
    }
}
