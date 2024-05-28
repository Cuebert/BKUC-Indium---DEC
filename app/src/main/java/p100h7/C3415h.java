package p100h7;

import com.roblox.client.C2877p0;
import p020b6.C1055f;
import p100h7.C3409b;
import p114i7.InterfaceC3542c;

/* renamed from: h7.h */
/* loaded from: classes.dex */
public class C3415h implements InterfaceC3413f {
    @Override // p100h7.InterfaceC3413f
    /* renamed from: a */
    public AsyncTaskC3411d mo15023a(String str, InterfaceC3542c interfaceC3542c, C3409b.a[] aVarArr, InterfaceC3419l interfaceC3419l) {
        return new AsyncTaskC3411d(str, new C1055f().m6313s(interfaceC3542c), C2877p0.m12880O(), interfaceC3419l, aVarArr);
    }

    @Override // p100h7.InterfaceC3413f
    /* renamed from: b */
    public AsyncTaskC3410c mo15024b(String str, C3409b.a[] aVarArr, InterfaceC3419l interfaceC3419l) {
        return new AsyncTaskC3410c(str, interfaceC3419l, aVarArr);
    }
}
