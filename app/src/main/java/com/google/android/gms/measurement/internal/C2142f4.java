package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1816uc;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
/* loaded from: classes.dex */
final class C2142f4 implements InterfaceC1816uc {

    /* renamed from: a */
    final /* synthetic */ String f8082a;

    /* renamed from: b */
    final /* synthetic */ C2153g4 f8083b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2142f4(C2153g4 c2153g4, String str) {
        this.f8083b = c2153g4;
        this.f8082a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1816uc
    /* renamed from: h */
    public final String mo8874h(String str) {
        Map map;
        map = this.f8083b.f8110d;
        Map map2 = (Map) map.get(this.f8082a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
