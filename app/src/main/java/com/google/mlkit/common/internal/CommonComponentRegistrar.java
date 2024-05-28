package com.google.mlkit.common.internal;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import p060e6.C3079a;
import p073f6.C3158a;
import p073f6.C3160c;
import p087g6.C3284a;
import p087g6.C3286b;
import p087g6.C3290d;
import p087g6.C3298i;
import p087g6.C3299j;
import p087g6.C3303n;
import p099h6.C3407b;
import p126j5.C3617d;
import p126j5.C3631q;
import p126j5.InterfaceC3619e;
import p126j5.InterfaceC3622h;
import p126j5.InterfaceC3623i;
import p271v3.AbstractC4955h;

/* loaded from: classes.dex */
public class CommonComponentRegistrar implements InterfaceC3623i {
    @Override // p126j5.InterfaceC3623i
    @RecentlyNonNull
    public final List<C3617d<?>> getComponents() {
        return AbstractC4955h.m19379p(C3303n.f13768b, C3617d.m15462c(C3407b.class).m15480b(C3631q.m15529h(C3298i.class)).m15484f(new InterfaceC3622h() { // from class: d6.a
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return new C3407b((C3298i) interfaceC3619e.mo15448a(C3298i.class));
            }
        }).m15482d(), C3617d.m15462c(C3299j.class).m15484f(new InterfaceC3622h() { // from class: d6.b
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return new C3299j();
            }
        }).m15482d(), C3617d.m15462c(C3160c.class).m15480b(C3631q.m15531j(C3160c.a.class)).m15484f(new InterfaceC3622h() { // from class: d6.c
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return new C3160c(interfaceC3619e.mo15449b(C3160c.a.class));
            }
        }).m15482d(), C3617d.m15462c(C3290d.class).m15480b(C3631q.m15530i(C3299j.class)).m15484f(new InterfaceC3622h() { // from class: d6.d
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return new C3290d(interfaceC3619e.mo15485c(C3299j.class));
            }
        }).m15482d(), C3617d.m15462c(C3284a.class).m15484f(new InterfaceC3622h() { // from class: d6.e
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return C3284a.m14544a();
            }
        }).m15482d(), C3617d.m15462c(C3286b.class).m15480b(C3631q.m15529h(C3284a.class)).m15484f(new InterfaceC3622h() { // from class: d6.f
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return new C3286b((C3284a) interfaceC3619e.mo15448a(C3284a.class));
            }
        }).m15482d(), C3617d.m15462c(C3079a.class).m15480b(C3631q.m15529h(C3298i.class)).m15484f(new InterfaceC3622h() { // from class: d6.g
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return new C3079a((C3298i) interfaceC3619e.mo15448a(C3298i.class));
            }
        }).m15482d(), C3617d.m15465j(C3160c.a.class).m15480b(C3631q.m15530i(C3079a.class)).m15484f(new InterfaceC3622h() { // from class: d6.h
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return new C3160c.a(C3158a.class, interfaceC3619e.mo15485c(C3079a.class));
            }
        }).m15482d());
    }
}
