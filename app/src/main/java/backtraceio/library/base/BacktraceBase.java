package backtraceio.library.base;

import android.content.Context;
import backtraceio.library.BacktraceDatabase;
import backtraceio.library.enums.BacktraceBreadcrumbLevel;
import backtraceio.library.enums.BacktraceBreadcrumbType;
import backtraceio.library.enums.UnwindingMode;
import backtraceio.library.events.OnBeforeSendEventListener;
import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.events.RequestHandler;
import backtraceio.library.interfaces.Api;
import backtraceio.library.interfaces.Breadcrumbs;
import backtraceio.library.interfaces.Client;
import backtraceio.library.interfaces.Database;
import backtraceio.library.interfaces.Metrics;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import backtraceio.library.models.database.BacktraceDatabaseSettings;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.services.BacktraceApi;
import backtraceio.library.services.BacktraceMetrics;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p159m1.C3930b;

/* loaded from: classes.dex */
public class BacktraceBase implements Client {
    private static final transient String LOG_TAG = "BacktraceBase";
    public final List<String> attachments;
    public final Map<String, Object> attributes;
    private Api backtraceApi;
    private OnBeforeSendEventListener beforeSendEventListener;
    protected Context context;
    private final C3930b credentials;
    public final Database database;
    private boolean isProguardEnabled;
    public Metrics metrics;

    /* renamed from: backtraceio.library.base.BacktraceBase$1 */
    /* loaded from: classes.dex */
    public class C10881 implements OnServerResponseEventListener {
        final /* synthetic */ OnServerResponseEventListener val$customCallback;
        final /* synthetic */ BacktraceDatabaseRecord val$record;

        C10881(OnServerResponseEventListener onServerResponseEventListener, BacktraceDatabaseRecord backtraceDatabaseRecord) {
            r2 = onServerResponseEventListener;
            r3 = backtraceDatabaseRecord;
        }

        @Override // backtraceio.library.events.OnServerResponseEventListener
        public void onEvent(BacktraceResult backtraceResult) {
            OnServerResponseEventListener onServerResponseEventListener = r2;
            if (onServerResponseEventListener != null) {
                onServerResponseEventListener.onEvent(backtraceResult);
            }
            BacktraceDatabaseRecord backtraceDatabaseRecord = r3;
            if (backtraceDatabaseRecord != null) {
                backtraceDatabaseRecord.close();
            }
            if (backtraceResult == null || backtraceResult.status != BacktraceResultStatus.Ok) {
                return;
            }
            BacktraceBase.this.database.delete(r3);
        }
    }

    static {
        System.loadLibrary("backtrace-native");
    }

    public BacktraceBase(Context context, C3930b c3930b) {
        this(context, c3930b, (Database) null);
    }

