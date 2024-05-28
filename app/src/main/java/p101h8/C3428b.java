package p101h8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.C0578k;
import androidx.core.app.C0583p;
import com.roblox.client.C2748c0;
import com.roblox.client.C2913x;
import com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver;
import java.util.ArrayList;
import java.util.List;
import p129j8.C3658a;
import p129j8.C3659b;

/* renamed from: h8.b */
/* loaded from: classes.dex */
public class C3428b extends AbstractC3427a<C3659b> {

    /* renamed from: c */
    private static String f14319c = "key_reply_message";

    /* renamed from: b */
    private long f14320b;

    public C3428b(long j10) {
        this.f14320b = j10;
    }

    /* renamed from: A */
    private PendingIntent m15072A(C3659b c3659b, Context context) {
        if (c3659b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) ChatMessageNotificationReceiver.class);
        intent.setAction("chat_message_replied");
        intent.putExtra("EXTRA_CONVERSATION_ID", c3659b.m15574f());
        intent.putExtra("EXTRA_CATEGORY", c3659b.m15573e());
        intent.putExtra("EXTRA_CONVERSATION_TITLE", c3659b.m15575g());
        intent.putExtra("EXTRA_NOTIFICATION_ID", c3659b.mo15571b());
        intent.putExtra("EXTRA_MESSAGE_ID", c3659b.m15578j());
        return PendingIntent.getBroadcast(context, (int) c3659b.m15574f(), intent, 301989888);
    }

    /* renamed from: F */
    private C0578k.e m15073F(Context context, C0578k.e eVar, String str, boolean z10) {
        String format = String.format(context.getString(C2748c0.f10580S3), str);
        if (z10) {
            format = String.format(context.getString(C2748c0.f10575R3), str);
        }
        eVar.m2851n(format);
        eVar.m2856t(null);
        eVar.m2852o(context.getString(C2748c0.f10570Q3));
        eVar.m2835B(new C0578k.c().m2825h(format));
        return eVar;
    }

    /* renamed from: v */
    private C0578k.e m15074v(Context context, C0578k.e eVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            String string = context.getString(C2748c0.f10565P3);
            eVar.m2841b(new C0578k.a.C6035a(C2913x.f11753b, string, m15072A(m15061l(), context)).m2808a(new C0583p.d(f14319c).m3018b(string).m3017a()).m2810d(true).m2809b());
        }
        return eVar;
    }

    /* renamed from: w */
    private String m15075w(C3659b c3659b) {
        if (!c3659b.m15576h().equals("OneToOneConversation")) {
            return c3659b.m15581m() + ": " + c3659b.m15577i();
        }
        return c3659b.m15577i();
    }

    /* renamed from: x */
    private String m15076x(List<C3659b> list) {
        ArrayList arrayList = new ArrayList(list);
        String str = null;
        if (arrayList.size() > 0) {
            for (int i10 = r5 - 1; i10 >= 0; i10--) {
                C3659b c3659b = (C3659b) arrayList.get(i10);
                if (!(c3659b instanceof C3658a)) {
                    str = str == null ? m15075w(c3659b) : m15075w(c3659b) + "\n" + str;
                }
            }
        }
        return str;
    }

    /* renamed from: y */
    private String m15077y() {
        C3659b m15061l = m15061l();
        if (m15061l != null) {
            return m15075w(m15061l);
        }
        return null;
    }

    /* renamed from: z */
    public static CharSequence m15078z(Intent intent) {
        Bundle m2999j = C0583p.m2999j(intent);
        if (m2999j != null) {
            return m2999j.getCharSequence(f14319c);
        }
        return null;
    }

    @Override // p129j8.C3662e.a
    /* renamed from: B */
    public boolean mo15083a(C3659b c3659b, C3659b c3659b2) {
        return c3659b.m15578j() == c3659b2.m15578j();
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: C */
    public Intent mo15068s(Intent intent, C3659b c3659b) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.f14320b);
        intent.putExtra("EXTRA_CATEGORY", c3659b.m15573e());
        return intent;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: D */
    public Intent mo15069t(Intent intent, C3659b c3659b) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.f14320b);
        intent.putExtra("EXTRA_CATEGORY", c3659b.m15573e());
        return intent;
    }

    @Override // p101h8.AbstractC3427a, p101h8.InterfaceC3435i
    /* renamed from: E */
    public void mo15053c(Context context, C3659b c3659b) {
        this.f14315a.m15591p("FAILURE_NOTIFICATION_ID");
        super.mo15053c(context, c3659b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p101h8.AbstractC3427a
    /* renamed from: g */
    public C0578k.e mo15057g(Context context, boolean z10, Bitmap bitmap) {
        C0578k.e mo15057g = super.mo15057g(context, z10, bitmap);
        C3659b m15061l = m15061l();
        if (m15061l instanceof C3658a) {
            return m15073F(context, mo15057g, m15061l.m15575g(), ((C3658a) m15061l).m15567o());
        }
        mo15057g.m2851n(m15077y());
        return m15074v(context, mo15057g);
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: j */
    protected String mo15059j(int i10) {
        return i10 == 2 ? "chat_message_received" : "chat_message_cleared";
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: k */
    protected Class<?> mo15060k() {
        return ChatMessageNotificationReceiver.class;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: m */
    protected String mo15062m(Context context) {
        return m15076x(this.f14315a);
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: n */
    public int mo15063n() {
        return (int) this.f14320b;
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: o */
    protected String mo15064o(Context context) {
        return m15061l().m15575g();
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: p */
    protected String mo15065p() {
        return "ChatNewMessage";
    }

    @Override // p101h8.AbstractC3427a
    /* renamed from: q */
    public long mo15066q() {
        return ((C3659b) this.f14315a.get(0)).m15580l();
    }
}
