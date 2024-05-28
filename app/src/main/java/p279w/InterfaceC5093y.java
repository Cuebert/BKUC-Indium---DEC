package p279w;

import android.graphics.Rect;
import android.util.Size;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.Collections;
import java.util.List;
import p279w.C5015c2;
import p305y.C5586f;

/* renamed from: w.y */
/* loaded from: classes.dex */
public interface InterfaceC5093y {

    /* renamed from: a */
    public static final InterfaceC5093y f19351a = new a();

    /* renamed from: w.y$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5093y {
        a() {
        }

        @Override // p279w.InterfaceC5093y
        /* renamed from: a */
        public void mo1721a(Size size, C5015c2.b bVar) {
        }

        @Override // p279w.InterfaceC5093y
        /* renamed from: b */
        public void mo1723b(boolean z10) {
        }

        @Override // p279w.InterfaceC5093y
        /* renamed from: c */
        public InterfaceC5061o0 mo1725c() {
            return null;
        }

        @Override // p279w.InterfaceC5093y
        /* renamed from: d */
        public InterfaceFutureC2565m<List<Void>> mo1727d(List<C5045k0> list, int i10, int i11) {
            return C5586f.m20508h(Collections.emptyList());
        }

        @Override // p279w.InterfaceC5093y
        /* renamed from: e */
        public void mo1729e() {
        }

        @Override // p279w.InterfaceC5093y
        /* renamed from: f */
        public void mo1731f(InterfaceC5061o0 interfaceC5061o0) {
        }

        @Override // p279w.InterfaceC5093y
        /* renamed from: g */
        public Rect mo1733g() {
            return new Rect();
        }

        @Override // p279w.InterfaceC5093y
        /* renamed from: h */
        public void mo1734h(int i10) {
        }
    }

    /* renamed from: w.y$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: n */
        private C5040j f19352n;

        public b(C5040j c5040j) {
            this.f19352n = c5040j;
        }
    }

    /* renamed from: w.y$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo1477a();

        /* renamed from: b */
        void mo1478b(List<C5045k0> list);
    }

    /* renamed from: a */
    void mo1721a(Size size, C5015c2.b bVar);

    /* renamed from: b */
    void mo1723b(boolean z10);

    /* renamed from: c */
    InterfaceC5061o0 mo1725c();

    /* renamed from: d */
    InterfaceFutureC2565m<List<Void>> mo1727d(List<C5045k0> list, int i10, int i11);

    /* renamed from: e */
    void mo1729e();

    /* renamed from: f */
    void mo1731f(InterfaceC5061o0 interfaceC5061o0);

    /* renamed from: g */
    Rect mo1733g();

    /* renamed from: h */
    void mo1734h(int i10);
}
