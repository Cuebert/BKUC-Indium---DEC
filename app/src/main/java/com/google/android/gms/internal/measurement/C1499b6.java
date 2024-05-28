package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p093h0.C3356a;

/* renamed from: com.google.android.gms.internal.measurement.b6 */
/* loaded from: classes.dex */
public final class C1499b6 {

    /* renamed from: a */
    private static final C3356a<String, Uri> f6660a = new C3356a<>();

    /* renamed from: a */
    public static synchronized Uri m7951a(String str) {
        Uri uri;
        synchronized (C1499b6.class) {
            C3356a<String, Uri> c3356a = f6660a;
            uri = c3356a.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                c3356a.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
