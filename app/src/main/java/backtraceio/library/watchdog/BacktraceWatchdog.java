package backtraceio.library.watchdog;

import backtraceio.library.logger.BacktraceLogger;
import java.util.HashMap;
import java.util.Map;
import p159m1.C3929a;

/* loaded from: classes.dex */
public class BacktraceWatchdog {
    private static final transient String LOG_TAG = "BacktraceWatchdog";
    private final C3929a backtraceClient;
    private OnApplicationNotRespondingEvent onApplicationNotRespondingEvent;
    private final boolean sendException;
    private final Map<Thread, BacktraceThreadWatcher> threadsIdWatcher;

    public BacktraceWatchdog(C3929a c3929a, boolean z10) {
        this.threadsIdWatcher = new HashMap();
        this.sendException = z10;
        this.backtraceClient = c3929a;
    }

    public void activateWatcher(Thread thread) {
        BacktraceThreadWatcher backtraceThreadWatcher;
        if (this.threadsIdWatcher.containsKey(thread) && (backtraceThreadWatcher = this.threadsIdWatcher.get(thread)) != null) {
            backtraceThreadWatcher.setActive(true);
        }
    }

    public boolean checkIsAnyThreadIsBlocked() {
        long timeout;
        long currentTimeMillis = System.currentTimeMillis();
        String l10 = Long.toString(currentTimeMillis);
        BacktraceLogger.m6448d(LOG_TAG, "Checking watchdog. Timestamp: " + l10);
        for (Map.Entry<Thread, BacktraceThreadWatcher> entry : this.threadsIdWatcher.entrySet()) {
            Thread key = entry.getKey();
            BacktraceThreadWatcher value = entry.getValue();
            if (key != null && value != null && key != Thread.currentThread() && key.isAlive() && value.isActive()) {
                if (value.getCounter() != value.getPrivateCounter()) {
                    value.setPrivateCounter(value.getCounter());
                    value.setLastTimestamp(currentTimeMillis);
                } else {
                    String str = LOG_TAG;
                    BacktraceLogger.m6451w(str, String.format("Thread %d %s  might be hung, timestamp: %s", Long.valueOf(key.getId()), key.getName(), l10));
                    long lastTimestamp = value.getLastTimestamp();
                    if (lastTimestamp == 0) {
                        timeout = value.getTimeout();
                    } else {
                        timeout = value.getTimeout() + value.getDelay();
                    }
                    if (currentTimeMillis - lastTimestamp > timeout) {
                        if (this.sendException) {
                            BacktraceWatchdogShared.sendReportCauseBlockedThread(this.backtraceClient, key, this.onApplicationNotRespondingEvent, str);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void deactivateWatcher(Thread thread) {
        BacktraceThreadWatcher backtraceThreadWatcher;
        if (this.threadsIdWatcher.containsKey(thread) && (backtraceThreadWatcher = this.threadsIdWatcher.get(thread)) != null) {
            backtraceThreadWatcher.setActive(false);
        }
    }

    public void registerThread(Thread thread, int i10, int i11) {
        this.threadsIdWatcher.put(thread, new BacktraceThreadWatcher(i10, i11));
    }

    public void setOnApplicationNotRespondingEvent(OnApplicationNotRespondingEvent onApplicationNotRespondingEvent) {
        this.onApplicationNotRespondingEvent = onApplicationNotRespondingEvent;
    }

    public void tick(Thread thread) {
        BacktraceThreadWatcher backtraceThreadWatcher;
        if (this.threadsIdWatcher.containsKey(thread) && (backtraceThreadWatcher = this.threadsIdWatcher.get(thread)) != null) {
            backtraceThreadWatcher.tickCounter();
        }
    }

    public void unRegisterThread(Thread thread) {
        this.threadsIdWatcher.remove(thread);
    }

    public BacktraceWatchdog(C3929a c3929a) {
        this(c3929a, true);
    }
}
