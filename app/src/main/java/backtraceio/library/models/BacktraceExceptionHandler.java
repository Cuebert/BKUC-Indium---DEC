package backtraceio.library.models;

import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.json.BacktraceReport;
import java.lang.Thread;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p159m1.C3929a;

/* loaded from: classes.dex */
public class BacktraceExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final transient String LOG_TAG = BacktraceExceptionHandler.class.getSimpleName();
    private static Map<String, Object> customAttributes;
    private final C3929a client;
    private final Thread.UncaughtExceptionHandler rootHandler;
    private final CountDownLatch signal = new CountDownLatch(1);

    private BacktraceExceptionHandler(C3929a c3929a) {
        BacktraceLogger.m6448d(LOG_TAG, "BacktraceExceptionHandler initialization");
        this.client = c3929a;
        this.rootHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void enable(C3929a c3929a) {
        new BacktraceExceptionHandler(c3929a);
    }

    private OnServerResponseEventListener getCallbackToDefaultHandler(final Thread thread, final Throwable th) {
        return new OnServerResponseEventListener() { // from class: backtraceio.library.models.BacktraceExceptionHandler.1
            @Override // backtraceio.library.events.OnServerResponseEventListener
            public void onEvent(BacktraceResult backtraceResult) {
                BacktraceLogger.m6448d(BacktraceExceptionHandler.LOG_TAG, "Root handler event callback");
                BacktraceExceptionHandler.this.rootHandler.uncaughtException(thread, th);
                BacktraceExceptionHandler.this.signal.countDown();
            }
        };
    }

    public static void setCustomAttributes(Map<String, Object> map) {
        customAttributes = map;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        OnServerResponseEventListener callbackToDefaultHandler = getCallbackToDefaultHandler(thread, th);
        if (th instanceof Exception) {
            String str = LOG_TAG;
            BacktraceLogger.m6450e(str, "Sending uncaught exception to Backtrace API", th);
            this.client.send(new BacktraceReport((Exception) th, customAttributes), callbackToDefaultHandler);
            BacktraceLogger.m6448d(str, "Uncaught exception sent to Backtrace API");
        }
        BacktraceLogger.m6448d(LOG_TAG, "Default uncaught exception handler");
        try {
            this.signal.await();
        } catch (Exception e10) {
            BacktraceLogger.m6450e(LOG_TAG, "Exception during waiting for response", e10);
        }
    }
}
