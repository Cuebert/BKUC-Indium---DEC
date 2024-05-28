package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.n9 */
/* loaded from: classes.dex */
public final class C2235n9 {

    /* renamed from: a */
    private final C2219m4 f8376a;

    public C2235n9(C2219m4 c2219m4) {
        this.f8376a = c2219m4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10191a(String str, Bundle bundle) {
        String uri;
        this.f8376a.mo9761b().mo9917h();
        if (this.f8376a.m10127o()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.f8376a.m10107F().f8648u.m10312b(uri);
        this.f8376a.m10107F().f8649v.m10299b(this.f8376a.mo9767e().mo13781a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m10192b() {
        this.f8376a.mo9761b().mo9917h();
        if (m10194d()) {
            if (m10195e()) {
                this.f8376a.m10107F().f8648u.m10312b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f8376a.m10109I().m10175u("auto", "_cmpx", bundle);
            } else {
                String m10311a = this.f8376a.m10107F().f8648u.m10311a();
                if (TextUtils.isEmpty(m10311a)) {
                    this.f8376a.mo9765d().m10050t().m9893a("Cache still valid but referrer not found");
                } else {
                    long m10298a = ((this.f8376a.m10107F().f8649v.m10298a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(m10311a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", m10298a);
                    Object obj = pair.first;
                    this.f8376a.m10109I().m10175u(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f8376a.m10107F().f8648u.m10312b(null);
            }
            this.f8376a.m10107F().f8649v.m10299b(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m10193c() {
        if (m10194d() && m10195e()) {
            this.f8376a.m10107F().f8648u.m10312b(null);
        }
    }

    /* renamed from: d */
    final boolean m10194d() {
        return this.f8376a.m10107F().f8649v.m10298a() > 0;
    }

    /* renamed from: e */
    final boolean m10195e() {
        return m10194d() && this.f8376a.mo9767e().mo13781a() - this.f8376a.m10107F().f8649v.m10298a() > this.f8376a.m10134z().m9875r(null, C2335x2.f8688S);
    }
}
