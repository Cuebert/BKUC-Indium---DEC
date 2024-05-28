package p232s0;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import ua.C4890i0;

/* renamed from: s0.w */
/* loaded from: classes.dex */
public final class C4512w extends AbstractC4503n {

    /* renamed from: i */
    public static final a f18258i = new a(null);

    /* renamed from: h */
    private final Set<String> f18259h;

    /* renamed from: s0.w$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final Bundle m18525a(Set<String> allowUserIds) {
            C3844i.m16253f(allowUserIds, "allowUserIds");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(allowUserIds));
            return bundle;
        }
    }

    public C4512w() {
        this((Set) null, false, (Set) null, 7, (C3840e) null);
    }

    private C4512w(Set<String> set, boolean z10, Set<ComponentName> set2, Bundle bundle, Bundle bundle2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, z10, set2);
        this.f18259h = set;
    }

    public /* synthetic */ C4512w(Set set, boolean z10, Set set2, int i10, C3840e c3840e) {
        this((i10 & 1) != 0 ? C4890i0.m19127b() : set, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? C4890i0.m19127b() : set2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4512w(java.util.Set<java.lang.String> r8, boolean r9, java.util.Set<android.content.ComponentName> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "allowedUserIds"
            kotlin.jvm.internal.C3844i.m16253f(r8, r0)
            java.lang.String r0 = "allowedProviders"
            kotlin.jvm.internal.C3844i.m16253f(r10, r0)
            s0.w$a r0 = p232s0.C4512w.f18258i
            android.os.Bundle r5 = r0.m18525a(r8)
            android.os.Bundle r6 = r0.m18525a(r8)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p232s0.C4512w.<init>(java.util.Set, boolean, java.util.Set):void");
    }
}
