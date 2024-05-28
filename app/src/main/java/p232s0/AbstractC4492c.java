package p232s0;

import android.os.Bundle;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p280w0.C5099a;

/* renamed from: s0.c */
/* loaded from: classes.dex */
public abstract class AbstractC4492c {

    /* renamed from: c */
    public static final a f18210c = new a(null);

    /* renamed from: a */
    private final String f18211a;

    /* renamed from: b */
    private final Bundle f18212b;

    /* renamed from: s0.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final AbstractC4492c m18473a(String type, Bundle data) {
            C3844i.m16253f(type, "type");
            C3844i.m16253f(data, "data");
            try {
                if (C3844i.m16248a(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return C4495f.f18216d.m18478a(data);
                }
                if (C3844i.m16248a(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    return C4497h.f18220e.m18485a(data);
                }
                throw new C5099a();
            } catch (C5099a unused) {
                return new C4493d(type, data);
            }
        }
    }

    public AbstractC4492c(String type, Bundle data) {
        C3844i.m16253f(type, "type");
        C3844i.m16253f(data, "data");
        this.f18211a = type;
        this.f18212b = data;
    }
}
