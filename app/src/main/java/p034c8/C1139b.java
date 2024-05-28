package p034c8;

import p262u6.C4867c;

/* renamed from: c8.b */
/* loaded from: classes.dex */
public class C1139b extends C1138a {

    /* renamed from: n */
    private C4867c f5478n;

    public C1139b(C4867c c4867c) {
        this.f5478n = c4867c;
    }

    @Override // p034c8.C1138a, android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return new String[]{"channel_param", "default_channel_param", "base_url_param", "default_base_url_param", "settings_param", "user_agent_param", "default_user_agent_param", "dev_rpc_ip_port_override"};
    }

    @Override // p034c8.C1138a, android.database.AbstractCursor, android.database.Cursor
    public String getString(int i10) {
        if (i10 == getColumnIndex("channel_param")) {
            return this.f5478n.m19054f();
        }
        if (i10 == getColumnIndex("default_channel_param")) {
            return this.f5478n.m19051c();
        }
        if (i10 == getColumnIndex("base_url_param")) {
            return this.f5478n.m19049a();
        }
        if (i10 == getColumnIndex("default_base_url_param")) {
            return this.f5478n.m19050b();
        }
        if (i10 == getColumnIndex("settings_param")) {
            return this.f5478n.m19056h();
        }
        if (i10 == getColumnIndex("user_agent_param")) {
            return this.f5478n.m19057i();
        }
        if (i10 == getColumnIndex("default_user_agent_param")) {
            return this.f5478n.m19052d();
        }
        if (i10 == getColumnIndex("dev_rpc_ip_port_override")) {
            return this.f5478n.m19053e();
        }
        return null;
    }
}
