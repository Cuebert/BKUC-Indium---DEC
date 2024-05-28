package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1732p8;
import com.google.android.gms.internal.measurement.C1684m8;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.m8 */
/* loaded from: classes.dex */
public class C1684m8<MessageType extends AbstractC1732p8<MessageType, BuilderType>, BuilderType extends C1684m8<MessageType, BuilderType>> extends AbstractC1874y6<MessageType, BuilderType> {

    /* renamed from: n */
    private final MessageType f7010n;

    /* renamed from: o */
    protected MessageType f7011o;

    /* renamed from: p */
    protected boolean f7012p = false;

    public C1684m8(MessageType messagetype) {
        this.f7010n = messagetype;
        this.f7011o = (MessageType) messagetype.mo7884v(4, null, null);
    }

    /* renamed from: o */
    private static final void m8460o(MessageType messagetype, MessageType messagetype2) {
        C1520ca.m8011a().m8012b(messagetype.getClass()).mo8161d(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1829v9
    /* renamed from: h */
    public final /* synthetic */ InterfaceC1813u9 mo8462h() {
        return this.f7010n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC1874y6
    /* renamed from: k */
    protected final /* synthetic */ AbstractC1874y6 mo8463k(AbstractC1890z6 abstractC1890z6) {
        m8470t((AbstractC1732p8) abstractC1890z6);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1874y6
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ AbstractC1874y6 mo8464m(byte[] bArr, int i10, int i11) throws C1892z8 {
        m8471u(bArr, 0, i11, C1518c8.m8001a());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1874y6
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ AbstractC1874y6 mo8465n(byte[] bArr, int i10, int i11, C1518c8 c1518c8) throws C1892z8 {
        m8471u(bArr, 0, i11, c1518c8);
        return this;
    }

    /* renamed from: p */
    public final MessageType m8466p() {
        MessageType mo8461T = mo8461T();
        boolean z10 = true;
        byte byteValue = ((Byte) mo8461T.mo7884v(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                boolean mo8163f = C1520ca.m8011a().m8012b(mo8461T.getClass()).mo8163f(mo8461T);
                mo8461T.mo7884v(2, true != mo8163f ? null : mo8461T, null);
                z10 = mo8163f;
            }
        }
        if (z10) {
            return mo8461T;
        }
        throw new C1798ta(mo8461T);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1797t9
    /* renamed from: q */
    public MessageType mo8461T() {
        if (this.f7012p) {
            return this.f7011o;
        }
        MessageType messagetype = this.f7011o;
        C1520ca.m8011a().m8012b(messagetype.getClass()).mo8158a(messagetype);
        this.f7012p = true;
        return this.f7011o;
    }

    /* renamed from: r */
    public void m8468r() {
        MessageType messagetype = (MessageType) this.f7011o.mo7884v(4, null, null);
        m8460o(messagetype, this.f7011o);
        this.f7011o = messagetype;
    }

    /* renamed from: s */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f7010n.mo7884v(5, null, null);
        buildertype.m8470t(mo8461T());
        return buildertype;
    }

    /* renamed from: t */
    public final BuilderType m8470t(MessageType messagetype) {
        if (this.f7012p) {
            m8468r();
            this.f7012p = false;
        }
        m8460o(this.f7011o, messagetype);
        return this;
    }

    /* renamed from: u */
    public final BuilderType m8471u(byte[] bArr, int i10, int i11, C1518c8 c1518c8) throws C1892z8 {
        if (this.f7012p) {
            m8468r();
            this.f7012p = false;
        }
        try {
            C1520ca.m8011a().m8012b(this.f7011o.getClass()).mo8164g(this.f7011o, bArr, 0, i11, new C1517c7(c1518c8));
            return this;
        } catch (C1892z8 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw C1892z8.m9152f();
        }
    }
}
