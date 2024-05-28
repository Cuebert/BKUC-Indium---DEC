package p246t3;

import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: t3.n */
/* loaded from: classes.dex */
public final class C4679n {

    /* renamed from: a */
    private final String f18477a;

    /* renamed from: b */
    private final C4671l f18478b;

    /* renamed from: c */
    private C4671l f18479c;

    public /* synthetic */ C4679n(String str, C4675m c4675m) {
        C4671l c4671l = new C4671l(null);
        this.f18478b = c4671l;
        this.f18479c = c4671l;
        Objects.requireNonNull(str);
        this.f18477a = str;
    }

    /* renamed from: a */
    public final C4679n m18792a(String str, int i10) {
        String valueOf = String.valueOf(i10);
        C4663j c4663j = new C4663j(null);
        this.f18479c.f18473c = c4663j;
        this.f18479c = c4663j;
        c4663j.f18472b = valueOf;
        c4663j.f18471a = "errorCode";
        return this;
    }

    /* renamed from: b */
    public final C4679n m18793b(String str, Object obj) {
        C4671l c4671l = new C4671l(null);
        this.f18479c.f18473c = c4671l;
        this.f18479c = c4671l;
        c4671l.f18472b = obj;
        c4671l.f18471a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f18477a);
        sb2.append('{');
        C4671l c4671l = this.f18478b.f18473c;
        String str = BuildConfig.FLAVOR;
        while (c4671l != null) {
            Object obj = c4671l.f18472b;
            sb2.append(str);
            String str2 = c4671l.f18471a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            } else {
                sb2.append(obj);
            }
            c4671l = c4671l.f18473c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
