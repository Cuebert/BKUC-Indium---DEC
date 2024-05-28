package p321z2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z2.n0 */
/* loaded from: classes.dex */
public final class C5993n0 {

    /* renamed from: f */
    private static final Uri f22058f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f22059a;

    /* renamed from: b */
    private final String f22060b;

    /* renamed from: c */
    private final ComponentName f22061c;

    /* renamed from: d */
    private final int f22062d;

    /* renamed from: e */
    private final boolean f22063e;

    public C5993n0(String str, String str2, int i10, boolean z10) {
        C5984j.m21282f(str);
        this.f22059a = str;
        C5984j.m21282f(str2);
        this.f22060b = str2;
        this.f22061c = null;
        this.f22062d = 4225;
        this.f22063e = z10;
    }

    /* renamed from: a */
    public final ComponentName m21299a() {
        return this.f22061c;
    }

    /* renamed from: b */
    public final Intent m21300b(Context context) {
        Bundle bundle;
        if (this.f22059a == null) {
            return new Intent().setComponent(this.f22061c);
        }
        if (this.f22063e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f22059a);
            try {
                bundle = context.getContentResolver().call(f22058f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f22059a)));
            }
        }
        return r2 == null ? new Intent(this.f22059a).setPackage(this.f22060b) : r2;
    }

    /* renamed from: c */
    public final String m21301c() {
        return this.f22060b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5993n0)) {
            return false;
        }
        C5993n0 c5993n0 = (C5993n0) obj;
        return C5980h.m21269b(this.f22059a, c5993n0.f22059a) && C5980h.m21269b(this.f22060b, c5993n0.f22060b) && C5980h.m21269b(this.f22061c, c5993n0.f22061c) && this.f22063e == c5993n0.f22063e;
    }

    public final int hashCode() {
        return C5980h.m21270c(this.f22059a, this.f22060b, this.f22061c, 4225, Boolean.valueOf(this.f22063e));
    }

    public final String toString() {
        String str = this.f22059a;
        if (str != null) {
            return str;
        }
        C5984j.m21286j(this.f22061c);
        return this.f22061c.flattenToString();
    }
}
