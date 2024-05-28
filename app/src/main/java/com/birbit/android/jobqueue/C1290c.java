package com.birbit.android.jobqueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p183o1.EnumC4121g;

/* renamed from: com.birbit.android.jobqueue.c */
/* loaded from: classes.dex */
public class C1290c {

    /* renamed from: a */
    private boolean f5747a;

    /* renamed from: b */
    private boolean f5748b;

    /* renamed from: c */
    private EnumC4121g f5749c;

    /* renamed from: d */
    private final Set<String> f5750d = new HashSet();

    /* renamed from: e */
    private final List<String> f5751e = new ArrayList();

    /* renamed from: f */
    private final List<String> f5752f = new ArrayList();

    /* renamed from: g */
    private boolean f5753g;

    /* renamed from: h */
    private Long f5754h;

    /* renamed from: i */
    private long f5755i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6996a() {
        this.f5747a = false;
        this.f5748b = false;
        this.f5749c = null;
        this.f5750d.clear();
        this.f5751e.clear();
        this.f5752f.clear();
        this.f5753g = false;
        this.f5754h = null;
        this.f5755i = Long.MIN_VALUE;
    }

    /* renamed from: b */
    public boolean m6997b() {
        return this.f5753g;
    }

    /* renamed from: c */
    public List<String> m6998c() {
        return this.f5751e;
    }

    /* renamed from: d */
    public List<String> m6999d() {
        return this.f5752f;
    }

    /* renamed from: e */
    public long m7000e() {
        return this.f5755i;
    }

    /* renamed from: f */
    public EnumC4121g m7001f() {
        return this.f5749c;
    }

    /* renamed from: g */
    public Set<String> m7002g() {
        return this.f5750d;
    }

    /* renamed from: h */
    public Long m7003h() {
        return this.f5754h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m7004i(Collection<String> collection) {
        this.f5751e.clear();
        if (collection != null) {
            this.f5751e.addAll(collection);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m7005j(Collection<String> collection) {
        this.f5752f.clear();
        if (collection != null) {
            this.f5752f.addAll(collection);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m7006k(boolean z10) {
        this.f5753g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m7007l(int i10) {
        m7009n(i10 == 1);
        m7010o(i10 != 3);
    }

    /* renamed from: m */
    public void m7008m(long j10) {
        this.f5755i = j10;
    }

    /* renamed from: n */
    void m7009n(boolean z10) {
        this.f5747a = z10;
    }

    /* renamed from: o */
    void m7010o(boolean z10) {
        this.f5748b = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m7011p(EnumC4121g enumC4121g) {
        this.f5749c = enumC4121g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m7012q(String[] strArr) {
        this.f5750d.clear();
        if (strArr != null) {
            Collections.addAll(this.f5750d, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m7013r(Long l10) {
        this.f5754h = l10;
    }

    /* renamed from: s */
    public boolean m7014s() {
        return this.f5747a;
    }

    /* renamed from: t */
    public boolean m7015t() {
        return this.f5748b;
    }
}
