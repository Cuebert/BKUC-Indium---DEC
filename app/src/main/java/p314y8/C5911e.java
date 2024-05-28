package p314y8;

import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0852s;
import p023b9.C1079c;

/* renamed from: y8.e */
/* loaded from: classes.dex */
public class C5911e {

    /* renamed from: a */
    private b f21779a;

    /* renamed from: y8.e$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC0852s<EnumC5912f> {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC0852s
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo1522a(EnumC5912f enumC5912f) {
            b bVar = C5911e.this.f21779a;
            if (enumC5912f == null) {
                enumC5912f = C1079c.f5313j;
            }
            bVar.mo12200U(enumC5912f);
        }
    }

    /* renamed from: y8.e$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: U */
        void mo12200U(EnumC5912f enumC5912f);
    }

    public C5911e(b bVar) {
        this.f21779a = bVar;
    }

    /* renamed from: b */
    public void m21041b(InterfaceC0845l interfaceC0845l) {
        C1079c.m6380c().m6387h().m4861i(interfaceC0845l, new a());
    }
}
