package p074f7;

import android.os.Bundle;
import com.appsflyer.oaid.BuildConfig;
import p033c7.C1134c;

/* renamed from: f7.z */
/* loaded from: classes.dex */
public class C3197z {

    /* renamed from: a */
    private long f13328a = 0;

    /* renamed from: b */
    private long f13329b = 0;

    /* renamed from: c */
    private long f13330c = 0;

    /* renamed from: d */
    private String f13331d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private String f13332e = BuildConfig.FLAVOR;

    /* renamed from: f */
    private String f13333f = BuildConfig.FLAVOR;

    /* renamed from: g */
    private String f13334g = BuildConfig.FLAVOR;

    /* renamed from: h */
    private String f13335h = BuildConfig.FLAVOR;

    /* renamed from: i */
    private String f13336i = BuildConfig.FLAVOR;

    /* renamed from: j */
    private int f13337j = -1;

    /* renamed from: k */
    private String f13338k = BuildConfig.FLAVOR;

    /* renamed from: l */
    private String f13339l = BuildConfig.FLAVOR;

    /* renamed from: m */
    private String f13340m = BuildConfig.FLAVOR;

    /* renamed from: n */
    private String f13341n = BuildConfig.FLAVOR;

    private C3197z() {
    }

    /* renamed from: F */
    public static Bundle m14026F(Bundle bundle, C3197z c3197z) {
        if (c3197z == null) {
            return null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("mPlaceId", c3197z.m14045m());
        bundle.putLong("mUserId", c3197z.m14049q());
        bundle.putLong("mConversationId", c3197z.m14038f());
        bundle.putString("mAccessCode", c3197z.m14036d());
        bundle.putString("mLinkCode", c3197z.m14044l());
        bundle.putString("mGameId", c3197z.m14039g());
        bundle.putInt("mRequestType", c3197z.m14047o());
        bundle.putString("mReferralPage", c3197z.m14046n());
        bundle.putString("mLaunchData", c3197z.m14043k());
        bundle.putString("mJoinAttemptId", c3197z.m14041i());
        bundle.putString("mJoinAttemptOrigin", c3197z.m14042j());
        bundle.putString("mIsoContext", c3197z.m14040h());
        if (C1134c.m6537a().mo6629m1()) {
            bundle.putString("mReservedServerAccessCode", c3197z.m14048p());
            bundle.putString("mCallId", c3197z.m14037e());
        }
        return bundle;
    }

    /* renamed from: G */
    public static Bundle m14027G(C3197z c3197z) {
        return m14026F(null, c3197z);
    }

    /* renamed from: a */
    public static C3197z m14028a(Long l10, Long l11, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10) {
        C3197z c3197z = new C3197z();
        long longValue = l10 != null ? l10.longValue() : -1L;
        long longValue2 = l11 != null ? l11.longValue() : -1L;
        int i10 = -1;
        if (longValue2 != -1) {
            c3197z.m14035E(longValue2);
            if (longValue != -1) {
                c3197z.m14031A(longValue);
            }
            i10 = 1;
        } else if (longValue != -1) {
            c3197z.m14031A(longValue);
            if (str2 != null) {
                c3197z.m14058z(str2);
            } else if (str != null) {
                c3197z.m14050r(str);
            } else {
                if (str3 != null) {
                    c3197z.m14053u(str3);
                    i10 = 3;
                } else if (!C1134c.m6537a().mo6629m1() || str4 == null) {
                    i10 = 0;
                } else {
                    c3197z.m14034D(str4);
                    i10 = 8;
                }
                if (C1134c.m6537a().mo6629m1() && str5 != null) {
                    c3197z.m14051s(str5);
                }
            }
            i10 = 2;
            if (C1134c.m6537a().mo6629m1()) {
                c3197z.m14051s(str5);
            }
        }
        if (num != null) {
            c3197z.m14033C(num.intValue());
        } else {
            c3197z.m14033C(i10);
        }
        if (str6 != null) {
            c3197z.m14032B(str6);
        }
        if (str7 != null) {
            c3197z.m14057y(str7);
        }
        if (str8 != null) {
            c3197z.m14055w(str8);
        }
        if (str9 != null) {
            c3197z.m14056x(str9);
        }
        if (str10 != null) {
            c3197z.m14054v(str10);
        }
        return c3197z;
    }

    /* renamed from: b */
    public static C3197z m14029b(Long l10, Long l11, String str, String str2, String str3) {
        C3197z c3197z = new C3197z();
        long longValue = l10 != null ? l10.longValue() : -1L;
        long longValue2 = l11 != null ? l11.longValue() : -1L;
        if (longValue != -1 && longValue2 != -1) {
            c3197z.m14052t(longValue2);
            c3197z.m14031A(longValue);
            c3197z.m14033C(6);
        }
        if (str != null) {
            c3197z.m14032B(str);
        }
        if (str2 != null) {
            c3197z.m14055w(str2);
        }
        if (str3 != null) {
            c3197z.m14056x(str3);
        }
        return c3197z;
    }

    /* renamed from: c */
    public static C3197z m14030c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C3197z c3197z = new C3197z();
        c3197z.m14031A(bundle.getLong("mPlaceId", 0L));
        c3197z.m14035E(bundle.getLong("mUserId", 0L));
        c3197z.m14052t(bundle.getLong("mConversationId", 0L));
        c3197z.m14050r(bundle.getString("mAccessCode", BuildConfig.FLAVOR));
        c3197z.m14058z(bundle.getString("mLinkCode", BuildConfig.FLAVOR));
        c3197z.m14053u(bundle.getString("mGameId", BuildConfig.FLAVOR));
        c3197z.m14033C(bundle.getInt("mRequestType", -1));
        c3197z.m14032B(bundle.getString("mReferralPage", BuildConfig.FLAVOR));
        c3197z.m14057y(bundle.getString("mLaunchData"));
        c3197z.m14055w(bundle.getString("mJoinAttemptId", BuildConfig.FLAVOR));
        c3197z.m14056x(bundle.getString("mJoinAttemptOrigin", BuildConfig.FLAVOR));
        c3197z.m14054v(bundle.getString("mIsoContext", BuildConfig.FLAVOR));
        if (C1134c.m6537a().mo6629m1()) {
            c3197z.m14034D(bundle.getString("mReservedServerAccessCode", BuildConfig.FLAVOR));
            c3197z.m14051s(bundle.getString("mCallId", BuildConfig.FLAVOR));
        }
        return c3197z;
    }

