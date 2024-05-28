package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import android.view.Surface;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.engine.jni.autovalue.C2936c;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;

/* loaded from: classes.dex */
public abstract class StartGameParams {
    private static final String TAG = "StartGameParams";

    /* loaded from: classes.dex */
    public static abstract class Builder {
        /* renamed from: a */
        abstract StartGameParams mo13301a();

        /* renamed from: b */
        public final StartGameParams m13302b() {
            return mo13301a();
        }

        /* renamed from: c */
        public abstract Builder mo13303c(String str);

        /* renamed from: d */
        public abstract Builder mo13304d(String str);

        /* renamed from: e */
        public abstract Builder mo13305e(long j10);

        /* renamed from: f */
        public abstract Builder mo13306f(DeviceParams deviceParams);

        /* renamed from: g */
        public abstract Builder mo13307g(String str);

        /* renamed from: h */
        public abstract Builder mo13308h(boolean z10);

        /* renamed from: i */
        public abstract Builder mo13309i(String str);

        /* renamed from: j */
        public abstract Builder mo13310j(String str);

        /* renamed from: k */
        public abstract Builder mo13311k(String str);

        /* renamed from: l */
        public abstract Builder mo13312l(int i10);

        /* renamed from: m */
        public abstract Builder mo13313m(String str);

        /* renamed from: n */
        public abstract Builder mo13314n(String str);

        /* renamed from: o */
        public abstract Builder mo13315o(long j10);

        /* renamed from: p */
        public abstract Builder mo13316p(PlatformParams platformParams);

        /* renamed from: q */
        public abstract Builder mo13317q(String str);

        /* renamed from: r */
        public abstract Builder mo13318r(String str);

        /* renamed from: s */
        public abstract Builder mo13319s(Surface surface);

        /* renamed from: t */
        public abstract Builder mo13320t(long j10);

        /* renamed from: u */
        public abstract Builder mo13321u(String str);

        /* renamed from: v */
        public abstract Builder mo13322v(Activity activity);
    }

    public static Builder builder() {
        return new C2936c.b().mo13313m(BuildConfig.FLAVOR).mo13314n(BuildConfig.FLAVOR).mo13318r(BuildConfig.FLAVOR).mo13304d(BuildConfig.FLAVOR).mo13310j(BuildConfig.FLAVOR).mo13311k(BuildConfig.FLAVOR).mo13309i(BuildConfig.FLAVOR);
    }

    public abstract String accessCode();

    public abstract String callId();

    public abstract long conversationId();

    public abstract DeviceParams deviceParams();

    public abstract String gameId();

    public abstract boolean isUnder13();

    public abstract String isoContext();

    public abstract String joinAttemptId();

    public abstract String joinAttemptOrigin();

    public abstract int joinRequestType();

    public abstract String launchData();

    public abstract String linkCode();

    public abstract long placeId();

    public abstract PlatformParams platformParams();

    public abstract String referralPage();

    public abstract String reservedServerAccessCode();

    public abstract Surface surface();

    public abstract long userId();

    public abstract String username();

    public abstract Activity vrContext();
}
