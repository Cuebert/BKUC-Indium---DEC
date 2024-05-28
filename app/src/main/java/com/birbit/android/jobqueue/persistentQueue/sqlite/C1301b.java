package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import p233s1.C4516a;

/* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.b */
/* loaded from: classes.dex */
public class C1301b {

    /* renamed from: a */
    String f5870a;

    /* renamed from: b */
    String f5871b;

    /* renamed from: c */
    private SQLiteStatement f5872c;

    /* renamed from: d */
    private SQLiteStatement f5873d;

    /* renamed from: e */
    private SQLiteStatement f5874e;

    /* renamed from: f */
    private SQLiteStatement f5875f;

    /* renamed from: g */
    private SQLiteStatement f5876g;

    /* renamed from: h */
    private SQLiteStatement f5877h;

    /* renamed from: i */
    final StringBuilder f5878i = new StringBuilder();

    /* renamed from: j */
    final SQLiteDatabase f5879j;

    /* renamed from: k */
    final String f5880k;

    /* renamed from: l */
    final String f5881l;

    /* renamed from: m */
    final int f5882m;

    /* renamed from: n */
    final String f5883n;

    /* renamed from: o */
    final int f5884o;

    /* renamed from: p */
    final long f5885p;

    /* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final String f5886a;

        /* renamed from: b */
        final String f5887b;

