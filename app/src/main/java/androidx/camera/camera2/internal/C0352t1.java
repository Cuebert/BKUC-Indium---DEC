package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.t1 */
/* loaded from: classes.dex */
public class C0352t1 {

    /* renamed from: a */
    final Executor f1595a;

    /* renamed from: b */
    final Object f1596b = new Object();

    /* renamed from: c */
    final Set<InterfaceC0313j2> f1597c = new LinkedHashSet();

    /* renamed from: d */
    final Set<InterfaceC0313j2> f1598d = new LinkedHashSet();

    /* renamed from: e */
    final Set<InterfaceC0313j2> f1599e = new LinkedHashSet();

    /* renamed from: f */
    private final CameraDevice.StateCallback f1600f = new a();

    /* renamed from: androidx.camera.camera2.internal.t1$a */
    /* loaded from: classes.dex */
    class a extends CameraDevice.StateCallback {
        a() {
        }

        /* renamed from: b */
        private void m1768b() {
            List<InterfaceC0313j2> m1761g;
            synchronized (C0352t1.this.f1596b) {
                m1761g = C0352t1.this.m1761g();
                C0352t1.this.f1599e.clear();
                C0352t1.this.f1597c.clear();
                C0352t1.this.f1598d.clear();
            }
            Iterator<InterfaceC0313j2> it = m1761g.iterator();
            while (it.hasNext()) {
                it.next().mo1583b();
            }
        }

        /* renamed from: c */
        private void m1769c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C0352t1.this.f1596b) {
                linkedHashSet.addAll(C0352t1.this.f1599e);
                linkedHashSet.addAll(C0352t1.this.f1597c);
            }
            C0352t1.this.f1595a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.s1
                @Override // java.lang.Runnable
                public final void run() {
                    C0352t1.m1756b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            m1768b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            m1769c();
            m1768b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            m1769c();
            m1768b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0352t1(Executor executor) {
        this.f1595a = executor;
    }

    /* renamed from: a */
    private void m1755a(InterfaceC0313j2 interfaceC0313j2) {
        InterfaceC0313j2 next;
        Iterator<InterfaceC0313j2> it = m1761g().iterator();
        while (it.hasNext() && (next = it.next()) != interfaceC0313j2) {
            next.mo1583b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m1756b(Set<InterfaceC0313j2> set) {
        for (InterfaceC0313j2 interfaceC0313j2 : set) {
            interfaceC0313j2.mo1582a().mo1593p(interfaceC0313j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public CameraDevice.StateCallback m1757c() {
        return this.f1600f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public List<InterfaceC0313j2> m1758d() {
        ArrayList arrayList;
        synchronized (this.f1596b) {
            arrayList = new ArrayList(this.f1597c);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public List<InterfaceC0313j2> m1759e() {
        ArrayList arrayList;
        synchronized (this.f1596b) {
            arrayList = new ArrayList(this.f1598d);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public List<InterfaceC0313j2> m1760f() {
        ArrayList arrayList;
        synchronized (this.f1596b) {
            arrayList = new ArrayList(this.f1599e);
        }
        return arrayList;
    }

    /* renamed from: g */
    List<InterfaceC0313j2> m1761g() {
        ArrayList arrayList;
        synchronized (this.f1596b) {
            arrayList = new ArrayList();
            arrayList.addAll(m1758d());
            arrayList.addAll(m1760f());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1762h(InterfaceC0313j2 interfaceC0313j2) {
        synchronized (this.f1596b) {
            this.f1597c.remove(interfaceC0313j2);
            this.f1598d.remove(interfaceC0313j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m1763i(InterfaceC0313j2 interfaceC0313j2) {
        synchronized (this.f1596b) {
            this.f1598d.add(interfaceC0313j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m1764j(InterfaceC0313j2 interfaceC0313j2) {
        m1755a(interfaceC0313j2);
        synchronized (this.f1596b) {
            this.f1599e.remove(interfaceC0313j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m1765k(InterfaceC0313j2 interfaceC0313j2) {
        synchronized (this.f1596b) {
            this.f1597c.add(interfaceC0313j2);
            this.f1599e.remove(interfaceC0313j2);
        }
        m1755a(interfaceC0313j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m1766l(InterfaceC0313j2 interfaceC0313j2) {
        synchronized (this.f1596b) {
            this.f1599e.add(interfaceC0313j2);
        }
    }
}
