package p267v;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.InterfaceC0414h0;
import java.util.Set;
import p206q.C4288a;
import p267v.C4932j;
import p279w.C5070q1;
import p279w.C5083u1;
import p279w.C5098z1;
import p279w.InterfaceC5007a2;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5066p1;

/* renamed from: v.j */
/* loaded from: classes.dex */
public class C4932j implements InterfaceC5007a2 {

    /* renamed from: z */
    private final InterfaceC5061o0 f18979z;

    /* renamed from: v.j$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0414h0<C4932j> {

        /* renamed from: a */
        private final C5070q1 f18980a = C5070q1.m19660L();

        /* renamed from: e */
        public static a m19350e(InterfaceC5061o0 interfaceC5061o0) {
            a aVar = new a();
            interfaceC5061o0.mo1377v("camera2.captureRequest.option.", new InterfaceC5061o0.b() { // from class: v.i

                /* renamed from: b */
                public final /* synthetic */ InterfaceC5061o0 f18978b;

                public /* synthetic */ C4931i(InterfaceC5061o0 interfaceC5061o02) {
                    r2 = interfaceC5061o02;
                }

                @Override // p279w.InterfaceC5061o0.b
                /* renamed from: a */
                public final boolean mo19348a(InterfaceC5061o0.a aVar2) {
                    boolean m19351f;
                    m19351f = C4932j.a.m19351f(C4932j.a.this, r2, aVar2);
                    return m19351f;
                }
            });
            return aVar;
        }

        /* renamed from: f */
        public static /* synthetic */ boolean m19351f(a aVar, InterfaceC5061o0 interfaceC5061o0, InterfaceC5061o0.a aVar2) {
            aVar.mo1926a().mo19658G(aVar2, interfaceC5061o0.mo1368d(aVar2), interfaceC5061o0.mo1366b(aVar2));
            return true;
        }

        @Override // androidx.camera.core.InterfaceC0414h0
        /* renamed from: a */
        public InterfaceC5066p1 mo1926a() {
            return this.f18980a;
        }

        /* renamed from: d */
        public C4932j m19352d() {
            return new C4932j(C5083u1.m19702J(this.f18980a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public <ValueT> a m19353g(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f18980a.mo19659g(C4288a.m17764H(key), valuet);
            return this;
        }
    }

    public C4932j(InterfaceC5061o0 interfaceC5061o0) {
        this.f18979z = interfaceC5061o0;
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

    @Override // p279w.InterfaceC5007a2
    /* renamed from: o */
    public InterfaceC5061o0 mo1373o() {
        return this.f18979z;
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

    @Override // p279w.InterfaceC5061o0
    /* renamed from: x */
    public /* synthetic */ Set mo1379x(InterfaceC5061o0.a aVar) {
        return C5098z1.m19736d(this, aVar);
    }
}
