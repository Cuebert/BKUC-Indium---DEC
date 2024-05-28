package com.roblox.client.realtime;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.roblox.client.C2817d1;
import org.greenrobot.eventbus.ThreadMode;
import p008a7.C0047e;
import p008a7.C0048f;
import p008a7.C0049g;
import p024bc.C1100c;
import p024bc.InterfaceC1107j;
import p035c9.C1151k;
import p144ka.C3769a;
import p178n8.AbstractC4075a;
import p300x7.C5565g;

/* loaded from: classes.dex */
public class RealtimeService extends Service {

    /* renamed from: s */
    private volatile Looper f11503s;

    /* renamed from: t */
    private volatile HandlerC2892d f11504t;

    /* renamed from: n */
    private final int f11498n = 10;

    /* renamed from: o */
    private final int f11499o = 20;

    /* renamed from: p */
    private final int f11500p = 24;

    /* renamed from: q */
    private final int f11501q = 25;

    /* renamed from: r */
    private final int f11502r = 30;

    /* renamed from: u */
    private final IBinder f11505u = new BinderC2891c();

    /* renamed from: v */
    private BroadcastReceiver f11506v = new C2890b();

    /* renamed from: com.roblox.client.realtime.RealtimeService$b */
    /* loaded from: classes.dex */
    private static class C2890b extends BroadcastReceiver {

        /* renamed from: a */
        private boolean f11507a;

        /* renamed from: b */
        private boolean f11508b;

        private C2890b() {
            this.f11507a = false;
            this.f11508b = true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean m12473l = C2817d1.m12473l(context);
            if (this.f11508b) {
                this.f11507a = m12473l;
                this.f11508b = false;
            } else if (m12473l != this.f11507a) {
                this.f11507a = m12473l;
                C1100c.m6458d().m6469j(new C0047e(m12473l));
            }
        }
    }

    /* renamed from: com.roblox.client.realtime.RealtimeService$c */
    /* loaded from: classes.dex */
    public class BinderC2891c extends Binder {
        public BinderC2891c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.realtime.RealtimeService$d */
    /* loaded from: classes.dex */
    public final class HandlerC2892d extends Handler {
        public HandlerC2892d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.arg1;
            if (i10 == 10) {
                RealtimeService.this.m13048k();
                return;
            }
            if (i10 == 20) {
                RealtimeService.this.m13049l();
                return;
            }
            if (i10 == 24) {
                RealtimeService.this.m13048k();
                return;
            }
            if (i10 == 25) {
                RealtimeService.this.m13050m();
            } else if (i10 == 30) {
                RealtimeService.this.m13049l();
                getLooper().quit();
            }
        }
    }

    /* renamed from: d */
    public static long m13041d() {
        return AbstractC4075a.m16961a();
    }

    /* renamed from: e */
    public static boolean m13042e() {
        return AbstractC4075a.m16962b();
    }

    /* renamed from: f */
    private void m13043f(long j10) {
        if (C5565g.m20445e().m20458g() != -1) {
            Message obtainMessage = this.f11504t.obtainMessage();
            obtainMessage.arg1 = 10;
            this.f11504t.sendMessageDelayed(obtainMessage, j10);
        }
    }

    /* renamed from: g */
    private void m13044g() {
        Message obtainMessage = this.f11504t.obtainMessage();
        obtainMessage.arg1 = 20;
        this.f11504t.sendMessage(obtainMessage);
    }

    /* renamed from: h */
    private void m13045h() {
        Message obtainMessage = this.f11504t.obtainMessage();
        obtainMessage.arg1 = 24;
        this.f11504t.sendMessage(obtainMessage);
    }

    /* renamed from: i */
    private void m13046i() {
        Message obtainMessage = this.f11504t.obtainMessage();
        obtainMessage.arg1 = 25;
        this.f11504t.sendMessage(obtainMessage);
    }

    /* renamed from: j */
    private void m13047j() {
        Message obtainMessage = this.f11504t.obtainMessage();
        obtainMessage.arg1 = 30;
        this.f11504t.sendMessage(obtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m13048k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m13049l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m13050m() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        registerReceiver(this.f11506v, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        C1100c.m6458d().m6470n(this);
        m13043f(0L);
        return this.f11505u;
    }

    @InterfaceC1107j(threadMode = ThreadMode.POSTING)
    public void onConnectivityChangeEvent(C0047e c0047e) {
        C1151k.m6714h("RealtimeService", "RealtimeService.onConnectivityChangeEvent() " + c0047e.m246a());
        if (c0047e.m246a()) {
            m13043f(0L);
        } else {
            m13044g();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C3769a.m16020c(this);
        HandlerThread handlerThread = new HandlerThread("RealtimeService");
        handlerThread.start();
        this.f11503s = handlerThread.getLooper();
        this.f11504t = new HandlerC2892d(this.f11503s);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @InterfaceC1107j(threadMode = ThreadMode.POSTING)
    public void onLoginEvent(C0048f c0048f) {
        C1151k.m6712f("RealtimeService", "RealtimeService.onLoginEvent()");
        m13045h();
    }

    @InterfaceC1107j(threadMode = ThreadMode.POSTING)
    public void onLogoutEvent(C0049g c0049g) {
        C1151k.m6712f("RealtimeService", "RealtimeService.onLogoutEvent()");
        m13046i();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        C1100c.m6458d().m6471p(this);
        unregisterReceiver(this.f11506v);
        m13047j();
        return super.onUnbind(intent);
    }
}