    private void addReportAttachments(BacktraceReport backtraceReport) {
        List<String> list = this.attachments;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                backtraceReport.attachmentPaths.add(it.next());
            }
        }
    }

    private OnServerResponseEventListener getDatabaseCallback(BacktraceDatabaseRecord backtraceDatabaseRecord, OnServerResponseEventListener onServerResponseEventListener) {
        return new OnServerResponseEventListener() { // from class: backtraceio.library.base.BacktraceBase.1
            final /* synthetic */ OnServerResponseEventListener val$customCallback;
            final /* synthetic */ BacktraceDatabaseRecord val$record;

            C10881(OnServerResponseEventListener onServerResponseEventListener2, BacktraceDatabaseRecord backtraceDatabaseRecord2) {
                r2 = onServerResponseEventListener2;
                r3 = backtraceDatabaseRecord2;
            }

            @Override // backtraceio.library.events.OnServerResponseEventListener
            public void onEvent(BacktraceResult backtraceResult) {
                OnServerResponseEventListener onServerResponseEventListener2 = r2;
                if (onServerResponseEventListener2 != null) {
                    onServerResponseEventListener2.onEvent(backtraceResult);
                }
                BacktraceDatabaseRecord backtraceDatabaseRecord2 = r3;
                if (backtraceDatabaseRecord2 != null) {
                    backtraceDatabaseRecord2.close();
                }
                if (backtraceResult == null || backtraceResult.status != BacktraceResultStatus.Ok) {
                    return;
                }
                BacktraceBase.this.database.delete(r3);
            }
        };
    }

    private void setBacktraceApi(Api api) {
        this.backtraceApi = api;
        Database database = this.database;
        if (database != null) {
            database.setApi(api);
        }
    }

    public boolean addBreadcrumb(String str) {
        return this.database.getBreadcrumbs().addBreadcrumb(str);
    }

    public boolean clearBreadcrumbs() {
        return this.database.getBreadcrumbs().clearBreadcrumbs();
    }

    public native void crash();

    public void disableNativeIntegration() {
        this.database.disableNativeIntegration();
    }

    public native void dumpWithoutCrash(String str);

    public native void dumpWithoutCrash(String str, boolean z10);

    public boolean enableBreadcrumbs(Context context) {
        return this.database.getBreadcrumbs().enableBreadcrumbs(context);
    }

    @Override // backtraceio.library.interfaces.Client
    public void enableNativeIntegration() {
        this.database.setupNativeIntegration(this, this.credentials);
    }

    public void enableProguard() {
        this.isProguardEnabled = true;
    }

    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public void nativeCrash() {
        crash();
    }

    @Override // backtraceio.library.interfaces.Client
    public void send(BacktraceReport backtraceReport) {
        send(backtraceReport, null);
    }

    public void setOnBeforeSendEventListener(OnBeforeSendEventListener onBeforeSendEventListener) {
        this.beforeSendEventListener = onBeforeSendEventListener;
    }

    public void setOnRequestHandler(RequestHandler requestHandler) {
        this.backtraceApi.setRequestHandler(requestHandler);
    }

    public void setOnServerErrorEventListener(OnServerErrorEventListener onServerErrorEventListener) {
        this.backtraceApi.setOnServerError(onServerErrorEventListener);
    }

    public BacktraceBase(Context context, C3930b c3930b, List<String> list) {
        this(context, c3930b, (Database) null, list);
    }

    public boolean addBreadcrumb(String str, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        return this.database.getBreadcrumbs().addBreadcrumb(str, backtraceBreadcrumbLevel);
    }

    public boolean enableBreadcrumbs(Context context, int i10) {
        return this.database.getBreadcrumbs().enableBreadcrumbs(context, i10);
    }

    public void enableNativeIntegration(boolean z10) {
        this.database.setupNativeIntegration(this, this.credentials, z10);
    }

    public void send(BacktraceReport backtraceReport, OnServerResponseEventListener onServerResponseEventListener) {
        Breadcrumbs breadcrumbs = this.database.getBreadcrumbs();
        if (breadcrumbs != null) {
            breadcrumbs.processReportBreadcrumbs(backtraceReport);
        }
        addReportAttachments(backtraceReport);
        BacktraceData backtraceData = new BacktraceData(this.context, backtraceReport, this.attributes);
        boolean z10 = this.isProguardEnabled;
        backtraceData.symbolication = z10 ? "proguard" : null;
        BacktraceDatabaseRecord add = this.database.add(backtraceReport, this.attributes, z10);
        OnBeforeSendEventListener onBeforeSendEventListener = this.beforeSendEventListener;
        if (onBeforeSendEventListener != null) {
            backtraceData = onBeforeSendEventListener.onEvent(backtraceData);
        }
        this.backtraceApi.send(backtraceData, getDatabaseCallback(add, onServerResponseEventListener));
    }

    public BacktraceBase(Context context, C3930b c3930b, Map<String, Object> map) {
        this(context, c3930b, (Database) null, map);
    }

    public boolean addBreadcrumb(String str, Map<String, Object> map) {
        return this.database.getBreadcrumbs().addBreadcrumb(str, map);
    }

    public boolean enableBreadcrumbs(Context context, EnumSet<BacktraceBreadcrumbType> enumSet) {
        return this.database.getBreadcrumbs().enableBreadcrumbs(context, enumSet);
    }

    public void enableNativeIntegration(boolean z10, UnwindingMode unwindingMode) {
        this.database.setupNativeIntegration(this, this.credentials, z10, unwindingMode);
    }

    public BacktraceBase(Context context, C3930b c3930b, Map<String, Object> map, List<String> list) {
        this(context, c3930b, (Database) null, map, list);
    }

    public boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        return this.database.getBreadcrumbs().addBreadcrumb(str, map, backtraceBreadcrumbLevel);
    }

    public boolean enableBreadcrumbs(Context context, EnumSet<BacktraceBreadcrumbType> enumSet, int i10) {
        return this.database.getBreadcrumbs().enableBreadcrumbs(context, enumSet, i10);
    }

    public BacktraceBase(Context context, C3930b c3930b, BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this(context, c3930b, new BacktraceDatabase(context, backtraceDatabaseSettings));
    }

    public boolean addBreadcrumb(String str, BacktraceBreadcrumbType backtraceBreadcrumbType) {
        return this.database.getBreadcrumbs().addBreadcrumb(str, backtraceBreadcrumbType);
    }

    public BacktraceBase(Context context, C3930b c3930b, BacktraceDatabaseSettings backtraceDatabaseSettings, List<String> list) {
        this(context, c3930b, new BacktraceDatabase(context, backtraceDatabaseSettings), list);
    }

    public boolean addBreadcrumb(String str, BacktraceBreadcrumbType backtraceBreadcrumbType, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        return this.database.getBreadcrumbs().addBreadcrumb(str, backtraceBreadcrumbType, backtraceBreadcrumbLevel);
    }

    public BacktraceBase(Context context, C3930b c3930b, BacktraceDatabaseSettings backtraceDatabaseSettings, Map<String, Object> map) {
        this(context, c3930b, new BacktraceDatabase(context, backtraceDatabaseSettings), map);
    }

    public boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbType backtraceBreadcrumbType) {
        return this.database.getBreadcrumbs().addBreadcrumb(str, map, backtraceBreadcrumbType);
    }

    public BacktraceBase(Context context, C3930b c3930b, BacktraceDatabaseSettings backtraceDatabaseSettings, Map<String, Object> map, List<String> list) {
        this(context, c3930b, new BacktraceDatabase(context, backtraceDatabaseSettings), map, list);
    }

    public boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbType backtraceBreadcrumbType, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        return this.database.getBreadcrumbs().addBreadcrumb(str, map, backtraceBreadcrumbType, backtraceBreadcrumbLevel);
    }

    public BacktraceBase(Context context, C3930b c3930b, Database database) {
        this(context, c3930b, database, (Map<String, Object>) null);
    }

    public BacktraceBase(Context context, C3930b c3930b, Database database, List<String> list) {
        this(context, c3930b, database, (Map<String, Object>) null, list);
    }

    public BacktraceBase(Context context, C3930b c3930b, Database database, Map<String, Object> map) {
        this(context, c3930b, database, map, (List<String>) null);
    }

    public BacktraceBase(Context context, C3930b c3930b, Database database, Map<String, Object> map, List<String> list) {
        this.metrics = null;
        this.beforeSendEventListener = null;
        this.isProguardEnabled = false;
        this.context = context;
        this.credentials = c3930b;
        this.attributes = map != null ? map : new HashMap<>();
        this.attachments = list == null ? new ArrayList<>() : list;
        database = database == null ? new BacktraceDatabase() : database;
        this.database = database;
        setBacktraceApi(new BacktraceApi(c3930b));
        database.start();
        this.metrics = new BacktraceMetrics(context, map, this.backtraceApi);
    }
}
