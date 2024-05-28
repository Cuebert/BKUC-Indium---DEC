package backtraceio.library.models;

import android.content.Context;
import backtraceio.library.common.FileHelper;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.json.Annotations;
import backtraceio.library.models.json.BacktraceAttributes;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.json.SourceCode;
import backtraceio.library.models.json.SourceCodeData;
import backtraceio.library.models.json.ThreadData;
import backtraceio.library.models.json.ThreadInformation;
import com.appsflyer.oaid.BuildConfig;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class BacktraceData {
    private static final transient String LOG_TAG = "BacktraceData";

    @SerializedName("agentVersion")
    public String agentVersion;

    @SerializedName("annotations")
    public Map<String, Object> annotations;

    @SerializedName("attributes")
    public Map<String, String> attributes;

    @SerializedName("classifiers")
    public String[] classifiers;
    public transient Context context;

    @SerializedName("langVersion")
    public String langVersion;

    @SerializedName("mainThread")
    public String mainThread;
    public transient BacktraceReport report;

    @SerializedName("sourceCode")
    public Map<String, SourceCode> sourceCode;

    @SerializedName("symbolication")
    public String symbolication;

    @SerializedName("threads")
    Map<String, ThreadInformation> threadInformationMap;

    @SerializedName("timestamp")
    public long timestamp;

    @SerializedName("uuid")
    public String uuid;

    @SerializedName("lang")
    public final String lang = "java";

    @SerializedName("agent")
    public final String agent = "backtrace-android";

    public BacktraceData(Context context, BacktraceReport backtraceReport, Map<String, Object> map) {
        if (backtraceReport == null) {
            return;
        }
        this.context = context;
        this.report = backtraceReport;
        setReportInformation();
        setThreadsInformation();
        setAttributes(map);
    }

    private void setAnnotations(Map<String, Object> map) {
        BacktraceLogger.m6448d(LOG_TAG, "Setting annotations");
        Map<String, String> map2 = this.attributes;
        this.annotations = Annotations.getAnnotations((map2 == null || !map2.containsKey("error.message")) ? null : this.attributes.get("error.message"), map);
    }

    private void setAttributes(Map<String, Object> map) {
        BacktraceLogger.m6448d(LOG_TAG, "Setting attributes");
        BacktraceAttributes backtraceAttributes = new BacktraceAttributes(this.context, this.report, map);
        this.attributes = backtraceAttributes.attributes;
        setAnnotations(backtraceAttributes.getComplexAttributes());
    }

    private void setReportInformation() {
        BacktraceLogger.m6448d(LOG_TAG, "Setting report information");
        this.uuid = this.report.uuid.toString();
        BacktraceReport backtraceReport = this.report;
        this.timestamp = backtraceReport.timestamp;
        this.classifiers = backtraceReport.exceptionTypeReport.booleanValue() ? new String[]{this.report.classifier} : null;
        this.langVersion = System.getProperty("java.version");
        try {
            this.agentVersion = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            BacktraceLogger.m6449e(LOG_TAG, "Could not resolve package version name");
            this.agentVersion = BuildConfig.FLAVOR;
        }
    }

    private void setThreadsInformation() {
        BacktraceLogger.m6448d(LOG_TAG, "Setting threads information");
        ThreadData threadData = new ThreadData(this.report.diagnosticStack);
        this.mainThread = threadData.getMainThread();
        this.threadInformationMap = threadData.threadInformation;
        SourceCodeData sourceCodeData = new SourceCodeData(this.report.diagnosticStack);
        this.sourceCode = sourceCodeData.data.isEmpty() ? null : sourceCodeData.data;
    }

    public List<String> getAttachments() {
        return FileHelper.filterOutFiles(this.context, this.report.attachmentPaths);
    }
}
