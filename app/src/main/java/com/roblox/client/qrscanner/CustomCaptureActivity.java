package com.roblox.client.qrscanner;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.C0446m0;
import androidx.camera.core.C0450n0;
import androidx.camera.core.C0469s;
import androidx.camera.core.C0499z1;
import androidx.camera.core.InterfaceC0443l1;
import androidx.camera.lifecycle.C0506e;
import androidx.camera.view.PreviewView;
import androidx.core.content.C0587a;
import com.appsflyer.oaid.BuildConfig;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.C2738a0;
import com.roblox.client.C2915y;
import com.roblox.client.qrscanner.CustomCaptureActivity;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p033c7.C1134c;
import p085g4.AbstractC3263l;
import p085g4.InterfaceC3251f;
import p085g4.InterfaceC3253g;
import p085g4.InterfaceC3255h;
import p113i6.C3535a;
import p113i6.C3537c;
import p113i6.C3538d;
import p113i6.InterfaceC3536b;
import p140k6.C3759a;

/* loaded from: classes.dex */
public class CustomCaptureActivity extends AbstractActivityC2837i0 {

    /* renamed from: S */
    private InterfaceFutureC2565m<C0506e> f11487S;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G1 */
    public /* synthetic */ void m13027G1(List list) {
        if (list.size() > 0) {
            String m15335b = ((C3535a) list.get(0)).m15335b();
            Intent intent = new Intent();
            intent.putExtra("QrCodeScanResult", m15335b);
            setResult(-1, intent);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public /* synthetic */ void m13028H1(Exception exc) {
        Intent intent = new Intent();
        intent.putExtra("QrCodeScanResult", BuildConfig.FLAVOR);
        setResult(0, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public /* synthetic */ void m13030J1(InterfaceC3536b interfaceC3536b, final InterfaceC0443l1 interfaceC0443l1) {
        interfaceC3536b.mo12083N(C3759a.m15968a(interfaceC0443l1.mo1852J(), interfaceC0443l1.mo1857q().mo2030d())).mo14499f(new InterfaceC3255h() { // from class: m8.d
            @Override // p085g4.InterfaceC3255h
            public final void onSuccess(Object obj) {
                CustomCaptureActivity.this.m13027G1((List) obj);
            }
        }).mo14497d(new InterfaceC3253g() { // from class: m8.c
            @Override // p085g4.InterfaceC3253g
            public final void onFailure(Exception exc) {
                CustomCaptureActivity.this.m13028H1(exc);
            }
        }).mo14495b(new InterfaceC3251f() { // from class: m8.b
            @Override // p085g4.InterfaceC3251f
            /* renamed from: a */
            public final void mo7517a(AbstractC3263l abstractC3263l) {
                InterfaceC0443l1.this.close();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K1 */
    public /* synthetic */ void m13031K1() {
        try {
            m13032F1(this.f11487S.get());
        } catch (InterruptedException | ExecutionException unused) {
            Intent intent = new Intent();
            intent.putExtra("QrCodeScanResult", BuildConfig.FLAVOR);
            setResult(0, intent);
            finish();
        }
    }

    /* renamed from: F1 */
    void m13032F1(C0506e c0506e) {
        C0469s m2222b;
        C0499z1 m2348c = new C0499z1.b().m2348c();
        if (C1134c.m6537a().mo6644s()) {
            m2222b = new C0469s.a().m2222b();
        } else {
            m2222b = new C0469s.a().m2223d(1).m2222b();
        }
        m2348c.m2345S(((PreviewView) findViewById(C2915y.f11802H0)).getSurfaceProvider());
        final InterfaceC3536b m15341a = C3538d.m15341a(new C3537c.a().m15340b(256, new int[0]).m15339a());
        C0450n0 m2152c = new C0450n0.c().m2160l(new Size(1280, 720)).m2154f(0).m2152c();
        m2152c.m2150Y(C0587a.m3032f(this), new C0450n0.a() { // from class: m8.a
            @Override // androidx.camera.core.C0450n0.a
            /* renamed from: a */
            public /* synthetic */ Size mo2124a() {
                return C0446m0.m2132a(this);
            }

            @Override // androidx.camera.core.C0450n0.a
            /* renamed from: b */
            public final void mo2125b(InterfaceC0443l1 interfaceC0443l1) {
                CustomCaptureActivity.this.m13030J1(m15341a, interfaceC0443l1);
            }
        });
        c0506e.m2392e(this, m2222b, m2152c, m2348c);
    }

    public void backButtonPressed(View view) {
        finishAfterTransition();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2738a0.f10411b);
        Typeface createFromFile = Typeface.createFromFile(getIntent().getStringExtra("FONT_PATH_MESSAGE"));
        TextView textView = (TextView) findViewById(C2915y.f11799G0);
        TextView textView2 = (TextView) findViewById(C2915y.f11863g1);
        textView.setTypeface(createFromFile);
        textView2.setTypeface(createFromFile);
        InterfaceFutureC2565m<C0506e> m2384f = C0506e.m2384f(this);
        this.f11487S = m2384f;
        m2384f.mo2501b(new Runnable() { // from class: m8.e
            @Override // java.lang.Runnable
            public final void run() {
                CustomCaptureActivity.this.m13031K1();
            }
        }, C0587a.m3032f(this));
    }
}
