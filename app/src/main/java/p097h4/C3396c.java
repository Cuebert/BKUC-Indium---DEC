package p097h4;

import android.net.Uri;
import com.appsflyer.oaid.BuildConfig;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p232s0.C4508s;

/* renamed from: h4.c */
/* loaded from: classes.dex */
public final class C3396c extends C4508s {

    /* renamed from: k */
    public static final b f14215k = new b(null);

    /* renamed from: d */
    private final String f14216d;

    /* renamed from: e */
    private final String f14217e;

    /* renamed from: f */
    private final String f14218f;

    /* renamed from: g */
    private final String f14219g;

    /* renamed from: h */
    private final String f14220h;

    /* renamed from: i */
    private final Uri f14221i;

    /* renamed from: j */
    private final String f14222j;

    /* renamed from: h4.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f14223a = BuildConfig.FLAVOR;

        /* renamed from: b */
        private String f14224b = BuildConfig.FLAVOR;

        /* renamed from: c */
        private String f14225c;

        /* renamed from: d */
        private String f14226d;

        /* renamed from: e */
        private String f14227e;

        /* renamed from: f */
        private Uri f14228f;

        /* renamed from: g */
        private String f14229g;

        /* renamed from: a */
        public final C3396c m14964a() {
            return new C3396c(this.f14223a, this.f14224b, this.f14225c, this.f14226d, this.f14227e, this.f14228f, this.f14229g);
        }

        /* renamed from: b */
        public final a m14965b(String str) {
            this.f14225c = str;
            return this;
        }

        /* renamed from: c */
        public final a m14966c(String str) {
            this.f14226d = str;
            return this;
        }

        /* renamed from: d */
        public final a m14967d(String str) {
            this.f14227e = str;
            return this;
        }

        /* renamed from: e */
        public final a m14968e(String id) {
            C3844i.m16253f(id, "id");
            this.f14223a = id;
            return this;
        }

        /* renamed from: f */
        public final a m14969f(String idToken) {
            C3844i.m16253f(idToken, "idToken");
            this.f14224b = idToken;
            return this;
        }

        /* renamed from: g */
        public final a m14970g(String str) {
            this.f14229g = str;
            return this;
        }

        /* renamed from: h */
        public final a m14971h(Uri uri) {
            this.f14228f = uri;
            return this;
        }
    }

    /* renamed from: h4.c$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C3840e c3840e) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3396c(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, android.net.Uri r8, java.lang.String r9) {
        /*
            r2 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.C3844i.m16253f(r3, r0)
            java.lang.String r1 = "idToken"
            kotlin.jvm.internal.C3844i.m16253f(r4, r1)
            kotlin.jvm.internal.C3844i.m16253f(r3, r0)
            kotlin.jvm.internal.C3844i.m16253f(r4, r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID"
            r0.putString(r1, r3)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN"
            r0.putString(r1, r4)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME"
            r0.putString(r1, r5)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME"
            r0.putString(r1, r6)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME"
            r0.putString(r1, r7)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER"
            r0.putString(r1, r9)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI"
            r0.putParcelable(r1, r8)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"
            r2.<init>(r1, r0)
            r2.f14216d = r3
            r2.f14217e = r4
            r2.f14218f = r5
            r2.f14219g = r6
            r2.f14220h = r7
            r2.f14221i = r8
            r2.f14222j = r9
            int r3 = r3.length()
            if (r3 <= 0) goto L60
            int r3 = r4.length()
            if (r3 <= 0) goto L58
            return
        L58:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "idToken should not be empty"
            r3.<init>(r4)
            throw r3
        L60:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "id should not be empty"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p097h4.C3396c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, java.lang.String):void");
    }
}
