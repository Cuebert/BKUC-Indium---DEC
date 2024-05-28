package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.cf */
/* loaded from: classes.dex */
public final class C1525cf extends AbstractC1627j {

    /* renamed from: p */
    private final Callable<Object> f6740p;

    public C1525cf(String str, Callable<Object> callable) {
        super("internal.appMetadata");
        this.f6740p = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1627j
    /* renamed from: a */
    public final InterfaceC1739q mo7931a(C1728p4 c1728p4, List<InterfaceC1739q> list) {
        try {
            return C1762r6.m8765b(this.f6740p.call());
        } catch (Exception unused) {
            return InterfaceC1739q.f7165b;
        }
    }
}
