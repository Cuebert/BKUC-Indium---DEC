package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
/* loaded from: classes.dex */
final class C1433f implements DynamiteModule.InterfaceC1427b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1427b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1427b.b mo7766a(Context context, String str, DynamiteModule.InterfaceC1427b.a aVar) throws DynamiteModule.C1426a {
        DynamiteModule.InterfaceC1427b.b bVar = new DynamiteModule.InterfaceC1427b.b();
        int mo7768b = aVar.mo7768b(context, str, false);
        bVar.f6450b = mo7768b;
        if (mo7768b == 0) {
            bVar.f6451c = 0;
        } else {
            bVar.f6451c = 1;
        }
        return bVar;
    }
}
