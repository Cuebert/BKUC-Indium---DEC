package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.p */
/* loaded from: classes.dex */
abstract class AbstractBinderC1417p extends AbstractBinderC1415n {

    /* renamed from: e */
    private static final WeakReference f6401e = new WeakReference(null);

    /* renamed from: d */
    private WeakReference f6402d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC1417p(byte[] bArr) {
        super(bArr);
        this.f6402d = f6401e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC1415n
    /* renamed from: J0 */
    public final byte[] mo7731J0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f6402d.get();
            if (bArr == null) {
                bArr = mo7729K0();
                this.f6402d = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: K0 */
    protected abstract byte[] mo7729K0();
}
