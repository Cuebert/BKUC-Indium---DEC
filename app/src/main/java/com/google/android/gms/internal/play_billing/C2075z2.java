package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.play_billing.z2 */
/* loaded from: classes.dex */
final class C2075z2 implements Iterator {

    /* renamed from: n */
    private int f7915n = -1;

    /* renamed from: o */
    private boolean f7916o;

    /* renamed from: p */
    private Iterator f7917p;

    /* renamed from: q */
    final /* synthetic */ C1931e3 f7918q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2075z2(C1931e3 c1931e3, C2069y2 c2069y2) {
        this.f7918q = c1931e3;
    }

    /* renamed from: a */
    private final Iterator m9706a() {
        Map map;
        if (this.f7917p == null) {
            map = this.f7918q.f7656p;
            this.f7917p = map.entrySet().iterator();
        }
        return this.f7917p;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i10 = this.f7915n + 1;
        list = this.f7918q.f7655o;
        if (i10 < list.size()) {
            return true;
        }
        map = this.f7918q.f7656p;
        return !map.isEmpty() && m9706a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.f7916o = true;
        int i10 = this.f7915n + 1;
        this.f7915n = i10;
        list = this.f7918q.f7655o;
        if (i10 < list.size()) {
            list2 = this.f7918q.f7655o;
            return (Map.Entry) list2.get(this.f7915n);
        }
        return (Map.Entry) m9706a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f7916o) {
            this.f7916o = false;
            this.f7918q.m9335n();
            int i10 = this.f7915n;
            list = this.f7918q.f7655o;
            if (i10 < list.size()) {
                C1931e3 c1931e3 = this.f7918q;
                int i11 = this.f7915n;
                this.f7915n = i11 - 1;
                c1931e3.m9333l(i11);
                return;
            }
            m9706a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
