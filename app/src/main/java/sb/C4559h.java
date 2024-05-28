package sb;

import ac.InterfaceC0075e;
import p193ob.AbstractC4183j0;
import p193ob.C4167b0;

/* renamed from: sb.h */
/* loaded from: classes.dex */
public final class C4559h extends AbstractC4183j0 {

    /* renamed from: o */
    private final String f18325o;

    /* renamed from: p */
    private final long f18326p;

    /* renamed from: q */
    private final InterfaceC0075e f18327q;

    public C4559h(String str, long j10, InterfaceC0075e interfaceC0075e) {
        this.f18325o = str;
        this.f18326p = j10;
        this.f18327q = interfaceC0075e;
    }

    @Override // p193ob.AbstractC4183j0
    /* renamed from: Q */
    public InterfaceC0075e mo14678Q() {
        return this.f18327q;
    }

    @Override // p193ob.AbstractC4183j0
    /* renamed from: i */
    public long mo14680i() {
        return this.f18326p;
    }

    @Override // p193ob.AbstractC4183j0
    /* renamed from: l */
    public C4167b0 mo14681l() {
        String str = this.f18325o;
        if (str != null) {
            return C4167b0.m17279d(str);
        }
        return null;
    }
}