        public a(String str, String str2) {
            this.f5886a = str;
            this.f5887b = str2;
        }
    }

    /* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.b$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final c f5888a;

        /* renamed from: b */
        final a f5889b;

        /* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.b$b$a */
        /* loaded from: classes.dex */
        public enum a {
            ASC,
            DESC
        }

        public b(c cVar, a aVar) {
            this.f5888a = cVar;
            this.f5889b = aVar;
        }
    }

    /* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final String f5893a;

        /* renamed from: b */
        final String f5894b;

        /* renamed from: c */
        public final int f5895c;

        /* renamed from: d */
        public final a f5896d;

        /* renamed from: e */
        public final boolean f5897e;

        public c(String str, String str2, int i10) {
            this(str, str2, i10, null, false);
        }

        public c(String str, String str2, int i10, a aVar) {
            this(str, str2, i10, aVar, false);
        }

        public c(String str, String str2, int i10, a aVar, boolean z10) {
            this.f5893a = str;
            this.f5894b = str2;
            this.f5895c = i10;
            this.f5896d = aVar;
            this.f5897e = z10;
        }
    }

    public C1301b(SQLiteDatabase sQLiteDatabase, String str, String str2, int i10, String str3, int i11, long j10) {
        this.f5879j = sQLiteDatabase;
        this.f5880k = str;
        this.f5882m = i10;
        this.f5881l = str2;
        this.f5885p = j10;
        this.f5884o = i11;
        this.f5883n = str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM ");
        sb2.append(str);
        sb2.append(" WHERE ");
        c cVar = C1300a.f5858o;
        sb2.append(cVar.f5893a);
        sb2.append(" = ?");
        this.f5870a = sb2.toString();
        this.f5871b = "SELECT * FROM " + str + " WHERE " + cVar.f5893a + " IN ( SELECT " + C1300a.f5869z.f5893a + " FROM " + str3 + " WHERE " + C1300a.f5856A.f5893a + " = ?)";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7156a(StringBuilder sb2, int i10) {
        if (i10 != 0) {
            sb2.append("?");
            for (int i11 = 1; i11 < i10; i11++) {
                sb2.append(",?");
            }
            return;
        }
        throw new IllegalArgumentException("cannot create placeholders for 0 items");
    }

    /* renamed from: b */
    public static String m7157b(String str, c cVar, c... cVarArr) {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(str);
        sb2.append(" (");
        sb2.append(cVar.f5893a);
        sb2.append(" ");
        sb2.append(cVar.f5894b);
        sb2.append("  primary key ");
        for (c cVar2 : cVarArr) {
            sb2.append(", `");
            sb2.append(cVar2.f5893a);
            sb2.append("` ");
            sb2.append(cVar2.f5894b);
            if (cVar2.f5897e) {
                sb2.append(" UNIQUE");
            }
        }
        for (c cVar3 : cVarArr) {
            a aVar = cVar3.f5896d;
            if (aVar != null) {
                sb2.append(", FOREIGN KEY(`");
                sb2.append(cVar3.f5893a);
                sb2.append("`) REFERENCES ");
                sb2.append(aVar.f5886a);
                sb2.append("(`");
                sb2.append(aVar.f5887b);
                sb2.append("`) ON DELETE CASCADE");
            }
        }
        sb2.append(" );");
        C4516a.m18533b(sb2.toString(), new Object[0]);
        return sb2.toString();
    }

    /* renamed from: e */
    public static String m7158e(String str) {
        return "DROP TABLE IF EXISTS " + str;
    }

    /* renamed from: c */
    public String m7159c(String str, Integer num, b... bVarArr) {
        this.f5878i.setLength(0);
        this.f5878i.append("SELECT * FROM ");
        this.f5878i.append(this.f5880k);
        if (str != null) {
            StringBuilder sb2 = this.f5878i;
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        int length = bVarArr.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            b bVar = bVarArr[i10];
            if (z10) {
                this.f5878i.append(" ORDER BY ");
            } else {
                this.f5878i.append(",");
            }
            StringBuilder sb3 = this.f5878i;
            sb3.append(bVar.f5888a.f5893a);
            sb3.append(" ");
            sb3.append(bVar.f5889b);
            i10++;
            z10 = false;
        }
        if (num != null) {
            StringBuilder sb4 = this.f5878i;
            sb4.append(" LIMIT ");
            sb4.append(num);
        }
        return this.f5878i.toString();
    }

    /* renamed from: d */
    public String m7160d(c cVar, String str, Integer num, b... bVarArr) {
        this.f5878i.setLength(0);
        StringBuilder sb2 = this.f5878i;
        sb2.append("SELECT ");
        sb2.append(cVar.f5893a);
        sb2.append(" FROM ");
        sb2.append(this.f5880k);
        if (str != null) {
            StringBuilder sb3 = this.f5878i;
            sb3.append(" WHERE ");
            sb3.append(str);
        }
        int length = bVarArr.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            b bVar = bVarArr[i10];
            if (z10) {
                this.f5878i.append(" ORDER BY ");
            } else {
                this.f5878i.append(",");
            }
            StringBuilder sb4 = this.f5878i;
            sb4.append(bVar.f5888a.f5893a);
            sb4.append(" ");
            sb4.append(bVar.f5889b);
            i10++;
            z10 = false;
        }
        if (num != null) {
            StringBuilder sb5 = this.f5878i;
            sb5.append(" LIMIT ");
            sb5.append(num);
        }
        return this.f5878i.toString();
    }

    /* renamed from: f */
    public SQLiteStatement m7161f() {
        if (this.f5877h == null) {
            this.f5877h = this.f5879j.compileStatement("SELECT COUNT(*) FROM " + this.f5880k + " WHERE " + C1300a.f5865v.f5893a + " != ?");
        }
        return this.f5877h;
    }

    /* renamed from: g */
    public SQLiteStatement m7162g() {
        if (this.f5875f == null) {
            this.f5875f = this.f5879j.compileStatement("DELETE FROM " + this.f5880k + " WHERE " + this.f5881l + " = ?");
        }
        return this.f5875f;
    }

    /* renamed from: h */
    public SQLiteStatement m7163h() {
        if (this.f5874e == null) {
            this.f5878i.setLength(0);
            StringBuilder sb2 = this.f5878i;
            sb2.append("INSERT OR REPLACE INTO ");
            sb2.append(this.f5880k);
            this.f5878i.append(" VALUES (");
            for (int i10 = 0; i10 < this.f5882m; i10++) {
                if (i10 != 0) {
                    this.f5878i.append(",");
                }
                this.f5878i.append("?");
            }
            this.f5878i.append(")");
            this.f5874e = this.f5879j.compileStatement(this.f5878i.toString());
        }
        return this.f5874e;
    }

    /* renamed from: i */
    public SQLiteStatement m7164i() {
        if (this.f5872c == null) {
            this.f5878i.setLength(0);
            StringBuilder sb2 = this.f5878i;
            sb2.append("INSERT INTO ");
            sb2.append(this.f5880k);
            this.f5878i.append(" VALUES (");
            for (int i10 = 0; i10 < this.f5882m; i10++) {
                if (i10 != 0) {
                    this.f5878i.append(",");
                }
                this.f5878i.append("?");
            }
            this.f5878i.append(")");
            this.f5872c = this.f5879j.compileStatement(this.f5878i.toString());
        }
        return this.f5872c;
    }

    /* renamed from: j */
    public SQLiteStatement m7165j() {
        if (this.f5873d == null) {
            this.f5878i.setLength(0);
            StringBuilder sb2 = this.f5878i;
            sb2.append("INSERT INTO ");
            sb2.append("job_holder_tags");
            this.f5878i.append(" VALUES (");
            for (int i10 = 0; i10 < this.f5884o; i10++) {
                if (i10 != 0) {
                    this.f5878i.append(",");
                }
                this.f5878i.append("?");
            }
            this.f5878i.append(")");
            this.f5873d = this.f5879j.compileStatement(this.f5878i.toString());
        }
        return this.f5873d;
    }

    /* renamed from: k */
    public SQLiteStatement m7166k() {
        if (this.f5876g == null) {
            this.f5876g = this.f5879j.compileStatement("UPDATE " + this.f5880k + " SET " + C1300a.f5861r.f5893a + " = ? , " + C1300a.f5865v.f5893a + " = ?  WHERE " + this.f5881l + " = ? ");
        }
        return this.f5876g;
    }

    /* renamed from: l */
    public void m7167l(long j10) {
        this.f5879j.execSQL("UPDATE job_holder SET " + C1300a.f5864u.f5893a + "=?," + C1300a.f5866w.f5893a + "=?, " + C1300a.f5867x.f5893a + "=?", new Object[]{Long.valueOf(j10), Long.valueOf(j10), Long.valueOf(j10)});
    }

    /* renamed from: m */
    public void m7168m() {
        this.f5879j.execSQL("DELETE FROM job_holder");
        m7169n();
    }

    /* renamed from: n */
    public void m7169n() {
        this.f5879j.execSQL("VACUUM");
    }
}
