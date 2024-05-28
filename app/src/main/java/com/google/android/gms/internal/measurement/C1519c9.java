package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.c9 */
/* loaded from: classes.dex */
public final class C1519c9 extends AbstractC1483a7<String> implements RandomAccess, InterfaceC1536d9 {

    /* renamed from: p */
    private static final C1519c9 f6730p;

    /* renamed from: q */
    public static final InterfaceC1536d9 f6731q;

    /* renamed from: o */
    private final List<Object> f6732o;

    static {
        C1519c9 c1519c9 = new C1519c9(10);
        f6730p = c1519c9;
        c1519c9.zzb();
        f6731q = c1519c9;
    }

    public C1519c9() {
        this(10);
    }

    /* renamed from: i */
    private static String m8004i(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1731p7) {
            return ((AbstractC1731p7) obj).m8666v(C1860x8.f7292b);
        }
        return C1860x8.m9012h((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        m7889c();
        this.f6732o.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        m7889c();
        if (collection instanceof InterfaceC1536d9) {
            collection = ((InterfaceC1536d9) collection).mo8006d();
        }
        boolean addAll = this.f6732o.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1536d9
    /* renamed from: b */
    public final InterfaceC1536d9 mo8005b() {
        return mo7888a() ? new C1894za(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m7889c();
        this.f6732o.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1536d9
    /* renamed from: d */
    public final List<?> mo8006d() {
        return Collections.unmodifiableList(this.f6732o);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i10) {
        Object obj = this.f6732o.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1731p7) {
            AbstractC1731p7 abstractC1731p7 = (AbstractC1731p7) obj;
            String m8666v = abstractC1731p7.m8666v(C1860x8.f7292b);
            if (abstractC1731p7.mo8617p()) {
                this.f6732o.set(i10, m8666v);
            }
            return m8666v;
        }
        byte[] bArr = (byte[]) obj;
        String m9012h = C1860x8.m9012h(bArr);
        if (C1860x8.m9013i(bArr)) {
            this.f6732o.set(i10, m9012h);
        }
        return m9012h;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1844w8
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1844w8 mo8008g(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f6732o);
            return new C1519c9((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1536d9
    /* renamed from: h */
    public final Object mo8009h(int i10) {
        return this.f6732o.get(i10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1536d9
    /* renamed from: j */
    public final void mo8010j(AbstractC1731p7 abstractC1731p7) {
        m7889c();
        this.f6732o.add(abstractC1731p7);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m7889c();
        Object remove = this.f6732o.remove(i10);
        ((AbstractList) this).modCount++;
        return m8004i(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        m7889c();
        return m8004i(this.f6732o.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6732o.size();
    }

    public C1519c9(int i10) {
        this.f6732o = new ArrayList(i10);
    }

    private C1519c9(ArrayList<Object> arrayList) {
        this.f6732o = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
