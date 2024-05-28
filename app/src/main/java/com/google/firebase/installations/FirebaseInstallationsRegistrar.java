package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import p007a6.C0041h;
import p007a6.InterfaceC0042i;
import p098h5.C3399c;
import p126j5.C3617d;
import p126j5.C3631q;
import p126j5.InterfaceC3619e;
import p126j5.InterfaceC3622h;
import p126j5.InterfaceC3623i;
import p212q5.InterfaceC4319f;
import p261u5.InterfaceC4862c;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements InterfaceC3623i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4862c lambda$getComponents$0(InterfaceC3619e interfaceC3619e) {
        return new C2614b((C3399c) interfaceC3619e.mo15448a(C3399c.class), interfaceC3619e.mo15485c(InterfaceC0042i.class), interfaceC3619e.mo15485c(InterfaceC4319f.class));
    }

    @Override // p126j5.InterfaceC3623i
    public List<C3617d<?>> getComponents() {
        return Arrays.asList(C3617d.m15462c(InterfaceC4862c.class).m15480b(C3631q.m15529h(C3399c.class)).m15480b(C3631q.m15528g(InterfaceC4319f.class)).m15480b(C3631q.m15528g(InterfaceC0042i.class)).m15484f(new InterfaceC3622h() { // from class: u5.d
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                InterfaceC4862c lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC3619e);
                return lambda$getComponents$0;
            }
        }).m15482d(), C0041h.m241b("fire-installations", "17.0.0"));
    }
}
