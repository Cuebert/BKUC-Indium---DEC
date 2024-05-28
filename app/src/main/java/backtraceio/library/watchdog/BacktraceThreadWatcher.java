package backtraceio.library.watchdog;

/* loaded from: classes.dex */
public class BacktraceThreadWatcher {
    private boolean active;
    private int counter;
    private final int delay;
    private long lastTimestamp;
    private int privateCounter;
    private final int timeout;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BacktraceThreadWatcher(int i10, int i11) {
        this.timeout = i10;
        this.delay = i11;
        setActive(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int getCounter() {
        return this.counter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDelay() {
        return this.delay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getLastTimestamp() {
        return this.lastTimestamp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPrivateCounter() {
        return this.privateCounter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getTimeout() {
        return this.timeout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean isActive() {
        return this.active;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void setActive(boolean z10) {
        this.active = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLastTimestamp(long j10) {
        this.lastTimestamp = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPrivateCounter(int i10) {
        this.privateCounter = i10;
    }

    public synchronized void tickCounter() {
        this.counter++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void tickPrivateCounter() {
        this.privateCounter++;
    }
}
