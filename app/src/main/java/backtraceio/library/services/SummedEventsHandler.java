package backtraceio.library.services;

import android.os.Message;
import backtraceio.library.interfaces.Api;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.SummedEvent;
import backtraceio.library.models.metrics.SummedEventsPayload;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes.dex */
public class SummedEventsHandler extends BacktraceEventsHandler<SummedEvent> {
    private static final transient String LOG_TAG = SummedEventsHandler.class.getSimpleName();
    private static final String urlPrefix = "summed-events";

    public SummedEventsHandler(BacktraceMetrics backtraceMetrics, Api api, BacktraceHandlerThread backtraceHandlerThread) {
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
    protected void onMaximumAttemptsReached(ConcurrentLinkedDeque<SummedEvent> concurrentLinkedDeque) {
        if (this.events.size() + concurrentLinkedDeque.size() < getMaximumNumberOfEvents()) {
            Iterator<SummedEvent> it = concurrentLinkedDeque.iterator();
            while (it.hasNext()) {
                this.events.addFirst(it.next());
            }
        }
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ void send() {
        super.send();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [backtraceio.library.models.metrics.SummedEventsPayload] */
    @Override // backtraceio.library.services.BacktraceEventsHandler
    protected void sendEvents(ConcurrentLinkedDeque<SummedEvent> concurrentLinkedDeque) {
        this.api.sendEventsPayload((SummedEventsPayload) getEventsPayload());
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    protected void sendEventsPayload(EventsPayload<SummedEvent> eventsPayload) {
        this.api.sendEventsPayload((SummedEventsPayload) eventsPayload);
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ void setMaximumNumberOfEvents(int i10) {
        super.setMaximumNumberOfEvents(i10);
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public EventsPayload<SummedEvent> getEventsPayload() {
        Map<String, Object> createLocalAttributes = this.backtraceMetrics.createLocalAttributes(null);
        ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
        Iterator it = this.events.iterator();
        while (it.hasNext()) {
            SummedEvent summedEvent = (SummedEvent) it.next();
            summedEvent.addAttributes(createLocalAttributes);
            concurrentLinkedDeque.addLast(new SummedEvent(summedEvent));
        }
        this.events.clear();
        return new SummedEventsPayload(concurrentLinkedDeque, this.application, this.appVersion);
    }
}
