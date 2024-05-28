package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0843j;
import androidx.lifecycle.InterfaceC0845l;
import androidx.savedstate.Recreator;
import java.util.Map;
import p157m.C3912b;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b */
    private Bundle f4825b;

    /* renamed from: c */
    private boolean f4826c;

    /* renamed from: d */
    private Recreator.C0922a f4827d;

    /* renamed from: a */
    private C3912b<String, InterfaceC0925b> f4824a = new C3912b<>();

    /* renamed from: e */
    boolean f4828e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.savedstate.SavedStateRegistry$1 */
    /* loaded from: classes.dex */
    public class C09231 implements InterfaceC0843j {
        C09231() {
        }

        @Override // androidx.lifecycle.InterfaceC0843j
        /* renamed from: e */
        public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
            if (bVar == AbstractC0839f.b.ON_START) {
                SavedStateRegistry.this.f4828e = true;
            } else if (bVar == AbstractC0839f.b.ON_STOP) {
                SavedStateRegistry.this.f4828e = false;
            }
        }
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0924a {
        /* renamed from: a */
        void mo4876a(InterfaceC0928c interfaceC0928c);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0925b {
        /* renamed from: a */
        Bundle mo594a();
    }

    /* renamed from: a */
    public Bundle m5892a(String str) {
        if (this.f4826c) {
            Bundle bundle = this.f4825b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f4825b.remove(str);
            if (this.f4825b.isEmpty()) {
                this.f4825b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* renamed from: b */
    public void m5893b(AbstractC0839f abstractC0839f, Bundle bundle) {
        if (!this.f4826c) {
            if (bundle != null) {
                this.f4825b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            abstractC0839f.mo4889a(new InterfaceC0843j() { // from class: androidx.savedstate.SavedStateRegistry.1
                C09231() {
                }

                @Override // androidx.lifecycle.InterfaceC0843j
                /* renamed from: e */
                public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
                    if (bVar == AbstractC0839f.b.ON_START) {
                        SavedStateRegistry.this.f4828e = true;
                    } else if (bVar == AbstractC0839f.b.ON_STOP) {
                        SavedStateRegistry.this.f4828e = false;
                    }
                }
            });
            this.f4826c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* renamed from: c */
    public void m5894c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4825b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C3912b<String, InterfaceC0925b>.d m16584i = this.f4824a.m16584i();
        while (m16584i.hasNext()) {
            Map.Entry next = m16584i.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC0925b) next.getValue()).mo594a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void m5895d(String str, InterfaceC0925b interfaceC0925b) {
        if (this.f4824a.mo16580m(str, interfaceC0925b) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void m5896e(Class<? extends InterfaceC0924a> cls) {
        if (this.f4828e) {
            if (this.f4827d == null) {
                this.f4827d = new Recreator.C0922a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f4827d.m5891b(cls.getName());
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
