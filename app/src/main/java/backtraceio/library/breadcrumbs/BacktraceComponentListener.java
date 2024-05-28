package backtraceio.library.breadcrumbs;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import backtraceio.library.enums.BacktraceBreadcrumbLevel;
import backtraceio.library.enums.BacktraceBreadcrumbType;
import java.util.HashMap;

/* loaded from: classes.dex */
public class BacktraceComponentListener implements ComponentCallbacks2 {
    private final BacktraceBreadcrumbs backtraceBreadcrumbs;

    public BacktraceComponentListener(BacktraceBreadcrumbs backtraceBreadcrumbs) {
        this.backtraceBreadcrumbs = backtraceBreadcrumbs;
    }

    private BacktraceBreadcrumbLevel getMemoryWarningLevel(int i10) {
        if (i10 != 5 && i10 != 10) {
            if (i10 != 15) {
                if (i10 != 40) {
                    if (i10 != 60 && i10 != 80) {
                        return BacktraceBreadcrumbLevel.WARNING;
                    }
                }
            }
            return BacktraceBreadcrumbLevel.FATAL;
        }
        return BacktraceBreadcrumbLevel.ERROR;
    }

    private String getMemoryWarningString(int i10) {
        return i10 != 5 ? i10 != 10 ? i10 != 15 ? i10 != 20 ? i10 != 40 ? i10 != 60 ? i10 != 80 ? "Generic memory warning" : "TRIM MEMORY COMPLETE" : "TRIM MEMORY MODERATE" : "TRIM MEMORY BACKGROUND" : "TRIM MEMORY UI HIDDEN" : "TRIM MEMORY RUNNING CRITICAL" : "TRIM MEMORY RUNNING LOW" : "TRIM MEMORY RUNNING MODERATE";
    }

    private String stringifyOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "unknown orientation" : "landscape" : "portrait";
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        HashMap hashMap = new HashMap();
        hashMap.put("orientation", stringifyOrientation(configuration.orientation));
        this.backtraceBreadcrumbs.addBreadcrumb("Configuration changed", hashMap, BacktraceBreadcrumbType.SYSTEM, BacktraceBreadcrumbLevel.INFO);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.backtraceBreadcrumbs.addBreadcrumb("Critical low memory warning!", BacktraceBreadcrumbType.SYSTEM, BacktraceBreadcrumbLevel.FATAL);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        this.backtraceBreadcrumbs.addBreadcrumb(getMemoryWarningString(i10), BacktraceBreadcrumbType.SYSTEM, getMemoryWarningLevel(i10));
    }
}
