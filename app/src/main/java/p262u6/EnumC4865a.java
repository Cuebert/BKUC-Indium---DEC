package p262u6;

import android.content.ContentValues;
import android.net.Uri;

/* renamed from: u6.a */
/* loaded from: classes.dex */
public enum EnumC4865a {
    GetPing("ping.get", 1),
    GetConfig("config.get", 2),
    PostConfig("config.post", 3),
    GetUserAgent("ua.get", 4),
    GetDevRpcIpAndPort("devrpc.get", 5);


    /* renamed from: n */
    public final String f18746n;

    /* renamed from: o */
    public final int f18747o;

    EnumC4865a(String str, int i10) {
        this.f18746n = str;
        this.f18747o = i10;
    }

    /* renamed from: b */
    public Uri m19047b(String str) {
        return m19048c(str, null);
    }

    /* renamed from: c */
    public Uri m19048c(String str, ContentValues contentValues) {
        Uri parse = Uri.parse("content://" + str + "/" + this.f18746n);
        if (contentValues != null) {
            for (String str2 : contentValues.keySet()) {
                parse = parse.buildUpon().appendQueryParameter(str2, contentValues.getAsString(str2)).build();
            }
        }
        return parse;
    }
}
