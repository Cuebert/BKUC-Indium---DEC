package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.birbit.android.jobqueue.persistentQueue.sqlite.C1301b;

/* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.a */
/* loaded from: classes.dex */
public class C1300a extends SQLiteOpenHelper {

    /* renamed from: A */
    static final C1301b.c f5856A;

    /* renamed from: n */
    static final C1301b.c f5857n = new C1301b.c("insertionOrder", "integer", 0);

    /* renamed from: o */
    static final C1301b.c f5858o;

    /* renamed from: p */
    static final C1301b.c f5859p;

    /* renamed from: q */
    static final C1301b.c f5860q;

    /* renamed from: r */
    static final C1301b.c f5861r;

    /* renamed from: s */
    static final C1301b.c f5862s;

    /* renamed from: t */
    static final C1301b.c f5863t;

    /* renamed from: u */
    static final C1301b.c f5864u;

    /* renamed from: v */
    static final C1301b.c f5865v;

    /* renamed from: w */
    static final C1301b.c f5866w;

    /* renamed from: x */
    static final C1301b.c f5867x;

    /* renamed from: y */
    static final C1301b.c f5868y;

    /* renamed from: z */
    static final C1301b.c f5869z;

    static {
        C1301b.c cVar = new C1301b.c("_id", "text", 1, null, true);
        f5858o = cVar;
        f5859p = new C1301b.c("priority", "integer", 2);
        f5860q = new C1301b.c("group_id", "text", 3);
        f5861r = new C1301b.c("run_count", "integer", 4);
        f5862s = new C1301b.c("base_job", "byte", 5);
        f5863t = new C1301b.c("created_ns", "long", 6);
        f5864u = new C1301b.c("delay_until_ns", "long", 7);
        f5865v = new C1301b.c("running_session_id", "long", 8);
        f5866w = new C1301b.c("requires_network_until", "integer", 9);
        f5867x = new C1301b.c("requires_unmetered_network_until", "integer", 10);
        f5868y = new C1301b.c("_id", "integer", 0);
        f5869z = new C1301b.c("job_id", "text", 1, new C1301b.a("job_holder", cVar.f5893a));
        f5856A = new C1301b.c("tag_name", "text", 2);
    }

    public C1300a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 8);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C1301b.m7157b("job_holder", f5857n, f5858o, f5859p, f5860q, f5861r, f5862s, f5863t, f5864u, f5865v, f5866w, f5867x));
        C1301b.c cVar = f5868y;
        C1301b.c cVar2 = f5856A;
        sQLiteDatabase.execSQL(C1301b.m7157b("job_holder_tags", cVar, f5869z, cVar2));
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS TAG_NAME_INDEX ON job_holder_tags(" + cVar2.f5893a + ")");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(C1301b.m7158e("job_holder"));
        sQLiteDatabase.execSQL(C1301b.m7158e("job_holder_tags"));
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS TAG_NAME_INDEX");
        onCreate(sQLiteDatabase);
    }
}
