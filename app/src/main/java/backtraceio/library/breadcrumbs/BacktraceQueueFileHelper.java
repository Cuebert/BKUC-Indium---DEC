package backtraceio.library.breadcrumbs;

import backtraceio.library.logger.BacktraceLogger;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import p229ra.C4469a;

/* loaded from: classes.dex */
public class BacktraceQueueFileHelper {
    private final String breadcrumbLogDirectory;
    private final C4469a breadcrumbStore;
    private final int maxQueueFileSizeBytes;
    private final Method usedBytes;
    private final String LOG_TAG = BacktraceQueueFileHelper.class.getSimpleName();
    private final int minimumQueueFileSizeBytes = 4096;

    public BacktraceQueueFileHelper(String str, int i10) throws IOException, NoSuchMethodException {
        this.breadcrumbLogDirectory = str;
        this.breadcrumbStore = new C4469a(new File(str));
        Method declaredMethod = C4469a.class.getDeclaredMethod("v", new Class[0]);
        this.usedBytes = declaredMethod;
        declaredMethod.setAccessible(true);
        if (i10 < 4096) {
            this.maxQueueFileSizeBytes = 4096;
        } else {
            this.maxQueueFileSizeBytes = i10;
        }
    }

    public boolean add(byte[] bArr) {
        try {
            int intValue = ((Integer) this.usedBytes.invoke(this.breadcrumbStore, new Object[0])).intValue();
            int length = bArr.length;
            if (length > 4096) {
                BacktraceLogger.m6449e(this.LOG_TAG, "We should not have a breadcrumb this big, this is a bug!");
                return false;
            }
            while (!this.breadcrumbStore.m18334j() && intValue + length > this.maxQueueFileSizeBytes) {
                this.breadcrumbStore.m18335q();
            }
            this.breadcrumbStore.m18330d(bArr);
            return true;
        } catch (Exception e10) {
            BacktraceLogger.m6451w(this.LOG_TAG, "Exception: " + e10.getMessage() + "\nWhen adding breadcrumb: " + new String(bArr, StandardCharsets.UTF_8));
            return false;
        }
    }

    public boolean clear() {
        try {
            this.breadcrumbStore.m18332f();
            return true;
        } catch (Exception e10) {
            BacktraceLogger.m6451w(this.LOG_TAG, "Exception: " + e10.getMessage() + "\nWhen clearing breadcrumbs");
            return false;
        }
    }
}
