package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.k5 */
/* loaded from: classes.dex */
public final class C1649k5 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1649k5(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = C1665l5.f6965e;
        atomicBoolean.set(true);
    }
}
