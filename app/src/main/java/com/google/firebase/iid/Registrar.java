package com.google.firebase.iid;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p007a6.C0041h;
import p007a6.InterfaceC0042i;
import p098h5.C3399c;
import p126j5.C3617d;
import p126j5.C3631q;
import p126j5.InterfaceC3623i;
import p200p5.InterfaceC4272d;
import p237s5.InterfaceC4528a;

@Keep
/* loaded from: classes.dex */
public final class Registrar implements InterfaceC3623i {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.iid.Registrar$a */
    /* loaded from: classes.dex */
    public static class C2575a implements InterfaceC4528a {

        /* renamed from: a */
        private final FirebaseInstanceId f10163a;

        public C2575a(FirebaseInstanceId firebaseInstanceId) {
            this.f10163a = firebaseInstanceId;
        }
    }

    @Override // p126j5.InterfaceC3623i
    @Keep
    public final List<C3617d<?>> getComponents() {
        return Arrays.asList(C3617d.m15462c(FirebaseInstanceId.class).m15480b(C3631q.m15529h(C3399c.class)).m15480b(C3631q.m15529h(InterfaceC4272d.class)).m15480b(C3631q.m15529h(InterfaceC0042i.class)).m15484f(C2578b.f10166a).m15481c().m15482d(), C3617d.m15462c(InterfaceC4528a.class).m15480b(C3631q.m15529h(FirebaseInstanceId.class)).m15484f(C2580c.f10172a).m15482d(), C0041h.m241b("fire-iid", "20.0.0"));
    }
}
