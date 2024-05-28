package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0469s;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import p218r.C4414z;
import p255u.C4772p;
import p279w.AbstractC5073r0;
import p279w.C5014c1;
import p279w.C5015c2;
import p279w.C5038i1;
import p279w.C5045k0;
import p279w.C5059n2;
import p279w.C5070q1;
import p279w.C5098z1;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5063o2;
import p292x.C5493a;
import p305y.C5586f;
import p305y.InterfaceC5583c;
import p318z.C5940h;
import p318z.C5944l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.c2 */
/* loaded from: classes.dex */
public class C0280c2 {

    /* renamed from: a */
    private AbstractC5073r0 f1258a;

    /* renamed from: b */
    private final C5015c2 f1259b;

    /* renamed from: c */
    private final C4772p f1260c = new C4772p();

    /* renamed from: androidx.camera.camera2.internal.c2$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5583c<Void> {

        /* renamed from: a */
        final /* synthetic */ Surface f1261a;

        /* renamed from: b */
        final /* synthetic */ SurfaceTexture f1262b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f1261a = surface;
            this.f1262b = surfaceTexture;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f1261a.release();
            this.f1262b.release();
        }
    }

    /* renamed from: androidx.camera.camera2.internal.c2$b */
    /* loaded from: classes.dex */
    private static class b implements InterfaceC5063o2<AbstractC0496y2> {

        /* renamed from: z */
        private final InterfaceC5061o0 f1264z;

        b() {
            C5070q1 m19660L = C5070q1.m19660L();
            m19660L.mo19659g(InterfaceC5063o2.f19280p, new C0279c1());
            this.f1264z = m19660L;
        }

        @Override // p318z.InterfaceC5941i
        /* renamed from: B */
        public /* synthetic */ String mo1363B(String str) {
            return C5940h.m21132a(this, str);
        }

        @Override // p318z.InterfaceC5945m
        /* renamed from: D */
        public /* synthetic */ AbstractC0496y2.b mo1364D(AbstractC0496y2.b bVar) {
            return C5944l.m21134a(this, bVar);
        }

        @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
        /* renamed from: a */
        public /* synthetic */ Object mo1365a(InterfaceC5061o0.a aVar, Object obj) {
            return C5098z1.m19739g(this, aVar, obj);
        }

        @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
        /* renamed from: b */
        public /* synthetic */ Object mo1366b(InterfaceC5061o0.a aVar) {
            return C5098z1.m19738f(this, aVar);
        }

        @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
        /* renamed from: c */
        public /* synthetic */ Set mo1367c() {
            return C5098z1.m19737e(this);
        }

        @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
        /* renamed from: d */
        public /* synthetic */ InterfaceC5061o0.c mo1368d(InterfaceC5061o0.a aVar) {
            return C5098z1.m19735c(this, aVar);
        }

        @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
        /* renamed from: e */
        public /* synthetic */ boolean mo1369e(InterfaceC5061o0.a aVar) {
            return C5098z1.m19733a(this, aVar);
        }

        @Override // p279w.InterfaceC5063o2
        /* renamed from: i */
        public /* synthetic */ C5045k0 mo1370i(C5045k0 c5045k0) {
            return C5059n2.m19649c(this, c5045k0);
        }

        @Override // p279w.InterfaceC5063o2
        /* renamed from: j */
        public /* synthetic */ C5045k0.b mo1371j(C5045k0.b bVar) {
            return C5059n2.m19648b(this, bVar);
        }

        @Override // p279w.InterfaceC5063o2
        /* renamed from: m */
        public /* synthetic */ int mo1372m(int i10) {
            return C5059n2.m19652f(this, i10);
        }

        @Override // p279w.InterfaceC5007a2
        /* renamed from: o */
        public InterfaceC5061o0 mo1373o() {
            return this.f1264z;
        }

        @Override // p279w.InterfaceC5018d1
        /* renamed from: q */
        public /* synthetic */ int mo1374q() {
            return C5014c1.m19489a(this);
        }

        @Override // p279w.InterfaceC5063o2
        /* renamed from: r */
        public /* synthetic */ C5015c2.d mo1375r(C5015c2.d dVar) {
            return C5059n2.m19651e(this, dVar);
        }

        @Override // p279w.InterfaceC5061o0
        /* renamed from: t */
        public /* synthetic */ Object mo1376t(InterfaceC5061o0.a aVar, InterfaceC5061o0.c cVar) {
            return C5098z1.m19740h(this, aVar, cVar);
        }

        @Override // p279w.InterfaceC5061o0
        /* renamed from: v */
        public /* synthetic */ void mo1377v(String str, InterfaceC5061o0.b bVar) {
            C5098z1.m19734b(this, str, bVar);
        }

        @Override // p279w.InterfaceC5063o2
        /* renamed from: w */
        public /* synthetic */ C5015c2 mo1378w(C5015c2 c5015c2) {
            return C5059n2.m19650d(this, c5015c2);
        }

        @Override // p279w.InterfaceC5061o0
        /* renamed from: x */
        public /* synthetic */ Set mo1379x(InterfaceC5061o0.a aVar) {
            return C5098z1.m19736d(this, aVar);
        }

        @Override // p279w.InterfaceC5063o2
        /* renamed from: y */
        public /* synthetic */ C0469s mo1380y(C0469s c0469s) {
            return C5059n2.m19647a(this, c0469s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0280c2(C4414z c4414z, C0360v1 c0360v1) {
        b bVar = new b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size m1356d = m1356d(c4414z, c0360v1);
        C0463q1.m2202a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + m1356d);
        surfaceTexture.setDefaultBufferSize(m1356d.getWidth(), m1356d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C5015c2.b m19501o = C5015c2.b.m19501o(bVar);
        m19501o.m19519s(1);
        C5038i1 c5038i1 = new C5038i1(surface);
        this.f1258a = c5038i1;
        C5586f.m20502b(c5038i1.m19682i(), new a(surface, surfaceTexture), C5493a.m20219a());
        m19501o.m19512k(this.f1258a);
        this.f1259b = m19501o.m19514m();
    }

    /* renamed from: d */
    private Size m1356d(C4414z c4414z, C0360v1 c0360v1) {
        Size[] outputSizes;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c4414z.m18192a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C0463q1.m2204c("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        if (Build.VERSION.SDK_INT < 23) {
            outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes == null) {
            C0463q1.m2204c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] m18954a = this.f1260c.m18954a(outputSizes);
        List asList = Arrays.asList(m18954a);
        Collections.sort(asList, new Comparator() { // from class: androidx.camera.camera2.internal.b2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m1357f;
                m1357f = C0280c2.m1357f((Size) obj, (Size) obj2);
                return m1357f;
            }
        });
        Size m1791d = c0360v1.m1791d();
        long min = Math.min(m1791d.getWidth() * m1791d.getHeight(), 307200L);
        Size size = null;
        int length = m18954a.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Size size2 = m18954a[i10];
            long width = size2.getWidth() * size2.getHeight();
            if (width == min) {
                return size2;
            }
            if (width <= min) {
                i10++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ int m1357f(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1358b() {
        C0463q1.m2202a("MeteringRepeating", "MeteringRepeating clear!");
        AbstractC5073r0 abstractC5073r0 = this.f1258a;
        if (abstractC5073r0 != null) {
            abstractC5073r0.m19676c();
        }
        this.f1258a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m1359c() {
        return "MeteringRepeating";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C5015c2 m1360e() {
        return this.f1259b;
    }
}
