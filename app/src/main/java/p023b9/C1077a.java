package p023b9;

import com.roblox.client.C2877p0;
import p100h7.AsyncTaskC3410c;
import p100h7.C3414g;
import p100h7.C3416i;
import p100h7.C3417j;
import p100h7.InterfaceC3420m;
import p128j7.C3655b;

/* renamed from: b9.a */
/* loaded from: classes.dex */
public class C1077a {

    /* renamed from: a */
    private final InterfaceC3420m f5307a;

    /* renamed from: b */
    private boolean f5308b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b9.a$a */
    /* loaded from: classes.dex */
    public class a extends C3416i {
        a() {
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: b */
        public void mo281b(C3417j c3417j) {
            if (C1077a.this.f5307a != null) {
                C1077a.this.f5307a.mo12177a(c3417j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b9.a$b */
    /* loaded from: classes.dex */
    public static class b extends C3655b {
        private b() {
        }

        @Override // p128j7.C3655b, p128j7.InterfaceC3657d
        /* renamed from: e */
        public boolean mo6373d(C3417j c3417j) {
            return (c3417j.m15027b() == 200 || c3417j.m15027b() == 401) ? false : true;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C1077a(InterfaceC3420m interfaceC3420m) {
        this.f5307a = interfaceC3420m;
    }

    /* renamed from: b */
    public void m6371b() {
        this.f5308b = false;
    }

    /* renamed from: c */
    public void m6372c() {
        a aVar = null;
        AsyncTaskC3410c mo15024b = C3414g.m15025a().mo15024b(C2877p0.m12906a1(), null, new a());
        if (this.f5308b) {
            mo15024b.m15010g(new b(aVar));
        }
        mo15024b.mo15006c();
    }
}
