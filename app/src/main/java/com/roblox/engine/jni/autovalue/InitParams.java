package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import com.roblox.engine.jni.autovalue.C2934a;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;

/* loaded from: classes.dex */
public abstract class InitParams {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract InitParams mo13282a();

        /* renamed from: b */
        public abstract Builder mo13283b(String str);

        /* renamed from: c */
        public abstract Builder mo13284c(String str);

        /* renamed from: d */
        public abstract Builder mo13285d(DeviceParams deviceParams);

        /* renamed from: e */
        public abstract Builder mo13286e(boolean z10);

        /* renamed from: f */
        public abstract Builder mo13287f(boolean z10);

        /* renamed from: g */
        public abstract Builder mo13288g(PlatformParams platformParams);

        /* renamed from: h */
        public abstract Builder mo13289h(String str);
    }

    public static Builder builder() {
        return new C2934a.b().mo13287f(false);
    }

    public abstract String baseURL();

    public abstract String buildVariant();

    public abstract DeviceParams deviceParams();

    public abstract boolean isTablet();

    public abstract boolean isVrDevice();

    public abstract PlatformParams platformParams();

    public abstract String userAgent();

    public abstract Activity vrContext();
}
