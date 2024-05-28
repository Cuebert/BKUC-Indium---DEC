package backtraceio.library.services;

import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.MultiFormRequestHelper;
import backtraceio.library.common.RequestHelper;
import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.EventsResult;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.models.types.HttpException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/* loaded from: classes.dex */
class BacktraceReportSender {
    private static final int CHUNK_SIZE = 131072;
    private static final String LOG_TAG = "BacktraceReportSender";

    BacktraceReportSender() {
    }

    private static String getResponse(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream;
        BacktraceLogger.m6448d(LOG_TAG, "Reading response from HTTP request");
        if (httpURLConnection.getResponseCode() < 400) {
            errorStream = httpURLConnection.getInputStream();
        } else {
            errorStream = httpURLConnection.getErrorStream();
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
            } else {
                bufferedReader.close();
                return sb2.toString();
            }
        }
    }

    public static EventsResult sendEvents(String str, String str2, EventsPayload eventsPayload, OnServerErrorEventListener onServerErrorEventListener) {
        EventsResult OnError;
        HttpURLConnection httpURLConnection;
        String str3;
        HttpURLConnection httpURLConnection2 = null;
        int i10 = -1;
        try {
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                        httpURLConnection.setRequestProperty("Content-Type", RequestHelper.getContentType());
                        str3 = LOG_TAG;
                        BacktraceLogger.m6448d(str3, "HttpURLConnection successfully initialized");
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        RequestHelper.addJson(dataOutputStream, str2);
                        RequestHelper.addEndOfRequest(dataOutputStream);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        i10 = httpURLConnection.getResponseCode();
                        BacktraceLogger.m6448d(str3, "Received response status from Backtrace API for HTTP request is: " + i10);
                    } catch (Exception e10) {
                        e = e10;
                        httpURLConnection2 = httpURLConnection;
                        if (onServerErrorEventListener != null) {
                            BacktraceLogger.m6448d(LOG_TAG, "Custom handler on server error");
                            onServerErrorEventListener.onEvent(e);
                        }
                        String str4 = LOG_TAG;
                        BacktraceLogger.m6450e(str4, "Sending HTTP request failed to Backtrace API", e);
                        BacktraceLogger.m6449e(str4, "Failed HTTP request URL " + str);
                        OnError = EventsResult.OnError(eventsPayload, e, -1);
                        if (httpURLConnection2 == null) {
                            return OnError;
                        }
                        httpURLConnection2.disconnect();
                        BacktraceLogger.m6448d(str4, "Disconnecting HttpUrlConnection successful");
                        return OnError;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection2 = httpURLConnection;
                        if (httpURLConnection2 != null) {
                            try {
                                httpURLConnection2.disconnect();
                                BacktraceLogger.m6448d(LOG_TAG, "Disconnecting HttpUrlConnection successful");
                            } catch (Exception e11) {
                                BacktraceLogger.m6450e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e11);
                                EventsResult.OnError(eventsPayload, e11, -1);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (i10 == 200) {
                OnError = new EventsResult(eventsPayload, httpURLConnection.getResponseMessage(), BacktraceResultStatus.Ok, i10);
                httpURLConnection.disconnect();
                BacktraceLogger.m6448d(str3, "Disconnecting HttpUrlConnection successful");
                return OnError;
            }
            String response = getResponse(httpURLConnection);
            if (BacktraceStringHelper.isNullOrEmpty(response)) {
                response = httpURLConnection.getResponseMessage();
            }
            throw new HttpException(Integer.valueOf(i10), String.format("%s: %s", Integer.valueOf(i10), response));
        } catch (Exception e13) {
            BacktraceLogger.m6450e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e13);
            return EventsResult.OnError(eventsPayload, e13, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BacktraceResult sendReport(String str, String str2, List<String> list, BacktraceReport backtraceReport, OnServerErrorEventListener onServerErrorEventListener) {
        BacktraceResult OnError;
        HttpURLConnection httpURLConnection;
        String str3;
        int responseCode;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setChunkedStreamingMode(CHUNK_SIZE);
                        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                        httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
                        httpURLConnection.setRequestProperty("Content-Type", MultiFormRequestHelper.getContentType());
                        str3 = LOG_TAG;
                        BacktraceLogger.m6448d(str3, "HttpURLConnection successfully initialized");
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        MultiFormRequestHelper.addJson(dataOutputStream, str2);
                        MultiFormRequestHelper.addFiles(dataOutputStream, list);
                        MultiFormRequestHelper.addEndOfRequest(dataOutputStream);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        responseCode = httpURLConnection.getResponseCode();
                        BacktraceLogger.m6448d(str3, "Received response status from Backtrace API for HTTP request is: " + responseCode);
                    } catch (Exception e10) {
                        e = e10;
                        httpURLConnection2 = httpURLConnection;
                        if (onServerErrorEventListener != null) {
                            BacktraceLogger.m6448d(LOG_TAG, "Custom handler on server error");
                            onServerErrorEventListener.onEvent(e);
                        }
                        String str4 = LOG_TAG;
                        BacktraceLogger.m6450e(str4, "Sending HTTP request failed to Backtrace API", e);
                        OnError = BacktraceResult.OnError(backtraceReport, e);
                        if (httpURLConnection2 == null) {
                            return OnError;
                        }
                        httpURLConnection2.disconnect();
                        BacktraceLogger.m6448d(str4, "Disconnecting HttpUrlConnection successful");
                        return OnError;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection2 = httpURLConnection;
                        if (httpURLConnection2 != null) {
                            try {
                                httpURLConnection2.disconnect();
                                BacktraceLogger.m6448d(LOG_TAG, "Disconnecting HttpUrlConnection successful");
                            } catch (Exception e11) {
                                BacktraceLogger.m6450e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e11);
                                BacktraceResult.OnError(backtraceReport, e11);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (responseCode == 200) {
                OnError = BacktraceSerializeHelper.backtraceResultFromJson(getResponse(httpURLConnection));
                OnError.setBacktraceReport(backtraceReport);
                httpURLConnection.disconnect();
                BacktraceLogger.m6448d(str3, "Disconnecting HttpUrlConnection successful");
                return OnError;
            }
            String response = getResponse(httpURLConnection);
            if (BacktraceStringHelper.isNullOrEmpty(response)) {
                response = httpURLConnection.getResponseMessage();
            }
            throw new HttpException(Integer.valueOf(responseCode), String.format("%s: %s", Integer.valueOf(responseCode), response));
        } catch (Exception e13) {
            BacktraceLogger.m6450e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e13);
            return BacktraceResult.OnError(backtraceReport, e13);
        }
    }
}
