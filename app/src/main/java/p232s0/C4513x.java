package p232s0;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p280w0.C5101c;
import ua.C4890i0;

/* renamed from: s0.x */
/* loaded from: classes.dex */
public final class C4513x extends AbstractC4503n {

    /* renamed from: j */
    public static final a f18260j = new a(null);

    /* renamed from: h */
    private final String f18261h;

    /* renamed from: i */
    private final byte[] f18262i;

    /* renamed from: s0.x$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final Bundle m18527a(String requestJson, byte[] bArr) {
            C3844i.m16253f(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4513x(String requestJson) {
        this(requestJson, (byte[]) null, (Set) null, 6, (C3840e) null);
        C3844i.m16253f(requestJson, "requestJson");
    }

    private C4513x(String str, byte[] bArr, Set<ComponentName> set, Bundle bundle, Bundle bundle2) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, true, set);
        this.f18261h = str;
        this.f18262i = bArr;
        if (!C5101c.f19362a.m19742a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
    }

    /* renamed from: g */
    public final String m18526g() {
        return this.f18261h;
    }

    public /* synthetic */ C4513x(String str, byte[] bArr, Set set, int i10, C3840e c3840e) {
        this(str, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? C4890i0.m19127b() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4513x(java.lang.String r8, byte[] r9, java.util.Set<android.content.ComponentName> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "requestJson"
            kotlin.jvm.internal.C3844i.m16253f(r8, r0)
            java.lang.String r0 = "allowedProviders"
            kotlin.jvm.internal.C3844i.m16253f(r10, r0)
            s0.x$a r0 = p232s0.C4513x.f18260j
            android.os.Bundle r5 = r0.m18527a(r8, r9)
            android.os.Bundle r6 = r0.m18527a(r8, r9)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p232s0.C4513x.<init>(java.lang.String, byte[], java.util.Set):void");
    }
}
