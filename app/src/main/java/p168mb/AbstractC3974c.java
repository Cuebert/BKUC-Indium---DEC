package p168mb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p168mb.AbstractC3974c;

/* renamed from: mb.c */
/* loaded from: classes.dex */
public abstract class AbstractC3974c<N extends AbstractC3974c<N>> {

    /* renamed from: n */
    private static final AtomicReferenceFieldUpdater f16359n = AtomicReferenceFieldUpdater.newUpdater(AbstractC3974c.class, Object.class, "_next");

    /* renamed from: o */
    private static final AtomicReferenceFieldUpdater f16360o = AtomicReferenceFieldUpdater.newUpdater(AbstractC3974c.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;
}
