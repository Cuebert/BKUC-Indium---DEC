package p232s0;

import android.os.Bundle;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p280w0.C5099a;

/* renamed from: s0.i */
/* loaded from: classes.dex */
public abstract class AbstractC4498i {

    /* renamed from: c */
    public static final a f18222c = new a(null);

    /* renamed from: a */
    private final String f18223a;

    /* renamed from: b */
    private final Bundle f18224b;

    /* renamed from: s0.i$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final AbstractC4498i m18487a(String type, Bundle data) {
            C3844i.m16253f(type, "type");
            C3844i.m16253f(data, "data");
            try {
                if (C3844i.m16248a(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return C4514y.f18263f.m18530a(data);
                }
                if (C3844i.m16248a(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    return C4489a0.f18191e.m18464a(data);
                }
                throw new C5099a();
            } catch (C5099a unused) {
                return new C4508s(type, data);
            }
        }
    }

    public AbstractC4498i(String type, Bundle data) {
        C3844i.m16253f(type, "type");
        C3844i.m16253f(data, "data");
        this.f18223a = type;
        this.f18224b = data;
    }
}
