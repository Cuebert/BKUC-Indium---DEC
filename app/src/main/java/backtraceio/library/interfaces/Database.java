package backtraceio.library.interfaces;

import backtraceio.library.base.BacktraceBase;
import backtraceio.library.enums.UnwindingMode;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import backtraceio.library.models.database.BacktraceDatabaseSettings;
import backtraceio.library.models.json.BacktraceReport;
import java.util.Map;
import p159m1.C3930b;

/* loaded from: classes.dex */
public interface Database {
    BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map);

    BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map, boolean z10);

    void clear();

    void delete(BacktraceDatabaseRecord backtraceDatabaseRecord);

    void disableNativeIntegration();

    void flush();

    Iterable<BacktraceDatabaseRecord> get();

    Breadcrumbs getBreadcrumbs();

    long getDatabaseSize();

    BacktraceDatabaseSettings getSettings();

    void setApi(Api api);

    Boolean setupNativeIntegration(BacktraceBase backtraceBase, C3930b c3930b);

    Boolean setupNativeIntegration(BacktraceBase backtraceBase, C3930b c3930b, boolean z10);

    Boolean setupNativeIntegration(BacktraceBase backtraceBase, C3930b c3930b, boolean z10, UnwindingMode unwindingMode);

    void start();

    boolean validConsistency();
}
