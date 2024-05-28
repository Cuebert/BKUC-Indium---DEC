package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import p087g6.C3290d;
import p087g6.C3298i;
import p126j5.C3617d;
import p126j5.C3631q;
import p126j5.InterfaceC3619e;
import p126j5.InterfaceC3622h;
import p126j5.InterfaceC3623i;
import p127j6.C3644d;
import p283w3.AbstractC5144c1;

/* loaded from: classes.dex */
public class BarcodeRegistrar implements InterfaceC3623i {
    @Override // p126j5.InterfaceC3623i
    @RecentlyNonNull
    public final List<C3617d<?>> getComponents() {
        return AbstractC5144c1.m19766p(C3617d.m15462c(C3644d.class).m15480b(C3631q.m15529h(C3298i.class)).m15484f(new InterfaceC3622h() { // from class: j6.c
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return new C3644d((C3298i) interfaceC3619e.mo15448a(C3298i.class));
            }
        }).m15482d(), C3617d.m15462c(C2708b.class).m15480b(C3631q.m15529h(C3644d.class)).m15480b(C3631q.m15529h(C3290d.class)).m15484f(new InterfaceC3622h() { // from class: com.google.mlkit.vision.barcode.internal.a
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return new C2708b((C3644d) interfaceC3619e.mo15448a(C3644d.class), (C3290d) interfaceC3619e.mo15448a(C3290d.class));
            }
        }).m15482d());
    }
}
