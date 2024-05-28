package backtraceio.library.models.metrics;

import backtraceio.library.common.BacktraceStringHelper;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Event {

    @SerializedName("attributes")
    protected Map<String, Object> attributes;

    @SerializedName("timestamp")
    protected long timestamp;

    public Event(long j10) {
        this.timestamp = j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addAttributesImpl(Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (BacktraceStringHelper.isObjectNotNullOrNotEmptyString(obj)) {
                hashMap.put(str, obj);
            }
        }
        Map<String, Object> map2 = this.attributes;
        if (map2 == null) {
            this.attributes = hashMap;
        } else {
            map2.putAll(hashMap);
        }
    }

    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public abstract String getName();

    public long getTimestamp() {
        return this.timestamp;
    }
}
