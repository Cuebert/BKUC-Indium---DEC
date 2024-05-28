package p145kb;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3840e;
import p051db.InterfaceC3041l;
import va.AbstractC4998b;
import va.InterfaceC5001e;

/* renamed from: kb.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC3813o0 extends AbstractC3826v implements Closeable {

    /* renamed from: p */
    public static final a f15873p = new a(null);

    /* renamed from: kb.o0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4998b<AbstractC3826v, AbstractC3813o0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kb.o0$a$a */
        /* loaded from: classes.dex */
        public static final class C6053a extends AbstractC3845j implements InterfaceC3041l<InterfaceC5001e.a, AbstractC3813o0> {

            /* renamed from: n */
            public static final C6053a f15874n = new C6053a();

            C6053a() {
                super(1);
            }

            @Override // p051db.InterfaceC3041l
            /* renamed from: a */
            public final AbstractC3813o0 invoke(InterfaceC5001e.a aVar) {
                if (aVar instanceof AbstractC3813o0) {
                    return (AbstractC3813o0) aVar;
                }
                return null;
            }
        }

        private a() {
            super(AbstractC3826v.f15885o, C6053a.f15874n);
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }
}
