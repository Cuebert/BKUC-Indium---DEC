package p318z;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.C0401e1;
import androidx.camera.core.C0403e3;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0492x2;
import androidx.camera.core.C0499z1;
import androidx.camera.core.InterfaceC0437k;
import androidx.camera.core.InterfaceC0465r;
import androidx.core.util.C0654h;
import androidx.core.util.InterfaceC0647a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p279w.C5090x;
import p279w.InterfaceC5009b0;
import p279w.InterfaceC5017d0;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5063o2;
import p279w.InterfaceC5067p2;
import p279w.InterfaceC5078t;
import p279w.InterfaceC5093y;
import p279w.InterfaceC5096z;
import p292x.C5493a;

/* renamed from: z.e */
/* loaded from: classes.dex */
public final class C5937e implements InterfaceC0437k {

    /* renamed from: n */
    private InterfaceC5017d0 f21828n;

    /* renamed from: o */
    private final LinkedHashSet<InterfaceC5017d0> f21829o;

    /* renamed from: p */
    private final InterfaceC5096z f21830p;

    /* renamed from: q */
    private final InterfaceC5067p2 f21831q;

    /* renamed from: r */
    private final b f21832r;

    /* renamed from: t */
    private C0403e3 f21834t;

    /* renamed from: s */
    private final List<AbstractC0496y2> f21833s = new ArrayList();

    /* renamed from: u */
    private InterfaceC5078t f21835u = C5090x.m19721a();

    /* renamed from: v */
    private final Object f21836v = new Object();

    /* renamed from: w */
    private boolean f21837w = true;

    /* renamed from: x */
    private InterfaceC5061o0 f21838x = null;

    /* renamed from: y */
    private List<AbstractC0496y2> f21839y = new ArrayList();

    /* renamed from: z.e$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: z.e$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List<String> f21840a = new ArrayList();

        b(LinkedHashSet<InterfaceC5017d0> linkedHashSet) {
            Iterator<InterfaceC5017d0> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f21840a.add(it.next().mo1461h().mo1569c());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f21840a.equals(((b) obj).f21840a);
            }
            return false;
        }

        public int hashCode() {
            return this.f21840a.hashCode() * 53;
        }
    }

    /* renamed from: z.e$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        InterfaceC5063o2<?> f21841a;

        /* renamed from: b */
        InterfaceC5063o2<?> f21842b;

