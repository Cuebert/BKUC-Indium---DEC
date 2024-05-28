package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.p5 */
/* loaded from: classes.dex */
public final class C1729p5 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C1761r5 f7143a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729p5(C1761r5 c1761r5, Handler handler) {
        super(null);
        this.f7143a = c1761r5;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f7143a.m8763f();
    }
}
