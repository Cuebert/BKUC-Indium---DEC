package ua;

import java.util.AbstractList;

/* renamed from: ua.c */
/* loaded from: classes.dex */
public abstract class AbstractC4877c<E> extends AbstractList<E> {
    /* renamed from: c */
    public abstract int mo19086c();

    /* renamed from: e */
    public abstract E mo19087e(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return mo19087e(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo19086c();
    }
}
