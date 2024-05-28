package backtraceio.library.services;

import android.content.Context;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.events.EventsOnServerResponseEventListener;
import backtraceio.library.events.EventsRequestHandler;
import backtraceio.library.events.RequestHandler;
import backtraceio.library.interfaces.Api;
import backtraceio.library.interfaces.Metrics;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceMetricsSettings;
import backtraceio.library.models.json.BacktraceAttributes;
import backtraceio.library.models.metrics.SummedEvent;
import backtraceio.library.models.metrics.UniqueEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes.dex */
public final class BacktraceMetrics implements Metrics {
    private static final transient String LOG_TAG = "BacktraceMetrics";
    public static final String defaultBaseUrl = "https://events.backtrace.io/api";
    public static final int defaultTimeBetweenRetriesMs = 10000;
    public static final int defaultTimeIntervalInMin = 30;
    public static final long defaultTimeIntervalMs = 1800000;
    public static final int maxNumberOfAttempts = 3;
    public static final int maxTimeBetweenRetriesMs = 300000;
    private final Api backtraceApi;
    protected Context context;
    protected Map<String, Object> customReportAttributes;
    public SummedEventsHandler summedEventsHandler;
    public UniqueEventsHandler uniqueEventsHandler;
    public final String defaultUniqueEventName = "guid";
    private final String startupSummedEventName = "Application Launches";
    protected BacktraceMetricsSettings settings = null;
    private String startupUniqueEventName = "guid";
    private int maximumNumberOfEvents = 350;
    private final RequestHandler requestHandler = null;

    public BacktraceMetrics(Context context, Map<String, Object> map, Api api) {
        this.context = context;
        this.customReportAttributes = map;
        this.backtraceApi = api;
    }

    private boolean shouldProcessEvent(String str) {
        if (BacktraceStringHelper.isNullOrEmpty(str)) {
            BacktraceLogger.m6449e(LOG_TAG, "Cannot process event, attribute name is null or empty");
            return false;
        }
        if (this.maximumNumberOfEvents <= 0 || count() + 1 <= this.maximumNumberOfEvents) {
            return true;
        }
        BacktraceLogger.m6449e(LOG_TAG, "Cannot process event, reached maximum number of events: " + this.maximumNumberOfEvents + " events count: " + count());
        return false;
    }

    private void startMetricsEventHandlers(Api api) {
        this.uniqueEventsHandler = api.enableUniqueEvents(this);
        this.summedEventsHandler = api.enableSummedEvents(this);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public boolean addSummedEvent(String str) {
        return addSummedEvent(str, null);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public boolean addUniqueEvent(String str) {
        return addUniqueEvent(str, null);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public int count() {
        return getUniqueEvents().size() + getSummedEvents().size();
    }

    public Map<String, Object> createLocalAttributes(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.putAll(new BacktraceAttributes(this.context, null, this.customReportAttributes).getAllAttributes());
        return hashMap;
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void enable(BacktraceMetricsSettings backtraceMetricsSettings) {
        this.settings = backtraceMetricsSettings;
        BacktraceAttributes.enableMetrics();
        try {
            startMetricsEventHandlers(this.backtraceApi);
            sendStartupEvent();
            BacktraceLogger.m6448d(LOG_TAG, "Metrics enabled");
        } catch (Exception e10) {
            BacktraceLogger.m6449e(LOG_TAG, "Could not enable metrics, exception " + e10.getMessage());
        }
    }

    public String getBaseUrl() {
        return this.settings.getBaseUrl();
    }

    protected String getStartupUniqueEventName() {
        return this.startupUniqueEventName;
    }

    @Override // backtraceio.library.interfaces.Metrics
    public ConcurrentLinkedDeque<SummedEvent> getSummedEvents() {
        return this.summedEventsHandler.events;
    }

    @Override // backtraceio.library.interfaces.Metrics
    public ConcurrentLinkedDeque<UniqueEvent> getUniqueEvents() {
        return this.uniqueEventsHandler.events;
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void send() {
        this.uniqueEventsHandler.send();
        this.summedEventsHandler.send();
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void sendStartupEvent() {
        addUniqueEvent(this.startupUniqueEventName);
        addSummedEvent("Application Launches");
        this.uniqueEventsHandler.send();
        this.summedEventsHandler.send();
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void setMaximumNumberOfEvents(int i10) {
        this.maximumNumberOfEvents = i10;
        this.uniqueEventsHandler.setMaximumNumberOfEvents(i10);
        this.summedEventsHandler.setMaximumNumberOfEvents(i10);
    }

    public void setStartupUniqueEventName(String str) {
        this.startupUniqueEventName = str;
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void setSummedEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener) {
        this.backtraceApi.setSummedEventsOnServerResponse(eventsOnServerResponseEventListener);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void setSummedEventsRequestHandler(EventsRequestHandler eventsRequestHandler) {
        this.backtraceApi.setSummedEventsRequestHandler(eventsRequestHandler);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void setUniqueEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener) {
        this.backtraceApi.setUniqueEventsOnServerResponse(eventsOnServerResponseEventListener);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void setUniqueEventsRequestHandler(EventsRequestHandler eventsRequestHandler) {
        this.backtraceApi.setUniqueEventsRequestHandler(eventsRequestHandler);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public boolean addSummedEvent(String str, Map<String, Object> map) {
        if (!shouldProcessEvent(str)) {
            BacktraceLogger.m6451w(LOG_TAG, "Skipping report");
            return false;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        this.summedEventsHandler.events.addLast(new SummedEvent(str, BacktraceTimeHelper.getTimestampSeconds(), hashMap));
        if (count() != this.maximumNumberOfEvents) {
            return true;
        }
        this.uniqueEventsHandler.send();
        this.summedEventsHandler.send();
        return true;
    }

    @Override // backtraceio.library.interfaces.Metrics
    public boolean addUniqueEvent(String str, Map<String, Object> map) {
        if (!shouldProcessEvent(str)) {
            BacktraceLogger.m6451w(LOG_TAG, "Skipping report");
            return false;
        }
        Map<String, Object> createLocalAttributes = createLocalAttributes(map);
        if (!BacktraceStringHelper.isObjectNotNullOrNotEmptyString(createLocalAttributes.get(str))) {
            BacktraceLogger.m6451w(LOG_TAG, "Attribute name for Unique Event is not available in attribute scope");
            return false;
        }
        Iterator it = this.uniqueEventsHandler.events.iterator();
        while (it.hasNext()) {
            if (((UniqueEvent) it.next()).getName().equals(str)) {
                BacktraceLogger.m6451w(LOG_TAG, "Already defined unique event with this attribute name, skipping");
                return false;
            }
        }
        this.uniqueEventsHandler.events.addLast(new UniqueEvent(str, BacktraceTimeHelper.getTimestampSeconds(), createLocalAttributes));
        if (count() != this.maximumNumberOfEvents) {
            return true;
        }
        this.uniqueEventsHandler.send();
        this.summedEventsHandler.send();
        return true;
    }
}