        c(InterfaceC5063o2<?> interfaceC5063o2, InterfaceC5063o2<?> interfaceC5063o22) {
            this.f21841a = interfaceC5063o2;
            this.f21842b = interfaceC5063o22;
        }
    }

    public C5937e(LinkedHashSet<InterfaceC5017d0> linkedHashSet, InterfaceC5096z interfaceC5096z, InterfaceC5067p2 interfaceC5067p2) {
        this.f21828n = linkedHashSet.iterator().next();
        LinkedHashSet<InterfaceC5017d0> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f21829o = linkedHashSet2;
        this.f21832r = new b(linkedHashSet2);
        this.f21830p = interfaceC5096z;
        this.f21831q = interfaceC5067p2;
    }

    /* renamed from: A */
    private boolean m21101A(List<AbstractC0496y2> list) {
        boolean z10 = false;
        boolean z11 = false;
        for (AbstractC0496y2 abstractC0496y2 : list) {
            if (m21103C(abstractC0496y2)) {
                z11 = true;
            } else if (m21102B(abstractC0496y2)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    /* renamed from: B */
    private boolean m21102B(AbstractC0496y2 abstractC0496y2) {
        return abstractC0496y2 instanceof C0401e1;
    }

    /* renamed from: C */
    private boolean m21103C(AbstractC0496y2 abstractC0496y2) {
        return abstractC0496y2 instanceof C0499z1;
    }

    /* renamed from: D */
    public static /* synthetic */ void m21104D(Surface surface, SurfaceTexture surfaceTexture, C0492x2.f fVar) {
        surface.release();
        surfaceTexture.release();
    }

    /* renamed from: E */
    public static /* synthetic */ void m21105E(C0492x2 c0492x2) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(c0492x2.m2267l().getWidth(), c0492x2.m2267l().getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        c0492x2.m2269v(surface, C5493a.m20219a(), new InterfaceC0647a() { // from class: z.d

            /* renamed from: a */
            public final /* synthetic */ Surface f21826a;

            /* renamed from: b */
            public final /* synthetic */ SurfaceTexture f21827b;

            public /* synthetic */ C5936d(Surface surface2, SurfaceTexture surfaceTexture2) {
                r1 = surface2;
                r2 = surfaceTexture2;
            }

            @Override // androidx.core.util.InterfaceC0647a
            /* renamed from: a */
            public final void mo2469a(Object obj) {
                C5937e.m21104D(r1, r2, (C0492x2.f) obj);
            }
        });
    }

    /* renamed from: G */
    private void m21106G() {
        synchronized (this.f21836v) {
            if (this.f21838x != null) {
                this.f21828n.mo1468l().mo1731f(this.f21838x);
            }
        }
    }

    /* renamed from: I */
    private void m21107I(Map<AbstractC0496y2, Size> map, Collection<AbstractC0496y2> collection) {
        synchronized (this.f21836v) {
            if (this.f21834t != null) {
                Map<AbstractC0496y2, Rect> m21135a = C5946n.m21135a(this.f21828n.mo1468l().mo1733g(), this.f21828n.mo1461h().mo1567a().intValue() == 0, this.f21834t.m2001a(), this.f21828n.mo1461h().mo1571e(this.f21834t.m2003c()), this.f21834t.m2004d(), this.f21834t.m2002b(), map);
                for (AbstractC0496y2 abstractC0496y2 : collection) {
                    abstractC0496y2.mo2142H((Rect) C0654h.m3467f(m21135a.get(abstractC0496y2)));
                    abstractC0496y2.mo1971G(m21112o(this.f21828n.mo1468l().mo1733g(), map.get(abstractC0496y2)));
                }
            }
        }
    }

    /* renamed from: m */
    private void m21110m() {
        synchronized (this.f21836v) {
            InterfaceC5093y mo1468l = this.f21828n.mo1468l();
            this.f21838x = mo1468l.mo1725c();
            mo1468l.mo1729e();
        }
    }

    /* renamed from: n */
    private List<AbstractC0496y2> m21111n(List<AbstractC0496y2> list, List<AbstractC0496y2> list2) {
        ArrayList arrayList = new ArrayList(list2);
        boolean m21101A = m21101A(list);
        boolean m21120z = m21120z(list);
        AbstractC0496y2 abstractC0496y2 = null;
        AbstractC0496y2 abstractC0496y22 = null;
        for (AbstractC0496y2 abstractC0496y23 : list2) {
            if (m21103C(abstractC0496y23)) {
                abstractC0496y2 = abstractC0496y23;
            } else if (m21102B(abstractC0496y23)) {
                abstractC0496y22 = abstractC0496y23;
            }
        }
        if (m21101A && abstractC0496y2 == null) {
            arrayList.add(m21115r());
        } else if (!m21101A && abstractC0496y2 != null) {
            arrayList.remove(abstractC0496y2);
        }
        if (m21120z && abstractC0496y22 == null) {
            arrayList.add(m21114q());
        } else if (!m21120z && abstractC0496y22 != null) {
            arrayList.remove(abstractC0496y22);
        }
        return arrayList;
    }

    /* renamed from: o */
    private static Matrix m21112o(Rect rect, Size size) {
        C0654h.m3463b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* renamed from: p */
    private Map<AbstractC0496y2, Size> m21113p(InterfaceC5009b0 interfaceC5009b0, List<AbstractC0496y2> list, List<AbstractC0496y2> list2, Map<AbstractC0496y2, c> map) {
        ArrayList arrayList = new ArrayList();
        String mo1569c = interfaceC5009b0.mo1569c();
        HashMap hashMap = new HashMap();
        for (AbstractC0496y2 abstractC0496y2 : list2) {
            arrayList.add(this.f21830p.mo1333a(mo1569c, abstractC0496y2.m2306i(), abstractC0496y2.m2301c()));
            hashMap.put(abstractC0496y2, abstractC0496y2.m2301c());
        }
        if (!list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (AbstractC0496y2 abstractC0496y22 : list) {
                c cVar = map.get(abstractC0496y22);
                hashMap2.put(abstractC0496y22.m2313q(interfaceC5009b0, cVar.f21841a, cVar.f21842b), abstractC0496y22);
            }
            Map<InterfaceC5063o2<?>, Size> mo1334b = this.f21830p.mo1334b(mo1569c, arrayList, new ArrayList(hashMap2.keySet()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((AbstractC0496y2) entry.getValue(), mo1334b.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    /* renamed from: q */
    private C0401e1 m21114q() {
        return new C0401e1.f().m1988i("ImageCapture-Extra").m1983c();
    }

    /* renamed from: r */
    private C0499z1 m21115r() {
        C0499z1 m2348c = new C0499z1.b().m2353i("Preview-Extra").m2348c();
        m2348c.m2345S(C5935c.f21825a);
        return m2348c;
    }

    /* renamed from: s */
    private void m21116s(List<AbstractC0496y2> list) {
        synchronized (this.f21836v) {
            if (!list.isEmpty()) {
                this.f21828n.mo1457f(list);
                for (AbstractC0496y2 abstractC0496y2 : list) {
                    if (this.f21833s.contains(abstractC0496y2)) {
                        abstractC0496y2.m2320z(this.f21828n);
                    } else {
                        C0463q1.m2204c("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + abstractC0496y2);
                    }
                }
                this.f21833s.removeAll(list);
            }
        }
    }

    /* renamed from: u */
    public static b m21117u(LinkedHashSet<InterfaceC5017d0> linkedHashSet) {
        return new b(linkedHashSet);
    }

    /* renamed from: w */
    private Map<AbstractC0496y2, c> m21118w(List<AbstractC0496y2> list, InterfaceC5067p2 interfaceC5067p2, InterfaceC5067p2 interfaceC5067p22) {
        HashMap hashMap = new HashMap();
        for (AbstractC0496y2 abstractC0496y2 : list) {
            hashMap.put(abstractC0496y2, new c(abstractC0496y2.mo1921h(false, interfaceC5067p2), abstractC0496y2.mo1921h(true, interfaceC5067p22)));
        }
        return hashMap;
    }

    /* renamed from: y */
    private boolean m21119y() {
        boolean z10;
        synchronized (this.f21836v) {
            z10 = true;
            if (this.f21835u.mo19695F() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: z */
    private boolean m21120z(List<AbstractC0496y2> list) {
        boolean z10 = false;
        boolean z11 = false;
        for (AbstractC0496y2 abstractC0496y2 : list) {
            if (m21103C(abstractC0496y2)) {
                z10 = true;
            } else if (m21102B(abstractC0496y2)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    /* renamed from: F */
    public void m21121F(Collection<AbstractC0496y2> collection) {
        synchronized (this.f21836v) {
            m21116s(new ArrayList(collection));
            if (m21119y()) {
                this.f21839y.removeAll(collection);
                try {
                    m21126i(Collections.emptyList());
                } catch (a unused) {
                    throw new IllegalArgumentException("Failed to add extra fake Preview or ImageCapture use case!");
                }
            }
        }
    }

    /* renamed from: H */
    public void m21122H(C0403e3 c0403e3) {
        synchronized (this.f21836v) {
            this.f21834t = c0403e3;
        }
    }

    /* renamed from: a */
    public void m21123a(boolean z10) {
        this.f21828n.mo1449a(z10);
    }

    /* renamed from: b */
    public InterfaceC0465r m21124b() {
        return this.f21828n.mo1461h();
    }

    /* renamed from: g */
    public void m21125g(InterfaceC5078t interfaceC5078t) {
        synchronized (this.f21836v) {
            if (interfaceC5078t == null) {
                interfaceC5078t = C5090x.m19721a();
            }
            if (!this.f21833s.isEmpty() && !this.f21835u.mo19698s().equals(interfaceC5078t.mo19698s())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.f21835u = interfaceC5078t;
            this.f21828n.mo1459g(interfaceC5078t);
        }
    }

    /* renamed from: i */
    public void m21126i(Collection<AbstractC0496y2> collection) throws a {
        synchronized (this.f21836v) {
            ArrayList<AbstractC0496y2> arrayList = new ArrayList();
            for (AbstractC0496y2 abstractC0496y2 : collection) {
                if (this.f21833s.contains(abstractC0496y2)) {
                    C0463q1.m2202a("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(abstractC0496y2);
                }
            }
            List<AbstractC0496y2> arrayList2 = new ArrayList<>(this.f21833s);
            List<AbstractC0496y2> emptyList = Collections.emptyList();
            List<AbstractC0496y2> emptyList2 = Collections.emptyList();
            if (m21119y()) {
                arrayList2.removeAll(this.f21839y);
                arrayList2.addAll(arrayList);
                emptyList = m21111n(arrayList2, new ArrayList<>(this.f21839y));
                ArrayList arrayList3 = new ArrayList(emptyList);
                arrayList3.removeAll(this.f21839y);
                arrayList.addAll(arrayList3);
                emptyList2 = new ArrayList<>(this.f21839y);
                emptyList2.removeAll(emptyList);
            }
            Map<AbstractC0496y2, c> m21118w = m21118w(arrayList, this.f21835u.mo19696h(), this.f21831q);
            try {
                List<AbstractC0496y2> arrayList4 = new ArrayList<>(this.f21833s);
                arrayList4.removeAll(emptyList2);
                Map<AbstractC0496y2, Size> m21113p = m21113p(this.f21828n.mo1461h(), arrayList, arrayList4, m21118w);
                m21107I(m21113p, collection);
                this.f21839y = emptyList;
                m21116s(emptyList2);
                for (AbstractC0496y2 abstractC0496y22 : arrayList) {
                    c cVar = m21118w.get(abstractC0496y22);
                    abstractC0496y22.m2319w(this.f21828n, cVar.f21841a, cVar.f21842b);
                    abstractC0496y22.m2299J((Size) C0654h.m3467f(m21113p.get(abstractC0496y22)));
                }
                this.f21833s.addAll(arrayList);
                if (this.f21837w) {
                    this.f21828n.mo1454d(arrayList);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0496y2) it.next()).m2317u();
                }
            } catch (IllegalArgumentException e10) {
                throw new a(e10.getMessage());
            }
        }
    }

    /* renamed from: j */
    public void m21127j() {
        synchronized (this.f21836v) {
            if (!this.f21837w) {
                this.f21828n.mo1454d(this.f21833s);
                m21106G();
                Iterator<AbstractC0496y2> it = this.f21833s.iterator();
                while (it.hasNext()) {
                    it.next().m2317u();
                }
                this.f21837w = true;
            }
        }
    }

    /* renamed from: t */
    public void m21128t() {
        synchronized (this.f21836v) {
            if (this.f21837w) {
                this.f21828n.mo1457f(new ArrayList(this.f21833s));
                m21110m();
                this.f21837w = false;
            }
        }
    }

    /* renamed from: v */
    public b m21129v() {
        return this.f21832r;
    }

    /* renamed from: x */
    public List<AbstractC0496y2> m21130x() {
        ArrayList arrayList;
        synchronized (this.f21836v) {
            arrayList = new ArrayList(this.f21833s);
        }
        return arrayList;
    }
}
