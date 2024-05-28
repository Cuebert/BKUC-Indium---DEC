package com.roblox.client;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0153c;
import androidx.appcompat.app.DialogC0152b;
import androidx.lifecycle.AbstractC0839f;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.engine.jni.locale.NativeLocaleJavaInterface;
import com.roblox.engine.jni.reporter.SessionReporterJavaInterface;
import java.util.IllegalFormatException;
import java.util.Locale;
import p023b9.C1079c;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1153m;
import p100h7.C3409b;
import p189o7.C4145a;
import p202p7.C4274a;
import p202p7.C4275b;
import p215q8.C4330a;
import p227r8.C4455c;
import p239s7.C4531b;
import p239s7.C4535f;
import p288w8.C5476k;

/* renamed from: com.roblox.client.k0 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2841k0 extends ActivityC0153c {

    /* renamed from: G */
    protected static int f11309G;

    /* renamed from: H */
    protected static int f11310H;

    /* renamed from: E */
    protected C4145a f11311E = new C4145a();

    /* renamed from: F */
    private boolean f11312F;

    /* renamed from: a1 */
    private void m12665a1(String str, DialogInterface.OnDismissListener onDismissListener) {
        if (isDestroyed()) {
            return;
        }
        DialogC0152b.a aVar = new DialogC0152b.a(this);
        aVar.m705k(C2748c0.f10519G2, null);
        aVar.m702h(str);
        if (onDismissListener != null) {
            aVar.m708n(onDismissListener);
        }
        aVar.m695a().show();
    }

    /* renamed from: b1 */
    private void m12666b1(String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        if (isDestroyed()) {
            return;
        }
        DialogC0152b.a aVar = new DialogC0152b.a(this);
        aVar.m705k(C2748c0.f10519G2, null);
        aVar.m714t(str2);
        aVar.m702h(str);
        if (onDismissListener != null) {
            aVar.m708n(onDismissListener);
        }
        aVar.m695a().show();
    }

    /* renamed from: S0 */
    public void mo12260S0() {
        if (C2877p0.m12927i0()) {
            return;
        }
        setRequestedOrientation(C2877p0.m12933l0() ? 7 : 6);
    }

    /* renamed from: T0 */
    public void m12667T0(int i10, Object... objArr) {
        String string;
        if (isDestroyed()) {
            return;
        }
        String string2 = getString(i10);
        try {
            string = String.format(Locale.ROOT, string2, objArr);
        } catch (IllegalFormatException unused) {
            C1151k.m6709c("RobloxBaseActivity", "Bad format: format=" + string2 + ". args=" + objArr + ".");
            string = getString(C2748c0.f10728s3);
        }
        m12665a1(string, null);
    }

    /* renamed from: U0 */
    public void m12668U0(String str) {
        m12665a1(str, null);
    }

    /* renamed from: V0 */
    public void m12669V0(String str, String str2) {
        m12666b1(str, str2, null);
    }

    /* renamed from: W0 */
    public void m12670W0(int i10) {
        m12665a1(getString(i10), null);
    }

    /* renamed from: X0 */
    public void m12671X0(String str) {
        m12665a1(str, null);
    }

    /* renamed from: Y0 */
    public void m12672Y0(String str, DialogInterface.OnDismissListener onDismissListener) {
        m12665a1(str, onDismissListener);
    }

    /* renamed from: Z0 */
    public C4145a m12673Z0() {
        return this.f11311E;
    }

    @Override // androidx.appcompat.app.ActivityC0153c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        C4535f m18556d = C4531b.m18550f().m18556d(context);
        C4535f m18560j = C4531b.m18550f().m18560j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" -> Locale: base = ");
        sb2.append(configuration.locale);
        sb2.append("; default = ");
        sb2.append(m18556d.m18585c());
        sb2.append("; user = ");
        sb2.append(m18560j != null ? m18560j.m18585c() : "null");
        C1151k.m6707a("rbx.locale", sb2.toString());
        Locale m18548b = C4531b.m18548b(m18560j != null ? m18560j.m18585c() : m18556d.m18585c());
        configuration.setLocale(m18548b);
        configuration.setLayoutDirection(m18548b);
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    /* renamed from: c1 */
    public boolean m12674c1() {
        return this.f11312F;
    }

    /* renamed from: d1 */
    public void m12675d1(int i10, int i11) {
        Toast.makeText(this, i10, i11).show();
    }

    /* renamed from: e1 */
    public void m12676e1(String str, int i10) {
        Toast.makeText(this, str, i10).show();
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return AbstractC0839f.c.DESTROYED == mo583f().mo4890b();
    }

    @Override // androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C5476k.m20126A()) {
            C1151k.m6712f("RobloxBaseActivity", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
            return;
        }
        C2877p0.m12891T0(this);
        C3409b.m15015e(this);
        super.onCreate(bundle);
        int i10 = f11309G;
        f11309G = i10 + 1;
        if (i10 == 0) {
            NativeLocaleJavaInterface.setImplementation(new C4274a());
            SessionReporterJavaInterface.setImplementation(new C4275b(this));
            C4330a.m17859a();
            C4330a.m17860b("SessionReporterState_ApplicationStart", 0L);
        }
        C1079c.m6380c().m6391l();
    }

    @Override // androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onDestroy() {
        if (C5476k.m20126A()) {
            C1151k.m6712f("RobloxBaseActivity", "onDestroy: App was previously destroyed due to process death");
            super.onDestroy();
            if (C1134c.m6537a().mo6606f()) {
                C3409b.m15011a();
            }
            C1153m.m6740c(this);
            return;
        }
        super.onDestroy();
        int i10 = f11309G - 1;
        f11309G = i10;
        if (i10 == 0) {
            C4330a.m17860b("SessionReporterState_ApplicationTerminate", 0L);
        }
    }

    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onPause() {
        this.f11312F = false;
        C3409b.m15016f(getCacheDir(), C2877p0.f11444o.getString("webview_url", BuildConfig.FLAVOR));
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f11312F = true;
        C3409b.m15017g();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (C4455c.m18282a()) {
            bundle.putBoolean("RESTART_AFTER_PROCESS_DEATH", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStart() {
        super.onStart();
        f11310H++;
    }

    @Override // androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStop() {
        C3409b.m15018h();
        super.onStop();
        f11310H--;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        C1151k.m6716j("RobloxBaseActivity", "onTrimMemory: in " + getClass().getSimpleName() + ", level = " + i10);
        super.onTrimMemory(i10);
        RobloxApplication.m12216b("RobloxBaseActivity", i10);
    }
}
