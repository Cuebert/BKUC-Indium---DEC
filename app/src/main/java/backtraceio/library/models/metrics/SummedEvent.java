package backtraceio.library.models.metrics;

import backtraceio.library.common.BacktraceTimeHelper;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class SummedEvent extends Event {

    @SerializedName("metric_group")
    private final String name;

    public SummedEvent(String str) {
        this(str, new HashMap());
    }

    public void addAttributes(Map<String, Object> map) {
        addAttributesImpl(map);
    }

    @Override // backtraceio.library.models.metrics.Event
    public String getName() {
        return this.name;
    }

    public SummedEvent(String str, Map<String, Object> map) {
        this(str, BacktraceTimeHelper.getTimestampSeconds(), map);
    }

    public SummedEvent(String str, long j10, Map<String, Object> map) {
        super(j10);
        this.name = str;
        addAttributesImpl(map);
    }

    public SummedEvent(SummedEvent summedEvent) {
        this(summedEvent.name, summedEvent.timestamp, summedEvent.attributes);
    }
}
