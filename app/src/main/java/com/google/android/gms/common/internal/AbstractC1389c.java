package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1342a;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p295x2.AbstractC5511f;
import p295x2.C5506a;
import p308y2.InterfaceC5606d;
import p308y2.InterfaceC5618j;
import p321z2.C5968b;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractC1389c<T extends IInterface> extends AbstractC1388b<T> implements C5506a.f {

    /* renamed from: F */
    private final C5968b f6342F;

    /* renamed from: G */
    private final Set<Scope> f6343G;

    /* renamed from: H */
    private final Account f6344H;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public AbstractC1389c(Context context, Looper looper, int i10, C5968b c5968b, AbstractC5511f.a aVar, AbstractC5511f.b bVar) {
        this(context, looper, i10, c5968b, (InterfaceC5606d) aVar, (InterfaceC5618j) bVar);
    }

    /* renamed from: l0 */
    private final Set<Scope> m7684l0(Set<Scope> set) {
        Set<Scope> m7687k0 = m7687k0(set);
        Iterator<Scope> it = m7687k0.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return m7687k0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: C */
    protected final Set<Scope> mo7645C() {
        return this.f6343G;
    }

    @Override // p295x2.C5506a.f
    /* renamed from: d */
    public Set<Scope> mo7685d() {
        return mo7672o() ? this.f6343G : Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j0 */
    public final C5968b m7686j0() {
        return this.f6342F;
    }

    /* renamed from: k0 */
    protected Set<Scope> m7687k0(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: u */
    public final Account mo7676u() {
        return this.f6344H;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: w */
    protected final Executor mo7677w() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1389c(Context context, Looper looper, int i10, C5968b c5968b, InterfaceC5606d interfaceC5606d, InterfaceC5618j interfaceC5618j) {
        this(context, looper, AbstractC1390d.m7689b(context), C1342a.m7385o(), i10, c5968b, (InterfaceC5606d) C5984j.m21286j(interfaceC5606d), (InterfaceC5618j) C5984j.m21286j(interfaceC5618j));
    }

    protected AbstractC1389c(Context context, Looper looper, AbstractC1390d abstractC1390d, C1342a c1342a, int i10, C5968b c5968b, InterfaceC5606d interfaceC5606d, InterfaceC5618j interfaceC5618j) {
        super(context, looper, abstractC1390d, c1342a, i10, interfaceC5606d == null ? null : new C1392f(interfaceC5606d), interfaceC5618j == null ? null : new C1393g(interfaceC5618j), c5968b.m21248j());
        this.f6342F = c5968b;
        this.f6344H = c5968b.m21239a();
        this.f6343G = m7684l0(c5968b.m21242d());
    }
}
