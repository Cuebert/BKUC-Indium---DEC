package p101h8;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C0578k;
import com.roblox.client.C2748c0;
import com.roblox.client.C2913x;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver;
import java.util.Vector;
import p129j8.C3661d;

/* renamed from: h8.f */
/* loaded from: classes.dex */
public class C3432f extends AbstractC3427a<C3661d> {
    /* renamed from: v */
    private C0578k.e m15101v(Context context, C0578k.e eVar, C3661d c3661d) {
        eVar.m2840a(C2913x.f11752a, context.getString(C2748c0.f10555N3), m15103y(c3661d, context, "friend_request_received_accepted"));
        eVar.m2840a(C2913x.f11769r, context.getString(C2748c0.f10560O3), m15103y(c3661d, context, "friend_request_received_ignored"));
        return eVar;
    }

    /* renamed from: w */
    private String m15102w(C3661d c3661d) {
        return c3661d.m15587f();
    }

    /* renamed from: y */
    private PendingIntent m15103y(C3661d c3661d, Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) FriendRequestReceivedNotificationReceiver.class);
        intent.setAction(str);
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", c3661d.m15586e());
        intent.putExtra("EXTRA_NOTIFICATION_ID", c3661d.mo15571b());
        return PendingIntent.getBroadcast(context, 0, intent, 301989888);
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: A */
    public Intent mo15069t(Intent intent, C3661d c3661d) {
        return intent;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: j */
    protected String mo15059j(int i10) {
        return i10 == 2 ? "friend_request_received" : "friend_request_received_cleared";
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: k */
    protected Class<?> mo15060k() {
        return FriendRequestReceivedNotificationReceiver.class;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: m */
    protected String mo15062m(Context context) {
        if (this.f14315a.size() == 1) {
            String string = context.getResources().getString(C2748c0.f10633c4);
            Vector vector = this.f14315a;
            return String.format(string, m15102w((C3661d) vector.get(vector.size() - 1)));
        }
        if (this.f14315a.size() == 2) {
            String string2 = context.getResources().getString(C2748c0.f10627b4);
            Vector vector2 = this.f14315a;
            Vector vector3 = this.f14315a;
            return String.format(string2, m15102w((C3661d) vector2.get(vector2.size() - 1)), m15102w((C3661d) vector3.get(vector3.size() - 2)));
        }
        if (this.f14315a.size() == 3) {
            String string3 = context.getResources().getString(C2748c0.f10615Z3);
            Vector vector4 = this.f14315a;
            Vector vector5 = this.f14315a;
            return String.format(string3, m15102w((C3661d) vector4.get(vector4.size() - 1)), m15102w((C3661d) vector5.get(vector5.size() - 2)));
        }
        if (this.f14315a.size() <= 3) {
            return null;
        }
        String string4 = context.getResources().getString(C2748c0.f10590U3);
        Vector vector6 = this.f14315a;
        Vector vector7 = this.f14315a;
        return String.format(string4, m15102w((C3661d) vector6.get(vector6.size() - 1)), m15102w((C3661d) vector7.get(vector7.size() - 2)));
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: n */
    public int mo15063n() {
        return 0;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: p */
    protected String mo15065p() {
        return "FriendRequestReceived";
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: q */
    protected long mo15066q() {
        return ((C3661d) this.f14315a.get(0)).m15586e();
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: u */
    protected void mo15070u(Context context, C0578k.e eVar) {
        if (this.f14315a.isEmpty()) {
            return;
        }
        if (this.f14315a.size() == 1) {
            m15101v(context, eVar, (C3661d) this.f14315a.get(0));
        }
        ((NotificationManager) context.getSystemService("notification")).notify(0, eVar.m2842c());
    }

    @Override // p129j8.C3662e.a
    /* renamed from: x */
    public boolean mo15083a(C3661d c3661d, C3661d c3661d2) {
        return c3661d.m15586e() == c3661d2.m15586e();
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: z */
    public Intent mo15068s(Intent intent, C3661d c3661d) {
        if (this.f14315a.size() > 1) {
            intent.putExtra("EXTRA_CATEGORY", "FriendRequestReceived");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
        } else {
            intent.putExtra("EXTRA_NOTIFICATION_USER_ID", c3661d.m15586e());
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        }
        return intent;
    }
}
