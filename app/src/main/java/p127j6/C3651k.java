package p127j6;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzni;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p032c6.C1131a;
import p087g6.C3302m;
import p110i3.BinderC3517b;
import p113i6.C3535a;
import p113i6.C3537c;
import p140k6.C3759a;
import p153l6.C3882b;
import p153l6.C3884d;
import p283w3.AbstractBinderC5299nb;
import p283w3.C5273lb;
import p283w3.C5324pa;
import p283w3.EnumC5151c8;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j6.k */
/* loaded from: classes.dex */
public final class C3651k implements InterfaceC3648h {

    /* renamed from: a */
    private boolean f15339a;

    /* renamed from: b */
    private boolean f15340b;

    /* renamed from: c */
    private boolean f15341c;

    /* renamed from: d */
    private final Context f15342d;

    /* renamed from: e */
    private final C3537c f15343e;

    /* renamed from: f */
    private final C5324pa f15344f;

    /* renamed from: g */
    private C5273lb f15345g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3651k(Context context, C3537c c3537c, C5324pa c5324pa) {
        this.f15342d = context;
        this.f15343e = c3537c;
        this.f15344f = c5324pa;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m15561c(Context context) {
        return DynamiteModule.m7754a(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // p127j6.InterfaceC3648h
    /* renamed from: a */
    public final boolean mo15558a() throws C1131a {
        if (this.f15345g != null) {
            return this.f15340b;
        }
        if (m15561c(this.f15342d)) {
            this.f15340b = true;
            try {
                this.f15345g = m15562d(DynamiteModule.f6432c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e10) {
                throw new C1131a("Failed to create thick barcode scanner.", 13, e10);
            } catch (DynamiteModule.C1426a e11) {
                throw new C1131a("Failed to load the bundled barcode module.", 13, e11);
            }
        } else {
            this.f15340b = false;
            try {
                this.f15345g = m15562d(DynamiteModule.f6431b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException e12) {
                C3642b.m15553e(this.f15344f, EnumC5151c8.OPTIONAL_MODULE_INIT_ERROR);
                throw new C1131a("Failed to create thin barcode scanner.", 13, e12);
            } catch (DynamiteModule.C1426a unused) {
                if (!this.f15341c) {
                    C3302m.m14575a(this.f15342d, "barcode");
                    this.f15341c = true;
                }
                C3642b.m15553e(this.f15344f, EnumC5151c8.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C1131a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
        }
        C3642b.m15553e(this.f15344f, EnumC5151c8.NO_ERROR);
        return this.f15340b;
    }

    @Override // p127j6.InterfaceC3648h
    /* renamed from: b */
    public final List<C3535a> mo15559b(C3759a c3759a) throws C1131a {
        if (this.f15345g == null) {
            mo15558a();
        }
        C5273lb c5273lb = (C5273lb) C5984j.m21286j(this.f15345g);
        if (!this.f15339a) {
            try {
                c5273lb.m19863K0();
                this.f15339a = true;
            } catch (RemoteException e10) {
                throw new C1131a("Failed to init barcode scanner.", 13, e10);
            }
        }
        int m15977i = c3759a.m15977i();
        if (c3759a.m15972d() == 35) {
            m15977i = ((Image.Plane[]) C5984j.m21286j(c3759a.m15975g()))[0].getRowStride();
        }
        try {
            List<zzmp> m19862J0 = c5273lb.m19862J0(C3884d.m16498b().m16499a(c3759a), new zzni(c3759a.m15972d(), m15977i, c3759a.m15973e(), C3882b.m16489a(c3759a.m15976h()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator<zzmp> it = m19862J0.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3535a(new C3650j(it.next())));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new C1131a("Failed to run barcode scanner.", 13, e11);
        }
    }

    /* renamed from: d */
    final C5273lb m15562d(DynamiteModule.InterfaceC1427b interfaceC1427b, String str, String str2) throws DynamiteModule.C1426a, RemoteException {
        return AbstractBinderC5299nb.m19873i(DynamiteModule.m7756e(this.f15342d, interfaceC1427b, str).m7765d(str2)).mo19871Y(BinderC3517b.m15328J0(this.f15342d), new zzmr(this.f15343e.m15337a()));
    }

    @Override // p127j6.InterfaceC3648h
    public final void zzb() {
        C5273lb c5273lb = this.f15345g;
        if (c5273lb != null) {
            try {
                c5273lb.m19864L0();
            } catch (RemoteException e10) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.f15345g = null;
            this.f15339a = false;
        }
    }
}
