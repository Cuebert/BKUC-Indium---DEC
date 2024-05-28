package p279w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import androidx.camera.core.C0463q1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p026c0.C1118c;
import p279w.C5045k0;

/* renamed from: w.c2 */
/* loaded from: classes.dex */
public final class C5015c2 {

    /* renamed from: a */
    private final List<AbstractC5073r0> f19122a;

    /* renamed from: b */
    private final List<CameraDevice.StateCallback> f19123b;

    /* renamed from: c */
    private final List<CameraCaptureSession.StateCallback> f19124c;

    /* renamed from: d */
    private final List<AbstractC5032h> f19125d;

    /* renamed from: e */
    private final List<c> f19126e;

    /* renamed from: f */
    private final C5045k0 f19127f;

    /* renamed from: g */
    private InputConfiguration f19128g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w.c2$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Set<AbstractC5073r0> f19129a = new LinkedHashSet();

        /* renamed from: b */
        final C5045k0.a f19130b = new C5045k0.a();

        /* renamed from: c */
        final List<CameraDevice.StateCallback> f19131c = new ArrayList();

        /* renamed from: d */
        final List<CameraCaptureSession.StateCallback> f19132d = new ArrayList();

        /* renamed from: e */
        final List<c> f19133e = new ArrayList();

        /* renamed from: f */
        final List<AbstractC5032h> f19134f = new ArrayList();

        /* renamed from: g */
        InputConfiguration f19135g;

