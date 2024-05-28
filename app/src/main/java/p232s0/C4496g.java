package p232s0;

import android.os.Bundle;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import org.json.JSONObject;
import p232s0.AbstractC4490b;
import p280w0.C5101c;

/* renamed from: s0.g */
/* loaded from: classes.dex */
public final class C4496g extends AbstractC4490b {

    /* renamed from: l */
    public static final a f18217l = new a(null);

    /* renamed from: j */
    private final String f18218j;

    /* renamed from: k */
    private final byte[] f18219k;

    /* renamed from: s0.g$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ AbstractC4490b.b m18480b(a aVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return aVar.m18481a(str, str2);
        }

        /* renamed from: a */
        public final AbstractC4490b.b m18481a(String requestJson, String str) {
            C3844i.m16253f(requestJson, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(requestJson).getJSONObject("user");
                String userName = jSONObject.getString("name");
                String string = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
                C3844i.m16252e(userName, "userName");
                return new AbstractC4490b.b(userName, string, null, str);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        /* renamed from: c */
        public final Bundle m18482c(String requestJson, byte[] bArr) {
            C3844i.m16253f(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }

        /* renamed from: d */
        public final Bundle m18483d(String requestJson, byte[] bArr) {
            C3844i.m16253f(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4496g(String requestJson) {
        this(requestJson, null, false, null, false, 30, null);
        C3844i.m16253f(requestJson, "requestJson");
    }

    /* synthetic */ C4496g(String str, byte[] bArr, boolean z10, boolean z11, AbstractC4490b.b bVar, String str2, Bundle bundle, Bundle bundle2, int i10, C3840e c3840e) {
        this(str, bArr, z10, z11, bVar, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? f18217l.m18483d(str, bArr) : bundle, (i10 & 128) != 0 ? f18217l.m18482c(str, bArr) : bundle2);
    }

    /* renamed from: g */
    public final String m18479g() {
        return this.f18218j;
    }

    private C4496g(String str, byte[] bArr, boolean z10, boolean z11, AbstractC4490b.b bVar, String str2, Bundle bundle, Bundle bundle2) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, z10, bVar, str2, z11);
        this.f18218j = str;
        this.f18219k = bArr;
        if (!C5101c.f19362a.m19742a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
    }

    public /* synthetic */ C4496g(String str, byte[] bArr, boolean z10, String str2, boolean z11, int i10, C3840e c3840e) {
        this(str, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4496g(String requestJson, byte[] bArr, boolean z10, String str, boolean z11) {
        this(requestJson, bArr, z11, z10, a.m18480b(f18217l, requestJson, null, 2, null), str, null, null, 192, null);
        C3844i.m16253f(requestJson, "requestJson");
    }
}
