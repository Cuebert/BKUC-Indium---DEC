package p101h8;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.C2748c0;
import com.roblox.client.pushnotification.notificationreceivers.PrivateMessageReceivedNotificationReceiver;
import p129j8.C3663f;

/* renamed from: h8.k */
/* loaded from: classes.dex */
public class C3437k extends AbstractC3427a<C3663f> {
    @Override // p101h8.AbstractC3427a
    /* renamed from: j */
    protected String mo15059j(int i10) {
        return i10 == 2 ? "private_message_received" : "private_message_received_cleared";
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: k */
    protected Class<?> mo15060k() {
        return PrivateMessageReceivedNotificationReceiver.class;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: m */
    protected String mo15062m(Context context) {
        return this.f14315a.size() == 1 ? String.format(context.getResources().getString(C2748c0.f10600W3), m15061l().m15597f()) : String.format(context.getResources().getString(C2748c0.f10595V3), String.valueOf(this.f14315a.size()));
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: n */
    public int mo15063n() {
        return 2;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: p */
    protected String mo15065p() {
        return "PrivateMessageReceived";
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: q */
    public long mo15066q() {
        return ((C3663f) this.f14315a.get(r0.size() - 1)).m15596e();
    }

    @Override // p129j8.C3662e.a
    /* renamed from: v */
    public boolean mo15083a(C3663f c3663f, C3663f c3663f2) {
        return c3663f.m15598h() == c3663f2.m15598h();
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: w */
    public Intent mo15068s(Intent intent, C3663f c3663f) {
        if (this.f14315a.size() > 1) {
            intent.putExtra("EXTRA_CATEGORY", "PrivateMessageReceived");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
        } else {
            intent.putExtra("EXTRA_CONVERSATION_ID", c3663f.m15598h());
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        }
        return intent;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: x */
    public Intent mo15069t(Intent intent, C3663f c3663f) {
        return intent;
    }
}
