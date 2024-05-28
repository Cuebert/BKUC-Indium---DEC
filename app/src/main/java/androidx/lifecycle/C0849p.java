package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p157m.C3912b;

/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public class C0849p<T> extends C0851r<T> {

    /* renamed from: l */
    private C3912b<LiveData<?>, a<?>> f4285l = new C3912b<>();

    /* renamed from: androidx.lifecycle.p$a */
    /* loaded from: classes.dex */
    private static class a<V> implements InterfaceC0852s<V> {

        /* renamed from: a */
        final LiveData<V> f4286a;

        /* renamed from: b */
        final InterfaceC0852s<? super V> f4287b;

        /* renamed from: c */
        int f4288c = -1;

        a(LiveData<V> liveData, InterfaceC0852s<? super V> interfaceC0852s) {
            this.f4286a = liveData;
            this.f4287b = interfaceC0852s;
        }

        @Override // androidx.lifecycle.InterfaceC0852s
        /* renamed from: a */
        public void mo1522a(V v10) {
            if (this.f4288c != this.f4286a.m4859g()) {
                this.f4288c = this.f4286a.m4859g();
                this.f4287b.mo1522a(v10);
            }
        }

        /* renamed from: b */
        void m4922b() {
            this.f4286a.m4862j(this);
        }

        /* renamed from: c */
        void m4923c() {
            this.f4286a.mo4866n(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: k */
    protected void mo4863k() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4285l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m4922b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: l */
    protected void mo4864l() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4285l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m4923c();
        }
    }

    /* renamed from: p */
    public <S> void m4920p(LiveData<S> liveData, InterfaceC0852s<? super S> interfaceC0852s) {
        a<?> aVar = new a<>(liveData, interfaceC0852s);
        a<?> mo16580m = this.f4285l.mo16580m(liveData, aVar);
        if (mo16580m != null && mo16580m.f4287b != interfaceC0852s) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (mo16580m == null && m4860h()) {
            aVar.m4922b();
        }
    }

    /* renamed from: q */
    public <S> void m4921q(LiveData<S> liveData) {
        a<?> mo16581o = this.f4285l.mo16581o(liveData);
        if (mo16581o != null) {
            mo16581o.m4923c();
        }
    }
}
