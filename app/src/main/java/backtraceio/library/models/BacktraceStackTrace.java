package backtraceio.library.models;

import backtraceio.library.logger.BacktraceLogger;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class BacktraceStackTrace {
    private static final transient String LOG_TAG = "BacktraceStackTrace";
    private final Exception exception;
    private final ArrayList<BacktraceStackFrame> stackFrames = new ArrayList<>();

    public BacktraceStackTrace(Exception exc) {
        this.exception = exc;
        initialize();
    }

    private void initialize() {
        Exception exc = this.exception;
        StackTraceElement[] stackTrace = exc != null ? exc.getStackTrace() : Thread.currentThread().getStackTrace();
        if (stackTrace != null && stackTrace.length != 0) {
            setStacktraceInformation(stackTrace);
        } else {
            BacktraceLogger.m6451w(LOG_TAG, "StackTraceElements are null or empty");
        }
    }

    private void setStacktraceInformation(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null && stackTraceElement.getFileName() != null && stackTraceElement.getFileName().startsWith("Backtrace")) {
                    BacktraceLogger.m6448d(LOG_TAG, "Skipping frame because it comes from inside the Backtrace library");
                } else {
                    this.stackFrames.add(new BacktraceStackFrame(stackTraceElement));
                }
            }
            return;
        }
        BacktraceLogger.m6451w(LOG_TAG, "StackTraceFrames are null or empty");
    }

    public Exception getException() {
        return this.exception;
    }

    public ArrayList<BacktraceStackFrame> getStackFrames() {
        return this.stackFrames;
    }
}
