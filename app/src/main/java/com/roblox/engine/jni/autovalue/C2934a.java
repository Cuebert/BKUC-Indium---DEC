package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import com.roblox.engine.jni.autovalue.InitParams;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.Objects;

/* renamed from: com.roblox.engine.jni.autovalue.a */
/* loaded from: classes.dex */
final class C2934a extends InitParams {

    /* renamed from: a */
    private final PlatformParams f12005a;

    /* renamed from: b */
    private final DeviceParams f12006b;

    /* renamed from: c */
    private final String f12007c;

    /* renamed from: d */
    private final String f12008d;

    /* renamed from: e */
    private final boolean f12009e;

    /* renamed from: f */
    private final boolean f12010f;

    /* renamed from: g */
    private final String f12011g;

    /* renamed from: h */
    private final Activity f12012h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.engine.jni.autovalue.a$b */
    /* loaded from: classes.dex */
    public static final class b extends InitParams.Builder {

        /* renamed from: a */
        private PlatformParams f12013a;

        /* renamed from: b */
        private DeviceParams f12014b;

        /* renamed from: c */
        private String f12015c;

        /* renamed from: d */
        private String f12016d;

        /* renamed from: e */
        private Boolean f12017e;

        /* renamed from: f */
        private Boolean f12018f;

        /* renamed from: g */
        private String f12019g;

        /* renamed from: h */
        private Activity f12020h;

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        /* renamed from: a */
        public InitParams mo13282a() {
            DeviceParams deviceParams;
            String str;
            String str2;
            Boolean bool;
            PlatformParams platformParams = this.f12013a;
            if (platformParams != null && (deviceParams = this.f12014b) != null && (str = this.f12015c) != null && (str2 = this.f12016d) != null && (bool = this.f12017e) != null && this.f12018f != null) {
                return new C2934a(platformParams, deviceParams, str, str2, bool.booleanValue(), this.f12018f.booleanValue(), this.f12019g, this.f12020h);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f12013a == null) {
                sb2.append(" platformParams");
            }
            if (this.f12014b == null) {
                sb2.append(" deviceParams");
            }
            if (this.f12015c == null) {
                sb2.append(" baseURL");
            }
            if (this.f12016d == null) {
                sb2.append(" userAgent");
            }
            if (this.f12017e == null) {
                sb2.append(" isTablet");
            }
            if (this.f12018f == null) {
                sb2.append(" isVrDevice");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        /* renamed from: b */
        public InitParams.Builder mo13283b(String str) {
            Objects.requireNonNull(str, "Null baseURL");
            this.f12015c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        /* renamed from: c */
        public InitParams.Builder mo13284c(String str) {
            this.f12019g = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        /* renamed from: d */
        public InitParams.Builder mo13285d(DeviceParams deviceParams) {
            Objects.requireNonNull(deviceParams, "Null deviceParams");
            this.f12014b = deviceParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        /* renamed from: e */
        public InitParams.Builder mo13286e(boolean z10) {
            this.f12017e = Boolean.valueOf(z10);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        /* renamed from: f */
        public InitParams.Builder mo13287f(boolean z10) {
            this.f12018f = Boolean.valueOf(z10);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        /* renamed from: g */
        public InitParams.Builder mo13288g(PlatformParams platformParams) {
            Objects.requireNonNull(platformParams, "Null platformParams");
            this.f12013a = platformParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        /* renamed from: h */
        public InitParams.Builder mo13289h(String str) {
            Objects.requireNonNull(str, "Null userAgent");
            this.f12016d = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public String baseURL() {
        return this.f12007c;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public String buildVariant() {
        return this.f12011g;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public DeviceParams deviceParams() {
        return this.f12006b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitParams)) {
            return false;
        }
        InitParams initParams = (InitParams) obj;
        if (this.f12005a.equals(initParams.platformParams()) && this.f12006b.equals(initParams.deviceParams()) && this.f12007c.equals(initParams.baseURL()) && this.f12008d.equals(initParams.userAgent()) && this.f12009e == initParams.isTablet() && this.f12010f == initParams.isVrDevice() && ((str = this.f12011g) != null ? str.equals(initParams.buildVariant()) : initParams.buildVariant() == null)) {
            Activity activity = this.f12012h;
            if (activity == null) {
                if (initParams.vrContext() == null) {
                    return true;
                }
            } else if (activity.equals(initParams.vrContext())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f12005a.hashCode() ^ 1000003) * 1000003) ^ this.f12006b.hashCode()) * 1000003) ^ this.f12007c.hashCode()) * 1000003) ^ this.f12008d.hashCode()) * 1000003) ^ (this.f12009e ? 1231 : 1237)) * 1000003) ^ (this.f12010f ? 1231 : 1237)) * 1000003;
        String str = this.f12011g;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Activity activity = this.f12012h;
        return hashCode2 ^ (activity != null ? activity.hashCode() : 0);
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public boolean isTablet() {
        return this.f12009e;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public boolean isVrDevice() {
        return this.f12010f;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public PlatformParams platformParams() {
        return this.f12005a;
    }

    public String toString() {
        return "InitParams{platformParams=" + this.f12005a + ", deviceParams=" + this.f12006b + ", baseURL=" + this.f12007c + ", userAgent=" + this.f12008d + ", isTablet=" + this.f12009e + ", isVrDevice=" + this.f12010f + ", buildVariant=" + this.f12011g + ", vrContext=" + this.f12012h + "}";
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public String userAgent() {
        return this.f12008d;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public Activity vrContext() {
        return this.f12012h;
    }

    private C2934a(PlatformParams platformParams, DeviceParams deviceParams, String str, String str2, boolean z10, boolean z11, String str3, Activity activity) {
        this.f12005a = platformParams;
        this.f12006b = deviceParams;
        this.f12007c = str;
        this.f12008d = str2;
        this.f12009e = z10;
        this.f12010f = z11;
        this.f12011g = str3;
        this.f12012h = activity;
    }
}
