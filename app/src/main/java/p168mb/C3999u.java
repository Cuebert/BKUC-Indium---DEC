package p168mb;

import com.appsflyer.oaid.BuildConfig;
import p145kb.AbstractC3781d1;
import p145kb.InterfaceC3777c0;
import p253ta.C4746c;
import va.InterfaceC5001e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mb.u */
/* loaded from: classes.dex */
public final class C3999u extends AbstractC3781d1 implements InterfaceC3777c0 {

    /* renamed from: p */
    private final Throwable f16414p;

    /* renamed from: q */
    private final String f16415q;

    public C3999u(Throwable th, String str) {
        this.f16414p = th;
        this.f16415q = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1 == null) goto L8;
     */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void m16807p0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f16414p
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f16415q
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f16414p
            r1.<init>(r0, r2)
            throw r1
        L36:
            p168mb.C3998t.m16805d()
            ta.c r0 = new ta.c
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p168mb.C3999u.m16807p0():java.lang.Void");
    }

    @Override // p145kb.AbstractC3826v
    /* renamed from: k0 */
    public boolean mo16205k0(InterfaceC5001e interfaceC5001e) {
        m16807p0();
        throw new C4746c();
    }

    @Override // p145kb.AbstractC3781d1
    /* renamed from: m0 */
    public AbstractC3781d1 mo16122m0() {
        return this;
    }

    @Override // p145kb.AbstractC3826v
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public Void mo16197j0(InterfaceC5001e interfaceC5001e, Runnable runnable) {
        m16807p0();
        throw new C4746c();
    }

    @Override // p145kb.AbstractC3781d1, p145kb.AbstractC3826v
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f16414p != null) {
            str = ", cause=" + this.f16414p;
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
