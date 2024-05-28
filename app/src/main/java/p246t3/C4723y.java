package p246t3;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t3.y */
/* loaded from: classes.dex */
public final class C4723y extends AbstractC4624a0 {

    /* renamed from: q */
    private final transient AbstractC4624a0 f18554q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4723y(AbstractC4624a0 abstractC4624a0) {
        this.f18554q = abstractC4624a0;
    }

    /* renamed from: u */
    private final int m18860u(int i10) {
        return (this.f18554q.size() - 1) - i10;
    }

    @Override // p246t3.AbstractC4624a0, p246t3.AbstractC4715w, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f18554q.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4691q.m18803a(i10, this.f18554q.size(), "index");
        return this.f18554q.get(m18860u(i10));
    }

    @Override // p246t3.AbstractC4624a0, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f18554q.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return m18860u(lastIndexOf);
        }
        return -1;
    }

    @Override // p246t3.AbstractC4624a0, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f18554q.indexOf(obj);
        if (indexOf >= 0) {
            return m18860u(indexOf);
        }
        return -1;
    }

    @Override // p246t3.AbstractC4624a0
    /* renamed from: m */
    public final AbstractC4624a0 mo18721m() {
        return this.f18554q;
    }

    @Override // p246t3.AbstractC4624a0
    /* renamed from: o */
    public final AbstractC4624a0 subList(int i10, int i11) {
        C4691q.m18807e(i10, i11, this.f18554q.size());
        AbstractC4624a0 abstractC4624a0 = this.f18554q;
        return abstractC4624a0.subList(abstractC4624a0.size() - i11, this.f18554q.size() - i10).mo18721m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18554q.size();
    }

    @Override // p246t3.AbstractC4624a0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
