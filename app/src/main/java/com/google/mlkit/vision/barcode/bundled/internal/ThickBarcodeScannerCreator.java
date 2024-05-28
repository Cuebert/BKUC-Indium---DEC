package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzs;
import p110i3.BinderC3517b;
import p110i3.InterfaceC3516a;
import p296x3.AbstractBinderC5528e;
import p296x3.InterfaceC5526c;

@DynamiteApi
/* loaded from: classes.dex */
public class ThickBarcodeScannerCreator extends AbstractBinderC5528e {
    @Override // p296x3.InterfaceC5529f
    public InterfaceC5526c newBarcodeScanner(InterfaceC3516a interfaceC3516a, zzs zzsVar) {
        return new BinderC2706a((Context) BinderC3517b.m15329n(interfaceC3516a), zzsVar);
    }
}
