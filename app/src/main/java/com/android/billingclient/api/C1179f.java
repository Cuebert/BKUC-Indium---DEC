package com.android.billingclient.api;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.play_billing.C1907b0;
import p171n1.C4046v;

/* renamed from: com.android.billingclient.api.f */
/* loaded from: classes.dex */
public final class C1179f {

    /* renamed from: a */
    private int f5595a;

    /* renamed from: b */
    private String f5596b;

    /* renamed from: com.android.billingclient.api.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f5597a;

        /* renamed from: b */
        private String f5598b = BuildConfig.FLAVOR;

        /* synthetic */ a(C4046v c4046v) {
        }

        /* renamed from: a */
        public C1179f m6913a() {
            C1179f c1179f = new C1179f();
            c1179f.f5595a = this.f5597a;
            c1179f.f5596b = this.f5598b;
            return c1179f;
        }

        /* renamed from: b */
        public a m6914b(String str) {
            this.f5598b = str;
            return this;
        }

        /* renamed from: c */
        public a m6915c(int i10) {
            this.f5597a = i10;
            return this;
        }
    }

    /* renamed from: c */
    public static a m6908c() {
        return new a(null);
    }

    /* renamed from: a */
    public String m6911a() {
        return this.f5596b;
    }

    /* renamed from: b */
    public int m6912b() {
        return this.f5595a;
    }

    public String toString() {
        return "Response Code: " + C1907b0.m9247f(this.f5595a) + ", Debug Message: " + this.f5596b;
    }
}
