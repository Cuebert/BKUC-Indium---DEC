package p109i2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i2.t0 */
/* loaded from: classes.dex */
public final class C3508t0 extends SQLiteOpenHelper {

    /* renamed from: p */
    private static final String f14484p = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: q */
    static int f14485q = 5;

    /* renamed from: r */
    private static final a f14486r;

    /* renamed from: s */
    private static final a f14487s;

    /* renamed from: t */
    private static final a f14488t;

    /* renamed from: u */
    private static final a f14489u;

    /* renamed from: v */
    private static final a f14490v;

    /* renamed from: w */
    private static final List<a> f14491w;

    /* renamed from: n */
    private final int f14492n;

    /* renamed from: o */
    private boolean f14493o;

    /* renamed from: i2.t0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo15310a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C3504r0 c3504r0 = new a() { // from class: i2.r0
            @Override // p109i2.C3508t0.a
            /* renamed from: a */
            public final void mo15310a(SQLiteDatabase sQLiteDatabase) {
                C3508t0.m15311O(sQLiteDatabase);
            }
        };
        f14486r = c3504r0;
        C3498o0 c3498o0 = new a() { // from class: i2.o0
            @Override // p109i2.C3508t0.a
            /* renamed from: a */
            public final void mo15310a(SQLiteDatabase sQLiteDatabase) {
                C3508t0.m15312Q(sQLiteDatabase);
            }
        };
        f14487s = c3498o0;
        C3500p0 c3500p0 = new a() { // from class: i2.p0
            @Override // p109i2.C3508t0.a
            /* renamed from: a */
            public final void mo15310a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f14488t = c3500p0;
        C3502q0 c3502q0 = new a() { // from class: i2.q0
            @Override // p109i2.C3508t0.a
            /* renamed from: a */
            public final void mo15310a(SQLiteDatabase sQLiteDatabase) {
                C3508t0.m15314W(sQLiteDatabase);
            }
        };
        f14489u = c3502q0;
        C3506s0 c3506s0 = new a() { // from class: i2.s0
            @Override // p109i2.C3508t0.a
            /* renamed from: a */
            public final void mo15310a(SQLiteDatabase sQLiteDatabase) {
                C3508t0.m15315X(sQLiteDatabase);
            }
        };
        f14490v = c3506s0;
        f14491w = Arrays.asList(c3504r0, c3498o0, c3500p0, c3502q0, c3506s0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3508t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f14493o = false;
        this.f14492n = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static /* synthetic */ void m15311O(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static /* synthetic */ void m15312Q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static /* synthetic */ void m15314W(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static /* synthetic */ void m15315X(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f14484p);
    }

    /* renamed from: Y */
    private void m15316Y(SQLiteDatabase sQLiteDatabase, int i10) {
        m15323z(sQLiteDatabase);
        m15320e0(sQLiteDatabase, 0, i10);
    }

    /* renamed from: e0 */
    private void m15320e0(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f14491w;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f14491w.get(i10).mo15310a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* renamed from: z */
    private void m15323z(SQLiteDatabase sQLiteDatabase) {
        if (this.f14493o) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f14493o = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m15316Y(sQLiteDatabase, this.f14492n);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m15316Y(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m15323z(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m15323z(sQLiteDatabase);
        m15320e0(sQLiteDatabase, i10, i11);
    }
}
