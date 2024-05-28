package p288w8;

import android.os.SystemClock;
import android.util.Pair;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import ma.C3969a;
import p193ob.AbstractC4197v;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.C4199x;
import p193ob.EnumC4173e0;
import p193ob.InterfaceC4176g;
import p193ob.InterfaceC4186l;

/* renamed from: w8.f */
/* loaded from: classes.dex */
public class C5471f extends AbstractC4197v {

    /* renamed from: b */
    List<Pair<String, Long>> f20408b = new ArrayList();

    @Override // p193ob.AbstractC4197v
    /* renamed from: b */
    public void mo17518b(InterfaceC4176g interfaceC4176g) {
        this.f20408b.add(new Pair<>("callEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: d */
    public void mo17520d(InterfaceC4176g interfaceC4176g) {
        this.f20408b.add(new Pair<>("callStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: e */
    public void mo17521e(InterfaceC4176g interfaceC4176g, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC4173e0 enumC4173e0) {
        this.f20408b.add(new Pair<>("connectEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: g */
    public void mo17523g(InterfaceC4176g interfaceC4176g, InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.f20408b.add(new Pair<>("connectStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: h */
    public void mo17524h(InterfaceC4176g interfaceC4176g, InterfaceC4186l interfaceC4186l) {
        this.f20408b.add(new Pair<>("connectionAcquired", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: i */
    public void mo17525i(InterfaceC4176g interfaceC4176g, InterfaceC4186l interfaceC4186l) {
        this.f20408b.add(new Pair<>("connectionReleased", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: j */
    public void mo17526j(InterfaceC4176g interfaceC4176g, String str, List<InetAddress> list) {
        this.f20408b.add(new Pair<>("dnsEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: k */
    public void mo17527k(InterfaceC4176g interfaceC4176g, String str) {
        this.f20408b.add(new Pair<>("dnsStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: n */
    public void mo17528n(InterfaceC4176g interfaceC4176g, long j10) {
        this.f20408b.add(new Pair<>("requestBodyEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: o */
    public void mo17529o(InterfaceC4176g interfaceC4176g) {
        this.f20408b.add(new Pair<>("requestBodyStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: q */
    public void mo17531q(InterfaceC4176g interfaceC4176g, C4177g0 c4177g0) {
        this.f20408b.add(new Pair<>("requestHeadersEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: r */
    public void mo17532r(InterfaceC4176g interfaceC4176g) {
        this.f20408b.add(new Pair<>("requestHeadersStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: s */
    public void mo17533s(InterfaceC4176g interfaceC4176g, long j10) {
        this.f20408b.add(new Pair<>("responseBodyEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: t */
    public void mo17534t(InterfaceC4176g interfaceC4176g) {
        this.f20408b.add(new Pair<>("responseBodyStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: v */
    public void mo17536v(InterfaceC4176g interfaceC4176g, C4181i0 c4181i0) {
        this.f20408b.add(new Pair<>("responseHeadersEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: w */
    public void mo17537w(InterfaceC4176g interfaceC4176g) {
        this.f20408b.add(new Pair<>("responseHeadersStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: x */
    public void mo17538x(InterfaceC4176g interfaceC4176g, C4199x c4199x) {
        this.f20408b.add(new Pair<>("secureConnectEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // p193ob.AbstractC4197v
    /* renamed from: y */
    public void mo17539y(InterfaceC4176g interfaceC4176g) {
        this.f20408b.add(new Pair<>("secureConnectStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* renamed from: z */
    public void m20123z() {
        for (Pair<String, Long> pair : this.f20408b) {
            C3969a.m16695e().m16699d((String) pair.first, ((Long) pair.second).longValue());
        }
    }
}
