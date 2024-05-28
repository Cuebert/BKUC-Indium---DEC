package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p085g4.AbstractC3263l;
import p085g4.InterfaceC3251f;
import p224r5.InterfaceC4442n;

/* renamed from: com.google.firebase.iid.p */
/* loaded from: classes.dex */
public final class BinderC2601p extends Binder {

    /* renamed from: c */
    private final InterfaceC4442n f10216c;

    public BinderC2601p(InterfaceC4442n interfaceC4442n) {
        this.f10216c = interfaceC4442n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m11991a(final C2604s c2604s) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
            }
            this.f10216c.mo12053a(c2604s.f10225a).mo14496c(C2576a.m11917b(), new InterfaceC3251f(c2604s) { // from class: com.google.firebase.iid.o

                /* renamed from: a */
                private final C2604s f10215a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f10215a = c2604s;
                }

                @Override // p085g4.InterfaceC3251f
                /* renamed from: a */
                public final void mo7517a(AbstractC3263l abstractC3263l) {
                    this.f10215a.m11995a();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
