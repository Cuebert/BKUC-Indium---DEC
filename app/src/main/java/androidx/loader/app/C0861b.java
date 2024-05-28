package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.core.util.C0648b;
import androidx.lifecycle.AbstractC0856w;
import androidx.lifecycle.C0851r;
import androidx.lifecycle.C0857x;
import androidx.lifecycle.C0858y;
import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0852s;
import androidx.loader.app.AbstractC0860a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p082g1.C3228b;
import p093h0.C3363h;

/* renamed from: androidx.loader.app.b */
/* loaded from: classes.dex */
public class C0861b extends AbstractC0860a {

    /* renamed from: c */
    static boolean f4307c;

    /* renamed from: a */
    private final InterfaceC0845l f4308a;

    /* renamed from: b */
    private final c f4309b;

    /* renamed from: androidx.loader.app.b$a */
    /* loaded from: classes.dex */
    public static class a<D> extends C0851r<D> implements C3228b.b<D> {

        /* renamed from: l */
        private final int f4310l;

        /* renamed from: m */
        private final Bundle f4311m;

        /* renamed from: n */
        private final C3228b<D> f4312n;

        /* renamed from: o */
        private InterfaceC0845l f4313o;

        /* renamed from: p */
        private b<D> f4314p;

        /* renamed from: q */
        private C3228b<D> f4315q;

        a(int i10, Bundle bundle, C3228b<D> c3228b, C3228b<D> c3228b2) {
            this.f4310l = i10;
            this.f4311m = bundle;
            this.f4312n = c3228b;
            this.f4315q = c3228b2;
            c3228b.m14443q(i10, this);
        }

