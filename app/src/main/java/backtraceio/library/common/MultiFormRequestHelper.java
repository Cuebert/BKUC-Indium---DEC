package backtraceio.library.common;

import backtraceio.library.logger.BacktraceLogger;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MultiFormRequestHelper {
    private static final String BOUNDARY = "*****";
    private static final String CRLF = "\r\n";
    private static final String ENCODING = "utf-8";
    private static final transient String LOG_TAG = "MultiFormRequestHelper";
    private static final String TWO_HYPHENS = "--";

    public static void addEndOfRequest(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            BacktraceLogger.m6451w(LOG_TAG, "Output stream is null");
        } else {
            outputStream.write("--*****--\r\n".getBytes());
        }
    }

    private static void addFile(OutputStream outputStream, String str) throws IOException {
        if (str != null && outputStream != null) {
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(FileHelper.getFileNameFromPath(str));
            outputStream.write("--*****\r\n".getBytes());
            outputStream.write(getFileInfo("attachment_" + FileHelper.getFileNameFromPath(str)).getBytes());
            outputStream.write(("Content-Type: " + guessContentTypeFromName + CRLF).getBytes());
            outputStream.write(CRLF.getBytes());
            streamFile(outputStream, str);
            outputStream.write(CRLF.getBytes());
            return;
        }
        BacktraceLogger.m6451w(LOG_TAG, "Absolute path or output stream is null");
    }

    public static void addFiles(OutputStream outputStream, List<String> list) throws IOException {
        if (list != null && outputStream != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                addFile(outputStream, it.next());
            }
            return;
        }
        BacktraceLogger.m6451w(LOG_TAG, "Attachments or output stream is null");
    }

    public static void addJson(OutputStream outputStream, String str) throws IOException {
        if (BacktraceStringHelper.isNullOrEmpty(str)) {
            BacktraceLogger.m6451w(LOG_TAG, "JSON is null or empty");
            return;
        }
        if (outputStream == null) {
            BacktraceLogger.m6451w(LOG_TAG, "Output stream is null");
            return;
        }
        outputStream.write("--*****\r\n".getBytes());
        outputStream.write(getFileInfo("upload_file").getBytes());
        outputStream.write(CRLF.getBytes());
        outputStream.write(str.getBytes(ENCODING));
        outputStream.write(CRLF.getBytes());
    }

    public static String getContentType() {
        return "multipart/form-data;boundary=*****";
    }

    private static String getFileInfo(String str) {
        return "Content-Disposition: form-data; name=\"" + str + "\";filename=\"" + str + "\"" + CRLF;
    }

    public static void streamFile(OutputStream outputStream, String str) throws IOException {
        if (outputStream != null && str != null) {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            }
        } else {
            BacktraceLogger.m6451w(LOG_TAG, "Absolute path or output stream is null");
        }
    }
}
