package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteStatement;
import com.birbit.android.jobqueue.AbstractC1292e;
import com.birbit.android.jobqueue.C1290c;
import com.birbit.android.jobqueue.C1293f;
import com.birbit.android.jobqueue.JobQueue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;
import p208q1.C4292a;
import p233s1.C4516a;

/* loaded from: classes.dex */
public class SqliteJobQueue implements JobQueue {

    /* renamed from: a */
    C1300a f5848a;

    /* renamed from: b */
    private final long f5849b;

    /* renamed from: c */
    SQLiteDatabase f5850c;

    /* renamed from: d */
    C1301b f5851d;

    /* renamed from: e */
    JobSerializer f5852e;

    /* renamed from: f */
    Set<String> f5853f = new HashSet();

    /* renamed from: g */
    private final StringBuilder f5854g = new StringBuilder();

    /* renamed from: h */
    private final C1303d f5855h;

    /* loaded from: classes.dex */
    public interface JobSerializer {
        <T extends AbstractC1292e> T deserialize(byte[] bArr) throws IOException, ClassNotFoundException;

        byte[] serialize(Object obj) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue$b */
    /* loaded from: classes.dex */
    public static class C1298b extends Exception {
        private C1298b() {
        }
    }

    /* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue$c */
    /* loaded from: classes.dex */
    public static class C1299c implements JobSerializer {
        @Override // com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue.JobSerializer
        public <T extends AbstractC1292e> T deserialize(byte[] bArr) throws IOException, ClassNotFoundException {
            ObjectInputStream objectInputStream;
            ObjectInputStream objectInputStream2 = null;
            if (bArr == null || bArr.length == 0) {
                return null;
            }
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            } catch (Throwable th) {
                th = th;
            }
            try {
                T t10 = (T) objectInputStream.readObject();
                objectInputStream.close();
                return t10;
            } catch (Throwable th2) {
                th = th2;
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    objectInputStream2.close();
                }
                throw th;
            }
        }

