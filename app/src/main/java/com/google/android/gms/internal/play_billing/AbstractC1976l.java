package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.AbstractC1969k;
import com.google.android.gms.internal.play_billing.AbstractC1976l;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.play_billing.l */
/* loaded from: classes.dex */
public abstract class AbstractC1976l<MessageType extends AbstractC1976l<MessageType, BuilderType>, BuilderType extends AbstractC1969k<MessageType, BuilderType>> implements InterfaceC1944g2 {
    protected int zza = 0;

    /* renamed from: c */
    public int mo9298c(InterfaceC2014q2 interfaceC2014q2) {
        throw null;
    }

    /* renamed from: d */
    public final byte[] m9488d() {
        try {
            int mo9297b = mo9297b();
            byte[] bArr = new byte[mo9297b];
            AbstractC1970k0 m9475A = AbstractC1970k0.m9475A(bArr, 0, mo9297b);
            mo9296a(m9475A);
            m9475A.m9483a();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1944g2
    public final AbstractC1914c0 zzb() {
        try {
            int mo9297b = mo9297b();
            AbstractC1914c0 abstractC1914c0 = AbstractC1914c0.f7634o;
            byte[] bArr = new byte[mo9297b];
            AbstractC1970k0 m9475A = AbstractC1970k0.m9475A(bArr, 0, mo9297b);
            mo9296a(m9475A);
            m9475A.m9483a();
            return new C2066y(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
