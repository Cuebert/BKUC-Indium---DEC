package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC2024r5;
import java.util.HashSet;
import java.util.List;
import p171n1.C4018e0;
import p171n1.C4020f0;
import p171n1.C4022g0;
import p171n1.C4024h0;

/* renamed from: com.android.billingclient.api.h */
/* loaded from: classes.dex */
public final class C1183h {

    /* renamed from: a */
    private final AbstractC2024r5 f5640a;

    /* renamed from: com.android.billingclient.api.h$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private AbstractC2024r5 f5641a;

        /* synthetic */ a(C4018e0 c4018e0) {
        }

        /* renamed from: a */
        public C1183h m6937a() {
            return new C1183h(this, null);
        }

        /* renamed from: b */
        public a m6938b(List<b> list) {
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (b bVar : list) {
                    if (!"play_pass_subs".equals(bVar.m6941c())) {
                        hashSet.add(bVar.m6941c());
                    }
                }
                if (hashSet.size() <= 1) {
                    this.f5641a = AbstractC2024r5.m9559r(list);
                    return this;
                }
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
    }

    /* renamed from: com.android.billingclient.api.h$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final String f5642a;

        /* renamed from: b */
        private final String f5643b;

        /* renamed from: com.android.billingclient.api.h$b$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private String f5644a;

            /* renamed from: b */
            private String f5645b;

            /* synthetic */ a(C4020f0 c4020f0) {
            }

            /* renamed from: a */
            public b m6944a() {
                if (!"first_party".equals(this.f5645b)) {
                    if (this.f5644a != null) {
                        if (this.f5645b != null) {
                            return new b(this, null);
                        }
                        throw new IllegalArgumentException("Product type must be provided.");
                    }
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }

            /* renamed from: b */
            public a m6945b(String str) {
                this.f5644a = str;
                return this;
            }

            /* renamed from: c */
            public a m6946c(String str) {
                this.f5645b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, C4022g0 c4022g0) {
            this.f5642a = aVar.f5644a;
            this.f5643b = aVar.f5645b;
        }

        /* renamed from: a */
        public static a m6939a() {
            return new a(null);
        }

        /* renamed from: b */
        public final String m6940b() {
            return this.f5642a;
        }

        /* renamed from: c */
        public final String m6941c() {
            return this.f5643b;
        }
    }

    /* synthetic */ C1183h(a aVar, C4024h0 c4024h0) {
        this.f5640a = aVar.f5641a;
    }

    /* renamed from: a */
    public static a m6933a() {
        return new a(null);
    }

    /* renamed from: b */
    public final AbstractC2024r5 m6934b() {
        return this.f5640a;
    }

    /* renamed from: c */
    public final String m6935c() {
        return ((b) this.f5640a.get(0)).m6941c();
    }
}
