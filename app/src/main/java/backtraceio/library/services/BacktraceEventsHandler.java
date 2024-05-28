package backtraceio.library.services;

import android.os.Handler;
import android.os.Message;
import backtraceio.library.common.BacktraceMathHelper;
import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.interfaces.Api;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.json.BacktraceAttributes;
import backtraceio.library.models.metrics.Event;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.EventsResult;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class BacktraceEventsHandler<T extends Event> extends Handler {
    private static final transient String LOG_TAG = BacktraceEventsHandler.class.getSimpleName();
    protected final Api api;
    protected String appVersion;
    protected String application;
    protected final BacktraceHandlerThread backtraceHandlerThread;
    protected final BacktraceMetrics backtraceMetrics;
    protected ConcurrentLinkedDeque<T> events;
    private int maximumNumberOfEvents;
    private final String submissionUrl;
    private final int timeBetweenRetriesMillis;

    public BacktraceEventsHandler(BacktraceMetrics backtraceMetrics, Api api, BacktraceHandlerThread backtraceHandlerThread, String str) {
        super(backtraceHandlerThread.getLooper());
        this.events = new ConcurrentLinkedDeque<>();
        this.maximumNumberOfEvents = 350;
        if (backtraceHandlerThread.isAlive()) {
            this.backtraceMetrics = backtraceMetrics;
            this.backtraceHandlerThread = backtraceHandlerThread;
            this.api = api;
            this.submissionUrl = backtraceMetrics.settings.getSubmissionUrl(str);
            this.timeBetweenRetriesMillis = backtraceMetrics.settings.getTimeBetweenRetriesMillis();
            final long timeIntervalMillis = backtraceMetrics.settings.getTimeIntervalMillis();
            BacktraceAttributes backtraceAttributes = new BacktraceAttributes(backtraceMetrics.context, null, null);
            this.application = backtraceAttributes.getApplicationName();
            this.appVersion = backtraceAttributes.getApplicationVersionOrEmpty();
            if (timeIntervalMillis != 0) {
                postDelayed(new Runnable() { // from class: backtraceio.library.services.BacktraceEventsHandler.1
                    @Override // java.lang.Runnable
                    public void run() {
                        this.send();
                        this.postDelayed(this, timeIntervalMillis);
                    }
                }, timeIntervalMillis);
                return;
            }
            return;
        }
        throw new NullPointerException("Handler thread is not alive, this should not happen");
    }

    private long calculateNextRetryTime(int i10) {
        double clamp = BacktraceMathHelper.clamp(this.timeBetweenRetriesMillis * Math.pow(10.0d, i10 - 1), 0.0d, 300000.0d);
        return (long) BacktraceMathHelper.uniform(clamp, (1.0d * clamp) + clamp);
    }

    private EventsResult getEventsResult(BacktraceHandlerInputEvents backtraceHandlerInputEvents) {
        if (backtraceHandlerInputEvents.eventsRequestHandler != null) {
            BacktraceLogger.m6448d(LOG_TAG, "Sending using custom request handler");
            return backtraceHandlerInputEvents.eventsRequestHandler.onRequest(backtraceHandlerInputEvents.payload);
        }
        BacktraceLogger.m6448d(LOG_TAG, "Sending report using default request handler");
        return BacktraceReportSender.sendEvents(this.submissionUrl, BacktraceSerializeHelper.toJson(backtraceHandlerInputEvents.payload), backtraceHandlerInputEvents.payload, backtraceHandlerInputEvents.serverErrorEventListener);
    }

    private void retrySendEvents(final BacktraceHandlerInputEvents backtraceHandlerInputEvents, int i10) {
        if (i10 <= 501 || i10 == 505) {
            return;
        }
        EventsPayload eventsPayload = backtraceHandlerInputEvents.payload;
        final int i11 = eventsPayload.numRetries + 1;
        eventsPayload.numRetries = i11;
        if (i11 < 3 && this.timeBetweenRetriesMillis != 0) {
            postDelayed(new Runnable() { // from class: backtraceio.library.services.BacktraceEventsHandler.2
                @Override // java.lang.Runnable
                public void run() {
                    EventsPayload<T> eventsPayload2 = backtraceHandlerInputEvents.payload;
                    eventsPayload2.setDroppedEvents(i11);
                    BacktraceEventsHandler.this.sendEventsPayload(eventsPayload2);
                }
            }, calculateNextRetryTime(i11));
        } else {
            onMaximumAttemptsReached(eventsPayload.getEvents());
        }
    }

    public int getCount() {
        return this.events.size();
    }

    protected abstract EventsPayload<T> getEventsPayload();

    public int getMaximumNumberOfEvents() {
        return this.maximumNumberOfEvents;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        BacktraceHandlerInputEvents backtraceHandlerInputEvents = (BacktraceHandlerInputEvents) message.obj;
        EventsResult eventsResult = getEventsResult(backtraceHandlerInputEvents);
        if (backtraceHandlerInputEvents.eventsOnServerResponseEventListener != null) {
            BacktraceLogger.m6448d(LOG_TAG, "Processing result using custom event");
            backtraceHandlerInputEvents.eventsOnServerResponseEventListener.onEvent(eventsResult);
        }
        retrySendEvents(backtraceHandlerInputEvents, eventsResult.getStatusCode());
    }

    protected void onMaximumAttemptsReached(ConcurrentLinkedDeque<T> concurrentLinkedDeque) {
    }

    public void send() {
        ConcurrentLinkedDeque<T> concurrentLinkedDeque = this.events;
        if (concurrentLinkedDeque == null || concurrentLinkedDeque.size() == 0) {
            return;
        }
        sendEvents(this.events);
    }

    protected abstract void sendEvents(ConcurrentLinkedDeque<T> concurrentLinkedDeque);

    protected abstract void sendEventsPayload(EventsPayload<T> eventsPayload);

    public void setMaximumNumberOfEvents(int i10) {
        this.maximumNumberOfEvents = i10;
    }
}
