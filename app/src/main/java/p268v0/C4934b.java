package p268v0;

import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p132jb.C3696m;
import p243t0.AbstractC4596e;
import p243t0.C4595d;
import p280w0.C5099a;

/* renamed from: v0.b */
/* loaded from: classes.dex */
public class C4934b extends AbstractC4596e {

    /* renamed from: q */
    public static final a f18983q = new a(null);

    /* renamed from: p */
    private final String f18984p;

    /* renamed from: v0.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final AbstractC4596e m19357a(String type, String str) {
            boolean m15678g;
            C3844i.m16253f(type, "type");
            try {
                m15678g = C3696m.m15678g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null);
                if (m15678g) {
                    return C4933a.f18981s.m19355a(type, str);
                }
                throw new C5099a();
            } catch (C5099a unused) {
                return new C4595d(type, str);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4934b(String type, CharSequence charSequence) {
        super(type, charSequence);
        C3844i.m16253f(type, "type");
        this.f18984p = type;
        if (!(m19356a().length() > 0)) {
            throw new IllegalArgumentException("type must not be empty".toString());
        }
    }

    /* renamed from: a */
    public String m19356a() {
        return this.f18984p;
    }
}
