package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.measurement.C1514c4;
import com.google.android.gms.internal.measurement.C1531d4;
import com.google.android.gms.internal.measurement.C1608hd;
import com.google.android.gms.internal.measurement.C1680m4;
import com.google.android.gms.internal.measurement.C1696n4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.i */
/* loaded from: classes.dex */
public final class C2170i extends AbstractC2289s8 {

    /* renamed from: f */
    private static final String[] f8153f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    private static final String[] f8154g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    private static final String[] f8155h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* renamed from: i */
    private static final String[] f8156i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    private static final String[] f8157j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    private static final String[] f8158k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    private static final String[] f8159l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    private static final String[] f8160m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C2159h f8161d;

    /* renamed from: e */
    private final C2245o8 f8162e;

    public C2170i(C2103b9 c2103b9) {
        super(c2103b9);
        this.f8162e = new C2245o8(this.f8118a.mo9767e());
        this.f8118a.m10134z();
        this.f8161d = new C2159h(this, this.f8118a.mo9763c(), "google_app_measurement.db");
    }

    /* renamed from: J */
    static final void m9995J(ContentValues contentValues, String str, Object obj) {
        C5984j.m21282f("value");
        C5984j.m21286j(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: L */
    private final long m9996L(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m10005R().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                this.f8118a.mo9765d().m10048r().m9895c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: M */
    private final long m9997M(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = m10005R().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j10;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e10) {
                this.f8118a.mo9765d().m10048r().m9895c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0231: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:108:0x0231 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* renamed from: I */
    public final void m9999I(String str, long j10, long j11, C2092a9 c2092a9) {
        ?? r42;
        Cursor cursor;
        Cursor rawQuery;
        String string;
        String str2;
        String[] strArr;
        C5984j.m21286j(c2092a9);
        mo9917h();
        m10300i();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase m10005R = m10005R();
                r42 = TextUtils.isEmpty(null);
                String str4 = BuildConfig.FLAVOR;
                try {
                    if (r42 != 0) {
                        String[] strArr2 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                        if (j11 != -1) {
                            str4 = "rowid <= ? and ";
                        }
                        StringBuilder sb2 = new StringBuilder(str4.length() + 148);
                        sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb2.append(str4);
                        sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        rawQuery = m10005R.rawQuery(sb2.toString(), strArr2);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            str3 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        String[] strArr3 = j11 != -1 ? new String[]{null, String.valueOf(j11)} : new String[]{null};
                        if (j11 != -1) {
                            str4 = " and rowid <= ?";
                        }
                        StringBuilder sb3 = new StringBuilder(str4.length() + 84);
                        sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb3.append(str4);
                        sb3.append(" order by rowid limit 1;");
                        rawQuery = m10005R.rawQuery(sb3.toString(), strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        Cursor query = m10005R.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f8118a.mo9765d().m10048r().m9894b("Raw event metadata record is missing. appId", C2174i3.m10044z(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    C1696n4 m8466p = ((C1680m4) C2125d9.m9824D(C1696n4.m8503J1(), query.getBlob(0))).m8466p();
                                    if (query.moveToNext()) {
                                        this.f8118a.mo9765d().m10053w().m9894b("Get multiple raw event metadata records, expected one. appId", C2174i3.m10044z(str3));
                                    }
                                    query.close();
                                    C5984j.m21286j(m8466p);
                                    c2092a9.f7971a = m8466p;
                                    if (j11 != -1) {
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str3, str5, String.valueOf(j11)};
                                    } else {
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str3, str5};
                                    }
                                    Cursor query2 = m10005R.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                                    if (!query2.moveToFirst()) {
                                        this.f8118a.mo9765d().m10053w().m9894b("Raw event data disappeared while in transaction. appId", C2174i3.m10044z(str3));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        long j12 = query2.getLong(0);
                                        try {
                                            C1514c4 c1514c4 = (C1514c4) C2125d9.m9824D(C1531d4.m8019A(), query2.getBlob(3));
                                            c1514c4.m7985E(query2.getString(1));
                                            c1514c4.m7989I(query2.getLong(2));
                                            if (!c2092a9.m9729a(j12, c1514c4.m8466p())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e10) {
                                            this.f8118a.mo9765d().m10048r().m9895c("Data loss. Failed to merge raw event. appId", C2174i3.m10044z(str3), e10);
                                        }
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (IOException e11) {
                                    this.f8118a.mo9765d().m10048r().m9895c("Data loss. Failed to merge raw event metadata. appId", C2174i3.m10044z(str3), e11);
                                    query.close();
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                r42 = query;
                                this.f8118a.mo9765d().m10048r().m9895c("Data loss. Error selecting raw event. appId", C2174i3.m10044z(str3), e);
                                if (r42 != 0) {
                                    r42.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = query;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        r42 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                }
            } catch (SQLiteException e16) {
                e = e16;
                r42 = 0;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            cursor2 = cursor;
        }
    }

    /* renamed from: K */
    public final int m10000K(String str, String str2) {
        C5984j.m21282f(str);
        C5984j.m21282f(str2);
        mo9917h();
        m10300i();
        try {
            return m10005R().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f8118a.mo9765d().m10048r().m9896d("Error deleting conditional property", C2174i3.m10044z(str), this.f8118a.m10105D().m9811f(str2), e10);
            return 0;
        }
    }

    /* renamed from: N */
    public final long m10001N(String str, String str2) {
        C5984j.m21282f(str);
        C5984j.m21282f("first_open_count");
        mo9917h();
        m10300i();
        SQLiteDatabase m10005R = m10005R();
        m10005R.beginTransaction();
        long j10 = 0;
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                long m9997M = m9997M(sb2.toString(), new String[]{str}, -1L);
                if (m9997M == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (m10005R.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.f8118a.mo9765d().m10048r().m9895c("Failed to insert column (got -1). appId", C2174i3.m10044z(str), "first_open_count");
                        return -1L;
                    }
                    m9997M = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + m9997M));
                    if (m10005R.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.f8118a.mo9765d().m10048r().m9895c("Failed to update column (got 0). appId", C2174i3.m10044z(str), "first_open_count");
                        return -1L;
                    }
                    m10005R.setTransactionSuccessful();
                    return m9997M;
                } catch (SQLiteException e10) {
                    e = e10;
                    j10 = m9997M;
                    this.f8118a.mo9765d().m10048r().m9896d("Error inserting column. appId", C2174i3.m10044z(str), "first_open_count", e);
                    m10005R.endTransaction();
                    return j10;
                }
            } finally {
                m10005R.endTransaction();
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    /* renamed from: O */
    public final long m10002O() {
        return m9997M("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: P */
    public final long m10003P() {
        return m9997M("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: Q */
    public final long m10004Q(String str) {
        C5984j.m21282f(str);
        return m9997M("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* renamed from: R */
    public final SQLiteDatabase m10005R() {
        mo9917h();
        try {
            return this.f8161d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f8118a.mo9765d().m10053w().m9894b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:57:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m10006S(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo9917h()
            r7.m10300i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m10005R()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.m4 r8 = r7.f8118a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.i3 r8 = r8.mo9765d()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.g3 r8 = r8.m10052v()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.m9893a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        L30:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.c4 r3 = com.google.android.gms.internal.measurement.C1531d4.m8019A()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.t9 r2 = com.google.android.gms.measurement.internal.C2125d9.m9824D(r3, r2)     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.c4 r2 = (com.google.android.gms.internal.measurement.C1514c4) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.p8 r2 = r2.m8466p()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.d4 r2 = (com.google.android.gms.internal.measurement.C1531d4) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.b9 r8 = r7.f8517b     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r8.m9769f0()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.List r8 = r2.m8032E()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.h4 r3 = (com.google.android.gms.internal.measurement.C1599h4) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.m8218C()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            boolean r5 = r3.m8221R()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.m8226w()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.m8222S()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.m8227x()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.m8225W()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.m8219D()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.m8223U()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.m8229z()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L9e:
            r1.close()
            return r2
        La2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.m4 r3 = r7.f8118a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.i3 r3 = r3.mo9765d()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.g3 r3 = r3.m10048r()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2174i3.m10044z(r8)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r3.m9895c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        Lba:
            r8 = move-exception
            goto Lc0
        Lbc:
            r8 = move-exception
            goto Ld7
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            com.google.android.gms.measurement.internal.m4 r2 = r7.f8118a     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.i3 r2 = r2.mo9765d()     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.g3 r2 = r2.m10048r()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.m9894b(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2170i.m10006S(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157 A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:5:0x005f, B:10:0x0069, B:12:0x00cc, B:16:0x00d6, B:19:0x0120, B:21:0x0157, B:24:0x0165, B:25:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:35:0x0191, B:37:0x019c, B:38:0x01ae, B:40:0x01bf, B:41:0x01c8, B:43:0x01d1, B:47:0x018d, B:48:0x011b), top: B:4:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019c A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:5:0x005f, B:10:0x0069, B:12:0x00cc, B:16:0x00d6, B:19:0x0120, B:21:0x0157, B:24:0x0165, B:25:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:35:0x0191, B:37:0x019c, B:38:0x01ae, B:40:0x01bf, B:41:0x01c8, B:43:0x01d1, B:47:0x018d, B:48:0x011b), top: B:4:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bf A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:5:0x005f, B:10:0x0069, B:12:0x00cc, B:16:0x00d6, B:19:0x0120, B:21:0x0157, B:24:0x0165, B:25:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:35:0x0191, B:37:0x019c, B:38:0x01ae, B:40:0x01bf, B:41:0x01c8, B:43:0x01d1, B:47:0x018d, B:48:0x011b), top: B:4:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d1 A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:5:0x005f, B:10:0x0069, B:12:0x00cc, B:16:0x00d6, B:19:0x0120, B:21:0x0157, B:24:0x0165, B:25:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:35:0x0191, B:37:0x019c, B:38:0x01ae, B:40:0x01bf, B:41:0x01c8, B:43:0x01d1, B:47:0x018d, B:48:0x011b), top: B:4:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018d A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:5:0x005f, B:10:0x0069, B:12:0x00cc, B:16:0x00d6, B:19:0x0120, B:21:0x0157, B:24:0x0165, B:25:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:35:0x0191, B:37:0x019c, B:38:0x01ae, B:40:0x01bf, B:41:0x01c8, B:43:0x01d1, B:47:0x018d, B:48:0x011b), top: B:4:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:5:0x005f, B:10:0x0069, B:12:0x00cc, B:16:0x00d6, B:19:0x0120, B:21:0x0157, B:24:0x0165, B:25:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:35:0x0191, B:37:0x019c, B:38:0x01ae, B:40:0x01bf, B:41:0x01c8, B:43:0x01d1, B:47:0x018d, B:48:0x011b), top: B:4:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020b  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C2274r4 m10007T(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2170i.m10007T(java.lang.String):com.google.android.gms.measurement.internal.r4");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:30:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzab m10008U(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2170i.m10008U(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzab");
    }

    /* renamed from: V */
    public final C2148g m10009V(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return m10010W(j10, str, 1L, false, false, z12, false, z14);
    }

    /* renamed from: W */
    public final C2148g m10010W(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        C5984j.m21282f(str);
        mo9917h();
        m10300i();
        String[] strArr = {str};
        C2148g c2148g = new C2148g();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m10005R = m10005R();
                Cursor query = m10005R.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.f8118a.mo9765d().m10053w().m9894b("Not updating daily counts, app is not known. appId", C2174i3.m10044z(str));
                    query.close();
                    return c2148g;
                }
                if (query.getLong(0) == j10) {
                    c2148g.f8099b = query.getLong(1);
                    c2148g.f8098a = query.getLong(2);
                    c2148g.f8100c = query.getLong(3);
                    c2148g.f8101d = query.getLong(4);
                    c2148g.f8102e = query.getLong(5);
                }
                if (z10) {
                    c2148g.f8099b += j11;
                }
                if (z11) {
                    c2148g.f8098a += j11;
                }
                if (z12) {
                    c2148g.f8100c += j11;
                }
                if (z13) {
                    c2148g.f8101d += j11;
                }
                if (z14) {
                    c2148g.f8102e += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(c2148g.f8098a));
                contentValues.put("daily_events_count", Long.valueOf(c2148g.f8099b));
                contentValues.put("daily_conversions_count", Long.valueOf(c2148g.f8100c));
                contentValues.put("daily_error_events_count", Long.valueOf(c2148g.f8101d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c2148g.f8102e));
                m10005R.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return c2148g;
            } catch (SQLiteException e10) {
                this.f8118a.mo9765d().m10048r().m9895c("Error updating daily counts. appId", C2174i3.m10044z(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return c2148g;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C2236o m10011X(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2170i.m10011X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.o");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:27:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C2147f9 m10012Z(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            p321z2.C5984j.m21282f(r20)
            p321z2.C5984j.m21282f(r21)
            r19.mo9917h()
            r19.m10300i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.m10005R()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.Object r8 = r1.m10013a0(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.f9 r0 = new com.google.android.gms.measurement.internal.f9     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r2 == 0) goto L75
            com.google.android.gms.measurement.internal.m4 r2 = r1.f8118a     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.i3 r2 = r2.mo9765d()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.g3 r2 = r2.m10048r()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2174i3.m10044z(r20)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2.m9894b(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
        L75:
            r11.close()
            return r0
        L79:
            r0 = move-exception
            goto L7f
        L7b:
            r0 = move-exception
            goto La4
        L7d:
            r0 = move-exception
            r11 = r10
        L7f:
            com.google.android.gms.measurement.internal.m4 r2 = r1.f8118a     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.i3 r2 = r2.mo9765d()     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.g3 r2 = r2.m10048r()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2174i3.m10044z(r20)     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.m4 r5 = r1.f8118a     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.d3 r5 = r5.m10105D()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.m9811f(r9)     // Catch: java.lang.Throwable -> La2
            r2.m9896d(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r10
        La2:
            r0 = move-exception
            r10 = r11
        La4:
            if (r10 == 0) goto La9
            r10.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2170i.m10012Z(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.f9");
    }

    /* renamed from: a0 */
    final Object m10013a0(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f8118a.mo9765d().m10048r().m9893a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.f8118a.mo9765d().m10048r().m9894b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f8118a.mo9765d().m10048r().m9893a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m10014b0() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m10005R()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.m4 r3 = r6.f8118a     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.i3 r3 = r3.mo9765d()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.g3 r3 = r3.m10048r()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m9894b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2170i.m10014b0():java.lang.String");
    }

    /* renamed from: c0 */
    public final List<zzab> m10015c0(String str, String str2, String str3) {
        C5984j.m21282f(str);
        mo9917h();
        m10300i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return m10016d0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r2 = r27.f8118a.mo9765d().m10048r();
        r27.f8118a.m10134z();
        r2.m9894b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzab> m10016d0(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2170i.m10016d0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: e0 */
    public final List<C2147f9> m10017e0(String str) {
        C5984j.m21282f(str);
        mo9917h();
        m10300i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.f8118a.m10134z();
                cursor = m10005R().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = BuildConfig.FLAVOR;
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object m10013a0 = m10013a0(cursor, 3);
                    if (m10013a0 == null) {
                        this.f8118a.mo9765d().m10048r().m9894b("Read invalid user property value, ignoring it. appId", C2174i3.m10044z(str));
                    } else {
                        arrayList.add(new C2147f9(str, str2, string, j10, m10013a0));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.f8118a.mo9765d().m10048r().m9895c("Error querying user properties. appId", C2174i3.m10044z(str), e10);
                List<C2147f9> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        r2 = r16.f8118a.mo9765d().m10048r();
        r16.f8118a.m10134z();
        r2.m9894b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d A[DONT_GENERATE] */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.C2147f9> m10018f0(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2170i.m10018f0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: g0 */
    public final void m10019g0() {
        m10300i();
        m10005R().beginTransaction();
    }

    /* renamed from: h0 */
    public final void m10020h0(List<Long> list) {
        C5984j.m21286j(list);
        mo9917h();
        m10300i();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(list.get(i10).longValue());
        }
        sb2.append(")");
        int delete = m10005R().delete("raw_events", sb2.toString(), null);
        if (delete != list.size()) {
            this.f8118a.mo9765d().m10048r().m9895c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    /* renamed from: i0 */
    public final void m10021i0() {
        m10300i();
        m10005R().endTransaction();
    }

    /* renamed from: j0 */
    public final void m10022j0(List<Long> list) {
        mo9917h();
        m10300i();
        C5984j.m21286j(list);
        C5984j.m21288l(list.size());
        if (m10033w()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
            sb2.append("(");
            sb2.append(join);
            sb2.append(")");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 80);
            sb4.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb4.append(sb3);
            sb4.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m9996L(sb4.toString(), null) > 0) {
                this.f8118a.mo9765d().m10053w().m9893a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase m10005R = m10005R();
                StringBuilder sb5 = new StringBuilder(sb3.length() + 127);
                sb5.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb5.append(sb3);
                sb5.append(" AND (retry_count IS NULL OR retry_count < ");
                sb5.append(Integer.MAX_VALUE);
                sb5.append(")");
                m10005R.execSQL(sb5.toString());
            } catch (SQLiteException e10) {
                this.f8118a.mo9765d().m10048r().m9894b("Error incrementing retry count. error", e10);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2289s8
    /* renamed from: l */
    protected final boolean mo9853l() {
        return false;
    }

    /* renamed from: m */
    public final void m10023m() {
        mo9917h();
        m10300i();
        if (m10033w()) {
            long m10298a = this.f8517b.m9766d0().f8820g.m10298a();
            long mo13782b = this.f8118a.mo9767e().mo13782b();
            long abs = Math.abs(mo13782b - m10298a);
            this.f8118a.m10134z();
            if (abs > C2335x2.f8746z.m10317a(null).longValue()) {
                this.f8517b.m9766d0().f8820g.m10299b(mo13782b);
                mo9917h();
                m10300i();
                if (m10033w()) {
                    SQLiteDatabase m10005R = m10005R();
                    this.f8118a.m10134z();
                    int delete = m10005R.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f8118a.mo9767e().mo13781a()), String.valueOf(C2137f.m9858i())});
                    if (delete > 0) {
                        this.f8118a.mo9765d().m10052v().m9894b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public final void m10024n(String str, String str2) {
        C5984j.m21282f(str);
        C5984j.m21282f(str2);
        mo9917h();
        m10300i();
        try {
            m10005R().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f8118a.mo9765d().m10048r().m9896d("Error deleting user property. appId", C2174i3.m10044z(str), this.f8118a.m10105D().m9811f(str2), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0264, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0248, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f2, code lost:
    
        r0 = r23.f8118a.mo9765d().m10053w();
        r8 = com.google.android.gms.measurement.internal.C2174i3.m10044z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020a, code lost:
    
        if (r12.m8966K() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020c, code lost:
    
        r20 = java.lang.Integer.valueOf(r12.m8969x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0219, code lost:
    
        r0.m9896d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0217, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02aa, code lost:
    
        r21 = r4;
        r0 = r0.m8882D().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02b8, code lost:
    
        if (r0.hasNext() == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02ba, code lost:
    
        r3 = r0.next();
        m10300i();
        mo9917h();
        p321z2.C5984j.m21282f(r24);
        p321z2.C5984j.m21286j(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02d4, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.m8178A()) == false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0303, code lost:
    
        r4 = r3.m9143i();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x031a, code lost:
    
        if (r3.m8182F() == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x031c, code lost:
    
        r12 = java.lang.Integer.valueOf(r3.m8184w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0326, code lost:
    
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.m8178A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0338, code lost:
    
        if (r3.m8183G() == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x033a, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.m8181E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0344, code lost:
    
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0358, code lost:
    
        if (m10005R().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x036e, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035a, code lost:
    
        r23.f8118a.mo9765d().m10048r().m9894b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C2174i3.m10044z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0372, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0373, code lost:
    
        r23.f8118a.mo9765d().m10048r().m9895c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C2174i3.m10044z(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0343, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0325, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d6, code lost:
    
        r0 = r23.f8118a.mo9765d().m10053w();
        r7 = com.google.android.gms.measurement.internal.C2174i3.m10044z(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ee, code lost:
    
        if (r3.m8182F() == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02f0, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.m8184w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02fa, code lost:
    
        r0.m9896d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03bd, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018b, code lost:
    
        r11 = r0.m8882D().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0197, code lost:
    
        if (r11.hasNext() == false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a3, code lost:
    
        if (r11.next().m8182F() != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a5, code lost:
    
        r23.f8118a.mo9765d().m10053w().m9895c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C2174i3.m10044z(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01be, code lost:
    
        r11 = r0.m8881C().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d4, code lost:
    
        if (r11.hasNext() == false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d6, code lost:
    
        r12 = r11.next();
        m10300i();
        mo9917h();
        p321z2.C5984j.m21282f(r24);
        p321z2.C5984j.m21286j(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f0, code lost:
    
        if (android.text.TextUtils.isEmpty(r12.m8960C()) == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0224, code lost:
    
        r3 = r12.m9143i();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r24);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x023d, code lost:
    
        if (r12.m8966K() == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023f, code lost:
    
        r8 = java.lang.Integer.valueOf(r12.m8969x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0249, code lost:
    
        r4.put("filter_id", r8);
        r4.put("event_name", r12.m8960C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0259, code lost:
    
        if (r12.m8967L() == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x025b, code lost:
    
        r8 = java.lang.Boolean.valueOf(r12.m8964I());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0265, code lost:
    
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0279, code lost:
    
        if (m10005R().insertWithOnConflict("event_filters", null, r4, 5) != (-1)) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027b, code lost:
    
        r23.f8118a.mo9765d().m10048r().m9894b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C2174i3.m10044z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x028e, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0294, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0295, code lost:
    
        r23.f8118a.mo9765d().m10048r().m9895c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C2174i3.m10044z(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0386, code lost:
    
        m10300i();
        mo9917h();
        p321z2.C5984j.m21282f(r24);
        r0 = m10005R();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10025o(java.lang.String r24, java.util.List<com.google.android.gms.internal.measurement.C1822v2> r25) {
        /*
            Method dump skipped, instructions count: 1217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2170i.m10025o(java.lang.String, java.util.List):void");
    }

    /* renamed from: p */
    public final void m10026p() {
        m10300i();
        m10005R().setTransactionSuccessful();
    }

    /* renamed from: q */
    public final void m10027q(C2274r4 c2274r4) {
        C5984j.m21286j(c2274r4);
        mo9917h();
        m10300i();
        String m10263e0 = c2274r4.m10263e0();
        C5984j.m21286j(m10263e0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m10263e0);
        contentValues.put("app_instance_id", c2274r4.m10265f0());
        contentValues.put("gmp_app_id", c2274r4.m10275k0());
        contentValues.put("resettable_device_id_hash", c2274r4.m10256b());
        contentValues.put("last_bundle_index", Long.valueOf(c2274r4.m10253Z()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c2274r4.m10255a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c2274r4.m10252Y()));
        contentValues.put("app_version", c2274r4.m10269h0());
        contentValues.put("app_store", c2274r4.m10267g0());
        contentValues.put("gmp_version", Long.valueOf(c2274r4.m10251X()));
        contentValues.put("dev_cert_hash", Long.valueOf(c2274r4.m10248U()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c2274r4.m10238K()));
        contentValues.put("day", Long.valueOf(c2274r4.m10247T()));
        contentValues.put("daily_public_events_count", Long.valueOf(c2274r4.m10245R()));
        contentValues.put("daily_events_count", Long.valueOf(c2274r4.m10244Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(c2274r4.m10242O()));
        contentValues.put("config_fetched_time", Long.valueOf(c2274r4.m10241N()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c2274r4.m10250W()));
        contentValues.put("app_version_int", Long.valueOf(c2274r4.m10240M()));
        contentValues.put("firebase_instance_id", c2274r4.m10271i0());
        contentValues.put("daily_error_events_count", Long.valueOf(c2274r4.m10243P()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c2274r4.m10246S()));
        contentValues.put("health_monitor_sample", c2274r4.m10254a());
        contentValues.put("android_id", Long.valueOf(c2274r4.m10228A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c2274r4.m10237J()));
        contentValues.put("admob_app_id", c2274r4.m10259c0());
        contentValues.put("dynamite_version", Long.valueOf(c2274r4.m10249V()));
        List<String> m10258c = c2274r4.m10258c();
        if (m10258c != null) {
            if (m10258c.size() == 0) {
                this.f8118a.mo9765d().m10053w().m9894b("Safelisted events should not be an empty list. appId", m10263e0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", m10258c));
            }
        }
        C1608hd.m8291b();
        if (this.f8118a.m10134z().m9861B(m10263e0, C2335x2.f8705e0)) {
            contentValues.put("ga_app_id", c2274r4.m10273j0());
        }
        try {
            SQLiteDatabase m10005R = m10005R();
            if (m10005R.update("apps", contentValues, "app_id = ?", new String[]{m10263e0}) == 0 && m10005R.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f8118a.mo9765d().m10048r().m9894b("Failed to insert/update app (got -1). appId", C2174i3.m10044z(m10263e0));
            }
        } catch (SQLiteException e10) {
            this.f8118a.mo9765d().m10048r().m9895c("Error storing app. appId", C2174i3.m10044z(m10263e0), e10);
        }
    }

    /* renamed from: r */
    public final void m10028r(C2236o c2236o) {
        C5984j.m21286j(c2236o);
        mo9917h();
        m10300i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c2236o.f8377a);
        contentValues.put("name", c2236o.f8378b);
        contentValues.put("lifetime_count", Long.valueOf(c2236o.f8379c));
        contentValues.put("current_bundle_count", Long.valueOf(c2236o.f8380d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c2236o.f8382f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c2236o.f8383g));
        contentValues.put("last_bundled_day", c2236o.f8384h);
        contentValues.put("last_sampled_complex_event_id", c2236o.f8385i);
        contentValues.put("last_sampling_rate", c2236o.f8386j);
        contentValues.put("current_session_count", Long.valueOf(c2236o.f8381e));
        Boolean bool = c2236o.f8387k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m10005R().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f8118a.mo9765d().m10048r().m9894b("Failed to insert/update event aggregates (got -1). appId", C2174i3.m10044z(c2236o.f8377a));
            }
        } catch (SQLiteException e10) {
            this.f8118a.mo9765d().m10048r().m9895c("Error storing event aggregates. appId", C2174i3.m10044z(c2236o.f8377a), e10);
        }
    }

    /* renamed from: s */
    public final void m10029s(String str, byte[] bArr, String str2) {
        C5984j.m21282f(str);
        mo9917h();
        m10300i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (m10005R().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.f8118a.mo9765d().m10048r().m9894b("Failed to update remote config (got 0). appId", C2174i3.m10044z(str));
            }
        } catch (SQLiteException e10) {
            this.f8118a.mo9765d().m10048r().m9895c("Error storing remote config. appId", C2174i3.m10044z(str), e10);
        }
    }

    /* renamed from: t */
    public final boolean m10030t() {
        return m9996L("select count(1) > 0 from raw_events", null) != 0;
    }

    /* renamed from: u */
    public final boolean m10031u() {
        return m9996L("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* renamed from: v */
    public final boolean m10032v() {
        return m9996L("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* renamed from: w */
    protected final boolean m10033w() {
        Context mo9763c = this.f8118a.mo9763c();
        this.f8118a.m10134z();
        return mo9763c.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: x */
    public final boolean m10034x(String str, Long l10, long j10, C1531d4 c1531d4) {
        mo9917h();
        m10300i();
        C5984j.m21286j(c1531d4);
        C5984j.m21282f(str);
        C5984j.m21286j(l10);
        byte[] m9143i = c1531d4.m9143i();
        this.f8118a.mo9765d().m10052v().m9895c("Saving complex main event, appId, data size", this.f8118a.m10105D().m9809d(str), Integer.valueOf(m9143i.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", m9143i);
        try {
            if (m10005R().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.f8118a.mo9765d().m10048r().m9894b("Failed to insert complex main event (got -1). appId", C2174i3.m10044z(str));
            return false;
        } catch (SQLiteException e10) {
            this.f8118a.mo9765d().m10048r().m9895c("Error storing complex main event. appId", C2174i3.m10044z(str), e10);
            return false;
        }
    }

    /* renamed from: y */
    public final boolean m10035y(zzab zzabVar) {
        C5984j.m21286j(zzabVar);
        mo9917h();
        m10300i();
        String str = zzabVar.f8826n;
        C5984j.m21286j(str);
        if (m10012Z(str, zzabVar.f8828p.f8843o) == null) {
            long m9996L = m9996L("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f8118a.m10134z();
            if (m9996L >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzabVar.f8827o);
        contentValues.put("name", zzabVar.f8828p.f8843o);
        m9995J(contentValues, "value", C5984j.m21286j(zzabVar.f8828p.m10411x()));
        contentValues.put("active", Boolean.valueOf(zzabVar.f8830r));
        contentValues.put("trigger_event_name", zzabVar.f8831s);
        contentValues.put("trigger_timeout", Long.valueOf(zzabVar.f8833u));
        contentValues.put("timed_out_event", this.f8118a.m10114N().m9964c0(zzabVar.f8832t));
        contentValues.put("creation_timestamp", Long.valueOf(zzabVar.f8829q));
        contentValues.put("triggered_event", this.f8118a.m10114N().m9964c0(zzabVar.f8834v));
        contentValues.put("triggered_timestamp", Long.valueOf(zzabVar.f8828p.f8844p));
        contentValues.put("time_to_live", Long.valueOf(zzabVar.f8835w));
        contentValues.put("expired_event", this.f8118a.m10114N().m9964c0(zzabVar.f8836x));
        try {
            if (m10005R().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f8118a.mo9765d().m10048r().m9894b("Failed to insert/update conditional user property (got -1)", C2174i3.m10044z(str));
            }
        } catch (SQLiteException e10) {
            this.f8118a.mo9765d().m10048r().m9895c("Error storing conditional user property", C2174i3.m10044z(str), e10);
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m10036z(C2147f9 c2147f9) {
        C5984j.m21286j(c2147f9);
        mo9917h();
        m10300i();
        if (m10012Z(c2147f9.f8093a, c2147f9.f8095c) == null) {
            if (C2169h9.m9927W(c2147f9.f8095c)) {
                if (m9996L("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c2147f9.f8093a}) >= this.f8118a.m10134z().m9873p(c2147f9.f8093a, C2335x2.f8677H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(c2147f9.f8095c)) {
                long m9996L = m9996L("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c2147f9.f8093a, c2147f9.f8094b});
                this.f8118a.m10134z();
                if (m9996L >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c2147f9.f8093a);
        contentValues.put("origin", c2147f9.f8094b);
        contentValues.put("name", c2147f9.f8095c);
        contentValues.put("set_timestamp", Long.valueOf(c2147f9.f8096d));
        m9995J(contentValues, "value", c2147f9.f8097e);
        try {
            if (m10005R().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f8118a.mo9765d().m10048r().m9894b("Failed to insert/update user property (got -1). appId", C2174i3.m10044z(c2147f9.f8093a));
            }
        } catch (SQLiteException e10) {
            this.f8118a.mo9765d().m10048r().m9895c("Error storing user property. appId", C2174i3.m10044z(c2147f9.f8093a), e10);
        }
        return true;
    }
}
