package p045d5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: d5.c */
/* loaded from: classes.dex */
public final class ServiceConnectionC2979c implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C2981d f12665a;

    public /* synthetic */ ServiceConnectionC2979c(C2981d c2981d, C2977b c2977b) {
        this.f12665a = c2981d;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3005x c3005x;
        c3005x = this.f12665a.f12669b;
        c3005x.m13478b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f12665a.m13452c().post(new C2986f0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C3005x c3005x;
        c3005x = this.f12665a.f12669b;
        c3005x.m13478b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f12665a.m13452c().post(new C2988g0(this));
    }
}
