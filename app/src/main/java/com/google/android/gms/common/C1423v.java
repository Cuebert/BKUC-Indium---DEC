package com.google.android.gms.common;

import java.util.concurrent.Callable;
import p282w2.C5112j;

/* renamed from: com.google.android.gms.common.v */
/* loaded from: classes.dex */
final class C1423v extends C1424w {

    /* renamed from: f */
    private final Callable f6411f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1423v(Callable callable, C5112j c5112j) {
        super();
        this.f6411f = callable;
    }

    @Override // com.google.android.gms.common.C1424w
    /* renamed from: a */
    final String mo7742a() {
        try {
            return (String) this.f6411f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
