package backtraceio.library.models.json;

import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceStackFrame;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class SourceCodeData {
    private static final transient String LOG_TAG = "SourceCodeData";
    public Map<String, SourceCode> data = new HashMap();

    public SourceCodeData(ArrayList<BacktraceStackFrame> arrayList) {
        String str = LOG_TAG;
        BacktraceLogger.m6448d(str, "Initialization source code data");
        if (arrayList != null && arrayList.size() != 0) {
            Iterator<BacktraceStackFrame> it = arrayList.iterator();
            while (it.hasNext()) {
                BacktraceStackFrame next = it.next();
                if (next != null && !next.sourceCode.equals(BuildConfig.FLAVOR)) {
                    this.data.put(next.sourceCode, new SourceCode(next));
                } else {
                    BacktraceLogger.m6451w(LOG_TAG, "Stack frame is null or sourceCode is empty");
                }
            }
            return;
        }
        BacktraceLogger.m6451w(str, "Exception stack is null or empty");
    }
}