        a() {
        }
    }

    /* renamed from: w.c2$b */
    /* loaded from: classes.dex */
    public static class b extends a {
        /* renamed from: o */
        public static b m19501o(InterfaceC5063o2<?> interfaceC5063o2) {
            d mo1375r = interfaceC5063o2.mo1375r(null);
            if (mo1375r != null) {
                b bVar = new b();
                mo1375r.mo1354a(interfaceC5063o2, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC5063o2.mo1363B(interfaceC5063o2.toString()));
        }

        /* renamed from: a */
        public void m19502a(Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                m19506e(it.next());
            }
        }

        /* renamed from: b */
        public void m19503b(Collection<AbstractC5032h> collection) {
            this.f19130b.m19590a(collection);
        }

        /* renamed from: c */
        public void m19504c(List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                m19511j(it.next());
            }
        }

        /* renamed from: d */
        public void m19505d(AbstractC5032h abstractC5032h) {
            this.f19130b.m19592c(abstractC5032h);
            if (this.f19134f.contains(abstractC5032h)) {
                return;
            }
            this.f19134f.add(abstractC5032h);
        }

        /* renamed from: e */
        public void m19506e(CameraDevice.StateCallback stateCallback) {
            if (this.f19131c.contains(stateCallback)) {
                return;
            }
            this.f19131c.add(stateCallback);
        }

        /* renamed from: f */
        public void m19507f(c cVar) {
            this.f19133e.add(cVar);
        }

        /* renamed from: g */
        public void m19508g(InterfaceC5061o0 interfaceC5061o0) {
            this.f19130b.m19594e(interfaceC5061o0);
        }

        /* renamed from: h */
        public void m19509h(AbstractC5073r0 abstractC5073r0) {
            this.f19129a.add(abstractC5073r0);
        }

        /* renamed from: i */
        public void m19510i(AbstractC5032h abstractC5032h) {
            this.f19130b.m19592c(abstractC5032h);
        }

        /* renamed from: j */
        public void m19511j(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f19132d.contains(stateCallback)) {
                return;
            }
            this.f19132d.add(stateCallback);
        }

        /* renamed from: k */
        public void m19512k(AbstractC5073r0 abstractC5073r0) {
            this.f19129a.add(abstractC5073r0);
            this.f19130b.m19595f(abstractC5073r0);
        }

        /* renamed from: l */
        public void m19513l(String str, Object obj) {
            this.f19130b.m19596g(str, obj);
        }

        /* renamed from: m */
        public C5015c2 m19514m() {
            return new C5015c2(new ArrayList(this.f19129a), this.f19131c, this.f19132d, this.f19134f, this.f19133e, this.f19130b.m19597h(), this.f19135g);
        }

        /* renamed from: n */
        public void m19515n() {
            this.f19129a.clear();
            this.f19130b.m19598i();
        }

        /* renamed from: p */
        public List<AbstractC5032h> m19516p() {
            return Collections.unmodifiableList(this.f19134f);
        }

        /* renamed from: q */
        public void m19517q(InterfaceC5061o0 interfaceC5061o0) {
            this.f19130b.m19602o(interfaceC5061o0);
        }

        /* renamed from: r */
        public void m19518r(InputConfiguration inputConfiguration) {
            this.f19135g = inputConfiguration;
        }

        /* renamed from: s */
        public void m19519s(int i10) {
            this.f19130b.m19603p(i10);
        }
    }

    /* renamed from: w.c2$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo1878a(C5015c2 c5015c2, e eVar);
    }

    /* renamed from: w.c2$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo1354a(InterfaceC5063o2<?> interfaceC5063o2, b bVar);
    }

    /* renamed from: w.c2$e */
    /* loaded from: classes.dex */
    public enum e {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* renamed from: w.c2$f */
    /* loaded from: classes.dex */
    public static final class f extends a {

        /* renamed from: k */
        private static final List<Integer> f19139k = Arrays.asList(1, 3);

        /* renamed from: h */
        private final C1118c f19140h = new C1118c();

        /* renamed from: i */
        private boolean f19141i = true;

        /* renamed from: j */
        private boolean f19142j = false;

        /* renamed from: e */
        private int m19520e(int i10, int i11) {
            List<Integer> list = f19139k;
            return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
        }

        /* renamed from: a */
        public void m19521a(C5015c2 c5015c2) {
            C5045k0 m19496g = c5015c2.m19496g();
            if (m19496g.m19586g() != -1) {
                this.f19142j = true;
                this.f19130b.m19603p(m19520e(m19496g.m19586g(), this.f19130b.m19600m()));
            }
            this.f19130b.m19591b(c5015c2.m19496g().m19585f());
            this.f19131c.addAll(c5015c2.m19491b());
            this.f19132d.addAll(c5015c2.m19497h());
            this.f19130b.m19590a(c5015c2.m19495f());
            this.f19134f.addAll(c5015c2.m19498i());
            this.f19133e.addAll(c5015c2.m19492c());
            if (c5015c2.m19494e() != null) {
                this.f19135g = c5015c2.m19494e();
            }
            this.f19129a.addAll(c5015c2.m19499j());
            this.f19130b.m19599l().addAll(m19496g.m19584e());
            if (!this.f19129a.containsAll(this.f19130b.m19599l())) {
                C0463q1.m2202a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f19141i = false;
            }
            this.f19130b.m19594e(m19496g.m19583d());
        }

        /* renamed from: b */
        public C5015c2 m19522b() {
            if (this.f19141i) {
                ArrayList arrayList = new ArrayList(this.f19129a);
                this.f19140h.m6508d(arrayList);
                return new C5015c2(arrayList, this.f19131c, this.f19132d, this.f19134f, this.f19133e, this.f19130b.m19597h(), this.f19135g);
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        /* renamed from: c */
        public void m19523c() {
            this.f19129a.clear();
            this.f19130b.m19598i();
        }

        /* renamed from: d */
        public boolean m19524d() {
            return this.f19142j && this.f19141i;
        }
    }

    C5015c2(List<AbstractC5073r0> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<AbstractC5032h> list4, List<c> list5, C5045k0 c5045k0, InputConfiguration inputConfiguration) {
        this.f19122a = list;
        this.f19123b = Collections.unmodifiableList(list2);
        this.f19124c = Collections.unmodifiableList(list3);
        this.f19125d = Collections.unmodifiableList(list4);
        this.f19126e = Collections.unmodifiableList(list5);
        this.f19127f = c5045k0;
        this.f19128g = inputConfiguration;
    }

    /* renamed from: a */
    public static C5015c2 m19490a() {
        return new C5015c2(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C5045k0.a().m19597h(), null);
    }

    /* renamed from: b */
    public List<CameraDevice.StateCallback> m19491b() {
        return this.f19123b;
    }

    /* renamed from: c */
    public List<c> m19492c() {
        return this.f19126e;
    }

    /* renamed from: d */
    public InterfaceC5061o0 m19493d() {
        return this.f19127f.m19583d();
    }

    /* renamed from: e */
    public InputConfiguration m19494e() {
        return this.f19128g;
    }

    /* renamed from: f */
    public List<AbstractC5032h> m19495f() {
        return this.f19127f.m19581b();
    }

    /* renamed from: g */
    public C5045k0 m19496g() {
        return this.f19127f;
    }

    /* renamed from: h */
    public List<CameraCaptureSession.StateCallback> m19497h() {
        return this.f19124c;
    }

    /* renamed from: i */
    public List<AbstractC5032h> m19498i() {
        return this.f19125d;
    }

    /* renamed from: j */
    public List<AbstractC5073r0> m19499j() {
        return Collections.unmodifiableList(this.f19122a);
    }

    /* renamed from: k */
    public int m19500k() {
        return this.f19127f.m19586g();
    }
}
