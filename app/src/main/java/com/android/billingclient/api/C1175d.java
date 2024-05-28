package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.C1179f;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.play_billing.AbstractC2024r5;
import com.google.android.gms.internal.play_billing.C1907b0;
import com.google.android.gms.internal.play_billing.C1918c4;
import com.google.android.gms.internal.play_billing.C1925d4;
import com.google.android.gms.internal.play_billing.C1946g4;
import com.google.android.gms.internal.play_billing.C1953h4;
import com.google.android.gms.internal.play_billing.C1967j4;
import com.google.android.gms.internal.play_billing.C1981l4;
import com.google.android.gms.internal.play_billing.C1995n4;
import com.google.android.gms.internal.play_billing.C2002o4;
import com.google.android.gms.internal.play_billing.C2044u4;
import com.google.android.gms.internal.play_billing.C2058w4;
import com.google.android.gms.internal.play_billing.InterfaceC1910b3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
import p171n1.C4009a;
import p171n1.C4016d0;
import p171n1.C4017e;
import p171n1.C4029k;
import p171n1.C4031l;
import p171n1.C4045u;
import p171n1.InterfaceC4011b;
import p171n1.InterfaceC4013c;
import p171n1.InterfaceC4015d;
import p171n1.InterfaceC4019f;
import p171n1.InterfaceC4021g;
import p171n1.InterfaceC4023h;
import p171n1.InterfaceC4025i;
import p171n1.InterfaceC4027j;
import p171n1.InterfaceC4050z;

/* renamed from: com.android.billingclient.api.d */
/* loaded from: classes.dex */
public class C1175d extends AbstractC1173c {

    /* renamed from: a */
    private volatile int f5537a;

    /* renamed from: b */
    private final String f5538b;

    /* renamed from: c */
    private final Handler f5539c;

    /* renamed from: d */
    private volatile C1170a0 f5540d;

    /* renamed from: e */
    private Context f5541e;

    /* renamed from: f */
    private InterfaceC1195n f5542f;

    /* renamed from: g */
    private volatile InterfaceC1910b3 f5543g;

    /* renamed from: h */
    private volatile ServiceConnectionC1191l f5544h;

    /* renamed from: i */
    private boolean f5545i;

    /* renamed from: j */
    private boolean f5546j;

    /* renamed from: k */
    private int f5547k;

    /* renamed from: l */
    private boolean f5548l;

    /* renamed from: m */
    private boolean f5549m;

    /* renamed from: n */
    private boolean f5550n;

    /* renamed from: o */
    private boolean f5551o;

    /* renamed from: p */
    private boolean f5552p;

    /* renamed from: q */
    private boolean f5553q;

    /* renamed from: r */
    private boolean f5554r;

    /* renamed from: s */
    private boolean f5555s;

    /* renamed from: t */
    private boolean f5556t;

    /* renamed from: u */
    private boolean f5557u;

    /* renamed from: v */
    private boolean f5558v;

    /* renamed from: w */
    private boolean f5559w;

    /* renamed from: x */
    private C1201s f5560x;

    /* renamed from: y */
    private boolean f5561y;

    /* renamed from: z */
    private ExecutorService f5562z;

    private C1175d(Context context, C1201s c1201s, InterfaceC4027j interfaceC4027j, String str, String str2, InterfaceC4013c interfaceC4013c, InterfaceC1195n interfaceC1195n) {
        this.f5537a = 0;
        this.f5539c = new Handler(Looper.getMainLooper());
        this.f5547k = 0;
        this.f5538b = str;
        m6846k(context, interfaceC4027j, c1201s, interfaceC4013c, str, null);
    }

