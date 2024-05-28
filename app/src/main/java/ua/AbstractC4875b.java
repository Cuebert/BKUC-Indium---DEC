package ua;

import java.util.List;
import kotlin.jvm.internal.C3840e;

/* renamed from: ua.b */
/* loaded from: classes.dex */
public abstract class AbstractC4875b<E> extends AbstractC4873a<E> implements List<E> {

    /* renamed from: n */
    public static final a f18771n = new a(null);

    /* renamed from: ua.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final void m19084a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: b */
        public final void m19085b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }
    }
}
