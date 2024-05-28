package p101h8;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2748c0;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestAcceptedNotificationReceiver;
import java.util.Vector;
import p129j8.C3660c;

/* renamed from: h8.e */
/* loaded from: classes.dex */
public class C3431e extends AbstractC3427a<C3660c> {
    @Override // p101h8.AbstractC3427a
    /* renamed from: j */
    protected String mo15059j(int i10) {
        return i10 == 2 ? "friend_request_accepted" : "friend_request_accepted_cleared";
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: k */
    protected Class<?> mo15060k() {
        return FriendRequestAcceptedNotificationReceiver.class;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: m */
    protected String mo15062m(Context context) {
        String str;
        Vector vector = this.f14315a;
        String m15584f = ((C3660c) vector.get(vector.size() - 1)).m15584f();
        if (this.f14315a.size() > 1) {
            Vector vector2 = this.f14315a;
            str = ((C3660c) vector2.get(vector2.size() - 2)).m15584f();
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (this.f14315a.size() == 1) {
            return String.format(context.getResources().getString(C2748c0.f10605X3), m15584f);
        }
        if (this.f14315a.size() == 2) {
            return String.format(context.getResources().getString(C2748c0.f10621a4), m15584f, str);
        }
        if (this.f14315a.size() == 3) {
            return String.format(context.getResources().getString(C2748c0.f10610Y3), m15584f, str);
        }
        if (this.f14315a.size() > 3) {
            return String.format(context.getResources().getString(C2748c0.f10585T3), m15584f, str);
        }
        return null;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: n */
    public int mo15063n() {
        return 1;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: p */
    protected String mo15065p() {
        return "FriendRequestAccepted";
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: q */
    protected long mo15066q() {
        return ((C3660c) this.f14315a.get(0)).m15583e();
    }

    @Override // p129j8.C3662e.a
    /* renamed from: v */
    public boolean mo15083a(C3660c c3660c, C3660c c3660c2) {
        return c3660c.m15583e() == c3660c2.m15583e();
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: w */
    public Intent mo15068s(Intent intent, C3660c c3660c) {
        if (this.f14315a.size() > 1) {
            intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestAccepted");
            intent.putExtra("EXTRA_CATEGORY", "FriendRequestAccepted");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
        } else {
            intent.putExtra("EXTRA_NOTIFICATION_USER_ID", c3660c.m15583e());
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        }
        return intent;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: x */
    public Intent mo15069t(Intent intent, C3660c c3660c) {
        return intent;
    }
}
