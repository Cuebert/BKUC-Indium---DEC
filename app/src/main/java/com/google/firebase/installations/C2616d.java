package com.google.firebase.installations;

import p085g4.C3265m;
import p285w5.AbstractC5461d;

/* renamed from: com.google.firebase.installations.d */
/* loaded from: classes.dex */
class C2616d implements InterfaceC2617e {

    /* renamed from: a */
    final C3265m<String> f10269a;

    public C2616d(C3265m<String> c3265m) {
        this.f10269a = c3265m;
    }

    @Override // com.google.firebase.installations.InterfaceC2617e
    /* renamed from: a */
    public boolean mo12027a(AbstractC5461d abstractC5461d) {
        if (!abstractC5461d.m20081l() && !abstractC5461d.m20080k() && !abstractC5461d.m20078i()) {
            return false;
        }
        this.f10269a.m14516e(abstractC5461d.mo20051d());
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC2617e
    /* renamed from: b */
    public boolean mo12028b(Exception exc) {
        return false;
    }
}
