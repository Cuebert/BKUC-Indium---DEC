package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import p171n1.C4009a;
import p171n1.C4017e;
import p171n1.C4029k;
import p171n1.C4031l;
import p171n1.C4038o0;
import p171n1.InterfaceC4011b;
import p171n1.InterfaceC4013c;
import p171n1.InterfaceC4015d;
import p171n1.InterfaceC4019f;
import p171n1.InterfaceC4021g;
import p171n1.InterfaceC4023h;
import p171n1.InterfaceC4025i;
import p171n1.InterfaceC4027j;

/* renamed from: com.android.billingclient.api.c */
/* loaded from: classes.dex */
public abstract class AbstractC1173c {

    /* renamed from: com.android.billingclient.api.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private volatile C1201s f5531a;

        /* renamed from: b */
        private final Context f5532b;

        /* renamed from: c */
        private volatile InterfaceC4027j f5533c;

        /* renamed from: d */
        private volatile InterfaceC4013c f5534d;

        /* synthetic */ a(Context context, C4038o0 c4038o0) {
            this.f5532b = context;
        }

        /* renamed from: a */
        public AbstractC1173c m6818a() {
            if (this.f5532b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f5533c == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f5531a == null) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f5533c == null && this.f5534d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling Alternative Billing.");
            }
            if (this.f5533c != null) {
                return new C1175d(null, this.f5531a, this.f5532b, this.f5533c, this.f5534d, null);
            }
            return new C1175d(null, this.f5531a, this.f5532b, null, null);
        }

        /* renamed from: b */
        public a m6819b() {
            C1200r c1200r = new C1200r(null);
            c1200r.m6957a();
            this.f5531a = c1200r.m6958b();
            return this;
        }

        /* renamed from: c */
        public a m6820c(InterfaceC4027j interfaceC4027j) {
            this.f5533c = interfaceC4027j;
            return this;
        }
    }

    /* renamed from: f */
    public static a m6808f(Context context) {
        return new a(context, null);
    }

    /* renamed from: a */
    public abstract void mo6809a(C4009a c4009a, InterfaceC4011b interfaceC4011b);

    /* renamed from: b */
    public abstract void mo6810b(C4017e c4017e, InterfaceC4019f interfaceC4019f);

    /* renamed from: c */
    public abstract C1179f mo6811c(String str);

    /* renamed from: d */
    public abstract boolean mo6812d();

    /* renamed from: e */
    public abstract C1179f mo6813e(Activity activity, C1177e c1177e);

    /* renamed from: g */
    public abstract void mo6814g(C1183h c1183h, InterfaceC4021g interfaceC4021g);

    /* renamed from: h */
    public abstract void mo6815h(C4029k c4029k, InterfaceC4023h interfaceC4023h);

    /* renamed from: i */
    public abstract void mo6816i(C4031l c4031l, InterfaceC4025i interfaceC4025i);

    /* renamed from: j */
    public abstract void mo6817j(InterfaceC4015d interfaceC4015d);
}
