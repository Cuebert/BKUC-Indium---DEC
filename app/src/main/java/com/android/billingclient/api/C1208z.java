package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC2024r5;
import com.google.android.gms.internal.play_billing.C1907b0;
import com.google.android.gms.internal.play_billing.C1925d4;
import com.google.android.gms.internal.play_billing.C2005p0;
import java.util.List;
import org.json.JSONException;
import p171n1.C4036n0;
import p171n1.C4045u;
import p171n1.InterfaceC4013c;
import p171n1.InterfaceC4027j;
import p171n1.InterfaceC4050z;

/* renamed from: com.android.billingclient.api.z */
/* loaded from: classes.dex */
public final class C1208z extends BroadcastReceiver {

    /* renamed from: a */
    private final InterfaceC4027j f5714a;

    /* renamed from: b */
    private final InterfaceC4050z f5715b;

    /* renamed from: c */
    private final InterfaceC4013c f5716c;

    /* renamed from: d */
    private final InterfaceC1195n f5717d;

    /* renamed from: e */
    private boolean f5718e;

    /* renamed from: f */
    final /* synthetic */ C1170a0 f5719f;

    public /* synthetic */ C1208z(C1170a0 c1170a0, InterfaceC4050z interfaceC4050z, InterfaceC1195n interfaceC1195n, C4036n0 c4036n0) {
        this.f5719f = c1170a0;
        this.f5714a = null;
        this.f5716c = null;
        this.f5715b = null;
        this.f5717d = interfaceC1195n;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ InterfaceC4050z m6962a(C1208z c1208z) {
        InterfaceC4050z interfaceC4050z = c1208z.f5715b;
        return null;
    }

    /* renamed from: d */
    private final void m6964d(Bundle bundle, C1179f c1179f, int i10) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
            try {
                this.f5717d.mo6954c(C1925d4.m9316z(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), C2005p0.m9537a()));
                return;
            } catch (Throwable unused) {
                C1907b0.m9250i("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        this.f5717d.mo6954c(C4045u.m16836a(23, i10, c1179f));
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* renamed from: c */
    public final void m6965c(Context context, IntentFilter intentFilter) {
        C1208z c1208z;
        C1208z c1208z2;
        if (this.f5718e) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            c1208z2 = this.f5719f.f5521b;
            context.registerReceiver(c1208z2, intentFilter, 2);
        } else {
            c1208z = this.f5719f.f5521b;
            context.registerReceiver(c1208z, intentFilter);
        }
        this.f5718e = true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C1907b0.m9250i("BillingBroadcastManager", "Bundle is null.");
            InterfaceC1195n interfaceC1195n = this.f5717d;
            C1179f c1179f = C1197o.f5690j;
            interfaceC1195n.mo6954c(C4045u.m16836a(11, 1, c1179f));
            InterfaceC4027j interfaceC4027j = this.f5714a;
            if (interfaceC4027j != null) {
                interfaceC4027j.mo14194a(c1179f, null);
                return;
            }
            return;
        }
        C1179f m9245d = C1907b0.m9245d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        int i10 = 2;
        if (string != "LAUNCH_BILLING_FLOW" && (string == null || !string.equals("LAUNCH_BILLING_FLOW"))) {
            i10 = 1;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            List<Purchase> m9248g = C1907b0.m9248g(extras);
            if (m9245d.m6912b() == 0) {
                this.f5717d.mo6952a(C4045u.m16837b(i10));
            } else {
                m6964d(extras, m9245d, i10);
            }
            this.f5714a.mo14194a(m9245d, m9248g);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (m9245d.m6912b() != 0) {
                m6964d(extras, m9245d, i10);
                this.f5714a.mo14194a(m9245d, AbstractC2024r5.m9560s());
                return;
            }
            if (this.f5716c == null) {
                C1907b0.m9250i("BillingBroadcastManager", "AlternativeBillingListener is null.");
                InterfaceC1195n interfaceC1195n2 = this.f5717d;
                C1179f c1179f2 = C1197o.f5690j;
                interfaceC1195n2.mo6954c(C4045u.m16836a(15, i10, c1179f2));
                this.f5714a.mo14194a(c1179f2, AbstractC2024r5.m9560s());
                return;
            }
            String string2 = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string2 == null) {
                C1907b0.m9250i("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                InterfaceC1195n interfaceC1195n3 = this.f5717d;
                C1179f c1179f3 = C1197o.f5690j;
                interfaceC1195n3.mo6954c(C4045u.m16836a(16, i10, c1179f3));
                this.f5714a.mo14194a(c1179f3, AbstractC2024r5.m9560s());
                return;
            }
            try {
                C1171b c1171b = new C1171b(string2);
                this.f5717d.mo6952a(C4045u.m16837b(i10));
                this.f5716c.m16818a(c1171b);
            } catch (JSONException unused) {
                C1907b0.m9250i("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", string2));
                InterfaceC1195n interfaceC1195n4 = this.f5717d;
                C1179f c1179f4 = C1197o.f5690j;
                interfaceC1195n4.mo6954c(C4045u.m16836a(17, i10, c1179f4));
                this.f5714a.mo14194a(c1179f4, AbstractC2024r5.m9560s());
            }
        }
    }

    public /* synthetic */ C1208z(C1170a0 c1170a0, InterfaceC4027j interfaceC4027j, InterfaceC4013c interfaceC4013c, InterfaceC1195n interfaceC1195n, C4036n0 c4036n0) {
        this.f5719f = c1170a0;
        this.f5714a = interfaceC4027j;
        this.f5717d = interfaceC1195n;
        this.f5716c = interfaceC4013c;
        this.f5715b = null;
    }
}
