package backtraceio.library.services;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.interfaces.Api;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceResult;

/* loaded from: classes.dex */
public class BacktraceHandlerThread extends HandlerThread {
    private static final transient String LOG_TAG = BacktraceHandlerThread.class.getSimpleName();
    private BacktraceHandler mHandler;
    private SummedEventsHandler mSummedEventsHandler;
    private UniqueEventsHandler mUniqueEventsHandler;
    private final String url;

    /* loaded from: classes.dex */
    private class BacktraceHandler extends Handler {
        private final transient String LOG_TAG;
        String url;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BacktraceResult sendReport;
            BacktraceHandlerInputReport backtraceHandlerInputReport = (BacktraceHandlerInputReport) message.obj;
            if (backtraceHandlerInputReport.requestHandler != null) {
                BacktraceLogger.m6448d(this.LOG_TAG, "Sending using custom request handler");
                sendReport = backtraceHandlerInputReport.requestHandler.onRequest(backtraceHandlerInputReport.data);
            } else {
                BacktraceLogger.m6448d(this.LOG_TAG, "Sending report using default request handler");
                sendReport = BacktraceReportSender.sendReport(this.url, BacktraceSerializeHelper.toJson(backtraceHandlerInputReport.data), backtraceHandlerInputReport.data.getAttachments(), backtraceHandlerInputReport.data.report, backtraceHandlerInputReport.serverErrorEventListener);
            }
            if (backtraceHandlerInputReport.serverResponseEventListener != null) {
                BacktraceLogger.m6448d(this.LOG_TAG, "Processing result using custom event");
                backtraceHandlerInputReport.serverResponseEventListener.onEvent(sendReport);
            }
        }

        private BacktraceHandler(Looper looper, String str) {
            super(looper);
            this.LOG_TAG = BacktraceHandler.class.getSimpleName();
            this.url = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BacktraceHandlerThread(String str, String str2) {
        super(str);
        this.url = str2;
        start();
    }

    Message createMessage(BacktraceHandlerInput backtraceHandlerInput) {
        Message message = new Message();
        message.obj = backtraceHandlerInput;
        return message;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SummedEventsHandler createSummedEventsHandler(BacktraceMetrics backtraceMetrics, Api api) {
        SummedEventsHandler summedEventsHandler = new SummedEventsHandler(backtraceMetrics, api, this);
        this.mSummedEventsHandler = summedEventsHandler;
        return summedEventsHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UniqueEventsHandler createUniqueEventsHandler(BacktraceMetrics backtraceMetrics, Api api) {
        UniqueEventsHandler uniqueEventsHandler = new UniqueEventsHandler(backtraceMetrics, api, this);
        this.mUniqueEventsHandler = uniqueEventsHandler;
        return uniqueEventsHandler;
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.mHandler = new BacktraceHandler(getLooper(), this.url);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendReport(BacktraceHandlerInputReport backtraceHandlerInputReport) {
        this.mHandler.sendMessage(createMessage(backtraceHandlerInputReport));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendSummedEvents(BacktraceHandlerInputEvents backtraceHandlerInputEvents) {
        this.mSummedEventsHandler.sendMessage(createMessage(backtraceHandlerInputEvents));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendUniqueEvents(BacktraceHandlerInputEvents backtraceHandlerInputEvents) {
        this.mUniqueEventsHandler.sendMessage(createMessage(backtraceHandlerInputEvents));
    }
}
