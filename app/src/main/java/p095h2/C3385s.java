package p095h2;

import android.content.Context;
import java.util.concurrent.Executor;
import p016b2.InterfaceC0973e;
import p028c2.InterfaceC1124b;
import p109i2.InterfaceC3473c;
import p109i2.InterfaceC3475d;
import p123j2.InterfaceC3595b;
import p136k2.InterfaceC3749a;
import sa.InterfaceC4551a;

/* renamed from: h2.s */
/* loaded from: classes.dex */
public final class C3385s implements InterfaceC1124b<C3384r> {

    /* renamed from: a */
    private final InterfaceC4551a<Context> f14179a;

    /* renamed from: b */
    private final InterfaceC4551a<InterfaceC0973e> f14180b;

    /* renamed from: c */
    private final InterfaceC4551a<InterfaceC3475d> f14181c;

    /* renamed from: d */
    private final InterfaceC4551a<InterfaceC3390x> f14182d;

    /* renamed from: e */
    private final InterfaceC4551a<Executor> f14183e;

    /* renamed from: f */
    private final InterfaceC4551a<InterfaceC3595b> f14184f;

    /* renamed from: g */
    private final InterfaceC4551a<InterfaceC3749a> f14185g;

    /* renamed from: h */
    private final InterfaceC4551a<InterfaceC3749a> f14186h;

    /* renamed from: i */
    private final InterfaceC4551a<InterfaceC3473c> f14187i;

    public C3385s(InterfaceC4551a<Context> interfaceC4551a, InterfaceC4551a<InterfaceC0973e> interfaceC4551a2, InterfaceC4551a<InterfaceC3475d> interfaceC4551a3, InterfaceC4551a<InterfaceC3390x> interfaceC4551a4, InterfaceC4551a<Executor> interfaceC4551a5, InterfaceC4551a<InterfaceC3595b> interfaceC4551a6, InterfaceC4551a<InterfaceC3749a> interfaceC4551a7, InterfaceC4551a<InterfaceC3749a> interfaceC4551a8, InterfaceC4551a<InterfaceC3473c> interfaceC4551a9) {
        this.f14179a = interfaceC4551a;
        this.f14180b = interfaceC4551a2;
        this.f14181c = interfaceC4551a3;
        this.f14182d = interfaceC4551a4;
        this.f14183e = interfaceC4551a5;
        this.f14184f = interfaceC4551a6;
        this.f14185g = interfaceC4551a7;
        this.f14186h = interfaceC4551a8;
        this.f14187i = interfaceC4551a9;
    }

    /* renamed from: a */
    public static C3385s m14934a(InterfaceC4551a<Context> interfaceC4551a, InterfaceC4551a<InterfaceC0973e> interfaceC4551a2, InterfaceC4551a<InterfaceC3475d> interfaceC4551a3, InterfaceC4551a<InterfaceC3390x> interfaceC4551a4, InterfaceC4551a<Executor> interfaceC4551a5, InterfaceC4551a<InterfaceC3595b> interfaceC4551a6, InterfaceC4551a<InterfaceC3749a> interfaceC4551a7, InterfaceC4551a<InterfaceC3749a> interfaceC4551a8, InterfaceC4551a<InterfaceC3473c> interfaceC4551a9) {
        return new C3385s(interfaceC4551a, interfaceC4551a2, interfaceC4551a3, interfaceC4551a4, interfaceC4551a5, interfaceC4551a6, interfaceC4551a7, interfaceC4551a8, interfaceC4551a9);
    }

    /* renamed from: c */
    public static C3384r m14935c(Context context, InterfaceC0973e interfaceC0973e, InterfaceC3475d interfaceC3475d, InterfaceC3390x interfaceC3390x, Executor executor, InterfaceC3595b interfaceC3595b, InterfaceC3749a interfaceC3749a, InterfaceC3749a interfaceC3749a2, InterfaceC3473c interfaceC3473c) {
        return new C3384r(context, interfaceC0973e, interfaceC3475d, interfaceC3390x, executor, interfaceC3595b, interfaceC3749a, interfaceC3749a2, interfaceC3473c);
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3384r get() {
        return m14935c(this.f14179a.get(), this.f14180b.get(), this.f14181c.get(), this.f14182d.get(), this.f14183e.get(), this.f14184f.get(), this.f14185g.get(), this.f14186h.get(), this.f14187i.get());
    }
}
