package p231s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: s.g */
/* loaded from: classes.dex */
public final class C4487g {

    /* renamed from: a */
    private final c f18182a;

    /* renamed from: s.g$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final List<C4482b> f18185a;

        /* renamed from: b */
        private final CameraCaptureSession.StateCallback f18186b;

        /* renamed from: c */
        private final Executor f18187c;

        /* renamed from: d */
        private int f18188d;

        /* renamed from: e */
        private C4481a f18189e = null;

        /* renamed from: f */
        private CaptureRequest f18190f = null;

        b(int i10, List<C4482b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f18188d = i10;
            this.f18185a = Collections.unmodifiableList(new ArrayList(list));
            this.f18186b = stateCallback;
            this.f18187c = executor;
        }

        @Override // p231s.C4487g.c
        /* renamed from: a */
        public CameraCaptureSession.StateCallback mo18456a() {
            return this.f18186b;
        }

        @Override // p231s.C4487g.c
        /* renamed from: b */
        public C4481a mo18457b() {
            return this.f18189e;
        }

        @Override // p231s.C4487g.c
        /* renamed from: c */
        public Executor mo18458c() {
            return this.f18187c;
        }

        @Override // p231s.C4487g.c
        /* renamed from: d */
        public Object mo18459d() {
            return null;
        }

        @Override // p231s.C4487g.c
        /* renamed from: e */
        public int mo18460e() {
            return this.f18188d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f18189e, bVar.f18189e) && this.f18188d == bVar.f18188d && this.f18185a.size() == bVar.f18185a.size()) {
                    for (int i10 = 0; i10 < this.f18185a.size(); i10++) {
                        if (!this.f18185a.get(i10).equals(bVar.f18185a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // p231s.C4487g.c
        /* renamed from: f */
        public List<C4482b> mo18461f() {
            return this.f18185a;
        }

        @Override // p231s.C4487g.c
        /* renamed from: g */
        public void mo18462g(CaptureRequest captureRequest) {
            this.f18190f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f18185a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            C4481a c4481a = this.f18189e;
            int hashCode2 = (c4481a == null ? 0 : c4481a.hashCode()) ^ i10;
            return this.f18188d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* renamed from: s.g$c */
    /* loaded from: classes.dex */
    private interface c {
        /* renamed from: a */
        CameraCaptureSession.StateCallback mo18456a();

        /* renamed from: b */
        C4481a mo18457b();

        /* renamed from: c */
        Executor mo18458c();

        /* renamed from: d */
        Object mo18459d();

        /* renamed from: e */
        int mo18460e();

        /* renamed from: f */
        List<C4482b> mo18461f();

        /* renamed from: g */
        void mo18462g(CaptureRequest captureRequest);
    }

    public C4487g(int i10, List<C4482b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f18182a = new b(i10, list, executor, stateCallback);
        } else {
            this.f18182a = new a(i10, list, executor, stateCallback);
        }
    }

    /* renamed from: g */
    public static List<OutputConfiguration> m18447g(List<C4482b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C4482b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().m18436d());
        }
        return arrayList;
    }

    /* renamed from: h */
    static List<C4482b> m18448h(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C4482b.m18432e(it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public Executor m18449a() {
        return this.f18182a.mo18458c();
    }

    /* renamed from: b */
    public C4481a m18450b() {
        return this.f18182a.mo18457b();
    }

    /* renamed from: c */
    public List<C4482b> m18451c() {
        return this.f18182a.mo18461f();
    }

    /* renamed from: d */
    public int m18452d() {
        return this.f18182a.mo18460e();
    }

    /* renamed from: e */
    public CameraCaptureSession.StateCallback m18453e() {
        return this.f18182a.mo18456a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4487g) {
            return this.f18182a.equals(((C4487g) obj).f18182a);
        }
        return false;
    }

    /* renamed from: f */
    public void m18454f(CaptureRequest captureRequest) {
        this.f18182a.mo18462g(captureRequest);
    }

    public int hashCode() {
        return this.f18182a.hashCode();
    }

    /* renamed from: i */
    public Object m18455i() {
        return this.f18182a.mo18459d();
    }

    /* renamed from: s.g$a */
    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a */
        private final SessionConfiguration f18183a;

        /* renamed from: b */
        private final List<C4482b> f18184b;

        a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f18183a = sessionConfiguration;
            this.f18184b = Collections.unmodifiableList(C4487g.m18448h(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // p231s.C4487g.c
        /* renamed from: a */
        public CameraCaptureSession.StateCallback mo18456a() {
            return this.f18183a.getStateCallback();
        }

        @Override // p231s.C4487g.c
        /* renamed from: b */
        public C4481a mo18457b() {
            return C4481a.m18429b(this.f18183a.getInputConfiguration());
        }

        @Override // p231s.C4487g.c
        /* renamed from: c */
        public Executor mo18458c() {
            return this.f18183a.getExecutor();
        }

        @Override // p231s.C4487g.c
        /* renamed from: d */
        public Object mo18459d() {
            return this.f18183a;
        }

        @Override // p231s.C4487g.c
        /* renamed from: e */
        public int mo18460e() {
            return this.f18183a.getSessionType();
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f18183a, ((a) obj).f18183a);
            }
            return false;
        }

        @Override // p231s.C4487g.c
        /* renamed from: f */
        public List<C4482b> mo18461f() {
            return this.f18184b;
        }

        @Override // p231s.C4487g.c
        /* renamed from: g */
        public void mo18462g(CaptureRequest captureRequest) {
            this.f18183a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f18183a.hashCode();
        }

        a(int i10, List<C4482b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, C4487g.m18447g(list), executor, stateCallback));
        }
    }
}
