package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.g */
/* loaded from: classes.dex */
final class C1434g implements DynamiteModule.InterfaceC1427b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1427b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1427b.b mo7766a(Context context, String str, DynamiteModule.InterfaceC1427b.a aVar) throws DynamiteModule.C1426a {
        DynamiteModule.InterfaceC1427b.b bVar = new DynamiteModule.InterfaceC1427b.b();
        bVar.f6449a = aVar.mo7767a(context, str);
        int mo7768b = aVar.mo7768b(context, str, true);
        bVar.f6450b = mo7768b;
        int i10 = bVar.f6449a;
        if (i10 == 0) {
            if (mo7768b == 0) {
                bVar.f6451c = 0;
                return bVar;
            }
            i10 = 0;
        }
        if (i10 >= mo7768b) {
            bVar.f6451c = -1;
        } else {
            bVar.f6451c = 1;
        }
        return bVar;
    }
}
