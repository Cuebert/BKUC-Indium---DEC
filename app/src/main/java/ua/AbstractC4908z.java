package ua;

import java.util.Iterator;

/* renamed from: ua.z */
/* loaded from: classes.dex */
public abstract class AbstractC4908z implements Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo14615a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(mo14615a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
