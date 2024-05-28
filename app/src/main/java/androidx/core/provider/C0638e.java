package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C0654h;
import java.util.List;

/* renamed from: androidx.core.provider.e */
/* loaded from: classes.dex */
public final class C0638e {

    /* renamed from: a */
    private final String f3412a;

    /* renamed from: b */
    private final String f3413b;

    /* renamed from: c */
    private final String f3414c;

    /* renamed from: d */
    private final List<List<byte[]>> f3415d;

    /* renamed from: e */
    private final int f3416e = 0;

    /* renamed from: f */
    private final String f3417f;

    public C0638e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f3412a = (String) C0654h.m3467f(str);
        this.f3413b = (String) C0654h.m3467f(str2);
        this.f3414c = (String) C0654h.m3467f(str3);
        this.f3415d = (List) C0654h.m3467f(list);
        this.f3417f = m3379a(str, str2, str3);
    }

    /* renamed from: a */
    private String m3379a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m3380b() {
        return this.f3415d;
    }

    /* renamed from: c */
    public int m3381c() {
        return this.f3416e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m3382d() {
        return this.f3417f;
    }

    /* renamed from: e */
    public String m3383e() {
        return this.f3412a;
    }

    /* renamed from: f */
    public String m3384f() {
        return this.f3413b;
    }

    /* renamed from: g */
    public String m3385g() {
        return this.f3414c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f3412a + ", mProviderPackage: " + this.f3413b + ", mQuery: " + this.f3414c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f3415d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f3415d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f3416e);
        return sb2.toString();
    }
}
