package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x */
/* loaded from: classes.dex */
public abstract class AbstractC1851x {

    /* renamed from: a */
    final List<EnumC1692n0> f7285a = new ArrayList();

    /* renamed from: a */
    public abstract InterfaceC1739q mo7877a(String str, C1728p4 c1728p4, List<InterfaceC1739q> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final InterfaceC1739q m8953b(String str) {
        if (this.f7285a.contains(C1745q5.m8719e(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
