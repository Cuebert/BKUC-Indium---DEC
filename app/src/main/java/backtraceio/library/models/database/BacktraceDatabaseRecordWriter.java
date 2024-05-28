package backtraceio.library.models.database;

import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.interfaces.DatabaseRecordWriter;
import backtraceio.library.logger.BacktraceLogger;
import com.appsflyer.oaid.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public class BacktraceDatabaseRecordWriter implements DatabaseRecordWriter {
    private static final transient String LOG_TAG = "BacktraceDatabaseRecordWriter";
    private final String _destinationPath;

    public BacktraceDatabaseRecordWriter(String str) {
        this._destinationPath = str;
    }

    private void saveTemporaryFile(String str, byte[] bArr) throws IOException {
        BacktraceLogger.m6448d(LOG_TAG, "Saving temporary file");
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    private void saveValidRecord(String str, String str2) throws IOException {
        if (new File(str).renameTo(new File(str2))) {
            return;
        }
        BacktraceLogger.m6449e(LOG_TAG, "Can not rename file");
        throw new IOException(String.format("Can not rename file. Source path: %s, destination path: %s", str, str2));
    }

    private String toJsonFile(Object obj) {
        if (obj == null) {
            BacktraceLogger.m6451w(LOG_TAG, "Passed object to serialization is null");
            return BuildConfig.FLAVOR;
        }
        return BacktraceSerializeHelper.toJson(obj);
    }

    @Override // backtraceio.library.interfaces.DatabaseRecordWriter
    public String write(Object obj, String str) throws IOException {
        return write(toJsonFile(obj).getBytes(StandardCharsets.UTF_8), str);
    }

    @Override // backtraceio.library.interfaces.DatabaseRecordWriter
    public String write(byte[] bArr, String str) throws IOException {
        String format = String.format("%s.json", str);
        String absolutePath = new File(this._destinationPath, String.format("temp_%s", format)).getAbsolutePath();
        saveTemporaryFile(absolutePath, bArr);
        String absolutePath2 = new File(this._destinationPath, format).getAbsolutePath();
        saveValidRecord(absolutePath, absolutePath2);
        return absolutePath2;
    }
}
