package p166m8;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.qrscanner.CustomCaptureActivity;
import com.roblox.engine.jni.NativeGLInterface;
import la.C3905c;
import p076f9.C3213g;

/* renamed from: m8.g */
/* loaded from: classes.dex */
public class C3966g {
    /* renamed from: b */
    public static void m16691b(Intent intent) {
        final String stringExtra = intent != null ? intent.getStringExtra("QrCodeScanResult") : BuildConfig.FLAVOR;
        if (TextUtils.isEmpty(stringExtra)) {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", stringExtra, "Cancelled");
        } else {
            C3905c.m16561r().m16564h(stringExtra, new C3905c.d() { // from class: m8.f
                @Override // la.C3905c.d
                /* renamed from: a */
                public final void mo12241a(boolean z10) {
                    C3966g.m16692c(stringExtra, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m16692c(String str, boolean z10) {
        if (z10) {
            C3905c.m16561r().m16562e(str);
        } else {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "InvalidQr");
        }
    }

    /* renamed from: d */
    public static void m16693d(Activity activity, int i10) {
        String str = C3213g.m14267g() + "/fonts/GothamSSm-Medium.otf";
        Intent intent = new Intent(activity, (Class<?>) CustomCaptureActivity.class);
        intent.putExtra("FONT_PATH_MESSAGE", str);
        activity.startActivityForResult(intent, i10);
    }
}
