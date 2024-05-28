package com.roblox.client;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1152l;
import p061e7.ViewOnClickListenerC3080a;
import p214q7.C4327d;
import p300x7.C5564f;
import p300x7.C5565g;

/* renamed from: com.roblox.client.h */
/* loaded from: classes.dex */
public class C2834h {

    /* renamed from: a */
    private Fragment f11261a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.h$a */
    /* loaded from: classes.dex */
    public class a implements C4327d.b {
        a() {
        }

        @Override // p214q7.C4327d.b
        /* renamed from: a */
        public void mo12618a(boolean z10, C4327d.c cVar) {
            C1151k.m6714h("rbx.catalog", "onAssetRetrieved() " + z10);
            if (z10) {
                C4327d.c m12615c = C2834h.this.m12615c(cVar);
                C2834h.this.m12617d(m12615c.m17851a(), m12615c.m17853c(), m12615c.m17852b(), m12615c.m17854d());
            }
        }
    }

    public C2834h(Fragment fragment) {
        this.f11261a = fragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r1 = r3.optString("name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r8.m17856f(r1);
        p035c9.C1151k.m6707a("rbx.catalog", "Using localized promo name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        r1 = r3.optString("description");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r8.m17855e(r1);
        p035c9.C1151k.m6707a("rbx.catalog", "Using localized promo description");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p214q7.C4327d.c m12615c(p214q7.C4327d.c r8) {
        /*
            r7 = this;
            java.lang.String r0 = "rbx.catalog"
            c7.e r1 = p033c7.C1134c.m6537a()
            java.lang.String r1 = r1.mo6546D0()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L86
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L81
            r2.<init>(r1)     // Catch: org.json.JSONException -> L81
            java.lang.String r1 = "assetId"
            long r3 = r2.getLong(r1)     // Catch: org.json.JSONException -> L81
            long r5 = r8.m17851a()     // Catch: org.json.JSONException -> L81
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L86
            java.lang.String r1 = "locales"
            org.json.JSONArray r1 = r2.getJSONArray(r1)     // Catch: org.json.JSONException -> L81
            r2 = 0
        L2a:
            int r3 = r1.length()     // Catch: org.json.JSONException -> L81
            if (r2 >= r3) goto L86
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> L81
            java.lang.String r4 = "locale"
            java.lang.String r4 = r3.optString(r4)     // Catch: org.json.JSONException -> L81
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> L81
            if (r5 == 0) goto L41
            goto L7e
        L41:
            s7.f r5 = p239s7.C4535f.m18584b(r4)     // Catch: org.json.JSONException -> L81
            if (r5 != 0) goto L4b
            s7.f r5 = p239s7.C4535f.m18583a(r4)     // Catch: org.json.JSONException -> L81
        L4b:
            s7.b r4 = p239s7.C4531b.m18550f()     // Catch: org.json.JSONException -> L81
            boolean r4 = r4.m18561k(r5)     // Catch: org.json.JSONException -> L81
            if (r4 == 0) goto L7e
            java.lang.String r1 = "name"
            java.lang.String r1 = r3.optString(r1)     // Catch: org.json.JSONException -> L81
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L81
            if (r2 != 0) goto L69
            r8.m17856f(r1)     // Catch: org.json.JSONException -> L81
            java.lang.String r1 = "Using localized promo name"
            p035c9.C1151k.m6707a(r0, r1)     // Catch: org.json.JSONException -> L81
        L69:
            java.lang.String r1 = "description"
            java.lang.String r1 = r3.optString(r1)     // Catch: org.json.JSONException -> L81
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L81
            if (r2 != 0) goto L86
            r8.m17855e(r1)     // Catch: org.json.JSONException -> L81
            java.lang.String r1 = "Using localized promo description"
            p035c9.C1151k.m6707a(r0, r1)     // Catch: org.json.JSONException -> L81
            goto L86
        L7e:
            int r2 = r2 + 1
            goto L2a
        L81:
            java.lang.String r1 = "Could not parse catalog promo localization data"
            p035c9.C1151k.m6716j(r0, r1)
        L86:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.C2834h.m12615c(q7.d$c):q7.d$c");
    }

    /* renamed from: b */
    public void m12616b() {
        if (C1152l.m6736g()) {
            return;
        }
        long mo6636p = C1134c.m6537a().mo6636p();
        if (C2877p0.m12943q0("PREF_NAME_CATALOG_PROMO_SHOWN", Long.toString(mo6636p), C5565g.m20445e().m20458g()) || mo6636p <= 0) {
            return;
        }
        C1151k.m6714h("rbx.catalog", "getCatalogPromo() " + mo6636p);
        C5564f.m20442b().m7100c(new C4327d(mo6636p, new a()));
    }

    /* renamed from: d */
    protected void m12617d(long j10, String str, String str2, String str3) {
        String simpleName = ViewOnClickListenerC3080a.class.getSimpleName();
        if (C1134c.m6537a().mo6636p() == j10 && this.f11261a.m4370r0() && this.f11261a.m4364p0() && !this.f11261a.m4358n0() && this.f11261a.m4273E() != null && this.f11261a.m4273E().m4498j0(simpleName) == null) {
            C1151k.m6714h("rbx.catalog", "showPromo() title:" + str + " description:" + str2);
            ViewOnClickListenerC3080a viewOnClickListenerC3080a = new ViewOnClickListenerC3080a();
            viewOnClickListenerC3080a.m4606m2(2, 0);
            int dimensionPixelSize = this.f11261a.m4307Q().getDimensionPixelSize(C2911w.f11722b);
            Bundle bundle = new Bundle();
            bundle.putInt("dialogWidth", dimensionPixelSize);
            bundle.putInt("dialogHeight", -2);
            bundle.putLong("assetId", j10);
            bundle.putString("title", str);
            bundle.putString("description", str2);
            bundle.putString("thumbnail", str3);
            viewOnClickListenerC3080a.m4282H1(bundle);
            viewOnClickListenerC3080a.mo4608o2(this.f11261a.m4273E(), simpleName);
            C2877p0.m12861E0("PREF_NAME_CATALOG_PROMO_SHOWN", Long.toString(j10), C5565g.m20445e().m20458g());
        }
    }
}
