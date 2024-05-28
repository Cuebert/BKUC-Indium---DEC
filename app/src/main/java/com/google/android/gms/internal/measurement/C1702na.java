package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.na */
/* loaded from: classes.dex */
final class C1702na implements Iterator<Map.Entry> {

    /* renamed from: n */
    private int f7100n = -1;

    /* renamed from: o */
    private boolean f7101o;

    /* renamed from: p */
    private Iterator<Map.Entry> f7102p;

    /* renamed from: q */
    final /* synthetic */ C1734pa f7103q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1702na(C1734pa c1734pa, C1622ia c1622ia) {
        this.f7103q = c1734pa;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m8625a() {
        Map map;
        if (this.f7102p == null) {
            map = this.f7103q.f7152p;
            this.f7102p = map.entrySet().iterator();
        }
        return this.f7102p;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i10 = this.f7100n + 1;
        list = this.f7103q.f7151o;
        if (i10 < list.size()) {
            return true;
        }
        map = this.f7103q.f7152p;
        return !map.isEmpty() && m8625a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        List list;
        List list2;
        this.f7101o = true;
        int i10 = this.f7100n + 1;
        this.f7100n = i10;
        list = this.f7103q.f7151o;
        if (i10 < list.size()) {
            list2 = this.f7103q.f7151o;
            return (Map.Entry) list2.get(this.f7100n);
        }
        return m8625a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f7101o) {
            this.f7101o = false;
            this.f7103q.m8693n();
            int i10 = this.f7100n;
            list = this.f7103q.f7151o;
            if (i10 < list.size()) {
                C1734pa c1734pa = this.f7103q;
                int i11 = this.f7100n;
                this.f7100n = i11 - 1;
                c1734pa.m8691l(i11);
                return;
            }
            m8625a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
