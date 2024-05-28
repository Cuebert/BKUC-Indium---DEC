package p127j6;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import java.util.ArrayList;
import java.util.List;
import p032c6.C1131a;
import p087g6.C3302m;
import p110i3.BinderC3517b;
import p113i6.C3535a;
import p113i6.C3537c;
import p140k6.C3759a;
import p153l6.C3882b;
import p153l6.C3883c;
import p283w3.AbstractBinderC5209h;
import p283w3.C5183f;
import p283w3.C5324pa;
import p283w3.EnumC5151c8;
import p321z2.C5984j;

/* renamed from: j6.m */
/* loaded from: classes.dex */
final class C3653m implements InterfaceC3648h {

    /* renamed from: a */
    private boolean f15347a;

    /* renamed from: b */
    private final Context f15348b;

    /* renamed from: c */
    private final zzad f15349c;

    /* renamed from: d */
    private final C5324pa f15350d;

    /* renamed from: e */
    private C5183f f15351e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3653m(Context context, C3537c c3537c, C5324pa c5324pa) {
        zzad zzadVar = new zzad();
        this.f15349c = zzadVar;
        this.f15348b = context;
        zzadVar.f7365n = c3537c.m15337a();
        this.f15350d = c5324pa;
    }

    @Override // p127j6.InterfaceC3648h
    /* renamed from: a */
    public final boolean mo15558a() throws C1131a {
        if (this.f15351e != null) {
            return false;
        }
        try {
            C5183f mo19824p = AbstractBinderC5209h.m19838i(DynamiteModule.m7756e(this.f15348b, DynamiteModule.f6431b, "com.google.android.gms.vision.dynamite").m7765d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).mo19824p(BinderC3517b.m15328J0(this.f15348b), this.f15349c);
            this.f15351e = mo19824p;
            if (mo19824p == null && !this.f15347a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                C3302m.m14575a(this.f15348b, "barcode");
                this.f15347a = true;
                C3642b.m15553e(this.f15350d, EnumC5151c8.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C1131a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            C3642b.m15553e(this.f15350d, EnumC5151c8.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new C1131a("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.C1426a e11) {
            throw new C1131a("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }

    @Override // p127j6.InterfaceC3648h
    /* renamed from: b */
    public final List<C3535a> mo15559b(C3759a c3759a) throws C1131a {
        zzq[] m19803K0;
        if (this.f15351e == null) {
            mo15558a();
        }
        C5183f c5183f = this.f15351e;
        if (c5183f != null) {
            C5183f c5183f2 = (C5183f) C5984j.m21286j(c5183f);
            zzaj zzajVar = new zzaj(c3759a.m15977i(), c3759a.m15973e(), 0, 0L, C3882b.m16489a(c3759a.m15976h()));
            try {
                int m15972d = c3759a.m15972d();
                if (m15972d == -1) {
                    m19803K0 = c5183f2.m19803K0(BinderC3517b.m15328J0(c3759a.m15970b()), zzajVar);
                } else if (m15972d == 17) {
                    m19803K0 = c5183f2.m19802J0(BinderC3517b.m15328J0(c3759a.m15971c()), zzajVar);
                } else if (m15972d == 35) {
                    Image.Plane[] planeArr = (Image.Plane[]) C5984j.m21286j(c3759a.m15975g());
                    zzajVar.f7367n = planeArr[0].getRowStride();
                    m19803K0 = c5183f2.m19802J0(BinderC3517b.m15328J0(planeArr[0].getBuffer()), zzajVar);
                } else if (m15972d == 842094169) {
                    m19803K0 = c5183f2.m19802J0(BinderC3517b.m15328J0(C3883c.m16491d().m16496c(c3759a, false)), zzajVar);
                } else {
                    int m15972d2 = c3759a.m15972d();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unsupported image format: ");
                    sb2.append(m15972d2);
                    throw new C1131a(sb2.toString(), 3);
                }
                ArrayList arrayList = new ArrayList();
                for (zzq zzqVar : m19803K0) {
                    arrayList.add(new C3535a(new C3652l(zzqVar)));
                }
                return arrayList;
            } catch (RemoteException e10) {
                throw new C1131a("Failed to detect with legacy barcode detector", 13, e10);
            }
        }
        throw new C1131a("Error initializing the legacy barcode scanner.", 14);
    }

    @Override // p127j6.InterfaceC3648h
    public final void zzb() {
        C5183f c5183f = this.f15351e;
        if (c5183f != null) {
            try {
                c5183f.m19804c();
            } catch (RemoteException e10) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.f15351e = null;
        }
    }
}
