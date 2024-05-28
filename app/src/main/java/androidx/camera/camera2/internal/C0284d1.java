package androidx.camera.camera2.internal;

import android.content.Context;
import p255u.C4769m;
import p279w.C5015c2;
import p279w.C5045k0;
import p279w.C5070q1;
import p279w.C5083u1;
import p279w.InterfaceC5026f1;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5063o2;
import p279w.InterfaceC5067p2;

/* renamed from: androidx.camera.camera2.internal.d1 */
/* loaded from: classes.dex */
public final class C0284d1 implements InterfaceC5067p2 {

    /* renamed from: b */
    final C0360v1 f1271b;

    /* renamed from: androidx.camera.camera2.internal.d1$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1272a;

        static {
            int[] iArr = new int[InterfaceC5067p2.b.values().length];
            f1272a = iArr;
            try {
                iArr[InterfaceC5067p2.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1272a[InterfaceC5067p2.b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1272a[InterfaceC5067p2.b.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1272a[InterfaceC5067p2.b.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C0284d1(Context context) {
        this.f1271b = C0360v1.m1789b(context);
    }

    @Override // p279w.InterfaceC5067p2
    /* renamed from: a */
    public InterfaceC5061o0 mo1381a(InterfaceC5067p2.b bVar, int i10) {
        C5070q1 m19660L = C5070q1.m19660L();
        C5015c2.b bVar2 = new C5015c2.b();
        int[] iArr = a.f1272a;
        int i11 = iArr[bVar.ordinal()];
        if (i11 == 1) {
            bVar2.m19519s(i10 == 2 ? 5 : 1);
        } else if (i11 == 2 || i11 == 3) {
            bVar2.m19519s(1);
        } else if (i11 == 4) {
            bVar2.m19519s(3);
        }
        InterfaceC5067p2.b bVar3 = InterfaceC5067p2.b.PREVIEW;
        if (bVar == bVar3) {
            C4769m.m18951a(bVar2);
        }
        m19660L.mo19659g(InterfaceC5063o2.f19278n, bVar2.m19514m());
        m19660L.mo19659g(InterfaceC5063o2.f19280p, C0279c1.f1257a);
        C5045k0.a aVar = new C5045k0.a();
        int i12 = iArr[bVar.ordinal()];
        if (i12 == 1) {
            aVar.m19603p(i10 != 2 ? 2 : 5);
        } else if (i12 == 2 || i12 == 3) {
            aVar.m19603p(1);
        } else if (i12 == 4) {
            aVar.m19603p(3);
        }
        m19660L.mo19659g(InterfaceC5063o2.f19279o, aVar.m19597h());
        m19660L.mo19659g(InterfaceC5063o2.f19281q, bVar == InterfaceC5067p2.b.IMAGE_CAPTURE ? C0270a2.f1237c : C0319l0.f1452a);
        if (bVar == bVar3) {
            m19660L.mo19659g(InterfaceC5026f1.f19171l, this.f1271b.m1791d());
        }
        m19660L.mo19659g(InterfaceC5026f1.f19167h, Integer.valueOf(this.f1271b.m1790c().getRotation()));
        return C5083u1.m19702J(m19660L);
    }
}
