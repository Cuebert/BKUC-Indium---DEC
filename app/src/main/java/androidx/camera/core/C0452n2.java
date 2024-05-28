package androidx.camera.core;

import android.util.SparseArray;
import androidx.concurrent.futures.C0541c;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p279w.InterfaceC5030g1;

/* renamed from: androidx.camera.core.n2 */
/* loaded from: classes.dex */
final class C0452n2 implements InterfaceC5030g1 {

    /* renamed from: e */
    private final List<Integer> f2024e;

    /* renamed from: f */
    private String f2025f;

    /* renamed from: a */
    final Object f2020a = new Object();

    /* renamed from: b */
    final SparseArray<C0541c.a<InterfaceC0443l1>> f2021b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<InterfaceFutureC2565m<InterfaceC0443l1>> f2022c = new SparseArray<>();

    /* renamed from: d */
    private final List<InterfaceC0443l1> f2023d = new ArrayList();

    /* renamed from: g */
    private boolean f2026g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.n2$a */
    /* loaded from: classes.dex */
    public class a implements C0541c.c<InterfaceC0443l1> {

        /* renamed from: a */
        final /* synthetic */ int f2027a;

        a(int i10) {
            this.f2027a = i10;
        }

        @Override // androidx.concurrent.futures.C0541c.c
        /* renamed from: a */
        public Object mo1498a(C0541c.a<InterfaceC0443l1> aVar) {
            synchronized (C0452n2.this.f2020a) {
                C0452n2.this.f2021b.put(this.f2027a, aVar);
            }
            return "getImageProxy(id: " + this.f2027a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0452n2(List<Integer> list, String str) {
        this.f2024e = list;
        this.f2025f = str;
        m2163f();
    }

    /* renamed from: f */
    private void m2163f() {
        synchronized (this.f2020a) {
            Iterator<Integer> it = this.f2024e.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                this.f2022c.put(intValue, C0541c.m2515a(new a(intValue)));
            }
        }
    }

    @Override // p279w.InterfaceC5030g1
    /* renamed from: a */
    public InterfaceFutureC2565m<InterfaceC0443l1> mo2164a(int i10) {
        InterfaceFutureC2565m<InterfaceC0443l1> interfaceFutureC2565m;
        synchronized (this.f2020a) {
            if (!this.f2026g) {
                interfaceFutureC2565m = this.f2022c.get(i10);
                if (interfaceFutureC2565m == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i10);
                }
            } else {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
        }
        return interfaceFutureC2565m;
    }

    @Override // p279w.InterfaceC5030g1
    /* renamed from: b */
    public List<Integer> mo2165b() {
        return Collections.unmodifiableList(this.f2024e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2166c(InterfaceC0443l1 interfaceC0443l1) {
        synchronized (this.f2020a) {
            if (this.f2026g) {
                return;
            }
            Integer num = (Integer) interfaceC0443l1.mo1857q().mo2028a().m19578c(this.f2025f);
            if (num != null) {
                C0541c.a<InterfaceC0443l1> aVar = this.f2021b.get(num.intValue());
                if (aVar != null) {
                    this.f2023d.add(interfaceC0443l1);
                    aVar.m2519c(interfaceC0443l1);
                    return;
                } else {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
            }
            throw new IllegalArgumentException("CaptureId is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m2167d() {
        synchronized (this.f2020a) {
            if (this.f2026g) {
                return;
            }
            Iterator<InterfaceC0443l1> it = this.f2023d.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f2023d.clear();
            this.f2022c.clear();
            this.f2021b.clear();
            this.f2026g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2168e() {
        synchronized (this.f2020a) {
            if (this.f2026g) {
                return;
            }
            Iterator<InterfaceC0443l1> it = this.f2023d.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f2023d.clear();
            this.f2022c.clear();
            this.f2021b.clear();
            m2163f();
        }
    }
}