        @Override // p082g1.C3228b.b
        /* renamed from: a */
        public void mo4963a(C3228b<D> c3228b, D d10) {
            if (C0861b.f4307c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo4867o(d10);
                return;
            }
            if (C0861b.f4307c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo4865m(d10);
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: k */
        protected void mo4863k() {
            if (C0861b.f4307c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f4312n.m14446t();
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: l */
        protected void mo4864l() {
            if (C0861b.f4307c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f4312n.m14447u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: n */
        public void mo4866n(InterfaceC0852s<? super D> interfaceC0852s) {
            super.mo4866n(interfaceC0852s);
            this.f4313o = null;
            this.f4314p = null;
        }

        @Override // androidx.lifecycle.C0851r, androidx.lifecycle.LiveData
        /* renamed from: o */
        public void mo4867o(D d10) {
            super.mo4867o(d10);
            C3228b<D> c3228b = this.f4315q;
            if (c3228b != null) {
                c3228b.m14444r();
                this.f4315q = null;
            }
        }

        /* renamed from: p */
        C3228b<D> m4964p(boolean z10) {
            if (C0861b.f4307c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f4312n.m14431b();
            this.f4312n.m14430a();
            b<D> bVar = this.f4314p;
            if (bVar != null) {
                mo4866n(bVar);
                if (z10) {
                    bVar.m4971d();
                }
            }
            this.f4312n.m14448v(this);
            if ((bVar != null && !bVar.m4970c()) || z10) {
                this.f4312n.m14444r();
                return this.f4315q;
            }
            return this.f4312n;
        }

        /* renamed from: q */
        public void m4965q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4310l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4311m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4312n);
            this.f4312n.mo14419g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f4314p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f4314p);
                this.f4314p.m4969b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m4966r().m14433d(mo1579f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m4860h());
        }

        /* renamed from: r */
        C3228b<D> m4966r() {
            return this.f4312n;
        }

        /* renamed from: s */
        void m4967s() {
            InterfaceC0845l interfaceC0845l = this.f4313o;
            b<D> bVar = this.f4314p;
            if (interfaceC0845l == null || bVar == null) {
                return;
            }
            super.mo4866n(bVar);
            m4861i(interfaceC0845l, bVar);
        }

        /* renamed from: t */
        C3228b<D> m4968t(InterfaceC0845l interfaceC0845l, AbstractC0860a.a<D> aVar) {
            b<D> bVar = new b<>(this.f4312n, aVar);
            m4861i(interfaceC0845l, bVar);
            b<D> bVar2 = this.f4314p;
            if (bVar2 != null) {
                mo4866n(bVar2);
            }
            this.f4313o = interfaceC0845l;
            this.f4314p = bVar;
            return this.f4312n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f4310l);
            sb2.append(" : ");
            C0648b.m3451a(this.f4312n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b */
    /* loaded from: classes.dex */
    public static class b<D> implements InterfaceC0852s<D> {

        /* renamed from: a */
        private final C3228b<D> f4316a;

        /* renamed from: b */
        private final AbstractC0860a.a<D> f4317b;

        /* renamed from: c */
        private boolean f4318c = false;

        b(C3228b<D> c3228b, AbstractC0860a.a<D> aVar) {
            this.f4316a = c3228b;
            this.f4317b = aVar;
        }

        @Override // androidx.lifecycle.InterfaceC0852s
        /* renamed from: a */
        public void mo1522a(D d10) {
            if (C0861b.f4307c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f4316a + ": " + this.f4316a.m14433d(d10));
            }
            this.f4317b.mo4960b(this.f4316a, d10);
            this.f4318c = true;
        }

        /* renamed from: b */
        public void m4969b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f4318c);
        }

        /* renamed from: c */
        boolean m4970c() {
            return this.f4318c;
        }

        /* renamed from: d */
        void m4971d() {
            if (this.f4318c) {
                if (C0861b.f4307c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f4316a);
                }
                this.f4317b.mo4959a(this.f4316a);
            }
        }

        public String toString() {
            return this.f4317b.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC0856w {

        /* renamed from: e */
        private static final C0857x.a f4319e = new a();

        /* renamed from: c */
        private C3363h<a> f4320c = new C3363h<>();

        /* renamed from: d */
        private boolean f4321d = false;

        /* renamed from: androidx.loader.app.b$c$a */
        /* loaded from: classes.dex */
        static class a implements C0857x.a {
            a() {
            }

            @Override // androidx.lifecycle.C0857x.a
            /* renamed from: a */
            public <T extends AbstractC0856w> T mo4688a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        /* renamed from: g */
        static c m4972g(C0858y c0858y) {
            return (c) new C0857x(c0858y, f4319e).m4947a(c.class);
        }

        @Override // androidx.lifecycle.AbstractC0856w
        /* renamed from: d */
        public void mo4677d() {
            super.mo4677d();
            int m14854o = this.f4320c.m14854o();
            for (int i10 = 0; i10 < m14854o; i10++) {
                this.f4320c.m14855p(i10).m4964p(true);
            }
            this.f4320c.m14847d();
        }

        /* renamed from: e */
        public void m4973e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4320c.m14854o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f4320c.m14854o(); i10++) {
                    a m14855p = this.f4320c.m14855p(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4320c.m14852m(i10));
                    printWriter.print(": ");
                    printWriter.println(m14855p.toString());
                    m14855p.m4965q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: f */
        void m4974f() {
            this.f4321d = false;
        }

        /* renamed from: h */
        <D> a<D> m4975h(int i10) {
            return this.f4320c.m14849h(i10);
        }

        /* renamed from: i */
        boolean m4976i() {
            return this.f4321d;
        }

        /* renamed from: j */
        void m4977j() {
            int m14854o = this.f4320c.m14854o();
            for (int i10 = 0; i10 < m14854o; i10++) {
                this.f4320c.m14855p(i10).m4967s();
            }
        }

        /* renamed from: k */
        void m4978k(int i10, a aVar) {
            this.f4320c.m14853n(i10, aVar);
        }

        /* renamed from: l */
        void m4979l() {
            this.f4321d = true;
        }
    }

    public C0861b(InterfaceC0845l interfaceC0845l, C0858y c0858y) {
        this.f4308a = interfaceC0845l;
        this.f4309b = c.m4972g(c0858y);
    }

    /* renamed from: e */
    private <D> C3228b<D> m4962e(int i10, Bundle bundle, AbstractC0860a.a<D> aVar, C3228b<D> c3228b) {
        try {
            this.f4309b.m4979l();
            C3228b<D> mo4961c = aVar.mo4961c(i10, bundle);
            if (mo4961c != null) {
                if (mo4961c.getClass().isMemberClass() && !Modifier.isStatic(mo4961c.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo4961c);
                }
                a aVar2 = new a(i10, bundle, mo4961c, c3228b);
                if (f4307c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f4309b.m4978k(i10, aVar2);
                this.f4309b.m4974f();
                return aVar2.m4968t(this.f4308a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f4309b.m4974f();
            throw th;
        }
    }

    @Override // androidx.loader.app.AbstractC0860a
    @Deprecated
    /* renamed from: a */
    public void mo4956a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4309b.m4973e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC0860a
    /* renamed from: c */
    public <D> C3228b<D> mo4957c(int i10, Bundle bundle, AbstractC0860a.a<D> aVar) {
        if (!this.f4309b.m4976i()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a<D> m4975h = this.f4309b.m4975h(i10);
                if (f4307c) {
                    Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
                }
                if (m4975h == null) {
                    return m4962e(i10, bundle, aVar, null);
                }
                if (f4307c) {
                    Log.v("LoaderManager", "  Re-using existing loader " + m4975h);
                }
                return m4975h.m4968t(this.f4308a, aVar);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.AbstractC0860a
    /* renamed from: d */
    public void mo4958d() {
        this.f4309b.m4977j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C0648b.m3451a(this.f4308a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
