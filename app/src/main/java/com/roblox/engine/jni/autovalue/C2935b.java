package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import android.view.Surface;
import com.roblox.engine.jni.autovalue.StartAppParams;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.Objects;

/* renamed from: com.roblox.engine.jni.autovalue.b */
/* loaded from: classes.dex */
final class C2935b extends StartAppParams {

    /* renamed from: a */
    private final Surface f12021a;

    /* renamed from: b */
    private final PlatformParams f12022b;

    /* renamed from: c */
    private final String f12023c;

    /* renamed from: d */
    private final String f12024d;

    /* renamed from: e */
    private final long f12025e;

    /* renamed from: f */
    private final boolean f12026f;

    /* renamed from: g */
    private final String f12027g;

    /* renamed from: h */
    private final int f12028h;

    /* renamed from: i */
    private final String f12029i;

    /* renamed from: j */
    private final Activity f12030j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.engine.jni.autovalue.b$b */
    /* loaded from: classes.dex */
    public static final class b extends StartAppParams.Builder {

        /* renamed from: a */
        private Surface f12031a;

        /* renamed from: b */
        private PlatformParams f12032b;

        /* renamed from: c */
        private String f12033c;

        /* renamed from: d */
        private String f12034d;

        /* renamed from: e */
        private Long f12035e;

        /* renamed from: f */
        private Boolean f12036f;

        /* renamed from: g */
        private String f12037g;

        /* renamed from: h */
        private Integer f12038h;

        /* renamed from: i */
        private String f12039i;

        /* renamed from: j */
        private Activity f12040j;

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: a */
        public StartAppParams mo13290a() {
            PlatformParams platformParams;
            String str;
            String str2;
            Long l10;
            Surface surface = this.f12031a;
            if (surface != null && (platformParams = this.f12032b) != null && (str = this.f12033c) != null && (str2 = this.f12034d) != null && (l10 = this.f12035e) != null && this.f12036f != null && this.f12037g != null && this.f12038h != null && this.f12039i != null) {
                return new C2935b(surface, platformParams, str, str2, l10.longValue(), this.f12036f.booleanValue(), this.f12037g, this.f12038h.intValue(), this.f12039i, this.f12040j);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f12031a == null) {
                sb2.append(" surface");
            }
            if (this.f12032b == null) {
                sb2.append(" platformParams");
            }
            if (this.f12033c == null) {
                sb2.append(" appStarterPlace");
            }
            if (this.f12034d == null) {
                sb2.append(" appStarterScript");
            }
            if (this.f12035e == null) {
                sb2.append(" appUserId");
            }
            if (this.f12036f == null) {
                sb2.append(" isUnder13");
            }
            if (this.f12037g == null) {
                sb2.append(" username");
            }
            if (this.f12038h == null) {
                sb2.append(" membershipType");
            }
            if (this.f12039i == null) {
                sb2.append(" selectedTheme");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: b */
        public StartAppParams.Builder mo13291b(String str) {
            Objects.requireNonNull(str, "Null appStarterPlace");
            this.f12033c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: c */
        public StartAppParams.Builder mo13292c(String str) {
            Objects.requireNonNull(str, "Null appStarterScript");
            this.f12034d = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: d */
        public StartAppParams.Builder mo13293d(long j10) {
            this.f12035e = Long.valueOf(j10);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: e */
        public StartAppParams.Builder mo13294e(boolean z10) {
            this.f12036f = Boolean.valueOf(z10);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: f */
        public StartAppParams.Builder mo13295f(int i10) {
            this.f12038h = Integer.valueOf(i10);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: g */
        public StartAppParams.Builder mo13296g(PlatformParams platformParams) {
            Objects.requireNonNull(platformParams, "Null platformParams");
            this.f12032b = platformParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: h */
        public StartAppParams.Builder mo13297h(String str) {
            Objects.requireNonNull(str, "Null selectedTheme");
            this.f12039i = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: i */
        public StartAppParams.Builder mo13298i(Surface surface) {
            Objects.requireNonNull(surface, "Null surface");
            this.f12031a = surface;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: j */
        public StartAppParams.Builder mo13299j(String str) {
            Objects.requireNonNull(str, "Null username");
            this.f12037g = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        /* renamed from: k */
        public StartAppParams.Builder mo13300k(Activity activity) {
            this.f12040j = activity;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public String appStarterPlace() {
        return this.f12023c;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public String appStarterScript() {
        return this.f12024d;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public long appUserId() {
        return this.f12025e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartAppParams)) {
            return false;
        }
        StartAppParams startAppParams = (StartAppParams) obj;
        if (this.f12021a.equals(startAppParams.surface()) && this.f12022b.equals(startAppParams.platformParams()) && this.f12023c.equals(startAppParams.appStarterPlace()) && this.f12024d.equals(startAppParams.appStarterScript()) && this.f12025e == startAppParams.appUserId() && this.f12026f == startAppParams.isUnder13() && this.f12027g.equals(startAppParams.username()) && this.f12028h == startAppParams.membershipType() && this.f12029i.equals(startAppParams.selectedTheme())) {
            Activity activity = this.f12030j;
            if (activity == null) {
                if (startAppParams.vrContext() == null) {
                    return true;
                }
            } else if (activity.equals(startAppParams.vrContext())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((this.f12021a.hashCode() ^ 1000003) * 1000003) ^ this.f12022b.hashCode()) * 1000003) ^ this.f12023c.hashCode()) * 1000003) ^ this.f12024d.hashCode()) * 1000003;
        long j10 = this.f12025e;
        int hashCode2 = (((((((((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f12026f ? 1231 : 1237)) * 1000003) ^ this.f12027g.hashCode()) * 1000003) ^ this.f12028h) * 1000003) ^ this.f12029i.hashCode()) * 1000003;
        Activity activity = this.f12030j;
        return hashCode2 ^ (activity == null ? 0 : activity.hashCode());
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public boolean isUnder13() {
        return this.f12026f;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public int membershipType() {
        return this.f12028h;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public PlatformParams platformParams() {
        return this.f12022b;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public String selectedTheme() {
        return this.f12029i;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public Surface surface() {
        return this.f12021a;
    }

    public String toString() {
        return "StartAppParams{surface=" + this.f12021a + ", platformParams=" + this.f12022b + ", appStarterPlace=" + this.f12023c + ", appStarterScript=" + this.f12024d + ", appUserId=" + this.f12025e + ", isUnder13=" + this.f12026f + ", username=" + this.f12027g + ", membershipType=" + this.f12028h + ", selectedTheme=" + this.f12029i + ", vrContext=" + this.f12030j + "}";
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public String username() {
        return this.f12027g;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public Activity vrContext() {
        return this.f12030j;
    }

    private C2935b(Surface surface, PlatformParams platformParams, String str, String str2, long j10, boolean z10, String str3, int i10, String str4, Activity activity) {
        this.f12021a = surface;
        this.f12022b = platformParams;
        this.f12023c = str;
        this.f12024d = str2;
        this.f12025e = j10;
        this.f12026f = z10;
        this.f12027g = str3;
        this.f12028h = i10;
        this.f12029i = str4;
        this.f12030j = activity;
    }
}
