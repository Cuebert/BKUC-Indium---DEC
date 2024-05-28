package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import android.view.Surface;
import com.roblox.engine.jni.autovalue.C2935b;
import com.roblox.engine.jni.model.PlatformParams;

/* loaded from: classes.dex */
public abstract class StartAppParams {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract StartAppParams mo13290a();

        /* renamed from: b */
        public abstract Builder mo13291b(String str);

        /* renamed from: c */
        public abstract Builder mo13292c(String str);

        /* renamed from: d */
        public abstract Builder mo13293d(long j10);

        /* renamed from: e */
        public abstract Builder mo13294e(boolean z10);

        /* renamed from: f */
        public abstract Builder mo13295f(int i10);

        /* renamed from: g */
        public abstract Builder mo13296g(PlatformParams platformParams);

        /* renamed from: h */
        public abstract Builder mo13297h(String str);

        /* renamed from: i */
        public abstract Builder mo13298i(Surface surface);

        /* renamed from: j */
        public abstract Builder mo13299j(String str);

        /* renamed from: k */
        public abstract Builder mo13300k(Activity activity);
    }

    public static Builder builder() {
        return new C2935b.b();
    }

    public abstract String appStarterPlace();

    public abstract String appStarterScript();

    public abstract long appUserId();

    public abstract boolean isUnder13();

    public abstract int membershipType();

    public abstract PlatformParams platformParams();

    public abstract String selectedTheme();

    public abstract Surface surface();

    public abstract String username();

    public abstract Activity vrContext();
}
