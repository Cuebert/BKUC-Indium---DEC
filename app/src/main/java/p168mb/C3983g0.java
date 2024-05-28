package p168mb;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C3844i;
import p168mb.InterfaceC3985h0;

/* renamed from: mb.g0 */
/* loaded from: classes.dex */
public class C3983g0<T extends InterfaceC3985h0 & Comparable<? super T>> {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f16376b = AtomicIntegerFieldUpdater.newUpdater(C3983g0.class, "_size");
    private volatile int _size;

    /* renamed from: a */
    private T[] f16377a;

    /* renamed from: f */
    private final T[] m16735f() {
        T[] tArr = this.f16377a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC3985h0[4];
            this.f16377a = tArr2;
            return tArr2;
        }
        if (m16742c() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, m16742c() * 2);
        C3844i.m16252e(copyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((InterfaceC3985h0[]) copyOf);
        this.f16377a = tArr3;
        return tArr3;
    }

    /* renamed from: j */
    private final void m16736j(int i10) {
        f16376b.set(this, i10);
    }

    /* renamed from: k */
    private final void m16737k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= m16742c()) {
                return;
            }
            T[] tArr = this.f16377a;
            C3844i.m16250c(tArr);
            int i12 = i11 + 1;
            if (i12 < m16742c()) {
                T t10 = tArr[i12];
                C3844i.m16250c(t10);
                T t11 = tArr[i11];
                C3844i.m16250c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            C3844i.m16250c(t12);
            T t13 = tArr[i11];
            C3844i.m16250c(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            m16739m(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: l */
    private final void m16738l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f16377a;
            C3844i.m16250c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            C3844i.m16250c(t10);
            T t11 = tArr[i10];
            C3844i.m16250c(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m16739m(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: m */
    private final void m16739m(int i10, int i11) {
        T[] tArr = this.f16377a;
        C3844i.m16250c(tArr);
        T t10 = tArr[i11];
        C3844i.m16250c(t10);
        T t11 = tArr[i10];
        C3844i.m16250c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.mo16198c(i10);
        t11.mo16198c(i11);
    }

    /* renamed from: a */
    public final void m16740a(T t10) {
        t10.mo16201g(this);
        T[] m16735f = m16735f();
        int m16742c = m16742c();
        m16736j(m16742c + 1);
        m16735f[m16742c] = t10;
        t10.mo16198c(m16742c);
        m16738l(m16742c);
    }

    /* renamed from: b */
    public final T m16741b() {
        T[] tArr = this.f16377a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m16742c() {
        return f16376b.get(this);
    }

    /* renamed from: d */
    public final boolean m16743d() {
        return m16742c() == 0;
    }

    /* renamed from: e */
    public final T m16744e() {
        T m16741b;
        synchronized (this) {
            m16741b = m16741b();
        }
        return m16741b;
    }

    /* renamed from: g */
    public final boolean m16745g(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.mo16200f() == null) {
                z10 = false;
            } else {
                m16746h(t10.mo16199d());
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: h */
    public final T m16746h(int i10) {
        T[] tArr = this.f16377a;
        C3844i.m16250c(tArr);
        m16736j(m16742c() - 1);
        if (i10 < m16742c()) {
            m16739m(i10, m16742c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                C3844i.m16250c(t10);
                T t11 = tArr[i11];
                C3844i.m16250c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m16739m(i10, i11);
                    m16738l(i11);
                }
            }
            m16737k(i10);
        }
        T t12 = tArr[m16742c()];
        C3844i.m16250c(t12);
        t12.mo16201g(null);
        t12.mo16198c(-1);
        tArr[m16742c()] = null;
        return t12;
    }

    /* renamed from: i */
    public final T m16747i() {
        T m16746h;
        synchronized (this) {
            m16746h = m16742c() > 0 ? m16746h(0) : null;
        }
        return m16746h;
    }
}
