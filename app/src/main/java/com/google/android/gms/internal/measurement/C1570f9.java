package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f9 */
/* loaded from: classes.dex */
final class C1570f9 extends AbstractC1604h9 {

    /* renamed from: c */
    private static final Class<?> f6793c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C1570f9(C1553e9 c1553e9) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1604h9
    /* renamed from: a */
    public final void mo8156a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) C1555eb.m8110k(obj, j10);
        if (list instanceof InterfaceC1536d9) {
            unmodifiableList = ((InterfaceC1536d9) list).mo8005b();
        } else {
            if (f6793c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1503ba) && (list instanceof InterfaceC1844w8)) {
                InterfaceC1844w8 interfaceC1844w8 = (InterfaceC1844w8) list;
                if (interfaceC1844w8.mo7888a()) {
                    interfaceC1844w8.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C1555eb.m8123x(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC1604h9
    /* renamed from: b */
    public final <E> void mo8157b(Object obj, Object obj2, long j10) {
        C1519c9 c1519c9;
        List list = (List) C1555eb.m8110k(obj2, j10);
        int size = list.size();
        List list2 = (List) C1555eb.m8110k(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC1536d9) {
                list2 = new C1519c9(size);
            } else if ((list2 instanceof InterfaceC1503ba) && (list2 instanceof InterfaceC1844w8)) {
                list2 = ((InterfaceC1844w8) list2).mo8008g(size);
            } else {
                list2 = new ArrayList(size);
            }
            C1555eb.m8123x(obj, j10, list2);
        } else {
            if (f6793c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                C1555eb.m8123x(obj, j10, arrayList);
                c1519c9 = arrayList;
            } else if (list2 instanceof C1894za) {
                C1519c9 c1519c92 = new C1519c9(list2.size() + size);
                c1519c92.addAll(c1519c92.size(), (C1894za) list2);
                C1555eb.m8123x(obj, j10, c1519c92);
                c1519c9 = c1519c92;
            } else if ((list2 instanceof InterfaceC1503ba) && (list2 instanceof InterfaceC1844w8)) {
                InterfaceC1844w8 interfaceC1844w8 = (InterfaceC1844w8) list2;
                if (!interfaceC1844w8.mo7888a()) {
                    list2 = interfaceC1844w8.mo8008g(list2.size() + size);
                    C1555eb.m8123x(obj, j10, list2);
                }
            }
            list2 = c1519c9;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        C1555eb.m8123x(obj, j10, list);
    }
}
