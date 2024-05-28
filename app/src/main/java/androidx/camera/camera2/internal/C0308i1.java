package androidx.camera.camera2.internal;

import androidx.camera.core.AbstractC0473t;
import androidx.camera.core.C0463q1;
import androidx.lifecycle.C0851r;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import p279w.C5029g0;
import p279w.InterfaceC5017d0;

/* renamed from: androidx.camera.camera2.internal.i1 */
/* loaded from: classes.dex */
class C0308i1 {

    /* renamed from: a */
    private final C5029g0 f1400a;

    /* renamed from: b */
    private final C0851r<AbstractC0473t> f1401b;

    /* renamed from: androidx.camera.camera2.internal.i1$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1402a;

        static {
            int[] iArr = new int[InterfaceC5017d0.a.values().length];
            f1402a = iArr;
            try {
                iArr[InterfaceC5017d0.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1402a[InterfaceC5017d0.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1402a[InterfaceC5017d0.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1402a[InterfaceC5017d0.a.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1402a[InterfaceC5017d0.a.RELEASING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1402a[InterfaceC5017d0.a.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1402a[InterfaceC5017d0.a.RELEASED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0308i1(C5029g0 c5029g0) {
        this.f1400a = c5029g0;
        C0851r<AbstractC0473t> c0851r = new C0851r<>();
        this.f1401b = c0851r;
        c0851r.mo4865m(AbstractC0473t.m2230a(AbstractC0473t.b.CLOSED));
    }

    /* renamed from: b */
    private AbstractC0473t m1523b() {
        return this.f1400a.m19556a() ? AbstractC0473t.m2230a(AbstractC0473t.b.OPENING) : AbstractC0473t.m2230a(AbstractC0473t.b.PENDING_OPEN);
    }

    /* renamed from: a */
    public LiveData<AbstractC0473t> m1524a() {
        return this.f1401b;
    }

    /* renamed from: c */
    public void m1525c(InterfaceC5017d0.a aVar, AbstractC0473t.a aVar2) {
        AbstractC0473t m1523b;
        switch (a.f1402a[aVar.ordinal()]) {
            case 1:
                m1523b = m1523b();
                break;
            case 2:
                m1523b = AbstractC0473t.m2231b(AbstractC0473t.b.OPENING, aVar2);
                break;
            case 3:
                m1523b = AbstractC0473t.m2231b(AbstractC0473t.b.OPEN, aVar2);
                break;
            case 4:
            case 5:
                m1523b = AbstractC0473t.m2231b(AbstractC0473t.b.CLOSING, aVar2);
                break;
            case 6:
            case 7:
                m1523b = AbstractC0473t.m2231b(AbstractC0473t.b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        C0463q1.m2202a("CameraStateMachine", "New public camera state " + m1523b + " from " + aVar + " and " + aVar2);
        if (Objects.equals(this.f1401b.mo1579f(), m1523b)) {
            return;
        }
        C0463q1.m2202a("CameraStateMachine", "Publishing new public camera state " + m1523b);
        this.f1401b.mo4865m(m1523b);
    }
}
