package p183o1;

import com.birbit.android.jobqueue.timer.Timer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import p233s1.C4516a;

/* renamed from: o1.f */
/* loaded from: classes.dex */
public class C4120f {

    /* renamed from: a */
    private ArrayList<String> f16808a;

    /* renamed from: b */
    private final TreeSet<String> f16809b = new TreeSet<>();

    /* renamed from: c */
    private final Map<String, Long> f16810c = new HashMap();

    /* renamed from: d */
    private long f16811d = Long.MAX_VALUE;

    /* renamed from: e */
    private final Timer f16812e;

    public C4120f(Timer timer) {
        this.f16812e = timer;
    }

    /* renamed from: c */
    private long m17114c() {
        long j10 = Long.MAX_VALUE;
        for (Long l10 : this.f16810c.values()) {
            if (l10.longValue() < j10) {
                j10 = l10.longValue();
            }
        }
        return j10;
    }

    /* renamed from: a */
    public synchronized void m17115a(String str) {
        if (str == null) {
            return;
        }
        if (this.f16809b.add(str)) {
            this.f16808a = null;
        }
    }

    /* renamed from: b */
    public synchronized void m17116b(String str, long j10) {
        C4516a.m18533b("add group delay to %s until %s", str, Long.valueOf(j10));
        Long l10 = this.f16810c.get(str);
        if (l10 == null || l10.longValue() <= j10) {
            this.f16810c.put(str, Long.valueOf(j10));
            this.f16811d = m17114c();
            this.f16808a = null;
        }
    }

    /* renamed from: d */
    public Long m17117d() {
        long j10 = this.f16811d;
        if (j10 == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j10);
    }

    /* renamed from: e */
    public synchronized Collection<String> m17118e() {
        long nanoTime = this.f16812e.nanoTime();
        if (this.f16808a == null || nanoTime > this.f16811d) {
            if (this.f16810c.isEmpty()) {
                this.f16808a = new ArrayList<>(this.f16809b);
                this.f16811d = Long.MAX_VALUE;
            } else {
                TreeSet treeSet = new TreeSet((SortedSet) this.f16809b);
                Iterator<Map.Entry<String, Long>> it = this.f16810c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Long> next = it.next();
                    if (next.getValue().longValue() > nanoTime) {
                        if (!treeSet.contains(next.getKey())) {
                            treeSet.add(next.getKey());
                        }
                    } else {
                        it.remove();
                    }
                }
                this.f16808a = new ArrayList<>(treeSet);
                this.f16811d = m17114c();
            }
        }
        return this.f16808a;
    }

    /* renamed from: f */
    public synchronized void m17119f(String str) {
        if (str == null) {
            return;
        }
        if (this.f16809b.remove(str)) {
            this.f16808a = null;
        }
    }
}
