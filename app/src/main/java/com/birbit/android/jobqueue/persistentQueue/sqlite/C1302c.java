package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.birbit.android.jobqueue.persistentQueue.sqlite.C1301b;

/* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.c */
/* loaded from: classes.dex */
public class C1302c {

    /* renamed from: a */
    public final long f5898a;

    /* renamed from: b */
    public final String f5899b;

    /* renamed from: c */
    public final String[] f5900c;

    /* renamed from: d */
    private SQLiteStatement f5901d;

    /* renamed from: e */
    private String f5902e;

    /* renamed from: f */
    private SQLiteStatement f5903f;

    /* renamed from: g */
    private SQLiteStatement f5904g;

    /* renamed from: h */
    private String f5905h;

    /* renamed from: i */
    private int f5906i = -1;

    /* renamed from: j */
    private int f5907j = -1;

    public C1302c(long j10, String str, String[] strArr) {
        this.f5898a = j10;
        this.f5899b = str;
        this.f5900c = strArr;
    }

    /* renamed from: a */
    public SQLiteStatement m7170a(SQLiteDatabase sQLiteDatabase, StringBuilder sb2) {
        SQLiteStatement sQLiteStatement = this.f5901d;
        if (sQLiteStatement == null) {
            sb2.setLength(0);
            sb2.append("SELECT SUM(case WHEN ");
            C1301b.c cVar = C1300a.f5860q;
            sb2.append(cVar.f5893a);
            sb2.append(" is null then group_cnt else 1 end) from (");
            sb2.append("SELECT count(*) group_cnt, ");
            sb2.append(cVar.f5893a);
            sb2.append(" FROM ");
            sb2.append("job_holder");
            sb2.append(" WHERE ");
            sb2.append(this.f5899b);
            sb2.append(" GROUP BY ");
            sb2.append(cVar.f5893a);
            sb2.append(")");
            this.f5901d = sQLiteDatabase.compileStatement(sb2.toString());
        } else {
            sQLiteStatement.clearBindings();
        }
        int i10 = 1;
        while (true) {
            String[] strArr = this.f5900c;
            if (i10 <= strArr.length) {
                this.f5901d.bindString(i10, strArr[i10 - 1]);
                i10++;
            } else {
                return this.f5901d;
            }
        }
    }

    /* renamed from: b */
    public void m7171b() {
        SQLiteStatement sQLiteStatement = this.f5901d;
        if (sQLiteStatement != null) {
            sQLiteStatement.close();
            this.f5901d = null;
        }
        SQLiteStatement sQLiteStatement2 = this.f5903f;
        if (sQLiteStatement2 != null) {
            sQLiteStatement2.close();
            this.f5903f = null;
        }
        SQLiteStatement sQLiteStatement3 = this.f5904g;
        if (sQLiteStatement3 != null) {
            sQLiteStatement3.close();
            this.f5904g = null;
        }
    }

    /* renamed from: c */
    public String m7172c(C1301b c1301b) {
        if (this.f5902e == null) {
            this.f5902e = c1301b.m7159c(this.f5899b, null, new C1301b.b[0]);
        }
        return this.f5902e;
    }

    /* renamed from: d */
    public String m7173d(C1301b c1301b) {
        if (this.f5905h == null) {
            String str = this.f5899b;
            C1301b.c cVar = C1300a.f5863t;
            C1301b.b.a aVar = C1301b.b.a.ASC;
            this.f5905h = c1301b.m7159c(str, 1, new C1301b.b(C1300a.f5859p, C1301b.b.a.DESC), new C1301b.b(cVar, aVar), new C1301b.b(C1300a.f5857n, aVar));
        }
        return this.f5905h;
    }

    /* renamed from: e */
    public SQLiteStatement m7174e(SQLiteDatabase sQLiteDatabase, C1301b c1301b) {
        SQLiteStatement sQLiteStatement = this.f5903f;
        int i10 = 1;
        if (sQLiteStatement == null) {
            C1301b.c cVar = C1300a.f5864u;
            this.f5903f = sQLiteDatabase.compileStatement(c1301b.m7160d(cVar, this.f5899b, 1, new C1301b.b(cVar, C1301b.b.a.ASC)));
        } else {
            sQLiteStatement.clearBindings();
        }
        while (true) {
            String[] strArr = this.f5900c;
            if (i10 <= strArr.length) {
                this.f5903f.bindString(i10, strArr[i10 - 1]);
                i10++;
            } else {
                return this.f5903f;
            }
        }
    }

    /* renamed from: f */
    public SQLiteStatement m7175f(SQLiteDatabase sQLiteDatabase, C1301b c1301b) {
        SQLiteStatement sQLiteStatement = this.f5904g;
        if (sQLiteStatement == null) {
            StringBuilder sb2 = c1301b.f5878i;
            sb2.setLength(0);
            sb2.append("SELECT max(");
            sb2.append(C1300a.f5864u.f5893a);
            if (this.f5906i != -1) {
                sb2.append(",");
                sb2.append(C1300a.f5866w.f5893a);
            }
            if (this.f5907j != -1) {
                sb2.append(",");
                sb2.append(C1300a.f5867x.f5893a);
            }
            sb2.append(") FROM ");
            sb2.append("job_holder");
            sb2.append(" WHERE ");
            sb2.append(this.f5899b);
            if (this.f5906i != -1) {
                sb2.append(" AND ");
                sb2.append(C1300a.f5866w.f5893a);
                sb2.append(" != ");
                sb2.append(Long.MAX_VALUE);
            }
            if (this.f5907j != -1) {
                sb2.append(" AND ");
                sb2.append(C1300a.f5867x.f5893a);
                sb2.append(" != ");
                sb2.append(Long.MAX_VALUE);
            }
            sb2.append(" ORDER BY 1 ASC");
            sb2.append(" limit 1");
            this.f5904g = sQLiteDatabase.compileStatement(sb2.toString());
        } else {
            sQLiteStatement.clearBindings();
        }
        int i10 = 1;
        while (true) {
            String[] strArr = this.f5900c;
            if (i10 > strArr.length) {
                break;
            }
            this.f5904g.bindString(i10, strArr[i10 - 1]);
            i10++;
        }
        int i11 = this.f5906i;
        if (i11 != -1) {
            this.f5904g.bindString(i11 + 1, Long.toString(Long.MAX_VALUE));
        }
        int i12 = this.f5907j;
        if (i12 != -1) {
            this.f5904g.bindString(i12 + 1, Long.toString(Long.MAX_VALUE));
        }
        return this.f5904g;
    }

    /* renamed from: g */
    public void m7176g(int i10) {
        this.f5906i = i10;
    }

    /* renamed from: h */
    public void m7177h(int i10) {
        this.f5907j = i10;
    }
}
