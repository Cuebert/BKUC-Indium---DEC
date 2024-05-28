package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p4 */
/* loaded from: classes.dex */
public final class C1728p4 {

    /* renamed from: a */
    public final C1728p4 f7139a;

    /* renamed from: b */
    final C1867y f7140b;

    /* renamed from: c */
    final Map<String, InterfaceC1739q> f7141c = new HashMap();

    /* renamed from: d */
    final Map<String, Boolean> f7142d = new HashMap();

    public C1728p4(C1728p4 c1728p4, C1867y c1867y) {
        this.f7139a = c1728p4;
        this.f7140b = c1867y;
    }

    /* renamed from: a */
    public final C1728p4 m8654a() {
        return new C1728p4(this, this.f7140b);
    }

    /* renamed from: b */
    public final InterfaceC1739q m8655b(InterfaceC1739q interfaceC1739q) {
        return this.f7140b.m9057a(this, interfaceC1739q);
    }

    /* renamed from: c */
    public final InterfaceC1739q m8656c(C1560f c1560f) {
        InterfaceC1739q interfaceC1739q = InterfaceC1739q.f7165b;
        Iterator<Integer> m8143v = c1560f.m8143v();
        while (m8143v.hasNext()) {
            interfaceC1739q = this.f7140b.m9057a(this, c1560f.m8141s(m8143v.next().intValue()));
            if (interfaceC1739q instanceof C1594h) {
                break;
            }
        }
        return interfaceC1739q;
    }

    /* renamed from: d */
    public final InterfaceC1739q m8657d(String str) {
        if (this.f7141c.containsKey(str)) {
            return this.f7141c.get(str);
        }
        C1728p4 c1728p4 = this.f7139a;
        if (c1728p4 != null) {
            return c1728p4.m8657d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    /* renamed from: e */
    public final void m8658e(String str, InterfaceC1739q interfaceC1739q) {
        if (this.f7142d.containsKey(str)) {
            return;
        }
        if (interfaceC1739q == null) {
            this.f7141c.remove(str);
        } else {
            this.f7141c.put(str, interfaceC1739q);
        }
    }

    /* renamed from: f */
    public final void m8659f(String str, InterfaceC1739q interfaceC1739q) {
        m8658e(str, interfaceC1739q);
        this.f7142d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void m8660g(String str, InterfaceC1739q interfaceC1739q) {
        C1728p4 c1728p4;
        if (!this.f7141c.containsKey(str) && (c1728p4 = this.f7139a) != null && c1728p4.m8661h(str)) {
            this.f7139a.m8660g(str, interfaceC1739q);
        } else {
            if (this.f7142d.containsKey(str)) {
                return;
            }
            if (interfaceC1739q == null) {
                this.f7141c.remove(str);
            } else {
                this.f7141c.put(str, interfaceC1739q);
            }
        }
    }

    /* renamed from: h */
    public final boolean m8661h(String str) {
        if (this.f7141c.containsKey(str)) {
            return true;
        }
        C1728p4 c1728p4 = this.f7139a;
        if (c1728p4 != null) {
            return c1728p4.m8661h(str);
        }
        return false;
    }
}
