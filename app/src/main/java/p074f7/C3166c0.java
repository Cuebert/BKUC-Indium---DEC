package p074f7;

import android.os.Bundle;
import com.appsflyer.oaid.BuildConfig;

/* renamed from: f7.c0 */
/* loaded from: classes.dex */
public class C3166c0 {

    /* renamed from: a */
    public int f13215a;

    /* renamed from: b */
    public long f13216b;

    /* renamed from: c */
    public long f13217c;

    /* renamed from: d */
    public String f13218d;

    /* renamed from: e */
    public String f13219e;

    /* renamed from: f */
    public String f13220f;

    /* renamed from: g */
    public long f13221g;

    /* renamed from: h */
    public String f13222h;

    /* renamed from: i */
    public String f13223i;

    /* renamed from: j */
    public String f13224j;

    /* renamed from: k */
    public String f13225k;

    /* renamed from: l */
    public String f13226l;

    /* renamed from: m */
    public String f13227m;

    /* renamed from: n */
    public String f13228n;

    public C3166c0(Bundle bundle) {
        this.f13215a = 0;
        this.f13216b = 0L;
        this.f13217c = 0L;
        this.f13218d = BuildConfig.FLAVOR;
        this.f13219e = BuildConfig.FLAVOR;
        this.f13220f = BuildConfig.FLAVOR;
        this.f13221g = 0L;
        this.f13222h = BuildConfig.FLAVOR;
        this.f13223i = BuildConfig.FLAVOR;
        this.f13224j = BuildConfig.FLAVOR;
        this.f13225k = BuildConfig.FLAVOR;
        this.f13226l = BuildConfig.FLAVOR;
        this.f13227m = BuildConfig.FLAVOR;
        this.f13228n = BuildConfig.FLAVOR;
        this.f13217c = bundle.getLong("roblox_placeId", 0L);
        this.f13218d = bundle.getString("roblox_accessCode");
        this.f13219e = bundle.getString("roblox_linkCode");
        this.f13220f = bundle.getString("roblox_gameId");
        this.f13216b = bundle.getLong("roblox_userId", 0L);
        this.f13221g = bundle.getLong("roblox_conversationId", 0L);
        this.f13222h = bundle.getString("roblox_reservedServerAccessCode");
        this.f13223i = bundle.getString("roblox_callId");
        this.f13215a = bundle.getInt("roblox_joinRequestType", -1);
        this.f13224j = bundle.getString("roblox_referralPage");
        this.f13225k = bundle.getString("roblox_launchData");
        this.f13226l = bundle.getString("roblox_joinAttemptId");
        this.f13227m = bundle.getString("roblox_joinAttemptOrigin");
        this.f13228n = bundle.getString("roblox_isoContext");
    }
}
