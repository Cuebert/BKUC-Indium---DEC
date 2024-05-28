package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p018b4.C0997k;
import p110i3.BinderC3517b;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s1 */
/* loaded from: classes.dex */
public final class C1773s1 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ String f7215r;

    /* renamed from: s */
    final /* synthetic */ String f7216s;

    /* renamed from: t */
    final /* synthetic */ Context f7217t;

    /* renamed from: u */
    final /* synthetic */ Bundle f7218u;

    /* renamed from: v */
    final /* synthetic */ C1774s2 f7219v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1773s1(C1774s2 c1774s2, String str, String str2, Context context, Bundle bundle) {
        super(c1774s2, true);
        this.f7219v = c1774s2;
        this.f7215r = str;
        this.f7216s = str2;
        this.f7217t = context;
        this.f7218u = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    public final void mo7878a() {
        boolean m8781l;
        String str;
        String str2;
        String str3;
        InterfaceC1562f1 interfaceC1562f1;
        InterfaceC1562f1 interfaceC1562f12;
        String str4;
        String str5;
        try {
            C1774s2 c1774s2 = this.f7219v;
            m8781l = C1774s2.m8781l(this.f7215r, this.f7216s);
            if (m8781l) {
                String str6 = this.f7216s;
                String str7 = this.f7215r;
                str5 = this.f7219v.f7221a;
                str2 = str7;
                str3 = str6;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C5984j.m21286j(this.f7217t);
            C1774s2 c1774s22 = this.f7219v;
            c1774s22.f7229i = c1774s22.m8798q(this.f7217t, true);
            interfaceC1562f1 = this.f7219v.f7229i;
            if (interfaceC1562f1 == null) {
                str4 = this.f7219v.f7221a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int m7754a = DynamiteModule.m7754a(this.f7217t, ModuleDescriptor.MODULE_ID);
            zzcl zzclVar = new zzcl(46000L, Math.max(m7754a, r0), DynamiteModule.m7755c(this.f7217t, ModuleDescriptor.MODULE_ID) < m7754a, str, str2, str3, this.f7218u, C0997k.m6226a(this.f7217t));
            interfaceC1562f12 = this.f7219v.f7229i;
            ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f12)).initialize(BinderC3517b.m15328J0(this.f7217t), zzclVar, this.f6839n);
        } catch (Exception e10) {
            this.f7219v.m8778i(e10, true, false);
        }
    }
}
