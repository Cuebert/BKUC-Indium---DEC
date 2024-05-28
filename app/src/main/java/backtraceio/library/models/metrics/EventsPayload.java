package backtraceio.library.models.metrics;

import backtraceio.library.models.metrics.Event;
import com.google.gson.annotations.SerializedName;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes.dex */
public abstract class EventsPayload<T extends Event> {
    private static final transient String LOG_TAG = "EventsPayload";

    @SerializedName("appversion")
    private final String appVersion;

    @SerializedName("application")
    private final String application;
    public transient int numRetries = 0;

    @SerializedName("metadata")
    private final EventsMetadata eventsMetadata = new EventsMetadata(0);

    public EventsPayload(String str, String str2) {
        this.application = str;
        this.appVersion = str2;
    }

    public int getDroppedEvents() {
        return this.eventsMetadata.getDroppedEvents();
    }

    public abstract ConcurrentLinkedDeque<T> getEvents();

    public void setDroppedEvents(int i10) {
        this.eventsMetadata.setDroppedEvents(i10);
    }
}
