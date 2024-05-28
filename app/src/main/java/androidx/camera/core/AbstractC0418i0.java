package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0443l1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.camera.core.i0 */
/* loaded from: classes.dex */
abstract class AbstractC0418i0 implements InterfaceC0443l1 {

    /* renamed from: n */
    protected final InterfaceC0443l1 f1908n;

    /* renamed from: o */
    private final Set<a> f1909o = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.i0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: b */
        void mo1997b(InterfaceC0443l1 interfaceC0443l1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0418i0(InterfaceC0443l1 interfaceC0443l1) {
        this.f1908n = interfaceC0443l1;
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: J */
    public synchronized Image mo1852J() {
        return this.f1908n.mo1852J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m2035b(a aVar) {
        this.f1909o.add(aVar);
    }

    /* renamed from: c */
    protected void m2036c() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f1909o);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo1997b(this);
        }
    }

    @Override // androidx.camera.core.InterfaceC0443l1, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f1908n.close();
        }
        m2036c();
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: g */
    public synchronized int mo1853g() {
        return this.f1908n.mo1853g();
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    public synchronized int getHeight() {
        return this.f1908n.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: h0 */
    public synchronized int mo1854h0() {
        return this.f1908n.mo1854h0();
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: k */
    public synchronized InterfaceC0443l1.a[] mo1855k() {
        return this.f1908n.mo1855k();
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: o */
    public synchronized void mo1856o(Rect rect) {
        this.f1908n.mo1856o(rect);
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: q */
    public synchronized InterfaceC0419i1 mo1857q() {
        return this.f1908n.mo1857q();
    }
}
