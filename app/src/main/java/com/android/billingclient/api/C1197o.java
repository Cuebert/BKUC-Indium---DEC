package com.android.billingclient.api;

import com.android.billingclient.api.C1179f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.o */
/* loaded from: classes.dex */
public final class C1197o {

    /* renamed from: A */
    static final C1179f f5677A;

    /* renamed from: B */
    static final C1179f f5678B;

    /* renamed from: C */
    static final C1179f f5679C;

    /* renamed from: D */
    public static final /* synthetic */ int f5680D = 0;

    /* renamed from: a */
    static final C1179f f5681a;

    /* renamed from: b */
    static final C1179f f5682b;

    /* renamed from: c */
    static final C1179f f5683c;

    /* renamed from: d */
    static final C1179f f5684d;

    /* renamed from: e */
    static final C1179f f5685e;

    /* renamed from: f */
    static final C1179f f5686f;

    /* renamed from: g */
    static final C1179f f5687g;

    /* renamed from: h */
    static final C1179f f5688h;

    /* renamed from: i */
    static final C1179f f5689i;

    /* renamed from: j */
    static final C1179f f5690j;

    /* renamed from: k */
    static final C1179f f5691k;

    /* renamed from: l */
    static final C1179f f5692l;

    /* renamed from: m */
    static final C1179f f5693m;

    /* renamed from: n */
    static final C1179f f5694n;

    /* renamed from: o */
    static final C1179f f5695o;

    /* renamed from: p */
    static final C1179f f5696p;

    /* renamed from: q */
    static final C1179f f5697q;

    /* renamed from: r */
    static final C1179f f5698r;

    /* renamed from: s */
    static final C1179f f5699s;

    /* renamed from: t */
    static final C1179f f5700t;

    /* renamed from: u */
    static final C1179f f5701u;

    /* renamed from: v */
    static final C1179f f5702v;

    /* renamed from: w */
    static final C1179f f5703w;

    /* renamed from: x */
    static final C1179f f5704x;

    /* renamed from: y */
    static final C1179f f5705y;

    /* renamed from: z */
    static final C1179f f5706z;

