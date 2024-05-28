package p227r8;

import com.roblox.engine.jni.NativeSettingsInterface;
import p035c9.C1152l;

/* renamed from: r8.c */
/* loaded from: classes.dex */
public class C4455c {

    /* renamed from: a */
    private static boolean f18060a;

    /* renamed from: a */
    public static boolean m18282a() {
        return f18060a;
    }

    /* renamed from: b */
    public static boolean m18283b() {
        return m18284c() || C1152l.m6736g();
    }

    /* renamed from: c */
    public static boolean m18284c() {
        return NativeSettingsInterface.nativeIsLuaLoginEnabled();
    }

    /* renamed from: d */
    public static void m18285d() {
        f18060a = NativeSettingsInterface.nativeGetFFlag("AndroidRestartAfterProcDeathEnabled");
    }
}
