package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0839f;

/* renamed from: androidx.savedstate.b */
/* loaded from: classes.dex */
public final class C0927b {

    /* renamed from: a */
    private final InterfaceC0928c f4831a;

    /* renamed from: b */
    private final SavedStateRegistry f4832b = new SavedStateRegistry();

    private C0927b(InterfaceC0928c interfaceC0928c) {
        this.f4831a = interfaceC0928c;
    }

    /* renamed from: a */
    public static C0927b m5897a(InterfaceC0928c interfaceC0928c) {
        return new C0927b(interfaceC0928c);
    }

    /* renamed from: b */
    public SavedStateRegistry m5898b() {
        return this.f4832b;
    }

    /* renamed from: c */
    public void m5899c(Bundle bundle) {
        AbstractC0839f mo583f = this.f4831a.mo583f();
        if (mo583f.mo4890b() == AbstractC0839f.c.INITIALIZED) {
            mo583f.mo4889a(new Recreator(this.f4831a));
            this.f4832b.m5893b(mo583f, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void m5900d(Bundle bundle) {
        this.f4832b.m5894c(bundle);
    }
}
