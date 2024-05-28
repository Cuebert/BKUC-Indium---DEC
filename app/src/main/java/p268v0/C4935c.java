package p268v0;

import kotlin.jvm.internal.C3840e;
import p256u0.AbstractC4786e;
import p280w0.C5099a;

/* renamed from: v0.c */
/* loaded from: classes.dex */
public final class C4935c {

    /* renamed from: a */
    public static final a f18985a = new a(null);

    /* renamed from: v0.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final <T> T m19359b(AbstractC4786e abstractC4786e, String str, T t10) {
            if (t10 instanceof C4933a) {
                return (T) new C4933a(abstractC4786e, str);
            }
            if (t10 instanceof C4936d) {
                return (T) new C4936d(abstractC4786e, str);
            }
            throw new C5099a();
        }
    }
}
