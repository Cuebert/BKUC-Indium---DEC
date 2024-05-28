package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
/* loaded from: classes.dex */
final class C1431d implements DynamiteModule.InterfaceC1427b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1427b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1427b.b mo7766a(Context context, String str, DynamiteModule.InterfaceC1427b.a aVar) throws DynamiteModule.C1426a {
        DynamiteModule.InterfaceC1427b.b bVar = new DynamiteModule.InterfaceC1427b.b();
        int mo7768b = aVar.mo7768b(context, str, true);
        bVar.f6450b = mo7768b;
        if (mo7768b != 0) {
            bVar.f6451c = 1;
        } else {
            int mo7767a = aVar.mo7767a(context, str);
            bVar.f6449a = mo7767a;
            if (mo7767a != 0) {
                bVar.f6451c = -1;
            }
        }
        return bVar;
    }
}
