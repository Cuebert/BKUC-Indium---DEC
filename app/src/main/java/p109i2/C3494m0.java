package p109i2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p003a2.AbstractC0014i;
import p003a2.AbstractC0020o;
import p003a2.C0013h;
import p042d2.C2960a;
import p042d2.C2961b;
import p042d2.C2962c;
import p042d2.C2963d;
import p042d2.C2964e;
import p042d2.C2965f;
import p056e2.C3061a;
import p123j2.C3594a;
import p123j2.InterfaceC3595b;
import p136k2.InterfaceC3749a;
import p149l2.C3869a;
import p307y1.C5593b;
import p307y1.EnumC5595d;
import sa.InterfaceC4551a;

/* renamed from: i2.m0 */
/* loaded from: classes.dex */
public class C3494m0 implements InterfaceC3475d, InterfaceC3595b, InterfaceC3473c {

    /* renamed from: s */
    private static final C5593b f14450s = C5593b.m20616b("proto");

    /* renamed from: n */
    private final C3508t0 f14451n;

    /* renamed from: o */
    private final InterfaceC3749a f14452o;

    /* renamed from: p */
    private final InterfaceC3749a f14453p;

    /* renamed from: q */
    private final AbstractC3477e f14454q;

    /* renamed from: r */
    private final InterfaceC4551a<String> f14455r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i2.m0$b */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        /* renamed from: a */
        U mo15196a(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i2.m0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final String f14456a;

        /* renamed from: b */
        final String f14457b;

        private c(String str, String str2) {
            this.f14456a = str;
            this.f14457b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i2.m0$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        /* renamed from: a */
        T mo15203a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3494m0(InterfaceC3749a interfaceC3749a, InterfaceC3749a interfaceC3749a2, AbstractC3477e abstractC3477e, C3508t0 c3508t0, InterfaceC4551a<String> interfaceC4551a) {
        this.f14451n = c3508t0;
        this.f14452o = interfaceC3749a;
        this.f14453p = interfaceC3749a2;
        this.f14454q = abstractC3477e;
        this.f14455r = interfaceC4551a;
    }

    /* renamed from: A0 */
    private void m15234A0(final SQLiteDatabase sQLiteDatabase) {
        m15289q1(new d() { // from class: i2.c0
            @Override // p109i2.C3494m0.d
            /* renamed from: a */
            public final Object mo15203a() {
                Object m15246O0;
                m15246O0 = C3494m0.m15246O0(sQLiteDatabase);
                return m15246O0;
            }
        }, new b() { // from class: i2.b0
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Object m15247P0;
                m15247P0 = C3494m0.m15247P0((Throwable) obj);
                return m15247P0;
            }
        });
    }

    /* renamed from: B0 */
    private long m15235B0(SQLiteDatabase sQLiteDatabase, AbstractC0020o abstractC0020o) {
        Long m15240I0 = m15240I0(sQLiteDatabase, abstractC0020o);
        if (m15240I0 != null) {
            return m15240I0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC0020o.mo112b());
        contentValues.put("priority", Integer.valueOf(C3869a.m16471a(abstractC0020o.mo114d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC0020o.mo113c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC0020o.mo113c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: E0 */
    private C2961b m15236E0() {
        return C2961b.m13399b().m13402b(C2964e.m13416c().m13420b(m15303C0()).m13421c(AbstractC3477e.f14427a.mo15189f()).m13419a()).m13401a();
    }

    /* renamed from: F0 */
    private long m15237F0() {
        return m15304D0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: G0 */
    private long m15238G0() {
        return m15304D0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: H0 */
    private C2965f m15239H0() {
        final long mo15955a = this.f14452o.mo15955a();
        return (C2965f) m15305J0(new b() { // from class: i2.w
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                C2965f m15253T0;
                m15253T0 = C3494m0.m15253T0(mo15955a, (SQLiteDatabase) obj);
                return m15253T0;
            }
        });
    }

    /* renamed from: I0 */
    private Long m15240I0(SQLiteDatabase sQLiteDatabase, AbstractC0020o abstractC0020o) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC0020o.mo112b(), String.valueOf(C3869a.m16471a(abstractC0020o.mo114d()))));
        if (abstractC0020o.mo113c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC0020o.mo113c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m15295t1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: i2.v
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Long m15254U0;
                m15254U0 = C3494m0.m15254U0((Cursor) obj);
                return m15254U0;
            }
        });
    }

    /* renamed from: K0 */
    private boolean m15241K0() {
        return m15237F0() * m15238G0() >= this.f14454q.mo15189f();
    }

    /* renamed from: L0 */
    private List<AbstractC3489k> m15242L0(List<AbstractC3489k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC3489k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC3489k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo15198c()))) {
                AbstractC0014i.a m135l = next.mo15197b().m135l();
                for (c cVar : map.get(Long.valueOf(next.mo15198c()))) {
                    m135l.m138c(cVar.f14456a, cVar.f14457b);
                }
                listIterator.set(AbstractC3489k.m15233a(next.mo15198c(), next.mo15199d(), m135l.mo93d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public /* synthetic */ Object m15243M0(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo15201c(cursor.getInt(0), C2962c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public /* synthetic */ Integer m15244N0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        m15295t1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: i2.f0
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Object m15243M0;
                m15243M0 = C3494m0.this.m15243M0((Cursor) obj);
                return m15243M0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public static /* synthetic */ Object m15246O0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static /* synthetic */ Object m15247P0(Throwable th) {
        throw new C3594a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public static /* synthetic */ SQLiteDatabase m15249Q0(Throwable th) {
        throw new C3594a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public static /* synthetic */ Long m15250R0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public static /* synthetic */ C2965f m15251S0(long j10, Cursor cursor) {
        cursor.moveToNext();
        return C2965f.m13422c().m13427c(cursor.getLong(0)).m13426b(j10).m13425a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public static /* synthetic */ C2965f m15253T0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (C2965f) m15295t1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: i2.l
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                C2965f m15251S0;
                m15251S0 = C3494m0.m15251S0(j10, (Cursor) obj);
                return m15251S0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public static /* synthetic */ Long m15254U0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ Boolean m15255V0(AbstractC0020o abstractC0020o, SQLiteDatabase sQLiteDatabase) {
        Long m15240I0 = m15240I0(sQLiteDatabase, abstractC0020o);
        if (m15240I0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m15295t1(m15304D0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m15240I0.toString()}), new b() { // from class: i2.y
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public static /* synthetic */ List m15257W0(SQLiteDatabase sQLiteDatabase) {
        return (List) m15295t1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: i2.t
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                List m15259X0;
                m15259X0 = C3494m0.m15259X0((Cursor) obj);
                return m15259X0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public static /* synthetic */ List m15259X0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC0020o.m148a().mo116b(cursor.getString(1)).mo118d(C3869a.m16472b(cursor.getInt(2))).mo117c(m15283n1(cursor.getString(3))).mo115a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ List m15261Y0(AbstractC0020o abstractC0020o, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC3489k> m15279l1 = m15279l1(sQLiteDatabase, abstractC0020o, this.f14454q.mo15187d());
        for (EnumC5595d enumC5595d : EnumC5595d.values()) {
            if (enumC5595d != abstractC0020o.mo114d()) {
                int mo15187d = this.f14454q.mo15187d() - m15279l1.size();
                if (mo15187d <= 0) {
                    break;
                }
                m15279l1.addAll(m15279l1(sQLiteDatabase, abstractC0020o.m150f(enumC5595d), mo15187d));
            }
        }
        return m15242L0(m15279l1, m15281m1(sQLiteDatabase, m15279l1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public /* synthetic */ C2960a m15262Z0(Map map, C2960a.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C2962c.b m15302z0 = m15302z0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C2962c.m13403c().m13408c(m15302z0).m13407b(j10).m13406a());
        }
        m15285o1(aVar, map);
        aVar.m13398e(m15239H0());
        aVar.m13397d(m15236E0());
        aVar.m13396c(this.f14455r.get());
        return aVar.m13395b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public /* synthetic */ C2960a m15263a1(String str, final Map map, final C2960a.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C2960a) m15295t1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: i2.p
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                C2960a m15262Z0;
                m15262Z0 = C3494m0.this.m15262Z0(map, aVar, (Cursor) obj);
                return m15262Z0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public /* synthetic */ Object m15264b1(List list, AbstractC0020o abstractC0020o, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            AbstractC0014i.a mo100k = AbstractC0014i.m130a().mo99j(cursor.getString(1)).mo98i(cursor.getLong(2)).mo100k(cursor.getLong(3));
            if (z10) {
                mo100k.mo97h(new C0013h(m15291r1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                mo100k.mo97h(new C0013h(m15291r1(cursor.getString(4)), m15287p1(j10)));
            }
            if (!cursor.isNull(6)) {
                mo100k.mo96g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC3489k.m15233a(j10, abstractC0020o, mo100k.mo93d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public static /* synthetic */ Object m15265c1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public /* synthetic */ Long m15266d1(AbstractC0014i abstractC0014i, AbstractC0020o abstractC0020o, SQLiteDatabase sQLiteDatabase) {
        if (m15241K0()) {
            mo15201c(1L, C2962c.b.CACHE_FULL, abstractC0014i.mo91j());
            return -1L;
        }
        long m15235B0 = m15235B0(sQLiteDatabase, abstractC0020o);
        int mo15188e = this.f14454q.mo15188e();
        byte[] m128a = abstractC0014i.mo89e().m128a();
        boolean z10 = m128a.length <= mo15188e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m15235B0));
        contentValues.put("transport_name", abstractC0014i.mo91j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC0014i.mo90f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC0014i.mo92k()));
        contentValues.put("payload_encoding", abstractC0014i.mo89e().m129b().m20617a());
        contentValues.put("code", abstractC0014i.mo88d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? m128a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(m128a.length / mo15188e);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(m128a, (i10 - 1) * mo15188e, Math.min(i10 * mo15188e, m128a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC0014i.m134i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public static /* synthetic */ byte[] m15268e1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ Object m15269f1(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo15201c(cursor.getInt(0), C2962c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ Object m15270g1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m15295t1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: i2.g0
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Object m15269f1;
                m15269f1 = C3494m0.this.m15269f1((Cursor) obj);
                return m15269f1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public static /* synthetic */ Boolean m15271h1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public static /* synthetic */ Object m15272i1(String str, C2962c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m15295t1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo13409b())}), new b() { // from class: i2.x
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Boolean m15271h1;
                m15271h1 = C3494m0.m15271h1((Cursor) obj);
                return m15271h1;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.mo13409b()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo13409b())});
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public static /* synthetic */ Object m15274j1(long j10, AbstractC0020o abstractC0020o, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC0020o.mo112b(), String.valueOf(C3869a.m16471a(abstractC0020o.mo114d()))}) < 1) {
            contentValues.put("backend_name", abstractC0020o.mo112b());
            contentValues.put("priority", Integer.valueOf(C3869a.m16471a(abstractC0020o.mo114d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ Object m15276k1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f14452o.mo15955a()).execute();
        return null;
    }

    /* renamed from: l1 */
    private List<AbstractC3489k> m15279l1(SQLiteDatabase sQLiteDatabase, final AbstractC0020o abstractC0020o, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long m15240I0 = m15240I0(sQLiteDatabase, abstractC0020o);
        if (m15240I0 == null) {
            return arrayList;
        }
        m15295t1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m15240I0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: i2.o
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Object m15264b1;
                m15264b1 = C3494m0.this.m15264b1(arrayList, abstractC0020o, (Cursor) obj);
                return m15264b1;
            }
        });
        return arrayList;
    }

    /* renamed from: m1 */
    private Map<Long, Set<c>> m15281m1(SQLiteDatabase sQLiteDatabase, List<AbstractC3489k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).mo15198c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m15295t1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: i2.r
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Object m15265c1;
                m15265c1 = C3494m0.m15265c1(hashMap, (Cursor) obj);
                return m15265c1;
            }
        });
        return hashMap;
    }

    /* renamed from: n1 */
    private static byte[] m15283n1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: o1 */
    private void m15285o1(C2960a.a aVar, Map<String, List<C2962c>> map) {
        for (Map.Entry<String, List<C2962c>> entry : map.entrySet()) {
            aVar.m13394a(C2963d.m13410c().m13415c(entry.getKey()).m13414b(entry.getValue()).m13413a());
        }
    }

    /* renamed from: p1 */
    private byte[] m15287p1(long j10) {
        return (byte[]) m15295t1(m15304D0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: i2.s
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                byte[] m15268e1;
                m15268e1 = C3494m0.m15268e1((Cursor) obj);
                return m15268e1;
            }
        });
    }

    /* renamed from: q1 */
    private <T> T m15289q1(d<T> dVar, b<Throwable, T> bVar) {
        long mo15955a = this.f14453p.mo15955a();
        while (true) {
            try {
                return dVar.mo15203a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f14453p.mo15955a() >= this.f14454q.mo15185b() + mo15955a) {
                    return bVar.mo15196a(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: r1 */
    private static C5593b m15291r1(String str) {
        if (str == null) {
            return f14450s;
        }
        return C5593b.m20616b(str);
    }

    /* renamed from: s1 */
    private static String m15293s1(Iterable<AbstractC3489k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC3489k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().mo15198c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: t1 */
    static <T> T m15295t1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.mo15196a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: z0 */
    private C2962c.b m15302z0(int i10) {
        C2962c.b bVar = C2962c.b.REASON_UNKNOWN;
        if (i10 == bVar.mo13409b()) {
            return bVar;
        }
        C2962c.b bVar2 = C2962c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.mo13409b()) {
            return bVar2;
        }
        C2962c.b bVar3 = C2962c.b.CACHE_FULL;
        if (i10 == bVar3.mo13409b()) {
            return bVar3;
        }
        C2962c.b bVar4 = C2962c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.mo13409b()) {
            return bVar4;
        }
        C2962c.b bVar5 = C2962c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.mo13409b()) {
            return bVar5;
        }
        C2962c.b bVar6 = C2962c.b.INVALID_PAYLOD;
        if (i10 == bVar6.mo13409b()) {
            return bVar6;
        }
        C2962c.b bVar7 = C2962c.b.SERVER_ERROR;
        if (i10 == bVar7.mo13409b()) {
            return bVar7;
        }
        C3061a.m13516b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    @Override // p109i2.InterfaceC3475d
    /* renamed from: A */
    public long mo15204A(AbstractC0020o abstractC0020o) {
        return ((Long) m15295t1(m15304D0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC0020o.mo112b(), String.valueOf(C3869a.m16471a(abstractC0020o.mo114d()))}), new b() { // from class: i2.u
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Long m15250R0;
                m15250R0 = C3494m0.m15250R0((Cursor) obj);
                return m15250R0;
            }
        })).longValue();
    }

    /* renamed from: C0 */
    long m15303C0() {
        return m15237F0() * m15238G0();
    }

    /* renamed from: D0 */
    SQLiteDatabase m15304D0() {
        final C3508t0 c3508t0 = this.f14451n;
        Objects.requireNonNull(c3508t0);
        return (SQLiteDatabase) m15289q1(new d() { // from class: i2.d0
            @Override // p109i2.C3494m0.d
            /* renamed from: a */
            public final Object mo15203a() {
                return C3508t0.this.getWritableDatabase();
            }
        }, new b() { // from class: i2.a0
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                SQLiteDatabase m15249Q0;
                m15249Q0 = C3494m0.m15249Q0((Throwable) obj);
                return m15249Q0;
            }
        });
    }

    @Override // p109i2.InterfaceC3475d
    /* renamed from: H */
    public AbstractC3489k mo15205H(final AbstractC0020o abstractC0020o, final AbstractC0014i abstractC0014i) {
        C3061a.m13517c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC0020o.mo114d(), abstractC0014i.mo91j(), abstractC0020o.mo112b());
        long longValue = ((Long) m15305J0(new b() { // from class: i2.j0
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Long m15266d1;
                m15266d1 = C3494m0.this.m15266d1(abstractC0014i, abstractC0020o, (SQLiteDatabase) obj);
                return m15266d1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC3489k.m15233a(longValue, abstractC0020o, abstractC0014i);
    }

    /* renamed from: J0 */
    <T> T m15305J0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase m15304D0 = m15304D0();
        m15304D0.beginTransaction();
        try {
            T mo15196a = bVar.mo15196a(m15304D0);
            m15304D0.setTransactionSuccessful();
            return mo15196a;
        } finally {
            m15304D0.endTransaction();
        }
    }

    @Override // p109i2.InterfaceC3475d
    /* renamed from: L */
    public Iterable<AbstractC0020o> mo15206L() {
        return (Iterable) m15305J0(new b() { // from class: i2.z
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                List m15257W0;
                m15257W0 = C3494m0.m15257W0((SQLiteDatabase) obj);
                return m15257W0;
            }
        });
    }

    @Override // p109i2.InterfaceC3475d
    /* renamed from: Z */
    public void mo15207Z(Iterable<AbstractC3489k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m15293s1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m15305J0(new b() { // from class: i2.m
                @Override // p109i2.C3494m0.b
                /* renamed from: a */
                public final Object mo15196a(Object obj) {
                    Object m15270g1;
                    m15270g1 = C3494m0.this.m15270g1(str, str2, (SQLiteDatabase) obj);
                    return m15270g1;
                }
            });
        }
    }

    @Override // p109i2.InterfaceC3473c
    /* renamed from: b */
    public C2960a mo15200b() {
        final C2960a.a m13388e = C2960a.m13388e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C2960a) m15305J0(new b() { // from class: i2.n
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                C2960a m15263a1;
                m15263a1 = C3494m0.this.m15263a1(str, hashMap, m13388e, (SQLiteDatabase) obj);
                return m15263a1;
            }
        });
    }

    @Override // p109i2.InterfaceC3473c
    /* renamed from: c */
    public void mo15201c(final long j10, final C2962c.b bVar, final String str) {
        m15305J0(new b() { // from class: i2.q
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Object m15272i1;
                m15272i1 = C3494m0.m15272i1(str, bVar, j10, (SQLiteDatabase) obj);
                return m15272i1;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14451n.close();
    }

    @Override // p123j2.InterfaceC3595b
    /* renamed from: e */
    public <T> T mo15306e(InterfaceC3595b.a<T> aVar) {
        SQLiteDatabase m15304D0 = m15304D0();
        m15234A0(m15304D0);
        try {
            T mo14460c = aVar.mo14460c();
            m15304D0.setTransactionSuccessful();
            return mo14460c;
        } finally {
            m15304D0.endTransaction();
        }
    }

    @Override // p109i2.InterfaceC3473c
    /* renamed from: i */
    public void mo15202i() {
        m15305J0(new b() { // from class: i2.h0
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Object m15276k1;
                m15276k1 = C3494m0.this.m15276k1((SQLiteDatabase) obj);
                return m15276k1;
            }
        });
    }

    @Override // p109i2.InterfaceC3475d
    /* renamed from: j */
    public int mo15208j() {
        final long mo15955a = this.f14452o.mo15955a() - this.f14454q.mo15186c();
        return ((Integer) m15305J0(new b() { // from class: i2.i0
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Integer m15244N0;
                m15244N0 = C3494m0.this.m15244N0(mo15955a, (SQLiteDatabase) obj);
                return m15244N0;
            }
        })).intValue();
    }

    @Override // p109i2.InterfaceC3475d
    /* renamed from: m */
    public void mo15209m(Iterable<AbstractC3489k> iterable) {
        if (iterable.iterator().hasNext()) {
            m15304D0().compileStatement("DELETE FROM events WHERE _id in " + m15293s1(iterable)).execute();
        }
    }

    @Override // p109i2.InterfaceC3475d
    /* renamed from: v */
    public Iterable<AbstractC3489k> mo15210v(final AbstractC0020o abstractC0020o) {
        return (Iterable) m15305J0(new b() { // from class: i2.k0
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                List m15261Y0;
                m15261Y0 = C3494m0.this.m15261Y0(abstractC0020o, (SQLiteDatabase) obj);
                return m15261Y0;
            }
        });
    }

    @Override // p109i2.InterfaceC3475d
    /* renamed from: w */
    public boolean mo15211w(final AbstractC0020o abstractC0020o) {
        return ((Boolean) m15305J0(new b() { // from class: i2.l0
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Boolean m15255V0;
                m15255V0 = C3494m0.this.m15255V0(abstractC0020o, (SQLiteDatabase) obj);
                return m15255V0;
            }
        })).booleanValue();
    }

    @Override // p109i2.InterfaceC3475d
    /* renamed from: y */
    public void mo15212y(final AbstractC0020o abstractC0020o, final long j10) {
        m15305J0(new b() { // from class: i2.e0
            @Override // p109i2.C3494m0.b
            /* renamed from: a */
            public final Object mo15196a(Object obj) {
                Object m15274j1;
                m15274j1 = C3494m0.m15274j1(j10, abstractC0020o, (SQLiteDatabase) obj);
                return m15274j1;
            }
        });
    }
}
