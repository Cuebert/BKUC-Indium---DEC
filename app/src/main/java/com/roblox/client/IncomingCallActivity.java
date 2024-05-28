package com.roblox.client;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0153c;
import androidx.core.graphics.C0602b;
import androidx.core.view.C0675g0;
import androidx.core.view.InterfaceC0684p;
import ba.C1086g;
import org.greenrobot.eventbus.ThreadMode;
import p008a7.C0044b;
import p008a7.C0056n;
import p024bc.C1100c;
import p024bc.InterfaceC1107j;
import p033c7.C1134c;
import p249t6.C4735b;
import qa.C4359t;

/* loaded from: classes.dex */
public class IncomingCallActivity extends ActivityC0153c implements InterfaceC0684p, C1086g.a {

    /* renamed from: E */
    private long f10370E;

    /* renamed from: F */
    private String f10371F;

    /* renamed from: G */
    private ImageView f10372G;

    /* renamed from: H */
    private TextView f10373H;

    /* renamed from: U0 */
    public static Intent m12195U0(Context context, Intent intent, Intent intent2, long j10, String str) {
        return new Intent(context, (Class<?>) IncomingCallActivity.class).putExtra("EXTRA_ACCEPT_INTENT", intent).putExtra("EXTRA_DECLINE_INTENT", intent2).putExtra("EXTRA_CALLER_ID", j10).putExtra("EXTRA_CALLER_COMBINED_NAME", str);
    }

    /* renamed from: V0 */
    public /* synthetic */ void m12196V0(Intent intent, View view) {
        startService(intent);
        finish();
    }

    /* renamed from: W0 */
    public /* synthetic */ void m12197W0(Intent intent, View view) {
        startActivity(intent);
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        if (Build.VERSION.SDK_INT >= 26) {
            keyguardManager.requestDismissKeyguard(this, null);
        }
        finish();
    }

    @Override // ba.C1086g.a
    /* renamed from: K */
    public void mo6428K(String str) {
        finish();
    }

    @Override // androidx.core.view.InterfaceC0684p
    /* renamed from: L */
    public C0675g0 mo823L(View view, C0675g0 c0675g0) {
        C0602b m3663f = c0675g0.m3663f(C0675g0.m.m3716c() | C0675g0.m.m3717d());
        view.setPadding(0, m3663f.f3320b, 0, m3663f.f3322d);
        return C0675g0.f3591b;
    }

    @Override // ba.C1086g.a
    /* renamed from: T */
    public void mo6429T(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // ba.C1086g.a
    /* renamed from: W */
    public void mo6430W(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // ba.C1086g.a
    /* renamed from: a0 */
    public void mo6431a0(String str) {
    }

    @Override // ba.C1086g.a
    /* renamed from: g0 */
    public void mo6432g0(String str, String str2) {
        finish();
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onAvatarHeadshotsRetrievedEvent(C0044b c0044b) {
        if (c0044b.m245a().contains(Long.valueOf(this.f10370E))) {
            C4359t.m18005p(this).m18013k(C4735b.m18874b().m18877d(this.f10370E).m18865a()).m18042c(this.f10372G);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.roblox.client.p.<init>(com.roblox.client.IncomingCallActivity, android.content.Intent):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.IncomingCallActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(false);
            setTurnScreenOn(false);
        } else {
            getWindow().clearFlags(6815873);
        }
        this.f10372G = null;
        this.f10373H = null;
        C1100c.m6458d().m6471p(this);
        C1086g.m6420y().m6426x(this);
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onUserRetrievedEvent(C0056n c0056n) {
        if (this.f10370E != c0056n.m259a() || C1134c.m6537a().mo6573R()) {
            return;
        }
        this.f10373H.setText(C4735b.m18874b().m18877d(this.f10370E).m18868d());
    }

    @Override // ba.C1086g.a
    /* renamed from: p */
    public void mo6433p(String str, boolean z10) {
    }
}