    /* renamed from: A */
    public void m14031A(long j10) {
        this.f13328a = j10;
    }

    /* renamed from: B */
    public void m14032B(String str) {
        this.f13336i = str;
    }

    /* renamed from: C */
    public void m14033C(int i10) {
        this.f13337j = i10;
    }

    /* renamed from: D */
    public void m14034D(String str) {
        this.f13334g = str;
    }

    /* renamed from: E */
    public void m14035E(long j10) {
        this.f13329b = j10;
    }

    /* renamed from: d */
    public String m14036d() {
        return this.f13331d;
    }

    /* renamed from: e */
    public String m14037e() {
        return this.f13335h;
    }

    /* renamed from: f */
    public long m14038f() {
        return this.f13330c;
    }

    /* renamed from: g */
    public String m14039g() {
        return this.f13333f;
    }

    /* renamed from: h */
    public String m14040h() {
        return this.f13341n;
    }

    /* renamed from: i */
    public String m14041i() {
        return this.f13339l;
    }

    /* renamed from: j */
    public String m14042j() {
        return this.f13340m;
    }

    /* renamed from: k */
    public String m14043k() {
        return this.f13338k;
    }

    /* renamed from: l */
    public String m14044l() {
        return this.f13332e;
    }

    /* renamed from: m */
    public long m14045m() {
        return this.f13328a;
    }

    /* renamed from: n */
    public String m14046n() {
        return this.f13336i;
    }

    /* renamed from: o */
    public int m14047o() {
        return this.f13337j;
    }

    /* renamed from: p */
    public String m14048p() {
        return this.f13334g;
    }

    /* renamed from: q */
    public long m14049q() {
        return this.f13329b;
    }

    /* renamed from: r */
    public void m14050r(String str) {
        this.f13331d = str;
    }

    /* renamed from: s */
    public void m14051s(String str) {
        this.f13335h = str;
    }

    /* renamed from: t */
    public void m14052t(long j10) {
        this.f13330c = j10;
    }

    public String toString() {
        return getClass().getSimpleName() + "{ placeId:" + this.f13328a + ", userId:" + this.f13329b + ", conversationId:" + this.f13330c + ", accessCode:" + this.f13331d + ", linkCode:" + this.f13332e + ", gameId:" + this.f13333f + ", reservedServerAccessCode:" + this.f13334g + ", callId:" + this.f13335h + ", reqType:" + this.f13337j + ", referralPage:" + this.f13336i + ", launchData:" + this.f13338k + ", joinAttemptId:" + this.f13339l + ", joinAttemptOrigin:" + this.f13340m + ", mIsoContext:" + this.f13341n + " }";
    }

    /* renamed from: u */
    public void m14053u(String str) {
        this.f13333f = str;
    }

    /* renamed from: v */
    public void m14054v(String str) {
        this.f13341n = str;
    }

    /* renamed from: w */
    public void m14055w(String str) {
        this.f13339l = str;
    }

    /* renamed from: x */
    public void m14056x(String str) {
        this.f13340m = str;
    }

    /* renamed from: y */
    public void m14057y(String str) {
        this.f13338k = str;
    }

    /* renamed from: z */
    public void m14058z(String str) {
        this.f13332e = str;
    }
}
