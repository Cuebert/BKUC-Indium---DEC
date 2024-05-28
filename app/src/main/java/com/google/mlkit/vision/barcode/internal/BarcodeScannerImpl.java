package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import p085g4.AbstractC3263l;
import p113i6.C3535a;
import p113i6.C3537c;
import p113i6.InterfaceC3536b;
import p127j6.C3642b;
import p127j6.C3647g;
import p140k6.C3759a;
import p283w3.C5192f8;
import p283w3.C5324pa;
import p283w3.C5348r8;
import p283w3.C5361s8;
import p283w3.C5363sa;
import p283w3.EnumC5165d8;

/* loaded from: classes.dex */
public class BarcodeScannerImpl extends MobileVisionBase<List<C3535a>> implements InterfaceC3536b {

    /* renamed from: t */
    private static final C3537c f10301t = new C3537c.a().m15339a();

    public BarcodeScannerImpl(C3537c c3537c, C3647g c3647g, Executor executor, C5324pa c5324pa) {
        super(c3647g, executor);
        C5348r8 c5348r8 = new C5348r8();
        c5348r8.m19954i(C3642b.m15551c(c3537c));
        C5361s8 m19955j = c5348r8.m19955j();
        C5192f8 c5192f8 = new C5192f8();
        c5192f8.m19816f(m19955j);
        c5324pa.m19907d(C5363sa.m19972e(c5192f8, 1), EnumC5165d8.ON_DEVICE_BARCODE_CREATE);
    }

    @Override // p113i6.InterfaceC3536b
    /* renamed from: N */
    public final AbstractC3263l<List<C3535a>> mo12083N(@RecentlyNonNull C3759a c3759a) {
        return super.m12086b(c3759a);
    }
}
