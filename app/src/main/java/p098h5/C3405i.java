package p098h5;

import android.content.Context;
import android.text.TextUtils;
import p070f3.C3139m;
import p321z2.C5980h;
import p321z2.C5984j;
import p321z2.C5988l;

/* renamed from: h5.i */
/* loaded from: classes.dex */
public final class C3405i {

    /* renamed from: a */
    private final String f14253a;

    /* renamed from: b */
    private final String f14254b;

    /* renamed from: c */
    private final String f14255c;

    /* renamed from: d */
    private final String f14256d;

    /* renamed from: e */
    private final String f14257e;

    /* renamed from: f */
    private final String f14258f;

    /* renamed from: g */
    private final String f14259g;

    private C3405i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C5984j.m21290n(!C3139m.m13810a(str), "ApplicationId must be set.");
        this.f14254b = str;
        this.f14253a = str2;
        this.f14255c = str3;
        this.f14256d = str4;
        this.f14257e = str5;
        this.f14258f = str6;
        this.f14259g = str7;
    }

    /* renamed from: a */
    public static C3405i m14999a(Context context) {
        C5988l c5988l = new C5988l(context);
        String m21296a = c5988l.m21296a("google_app_id");
        if (TextUtils.isEmpty(m21296a)) {
            return null;
        }
        return new C3405i(m21296a, c5988l.m21296a("google_api_key"), c5988l.m21296a("firebase_database_url"), c5988l.m21296a("ga_trackingId"), c5988l.m21296a("gcm_defaultSenderId"), c5988l.m21296a("google_storage_bucket"), c5988l.m21296a("project_id"));
    }

    /* renamed from: b */
    public String m15000b() {
        return this.f14253a;
    }

    /* renamed from: c */
    public String m15001c() {
        return this.f14254b;
    }

    /* renamed from: d */
    public String m15002d() {
        return this.f14257e;
    }

    /* renamed from: e */
    public String m15003e() {
        return this.f14259g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3405i)) {
            return false;
        }
        C3405i c3405i = (C3405i) obj;
        return C5980h.m21269b(this.f14254b, c3405i.f14254b) && C5980h.m21269b(this.f14253a, c3405i.f14253a) && C5980h.m21269b(this.f14255c, c3405i.f14255c) && C5980h.m21269b(this.f14256d, c3405i.f14256d) && C5980h.m21269b(this.f14257e, c3405i.f14257e) && C5980h.m21269b(this.f14258f, c3405i.f14258f) && C5980h.m21269b(this.f14259g, c3405i.f14259g);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f14254b, this.f14253a, this.f14255c, this.f14256d, this.f14257e, this.f14258f, this.f14259g);
    }

    public String toString() {
        return C5980h.m21271d(this).m21272a("applicationId", this.f14254b).m21272a("apiKey", this.f14253a).m21272a("databaseUrl", this.f14255c).m21272a("gcmSenderId", this.f14257e).m21272a("storageBucket", this.f14258f).m21272a("projectId", this.f14259g).toString();
    }
}
