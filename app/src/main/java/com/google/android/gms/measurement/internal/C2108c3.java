package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.measurement.internal.c3 */
/* loaded from: classes.dex */
public final class C2108c3 extends AbstractC2316v3 {

    /* renamed from: c */
    private final C2097b3 f8024c;

    /* renamed from: d */
    private boolean f8025d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2108c3(C2219m4 c2219m4) {
        super(c2219m4);
        Context mo9763c = this.f8118a.mo9763c();
        this.f8118a.m10134z();
        this.f8024c = new C2097b3(this, mo9763c, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m9794x(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2108c3.m9794x(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2316v3
    /* renamed from: n */
    protected final boolean mo9718n() {
        return false;
    }

    /* renamed from: o */
    final SQLiteDatabase m9795o() throws SQLiteException {
        if (this.f8025d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f8024c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f8025d = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0255  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> m9796p(int r23) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2108c3.m9796p(int):java.util.List");
    }

    /* renamed from: q */
    public final void m9797q() {
        int delete;
        mo9917h();
        try {
            SQLiteDatabase m9795o = m9795o();
            if (m9795o == null || (delete = m9795o.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f8118a.mo9765d().m10052v().m9894b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            this.f8118a.mo9765d().m10048r().m9894b("Error resetting local analytics data. error", e10);
        }
    }

    /* renamed from: r */
    public final boolean m9798r() {
        return m9794x(3, new byte[0]);
    }

    /* renamed from: s */
    final boolean m9799s() {
        Context mo9763c = this.f8118a.mo9763c();
        this.f8118a.m10134z();
        return mo9763c.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: t */
    public final boolean m9800t() {
        int i10;
        mo9917h();
        if (!this.f8025d && m9799s()) {
            int i11 = 5;
            while (i10 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase m9795o = m9795o();
                    if (m9795o == null) {
                        this.f8025d = true;
                        return false;
                    }
                    m9795o.beginTransaction();
                    m9795o.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m9795o.setTransactionSuccessful();
                    m9795o.endTransaction();
                    m9795o.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i11);
                    i11 += 20;
                    i10 = 0 == 0 ? i10 + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e10) {
                    this.f8118a.mo9765d().m10048r().m9894b("Error deleting app launch break from local database", e10);
                    this.f8025d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.f8118a.mo9765d().m10048r().m9894b("Error deleting app launch break from local database", e11);
                    this.f8025d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f8118a.mo9765d().m10053w().m9893a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m9801u(zzab zzabVar) {
        byte[] m9964c0 = this.f8118a.m10114N().m9964c0(zzabVar);
        if (m9964c0.length > 131072) {
            this.f8118a.mo9765d().m10050t().m9893a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return m9794x(2, m9964c0);
    }

    /* renamed from: v */
    public final boolean m9802v(zzat zzatVar) {
        Parcel obtain = Parcel.obtain();
        C2269r.m10225a(zzatVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f8118a.mo9765d().m10050t().m9893a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return m9794x(0, marshall);
    }

    /* renamed from: w */
    public final boolean m9803w(zzkv zzkvVar) {
        Parcel obtain = Parcel.obtain();
        C2136e9.m9856a(zzkvVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f8118a.mo9765d().m10050t().m9893a("User property too long for local database. Sending directly to service");
            return false;
        }
        return m9794x(1, marshall);
    }
}
