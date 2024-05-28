package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0843j;
import androidx.lifecycle.InterfaceC0845l;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0843j {

    /* renamed from: n */
    private final InterfaceC0928c f4822n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes.dex */
    public static final class C0922a implements SavedStateRegistry.InterfaceC0925b {

        /* renamed from: a */
        final Set<String> f4823a = new HashSet();

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0922a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m5895d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0925b
        /* renamed from: a */
        public Bundle mo594a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4823a));
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m5891b(String str) {
            this.f4823a.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recreator(InterfaceC0928c interfaceC0928c) {
        this.f4822n = interfaceC0928c;
    }

    /* renamed from: a */
    private void m5890a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.InterfaceC0924a.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.InterfaceC0924a) declaredConstructor.newInstance(new Object[0])).mo4876a(this.f4822n);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0843j
    /* renamed from: e */
    public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
        if (bVar == AbstractC0839f.b.ON_CREATE) {
            interfaceC0845l.mo583f().mo4891c(this);
            Bundle m5892a = this.f4822n.mo586l().m5892a("androidx.savedstate.Restarter");
            if (m5892a == null) {
                return;
            }
            ArrayList<String> stringArrayList = m5892a.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    m5890a(it.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
