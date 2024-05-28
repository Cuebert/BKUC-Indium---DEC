package p308y2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: y2.u */
/* loaded from: classes.dex */
public final class C5631u extends BroadcastReceiver {

    /* renamed from: a */
    Context f20824a;

    /* renamed from: b */
    private final AbstractC5630t f20825b;

    public C5631u(AbstractC5630t abstractC5630t) {
        this.f20825b = abstractC5630t;
    }

    /* renamed from: a */
    public final void m20650a(Context context) {
        this.f20824a = context;
    }

    /* renamed from: b */
    public final synchronized void m20651b() {
        Context context = this.f20824a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f20824a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f20825b.mo7496a();
            m20651b();
        }
    }
}
