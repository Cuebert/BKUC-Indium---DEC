package p232s0;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;

/* renamed from: s0.n */
/* loaded from: classes.dex */
public abstract class AbstractC4503n {

    /* renamed from: g */
    public static final a f18229g = new a(null);

    /* renamed from: a */
    private final String f18230a;

    /* renamed from: b */
    private final Bundle f18231b;

    /* renamed from: c */
    private final Bundle f18232c;

    /* renamed from: d */
    private final boolean f18233d;

    /* renamed from: e */
    private final boolean f18234e;

    /* renamed from: f */
    private final Set<ComponentName> f18235f;

    /* renamed from: s0.n$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }

    public AbstractC4503n(String type, Bundle requestData, Bundle candidateQueryData, boolean z10, boolean z11, Set<ComponentName> allowedProviders) {
        C3844i.m16253f(type, "type");
        C3844i.m16253f(requestData, "requestData");
        C3844i.m16253f(candidateQueryData, "candidateQueryData");
        C3844i.m16253f(allowedProviders, "allowedProviders");
        this.f18230a = type;
        this.f18231b = requestData;
        this.f18232c = candidateQueryData;
        this.f18233d = z10;
        this.f18234e = z11;
        this.f18235f = allowedProviders;
        requestData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z11);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z11);
    }

    /* renamed from: a */
    public final Set<ComponentName> m18492a() {
        return this.f18235f;
    }

    /* renamed from: b */
    public final Bundle m18493b() {
        return this.f18232c;
    }

    /* renamed from: c */
    public final Bundle m18494c() {
        return this.f18231b;
    }

    /* renamed from: d */
    public final String m18495d() {
        return this.f18230a;
    }

    /* renamed from: e */
    public final boolean m18496e() {
        return this.f18234e;
    }

    /* renamed from: f */
    public final boolean m18497f() {
        return this.f18233d;
    }
}
