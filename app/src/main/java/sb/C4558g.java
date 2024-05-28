package sb;

import java.io.IOException;
import java.util.List;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.InterfaceC4165a0;
import p193ob.InterfaceC4176g;
import p193ob.InterfaceC4186l;
import p230rb.C4472c;
import p230rb.C4480k;

/* renamed from: sb.g */
/* loaded from: classes.dex */
public final class C4558g implements InterfaceC4165a0.a {

    /* renamed from: a */
    private final List<InterfaceC4165a0> f18315a;

    /* renamed from: b */
    private final C4480k f18316b;

    /* renamed from: c */
    private final C4472c f18317c;

    /* renamed from: d */
    private final int f18318d;

    /* renamed from: e */
    private final C4177g0 f18319e;

    /* renamed from: f */
    private final InterfaceC4176g f18320f;

    /* renamed from: g */
    private final int f18321g;

    /* renamed from: h */
    private final int f18322h;

    /* renamed from: i */
    private final int f18323i;

    /* renamed from: j */
    private int f18324j;

    public C4558g(List<InterfaceC4165a0> list, C4480k c4480k, C4472c c4472c, int i10, C4177g0 c4177g0, InterfaceC4176g interfaceC4176g, int i11, int i12, int i13) {
        this.f18315a = list;
        this.f18316b = c4480k;
        this.f18317c = c4472c;
        this.f18318d = i10;
        this.f18319e = c4177g0;
        this.f18320f = interfaceC4176g;
        this.f18321g = i11;
        this.f18322h = i12;
        this.f18323i = i13;
    }

    @Override // p193ob.InterfaceC4165a0.a
    /* renamed from: a */
    public InterfaceC4186l mo17271a() {
        C4472c c4472c = this.f18317c;
        if (c4472c != null) {
            return c4472c.m18342c();
        }
        return null;
    }

    @Override // p193ob.InterfaceC4165a0.a
    /* renamed from: b */
    public C4181i0 mo17272b(C4177g0 c4177g0) throws IOException {
        return m18634h(c4177g0, this.f18316b, this.f18317c);
    }

    @Override // p193ob.InterfaceC4165a0.a
    /* renamed from: c */
    public int mo17273c() {
        return this.f18321g;
    }

    @Override // p193ob.InterfaceC4165a0.a
    /* renamed from: d */
    public int mo17274d() {
        return this.f18322h;
    }

    @Override // p193ob.InterfaceC4165a0.a
    /* renamed from: e */
    public C4177g0 mo17275e() {
        return this.f18319e;
    }

    @Override // p193ob.InterfaceC4165a0.a
    /* renamed from: f */
    public int mo17276f() {
        return this.f18323i;
    }

    /* renamed from: g */
    public C4472c m18633g() {
        C4472c c4472c = this.f18317c;
        if (c4472c != null) {
            return c4472c;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public C4181i0 m18634h(C4177g0 c4177g0, C4480k c4480k, C4472c c4472c) throws IOException {
        if (this.f18318d < this.f18315a.size()) {
            this.f18324j++;
            C4472c c4472c2 = this.f18317c;
            if (c4472c2 != null && !c4472c2.m18342c().m18386v(c4177g0.m17400j())) {
                throw new IllegalStateException("network interceptor " + this.f18315a.get(this.f18318d - 1) + " must retain the same host and port");
            }
            if (this.f18317c != null && this.f18324j > 1) {
                throw new IllegalStateException("network interceptor " + this.f18315a.get(this.f18318d - 1) + " must call proceed() exactly once");
            }
            C4558g c4558g = new C4558g(this.f18315a, c4480k, c4472c, this.f18318d + 1, c4177g0, this.f18320f, this.f18321g, this.f18322h, this.f18323i);
            InterfaceC4165a0 interfaceC4165a0 = this.f18315a.get(this.f18318d);
            C4181i0 mo17270a = interfaceC4165a0.mo17270a(c4558g);
            if (c4472c != null && this.f18318d + 1 < this.f18315a.size() && c4558g.f18324j != 1) {
                throw new IllegalStateException("network interceptor " + interfaceC4165a0 + " must call proceed() exactly once");
            }
            if (mo17270a != null) {
                if (mo17270a.m17430b() != null) {
                    return mo17270a;
                }
                throw new IllegalStateException("interceptor " + interfaceC4165a0 + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + interfaceC4165a0 + " returned null");
        }
        throw new AssertionError();
    }

    /* renamed from: i */
    public C4480k m18635i() {
        return this.f18316b;
    }
}
