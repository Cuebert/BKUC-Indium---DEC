package p314y8;

import p023b9.C1079c;
import p327z8.C6022a;

/* renamed from: y8.b */
/* loaded from: classes.dex */
public class C5908b {

    /* renamed from: a */
    private C6022a f21776a = new C6022a();

    /* renamed from: b */
    private b f21777b;

    /* renamed from: y8.b$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5907a {
        a() {
        }

        @Override // p314y8.InterfaceC5907a
        /* renamed from: a */
        public void mo21036a(String str) {
            EnumC5912f m21043b = EnumC5912f.m21043b(str);
            C1079c.m6380c().m6398s(m21043b);
            C5908b.this.m21038c(m21043b);
        }
    }

    /* renamed from: y8.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo20095a(EnumC5912f enumC5912f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m21038c(EnumC5912f enumC5912f) {
        b bVar = this.f21777b;
        if (bVar != null) {
            bVar.mo20095a(enumC5912f);
        }
    }

    /* renamed from: b */
    public void m21039b(b bVar) {
        this.f21777b = bVar;
        this.f21776a.m21339d(C1079c.m6380c().m6389j(), new a());
    }
}
