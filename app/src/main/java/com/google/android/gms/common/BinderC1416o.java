package com.google.android.gms.common;

import java.util.Arrays;

/* renamed from: com.google.android.gms.common.o */
/* loaded from: classes.dex */
final class BinderC1416o extends AbstractBinderC1415n {

    /* renamed from: d */
    private final byte[] f6400d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC1416o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f6400d = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC1415n
    /* renamed from: J0 */
    public final byte[] mo7731J0() {
        return this.f6400d;
    }
}
