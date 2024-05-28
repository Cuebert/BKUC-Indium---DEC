package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import android.view.Surface;
import com.roblox.engine.jni.autovalue.StartGameParams;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.Objects;

/* renamed from: com.roblox.engine.jni.autovalue.c */
/* loaded from: classes.dex */
final class C2936c extends StartGameParams {

    /* renamed from: a */
    private final Surface f12041a;

    /* renamed from: b */
    private final PlatformParams f12042b;

    /* renamed from: c */
    private final DeviceParams f12043c;

    /* renamed from: d */
    private final long f12044d;

    /* renamed from: e */
    private final long f12045e;

    /* renamed from: f */
    private final String f12046f;

    /* renamed from: g */
    private final String f12047g;

    /* renamed from: h */
    private final String f12048h;

    /* renamed from: i */
    private final boolean f12049i;

    /* renamed from: j */
    private final String f12050j;

    /* renamed from: k */
    private final long f12051k;

    /* renamed from: l */
    private final String f12052l;

    /* renamed from: m */
    private final String f12053m;

    /* renamed from: n */
    private final int f12054n;

    /* renamed from: o */
    private final String f12055o;

    /* renamed from: p */
    private final String f12056p;

    /* renamed from: q */
    private final String f12057q;

    /* renamed from: r */
    private final String f12058r;

    /* renamed from: s */
    private final String f12059s;

    /* renamed from: t */
    private final Activity f12060t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.engine.jni.autovalue.c$b */
    /* loaded from: classes.dex */
    public static final class b extends StartGameParams.Builder {

        /* renamed from: a */
        private Surface f12061a;

        /* renamed from: b */
        private PlatformParams f12062b;

        /* renamed from: c */
        private DeviceParams f12063c;

        /* renamed from: d */
        private Long f12064d;

        /* renamed from: e */
        private Long f12065e;

        /* renamed from: f */
        private String f12066f;

        /* renamed from: g */
        private String f12067g;

        /* renamed from: h */
        private String f12068h;

        /* renamed from: i */
        private Boolean f12069i;

        /* renamed from: j */
        private String f12070j;

        /* renamed from: k */
        private Long f12071k;

        /* renamed from: l */
        private String f12072l;

        /* renamed from: m */
        private String f12073m;

        /* renamed from: n */
        private Integer f12074n;

        /* renamed from: o */
        private String f12075o;

        /* renamed from: p */
        private String f12076p;

        /* renamed from: q */
        private String f12077q;

        /* renamed from: r */
        private String f12078r;

        /* renamed from: s */
        private String f12079s;

