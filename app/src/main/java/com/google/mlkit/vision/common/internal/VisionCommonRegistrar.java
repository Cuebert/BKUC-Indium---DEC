package com.google.mlkit.vision.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.mlkit.vision.common.internal.C2709a;
import java.util.List;
import p126j5.C3617d;
import p126j5.C3631q;
import p126j5.InterfaceC3619e;
import p126j5.InterfaceC3622h;
import p126j5.InterfaceC3623i;
import p309y3.AbstractC5881z7;

/* loaded from: classes.dex */
public class VisionCommonRegistrar implements InterfaceC3623i {
    @Override // p126j5.InterfaceC3623i
    @RecentlyNonNull
    public final List<C3617d<?>> getComponents() {
        return AbstractC5881z7.m20788o(C3617d.m15462c(C2709a.class).m15480b(C3631q.m15531j(C2709a.a.class)).m15484f(new InterfaceC3622h() { // from class: com.google.mlkit.vision.common.internal.c
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                return new C2709a(interfaceC3619e.mo15449b(C2709a.a.class));
            }
        }).m15482d());
    }
}
