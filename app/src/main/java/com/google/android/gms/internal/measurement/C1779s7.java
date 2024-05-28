package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.s7 */
/* loaded from: classes.dex */
public final class C1779s7 {

    /* renamed from: a */
    final Map<String, Callable<? extends AbstractC1627j>> f7231a = new HashMap();

    /* renamed from: a */
    public final void m8813a(String str, Callable<? extends AbstractC1627j> callable) {
        this.f7231a.put(str, callable);
    }
}
