package p262u6;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: u6.d */
/* loaded from: classes.dex */
public class C4868d {

    /* renamed from: a */
    private final String[] f18757a;

    /* renamed from: b */
    private String f18758b;

    public C4868d(Context context) {
        this(context.getPackageName() + context.getString(C4866b.f18748a));
    }

    /* renamed from: b */
    private Cursor m19063b(Context context, Uri uri) {
        try {
            return context.getContentResolver().query(uri, this.f18757a, null, null, null);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C4867c m19064a(Context context) {
        Cursor m19063b = m19063b(context, EnumC4865a.GetConfig.m19047b(this.f18758b));
        C4867c c4867c = (m19063b == null || !m19063b.moveToFirst()) ? null : new C4867c(m19063b.getString(m19063b.getColumnIndex("channel_param")), m19063b.getString(m19063b.getColumnIndex("default_channel_param")), m19063b.getString(m19063b.getColumnIndex("base_url_param")), m19063b.getString(m19063b.getColumnIndex("default_base_url_param")), m19063b.getString(m19063b.getColumnIndex("settings_param")), m19063b.getString(m19063b.getColumnIndex("user_agent_param")), m19063b.getString(m19063b.getColumnIndex("default_user_agent_param")), m19063b.getString(m19063b.getColumnIndex("dev_rpc_ip_port_override")));
        if (m19063b != null) {
            m19063b.close();
        }
        return c4867c;
    }

    public C4868d(String str) {
        this.f18757a = new String[]{"PROJECTION_NONE"};
        this.f18758b = str;
    }
}
