package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;

/* renamed from: com.google.android.gms.internal.play_billing.c */
/* loaded from: classes.dex */
final class C1913c extends AbstractC2024r5 {

    /* renamed from: q */
    final /* synthetic */ C1920d f7633q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1913c(C1920d c1920d) {
        this.f7633q = c1920d;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.f7633q.f7644r;
        C1968j5.m9470a(i10, i11, "index");
        C1920d c1920d = this.f7633q;
        objArr = c1920d.f7643q;
        int i12 = i10 + i10;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = c1920d.f7643q;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: m */
    public final boolean mo9240m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.f7633q.f7644r;
        return i10;
    }
}
