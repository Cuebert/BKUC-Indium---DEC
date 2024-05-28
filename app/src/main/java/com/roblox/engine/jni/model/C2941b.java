package com.roblox.engine.jni.model;

import com.roblox.engine.jni.model.NativeInitCrashpadParams;
import java.util.List;
import java.util.Objects;

/* renamed from: com.roblox.engine.jni.model.b */
/* loaded from: classes.dex */
final class C2941b extends NativeInitCrashpadParams {

    /* renamed from: a */
    private final String f12089a;

    /* renamed from: b */
    private final String f12090b;

    /* renamed from: c */
    private final String f12091c;

    /* renamed from: d */
    private final String f12092d;

    /* renamed from: e */
    private final String f12093e;

    /* renamed from: f */
    private final String f12094f;

    /* renamed from: g */
    private final List<String> f12095g;

    /* renamed from: h */
    private final boolean f12096h;

    /* renamed from: i */
    private final String f12097i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.engine.jni.model.b$b */
    /* loaded from: classes.dex */
    public static final class b extends NativeInitCrashpadParams.Builder {

        /* renamed from: a */
        private String f12098a;

        /* renamed from: b */
        private String f12099b;

        /* renamed from: c */
        private String f12100c;

        /* renamed from: d */
        private String f12101d;

        /* renamed from: e */
        private String f12102e;

        /* renamed from: f */
        private String f12103f;

        /* renamed from: g */
        private List<String> f12104g;

        /* renamed from: h */
        private Boolean f12105h;

        /* renamed from: i */
        private String f12106i;

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* renamed from: a */
        NativeInitCrashpadParams mo13328a() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<String> list;
            Boolean bool;
            String str6 = this.f12098a;
            if (str6 != null && (str = this.f12099b) != null && (str2 = this.f12100c) != null && (str3 = this.f12101d) != null && (str4 = this.f12102e) != null && (str5 = this.f12103f) != null && (list = this.f12104g) != null && (bool = this.f12105h) != null && this.f12106i != null) {
                return new C2941b(str6, str, str2, str3, str4, str5, list, bool.booleanValue(), this.f12106i);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f12098a == null) {
                sb2.append(" appVersion");
            }
            if (this.f12099b == null) {
                sb2.append(" baseUrl");
            }
            if (this.f12100c == null) {
                sb2.append(" countName");
            }
            if (this.f12101d == null) {
                sb2.append(" uploadUrl");
            }
            if (this.f12102e == null) {
                sb2.append(" token");
            }
            if (this.f12103f == null) {
                sb2.append(" handlerClassName");
            }
            if (this.f12104g == null) {
                sb2.append(" envArgs");
            }
            if (this.f12105h == null) {
                sb2.append(" isAtLeastQ");
            }
            if (this.f12106i == null) {
                sb2.append(" buildVariant");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* renamed from: c */
        public NativeInitCrashpadParams.Builder mo13330c(String str) {
            Objects.requireNonNull(str, "Null appVersion");
            this.f12098a = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* renamed from: d */
        public NativeInitCrashpadParams.Builder mo13331d(String str) {
            Objects.requireNonNull(str, "Null baseUrl");
            this.f12099b = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* renamed from: e */
        public NativeInitCrashpadParams.Builder mo13332e(String str) {
            Objects.requireNonNull(str, "Null buildVariant");
            this.f12106i = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* renamed from: f */
        public NativeInitCrashpadParams.Builder mo13333f(String str) {
            Objects.requireNonNull(str, "Null countName");
            this.f12100c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* renamed from: g */
        public NativeInitCrashpadParams.Builder mo13334g(List<String> list) {
            Objects.requireNonNull(list, "Null envArgs");
            this.f12104g = list;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* renamed from: h */
        public NativeInitCrashpadParams.Builder mo13335h(String str) {
            Objects.requireNonNull(str, "Null handlerClassName");
            this.f12103f = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* renamed from: i */
        public NativeInitCrashpadParams.Builder mo13336i(boolean z10) {
            this.f12105h = Boolean.valueOf(z10);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* renamed from: j */
        public NativeInitCrashpadParams.Builder mo13337j(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f12102e = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* renamed from: k */
        public NativeInitCrashpadParams.Builder mo13338k(String str) {
            Objects.requireNonNull(str, "Null uploadUrl");
            this.f12101d = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String appVersion() {
        return this.f12089a;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String baseUrl() {
        return this.f12090b;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String buildVariant() {
        return this.f12097i;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String countName() {
        return this.f12091c;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public List<String> envArgs() {
        return this.f12095g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeInitCrashpadParams)) {
            return false;
        }
        NativeInitCrashpadParams nativeInitCrashpadParams = (NativeInitCrashpadParams) obj;
        return this.f12089a.equals(nativeInitCrashpadParams.appVersion()) && this.f12090b.equals(nativeInitCrashpadParams.baseUrl()) && this.f12091c.equals(nativeInitCrashpadParams.countName()) && this.f12092d.equals(nativeInitCrashpadParams.uploadUrl()) && this.f12093e.equals(nativeInitCrashpadParams.token()) && this.f12094f.equals(nativeInitCrashpadParams.handlerClassName()) && this.f12095g.equals(nativeInitCrashpadParams.envArgs()) && this.f12096h == nativeInitCrashpadParams.isAtLeastQ() && this.f12097i.equals(nativeInitCrashpadParams.buildVariant());
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String handlerClassName() {
        return this.f12094f;
    }

    public int hashCode() {
        return ((((((((((((((((this.f12089a.hashCode() ^ 1000003) * 1000003) ^ this.f12090b.hashCode()) * 1000003) ^ this.f12091c.hashCode()) * 1000003) ^ this.f12092d.hashCode()) * 1000003) ^ this.f12093e.hashCode()) * 1000003) ^ this.f12094f.hashCode()) * 1000003) ^ this.f12095g.hashCode()) * 1000003) ^ (this.f12096h ? 1231 : 1237)) * 1000003) ^ this.f12097i.hashCode();
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean isAtLeastQ() {
        return this.f12096h;
    }

    public String toString() {
        return "NativeInitCrashpadParams{appVersion=" + this.f12089a + ", baseUrl=" + this.f12090b + ", countName=" + this.f12091c + ", uploadUrl=" + this.f12092d + ", token=" + this.f12093e + ", handlerClassName=" + this.f12094f + ", envArgs=" + this.f12095g + ", isAtLeastQ=" + this.f12096h + ", buildVariant=" + this.f12097i + "}";
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String token() {
        return this.f12093e;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String uploadUrl() {
        return this.f12092d;
    }

    private C2941b(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, boolean z10, String str7) {
        this.f12089a = str;
        this.f12090b = str2;
        this.f12091c = str3;
        this.f12092d = str4;
        this.f12093e = str5;
        this.f12094f = str6;
        this.f12095g = list;
        this.f12096h = z10;
        this.f12097i = str7;
    }
}
