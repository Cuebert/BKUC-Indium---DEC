package backtraceio.library.services;

import android.os.Message;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.interfaces.Api;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.UniqueEvent;
import backtraceio.library.models.metrics.UniqueEventsPayload;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes.dex */
public class UniqueEventsHandler extends BacktraceEventsHandler<UniqueEvent> {
    private static final transient String LOG_TAG = UniqueEventsHandler.class.getSimpleName();
    private static final String urlPrefix = "unique-events";

    public UniqueEventsHandler(BacktraceMetrics backtraceMetrics, Api api, BacktraceHandlerThread backtraceHandlerThread) {
        super(backtraceMetrics, api, backtraceHandlerThread, urlPrefix);
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ int getMaximumNumberOfEvents() {
        return super.getMaximumNumberOfEvents();
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler, android.os.Handler
    public /* bridge */ /* synthetic */ void handleMessage(Message message) {
        super.handleMessage(message);
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ void send() {
        super.send();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [backtraceio.library.models.metrics.UniqueEventsPayload] */
    @Override // backtraceio.library.services.BacktraceEventsHandler
    protected void sendEvents(ConcurrentLinkedDeque<UniqueEvent> concurrentLinkedDeque) {
        this.api.sendEventsPayload((UniqueEventsPayload) getEventsPayload());
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    protected void sendEventsPayload(EventsPayload<UniqueEvent> eventsPayload) {
        this.api.sendEventsPayload((UniqueEventsPayload) eventsPayload);
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ void setMaximumNumberOfEvents(int i10) {
        super.setMaximumNumberOfEvents(i10);
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public EventsPayload<UniqueEvent> getEventsPayload() {
        Map<String, Object> createLocalAttributes = this.backtraceMetrics.createLocalAttributes(null);
        Iterator it = this.events.iterator();
        while (it.hasNext()) {
            ((UniqueEvent) it.next()).update(BacktraceTimeHelper.getTimestampSeconds(), createLocalAttributes);
        }
        return new UniqueEventsPayload(this.events, this.application, this.appVersion);
    }
}
