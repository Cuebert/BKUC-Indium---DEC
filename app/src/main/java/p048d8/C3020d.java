package p048d8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.roblox.client.C2840k;
import p034c8.C1138a;
import p048d8.InterfaceC3022f;
import p262u6.EnumC4865a;

/* renamed from: d8.d */
/* loaded from: classes.dex */
public class C3020d extends AbstractC3017a {

    /* renamed from: a */
    private Context f12873a;

    /* renamed from: d8.d$a */
    /* loaded from: classes.dex */
    class a extends C1138a {

        /* renamed from: n */
        final /* synthetic */ String f12874n;

        a(String str) {
            this.f12874n = str;
        }

        @Override // p034c8.C1138a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"dev_rpc_ip_port_override"};
        }

        @Override // p034c8.C1138a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f12874n;
        }
    }

    public C3020d(Context context) {
        this.f12873a = context;
    }

    @Override // p048d8.InterfaceC3022f
    /* renamed from: a */
    public Cursor mo13486a(Uri uri) {
        return new a(C2840k.m12661b(this.f12873a));
    }

    @Override // p048d8.InterfaceC3022f
    /* renamed from: c */
    public EnumC4865a mo13487c(InterfaceC3022f.a aVar) {
        if (aVar == InterfaceC3022f.a.GET) {
            return EnumC4865a.GetDevRpcIpAndPort;
        }
        return null;
    }
}