    static {
        C1179f.a m6908c = C1179f.m6908c();
        m6908c.m6915c(3);
        m6908c.m6914b("Google Play In-app Billing API version is less than 3");
        f5681a = m6908c.m6913a();
        C1179f.a m6908c2 = C1179f.m6908c();
        m6908c2.m6915c(3);
        m6908c2.m6914b("Google Play In-app Billing API version is less than 9");
        f5682b = m6908c2.m6913a();
        C1179f.a m6908c3 = C1179f.m6908c();
        m6908c3.m6915c(3);
        m6908c3.m6914b("Billing service unavailable on device.");
        f5683c = m6908c3.m6913a();
        C1179f.a m6908c4 = C1179f.m6908c();
        m6908c4.m6915c(5);
        m6908c4.m6914b("Client is already in the process of connecting to billing service.");
        f5684d = m6908c4.m6913a();
        C1179f.a m6908c5 = C1179f.m6908c();
        m6908c5.m6915c(5);
        m6908c5.m6914b("The list of SKUs can't be empty.");
        f5685e = m6908c5.m6913a();
        C1179f.a m6908c6 = C1179f.m6908c();
        m6908c6.m6915c(5);
        m6908c6.m6914b("SKU type can't be empty.");
        f5686f = m6908c6.m6913a();
        C1179f.a m6908c7 = C1179f.m6908c();
        m6908c7.m6915c(5);
        m6908c7.m6914b("Product type can't be empty.");
        f5687g = m6908c7.m6913a();
        C1179f.a m6908c8 = C1179f.m6908c();
        m6908c8.m6915c(-2);
        m6908c8.m6914b("Client does not support extra params.");
        f5688h = m6908c8.m6913a();
        C1179f.a m6908c9 = C1179f.m6908c();
        m6908c9.m6915c(5);
        m6908c9.m6914b("Invalid purchase token.");
        f5689i = m6908c9.m6913a();
        C1179f.a m6908c10 = C1179f.m6908c();
        m6908c10.m6915c(6);
        m6908c10.m6914b("An internal error occurred.");
        f5690j = m6908c10.m6913a();
        C1179f.a m6908c11 = C1179f.m6908c();
        m6908c11.m6915c(5);
        m6908c11.m6914b("SKU can't be null.");
        f5691k = m6908c11.m6913a();
        C1179f.a m6908c12 = C1179f.m6908c();
        m6908c12.m6915c(0);
        f5692l = m6908c12.m6913a();
        C1179f.a m6908c13 = C1179f.m6908c();
        m6908c13.m6915c(-1);
        m6908c13.m6914b("Service connection is disconnected.");
        f5693m = m6908c13.m6913a();
        C1179f.a m6908c14 = C1179f.m6908c();
        m6908c14.m6915c(2);
        m6908c14.m6914b("Timeout communicating with service.");
        f5694n = m6908c14.m6913a();
        C1179f.a m6908c15 = C1179f.m6908c();
        m6908c15.m6915c(-2);
        m6908c15.m6914b("Client does not support subscriptions.");
        f5695o = m6908c15.m6913a();
        C1179f.a m6908c16 = C1179f.m6908c();
        m6908c16.m6915c(-2);
        m6908c16.m6914b("Client does not support subscriptions update.");
        f5696p = m6908c16.m6913a();
        C1179f.a m6908c17 = C1179f.m6908c();
        m6908c17.m6915c(-2);
        m6908c17.m6914b("Client does not support get purchase history.");
        f5697q = m6908c17.m6913a();
        C1179f.a m6908c18 = C1179f.m6908c();
        m6908c18.m6915c(-2);
        m6908c18.m6914b("Client does not support price change confirmation.");
        f5698r = m6908c18.m6913a();
        C1179f.a m6908c19 = C1179f.m6908c();
        m6908c19.m6915c(-2);
        m6908c19.m6914b("Play Store version installed does not support cross selling products.");
        f5699s = m6908c19.m6913a();
        C1179f.a m6908c20 = C1179f.m6908c();
        m6908c20.m6915c(-2);
        m6908c20.m6914b("Client does not support multi-item purchases.");
        f5700t = m6908c20.m6913a();
        C1179f.a m6908c21 = C1179f.m6908c();
        m6908c21.m6915c(-2);
        m6908c21.m6914b("Client does not support offer_id_token.");
        f5701u = m6908c21.m6913a();
        C1179f.a m6908c22 = C1179f.m6908c();
        m6908c22.m6915c(-2);
        m6908c22.m6914b("Client does not support ProductDetails.");
        f5702v = m6908c22.m6913a();
        C1179f.a m6908c23 = C1179f.m6908c();
        m6908c23.m6915c(-2);
        m6908c23.m6914b("Client does not support in-app messages.");
        f5703w = m6908c23.m6913a();
        C1179f.a m6908c24 = C1179f.m6908c();
        m6908c24.m6915c(-2);
        m6908c24.m6914b("Client does not support alternative billing.");
        f5704x = m6908c24.m6913a();
        C1179f.a m6908c25 = C1179f.m6908c();
        m6908c25.m6915c(5);
        m6908c25.m6914b("Unknown feature");
        f5705y = m6908c25.m6913a();
        C1179f.a m6908c26 = C1179f.m6908c();
        m6908c26.m6915c(-2);
        m6908c26.m6914b("Play Store version installed does not support get billing config.");
        f5706z = m6908c26.m6913a();
        C1179f.a m6908c27 = C1179f.m6908c();
        m6908c27.m6915c(-2);
        m6908c27.m6914b("Query product details with serialized docid is not supported.");
        f5677A = m6908c27.m6913a();
        C1179f.a m6908c28 = C1179f.m6908c();
        m6908c28.m6915c(4);
        m6908c28.m6914b("Item is unavailable for purchase.");
        f5678B = m6908c28.m6913a();
        C1179f.a m6908c29 = C1179f.m6908c();
        m6908c29.m6915c(-2);
        m6908c29.m6914b("Query product details with developer specified account is not supported.");
        f5679C = m6908c29.m6913a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1179f m6955a(int i10, String str) {
        C1179f.a m6908c = C1179f.m6908c();
        m6908c.m6915c(i10);
        m6908c.m6914b(str);
        return m6908c.m6913a();
    }
}
