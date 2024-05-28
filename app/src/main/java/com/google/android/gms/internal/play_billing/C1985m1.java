package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.m1 */
/* loaded from: classes.dex */
public final class C1985m1 extends AbstractC1983m implements RandomAccess, InterfaceC1992n1 {

    /* renamed from: p */
    private static final C1985m1 f7742p;

    /* renamed from: q */
    @Deprecated
    public static final InterfaceC1992n1 f7743q;

    /* renamed from: o */
    private final List f7744o;

    static {
        C1985m1 c1985m1 = new C1985m1(false);
        f7742p = c1985m1;
        f7743q = c1985m1;
    }

    public C1985m1() {
        this(10);
    }

    /* renamed from: i */
    private static String m9503i(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1914c0) {
            return ((AbstractC1914c0) obj).m9278u(C1950h1.f7676b);
        }
        return C1950h1.m9380d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        m9499c();
        this.f7744o.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        m9499c();
        if (collection instanceof InterfaceC1992n1) {
            collection = ((InterfaceC1992n1) collection).mo9505d();
        }
        boolean addAll = this.f7744o.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1992n1
    /* renamed from: b */
    public final InterfaceC1992n1 mo9504b() {
        return mo9351a() ? new C1994n3(this) : this;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m9499c();
        this.f7744o.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1992n1
    /* renamed from: d */
    public final List mo9505d() {
        return Collections.unmodifiableList(this.f7744o);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i10) {
        Object obj = this.f7744o.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1914c0) {
            AbstractC1914c0 abstractC1914c0 = (AbstractC1914c0) obj;
            String m9278u = abstractC1914c0.m9278u(C1950h1.f7676b);
            if (abstractC1914c0.mo9276p()) {
                this.f7744o.set(i10, m9278u);
            }
            return m9278u;
        }
        byte[] bArr = (byte[]) obj;
        String m9380d = C1950h1.m9380d(bArr);
        if (C2064x3.m9686d(bArr)) {
            this.f7744o.set(i10, m9380d);
        }
        return m9380d;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1943g1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1943g1 mo9324g(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f7744o);
            return new C1985m1(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1992n1
    /* renamed from: h */
    public final Object mo9507h(int i10) {
        return this.f7744o.get(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m9499c();
        Object remove = this.f7744o.remove(i10);
        ((AbstractList) this).modCount++;
        return m9503i(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        m9499c();
        return m9503i(this.f7744o.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7744o.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1985m1(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.f7744o = arrayList;
    }

    private C1985m1(ArrayList arrayList) {
        super(true);
        this.f7744o = arrayList;
    }

    private C1985m1(boolean z10) {
        super(false);
        this.f7744o = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