    /* renamed from: A */
    public final C1179f m6821A() {
        if (this.f5537a != 0 && this.f5537a != 3) {
            return C1197o.f5690j;
        }
        return C1197o.f5693m;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: B */
    private static String m6822B() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "6.0.1";
        }
    }

    /* renamed from: C */
    public final Future m6823C(Callable callable, long j10, Runnable runnable, Handler handler) {
        if (this.f5562z == null) {
            this.f5562z = Executors.newFixedThreadPool(C1907b0.f7632a, new ThreadFactoryC1185i(this));
        }
        try {
            Future submit = this.f5562z.submit(callable);
            handler.postDelayed(new Runnable() { // from class: n1.p0

                /* renamed from: n */
                public final /* synthetic */ Future f16447n;

                /* renamed from: o */
                public final /* synthetic */ Runnable f16448o;

                public /* synthetic */ RunnableC4040p0(Future submit2, Runnable runnable2) {
                    r1 = submit2;
                    r2 = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Future future = r1;
                    Runnable runnable2 = r2;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    C1907b0.m9250i("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return submit2;
        } catch (Exception e10) {
            C1907b0.m9251j("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    /* renamed from: D */
    private final void m6824D(String str, InterfaceC4023h interfaceC4023h) {
        if (!mo6812d()) {
            InterfaceC1195n interfaceC1195n = this.f5542f;
            C1179f c1179f = C1197o.f5693m;
            interfaceC1195n.mo6954c(C4045u.m16836a(2, 11, c1179f));
            interfaceC4023h.mo14189a(c1179f, null);
            return;
        }
        if (m6823C(new CallableC1196n0(this, str, interfaceC4023h), 30000L, new Runnable() { // from class: com.android.billingclient.api.f0

            /* renamed from: o */
            public final /* synthetic */ InterfaceC4023h f5600o;

            public /* synthetic */ RunnableC1180f0(InterfaceC4023h interfaceC4023h2) {
                r2 = interfaceC4023h2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1175d.this.m6865v(r2);
            }
        }, m6854y()) == null) {
            C1179f m6821A = m6821A();
            this.f5542f.mo6954c(C4045u.m16836a(25, 11, m6821A));
            interfaceC4023h2.mo14189a(m6821A, null);
        }
    }

    /* renamed from: E */
    private final void m6825E(String str, InterfaceC4025i interfaceC4025i) {
        if (!mo6812d()) {
            InterfaceC1195n interfaceC1195n = this.f5542f;
            C1179f c1179f = C1197o.f5693m;
            interfaceC1195n.mo6954c(C4045u.m16836a(2, 9, c1179f));
            interfaceC4025i.mo14190a(c1179f, AbstractC2024r5.m9560s());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C1907b0.m9250i("BillingClient", "Please provide a valid product type.");
            InterfaceC1195n interfaceC1195n2 = this.f5542f;
            C1179f c1179f2 = C1197o.f5687g;
            interfaceC1195n2.mo6954c(C4045u.m16836a(50, 9, c1179f2));
            interfaceC4025i.mo14190a(c1179f2, AbstractC2024r5.m9560s());
            return;
        }
        if (m6823C(new CallableC1194m0(this, str, interfaceC4025i), 30000L, new Runnable() { // from class: com.android.billingclient.api.k0

            /* renamed from: o */
            public final /* synthetic */ InterfaceC4025i f5662o;

            public /* synthetic */ RunnableC1190k0(InterfaceC4025i interfaceC4025i2) {
                r2 = interfaceC4025i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1175d.this.m6866w(r2);
            }
        }, m6854y()) == null) {
            C1179f m6821A = m6821A();
            this.f5542f.mo6954c(C4045u.m16836a(25, 9, m6821A));
            interfaceC4025i2.mo14190a(m6821A, AbstractC2024r5.m9560s());
        }
    }

    /* renamed from: F */
    private final void m6826F(C1179f c1179f, int i10, int i11) {
        if (c1179f.m6912b() != 0) {
            InterfaceC1195n interfaceC1195n = this.f5542f;
            C1918c4 m9314x = C1925d4.m9314x();
            C1967j4 m9494w = C1981l4.m9494w();
            m9494w.m9468o(c1179f.m6912b());
            m9494w.m9467n(c1179f.m6911a());
            m9494w.m9469p(i10);
            m9314x.m9281n(m9494w);
            m9314x.m9283p(5);
            C2044u4 m9674w = C2058w4.m9674w();
            m9674w.m9665n(i11);
            m9314x.m9282o((C2058w4) m9674w.m9695h());
            interfaceC1195n.mo6954c((C1925d4) m9314x.m9695h());
            return;
        }
        InterfaceC1195n interfaceC1195n2 = this.f5542f;
        C1946g4 m9382w = C1953h4.m9382w();
        m9382w.m9354o(5);
        C2044u4 m9674w2 = C2058w4.m9674w();
        m9674w2.m9665n(i11);
        m9382w.m9353n((C2058w4) m9674w2.m9695h());
        interfaceC1195n2.mo6952a((C1953h4) m9382w.m9695h());
    }

    /* renamed from: L */
    public static /* synthetic */ C1193m m6830L(C1175d c1175d, String str) {
        C1907b0.m9249h("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle m9244c = C1907b0.m9244c(c1175d.f5550n, c1175d.f5558v, true, false, c1175d.f5538b);
        String str2 = null;
        while (c1175d.f5548l) {
            try {
                Bundle mo9260M = c1175d.f5543g.mo9260M(6, c1175d.f5541e.getPackageName(), str, str2, m9244c);
                C1206x m6961a = C1207y.m6961a(mo9260M, "BillingClient", "getPurchaseHistory()");
                C1179f m6959a = m6961a.m6959a();
                if (m6959a != C1197o.f5692l) {
                    c1175d.f5542f.mo6954c(C4045u.m16836a(m6961a.m6960b(), 11, m6959a));
                    return new C1193m(m6959a, null);
                }
                ArrayList<String> stringArrayList = mo9260M.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = mo9260M.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = mo9260M.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z10 = false;
                for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                    String str3 = stringArrayList2.get(i10);
                    String str4 = stringArrayList3.get(i10);
                    C1907b0.m9249h("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.m6789b())) {
                            C1907b0.m9250i("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e10) {
                        C1907b0.m9251j("BillingClient", "Got an exception trying to decode the purchase!", e10);
                        InterfaceC1195n interfaceC1195n = c1175d.f5542f;
                        C1179f c1179f = C1197o.f5690j;
                        interfaceC1195n.mo6954c(C4045u.m16836a(51, 11, c1179f));
                        return new C1193m(c1179f, null);
                    }
                }
                if (z10) {
                    c1175d.f5542f.mo6954c(C4045u.m16836a(26, 11, C1197o.f5690j));
                }
                str2 = mo9260M.getString("INAPP_CONTINUATION_TOKEN");
                C1907b0.m9249h("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new C1193m(C1197o.f5692l, arrayList);
                }
            } catch (RemoteException e11) {
                C1907b0.m9251j("BillingClient", "Got exception trying to get purchase history, try to reconnect", e11);
                InterfaceC1195n interfaceC1195n2 = c1175d.f5542f;
                C1179f c1179f2 = C1197o.f5693m;
                interfaceC1195n2.mo6954c(C4045u.m16836a(59, 11, c1179f2));
                return new C1193m(c1179f2, null);
            }
        }
        C1907b0.m9250i("BillingClient", "getPurchaseHistory is not supported on current device");
        return new C1193m(C1197o.f5697q, null);
    }

    /* renamed from: k */
    private void m6846k(Context context, InterfaceC4027j interfaceC4027j, C1201s c1201s, InterfaceC4013c interfaceC4013c, String str, InterfaceC1195n interfaceC1195n) {
        this.f5541e = context.getApplicationContext();
        C1995n4 m9517w = C2002o4.m9517w();
        m9517w.m9513o(str);
        m9517w.m9512n(this.f5541e.getPackageName());
        if (interfaceC1195n != null) {
            this.f5542f = interfaceC1195n;
        } else {
            this.f5542f = new C1198p(this.f5541e, (C2002o4) m9517w.m9695h());
        }
        if (interfaceC4027j == null) {
            C1907b0.m9250i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f5540d = new C1170a0(this.f5541e, interfaceC4027j, interfaceC4013c, this.f5542f);
        this.f5560x = c1201s;
        this.f5561y = interfaceC4013c != null;
    }

    /* renamed from: x */
    public static /* synthetic */ C4016d0 m6853x(C1175d c1175d, String str, int i10) {
        Bundle mo9263p0;
        C1907b0.m9249h("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        Bundle m9244c = C1907b0.m9244c(c1175d.f5550n, c1175d.f5558v, true, false, c1175d.f5538b);
        List list = null;
        String str2 = null;
        while (true) {
            try {
                if (c1175d.f5550n) {
                    mo9263p0 = c1175d.f5543g.mo9264s0(z10 != c1175d.f5558v ? 9 : 19, c1175d.f5541e.getPackageName(), str, str2, m9244c);
                } else {
                    mo9263p0 = c1175d.f5543g.mo9263p0(3, c1175d.f5541e.getPackageName(), str, str2);
                }
                C1206x m6961a = C1207y.m6961a(mo9263p0, "BillingClient", "getPurchase()");
                C1179f m6959a = m6961a.m6959a();
                if (m6959a != C1197o.f5692l) {
                    c1175d.f5542f.mo6954c(C4045u.m16836a(m6961a.m6960b(), 9, m6959a));
                    return new C4016d0(m6959a, list);
                }
                ArrayList<String> stringArrayList = mo9263p0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = mo9263p0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = mo9263p0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z11 = false;
                for (int i11 = 0; i11 < stringArrayList2.size(); i11++) {
                    String str3 = stringArrayList2.get(i11);
                    String str4 = stringArrayList3.get(i11);
                    C1907b0.m9249h("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i11))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.m6785g())) {
                            C1907b0.m9250i("BillingClient", "BUG: empty/null token!");
                            z11 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e10) {
                        C1907b0.m9251j("BillingClient", "Got an exception trying to decode the purchase!", e10);
                        InterfaceC1195n interfaceC1195n = c1175d.f5542f;
                        C1179f c1179f = C1197o.f5690j;
                        interfaceC1195n.mo6954c(C4045u.m16836a(51, 9, c1179f));
                        return new C4016d0(c1179f, null);
                    }
                }
                if (z11) {
                    c1175d.f5542f.mo6954c(C4045u.m16836a(26, 9, C1197o.f5690j));
                }
                str2 = mo9263p0.getString("INAPP_CONTINUATION_TOKEN");
                C1907b0.m9249h("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new C4016d0(C1197o.f5692l, arrayList);
                }
                list = null;
                z10 = true;
            } catch (Exception e11) {
                InterfaceC1195n interfaceC1195n2 = c1175d.f5542f;
                C1179f c1179f2 = C1197o.f5693m;
                interfaceC1195n2.mo6954c(C4045u.m16836a(52, 9, c1179f2));
                C1907b0.m9251j("BillingClient", "Got exception trying to get purchasesm try to reconnect", e11);
                return new C4016d0(c1179f2, null);
            }
        }
    }

    /* renamed from: y */
    public final Handler m6854y() {
        return Looper.myLooper() == null ? this.f5539c : new Handler(Looper.myLooper());
    }

    /* renamed from: z */
    private final C1179f m6855z(C1179f c1179f) {
        if (Thread.interrupted()) {
            return c1179f;
        }
        this.f5539c.post(new Runnable() { // from class: com.android.billingclient.api.l0

            /* renamed from: o */
            public final /* synthetic */ C1179f f5668o;

            public /* synthetic */ RunnableC1192l0(C1179f c1179f2) {
                r2 = c1179f2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1175d.this.m6862s(r2);
            }
        });
        return c1179f2;
    }

    /* renamed from: I */
    public final /* synthetic */ Bundle m6856I(int i10, String str, String str2, C1177e c1177e, Bundle bundle) throws Exception {
        return this.f5543g.mo9259K(i10, this.f5541e.getPackageName(), str, str2, null, bundle);
    }

    /* renamed from: J */
    public final /* synthetic */ Bundle m6857J(String str, String str2) throws Exception {
        return this.f5543g.mo9265t0(3, this.f5541e.getPackageName(), str, str2, null);
    }

    /* renamed from: P */
    public final /* synthetic */ Object m6858P(C4009a c4009a, InterfaceC4011b interfaceC4011b) throws Exception {
        try {
            InterfaceC1910b3 interfaceC1910b3 = this.f5543g;
            String packageName = this.f5541e.getPackageName();
            String m16815a = c4009a.m16815a();
            String str = this.f5538b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle mo9256A0 = interfaceC1910b3.mo9256A0(9, packageName, m16815a, bundle);
            int m9243b = C1907b0.m9243b(mo9256A0, "BillingClient");
            String m9246e = C1907b0.m9246e(mo9256A0, "BillingClient");
            C1179f.a m6908c = C1179f.m6908c();
            m6908c.m6915c(m9243b);
            m6908c.m6914b(m9246e);
            interfaceC4011b.mo14195a(m6908c.m6913a());
            return null;
        } catch (Exception e10) {
            C1907b0.m9251j("BillingClient", "Error acknowledge purchase!", e10);
            InterfaceC1195n interfaceC1195n = this.f5542f;
            C1179f c1179f = C1197o.f5693m;
            interfaceC1195n.mo6954c(C4045u.m16836a(28, 3, c1179f));
            interfaceC4011b.mo14195a(c1179f);
            return null;
        }
    }

    /* renamed from: Q */
    public final /* synthetic */ Object m6859Q(C4017e c4017e, InterfaceC4019f interfaceC4019f) throws Exception {
        int mo9257C;
        String str;
        String m16823a = c4017e.m16823a();
        try {
            C1907b0.m9249h("BillingClient", "Consuming purchase with token: " + m16823a);
            if (this.f5550n) {
                InterfaceC1910b3 interfaceC1910b3 = this.f5543g;
                String packageName = this.f5541e.getPackageName();
                boolean z10 = this.f5550n;
                String str2 = this.f5538b;
                Bundle bundle = new Bundle();
                if (z10) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                Bundle mo9258F = interfaceC1910b3.mo9258F(9, packageName, m16823a, bundle);
                mo9257C = mo9258F.getInt("RESPONSE_CODE");
                str = C1907b0.m9246e(mo9258F, "BillingClient");
            } else {
                mo9257C = this.f5543g.mo9257C(3, this.f5541e.getPackageName(), m16823a);
                str = BuildConfig.FLAVOR;
            }
            C1179f.a m6908c = C1179f.m6908c();
            m6908c.m6915c(mo9257C);
            m6908c.m6914b(str);
            C1179f m6913a = m6908c.m6913a();
            if (mo9257C == 0) {
                C1907b0.m9249h("BillingClient", "Successfully consumed purchase.");
                interfaceC4019f.mo14196a(m6913a, m16823a);
                return null;
            }
            C1907b0.m9250i("BillingClient", "Error consuming purchase with token. Response code: " + mo9257C);
            this.f5542f.mo6954c(C4045u.m16836a(23, 4, m6913a));
            interfaceC4019f.mo14196a(m6913a, m16823a);
            return null;
        } catch (Exception e10) {
            C1907b0.m9251j("BillingClient", "Error consuming purchase!", e10);
            InterfaceC1195n interfaceC1195n = this.f5542f;
            C1179f c1179f = C1197o.f5693m;
            interfaceC1195n.mo6954c(C4045u.m16836a(29, 4, c1179f));
            interfaceC4019f.mo14196a(c1179f, m16823a);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0138, code lost:
    
        r13 = "Item is unavailable for purchase.";
        r15 = 4;
     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object m6860R(com.android.billingclient.api.C1183h r28, p171n1.InterfaceC4021g r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1175d.m6860R(com.android.billingclient.api.h, n1.g):java.lang.Object");
    }

    @Override // com.android.billingclient.api.AbstractC1173c
    /* renamed from: a */
    public final void mo6809a(C4009a c4009a, InterfaceC4011b interfaceC4011b) {
        if (!mo6812d()) {
            InterfaceC1195n interfaceC1195n = this.f5542f;
            C1179f c1179f = C1197o.f5693m;
            interfaceC1195n.mo6954c(C4045u.m16836a(2, 3, c1179f));
            interfaceC4011b.mo14195a(c1179f);
            return;
        }
        if (TextUtils.isEmpty(c4009a.m16815a())) {
            C1907b0.m9250i("BillingClient", "Please provide a valid purchase token.");
            InterfaceC1195n interfaceC1195n2 = this.f5542f;
            C1179f c1179f2 = C1197o.f5689i;
            interfaceC1195n2.mo6954c(C4045u.m16836a(26, 3, c1179f2));
            interfaceC4011b.mo14195a(c1179f2);
            return;
        }
        if (!this.f5550n) {
            InterfaceC1195n interfaceC1195n3 = this.f5542f;
            C1179f c1179f3 = C1197o.f5682b;
            interfaceC1195n3.mo6954c(C4045u.m16836a(27, 3, c1179f3));
            interfaceC4011b.mo14195a(c1179f3);
            return;
        }
        if (m6823C(new Callable() { // from class: com.android.billingclient.api.g0

            /* renamed from: b */
            public final /* synthetic */ C4009a f5638b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC4011b f5639c;

            public /* synthetic */ CallableC1182g0(C4009a c4009a2, InterfaceC4011b interfaceC4011b2) {
                r2 = c4009a2;
                r3 = interfaceC4011b2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1175d.this.m6858P(r2, r3);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.h0

            /* renamed from: o */
            public final /* synthetic */ InterfaceC4011b f5647o;

            public /* synthetic */ RunnableC1184h0(InterfaceC4011b interfaceC4011b2) {
                r2 = interfaceC4011b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1175d.this.m6861r(r2);
            }
        }, m6854y()) == null) {
            C1179f m6821A = m6821A();
            this.f5542f.mo6954c(C4045u.m16836a(25, 3, m6821A));
            interfaceC4011b2.mo14195a(m6821A);
        }
    }

    @Override // com.android.billingclient.api.AbstractC1173c
    /* renamed from: b */
    public final void mo6810b(C4017e c4017e, InterfaceC4019f interfaceC4019f) {
        if (!mo6812d()) {
            InterfaceC1195n interfaceC1195n = this.f5542f;
            C1179f c1179f = C1197o.f5693m;
            interfaceC1195n.mo6954c(C4045u.m16836a(2, 4, c1179f));
            interfaceC4019f.mo14196a(c1179f, c4017e.m16823a());
            return;
        }
        if (m6823C(new Callable() { // from class: com.android.billingclient.api.d0

            /* renamed from: b */
            public final /* synthetic */ C4017e f5564b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC4019f f5565c;

            public /* synthetic */ CallableC1176d0(C4017e c4017e2, InterfaceC4019f interfaceC4019f2) {
                r2 = c4017e2;
                r3 = interfaceC4019f2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1175d.this.m6859Q(r2, r3);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.e0

            /* renamed from: o */
            public final /* synthetic */ InterfaceC4019f f5593o;

            /* renamed from: p */
            public final /* synthetic */ C4017e f5594p;

            public /* synthetic */ RunnableC1178e0(InterfaceC4019f interfaceC4019f2, C4017e c4017e2) {
                r2 = interfaceC4019f2;
                r3 = c4017e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1175d.this.m6863t(r2, r3);
            }
        }, m6854y()) == null) {
            C1179f m6821A = m6821A();
            this.f5542f.mo6954c(C4045u.m16836a(25, 4, m6821A));
            interfaceC4019f2.mo14196a(m6821A, c4017e2.m16823a());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.AbstractC1173c
    /* renamed from: c */
    public final C1179f mo6811c(String str) {
        char c10;
        if (!mo6812d()) {
            C1179f c1179f = C1197o.f5693m;
            if (c1179f.m6912b() != 0) {
                this.f5542f.mo6954c(C4045u.m16836a(2, 5, c1179f));
            } else {
                this.f5542f.mo6952a(C4045u.m16837b(5));
            }
            return c1179f;
        }
        int i10 = C1197o.f5680D;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 97314:
                if (str.equals("bbb")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 101286:
                if (str.equals("fff")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 102279:
                if (str.equals("ggg")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 104265:
                if (str.equals("iii")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                C1179f c1179f2 = this.f5545i ? C1197o.f5692l : C1197o.f5695o;
                m6826F(c1179f2, 9, 2);
                return c1179f2;
            case 1:
                C1179f c1179f3 = this.f5546j ? C1197o.f5692l : C1197o.f5696p;
                m6826F(c1179f3, 10, 3);
                return c1179f3;
            case 2:
                C1179f c1179f4 = this.f5549m ? C1197o.f5692l : C1197o.f5698r;
                m6826F(c1179f4, 35, 4);
                return c1179f4;
            case 3:
                C1179f c1179f5 = this.f5552p ? C1197o.f5692l : C1197o.f5703w;
                m6826F(c1179f5, 30, 5);
                return c1179f5;
            case 4:
                C1179f c1179f6 = this.f5554r ? C1197o.f5692l : C1197o.f5699s;
                m6826F(c1179f6, 31, 6);
                return c1179f6;
            case 5:
                C1179f c1179f7 = this.f5553q ? C1197o.f5692l : C1197o.f5701u;
                m6826F(c1179f7, 21, 7);
                return c1179f7;
            case 6:
                C1179f c1179f8 = this.f5555s ? C1197o.f5692l : C1197o.f5700t;
                m6826F(c1179f8, 19, 8);
                return c1179f8;
            case 7:
                C1179f c1179f9 = this.f5555s ? C1197o.f5692l : C1197o.f5700t;
                m6826F(c1179f9, 61, 9);
                return c1179f9;
            case '\b':
                C1179f c1179f10 = this.f5556t ? C1197o.f5692l : C1197o.f5702v;
                m6826F(c1179f10, 20, 10);
                return c1179f10;
            case '\t':
                C1179f c1179f11 = this.f5557u ? C1197o.f5692l : C1197o.f5706z;
                m6826F(c1179f11, 32, 11);
                return c1179f11;
            case '\n':
                C1179f c1179f12 = this.f5557u ? C1197o.f5692l : C1197o.f5677A;
                m6826F(c1179f12, 33, 12);
                return c1179f12;
            case 11:
                C1179f c1179f13 = this.f5559w ? C1197o.f5692l : C1197o.f5679C;
                m6826F(c1179f13, 60, 13);
                return c1179f13;
            default:
                C1907b0.m9250i("BillingClient", "Unsupported feature: ".concat(str));
                C1179f c1179f14 = C1197o.f5705y;
                m6826F(c1179f14, 34, 1);
                return c1179f14;
        }
    }

    @Override // com.android.billingclient.api.AbstractC1173c
    /* renamed from: d */
    public final boolean mo6812d() {
        return (this.f5537a != 2 || this.f5543g == null || this.f5544h == null) ? false : true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.android.billingclient.api.i0.<init>(com.android.billingclient.api.d, int, java.lang.String, java.lang.String, com.android.billingclient.api.e, android.os.Bundle):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0477 A[Catch: Exception -> 0x04c2, CancellationException -> 0x04d9, TimeoutException -> 0x04db, TryCatch #4 {CancellationException -> 0x04d9, TimeoutException -> 0x04db, Exception -> 0x04c2, blocks: (B:128:0x0465, B:130:0x0477, B:132:0x04a8), top: B:127:0x0465 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04a8 A[Catch: Exception -> 0x04c2, CancellationException -> 0x04d9, TimeoutException -> 0x04db, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x04d9, TimeoutException -> 0x04db, Exception -> 0x04c2, blocks: (B:128:0x0465, B:130:0x0477, B:132:0x04a8), top: B:127:0x0465 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03dc  */
    @Override // com.android.billingclient.api.AbstractC1173c
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.C1179f mo6813e(android.app.Activity r32, com.android.billingclient.api.C1177e r33) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1175d.mo6813e(android.app.Activity, com.android.billingclient.api.e):com.android.billingclient.api.f");
    }

    @Override // com.android.billingclient.api.AbstractC1173c
    /* renamed from: g */
    public final void mo6814g(C1183h c1183h, InterfaceC4021g interfaceC4021g) {
        if (!mo6812d()) {
            InterfaceC1195n interfaceC1195n = this.f5542f;
            C1179f c1179f = C1197o.f5693m;
            interfaceC1195n.mo6954c(C4045u.m16836a(2, 7, c1179f));
            interfaceC4021g.mo14077a(c1179f, new ArrayList());
            return;
        }
        if (!this.f5556t) {
            C1907b0.m9250i("BillingClient", "Querying product details is not supported.");
            InterfaceC1195n interfaceC1195n2 = this.f5542f;
            C1179f c1179f2 = C1197o.f5702v;
            interfaceC1195n2.mo6954c(C4045u.m16836a(20, 7, c1179f2));
            interfaceC4021g.mo14077a(c1179f2, new ArrayList());
            return;
        }
        if (m6823C(new Callable() { // from class: com.android.billingclient.api.b0

            /* renamed from: b */
            public final /* synthetic */ C1183h f5529b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC4021g f5530c;

            public /* synthetic */ CallableC1172b0(C1183h c1183h2, InterfaceC4021g interfaceC4021g2) {
                r2 = c1183h2;
                r3 = interfaceC4021g2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1175d.this.m6860R(r2, r3);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.c0

            /* renamed from: o */
            public final /* synthetic */ InterfaceC4021g f5536o;

            public /* synthetic */ RunnableC1174c0(InterfaceC4021g interfaceC4021g2) {
                r2 = interfaceC4021g2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1175d.this.m6864u(r2);
            }
        }, m6854y()) == null) {
            C1179f m6821A = m6821A();
            this.f5542f.mo6954c(C4045u.m16836a(25, 7, m6821A));
            interfaceC4021g2.mo14077a(m6821A, new ArrayList());
        }
    }

    @Override // com.android.billingclient.api.AbstractC1173c
    /* renamed from: h */
    public final void mo6815h(C4029k c4029k, InterfaceC4023h interfaceC4023h) {
        m6824D(c4029k.m16827b(), interfaceC4023h);
    }

    @Override // com.android.billingclient.api.AbstractC1173c
    /* renamed from: i */
    public final void mo6816i(C4031l c4031l, InterfaceC4025i interfaceC4025i) {
        m6825E(c4031l.m16832b(), interfaceC4025i);
    }

    @Override // com.android.billingclient.api.AbstractC1173c
    /* renamed from: j */
    public final void mo6817j(InterfaceC4015d interfaceC4015d) {
        if (mo6812d()) {
            C1907b0.m9249h("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.f5542f.mo6952a(C4045u.m16837b(6));
            interfaceC4015d.mo14191a(C1197o.f5692l);
            return;
        }
        int i10 = 1;
        if (this.f5537a == 1) {
            C1907b0.m9250i("BillingClient", "Client is already in the process of connecting to billing service.");
            InterfaceC1195n interfaceC1195n = this.f5542f;
            C1179f c1179f = C1197o.f5684d;
            interfaceC1195n.mo6954c(C4045u.m16836a(37, 6, c1179f));
            interfaceC4015d.mo14191a(c1179f);
            return;
        }
        if (this.f5537a == 3) {
            C1907b0.m9250i("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            InterfaceC1195n interfaceC1195n2 = this.f5542f;
            C1179f c1179f2 = C1197o.f5693m;
            interfaceC1195n2.mo6954c(C4045u.m16836a(38, 6, c1179f2));
            interfaceC4015d.mo14191a(c1179f2);
            return;
        }
        this.f5537a = 1;
        this.f5540d.m6804d();
        C1907b0.m9249h("BillingClient", "Starting in-app billing setup.");
        this.f5544h = new ServiceConnectionC1191l(this, interfaceC4015d, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> queryIntentServices = this.f5541e.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            i10 = 41;
        } else {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f5538b);
                    if (this.f5541e.bindService(intent2, this.f5544h, 1)) {
                        C1907b0.m9249h("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        C1907b0.m9250i("BillingClient", "Connection to Billing service is blocked.");
                        i10 = 39;
                    }
                } else {
                    C1907b0.m9250i("BillingClient", "The device doesn't have valid Play Store.");
                    i10 = 40;
                }
            }
        }
        this.f5537a = 0;
        C1907b0.m9249h("BillingClient", "Billing service unavailable on device.");
        InterfaceC1195n interfaceC1195n3 = this.f5542f;
        C1179f c1179f3 = C1197o.f5683c;
        interfaceC1195n3.mo6954c(C4045u.m16836a(i10, 6, c1179f3));
        interfaceC4015d.mo14191a(c1179f3);
    }

    /* renamed from: r */
    public final /* synthetic */ void m6861r(InterfaceC4011b interfaceC4011b) {
        InterfaceC1195n interfaceC1195n = this.f5542f;
        C1179f c1179f = C1197o.f5694n;
        interfaceC1195n.mo6954c(C4045u.m16836a(24, 3, c1179f));
        interfaceC4011b.mo14195a(c1179f);
    }

    /* renamed from: s */
    public final /* synthetic */ void m6862s(C1179f c1179f) {
        if (this.f5540d.m6803c() != null) {
            this.f5540d.m6803c().mo14194a(c1179f, null);
        } else {
            this.f5540d.m6802b();
            C1907b0.m9250i("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    /* renamed from: t */
    public final /* synthetic */ void m6863t(InterfaceC4019f interfaceC4019f, C4017e c4017e) {
        InterfaceC1195n interfaceC1195n = this.f5542f;
        C1179f c1179f = C1197o.f5694n;
        interfaceC1195n.mo6954c(C4045u.m16836a(24, 4, c1179f));
        interfaceC4019f.mo14196a(c1179f, c4017e.m16823a());
    }

    /* renamed from: u */
    public final /* synthetic */ void m6864u(InterfaceC4021g interfaceC4021g) {
        InterfaceC1195n interfaceC1195n = this.f5542f;
        C1179f c1179f = C1197o.f5694n;
        interfaceC1195n.mo6954c(C4045u.m16836a(24, 7, c1179f));
        interfaceC4021g.mo14077a(c1179f, new ArrayList());
    }

    /* renamed from: v */
    public final /* synthetic */ void m6865v(InterfaceC4023h interfaceC4023h) {
        InterfaceC1195n interfaceC1195n = this.f5542f;
        C1179f c1179f = C1197o.f5694n;
        interfaceC1195n.mo6954c(C4045u.m16836a(24, 11, c1179f));
        interfaceC4023h.mo14189a(c1179f, null);
    }

    /* renamed from: w */
    public final /* synthetic */ void m6866w(InterfaceC4025i interfaceC4025i) {
        InterfaceC1195n interfaceC1195n = this.f5542f;
        C1179f c1179f = C1197o.f5694n;
        interfaceC1195n.mo6954c(C4045u.m16836a(24, 9, c1179f));
        interfaceC4025i.mo14190a(c1179f, AbstractC2024r5.m9560s());
    }

    public C1175d(String str, C1201s c1201s, Context context, InterfaceC4050z interfaceC4050z, InterfaceC1195n interfaceC1195n) {
        this.f5537a = 0;
        this.f5539c = new Handler(Looper.getMainLooper());
        this.f5547k = 0;
        this.f5538b = m6822B();
        this.f5541e = context.getApplicationContext();
        C1995n4 m9517w = C2002o4.m9517w();
        m9517w.m9513o(m6822B());
        m9517w.m9512n(this.f5541e.getPackageName());
        this.f5542f = new C1198p(this.f5541e, (C2002o4) m9517w.m9695h());
        C1907b0.m9250i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f5540d = new C1170a0(this.f5541e, null, this.f5542f);
        this.f5560x = c1201s;
    }

    public C1175d(String str, C1201s c1201s, Context context, InterfaceC4027j interfaceC4027j, InterfaceC4013c interfaceC4013c, InterfaceC1195n interfaceC1195n) {
        this(context, c1201s, interfaceC4027j, m6822B(), null, interfaceC4013c, null);
    }
}
