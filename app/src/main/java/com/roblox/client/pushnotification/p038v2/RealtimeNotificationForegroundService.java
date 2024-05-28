package com.roblox.client.pushnotification.p038v2;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.C0578k;
import androidx.core.app.C0582o;
import androidx.core.app.C0584q;
import ba.C1086g;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.C2748c0;
import com.roblox.client.C2913x;
import p033c7.C1134c;

/* loaded from: classes.dex */
public class RealtimeNotificationForegroundService extends Service implements C1086g.a {

    /* renamed from: n */
    private final IBinder f11468n = new BinderC2882a();

    /* renamed from: o */
    private ServiceConnection f11469o;

    /* renamed from: p */
    private String f11470p;

    /* renamed from: q */
    private int f11471q;

    /* renamed from: com.roblox.client.pushnotification.v2.RealtimeNotificationForegroundService$a */
    /* loaded from: classes.dex */
    public class BinderC2882a extends Binder {
        public BinderC2882a() {
        }
    }

    /* renamed from: a */
    public static Intent m12996a(Context context, String str) {
        return m13000e(context, str, "ACTION_STOP_SERVICE_AND_FINISH_CALL");
    }

    /* renamed from: b */
    public static Intent m12997b(Context context, String str, String str2, String str3) {
        int i10 = Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728;
        C0578k.e m2860x = new C0578k.e(context, "channel_medium").m2852o(context.getResources().getString(C2748c0.f10550M3)).m2851n(str2).m2862z(C2913x.f11773v).m2850m(PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) ActivityNativeMain.class), i10)).m2860x(true);
        if (C1134c.m6537a().mo6619j0()) {
            m2860x.m2835B(C0578k.f.m2869i(new C0582o.b().m2995f(str2).m2990a(), PendingIntent.getService(context, 0, m12996a(context, str3), i10)));
            m2860x.m2848k(true);
        }
        return new Intent(context, (Class<?>) RealtimeNotificationForegroundService.class).putExtra("EXTRA_NOTIFICATION_ID", str).putExtra("EXTRA_NOTIFICATION", m2860x.m2842c());
    }

    /* renamed from: c */
    public static Intent m12998c(Context context, String str) {
        return m13000e(context, str, "ACTION_STOP_SERVICE_AND_REJECT_CALL");
    }

    /* renamed from: d */
    public static Intent m12999d(Context context, String str, Notification notification) {
        return new Intent(context, (Class<?>) RealtimeNotificationForegroundService.class).putExtra("EXTRA_NOTIFICATION_ID", str).putExtra("EXTRA_NOTIFICATION", notification);
    }

    /* renamed from: e */
    private static Intent m13000e(Context context, String str, String str2) {
        return new Intent(context, (Class<?>) RealtimeNotificationForegroundService.class).setAction(str2).putExtra("EXTRA_CALL_ID", str);
    }

    /* renamed from: f */
    public static Intent m13001f(Context context, String str) {
        return m13000e(context, str, "ACTION_STOP_SERVICE_AND_SUPPRESS_CALL");
    }

    /* renamed from: g */
    private void m13002g() {
        C0584q.m3019a(this, 1);
        stopSelf(this.f11471q);
        this.f11470p = null;
    }

    @Override // ba.C1086g.a
    /* renamed from: K */
    public void mo6428K(String str) {
        String str2 = this.f11470p;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        m13002g();
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
        String str3 = this.f11470p;
        if (str3 == null || !str3.equals(str)) {
            return;
        }
        m13002g();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f11468n;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C1086g.m6420y().m6421g(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f11469o = null;
        C1086g.m6420y().m6426x(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        this.f11471q = i11;
        if ("ACTION_STOP_SERVICE_AND_REJECT_CALL".equals(intent.getAction())) {
            C1086g.m6420y().m6425w(intent.getStringExtra("EXTRA_CALL_ID"));
            m13002g();
            return 2;
        }
        if ("ACTION_STOP_SERVICE_AND_SUPPRESS_CALL".equals(intent.getAction())) {
            C1086g.m6420y().m6427z(intent.getStringExtra("EXTRA_CALL_ID"));
            m13002g();
            return 2;
        }
        if (C1134c.m6537a().mo6619j0() && "ACTION_STOP_SERVICE_AND_FINISH_CALL".equals(intent.getAction())) {
            C1086g.m6420y().m6422h(intent.getStringExtra("EXTRA_CALL_ID"));
            m13002g();
            return 2;
        }
        this.f11470p = intent.getStringExtra("EXTRA_NOTIFICATION_ID");
        Notification notification = (Notification) intent.getParcelableExtra("EXTRA_NOTIFICATION");
        if (Build.VERSION.SDK_INT >= 31) {
            startForeground(this.f11470p.hashCode(), notification, -1);
            return 2;
        }
        startForeground(this.f11470p.hashCode(), notification);
        return 2;
    }

    @Override // ba.C1086g.a
    /* renamed from: p */
    public void mo6433p(String str, boolean z10) {
    }
}
