package backtraceio.library.models.metrics;

import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.logger.BacktraceLogger;
import com.appsflyer.oaid.BuildConfig;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class UniqueEvent extends Event {
    private static final transient String LOG_TAG = "UniqueEvent";

    @SerializedName("unique")
    private final List<String> name;

    public UniqueEvent(String str) {
        this(str, new HashMap());
    }

    @Override // backtraceio.library.models.metrics.Event
    public String getName() {
        List<String> list = this.name;
        if (list != null && list.size() > 0 && !BacktraceStringHelper.isNullOrEmpty(this.name.get(0))) {
            return this.name.get(0);
        }
        BacktraceLogger.m6449e(LOG_TAG, "Unique Event name must not be null or empty");
        return BuildConfig.FLAVOR;
    }

    public void update(long j10, Map<String, Object> map) {
        this.timestamp = j10;
        addAttributesImpl(map);
    }

    public UniqueEvent(String str, Map<String, Object> map) {
        this(str, BacktraceTimeHelper.getTimestampSeconds(), map);
    }

    public UniqueEvent(String str, long j10, Map<String, Object> map) {
        super(j10);
        this.name = new ArrayList<String>(str) { // from class: backtraceio.library.models.metrics.UniqueEvent.1
            final /* synthetic */ String val$name;

            {
                this.val$name = str;
                add(str);
            }
        };
        addAttributesImpl(map);
    }
}
