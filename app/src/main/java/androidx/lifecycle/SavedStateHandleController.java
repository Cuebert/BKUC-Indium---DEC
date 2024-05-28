package androidx.lifecycle;

import androidx.lifecycle.AbstractC0839f;
import androidx.savedstate.InterfaceC0928c;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* loaded from: classes.dex */
final class SavedStateHandleController implements InterfaceC0843j {

    /* renamed from: n */
    private boolean f4252n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    /* loaded from: classes.dex */
    public static final class C0831a implements SavedStateRegistry.InterfaceC0924a {
        C0831a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0924a
        /* renamed from: a */
        public void mo4876a(InterfaceC0928c interfaceC0928c) {
            if (interfaceC0928c instanceof InterfaceC0859z) {
                C0858y mo584i0 = ((InterfaceC0859z) interfaceC0928c).mo584i0();
                SavedStateRegistry mo586l = interfaceC0928c.mo586l();
                Iterator<String> it = mo584i0.m4953c().iterator();
                while (it.hasNext()) {
                    SavedStateHandleController.m4872a(mo584i0.m4952b(it.next()), mo586l, interfaceC0928c.mo583f());
                }
                if (mo584i0.m4953c().isEmpty()) {
                    return;
                }
                mo586l.m5896e(C0831a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: a */
    static void m4872a(AbstractC0856w abstractC0856w, SavedStateRegistry savedStateRegistry, AbstractC0839f abstractC0839f) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC0856w.m4946c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.m4875d()) {
            return;
        }
        savedStateHandleController.m4874b(savedStateRegistry, abstractC0839f);
        m4873f(savedStateRegistry, abstractC0839f);
    }

    /* renamed from: f */
    private static void m4873f(final SavedStateRegistry savedStateRegistry, final AbstractC0839f abstractC0839f) {
        AbstractC0839f.c mo4890b = abstractC0839f.mo4890b();
        if (mo4890b != AbstractC0839f.c.INITIALIZED && !mo4890b.m4895b(AbstractC0839f.c.STARTED)) {
            abstractC0839f.mo4889a(new InterfaceC0843j() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC0843j
                /* renamed from: e */
                public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
                    if (bVar == AbstractC0839f.b.ON_START) {
                        AbstractC0839f.this.mo4891c(this);
                        savedStateRegistry.m5896e(C0831a.class);
                    }
                }
            });
        } else {
            savedStateRegistry.m5896e(C0831a.class);
        }
    }

    /* renamed from: b */
    void m4874b(SavedStateRegistry savedStateRegistry, AbstractC0839f abstractC0839f) {
        if (this.f4252n) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f4252n = true;
        abstractC0839f.mo4889a(this);
        throw null;
    }

    /* renamed from: d */
    boolean m4875d() {
        return this.f4252n;
    }

    @Override // androidx.lifecycle.InterfaceC0843j
    /* renamed from: e */
    public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
        if (bVar == AbstractC0839f.b.ON_DESTROY) {
            this.f4252n = false;
            interfaceC0845l.mo583f().mo4891c(this);
        }
    }
}
