package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import p085g4.AbstractC3263l;
import p085g4.InterfaceC3245c;
import p093h0.C3356a;
import p224r5.InterfaceC4429a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.e */
/* loaded from: classes.dex */
public final class C2584e {

    /* renamed from: a */
    private final Executor f10178a;

    /* renamed from: b */
    private final Map<Pair<String, String>, AbstractC3263l<InterfaceC4429a>> f10179b = new C3356a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2584e(Executor executor) {
        this.f10178a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ AbstractC3263l m11931a(Pair pair, AbstractC3263l abstractC3263l) throws Exception {
        synchronized (this) {
            this.f10179b.remove(pair);
        }
        return abstractC3263l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final synchronized AbstractC3263l<InterfaceC4429a> m11932b(String str, String str2, InterfaceC2588g interfaceC2588g) {
        final Pair pair = new Pair(str, str2);
        AbstractC3263l<InterfaceC4429a> abstractC3263l = this.f10179b.get(pair);
        if (abstractC3263l != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 29);
                sb2.append("Joining ongoing request for: ");
                sb2.append(valueOf);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            return abstractC3263l;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
            sb3.append("Making new request for: ");
            sb3.append(valueOf2);
            Log.d("FirebaseInstanceId", sb3.toString());
        }
        AbstractC3263l mo14502i = interfaceC2588g.zza().mo14502i(this.f10178a, new InterfaceC3245c(this, pair) { // from class: com.google.firebase.iid.d

            /* renamed from: a */
            private final C2584e f10173a;

            /* renamed from: b */
            private final Pair f10174b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10173a = this;
                this.f10174b = pair;
            }

            @Override // p085g4.InterfaceC3245c
            /* renamed from: a */
            public final Object mo11930a(AbstractC3263l abstractC3263l2) {
                return this.f10173a.m11931a(this.f10174b, abstractC3263l2);
            }
        });
        this.f10179b.put(pair, mo14502i);
        return mo14502i;
    }
}
