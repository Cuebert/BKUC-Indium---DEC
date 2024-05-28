package com.roblox.client;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.SystemClock;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import java.util.Locale;
import ma.C3969a;
import p033c7.C1134c;
import p033c7.C1137f;
import p035c9.C1151k;
import p094h1.C3364a;
import p239s7.C4531b;
import p288w8.C5469d;
import p288w8.C5478m;

/* loaded from: classes.dex */
public class RobloxApplication extends Application {

    /* renamed from: n */
    private static Context f10387n;

    /* renamed from: o */
    private static Locale f10388o;

    /* renamed from: a */
    public static Context m12215a() {
        return f10387n;
    }

    /* renamed from: b */
    public static void m12216b(String str, int i10) {
        if (i10 == 5) {
            C1151k.m6716j(str, "TRIM_MEMORY_RUNNING_MODERATE");
            return;
        }
        if (i10 == 10) {
            C1151k.m6716j(str, "TRIM_MEMORY_RUNNING_LOW");
            return;
        }
        if (i10 == 15) {
            C1151k.m6716j(str, "TRIM_MEMORY_RUNNING_CRITICAL");
            return;
        }
        if (i10 == 20) {
            C1151k.m6716j(str, "TRIM_MEMORY_UI_HIDDEN");
            return;
        }
        if (i10 == 40) {
            C1151k.m6716j(str, "TRIM_MEMORY_BACKGROUND");
        } else if (i10 == 60) {
            C1151k.m6716j(str, "TRIM_MEMORY_MODERATE");
        } else {
            if (i10 != 80) {
                return;
            }
            C1151k.m6716j(str, "TRIM_MEMORY_COMPLETE");
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        try {
            super.attachBaseContext(context);
            C3364a.m14867l(this);
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            C4531b.m18550f().m18566q(configuration.getLocales().get(0));
        } else {
            C4531b.m18550f().m18566q(configuration.locale);
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate();
        f10387n = getApplicationContext();
        C1137f.m6665c().m6668d(C2877p0.m12884Q(this));
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C5478m.m20177c(f10387n);
        C5469d.m20111o(f10387n);
        C5469d.m20109m();
        f10388o = Locale.getDefault();
        C2836i.m12631i(f10387n, C2836i.f11265g, f10387n.getCacheDir().getPath());
        C3969a.m16695e().m16699d("flag_prefetch_begin", elapsedRealtime2);
        C3969a.m16695e().m16699d("application_oncreate", elapsedRealtime);
        JNIBaseUrlProtocol.init(getApplicationContext());
        if (C1134c.m6537a().mo6607f0()) {
            JNIWebLoginProtocol.init(getApplicationContext());
        }
    }
}
