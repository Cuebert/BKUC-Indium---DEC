package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p085g4.C3265m;
import p295x2.C5507b;
import p295x2.InterfaceC5518m;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes.dex */
public final class C1358g {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f6204a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C3265m<?>, Boolean> f6205b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m7520h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f6204a) {
            hashMap = new HashMap(this.f6204a);
        }
        synchronized (this.f6205b) {
            hashMap2 = new HashMap(this.f6205b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m7424e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C3265m) entry2.getKey()).m14515d(new C5507b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m7521c(BasePendingResult<? extends InterfaceC5518m> basePendingResult, boolean z10) {
        this.f6204a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.mo7421b(new C1354e(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final <TResult> void m7522d(C3265m<TResult> c3265m, boolean z10) {
        this.f6205b.put(c3265m, Boolean.valueOf(z10));
        c3265m.m14512a().mo14495b(new C1356f(this, c3265m));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m7523e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        m7520h(true, new Status(20, sb2.toString()));
    }

    /* renamed from: f */
    public final void m7524f() {
        m7520h(false, C1350c.f6164r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m7525g() {
        return (this.f6204a.isEmpty() && this.f6205b.isEmpty()) ? false : true;
    }
}
