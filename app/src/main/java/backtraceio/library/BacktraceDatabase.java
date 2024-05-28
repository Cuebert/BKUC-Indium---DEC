package backtraceio.library;

import android.content.Context;
import backtraceio.library.base.BacktraceBase;
import backtraceio.library.breadcrumbs.BacktraceBreadcrumbs;
import backtraceio.library.common.FileHelper;
import backtraceio.library.enums.UnwindingMode;
import backtraceio.library.enums.database.RetryBehavior;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.interfaces.Api;
import backtraceio.library.interfaces.Breadcrumbs;
import backtraceio.library.interfaces.Database;
import backtraceio.library.interfaces.DatabaseContext;
import backtraceio.library.interfaces.DatabaseFileContext;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import backtraceio.library.models.database.BacktraceDatabaseSettings;
import backtraceio.library.models.json.BacktraceAttributes;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.services.BacktraceDatabaseContext;
import backtraceio.library.services.BacktraceDatabaseFileContext;
import java.io.File;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import p159m1.C3930b;

/* loaded from: classes.dex */
public class BacktraceDatabase implements Database {

    /* renamed from: k */
    private static boolean f5341k;

    /* renamed from: l */
    private static Timer f5342l;

    /* renamed from: a */
    private final String f5343a;

    /* renamed from: b */
    private final String f5344b;

    /* renamed from: c */
    private final transient String f5345c;

    /* renamed from: d */
    private Api f5346d;

    /* renamed from: e */
    private Context f5347e;

    /* renamed from: f */
    private DatabaseContext f5348f;

    /* renamed from: g */
    private DatabaseFileContext f5349g;

    /* renamed from: h */
    private BacktraceDatabaseSettings f5350h;

    /* renamed from: i */
    private boolean f5351i;

    /* renamed from: j */
    private Breadcrumbs f5352j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: backtraceio.library.BacktraceDatabase$a */
    /* loaded from: classes.dex */
    public class C1087a extends TimerTask {

        /* renamed from: backtraceio.library.BacktraceDatabase$a$a */
        /* loaded from: classes.dex */
        class a implements OnServerResponseEventListener {

            /* renamed from: a */
            final /* synthetic */ BacktraceDatabaseRecord f5354a;

            /* renamed from: b */
            final /* synthetic */ CountDownLatch f5355b;

            a(BacktraceDatabaseRecord backtraceDatabaseRecord, CountDownLatch countDownLatch) {
                this.f5354a = backtraceDatabaseRecord;
                this.f5355b = countDownLatch;
            }

            @Override // backtraceio.library.events.OnServerResponseEventListener
            public void onEvent(BacktraceResult backtraceResult) {
                if (backtraceResult.status == BacktraceResultStatus.Ok) {
                    BacktraceLogger.m6448d(BacktraceDatabase.this.f5345c, "Timer - deleting record");
                    BacktraceDatabase.this.delete(this.f5354a);
                } else {
                    BacktraceLogger.m6448d(BacktraceDatabase.this.f5345c, "Timer - closing record");
                    this.f5354a.close();
                }
                this.f5355b.countDown();
            }
        }

        C1087a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String date = Calendar.getInstance().getTime().toString();
            BacktraceLogger.m6448d(BacktraceDatabase.this.f5345c, "Timer - " + date);
            if (BacktraceDatabase.this.f5348f == null) {
                BacktraceLogger.m6451w(BacktraceDatabase.this.f5345c, "Timer - database context is null: " + date);
                return;
            }
            if (BacktraceDatabase.this.f5348f.isEmpty()) {
                BacktraceLogger.m6448d(BacktraceDatabase.this.f5345c, "Timer - database is empty (no records): " + date);
                return;
            }
            if (BacktraceDatabase.f5341k) {
                BacktraceLogger.m6448d(BacktraceDatabase.this.f5345c, "Timer - another timer works now: " + date);
                return;
            }
            BacktraceLogger.m6448d(BacktraceDatabase.this.f5345c, "Timer - continue working: " + date);
            boolean unused = BacktraceDatabase.f5341k = true;
            BacktraceDatabase.f5342l.cancel();
            BacktraceDatabase.f5342l.purge();
            Timer unused2 = BacktraceDatabase.f5342l = null;
            BacktraceDatabaseRecord first = BacktraceDatabase.this.f5348f.first();
            while (true) {
                if (first == null) {
                    break;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                BacktraceData backtraceData = first.getBacktraceData(BacktraceDatabase.this.f5347e);
                if (backtraceData != null && backtraceData.report != null) {
                    BacktraceDatabase.this.f5346d.send(backtraceData, new a(first, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e10) {
                        BacktraceLogger.m6450e(BacktraceDatabase.this.f5345c, "Error during waiting for result in Timer", e10);
                    }
                    if (first.valid() && !first.locked) {
                        BacktraceLogger.m6448d(BacktraceDatabase.this.f5345c, "Timer - record is valid and unlocked");
                        break;
                    }
                } else {
                    BacktraceLogger.m6448d(BacktraceDatabase.this.f5345c, "Timer - backtrace data or report is null - deleting record");
                    BacktraceDatabase.this.delete(first);
                }
                first = BacktraceDatabase.this.f5348f.first();
            }
            BacktraceLogger.m6448d(BacktraceDatabase.this.f5345c, "Setup new timer");
            boolean unused3 = BacktraceDatabase.f5341k = false;
            BacktraceDatabase.this.m6446m();
        }
    }