        /* renamed from: t */
        private Activity f12080t;

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: a */
        StartGameParams mo13301a() {
            PlatformParams platformParams;
            Long l10;
            Surface surface = this.f12061a;
            if (surface != null && (platformParams = this.f12062b) != null && (l10 = this.f12064d) != null && this.f12065e != null && this.f12066f != null && this.f12067g != null && this.f12068h != null && this.f12069i != null && this.f12070j != null && this.f12071k != null && this.f12072l != null && this.f12073m != null && this.f12074n != null && this.f12075o != null && this.f12076p != null && this.f12077q != null && this.f12078r != null && this.f12079s != null) {
                return new C2936c(surface, platformParams, this.f12063c, l10.longValue(), this.f12065e.longValue(), this.f12066f, this.f12067g, this.f12068h, this.f12069i.booleanValue(), this.f12070j, this.f12071k.longValue(), this.f12072l, this.f12073m, this.f12074n.intValue(), this.f12075o, this.f12076p, this.f12077q, this.f12078r, this.f12079s, this.f12080t);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f12061a == null) {
                sb2.append(" surface");
            }
            if (this.f12062b == null) {
                sb2.append(" platformParams");
            }
            if (this.f12064d == null) {
                sb2.append(" placeId");
            }
            if (this.f12065e == null) {
                sb2.append(" userId");
            }
            if (this.f12066f == null) {
                sb2.append(" accessCode");
            }
            if (this.f12067g == null) {
                sb2.append(" linkCode");
            }
            if (this.f12068h == null) {
                sb2.append(" gameId");
            }
            if (this.f12069i == null) {
                sb2.append(" isUnder13");
            }
            if (this.f12070j == null) {
                sb2.append(" username");
            }
            if (this.f12071k == null) {
                sb2.append(" conversationId");
            }
            if (this.f12072l == null) {
                sb2.append(" reservedServerAccessCode");
            }
            if (this.f12073m == null) {
                sb2.append(" callId");
            }
            if (this.f12074n == null) {
                sb2.append(" joinRequestType");
            }
            if (this.f12075o == null) {
                sb2.append(" referralPage");
            }
            if (this.f12076p == null) {
                sb2.append(" launchData");
            }
            if (this.f12077q == null) {
                sb2.append(" joinAttemptId");
            }
            if (this.f12078r == null) {
                sb2.append(" joinAttemptOrigin");
            }
            if (this.f12079s == null) {
                sb2.append(" isoContext");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: c */
        public StartGameParams.Builder mo13303c(String str) {
            Objects.requireNonNull(str, "Null accessCode");
            this.f12066f = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: d */
        public StartGameParams.Builder mo13304d(String str) {
            Objects.requireNonNull(str, "Null callId");
            this.f12073m = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: e */
        public StartGameParams.Builder mo13305e(long j10) {
            this.f12071k = Long.valueOf(j10);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: f */
        public StartGameParams.Builder mo13306f(DeviceParams deviceParams) {
            this.f12063c = deviceParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: g */
        public StartGameParams.Builder mo13307g(String str) {
            Objects.requireNonNull(str, "Null gameId");
            this.f12068h = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: h */
        public StartGameParams.Builder mo13308h(boolean z10) {
            this.f12069i = Boolean.valueOf(z10);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: i */
        public StartGameParams.Builder mo13309i(String str) {
            Objects.requireNonNull(str, "Null isoContext");
            this.f12079s = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: j */
        public StartGameParams.Builder mo13310j(String str) {
            Objects.requireNonNull(str, "Null joinAttemptId");
            this.f12077q = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: k */
        public StartGameParams.Builder mo13311k(String str) {
            Objects.requireNonNull(str, "Null joinAttemptOrigin");
            this.f12078r = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: l */
        public StartGameParams.Builder mo13312l(int i10) {
            this.f12074n = Integer.valueOf(i10);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: m */
        public StartGameParams.Builder mo13313m(String str) {
            Objects.requireNonNull(str, "Null launchData");
            this.f12076p = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: n */
        public StartGameParams.Builder mo13314n(String str) {
            Objects.requireNonNull(str, "Null linkCode");
            this.f12067g = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: o */
        public StartGameParams.Builder mo13315o(long j10) {
            this.f12064d = Long.valueOf(j10);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: p */
        public StartGameParams.Builder mo13316p(PlatformParams platformParams) {
            Objects.requireNonNull(platformParams, "Null platformParams");
            this.f12062b = platformParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: q */
        public StartGameParams.Builder mo13317q(String str) {
            Objects.requireNonNull(str, "Null referralPage");
            this.f12075o = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: r */
        public StartGameParams.Builder mo13318r(String str) {
            Objects.requireNonNull(str, "Null reservedServerAccessCode");
            this.f12072l = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: s */
        public StartGameParams.Builder mo13319s(Surface surface) {
            Objects.requireNonNull(surface, "Null surface");
            this.f12061a = surface;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: t */
        public StartGameParams.Builder mo13320t(long j10) {
            this.f12065e = Long.valueOf(j10);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: u */
        public StartGameParams.Builder mo13321u(String str) {
            Objects.requireNonNull(str, "Null username");
            this.f12070j = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        /* renamed from: v */
        public StartGameParams.Builder mo13322v(Activity activity) {
            this.f12080t = activity;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String accessCode() {
        return this.f12046f;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String callId() {
        return this.f12053m;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public long conversationId() {
        return this.f12051k;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public DeviceParams deviceParams() {
        return this.f12043c;
    }

    public boolean equals(Object obj) {
        DeviceParams deviceParams;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartGameParams)) {
            return false;
        }
        StartGameParams startGameParams = (StartGameParams) obj;
        if (this.f12041a.equals(startGameParams.surface()) && this.f12042b.equals(startGameParams.platformParams()) && ((deviceParams = this.f12043c) != null ? deviceParams.equals(startGameParams.deviceParams()) : startGameParams.deviceParams() == null) && this.f12044d == startGameParams.placeId() && this.f12045e == startGameParams.userId() && this.f12046f.equals(startGameParams.accessCode()) && this.f12047g.equals(startGameParams.linkCode()) && this.f12048h.equals(startGameParams.gameId()) && this.f12049i == startGameParams.isUnder13() && this.f12050j.equals(startGameParams.username()) && this.f12051k == startGameParams.conversationId() && this.f12052l.equals(startGameParams.reservedServerAccessCode()) && this.f12053m.equals(startGameParams.callId()) && this.f12054n == startGameParams.joinRequestType() && this.f12055o.equals(startGameParams.referralPage()) && this.f12056p.equals(startGameParams.launchData()) && this.f12057q.equals(startGameParams.joinAttemptId()) && this.f12058r.equals(startGameParams.joinAttemptOrigin()) && this.f12059s.equals(startGameParams.isoContext())) {
            Activity activity = this.f12060t;
            if (activity == null) {
                if (startGameParams.vrContext() == null) {
                    return true;
                }
            } else if (activity.equals(startGameParams.vrContext())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String gameId() {
        return this.f12048h;
    }

    public int hashCode() {
        int hashCode = (((this.f12041a.hashCode() ^ 1000003) * 1000003) ^ this.f12042b.hashCode()) * 1000003;
        DeviceParams deviceParams = this.f12043c;
        int hashCode2 = deviceParams == null ? 0 : deviceParams.hashCode();
        long j10 = this.f12044d;
        int i10 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f12045e;
        int hashCode3 = (((((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f12046f.hashCode()) * 1000003) ^ this.f12047g.hashCode()) * 1000003) ^ this.f12048h.hashCode()) * 1000003) ^ (this.f12049i ? 1231 : 1237)) * 1000003) ^ this.f12050j.hashCode()) * 1000003;
        long j12 = this.f12051k;
        int hashCode4 = (((((((((((((((((hashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ this.f12052l.hashCode()) * 1000003) ^ this.f12053m.hashCode()) * 1000003) ^ this.f12054n) * 1000003) ^ this.f12055o.hashCode()) * 1000003) ^ this.f12056p.hashCode()) * 1000003) ^ this.f12057q.hashCode()) * 1000003) ^ this.f12058r.hashCode()) * 1000003) ^ this.f12059s.hashCode()) * 1000003;
        Activity activity = this.f12060t;
        return hashCode4 ^ (activity != null ? activity.hashCode() : 0);
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public boolean isUnder13() {
        return this.f12049i;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String isoContext() {
        return this.f12059s;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String joinAttemptId() {
        return this.f12057q;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String joinAttemptOrigin() {
        return this.f12058r;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public int joinRequestType() {
        return this.f12054n;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String launchData() {
        return this.f12056p;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String linkCode() {
        return this.f12047g;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public long placeId() {
        return this.f12044d;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public PlatformParams platformParams() {
        return this.f12042b;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String referralPage() {
        return this.f12055o;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String reservedServerAccessCode() {
        return this.f12052l;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public Surface surface() {
        return this.f12041a;
    }

    public String toString() {
        return "StartGameParams{surface=" + this.f12041a + ", platformParams=" + this.f12042b + ", deviceParams=" + this.f12043c + ", placeId=" + this.f12044d + ", userId=" + this.f12045e + ", accessCode=" + this.f12046f + ", linkCode=" + this.f12047g + ", gameId=" + this.f12048h + ", isUnder13=" + this.f12049i + ", username=" + this.f12050j + ", conversationId=" + this.f12051k + ", reservedServerAccessCode=" + this.f12052l + ", callId=" + this.f12053m + ", joinRequestType=" + this.f12054n + ", referralPage=" + this.f12055o + ", launchData=" + this.f12056p + ", joinAttemptId=" + this.f12057q + ", joinAttemptOrigin=" + this.f12058r + ", isoContext=" + this.f12059s + ", vrContext=" + this.f12060t + "}";
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public long userId() {
        return this.f12045e;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String username() {
        return this.f12050j;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public Activity vrContext() {
        return this.f12060t;
    }

    private C2936c(Surface surface, PlatformParams platformParams, DeviceParams deviceParams, long j10, long j11, String str, String str2, String str3, boolean z10, String str4, long j12, String str5, String str6, int i10, String str7, String str8, String str9, String str10, String str11, Activity activity) {
        this.f12041a = surface;
        this.f12042b = platformParams;
        this.f12043c = deviceParams;
        this.f12044d = j10;
        this.f12045e = j11;
        this.f12046f = str;
        this.f12047g = str2;
        this.f12048h = str3;
        this.f12049i = z10;
        this.f12050j = str4;
        this.f12051k = j12;
        this.f12052l = str5;
        this.f12053m = str6;
        this.f12054n = i10;
        this.f12055o = str7;
        this.f12056p = str8;
        this.f12057q = str9;
        this.f12058r = str10;
        this.f12059s = str11;
        this.f12060t = activity;
    }
}
