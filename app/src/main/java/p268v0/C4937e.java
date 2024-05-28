package p268v0;

import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p132jb.C3695l;
import p243t0.AbstractC4604m;
import p243t0.C4603l;
import p280w0.C5099a;

/* renamed from: v0.e */
/* loaded from: classes.dex */
public class C4937e extends AbstractC4604m {

    /* renamed from: q */
    public static final a f18988q = new a(null);

    /* renamed from: p */
    private final String f18989p;

    /* renamed from: v0.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final AbstractC4604m m19362a(String type, String str) {
            boolean m15674e;
            C3844i.m16253f(type, "type");
            try {
                m15674e = C3695l.m15674e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null);
                if (m15674e) {
                    return C4936d.f18986s.m19360a(type, str);
                }
                throw new C5099a();
            } catch (C5099a unused) {
                return new C4603l(type, str);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4937e(String type, CharSequence charSequence) {
        super(type, charSequence);
        C3844i.m16253f(type, "type");
        this.f18989p = type;
        if (!(m19361a().length() > 0)) {
            throw new IllegalArgumentException("type must not be empty".toString());
        }
    }

    /* renamed from: a */
    public String m19361a() {
        return this.f18989p;
    }
}
