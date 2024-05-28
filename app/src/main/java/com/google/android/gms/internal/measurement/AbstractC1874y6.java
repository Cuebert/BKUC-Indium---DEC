package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1874y6;
import com.google.android.gms.internal.measurement.AbstractC1890z6;

/* renamed from: com.google.android.gms.internal.measurement.y6 */
/* loaded from: classes.dex */
public abstract class AbstractC1874y6<MessageType extends AbstractC1890z6<MessageType, BuilderType>, BuilderType extends AbstractC1874y6<MessageType, BuilderType>> implements InterfaceC1797t9 {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1797t9
    /* renamed from: O */
    public final /* synthetic */ InterfaceC1797t9 mo8848O(byte[] bArr) throws C1892z8 {
        return mo8464m(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1797t9
    /* renamed from: Q */
    public final /* synthetic */ InterfaceC1797t9 mo8849Q(byte[] bArr, C1518c8 c1518c8) throws C1892z8 {
        return mo8465n(bArr, 0, bArr.length, c1518c8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1797t9
    /* renamed from: X */
    public final /* bridge */ /* synthetic */ InterfaceC1797t9 mo8850X(InterfaceC1813u9 interfaceC1813u9) {
        if (mo8462h().getClass().isInstance(interfaceC1813u9)) {
            return mo8463k((AbstractC1890z6) interfaceC1813u9);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: k */
    protected abstract BuilderType mo8463k(MessageType messagetype);

    /* renamed from: m */
    public abstract BuilderType mo8464m(byte[] bArr, int i10, int i11) throws C1892z8;

    /* renamed from: n */
    public abstract BuilderType mo8465n(byte[] bArr, int i10, int i11, C1518c8 c1518c8) throws C1892z8;
}
