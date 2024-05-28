package com.roblox.client.game;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2817d1;
import com.roblox.client.C2870m;
import com.roblox.client.C2877p0;
import com.roblox.client.game.C2831b;
import com.roblox.engine.jni.model.C2940a;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.Locale;
import p023b9.C1079c;
import p033c7.C1134c;
import p035c9.C1151k;
import p076f9.C3211e;
import p076f9.C3213g;
import p239s7.C4531b;
import p302x9.C5570a;

/* renamed from: com.roblox.client.game.d */
/* loaded from: classes.dex */
public class C2833d {

    /* renamed from: a */
    private Context f11259a;

    /* renamed from: b */
    private C3211e f11260b = new C3211e();

    public C2833d(Context context) {
        this.f11259a = context;
    }

    /* renamed from: a */
    public static C2831b.d m12608a(Context context) {
        return m12609b(context, null);
    }

    /* renamed from: b */
    public static C2831b.d m12609b(Context context, Activity activity) {
        C2833d c2833d = new C2833d(context);
        C2940a c2940a = new C2940a(c2833d.m12613f());
        c2940a.isLuaHomePageEnabled = true;
        c2940a.isLuaGamesPageEnabled = true;
        c2940a.isLuaChatEnabled = true;
        c2940a.isTablet = C2877p0.m12939o0();
        DeviceParams m12612e = c2833d.m12612e();
        C2831b.d dVar = new C2831b.d();
        dVar.f11241b = c2940a;
        dVar.f11242c = m12612e;
        dVar.f11243d = "rbxasset://places/Mobile.rbxl";
        dVar.f11244e = "LuaAppStarterScript";
        dVar.f11245f = C1079c.m6380c().m6389j();
        dVar.f11246g = C1079c.m6380c().m6392m();
        dVar.f11247h = C1079c.m6380c().m6390k();
        dVar.f11248i = C1079c.m6380c().m6383d();
        dVar.f11249j = C1079c.m6380c().m6388i();
        dVar.f11240a = activity;
        return dVar;
    }

    /* renamed from: c */
    public static DeviceParams m12610c(Context context) {
        return new C2833d(context).m12612e();
    }

    /* renamed from: d */
    public float m12611d() {
        return this.f11260b.m14259b(this.f11259a);
    }

    /* renamed from: e */
    public DeviceParams m12612e() {
        DeviceParams deviceParams = new DeviceParams();
        deviceParams.osVersion = Integer.toString(Build.VERSION.SDK_INT);
        deviceParams.deviceName = C2870m.m12819b();
        deviceParams.appVersion = C2877p0.m12921f1();
        Locale m18557e = C4531b.m18550f().m18557e();
        deviceParams.country = m18557e != null ? m18557e.getCountry() : BuildConfig.FLAVOR;
        deviceParams.manufacturer = Build.MANUFACTURER;
        deviceParams.deviceTotalMemoryMB = C5570a.m20472b();
        Point m12469h = C2817d1.m12469h(this.f11259a);
        deviceParams.displayResolution = m12469h.x + "x" + m12469h.y;
        deviceParams.networkType = C2817d1.m12467f(this.f11259a);
        C2817d1.m12462a(this.f11259a, deviceParams);
        if (C1134c.m6537a().mo6572Q0()) {
            deviceParams.isChrome = C2877p0.m12927i0();
        }
        return deviceParams;
    }

    /* renamed from: f */
    public PlatformParams m12613f() {
        String m14267g = C3213g.m14267g();
        if (TextUtils.isEmpty(m14267g)) {
            m14267g = C3213g.m14269i().m14284r(this.f11259a);
        }
        C1151k.m6707a("DataModelParamsCreator", "getPlatformParams: assetFolderPath = " + m14267g);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = m14267g;
        platformParams.isTouchDevice = this.f11259a.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = this.f11259a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = this.f11259a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = m12611d();
        return platformParams;
    }
}
