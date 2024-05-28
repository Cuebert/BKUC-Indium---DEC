package backtraceio.library.models.json;

import android.content.Context;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceStackFrame;
import backtraceio.library.models.BacktraceStackTrace;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class BacktraceReport {
    public List<String> attachmentPaths;
    public Map<String, Object> attributes;
    public String classifier;
    public ArrayList<BacktraceStackFrame> diagnosticStack;
    public Exception exception;
    public Boolean exceptionTypeReport;
    public String message;
    public long timestamp;
    public UUID uuid;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: backtraceio.library.models.json.BacktraceReport$1 */
    /* loaded from: classes.dex */
    public class C10901 extends HashMap<String, Object> {
        C10901() {
        }
    }

    public BacktraceReport(String str) {
        this((Exception) null, (Map<String, Object>) null, (List<String>) null);
        this.message = str;
    }

    public static Map<String, Object> concatAttributes(BacktraceReport backtraceReport, Map<String, Object> map) {
        Map<String, Object> map2 = backtraceReport.attributes;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (map == null) {
            return map2;
        }
        map2.putAll(map);
        return map2;
    }

    public BacktraceData toBacktraceData(Context context, Map<String, Object> map) {
        return toBacktraceData(context, map, false);
    }

    public BacktraceData toBacktraceData(Context context, Map<String, Object> map, boolean z10) {
        BacktraceData backtraceData = new BacktraceData(context, this, map);
        backtraceData.symbolication = z10 ? "proguard" : null;
        return backtraceData;
    }

    public BacktraceReport(String str, Map<String, Object> map) {
        this((Exception) null, map, (List<String>) null);
        this.message = str;
    }

    public BacktraceReport(String str, List<String> list) {
        this(str, (Map<String, Object>) null, list);
    }

    public BacktraceReport(String str, Map<String, Object> map, List<String> list) {
        this((Exception) null, map, list);
        this.message = str;
    }

    public BacktraceReport(Exception exc) {
        this(exc, (Map<String, Object>) null, (List<String>) null);
    }

    public BacktraceReport(Exception exc, Map<String, Object> map) {
        this(exc, map, (List<String>) null);
    }

    public BacktraceReport(Exception exc, List<String> list) {
        this(exc, (Map<String, Object>) null, list);
    }

    public BacktraceReport(Exception exc, Map<String, Object> map, List<String> list) {
        this.uuid = UUID.randomUUID();
        this.timestamp = BacktraceTimeHelper.getTimestampSeconds();
        this.exceptionTypeReport = Boolean.FALSE;
        this.classifier = BuildConfig.FLAVOR;
        this.attributes = map == null ? new HashMap<String, Object>() { // from class: backtraceio.library.models.json.BacktraceReport.1
            C10901() {
            }
        } : map;
        this.attachmentPaths = list == null ? new ArrayList<>() : list;
        this.exception = exc;
        this.exceptionTypeReport = Boolean.valueOf(exc != null);
        this.diagnosticStack = new BacktraceStackTrace(exc).getStackFrames();
        if (!this.exceptionTypeReport.booleanValue() || exc == null) {
            return;
        }
        this.classifier = exc.getClass().getCanonicalName();
    }
}
