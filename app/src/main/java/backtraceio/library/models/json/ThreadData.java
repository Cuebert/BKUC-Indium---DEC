package backtraceio.library.models.json;

import backtraceio.library.models.BacktraceStackFrame;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ThreadData {
    public HashMap<String, ThreadInformation> threadInformation = new HashMap<>();
    private String mainThread = BuildConfig.FLAVOR;

    public ThreadData(ArrayList<BacktraceStackFrame> arrayList) {
        generateCurrentThreadInformation(arrayList);
        processThreads();
    }

    private void generateCurrentThreadInformation(ArrayList<BacktraceStackFrame> arrayList) {
        Thread currentThread = Thread.currentThread();
        String lowerCase = currentThread.getName().toLowerCase();
        this.mainThread = lowerCase;
        this.threadInformation.put(lowerCase, new ThreadInformation(currentThread, arrayList, Boolean.TRUE));
    }

    private void processThreads() {
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() != null) {
                Thread key = entry.getKey();
                StackTraceElement[] value = entry.getValue();
                String lowerCase = key.getName().toLowerCase();
                ArrayList arrayList = new ArrayList();
                if (!getMainThread().equals(lowerCase)) {
                    if (value != null && value.length != 0) {
                        for (StackTraceElement stackTraceElement : value) {
                            arrayList.add(new BacktraceStackFrame(stackTraceElement));
                        }
                    }
                    this.threadInformation.put(lowerCase, new ThreadInformation(key, (ArrayList<BacktraceStackFrame>) arrayList, Boolean.FALSE));
                }
            }
        }
    }

    public String getMainThread() {
        return this.mainThread;
    }
}
