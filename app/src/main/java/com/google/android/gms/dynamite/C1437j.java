package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.j */
/* loaded from: classes.dex */
final class C1437j implements DynamiteModule.InterfaceC1427b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1427b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1427b.b mo7766a(Context context, String str, DynamiteModule.InterfaceC1427b.a aVar) throws DynamiteModule.C1426a {
        int mo7768b;
        DynamiteModule.InterfaceC1427b.b bVar = new DynamiteModule.InterfaceC1427b.b();
        int mo7767a = aVar.mo7767a(context, str);
        bVar.f6449a = mo7767a;
        int i10 = 0;
        if (mo7767a != 0) {
            mo7768b = aVar.mo7768b(context, str, false);
            bVar.f6450b = mo7768b;
        } else {
            mo7768b = aVar.mo7768b(context, str, true);
            bVar.f6450b = mo7768b;
        }
        int i11 = bVar.f6449a;
        if (i11 != 0) {
            i10 = i11;
        } else if (mo7768b == 0) {
            bVar.f6451c = 0;
            return bVar;
        }
        if (mo7768b >= i10) {
            bVar.f6451c = 1;
        } else {
            bVar.f6451c = -1;
        }
        return bVar;
    }
}
