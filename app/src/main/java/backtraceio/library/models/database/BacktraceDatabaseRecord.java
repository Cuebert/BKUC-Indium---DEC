package backtraceio.library.models.database;

import android.content.Context;
import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.FileHelper;
import backtraceio.library.interfaces.DatabaseRecordWriter;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.json.BacktraceReport;
import com.appsflyer.oaid.BuildConfig;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes.dex */
public class BacktraceDatabaseRecord {
    private static final transient String LOG_TAG = "BacktraceDatabaseRecord";
    transient DatabaseRecordWriter RecordWriter;
    private final transient String _path;

    @SerializedName("DataPath")
    private String diagnosticDataPath;

    /* renamed from: id */
    @SerializedName("Id")
    public UUID f5357id;
    public transient boolean locked;
    private transient BacktraceData record;

    @SerializedName("RecordName")
    private String recordPath;

    @SerializedName("ReportPath")
    private String reportPath;

    @SerializedName("Size")
    private long size;

    BacktraceDatabaseRecord() {
        UUID randomUUID = UUID.randomUUID();
        this.f5357id = randomUUID;
        this.locked = false;
        this._path = BuildConfig.FLAVOR;
        this.recordPath = String.format("%s-record.json", randomUUID);
        this.diagnosticDataPath = String.format("%s-attachment", this.f5357id);
        this.recordPath = String.format("%s-record.json", this.f5357id);
    }

    public static BacktraceDatabaseRecord readFromFile(File file) {
        String str = LOG_TAG;
        BacktraceLogger.m6448d(str, "Reading JSON from passed file");
        String readFile = FileHelper.readFile(file);
        if (BacktraceStringHelper.isNullOrEmpty(readFile)) {
            BacktraceLogger.m6451w(str, "JSON from passed file is null or empty");
            return null;
        }
        return (BacktraceDatabaseRecord) BacktraceSerializeHelper.fromJson(readFile, BacktraceDatabaseRecord.class);
    }

    public boolean close() {
        String str = LOG_TAG;
        BacktraceLogger.m6448d(str, "Trying unlock database record");
        try {
            this.locked = false;
            this.record = null;
            BacktraceLogger.m6448d(str, "Record unlocked");
            return true;
        } catch (Exception unused) {
            BacktraceLogger.m6449e(LOG_TAG, "Can not unlock record");
            return false;
        }
    }

    public void delete() {
        BacktraceLogger.m6448d(LOG_TAG, "Trying delete files from database");
        delete(this.reportPath);
        delete(this.diagnosticDataPath);
        delete(this.recordPath);
    }

    public BacktraceData getBacktraceData(Context context) {
        BacktraceData backtraceData = this.record;
        if (backtraceData != null) {
            return backtraceData;
        }
        if (!valid()) {
            BacktraceLogger.m6451w(LOG_TAG, "Database record is invalid");
            return null;
        }
        String readFile = FileHelper.readFile(new File(this.diagnosticDataPath));
        String readFile2 = FileHelper.readFile(new File(this.reportPath));
        try {
            BacktraceLogger.m6448d(LOG_TAG, "Deserialization diagnostic data");
            BacktraceData backtraceData2 = (BacktraceData) BacktraceSerializeHelper.fromJson(readFile, BacktraceData.class);
            backtraceData2.report = (BacktraceReport) BacktraceSerializeHelper.fromJson(readFile2, BacktraceReport.class);
            backtraceData2.context = context;
            return backtraceData2;
        } catch (Exception e10) {
            BacktraceLogger.m6450e(LOG_TAG, "Exception occurs on deserialization of diagnostic data", e10);
            return null;
        }
    }

    public String getDiagnosticDataPath() {
        return this.diagnosticDataPath;
    }

    public String getRecordPath() {
        return this.recordPath;
    }

    public String getReportPath() {
        return this.reportPath;
    }

    public long getSize() {
        return this.size;
    }

    public boolean save() {
        try {
            String str = LOG_TAG;
            BacktraceLogger.m6448d(str, "Trying saving data to internal app storage");
            this.diagnosticDataPath = save(this.record, String.format("%s-attachment", this.f5357id));
            this.reportPath = save(this.record.report, String.format("%s-report", this.f5357id));
            this.recordPath = new File(this._path, String.format("%s-record.json", this.f5357id)).getAbsolutePath();
            this.size += BacktraceSerializeHelper.toJson(this).getBytes(StandardCharsets.UTF_8).length;
            this.RecordWriter.write(this, String.format("%s-record", this.f5357id));
            BacktraceLogger.m6448d(str, "Saving data to internal app storage successful");
            return true;
        } catch (Exception e10) {
            BacktraceLogger.m6450e(LOG_TAG, "Received IOException while saving data to database", e10);
            return false;
        }
    }

    public void setSize(long j10) {
        this.size = j10;
    }

    public boolean valid() {
        return FileHelper.isFileExists(this.diagnosticDataPath) && FileHelper.isFileExists(this.reportPath);
    }

    private void delete(String str) {
        try {
            if (FileHelper.isFileExists(str)) {
                BacktraceLogger.m6448d(LOG_TAG, "Passed path exist, trying delete file on database record");
                new File(str).delete();
            }
        } catch (Exception e10) {
            BacktraceLogger.m6450e(LOG_TAG, String.format("Cannot delete file: %s", str), e10);
        }
    }

    public BacktraceDatabaseRecord(BacktraceData backtraceData, String str) {
        this.f5357id = UUID.randomUUID();
        this.locked = false;
        this.f5357id = UUID.fromString(backtraceData.uuid);
        this.record = backtraceData;
        this._path = str;
        this.RecordWriter = new BacktraceDatabaseRecordWriter(str);
    }

    private String save(Object obj, String str) {
        try {
            if (obj == null) {
                BacktraceLogger.m6451w(LOG_TAG, "Passed data parameter is null");
                return BuildConfig.FLAVOR;
            }
            byte[] bytes = BacktraceSerializeHelper.toJson(obj).getBytes(StandardCharsets.UTF_8);
            this.size += bytes.length;
            return this.RecordWriter.write(bytes, str);
        } catch (Exception e10) {
            BacktraceLogger.m6450e(LOG_TAG, "Received IOException while saving data to database", e10);
            return BuildConfig.FLAVOR;
        }
    }
}
