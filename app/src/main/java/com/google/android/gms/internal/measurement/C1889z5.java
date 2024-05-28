package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.appsflyer.oaid.BuildConfig;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.z5 */
/* loaded from: classes.dex */
public final class C1889z5 {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f7345a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1889z5(Map<String, Map<String, String>> map) {
        this.f7345a = map;
    }

    /* renamed from: a */
    public final String m9141a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        Map<String, String> map = this.f7345a.get(uri.toString());
        if (map == null) {
            return null;
        }
        String valueOf = String.valueOf(str3);
        return map.get(valueOf.length() != 0 ? BuildConfig.FLAVOR.concat(valueOf) : new String(BuildConfig.FLAVOR));
    }
}
