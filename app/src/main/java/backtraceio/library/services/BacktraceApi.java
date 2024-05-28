package backtraceio.library.services;

import backtraceio.library.events.EventsOnServerResponseEventListener;
import backtraceio.library.events.EventsRequestHandler;
import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.events.RequestHandler;
import backtraceio.library.interfaces.Api;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.metrics.SummedEventsPayload;
import backtraceio.library.models.metrics.UniqueEventsPayload;
import p159m1.C3930b;

/* loaded from: classes.dex */
public class BacktraceApi implements Api {
    private static final transient String LOG_TAG = "BacktraceApi";
    private final String reportSubmissionUrl;
    private String summedEventsSubmissionUrl;
    private final transient BacktraceHandlerThread threadSender;
    private String uniqueEventsSubmissionUrl;
    private OnServerErrorEventListener onServerError = null;
    private RequestHandler requestHandler = null;
    private EventsRequestHandler uniqueEventsRequestHandler = null;
    private EventsRequestHandler summedEventsRequestHandler = null;
    private EventsOnServerResponseEventListener uniqueEventsServerResponse = null;
    private EventsOnServerResponseEventListener summedEventsServerResponse = null;

    public BacktraceApi(C3930b c3930b) {
        if (c3930b != null) {
            String uri = c3930b.m16675f().toString();
            this.reportSubmissionUrl = uri;
            this.threadSender = new BacktraceHandlerThread(BacktraceHandlerThread.class.getSimpleName(), uri);
            return;
        }
        BacktraceLogger.m6449e(LOG_TAG, "BacktraceCredentials parameter passed to BacktraceApi constructor is null");
        throw new IllegalArgumentException("BacktraceCredentials cannot be null");
    }

    @Override // backtraceio.library.interfaces.Api
    public SummedEventsHandler enableSummedEvents(BacktraceMetrics backtraceMetrics) {
        return this.threadSender.createSummedEventsHandler(backtraceMetrics, this);
    }

    @Override // backtraceio.library.interfaces.Api
    public UniqueEventsHandler enableUniqueEvents(BacktraceMetrics backtraceMetrics) {
        return this.threadSender.createUniqueEventsHandler(backtraceMetrics, this);
    }

    @Override // backtraceio.library.interfaces.Api
    public void send(BacktraceData backtraceData, OnServerResponseEventListener onServerResponseEventListener) {
        this.threadSender.sendReport(new BacktraceHandlerInputReport(backtraceData, onServerResponseEventListener, this.onServerError, this.requestHandler));
    }

    @Override // backtraceio.library.interfaces.Api
    public void sendEventsPayload(UniqueEventsPayload uniqueEventsPayload) {
        this.threadSender.sendUniqueEvents(new BacktraceHandlerInputEvents(uniqueEventsPayload, this.uniqueEventsServerResponse, this.onServerError, this.uniqueEventsRequestHandler));
    }

    @Override // backtraceio.library.interfaces.Api
    public void setOnServerError(OnServerErrorEventListener onServerErrorEventListener) {
        this.onServerError = onServerErrorEventListener;
    }

    @Override // backtraceio.library.interfaces.Api
    public void setRequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override // backtraceio.library.interfaces.Api
    public void setSummedEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener) {
        this.summedEventsServerResponse = eventsOnServerResponseEventListener;
    }

    @Override // backtraceio.library.interfaces.Api
    public void setSummedEventsRequestHandler(EventsRequestHandler eventsRequestHandler) {
        this.summedEventsRequestHandler = eventsRequestHandler;
    }

    @Override // backtraceio.library.interfaces.Api
    public void setUniqueEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener) {
        this.uniqueEventsServerResponse = eventsOnServerResponseEventListener;
    }

    @Override // backtraceio.library.interfaces.Api
    public void setUniqueEventsRequestHandler(EventsRequestHandler eventsRequestHandler) {
        this.uniqueEventsRequestHandler = eventsRequestHandler;
    }

    @Override // backtraceio.library.interfaces.Api
    public void sendEventsPayload(SummedEventsPayload summedEventsPayload) {
        this.threadSender.sendSummedEvents(new BacktraceHandlerInputEvents(summedEventsPayload, this.summedEventsServerResponse, this.onServerError, this.summedEventsRequestHandler));
    }
}
