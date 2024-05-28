package com.roblox.engine.jni.model;

import com.roblox.engine.jni.model.C2941b;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NativeInitCrashpadParams {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        /* renamed from: a */
        abstract NativeInitCrashpadParams mo13328a();

        /* renamed from: b */
        public final NativeInitCrashpadParams m13329b() {
            return mo13328a();
        }

        /* renamed from: c */
        public abstract Builder mo13330c(String str);

        /* renamed from: d */
        public abstract Builder mo13331d(String str);

        /* renamed from: e */
        public abstract Builder mo13332e(String str);

        /* renamed from: f */
        public abstract Builder mo13333f(String str);

        /* renamed from: g */
        public abstract Builder mo13334g(List<String> list);

        /* renamed from: h */
        public abstract Builder mo13335h(String str);

        /* renamed from: i */
        public abstract Builder mo13336i(boolean z10);

        /* renamed from: j */
        public abstract Builder mo13337j(String str);

        /* renamed from: k */
        public abstract Builder mo13338k(String str);
    }

    public static Builder builder() {
        return new C2941b.b();
    }

    public abstract String appVersion();

    public abstract String baseUrl();

    public abstract String buildVariant();

    public abstract String countName();

    public abstract List<String> envArgs();

    public abstract String handlerClassName();

    public abstract boolean isAtLeastQ();

    public abstract String token();

    public abstract String uploadUrl();
}
