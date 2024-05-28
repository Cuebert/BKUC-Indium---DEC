package p048d8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.roblox.client.C2877p0;
import p034c8.C1138a;
import p048d8.InterfaceC3022f;
import p262u6.EnumC4865a;

/* renamed from: d8.g */
/* loaded from: classes.dex */
public class C3023g extends AbstractC3017a {

    /* renamed from: a */
    private Context f12879a;

    /* renamed from: d8.g$a */
    /* loaded from: classes.dex */
    class a extends C1138a {

        /* renamed from: n */
        final /* synthetic */ String f12880n;

        a(String str) {
            this.f12880n = str;
        }

        @Override // p034c8.C1138a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"user_agent_param"};
        }

        @Override // p034c8.C1138a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f12880n;
        }
    }

    public C3023g(Context context) {
        this.f12879a = context;
    }

    @Override // p048d8.InterfaceC3022f
    /* renamed from: a */
    public Cursor mo13486a(Uri uri) {
        String queryParameter = uri.getQueryParameter("user_agent_param");
        C2877p0.m12891T0(this.f12879a);
        if (queryParameter == null) {
            queryParameter = "google";
        }
        return new a(C2877p0.m12940p(this.f12879a, queryParameter));
    }

    @Override // p048d8.InterfaceC3022f
    /* renamed from: c */
    public EnumC4865a mo13487c(InterfaceC3022f.a aVar) {
        if (aVar == InterfaceC3022f.a.GET) {
            return EnumC4865a.GetUserAgent;
        }
        return null;
    }
}