    public BacktraceDatabase() {
        this.f5343a = "/libcrashpad_handler.so";
        this.f5344b = "/crashpad";
        String simpleName = BacktraceDatabase.class.getSimpleName();
        this.f5345c = simpleName;
        this.f5351i = false;
        BacktraceLogger.m6451w(simpleName, "Disabled instance of BacktraceDatabase created, native crashes won't be captured");
    }

    private native void disable();

    private native boolean initialize(String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3, boolean z10, UnwindingMode unwindingMode);

    /* renamed from: j */
    private String m6443j() {
        return this.f5350h.getDatabasePath();
    }

    /* renamed from: k */
    private void m6444k() {
        Iterator<File> it = this.f5349g.getRecords().iterator();
        while (it.hasNext()) {
            BacktraceDatabaseRecord readFromFile = BacktraceDatabaseRecord.readFromFile(it.next());
            if (!readFromFile.valid()) {
                readFromFile.delete();
            } else {
                this.f5348f.add(readFromFile);
                m6447n();
                readFromFile.close();
            }
        }
    }

    /* renamed from: l */
    private void m6445l() {
        this.f5349g.removeOrphaned(this.f5348f.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m6446m() {
        Timer timer = new Timer();
        f5342l = timer;
        timer.scheduleAtFixedRate(new C1087a(), this.f5350h.getRetryInterval() * 1000, this.f5350h.getRetryInterval() * 1000);
    }

    /* renamed from: n */
    private boolean m6447n() {
        if (this.f5348f.count() + 1 > this.f5350h.getMaxRecordCount() && this.f5350h.getMaxRecordCount() != 0 && !this.f5348f.removeOldestRecord()) {
            BacktraceLogger.m6449e(this.f5345c, "Can't remove last record. Database size is invalid");
            return false;
        }
        if (this.f5350h.getMaxDatabaseSize() == 0 || this.f5348f.getDatabaseSize() <= this.f5350h.getMaxDatabaseSize()) {
            return true;
        }
        int i10 = 5;
        while (this.f5348f.getDatabaseSize() > this.f5350h.getMaxDatabaseSize()) {
            this.f5348f.removeOldestRecord();
            i10--;
            if (i10 == 0) {
                break;
            }
        }
        return i10 != 0;
    }

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map) {
        return add(backtraceReport, map, false);
    }

    @Override // backtraceio.library.interfaces.Database
    public void clear() {
        DatabaseContext databaseContext = this.f5348f;
        if (databaseContext != null) {
            databaseContext.clear();
        }
        DatabaseFileContext databaseFileContext = this.f5349g;
        if (databaseFileContext != null) {
            databaseFileContext.clear();
        }
    }

    @Override // backtraceio.library.interfaces.Database
    public void delete(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        DatabaseContext databaseContext = this.f5348f;
        if (databaseContext == null) {
            return;
        }
        databaseContext.delete(backtraceDatabaseRecord);
    }

    @Override // backtraceio.library.interfaces.Database
    public void disableNativeIntegration() {
        disable();
    }

    @Override // backtraceio.library.interfaces.Database
    public void flush() {
        if (this.f5346d != null) {
            BacktraceDatabaseRecord first = this.f5348f.first();
            while (first != null) {
                BacktraceData backtraceData = first.getBacktraceData(this.f5347e);
                delete(first);
                if (backtraceData != null) {
                    this.f5346d.send(backtraceData, null);
                }
                first = this.f5348f.first();
            }
            return;
        }
        throw new IllegalArgumentException("BacktraceApi is required if you want to use Flush method");
    }

    @Override // backtraceio.library.interfaces.Database
    public Iterable<BacktraceDatabaseRecord> get() {
        DatabaseContext databaseContext = this.f5348f;
        if (databaseContext == null) {
            return null;
        }
        return databaseContext.get();
    }

    @Override // backtraceio.library.interfaces.Database
    public Breadcrumbs getBreadcrumbs() {
        return this.f5352j;
    }

    @Override // backtraceio.library.interfaces.Database
    public long getDatabaseSize() {
        return this.f5348f.getDatabaseSize();
    }

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseSettings getSettings() {
        return this.f5350h;
    }

    @Override // backtraceio.library.interfaces.Database
    public void setApi(Api api) {
        this.f5346d = api;
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, C3930b c3930b) {
        return setupNativeIntegration(backtraceBase, c3930b, false);
    }

    @Override // backtraceio.library.interfaces.Database
    public void start() {
        if (this.f5350h == null) {
            return;
        }
        DatabaseContext databaseContext = this.f5348f;
        if (databaseContext != null && !databaseContext.isEmpty()) {
            this.f5351i = true;
            return;
        }
        m6444k();
        m6445l();
        if (this.f5350h.getRetryBehavior() == RetryBehavior.ByInterval || this.f5350h.isAutoSendMode()) {
            m6446m();
        }
        this.f5351i = true;
    }

    @Override // backtraceio.library.interfaces.Database
    public boolean validConsistency() {
        return this.f5349g.validFileConsistency();
    }

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map, boolean z10) {
        if (!this.f5351i || backtraceReport == null || !m6447n()) {
            return null;
        }
        return this.f5348f.add(backtraceReport.toBacktraceData(this.f5347e, map, z10));
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, C3930b c3930b, boolean z10) {
        return setupNativeIntegration(backtraceBase, c3930b, z10, UnwindingMode.REMOTE_DUMPWITHOUTCRASH);
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, C3930b c3930b, boolean z10, UnwindingMode unwindingMode) {
        if (getSettings() == null) {
            return Boolean.FALSE;
        }
        String uri = c3930b.m16673c().toString();
        if (uri == null) {
            return Boolean.FALSE;
        }
        String str = this.f5347e.getApplicationInfo().nativeLibraryDir + "/libcrashpad_handler.so";
        BacktraceAttributes backtraceAttributes = new BacktraceAttributes(this.f5347e, null, backtraceBase.attributes);
        String[] strArr = (String[]) backtraceAttributes.attributes.keySet().toArray(new String[0]);
        String[] strArr2 = (String[]) backtraceAttributes.attributes.values().toArray(new String[0]);
        int size = backtraceBase.attachments.size() + 1;
        String[] strArr3 = new String[size];
        if (backtraceBase.attachments != null) {
            for (int i10 = 0; i10 < backtraceBase.attachments.size(); i10++) {
                strArr3[i10] = backtraceBase.attachments.get(i10);
            }
        }
        strArr3[size - 1] = this.f5352j.getBreadcrumbLogPath();
        String str2 = getSettings().getDatabasePath() + "/crashpad";
        new File(str2).mkdir();
        return Boolean.valueOf(initialize(uri, str2, str, strArr, strArr2, strArr3, z10, unwindingMode));
    }

    public BacktraceDatabase(Context context, BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this.f5343a = "/libcrashpad_handler.so";
        this.f5344b = "/crashpad";
        this.f5345c = BacktraceDatabase.class.getSimpleName();
        this.f5351i = false;
        if (backtraceDatabaseSettings != null && context != null) {
            if (backtraceDatabaseSettings.getDatabasePath() != null && !backtraceDatabaseSettings.getDatabasePath().isEmpty()) {
                if (!FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()) && (!new File(backtraceDatabaseSettings.getDatabasePath()).mkdirs() || !FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()))) {
                    throw new IllegalArgumentException("Incorrect database path or application doesn't have permission to write to this path");
                }
                this.f5347e = context;
                this.f5350h = backtraceDatabaseSettings;
                this.f5348f = new BacktraceDatabaseContext(this.f5347e, backtraceDatabaseSettings);
                this.f5349g = new BacktraceDatabaseFileContext(m6443j(), this.f5350h.getMaxDatabaseSize(), this.f5350h.getMaxRecordCount());
                this.f5352j = new BacktraceBreadcrumbs(m6443j());
                return;
            }
            throw new IllegalArgumentException("Database path is null or empty");
        }
        throw new IllegalArgumentException("Database settings or application context is null");
    }
}
