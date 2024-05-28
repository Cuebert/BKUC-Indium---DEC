package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import p085g4.C3265m;
import p295x2.C5506a;
import p295x2.C5506a.b;
import p308y2.C5609e0;
import p308y2.InterfaceC5620k;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC1352d<A extends C5506a.b, ResultT> {

    /* renamed from: a */
    private final Feature[] f6187a;

    /* renamed from: b */
    private final boolean f6188b;

    /* renamed from: c */
    private final int f6189c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* loaded from: classes.dex */
    public static class a<A extends C5506a.b, ResultT> {

        /* renamed from: a */
        private InterfaceC5620k<A, C3265m<ResultT>> f6190a;

        /* renamed from: c */
        private Feature[] f6192c;

        /* renamed from: b */
        private boolean f6191b = true;

        /* renamed from: d */
        private int f6193d = 0;

        /* synthetic */ a(C5609e0 c5609e0) {
        }

        /* renamed from: a */
        public AbstractC1352d<A, ResultT> m7503a() {
            C5984j.m21278b(this.f6190a != null, "execute parameter required");
            return new C1373u(this, this.f6192c, this.f6191b, this.f6193d);
        }

        /* renamed from: b */
        public a<A, ResultT> m7504b(InterfaceC5620k<A, C3265m<ResultT>> interfaceC5620k) {
            this.f6190a = interfaceC5620k;
            return this;
        }

        /* renamed from: c */
        public a<A, ResultT> m7505c(boolean z10) {
            this.f6191b = z10;
            return this;
        }

        /* renamed from: d */
        public a<A, ResultT> m7506d(Feature... featureArr) {
            this.f6192c = featureArr;
            return this;
        }

        /* renamed from: e */
        public a<A, ResultT> m7507e(int i10) {
            this.f6193d = i10;
            return this;
        }
    }

    public AbstractC1352d(Feature[] featureArr, boolean z10, int i10) {
        this.f6187a = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.f6188b = z11;
        this.f6189c = i10;
    }

    /* renamed from: a */
    public static <A extends C5506a.b, ResultT> a<A, ResultT> m7497a() {
        return new a<>(null);
    }

    /* renamed from: b */
    public abstract void mo7498b(A a10, C3265m<ResultT> c3265m) throws RemoteException;

    /* renamed from: c */
    public boolean m7499c() {
        return this.f6188b;
    }

    /* renamed from: d */
    public final int m7500d() {
        return this.f6189c;
    }

    /* renamed from: e */
    public final Feature[] m7501e() {
        return this.f6187a;
    }
}
