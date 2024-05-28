package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.p1 */
/* loaded from: classes.dex */
final class C2006p1 extends AbstractC2034t1 {

    /* renamed from: c */
    private static final Class f7764c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C2006p1(C1999o1 c1999o1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2034t1
    /* renamed from: a */
    public final void mo9539a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) C2029s3.m9627k(obj, j10);
        if (list instanceof InterfaceC1992n1) {
            unmodifiableList = ((InterfaceC1992n1) list).mo9504b();
        } else {
            if (f7764c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1993n2) && (list instanceof InterfaceC1943g1)) {
                InterfaceC1943g1 interfaceC1943g1 = (InterfaceC1943g1) list;
                if (interfaceC1943g1.mo9351a()) {
                    interfaceC1943g1.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C2029s3.m9640x(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2034t1
    /* renamed from: b */
    public final void mo9540b(Object obj, Object obj2, long j10) {
        C1985m1 c1985m1;
        List list = (List) C2029s3.m9627k(obj2, j10);
        int size = list.size();
        List list2 = (List) C2029s3.m9627k(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC1992n1) {
                list2 = new C1985m1(size);
            } else if ((list2 instanceof InterfaceC1993n2) && (list2 instanceof InterfaceC1943g1)) {
                list2 = ((InterfaceC1943g1) list2).mo9324g(size);
            } else {
                list2 = new ArrayList(size);
            }
            C2029s3.m9640x(obj, j10, list2);
        } else {
            if (f7764c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                C2029s3.m9640x(obj, j10, arrayList);
                c1985m1 = arrayList;
            } else if (list2 instanceof C1994n3) {
                C1985m1 c1985m12 = new C1985m1(list2.size() + size);
                c1985m12.addAll(c1985m12.size(), (C1994n3) list2);
                C2029s3.m9640x(obj, j10, c1985m12);
                c1985m1 = c1985m12;
            } else if ((list2 instanceof InterfaceC1993n2) && (list2 instanceof InterfaceC1943g1)) {
                InterfaceC1943g1 interfaceC1943g1 = (InterfaceC1943g1) list2;
                if (!interfaceC1943g1.mo9351a()) {
                    list2 = interfaceC1943g1.mo9324g(list2.size() + size);
                    C2029s3.m9640x(obj, j10, list2);
                }
            }
            list2 = c1985m1;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        C2029s3.m9640x(obj, j10, list);
    }
}
