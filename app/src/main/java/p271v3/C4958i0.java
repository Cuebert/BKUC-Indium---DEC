package p271v3;

import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: v3.i0 */
/* loaded from: classes.dex */
public final class C4958i0 {

    /* renamed from: a */
    private final String f19025a;

    /* renamed from: b */
    private final C4956h0 f19026b;

    /* renamed from: c */
    private C4956h0 f19027c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4958i0(String str, C4954g0 c4954g0) {
        C4956h0 c4956h0 = new C4956h0(null);
        this.f19026b = c4956h0;
        this.f19027c = c4956h0;
        Objects.requireNonNull(str);
        this.f19025a = str;
    }

    /* renamed from: b */
    private final C4958i0 m19382b(String str, @NullableDecl Object obj) {
        C4956h0 c4956h0 = new C4956h0(null);
        this.f19027c.f19024c = c4956h0;
        this.f19027c = c4956h0;
        c4956h0.f19023b = obj;
        c4956h0.f19022a = str;
        return this;
    }

    /* renamed from: a */
    public final C4958i0 m19383a(String str, @NullableDecl Object obj) {
        m19382b(str, obj);
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f19025a);
        sb2.append('{');
        C4956h0 c4956h0 = this.f19026b.f19024c;
        String str = BuildConfig.FLAVOR;
        while (c4956h0 != null) {
            Object obj = c4956h0.f19023b;
            sb2.append(str);
            String str2 = c4956h0.f19022a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            } else {
                sb2.append(obj);
            }
            c4956h0 = c4956h0.f19024c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
