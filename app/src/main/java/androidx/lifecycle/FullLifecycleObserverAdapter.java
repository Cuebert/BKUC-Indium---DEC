package androidx.lifecycle;

import androidx.lifecycle.AbstractC0839f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements InterfaceC0843j {

    /* renamed from: n */
    private final InterfaceC0837d f4224n;

    /* renamed from: o */
    private final InterfaceC0843j f4225o;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0826a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4226a;

        static {
            int[] iArr = new int[AbstractC0839f.b.values().length];
            f4226a = iArr;
            try {
                iArr[AbstractC0839f.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4226a[AbstractC0839f.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4226a[AbstractC0839f.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4226a[AbstractC0839f.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4226a[AbstractC0839f.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4226a[AbstractC0839f.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4226a[AbstractC0839f.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(InterfaceC0837d interfaceC0837d, InterfaceC0843j interfaceC0843j) {
        this.f4224n = interfaceC0837d;
        this.f4225o = interfaceC0843j;
    }

    @Override // androidx.lifecycle.InterfaceC0843j
    /* renamed from: e */
    public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
        switch (C0826a.f4226a[bVar.ordinal()]) {
            case 1:
                this.f4224n.m4887c(interfaceC0845l);
                break;
            case 2:
                this.f4224n.onStart(interfaceC0845l);
                break;
            case 3:
                this.f4224n.onResume(interfaceC0845l);
                break;
            case 4:
                this.f4224n.onPause(interfaceC0845l);
                break;
            case 5:
                this.f4224n.onStop(interfaceC0845l);
                break;
            case 6:
                this.f4224n.onDestroy(interfaceC0845l);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0843j interfaceC0843j = this.f4225o;
        if (interfaceC0843j != null) {
            interfaceC0843j.mo592e(interfaceC0845l, bVar);
        }
    }
}
