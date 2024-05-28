package p075f8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.billingclient.api.AbstractC1173c;
import com.android.billingclient.api.C1169a;
import com.android.billingclient.api.C1177e;
import com.android.billingclient.api.C1179f;
import com.android.billingclient.api.C1181g;
import com.android.billingclient.api.C1183h;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2877p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p023b9.C1079c;
import p033c7.C1134c;
import p035c9.C1151k;
import p062e8.AbstractC3097h;
import p062e8.C3094e;
import p062e8.C3095f;
import p062e8.C3099j;
import p062e8.InterfaceC3093d;
import p062e8.InterfaceC3096g;
import p074f7.InterfaceC3170e0;
import p075f8.C3201d;
import p100h7.C3415h;
import p100h7.InterfaceC3413f;
import p171n1.C4009a;
import p171n1.C4017e;
import p171n1.C4029k;
import p171n1.C4031l;
import p171n1.InterfaceC4011b;
import p171n1.InterfaceC4015d;
import p171n1.InterfaceC4019f;
import p171n1.InterfaceC4021g;
import p171n1.InterfaceC4023h;
import p171n1.InterfaceC4025i;
import p171n1.InterfaceC4027j;
import p299x6.C5556b;
import p300x7.C5563e;

/* renamed from: f8.h */
/* loaded from: classes.dex */
public class C3205h implements InterfaceC3093d {

    /* renamed from: A */
    private static List<String> f13383A;

    /* renamed from: C */
    private static List<String> f13385C;

    /* renamed from: y */
    private static C3205h f13386y;

    /* renamed from: a */
    private InterfaceC3206i f13388a;

    /* renamed from: b */
    private m f13389b;

    /* renamed from: c */
    private m f13390c;

    /* renamed from: d */
    private m f13391d;

    /* renamed from: e */
    private Hashtable<String, C1181g> f13392e;

    /* renamed from: f */
    private Hashtable<String, C1181g> f13393f;

    /* renamed from: g */
    private Hashtable<String, Purchase> f13394g;

    /* renamed from: h */
    private boolean f13395h;

    /* renamed from: i */
    private Activity f13396i;

    /* renamed from: j */
    private String f13397j;

    /* renamed from: k */
    private String f13398k;

    /* renamed from: l */
    private String f13399l;

    /* renamed from: m */
    private boolean f13400m;

    /* renamed from: n */
    private long f13401n;

    /* renamed from: o */
    private boolean f13402o;

    /* renamed from: p */
    private C5563e f13403p;

    /* renamed from: q */
    private InterfaceC3413f f13404q;

    /* renamed from: r */
    private InterfaceC3096g f13405r;

    /* renamed from: s */
    private final Hashtable<String, String> f13406s;

    /* renamed from: t */
    private String f13407t;

    /* renamed from: u */
    private C3094e.d f13408u;

    /* renamed from: v */
    public InterfaceC4027j f13409v;

    /* renamed from: w */
    public InterfaceC4023h f13410w;

    /* renamed from: x */
    public InterfaceC4023h f13411x;

    /* renamed from: z */
    private static List<String> f13387z = new ArrayList(Arrays.asList("com.roblox.client.robux40", "com.roblox.robloxmobile.premium80robux", "com.roblox.robloxmobile.premium160robux", "com.roblox.robloxmobile.premium240robux", "com.roblox.robloxmobile.premium320robux", "com.roblox.robloxmobile.premium400robux", "com.roblox.robloxmobile.premium800robux", "com.roblox.robloxmobile.premium1700robux", "com.roblox.robloxmobile.premium4500robux", "com.roblox.robloxmobile.premium10000robux", "com.roblox.robloxmobile.premium88subscribed", "com.roblox.robloxmobile.premium175subscribed", "com.roblox.robloxmobile.premium265subscribed", "com.roblox.robloxmobile.premium350subscribed", "com.roblox.robloxmobile.premium440subscribed2", "com.roblox.robloxmobile.premium880subscribed", "com.roblox.robloxmobile.premium1870subscribed", "com.roblox.robloxmobile.premium4950subscribed", "com.roblox.robloxmobile.premium11000subscribed"));

    /* renamed from: B */
    private static List<String> f13384B = new ArrayList(Arrays.asList("com.roblox.robloxmobile.robloxpremium450", "com.roblox.robloxmobile.robloxpremium1000", "com.roblox.robloxmobile.robloxpremium2200"));