        @Override // com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue.JobSerializer
        public byte[] serialize(Object obj) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            if (obj == null) {
                return null;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
            try {
                new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
                throw th;
            }
        }
    }

    public SqliteJobQueue(C4292a c4292a, long j10, JobSerializer jobSerializer) {
        String str;
        this.f5849b = j10;
        this.f5855h = new C1303d(j10);
        Context m17790b = c4292a.m17790b();
        if (c4292a.m17803o()) {
            str = null;
        } else {
            str = "db_" + c4292a.m17794f();
        }
        C1300a c1300a = new C1300a(m17790b, str);
        this.f5848a = c1300a;
        SQLiteDatabase writableDatabase = c1300a.getWritableDatabase();
        this.f5850c = writableDatabase;
        this.f5851d = new C1301b(writableDatabase, "job_holder", C1300a.f5858o.f5893a, 11, "job_holder_tags", 3, j10);
        this.f5852e = jobSerializer;
        if (c4292a.m17804p()) {
            this.f5851d.m7167l(Long.MIN_VALUE);
        }
    }

    /* renamed from: a */
    private void m7146a(SQLiteStatement sQLiteStatement, String str, String str2) {
        sQLiteStatement.bindString(C1300a.f5869z.f5895c + 1, str);
        sQLiteStatement.bindString(C1300a.f5856A.f5895c + 1, str2);
    }

    /* renamed from: b */
    private void m7147b(SQLiteStatement sQLiteStatement, C1293f c1293f) {
        if (c1293f.m7064e() != null) {
            sQLiteStatement.bindLong(C1300a.f5857n.f5895c + 1, c1293f.m7064e().longValue());
        }
        sQLiteStatement.bindString(C1300a.f5858o.f5895c + 1, c1293f.m7063d());
        sQLiteStatement.bindLong(C1300a.f5859p.f5895c + 1, c1293f.m7066g());
        if (c1293f.m7062c() != null) {
            sQLiteStatement.bindString(C1300a.f5860q.f5895c + 1, c1293f.m7062c());
        }
        sQLiteStatement.bindLong(C1300a.f5861r.f5895c + 1, c1293f.m7070k());
        byte[] m7151f = m7151f(c1293f);
        if (m7151f != null) {
            sQLiteStatement.bindBlob(C1300a.f5862s.f5895c + 1, m7151f);
        }
        sQLiteStatement.bindLong(C1300a.f5863t.f5895c + 1, c1293f.m7060a());
        sQLiteStatement.bindLong(C1300a.f5864u.f5895c + 1, c1293f.m7061b());
        sQLiteStatement.bindLong(C1300a.f5865v.f5895c + 1, c1293f.m7071l());
        sQLiteStatement.bindLong(C1300a.f5866w.f5895c + 1, c1293f.m7067h());
        sQLiteStatement.bindLong(C1300a.f5867x.f5895c + 1, c1293f.m7068i());
    }

    /* renamed from: c */
    private C1293f m7148c(Cursor cursor) throws C1298b {
        AbstractC1292e m7153h = m7153h(cursor.getBlob(C1300a.f5862s.f5895c));
        if (m7153h != null) {
            return new C1293f.b().m7090e(cursor.getLong(C1300a.f5857n.f5895c)).m7092g(cursor.getInt(C1300a.f5859p.f5895c)).m7089d(cursor.getString(C1300a.f5860q.f5895c)).m7093h(cursor.getInt(C1300a.f5861r.f5895c)).m7091f(m7153h).m7087b(cursor.getLong(C1300a.f5863t.f5895c)).m7088c(cursor.getLong(C1300a.f5864u.f5895c)).m7094i(cursor.getLong(C1300a.f5865v.f5895c)).m7086a();
        }
        throw new C1298b();
    }

    /* renamed from: d */
    private C1302c m7149d(C1290c c1290c) {
        return this.f5855h.m7182a(c1290c, this.f5853f, this.f5854g);
    }

    /* renamed from: e */
    private void m7150e(String str) {
        this.f5853f.remove(str);
        SQLiteStatement m7162g = this.f5851d.m7162g();
        m7162g.clearBindings();
        m7162g.bindString(1, str);
        m7162g.execute();
    }

    /* renamed from: f */
    private byte[] m7151f(C1293f c1293f) {
        return m7154i(c1293f.m7065f());
    }

    /* renamed from: g */
    private boolean m7152g(C1293f c1293f) {
        SQLiteStatement m7164i = this.f5851d.m7164i();
        SQLiteStatement m7165j = this.f5851d.m7165j();
        this.f5850c.beginTransaction();
        try {
            m7164i.clearBindings();
            m7147b(m7164i, c1293f);
            if (m7164i.executeInsert() != -1) {
                for (String str : c1293f.m7072m()) {
                    m7165j.clearBindings();
                    m7146a(m7165j, c1293f.m7063d(), str);
                    m7165j.executeInsert();
                }
                this.f5850c.setTransactionSuccessful();
                return true;
            }
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    /* renamed from: h */
    private AbstractC1292e m7153h(byte[] bArr) {
        try {
            return this.f5852e.deserialize(bArr);
        } catch (Throwable th) {
            C4516a.m18535d(th, "error while deserializing job", new Object[0]);
            return null;
        }
    }

    /* renamed from: i */
    private byte[] m7154i(Object obj) {
        try {
            return this.f5852e.serialize(obj);
        } catch (Throwable th) {
            C4516a.m18535d(th, "error while serializing object %s", obj.getClass().getSimpleName());
            return null;
        }
    }

    /* renamed from: j */
    private void m7155j(C1293f c1293f) {
        SQLiteStatement m7166k = this.f5851d.m7166k();
        c1293f.m7058B(c1293f.m7070k() + 1);
        c1293f.m7059C(this.f5849b);
        m7166k.clearBindings();
        m7166k.bindLong(1, c1293f.m7070k());
        m7166k.bindLong(2, this.f5849b);
        m7166k.bindString(3, c1293f.m7063d());
        m7166k.execute();
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void clear() {
        this.f5851d.m7168m();
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public int count() {
        SQLiteStatement m7161f = this.f5851d.m7161f();
        m7161f.clearBindings();
        m7161f.bindLong(1, this.f5849b);
        return (int) m7161f.simpleQueryForLong();
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public int countReadyJobs(C1290c c1290c) {
        return (int) m7149d(c1290c).m7170a(this.f5850c, this.f5854g).simpleQueryForLong();
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public C1293f findJobById(String str) {
        Cursor rawQuery = this.f5850c.rawQuery(this.f5851d.f5870a, new String[]{str});
        try {
            if (rawQuery.moveToFirst()) {
                return m7148c(rawQuery);
            }
            return null;
        } catch (C1298b e10) {
            C4516a.m18535d(e10, "invalid job on findJobById", new Object[0]);
            return null;
        } finally {
            rawQuery.close();
        }
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public Set<C1293f> findJobs(C1290c c1290c) {
        C1302c m7149d = m7149d(c1290c);
        Cursor rawQuery = this.f5850c.rawQuery(m7149d.m7172c(this.f5851d), m7149d.f5900c);
        HashSet hashSet = new HashSet();
        while (rawQuery.moveToNext()) {
            try {
                try {
                    hashSet.add(m7148c(rawQuery));
                } catch (C1298b e10) {
                    C4516a.m18535d(e10, "invalid job found by tags.", new Object[0]);
                }
            } finally {
                rawQuery.close();
            }
        }
        return hashSet;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public Long getNextJobDelayUntilNs(C1290c c1290c) {
        C1302c m7149d = m7149d(c1290c);
        try {
            if (!c1290c.m7014s() && !c1290c.m7015t()) {
                return Long.valueOf(m7149d.m7174e(this.f5850c, this.f5851d).simpleQueryForLong());
            }
            return Long.valueOf(m7149d.m7175f(this.f5850c, this.f5851d).simpleQueryForLong());
        } catch (SQLiteDoneException unused) {
            return null;
        }
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public boolean insert(C1293f c1293f) {
        if (c1293f.m7073n()) {
            return m7152g(c1293f);
        }
        SQLiteStatement m7164i = this.f5851d.m7164i();
        m7164i.clearBindings();
        m7147b(m7164i, c1293f);
        long executeInsert = m7164i.executeInsert();
        c1293f.m7085z(executeInsert);
        return executeInsert != -1;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public boolean insertOrReplace(C1293f c1293f) {
        if (c1293f.m7064e() == null) {
            return insert(c1293f);
        }
        c1293f.m7059C(Long.MIN_VALUE);
        SQLiteStatement m7163h = this.f5851d.m7163h();
        m7163h.clearBindings();
        m7147b(m7163h, c1293f);
        return m7163h.executeInsert() != -1;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public C1293f nextJobAndIncRunCount(C1290c c1290c) {
        C1302c m7149d = m7149d(c1290c);
        String m7173d = m7149d.m7173d(this.f5851d);
        while (true) {
            Cursor rawQuery = this.f5850c.rawQuery(m7173d, m7149d.f5900c);
            try {
                if (!rawQuery.moveToNext()) {
                    return null;
                }
                C1293f m7148c = m7148c(rawQuery);
                m7155j(m7148c);
                return m7148c;
            } catch (C1298b unused) {
                String string = rawQuery.getString(C1300a.f5858o.f5895c);
                if (string == null) {
                    C4516a.m18534c("cannot find job id on a retriewed job", new Object[0]);
                } else {
                    m7150e(string);
                }
            } finally {
                rawQuery.close();
            }
        }
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void onJobCancelled(C1293f c1293f) {
        this.f5853f.add(c1293f.m7063d());
        m7155j(c1293f);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void remove(C1293f c1293f) {
        if (c1293f.m7063d() == null) {
            C4516a.m18534c("called remove with null job id.", new Object[0]);
        } else {
            m7150e(c1293f.m7063d());
        }
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void substitute(C1293f c1293f, C1293f c1293f2) {
        this.f5850c.beginTransaction();
        try {
            remove(c1293f2);
            insert(c1293f);
            this.f5850c.setTransactionSuccessful();
        } finally {
            this.f5850c.endTransaction();
        }
    }
}
