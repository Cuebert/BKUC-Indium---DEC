package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p007a6.C0041h;
import p098h5.C3399c;
import p112i5.C3532b;
import p112i5.InterfaceC3531a;
import p126j5.C3617d;
import p126j5.C3631q;
import p126j5.InterfaceC3619e;
import p126j5.InterfaceC3622h;
import p126j5.InterfaceC3623i;
import p200p5.InterfaceC4272d;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements InterfaceC3623i {
    @Override // p126j5.InterfaceC3623i
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C3617d<?>> getComponents() {
        return Arrays.asList(C3617d.m15462c(InterfaceC3531a.class).m15480b(C3631q.m15529h(C3399c.class)).m15480b(C3631q.m15529h(Context.class)).m15480b(C3631q.m15529h(InterfaceC4272d.class)).m15484f(new InterfaceC3622h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                InterfaceC3531a m15332c;
                m15332c = C3532b.m15332c((C3399c) interfaceC3619e.mo15448a(C3399c.class), (Context) interfaceC3619e.mo15448a(Context.class), (InterfaceC4272d) interfaceC3619e.mo15448a(InterfaceC4272d.class));
                return m15332c;
            }
        }).m15483e().m15482d(), C0041h.m241b("fire-analytics", "20.0.0"));
    }
}