    /* renamed from: f8.h$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC4023h {

        /* renamed from: f8.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C6048a implements InterfaceC4025i {
            C6048a() {
            }

            @Override // p171n1.InterfaceC4025i
            /* renamed from: a */
            public void mo14190a(C1179f c1179f, List<Purchase> list) {
                int m6912b = c1179f.m6912b();
                C3205h.this.m14109P0("QueryPurchasesAsync", m6912b);
                if (m6912b == 0) {
                    C3205h.this.f13403p.m20436v("QueryInAppPurchases. ItemsCount: " + list.size() + ". Items: " + C3205h.this.m14146h0(list));
                    C3205h.this.m14162o0(list, true);
                    return;
                }
                C1151k.m6708b("Failed QueryPurchases. BillingResult: " + c1179f);
            }
        }

        a() {
        }

        @Override // p171n1.InterfaceC4023h
        /* renamed from: a */
        public void mo14189a(C1179f c1179f, List<PurchaseHistoryRecord> list) {
            int m6912b = c1179f.m6912b();
            C3205h.this.m14109P0("QueryPurchaseHistoryAsync", m6912b);
            boolean z10 = m6912b == 0;
            C3205h.this.f13403p.m20436v("OnInAppPurchaseHistoryResponse. Success: " + z10 + ". Message: " + c1179f.toString() + ".");
            if (C3205h.this.m14186v0()) {
                if (!z10) {
                    C1151k.m6709c("rbx.purchaseflow", "Failed QueryPurchaseHistory: " + c1179f);
                    return;
                }
                C3205h.this.f13388a.mo14069j(C4031l.m16831a().m16835b("inapp").m16834a(), new C6048a());
            }
        }
    }

    /* renamed from: f8.h$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC4023h {

        /* renamed from: f8.h$b$a */
        /* loaded from: classes.dex */
        class a implements InterfaceC4025i {
            a() {
            }

            @Override // p171n1.InterfaceC4025i
            /* renamed from: a */
            public void mo14190a(C1179f c1179f, List<Purchase> list) {
                int m6912b = c1179f.m6912b();
                C3205h.this.m14109P0("QueryPurchasesAsync", m6912b);
                if (m6912b == 0) {
                    C3205h.this.f13403p.m20436v("QuerySubsPurchases. ItemsCount: " + list.size() + ". Items: " + C3205h.this.m14146h0(list));
                    C3205h.this.m14162o0(list, true);
                    return;
                }
                C1151k.m6708b("Failed QueryPurchases. BillingResult: " + c1179f);
            }
        }

        b() {
        }

        @Override // p171n1.InterfaceC4023h
        /* renamed from: a */
        public void mo14189a(C1179f c1179f, List<PurchaseHistoryRecord> list) {
            int m6912b = c1179f.m6912b();
            C3205h.this.m14109P0("QueryPurchaseHistoryAsync", m6912b);
            boolean z10 = m6912b == 0;
            C3205h.this.f13403p.m20436v("OnSubsPurchaseHistoryResponse. Success: " + z10 + ". Message: " + c1179f.toString() + ".");
            if (C3205h.this.m14186v0()) {
                if (!z10) {
                    C1151k.m6709c("rbx.purchaseflow", "Failed QueryPurchaseHistory: " + c1179f);
                    return;
                }
                C3205h.this.f13388a.mo14069j(C4031l.m16831a().m16835b("subs").m16834a(), new a());
            }
        }
    }

    /* renamed from: f8.h$c */
    /* loaded from: classes.dex */
    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f13416a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13417b;

        static {
            int[] iArr = new int[C3099j.b.values().length];
            f13417b = iArr;
            try {
                iArr[C3099j.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13417b[C3099j.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13417b[C3099j.b.EMPTY_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C3094e.c.values().length];
            f13416a = iArr2;
            try {
                iArr2[C3094e.c.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13416a[C3094e.c.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13416a[C3094e.c.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13416a[C3094e.c.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13416a[C3094e.c.LIMIT_UNDER_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13416a[C3094e.c.ERROR_CHECKING_BALANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f8.h$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC4015d {
        d() {
        }

        @Override // p171n1.InterfaceC4015d
        /* renamed from: a */
        public void mo14191a(C1179f c1179f) {
            int m6912b = c1179f.m6912b();
            C3205h.this.m14109P0("StartConnection", m6912b);
            if (m6912b == 0) {
                C1151k.m6712f("rbx.purchaseflow", "Google Billing Client is setup");
                C3205h.this.f13389b = m.READY;
            } else {
                C1151k.m6709c("rbx.purchaseflow", "Google Billing Client is not setup");
                C3205h.this.f13389b = m.NONE;
            }
        }

        @Override // p171n1.InterfaceC4015d
        /* renamed from: b */
        public void mo14192b() {
            C1151k.m6712f("rbx.purchaseflow", "Google Billing Client disconnected");
            C3205h.this.f13389b = m.NONE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f8.h$e */
    /* loaded from: classes.dex */
    public class e implements InterfaceC4021g {

        /* renamed from: a */
        final /* synthetic */ p f13419a;

        e(p pVar) {
            this.f13419a = pVar;
        }

        @Override // p171n1.InterfaceC4021g
        /* renamed from: a */
        public void mo14077a(C1179f c1179f, List<C1181g> list) {
            int m6912b = c1179f.m6912b();
            C3205h.this.m14109P0("QueryProductDetailsAsync", m6912b);
            if (m6912b == 0) {
                C1151k.m6707a("rbx.purchaseflow", "Returned INAPP ProductDetails. Count = " + list.size());
                for (C1181g c1181g : list) {
                    if (c1181g != C3205h.this.f13392e.put(c1181g.m6917b(), c1181g)) {
                        C3205h.this.f13392e.remove(c1181g.m6917b());
                        C3205h.this.f13392e.put(c1181g.m6917b(), c1181g);
                    }
                }
                C1151k.m6707a("rbx.purchaseflow", "queryInAppProduct Success. Count = " + C3205h.this.f13392e.size());
                C3205h.this.f13390c = m.READY;
            } else {
                C1151k.m6709c("rbx.purchaseflow", "Failed queryInAppProduct. BillingResult: " + c1179f);
                C3205h.this.f13390c = m.NONE;
            }
            p pVar = this.f13419a;
            if (pVar != null) {
                pVar.mo14193a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f8.h$f */
    /* loaded from: classes.dex */
    public class f implements InterfaceC4021g {

        /* renamed from: a */
        final /* synthetic */ p f13421a;

        f(p pVar) {
            this.f13421a = pVar;
        }

        @Override // p171n1.InterfaceC4021g
        /* renamed from: a */
        public void mo14077a(C1179f c1179f, List<C1181g> list) {
            int m6912b = c1179f.m6912b();
            C3205h.this.m14109P0("QueryProductDetailsAsync", m6912b);
            if (m6912b == 0) {
                C1151k.m6707a("rbx.purchaseflow", "Returned SUBS ProductDetails. Count = " + list.size());
                for (C1181g c1181g : list) {
                    if (c1181g != C3205h.this.f13393f.put(c1181g.m6917b(), c1181g)) {
                        C3205h.this.f13393f.remove(c1181g.m6917b());
                        C3205h.this.f13393f.put(c1181g.m6917b(), c1181g);
                    }
                }
                C1151k.m6707a("rbx.purchaseflow", "querySubsProduct Success. Count = " + C3205h.this.f13393f.size());
                C3205h.this.f13391d = m.READY;
            } else {
                C1151k.m6709c("rbx.purchaseflow", "Failed querySubsProduct. BillingResult: " + c1179f);
                C3205h.this.f13391d = m.NONE;
            }
            p pVar = this.f13421a;
            if (pVar != null) {
                pVar.mo14193a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f8.h$g */
    /* loaded from: classes.dex */
    public class g implements p {

        /* renamed from: a */
        final /* synthetic */ String f13423a;

        g(String str) {
            this.f13423a = str;
        }

        @Override // p075f8.C3205h.p
        /* renamed from: a */
        public void mo14193a() {
            C3205h c3205h = C3205h.this;
            C1181g m14149i0 = c3205h.m14149i0(this.f13423a, c3205h.f13400m);
            C3205h c3205h2 = C3205h.this;
            if (c3205h2.m14079A0(this.f13423a, m14149i0, c3205h2.f13400m)) {
                C3205h c3205h3 = C3205h.this;
                c3205h3.f13398k = c3205h3.m14156l0(m14149i0, c3205h3.f13400m);
                C3205h.this.f13403p.m20429k0(new C3095f(C3205h.this.f13399l, this.f13423a, false));
                C3205h.this.m14135d0();
            }
        }
    }

    /* renamed from: f8.h$h */
    /* loaded from: classes.dex */
    class h implements C3094e.d {
        h() {
        }

        @Override // p062e8.C3094e.d
        /* renamed from: a */
        public void mo13616a(C3094e.c cVar, String str) {
            C3205h.this.f13403p.m20436v("ValidationCheck: " + cVar + ".");
            switch (c.f13416a[cVar.ordinal()]) {
                case 1:
                    C3205h.this.m14138e0();
                    return;
                case 2:
                    C3205h.this.m14119U0();
                    C3205h.this.m14093H0(str, C3201d.b.VALIDATION_ERROR, "PrePurchaseValidation error");
                    return;
                case 3:
                    C3205h.this.m14125X0();
                    C3205h.this.m14093H0(str, C3201d.b.VALIDATION_RETRY, "PrePurchaseValidation retry");
                    return;
                case 4:
                    C3205h.this.m14121V0();
                    C3205h.this.m14093H0(str, C3201d.b.VALIDATION_LIMIT, "PrePurchaseValidation limit");
                    return;
                case 5:
                    C3205h.this.m14121V0();
                    C3205h.this.m14093H0(str, C3201d.b.VALIDATION_LIMIT_UNDER_13, "PrePurchaseValidation limit");
                    return;
                case 6:
                    C3205h.this.m14117T0();
                    C3205h.this.m14093H0(str, C3201d.b.REQUEST_BALANCE_ERROR, "PrePurchaseValidation requestBalance failed.");
                    return;
                default:
                    C3205h.this.m14127Y0();
                    C3205h.this.m14093H0(str, C3201d.b.UNKNOWN, "PrePurchaseValidation Unknown error.");
                    return;
            }
        }
    }

    /* renamed from: f8.h$i */
    /* loaded from: classes.dex */
    class i implements InterfaceC4027j {
        i() {
        }

        @Override // p171n1.InterfaceC4027j
        /* renamed from: a */
        public void mo14194a(C1179f c1179f, List<Purchase> list) {
            if (C3205h.this.f13388a == null) {
                return;
            }
            int m6912b = c1179f.m6912b();
            if (m6912b == 0) {
                C3205h.this.m14162o0(list, false);
                return;
            }
            if (m6912b == 1) {
                C3205h c3205h = C3205h.this;
                c3205h.m14093H0(c3205h.f13397j, C3201d.b.USER_CANCELLED, "User cancelled");
            } else if (m6912b != 7) {
                C3205h c3205h2 = C3205h.this;
                c3205h2.m14093H0(c3205h2.f13397j, C3201d.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
            } else {
                C3205h.this.m14160n0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f8.h$j */
    /* loaded from: classes.dex */
    public class j implements C3099j.c {

        /* renamed from: a */
        final /* synthetic */ Purchase f13427a;

        j(Purchase purchase) {
            this.f13427a = purchase;
        }

        @Override // p062e8.C3099j.c
        /* renamed from: a */
        public void mo13624a(C3099j.b bVar) {
            C3205h.this.f13403p.m20436v("VerifyPurchase. Response=" + bVar + ".ReceiptId=" + this.f13427a.m6780b());
            if (C3205h.this.f13405r != null) {
                C3205h.this.f13405r.mo13211d();
            }
            if (bVar != C3099j.b.OK && !this.f13427a.m6787i()) {
                C3205h.this.m14136d1();
            }
            int i10 = c.f13417b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    C3205h.this.m14144g1();
                    C3205h c3205h = C3205h.this;
                    c3205h.m14093H0(c3205h.m14181g(this.f13427a), C3201d.b.RECEIPT_VERIFICATION_ERROR, "launchVerifyPurchaseReceipt error");
                    return;
                } else if (i10 != 3) {
                    C3205h.this.m14147h1();
                    C3205h c3205h2 = C3205h.this;
                    c3205h2.m14093H0(c3205h2.m14181g(this.f13427a), C3201d.b.UNKNOWN, "launchVerifyPurchaseReceipt unknown error");
                    return;
                } else {
                    C3205h.this.m14142f1();
                    C3205h c3205h3 = C3205h.this;
                    c3205h3.m14093H0(c3205h3.m14181g(this.f13427a), C3201d.b.RECEIPT_EMPTY, "launchVerifyPurchaseReceipt empty response");
                    return;
                }
            }
            String m14181g = C3205h.this.m14181g(this.f13427a);
            if (C3205h.this.m14176y0(this.f13427a)) {
                C1151k.m6712f("rbx.purchaseflow", "Receipt Verification Successful for Subscription");
                if (C3205h.this.m14171u0(m14181g)) {
                    C1079c.m6380c().m6397r(C1079c.m6380c().m6385f() + AbstractC3097h.m13617d(m14181g));
                }
                if (!C1134c.m6537a().mo6582V0()) {
                    C3205h.this.m14091G0(m14181g, C3201d.b.SUCCESS);
                }
                boolean m14176y0 = C1134c.m6537a().mo6551G() ? C3205h.this.m14176y0(this.f13427a) : C3205h.this.f13400m;
                C1181g m14149i0 = C3205h.this.m14149i0(m14181g, m14176y0);
                if (C3205h.this.m14081B0(m14181g, m14149i0, m14176y0, false)) {
                    C3205h.this.f13403p.m20437w(m14181g, C3205h.m14151j0(m14149i0, m14176y0), C3205h.this.m14156l0(m14149i0, m14176y0), C3205h.m14154k0(m14149i0, m14176y0));
                } else {
                    C1151k.m6712f("rbx.purchaseflow", "Unable to find skuDetails: " + m14181g);
                }
            }
            C3205h.this.m14122W(this.f13427a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f8.h$k */
    /* loaded from: classes.dex */
    public class k implements InterfaceC4011b {

        /* renamed from: a */
        final /* synthetic */ Purchase f13429a;

        k(Purchase purchase) {
            this.f13429a = purchase;
        }

        @Override // p171n1.InterfaceC4011b
        /* renamed from: a */
        public void mo14195a(C1179f c1179f) {
            int m6912b = c1179f.m6912b();
            C3205h.this.m14109P0("AcknowledgePurchase", m6912b);
            boolean z10 = m6912b == 0;
            C3205h.this.f13403p.m20436v("OnAcknowledgePurchaseResponse. Success: " + z10 + ". Message: " + c1179f.toString() + ".");
            if (!C1134c.m6537a().mo6582V0()) {
                C3205h.this.m14128Z(this.f13429a, z10);
                return;
            }
            if (z10) {
                C3205h.this.m14126Y(this.f13429a, C3201d.b.SUCCESS);
                return;
            }
            C1151k.m6716j("rbx.purchaseflow", "Failed to acknowledge Purchase");
            C3205h.this.m14107O0();
            C3205h c3205h = C3205h.this;
            c3205h.m14093H0(c3205h.m14181g(this.f13429a), C3201d.b.ACKNOWLEDGE_ERROR, "OnAcknowledgePurchaseResponse failure");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f8.h$l */
    /* loaded from: classes.dex */
    public class l implements InterfaceC4019f {

        /* renamed from: a */
        final /* synthetic */ Purchase f13431a;

        l(Purchase purchase) {
            this.f13431a = purchase;
        }

        @Override // p171n1.InterfaceC4019f
        /* renamed from: a */
        public void mo14196a(C1179f c1179f, String str) {
            int m6912b = c1179f.m6912b();
            C3205h.this.m14109P0("ConsumePurchase", m6912b);
            boolean z10 = m6912b == 0;
            C3205h.this.f13403p.m20436v("OnConsumeResponse. Success: " + z10 + ". Message: " + c1179f.toString() + ".");
            if (z10) {
                String m14181g = C3205h.this.m14181g(this.f13431a);
                boolean z11 = C1134c.m6537a().mo6551G() ? false : C3205h.this.f13400m;
                C3205h.this.m14091G0(m14181g, C3201d.b.SUCCESS);
                C1181g m14149i0 = C3205h.this.m14149i0(m14181g, z11);
                if (C3205h.this.m14081B0(m14181g, m14149i0, z11, false)) {
                    C3205h.this.f13403p.m20437w(m14181g, C3205h.m14151j0(m14149i0, z11), C3205h.this.m14156l0(m14149i0, z11), C3205h.m14154k0(m14149i0, z11));
                } else {
                    C1151k.m6712f("rbx.purchaseflow", "Unable to find skuDetails: " + m14181g);
                }
                if (C3205h.this.f13394g.containsKey(this.f13431a.m6780b())) {
                    C3205h.this.f13394g.remove(this.f13431a.m6780b());
                }
            } else {
                C3205h.this.m14109P0("ConsumePurchase", m6912b);
                C3205h.this.m14111Q0();
                C3205h c3205h = C3205h.this;
                c3205h.m14093H0(c3205h.m14181g(this.f13431a), C3201d.b.CONSUME_ERROR, "OnAcknowledgePurchaseResponse failure");
            }
            C1151k.m6712f("rbx.purchaseflow", "End consume flow.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f8.h$m */
    /* loaded from: classes.dex */
    public enum m {
        NONE,
        CONNECTING,
        READY
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f8.h$n */
    /* loaded from: classes.dex */
    public class n {

        /* renamed from: a */
        public String f13437a;

        /* renamed from: b */
        public String f13438b;

        n(String str, String str2) {
            this.f13437a = str;
            this.f13438b = str2;
        }

        public String toString() {
            return "{ productType: " + this.f13438b + ", providerProductId: " + this.f13437a + " }";
        }
    }

    /* renamed from: f8.h$o */
    /* loaded from: classes.dex */
    public interface o {
        /* renamed from: a */
        void mo14076a(List<C1181g> list);
    }

    /* renamed from: f8.h$p */
    /* loaded from: classes.dex */
    public interface p {
        /* renamed from: a */
        void mo14193a();
    }

    C3205h(InterfaceC3206i interfaceC3206i, InterfaceC3413f interfaceC3413f, C5563e c5563e) {
        m mVar = m.NONE;
        this.f13389b = mVar;
        this.f13390c = mVar;
        this.f13391d = mVar;
        this.f13392e = new Hashtable<>();
        this.f13393f = new Hashtable<>();
        this.f13394g = new Hashtable<>();
        this.f13395h = false;
        this.f13397j = null;
        this.f13398k = null;
        this.f13399l = BuildConfig.FLAVOR;
        this.f13401n = 0L;
        this.f13402o = true;
        this.f13406s = new Hashtable<>();
        this.f13408u = new h();
        this.f13409v = new i();
        this.f13410w = new a();
        this.f13411x = new b();
        this.f13388a = interfaceC3206i;
        this.f13404q = interfaceC3413f;
        this.f13403p = c5563e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public boolean m14079A0(String str, C1181g c1181g, boolean z10) {
        return m14081B0(str, c1181g, z10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public boolean m14081B0(String str, C1181g c1181g, boolean z10, boolean z11) {
        if (c1181g == null) {
            C1151k.m6707a("rbx.purchaseflow", "Product details not found after query.");
            if (z11) {
                m14093H0(str, C3201d.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            }
            return false;
        }
        if (z10 && c1181g.m6919d() == null) {
            if (z11) {
                m14093H0(this.f13397j, C3201d.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
            }
            return false;
        }
        if (z10 || c1181g.m6916a() != null) {
            return true;
        }
        if (z11) {
            m14093H0(this.f13397j, C3201d.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public /* synthetic */ void m14083C0(Map map, boolean z10, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1181g c1181g = (C1181g) it.next();
            if (c1181g == null) {
                C1151k.m6709c("rbx.purchaseflow", "Null product details in list");
            } else {
                String m6917b = c1181g.m6917b();
                if (!map.containsKey(m6917b)) {
                    C1151k.m6709c("rbx.purchaseflow", "Cannot find purchase associated with product details. ProductId: " + m6917b);
                } else {
                    m14164p0((Purchase) map.get(m6917b), z10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public /* synthetic */ void m14085D0(List list, o oVar, C1179f c1179f, List list2) {
        int m6912b = c1179f.m6912b();
        m14109P0("QueryProductDetailsAsync", m6912b);
        if (m6912b == 0) {
            if (list2.isEmpty()) {
                C1151k.m6712f("rbx.purchaseflow", "Returned no ProductDetails for Products: " + list);
                return;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C1181g c1181g = (C1181g) it.next();
                if (c1181g.m6918c().equals("subs")) {
                    this.f13393f.put(c1181g.m6917b(), c1181g);
                } else {
                    this.f13392e.put(c1181g.m6917b(), c1181g);
                }
            }
            C1151k.m6712f("rbx.purchaseflow", "queryProductDetails Success. Products: " + list);
        } else {
            C1151k.m6709c("rbx.purchaseflow", "Failed queryProductDetails. Products: " + list + ", BillingResult: " + c1179f);
        }
        oVar.mo14076a(list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public /* synthetic */ void m14087E0(C3199b c3199b, boolean z10, List list) {
        if (list != null && !list.isEmpty()) {
            C1181g c1181g = (C1181g) list.get(0);
            if (m14079A0(c3199b.m14073d(), c1181g, c3199b.m14072c())) {
                this.f13398k = m14156l0(c1181g, c3199b.m14072c());
                this.f13403p.m20429k0(new C3095f(this.f13399l, c3199b.m14073d(), !z10));
                m14138e0();
                return;
            }
            return;
        }
        m14093H0(c3199b.m14073d(), C3201d.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
    }

    /* renamed from: F0 */
    private void m14089F0(Purchase purchase, boolean z10) {
        if (this.f13405r != null && m14178z0(m14181g(purchase))) {
            this.f13405r.mo13209b();
        }
        new C3099j(this.f13404q).m13623b(C2877p0.m12918e1(), new C3200c(purchase, z10, m14184s0()), new j(purchase));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G0 */
    public void m14091G0(String str, C3201d.b bVar) {
        C3201d.b bVar2 = C3201d.b.SUCCESS;
        if (bVar == bVar2) {
            m14133c1();
        } else if (bVar == C3201d.b.USER_CANCELLED) {
            m14130a1();
        } else if (bVar == C3201d.b.ALREADY_ACKNOWLEDGED) {
            m14129Z0();
        } else {
            m14131b1();
        }
        if (this.f13405r != null && m14178z0(str)) {
            InterfaceC3096g interfaceC3096g = this.f13405r;
            if (interfaceC3096g instanceof InterfaceC3170e0) {
                if (this.f13401n != 0) {
                    if (C1134c.m6537a().mo6649t1() && this.f13406s.containsKey(str)) {
                        ((InterfaceC3170e0) this.f13405r).mo13608a(bVar == bVar2, this.f13401n, this.f13406s.get(str));
                        return;
                    }
                    ((InterfaceC3170e0) this.f13405r).mo13608a(bVar == bVar2, this.f13401n, this.f13397j);
                } else {
                    C1151k.m6716j("rbx.purchaseflow", "Ignore calling inGamePurchaseFinished: mUserId=" + this.f13401n + ". mProductId=" + this.f13397j + ".");
                }
            } else if (interfaceC3096g != null) {
                interfaceC3096g.mo13210c(new C3201d(bVar, this.f13397j));
            }
        }
        if (m14178z0(str)) {
            m14105N0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public void m14093H0(String str, C3201d.b bVar, String str2) {
        if (str2 != null && str2.length() > 0) {
            this.f13403p.m20436v(str2);
        }
        m14091G0(str, bVar);
    }

    /* renamed from: I0 */
    private void m14095I0(final List<n> list, final o oVar) {
        if (C1134c.m6537a().mo6547E() && this.f13388a.mo14061b("fff").m6912b() != 0) {
            m14109P0("QueryProductDetailsAsync", -2);
            C1151k.m6709c("rbx.purchaseflow", "ProductDetails feature is not supported.");
            m14123W0();
            oVar.mo14076a(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (n nVar : list) {
            arrayList.add(C1183h.b.m6939a().m6945b(nVar.f13437a).m6946c(nVar.f13438b).m6944a());
        }
        this.f13388a.mo14060a(C1183h.m6933a().m6938b(arrayList).m6937a(), new InterfaceC4021g() { // from class: f8.g
            @Override // p171n1.InterfaceC4021g
            /* renamed from: a */
            public final void mo14077a(C1179f c1179f, List list2) {
                C3205h.this.m14085D0(list, oVar, c1179f, list2);
            }
        });
    }

    /* renamed from: J0 */
    private void m14097J0() {
        m14099K0(null);
    }

    /* renamed from: K0 */
    private void m14099K0(p pVar) {
        C1151k.m6707a("rbx.purchaseflow", "Attempt queryInAppProduct");
        if (C1134c.m6537a().mo6547E() && this.f13388a.mo14061b("fff").m6912b() != 0) {
            m14109P0("QueryProductDetailsAsync", -2);
            C1151k.m6709c("rbx.purchaseflow", "ProductDetails feature is not supported.");
            m14123W0();
            if (pVar != null) {
                pVar.mo14193a();
                return;
            }
            return;
        }
        m mVar = this.f13390c;
        if (mVar == m.READY) {
            C1151k.m6707a("rbx.purchaseflow", "queryInAppProduct is setup already");
            if (pVar != null) {
                pVar.mo14193a();
                return;
            }
            return;
        }
        if (mVar != m.NONE) {
            C1151k.m6707a("rbx.purchaseflow", "queryInAppProduct is pending");
            return;
        }
        List<String> m14143g0 = m14143g0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = m14143g0.iterator();
        while (it.hasNext()) {
            arrayList.add(C1183h.b.m6939a().m6945b(it.next()).m6946c("inapp").m6944a());
        }
        C1183h m6937a = C1183h.m6933a().m6938b(arrayList).m6937a();
        this.f13390c = m.CONNECTING;
        this.f13388a.mo14060a(m6937a, new e(pVar));
    }

    /* renamed from: L0 */
    private void m14101L0() {
        m14103M0(null);
    }

    /* renamed from: M0 */
    private void m14103M0(p pVar) {
        C1151k.m6707a("rbx.purchaseflow", "Attempt querySubsProduct");
        if (this.f13388a.mo14061b("subscriptions").m6912b() != 0) {
            m14109P0("IsSubscriptionsSupported", -2);
            C1151k.m6709c("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return;
        }
        if (C1134c.m6537a().mo6547E() && this.f13388a.mo14061b("fff").m6912b() != 0) {
            m14109P0("QueryProductDetailsAsync", -2);
            C1151k.m6709c("rbx.purchaseflow", "ProductDetails feature is not supported.");
            m14123W0();
            if (pVar != null) {
                pVar.mo14193a();
                return;
            }
            return;
        }
        C1151k.m6707a("rbx.purchaseflow", "Attempt querySubsProduct");
        m mVar = this.f13391d;
        if (mVar == m.READY) {
            C1151k.m6707a("rbx.purchaseflow", "querySubsProduct is setup already");
            if (pVar != null) {
                pVar.mo14193a();
                return;
            }
            return;
        }
        if (mVar != m.NONE) {
            C1151k.m6707a("rbx.purchaseflow", "querySubsProduct is pending");
            return;
        }
        List<String> m14158m0 = m14158m0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = m14158m0.iterator();
        while (it.hasNext()) {
            arrayList.add(C1183h.b.m6939a().m6945b(it.next()).m6946c("subs").m6944a());
        }
        C1183h m6937a = C1183h.m6933a().m6938b(arrayList).m6937a();
        this.f13391d = m.CONNECTING;
        C1151k.m6707a("rbx.purchaseflow", "Querying SUBS ProductDetails. Count = " + arrayList.size());
        this.f13388a.mo14060a(m6937a, new f(pVar));
    }

    /* renamed from: N0 */
    private void m14105N0() {
        this.f13396i = null;
        this.f13405r = null;
        this.f13397j = null;
        this.f13401n = 0L;
        this.f13407t = null;
        this.f13398k = null;
        this.f13402o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public void m14107O0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20438x(m14184s0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public void m14109P0(String str, int i10) {
        if (!C1134c.m6537a().mo6586X0() || C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20439y(str, i10, this.f13402o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m14111Q0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20440z(m14184s0());
    }

    /* renamed from: R0 */
    private void m14113R0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20391D();
    }

    /* renamed from: S0 */
    private void m14115S0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20408U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public void m14117T0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20409V(m14184s0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public void m14119U0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20410W(m14184s0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public void m14121V0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20421d0(m14184s0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m14122W(Purchase purchase) {
        if (!purchase.m6787i()) {
            C1151k.m6712f("rbx.purchaseflow", "Acknowledging Purchase");
            m14124X(purchase, new k(purchase));
            return;
        }
        C1151k.m6712f("rbx.purchaseflow", "Attempted to acknowledge an acknowledged purchase.");
        if (C1134c.m6537a().mo6582V0()) {
            m14126Y(purchase, C3201d.b.ALREADY_ACKNOWLEDGED);
        } else {
            m14128Z(purchase, true);
        }
    }

    /* renamed from: W0 */
    private void m14123W0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20411X(this.f13402o, false);
    }

    /* renamed from: X */
    private void m14124X(Purchase purchase, InterfaceC4011b interfaceC4011b) {
        C1151k.m6712f("rbx.purchaseflow", "Start acknowledging Purchase");
        this.f13388a.mo14062c(C4009a.m16813b().m16817b(purchase.m6785g()).m16816a(), interfaceC4011b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public void m14125X0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20412Y(m14184s0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m14126Y(Purchase purchase, C3201d.b bVar) {
        C1151k.m6712f("rbx.purchaseflow", "Acknowledged Purchase");
        if (m14176y0(purchase)) {
            this.f13394g.remove(purchase.m6780b());
            m14091G0(m14181g(purchase), bVar);
        } else {
            m14132c0(purchase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public void m14127Y0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20413Z(m14184s0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m14128Z(Purchase purchase, boolean z10) {
        if (z10) {
            C1151k.m6712f("rbx.purchaseflow", "Acknowledged Purchase");
            if (!m14176y0(purchase)) {
                m14132c0(purchase);
                return;
            } else {
                if (this.f13394g.containsKey(purchase.m6780b())) {
                    this.f13394g.remove(purchase.m6780b());
                    return;
                }
                return;
            }
        }
        C1151k.m6716j("rbx.purchaseflow", "Failed to acknowledge Purchase");
        m14107O0();
        m14093H0(m14181g(purchase), C3201d.b.ACKNOWLEDGE_ERROR, "OnAcknowledgePurchaseResponse failure");
    }

    /* renamed from: Z0 */
    private void m14129Z0() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20415a0(this.f13402o, false);
    }

    /* renamed from: a1 */
    private void m14130a1() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20417b0(m14184s0(), false);
    }

    /* renamed from: b1 */
    private void m14131b1() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20419c0(m14184s0(), false);
    }

    /* renamed from: c0 */
    private void m14132c0(Purchase purchase) {
        C1151k.m6712f("rbx.purchaseflow", "Consuming Purchase");
        this.f13388a.mo14064e(C4017e.m16821b().m16825b(purchase.m6785g()).m16824a(), new l(purchase));
    }

    /* renamed from: c1 */
    private void m14133c1() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20422e0(m14184s0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m14135d0() {
        InterfaceC3096g interfaceC3096g = this.f13405r;
        if (interfaceC3096g != null) {
            interfaceC3096g.mo13212e();
        }
        C3094e c3094e = new C3094e(this.f13404q);
        if (m14184s0()) {
            c3094e.m13615c(C2877p0.m12912c1(), this.f13397j, this.f13398k, this.f13408u);
        } else {
            c3094e.m13614b(C2877p0.m12912c1(), this.f13397j, this.f13398k, this.f13408u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public void m14136d1() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20424f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m14138e0() {
        C1177e m6885a;
        InterfaceC3096g interfaceC3096g = this.f13405r;
        if (interfaceC3096g != null) {
            interfaceC3096g.mo13211d();
        }
        this.f13403p.m20436v("PurchaseStarted.");
        C1181g m14149i0 = m14149i0(this.f13397j, this.f13400m);
        if (m14079A0(this.f13397j, m14149i0, this.f13400m)) {
            ArrayList arrayList = new ArrayList();
            if (this.f13400m) {
                arrayList.add(C1177e.b.m6889a().m6896c(m14149i0).m6895b(m14149i0.m6919d().get(0).m6931a()).m6894a());
            } else {
                arrayList.add(C1177e.b.m6889a().m6896c(m14149i0).m6894a());
            }
            if (C1134c.m6537a().mo6649t1() && this.f13407t != null) {
                m6885a = C1177e.m6867a().m6886b(this.f13399l).m6887c(this.f13407t).m6888d(arrayList).m6885a();
            } else {
                m6885a = C1177e.m6867a().m6886b(this.f13399l).m6888d(arrayList).m6885a();
            }
            if (this.f13396i.getIntent() == null) {
                this.f13396i.setIntent(new Intent());
            }
            int m6912b = this.f13388a.mo14067h(this.f13396i, m6885a).m6912b();
            m14109P0("LaunchBillingFlow", m6912b);
            if (m6912b != 0) {
                m14093H0(this.f13397j, C3201d.b.FAILED_PURCHASE_RESPONSE, "BillingClient.launchBillingFlow failed");
            }
        }
    }

    /* renamed from: e1 */
    private void m14139e1() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20425g0();
    }

    /* renamed from: f0 */
    public static C3205h m14141f0(Context context) {
        if (f13386y == null) {
            f13386y = new C3205h(new C3198a(), new C3415h(), C5563e.m20379h());
            f13386y.m14182i1(AbstractC1173c.m6808f(context).m6820c(f13386y.f13409v).m6819b().m6818a());
        }
        return f13386y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f1 */
    public void m14142f1() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20426h0(m14184s0(), false);
    }

    /* renamed from: g0 */
    private static List<String> m14143g0() {
        String mo6605e1 = C1134c.m6537a().mo6605e1();
        if (!mo6605e1.isEmpty()) {
            if (f13383A == null) {
                f13383A = Arrays.asList(mo6605e1.split(","));
            }
            return f13383A;
        }
        return f13387z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public void m14144g1() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20427i0(m14184s0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public String m14146h0(List<Purchase> list) {
        Iterator<Purchase> it = list.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            str = str + m14181g(it.next()) + "; ";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public void m14147h1() {
        if (C5556b.m20348a()) {
            return;
        }
        this.f13403p.m20428j0(m14184s0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public C1181g m14149i0(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (!C1134c.m6537a().mo6649t1()) {
            if (z10) {
                return this.f13393f.get(str);
            }
            return this.f13392e.get(str);
        }
        if (z10 && this.f13393f.containsKey(str)) {
            return this.f13393f.get(str);
        }
        if (!z10 && this.f13392e.containsKey(str)) {
            return this.f13392e.get(str);
        }
        C1151k.m6708b("Unable to get product details for productId: " + str);
        return null;
    }

    /* renamed from: j0 */
    public static String m14151j0(C1181g c1181g, boolean z10) {
        if (z10) {
            List<C1181g.d> m6919d = c1181g.m6919d();
            Objects.requireNonNull(m6919d);
            return m6919d.get(0).m6932b().m6930a().get(0).m6927a();
        }
        C1181g.a m6916a = c1181g.m6916a();
        Objects.requireNonNull(m6916a);
        return m6916a.m6923a();
    }

    /* renamed from: j1 */
    private boolean m14152j1(String str, String str2, Activity activity, long j10, InterfaceC3096g interfaceC3096g, boolean z10) {
        C1151k.m6712f("rbx.purchaseflow", "startPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + "isInApp: " + m14184s0());
        this.f13399l = str;
        if (!m14186v0()) {
            return false;
        }
        this.f13405r = interfaceC3096g;
        this.f13401n = j10;
        this.f13397j = str2;
        this.f13396i = activity;
        this.f13400m = m14171u0(str2);
        g gVar = new g(str2);
        if (this.f13400m) {
            m14103M0(gVar);
            return true;
        }
        m14099K0(gVar);
        return true;
    }

    /* renamed from: k0 */
    public static long m14154k0(C1181g c1181g, boolean z10) {
        if (z10) {
            List<C1181g.d> m6919d = c1181g.m6919d();
            Objects.requireNonNull(m6919d);
            return m6919d.get(0).m6932b().m6930a().get(0).m6928b();
        }
        C1181g.a m6916a = c1181g.m6916a();
        Objects.requireNonNull(m6916a);
        return m6916a.m6924b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public String m14156l0(C1181g c1181g, boolean z10) {
        if (z10) {
            List<C1181g.d> m6919d = c1181g.m6919d();
            Objects.requireNonNull(m6919d);
            return m6919d.get(0).m6932b().m6930a().get(0).m6929c();
        }
        C1181g.a m6916a = c1181g.m6916a();
        Objects.requireNonNull(m6916a);
        return m6916a.m6925c();
    }

    /* renamed from: m0 */
    private static List<String> m14158m0() {
        String mo6655v1 = C1134c.m6537a().mo6655v1();
        if (!mo6655v1.isEmpty()) {
            if (f13385C == null) {
                f13385C = Arrays.asList(mo6655v1.split(","));
            }
            return f13385C;
        }
        return f13384B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public void m14160n0() {
        C1151k.m6712f("rbx.purchaseflow", "Do Google Purchase GrantPending");
        C4029k m16829a = C4029k.m16826a().m16830b("inapp").m16829a();
        C4029k m16829a2 = C4029k.m16826a().m16830b("subs").m16829a();
        this.f13388a.mo14066g(m16829a, this.f13410w);
        this.f13388a.mo14066g(m16829a2, this.f13411x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public void m14162o0(List<Purchase> list, final boolean z10) {
        if (list == null) {
            return;
        }
        if (!C1134c.m6537a().mo6551G()) {
            Iterator<Purchase> it = list.iterator();
            while (it.hasNext()) {
                m14164p0(it.next(), z10);
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        final Hashtable hashtable = new Hashtable();
        for (Purchase purchase : list) {
            String m14181g = m14181g(purchase);
            boolean m14176y0 = m14176y0(purchase);
            if (m14149i0(m14181g, m14176y0) != null) {
                m14164p0(purchase, z10);
            } else {
                arrayList.add(new n(m14181g, m14176y0 ? "subs" : "inapp"));
                hashtable.put(m14181g, purchase);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m14095I0(arrayList, new o() { // from class: f8.f
            @Override // p075f8.C3205h.o
            /* renamed from: a */
            public final void mo14076a(List list2) {
                C3205h.this.m14083C0(hashtable, z10, list2);
            }
        });
    }

    /* renamed from: p0 */
    private void m14164p0(Purchase purchase, boolean z10) {
        int m6784f = purchase.m6784f();
        if (m6784f == 0) {
            m14139e1();
        } else if (m6784f == 2) {
            m14115S0();
        }
        if (purchase.m6784f() != 1) {
            return;
        }
        this.f13394g.put(purchase.m6780b(), purchase);
        C1169a m6779a = purchase.m6779a();
        String m6799a = m6779a.m6799a();
        String m6800b = m6779a.m6800b();
        String str = this.f13399l;
        if (str == null || !str.equals(m6799a)) {
            long j10 = this.f13401n;
            if ((j10 <= 0 || !Long.toString(j10).equals(m6799a)) && (!C1134c.m6537a().mo6551G() || m6800b == null || m6800b.equals(BuildConfig.FLAVOR))) {
                m14113R0();
                if (!C1134c.m6537a().mo6578T0()) {
                    return;
                }
            }
        }
        if (!purchase.m6787i()) {
            m14089F0(purchase, z10);
        } else if (C1134c.m6537a().mo6582V0()) {
            m14126Y(purchase, C3201d.b.ALREADY_ACKNOWLEDGED);
        } else {
            m14128Z(purchase, true);
        }
    }

    /* renamed from: q0 */
    private boolean m14166q0() {
        return this.f13394g.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public boolean m14171u0(String str) {
        return m14158m0().contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public boolean m14176y0(Purchase purchase) {
        String m14181g = m14181g(purchase);
        return m14171u0(m14181g) || (C1134c.m6537a().mo6649t1() && !m14143g0().contains(m14181g));
    }

    /* renamed from: z0 */
    private boolean m14178z0(String str) {
        String str2 = this.f13397j;
        if (str2 == null || str == null) {
            return false;
        }
        return str2.equals(str);
    }

    @Override // p062e8.InterfaceC3093d
    /* renamed from: a */
    public boolean mo13610a(String str, String str2, Activity activity, long j10, InterfaceC3096g interfaceC3096g) {
        this.f13402o = false;
        return m14152j1(str, str2, activity, j10, interfaceC3096g, false);
    }

    /* renamed from: a0 */
    public void m14179a0(long j10, String str, boolean z10) {
        this.f13401n = j10;
        m14180b0(str, z10);
    }

    @Override // p062e8.InterfaceC3093d
    /* renamed from: b */
    public boolean mo13611b(long j10, String str, String str2, Activity activity, final boolean z10, InterfaceC3096g interfaceC3096g) {
        final C3199b c3199b = new C3199b(str2);
        if (!c3199b.m14071b()) {
            C1151k.m6709c("rbx.purchaseflow", "Purchase request is invalid. Raw payload: " + str2);
            return false;
        }
        if (c3199b.m14072c() && this.f13388a.mo14061b("subscriptions").m6912b() != 0) {
            m14109P0("IsSubscriptionsSupported", -2);
            C1151k.m6709c("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return false;
        }
        C1151k.m6712f("rbx.purchaseflow", "Initiated purchase. Params: " + c3199b);
        this.f13399l = Long.toString(j10);
        if (!m14186v0()) {
            C1151k.m6709c("rbx.purchaseflow", "Purchasing is not enabled. Params: " + c3199b);
            return false;
        }
        this.f13401n = j10;
        this.f13397j = c3199b.m14073d();
        this.f13407t = c3199b.m14070a();
        this.f13396i = activity;
        this.f13402o = !z10;
        this.f13405r = interfaceC3096g;
        this.f13400m = c3199b.m14072c();
        if (c3199b.m14072c()) {
            this.f13406s.put(c3199b.m14073d(), str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new n(c3199b.m14073d(), c3199b.m14074e()));
        m14095I0(arrayList, new o() { // from class: f8.e
            @Override // p075f8.C3205h.o
            /* renamed from: a */
            public final void mo14076a(List list) {
                C3205h.this.m14087E0(c3199b, z10, list);
            }
        });
        return true;
    }

    /* renamed from: b0 */
    public void m14180b0(String str, boolean z10) {
        this.f13399l = str;
        C1151k.m6707a("rbx.purchaseflow", "attemptGrantPendingPurchases isAppResume:" + z10);
        if (!m14187w0()) {
            C1151k.m6707a("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchasing is not setup");
            return;
        }
        if (!C1134c.m6537a().mo6551G() && !m14185t0() && !this.f13400m) {
            C1151k.m6707a("rbx.purchaseflow", "attemptGrantPendingPurchases failed: inapp product details missing when purchasing inapp product");
            m14097J0();
            return;
        }
        if (!C1134c.m6537a().mo6551G() && !m14188x0() && this.f13400m) {
            C1151k.m6707a("rbx.purchaseflow", "attemptGrantPendingPurchases failed: subs product details missing when purchasing subs product");
            m14101L0();
            return;
        }
        if (m14183r0()) {
            C1151k.m6707a("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchase already pending");
            return;
        }
        if (z10) {
            m14160n0();
            return;
        }
        if (m14166q0()) {
            C1151k.m6707a("rbx.purchaseflow", "Found cached pending purchase. Count = " + this.f13394g.size());
            m14160n0();
            return;
        }
        if (this.f13395h) {
            return;
        }
        m14160n0();
        this.f13395h = true;
    }

    @Override // p062e8.InterfaceC3093d
    /* renamed from: c */
    public boolean mo13612c(String str, String str2, Activity activity, InterfaceC3096g interfaceC3096g, boolean z10) {
        this.f13402o = true;
        return m14152j1(str, str2, activity, 0L, interfaceC3096g, z10);
    }

    /* renamed from: g */
    public String m14181g(Purchase purchase) {
        return C3198a.m14059k(purchase);
    }

    /* renamed from: i1 */
    public void m14182i1(AbstractC1173c abstractC1173c) {
        m mVar = this.f13389b;
        if (mVar == m.READY) {
            C1151k.m6712f("rbx.purchaseflow", "Google Billing Client is already setup");
            return;
        }
        m mVar2 = m.CONNECTING;
        if (mVar == mVar2) {
            C1151k.m6712f("rbx.purchaseflow", "Google Billing Client is already connecting");
            return;
        }
        this.f13388a.mo14063d(abstractC1173c);
        this.f13389b = mVar2;
        C1151k.m6712f("rbx.purchaseflow", "Connecting Google Billing's Client");
        this.f13388a.mo14068i(new d());
    }

    /* renamed from: r0 */
    public boolean m14183r0() {
        return this.f13397j != null;
    }

    /* renamed from: s0 */
    boolean m14184s0() {
        if (C1134c.m6537a().mo6543C()) {
            return this.f13402o;
        }
        return this.f13401n == 0;
    }

    /* renamed from: t0 */
    public boolean m14185t0() {
        return this.f13390c == m.READY;
    }

    /* renamed from: v0 */
    public boolean m14186v0() {
        return !this.f13399l.isEmpty() && m14187w0();
    }

    /* renamed from: w0 */
    public boolean m14187w0() {
        InterfaceC3206i interfaceC3206i = this.f13388a;
        return interfaceC3206i != null && this.f13389b == m.READY && interfaceC3206i.mo14065f();
    }

    /* renamed from: x0 */
    public boolean m14188x0() {
        return this.f13391d == m.READY;
    }
}
