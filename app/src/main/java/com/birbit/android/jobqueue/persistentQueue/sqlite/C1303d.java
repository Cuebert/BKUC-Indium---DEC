package com.birbit.android.jobqueue.persistentQueue.sqlite;

import com.birbit.android.jobqueue.C1290c;
import com.birbit.android.jobqueue.persistentQueue.sqlite.C1301b;
import java.util.Collection;
import java.util.Iterator;
import p093h0.C3360e;
import p183o1.EnumC4121g;

/* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.d */
/* loaded from: classes.dex */
class C1303d {

    /* renamed from: a */
    private final C3360e<Long, C1302c> f5908a = new a(15);

    /* renamed from: b */
    private final String f5909b;

    /* renamed from: com.birbit.android.jobqueue.persistentQueue.sqlite.d$a */
    /* loaded from: classes.dex */
    class a extends C3360e<Long, C1302c> {
        a(int i10) {
            super(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p093h0.C3360e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo7183b(boolean z10, Long l10, C1302c c1302c, C1302c c1302c2) {
            c1302c.m7171b();
        }
    }

    public C1303d(long j10) {
        this.f5909b = Long.toString(j10);
    }

    /* renamed from: b */
    private long m7178b(C1290c c1290c, Collection<String> collection) {
        return ((c1290c.m7003h() == null ? 1 : 0) << 23) | ((c1290c.m7014s() ? 1 : 0) << 0) | ((c1290c.m7015t() ? 1 : 0) << 1) | ((c1290c.m7001f() == null ? 2 : c1290c.m7001f().ordinal()) << 2) | (c1290c.m7002g().size() << 4) | (c1290c.m6998c().size() << 10) | (c1290c.m6999d().size() << 16) | ((c1290c.m6997b() ? 1 : 0) << 22) | (collection.size() << 24);
    }

    /* renamed from: c */
    private C1302c m7179c(long j10, C1290c c1290c, Collection<String> collection, StringBuilder sb2) {
        int i10;
        int i11 = 0;
        sb2.setLength(0);
        sb2.append("1");
        int i12 = -1;
        if (c1290c.m7014s()) {
            sb2.append(" AND ");
            sb2.append(C1300a.f5866w.f5893a);
            sb2.append(" <= ?");
            i11 = 1;
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (c1290c.m7015t()) {
            sb2.append(" AND ");
            sb2.append(C1300a.f5867x.f5893a);
            sb2.append(" <= ?");
            i12 = i11;
            i11++;
        }
        if (c1290c.m7003h() != null) {
            sb2.append(" AND ");
            sb2.append(C1300a.f5864u.f5893a);
            sb2.append(" <= ?");
            i11++;
        }
        if (c1290c.m7001f() != null) {
            if (c1290c.m7002g().isEmpty()) {
                sb2.append(" AND 0 ");
            } else {
                sb2.append(" AND ");
                sb2.append(C1300a.f5858o.f5893a);
                sb2.append(" IN ( SELECT ");
                C1301b.c cVar = C1300a.f5869z;
                sb2.append(cVar.f5893a);
                sb2.append(" FROM ");
                sb2.append("job_holder_tags");
                sb2.append(" WHERE ");
                sb2.append(C1300a.f5856A.f5893a);
                sb2.append(" IN (");
                C1301b.m7156a(sb2, c1290c.m7002g().size());
                sb2.append(")");
                if (c1290c.m7001f() == EnumC4121g.ANY) {
                    sb2.append(")");
                } else if (c1290c.m7001f() == EnumC4121g.ALL) {
                    sb2.append(" GROUP BY (`");
                    sb2.append(cVar.f5893a);
                    sb2.append("`)");
                    sb2.append(" HAVING count(*) = ");
                    sb2.append(c1290c.m7002g().size());
                    sb2.append(")");
                } else {
                    throw new IllegalArgumentException("unknown constraint " + c1290c);
                }
                i11 += c1290c.m7002g().size();
            }
        }
        if (!c1290c.m6998c().isEmpty()) {
            sb2.append(" AND (");
            C1301b.c cVar2 = C1300a.f5860q;
            sb2.append(cVar2.f5893a);
            sb2.append(" IS NULL OR ");
            sb2.append(cVar2.f5893a);
            sb2.append(" NOT IN(");
            C1301b.m7156a(sb2, c1290c.m6998c().size());
            sb2.append("))");
            i11 += c1290c.m6998c().size();
        }
        if (!c1290c.m6999d().isEmpty()) {
            sb2.append(" AND ");
            sb2.append(C1300a.f5858o.f5893a);
            sb2.append(" NOT IN(");
            C1301b.m7156a(sb2, c1290c.m6999d().size());
            sb2.append(")");
            i11 += c1290c.m6999d().size();
        }
        if (!collection.isEmpty()) {
            sb2.append(" AND ");
            sb2.append(C1300a.f5858o.f5893a);
            sb2.append(" NOT IN(");
            C1301b.m7156a(sb2, collection.size());
            sb2.append(")");
            i11 += collection.size();
        }
        if (c1290c.m6997b()) {
            sb2.append(" AND ");
            sb2.append(C1300a.f5865v.f5893a);
            sb2.append(" != ?");
            i11++;
        }
        C1302c c1302c = new C1302c(j10, sb2.toString(), new String[i11]);
        c1302c.m7176g(i10);
        c1302c.m7177h(i12);
        return c1302c;
    }

    /* renamed from: d */
    private void m7180d(C1290c c1290c, C1302c c1302c, Collection<String> collection) {
        int i10 = 0;
        if (c1290c.m7014s()) {
            c1302c.f5900c[0] = Long.toString(c1290c.m7000e());
            i10 = 1;
        }
        if (c1290c.m7015t()) {
            c1302c.f5900c[i10] = Long.toString(c1290c.m7000e());
            i10++;
        }
        if (c1290c.m7003h() != null) {
            c1302c.f5900c[i10] = Long.toString(c1290c.m7003h().longValue());
            i10++;
        }
        if (c1290c.m7001f() != null) {
            Iterator<String> it = c1290c.m7002g().iterator();
            while (it.hasNext()) {
                c1302c.f5900c[i10] = it.next();
                i10++;
            }
        }
        Iterator<String> it2 = c1290c.m6998c().iterator();
        while (it2.hasNext()) {
            c1302c.f5900c[i10] = it2.next();
            i10++;
        }
        Iterator<String> it3 = c1290c.m6999d().iterator();
        while (it3.hasNext()) {
            c1302c.f5900c[i10] = it3.next();
            i10++;
        }
        Iterator<String> it4 = collection.iterator();
        while (it4.hasNext()) {
            c1302c.f5900c[i10] = it4.next();
            i10++;
        }
        if (c1290c.m6997b()) {
            c1302c.f5900c[i10] = this.f5909b;
            i10++;
        }
        if (i10 == c1302c.f5900c.length) {
            return;
        }
        throw new IllegalStateException("something is wrong with where query cache for " + c1302c.f5899b);
    }

    /* renamed from: e */
    private boolean m7181e(C1290c c1290c) {
        return c1290c.m7002g().size() < 64 && c1290c.m6998c().size() < 64 && c1290c.m6999d().size() < 64;
    }

    /* renamed from: a */
    public C1302c m7182a(C1290c c1290c, Collection<String> collection, StringBuilder sb2) {
        boolean m7181e = m7181e(c1290c);
        long m7178b = m7178b(c1290c, collection);
        C1302c m14815c = m7181e ? this.f5908a.m14815c(Long.valueOf(m7178b)) : null;
        if (m14815c == null) {
            m14815c = m7179c(m7178b, c1290c, collection, sb2);
            if (m7181e) {
                this.f5908a.m14816d(Long.valueOf(m7178b), m14815c);
            }
        }
        m7180d(c1290c, m14815c, collection);
        return m14815c;
    }
}
