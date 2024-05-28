package p154l7;

import org.json.JSONObject;
import p008a7.C0051i;
import p024bc.C1100c;
import p156l9.AbstractC3900a;
import p156l9.C3901b;

/* renamed from: l7.f */
/* loaded from: classes.dex */
public class C3892f extends C3901b {

    /* renamed from: l7.f$b */
    /* loaded from: classes.dex */
    private class b implements C3901b.b {
        private b() {
        }

        /* renamed from: b */
        private String m16505b(String str) {
            if ("Settings".equals(str)) {
                return "SETTINGS_TAG";
            }
            if ("Friends".equals(str)) {
                return "FRIENDS_TAG";
            }
            if ("Games".equals(str)) {
                return "GAMES_TAG";
            }
            if ("Home".equals(str)) {
                return "HOME_TAG";
            }
            if ("Messages".equals(str)) {
                return "MESSAGES_TAG";
            }
            if ("Avatar".equals(str)) {
                return "AVATAR_EDITOR_TAG";
            }
            if ("Abuse Report".equals(str)) {
                return "ABUSE_REPORT_TAG";
            }
            if ("Friend Finder".equals(str)) {
                return "FRIEND_FINDER_TAG";
            }
            if ("Universal Friends".equals(str)) {
                return "UNIVERSAL_FRIENDS_TAG";
            }
            if ("GameDetails".equals(str)) {
                return "GAME_DETAILS_TAG";
            }
            if ("CaptchaSuccess".equals(str)) {
                return "CAPTCHA_SUCCESS_TAG";
            }
            if ("CaptchaShown".equals(str)) {
                return "CAPTCHA_SHOWN_TAG";
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
        @Override // p156l9.C3901b.b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo16503a(p156l9.AbstractC3900a r7) {
            /*
                r6 = this;
                org.json.JSONObject r0 = r7.m16542f()
                r1 = 0
                if (r0 == 0) goto L1e
                java.lang.String r2 = "params"
                org.json.JSONObject r0 = r0.optJSONObject(r2)
                if (r0 == 0) goto L1c
                java.lang.String r2 = "feature"
                java.lang.String r2 = r0.optString(r2, r1)
                java.lang.String r3 = "urlPath"
                java.lang.String r3 = r0.optString(r3, r1)
                goto L21
            L1c:
                r2 = r1
                goto L20
            L1e:
                r0 = r1
                r2 = r0
            L20:
                r3 = r2
            L21:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r5 = " "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "Navigation"
                p035c9.C1151k.m6714h(r5, r4)
                r4 = 0
                if (r2 == 0) goto L58
                java.lang.String r2 = r6.m16505b(r2)
                if (r2 == 0) goto L58
                a7.i r4 = new a7.i
                r4.<init>(r2)
                r4.m255i(r3)
                if (r0 == 0) goto L50
                r4.m254h(r0)
            L50:
                bc.c r0 = p024bc.C1100c.m6458d()
                r0.m6469j(r4)
                r4 = 1
            L58:
                r7.mo16537a(r4, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p154l7.C3892f.b.mo16503a(l9.a):void");
        }
    }

    /* renamed from: l7.f$c */
    /* loaded from: classes.dex */
    private class c implements C3901b.b {
        private c() {
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            JSONObject m16542f = abstractC3900a.m16542f();
            if (m16542f != null) {
                long optLong = m16542f.optLong("userId", -1L);
                C0051i c0051i = new C0051i("PROFILE_TAG");
                c0051i.m255i(C0051i.m249c(optLong));
                C1100c.m6458d().m6469j(c0051i);
                abstractC3900a.mo16537a(true, null);
            }
        }
    }

    public C3892f() {
        super("Navigation");
        m16549d("navigateToFeature", new b());
        m16549d("openUserProfile", new c());
    }
}
