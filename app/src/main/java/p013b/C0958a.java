package p013b;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: b.a */
/* loaded from: classes.dex */
public final class C0958a {

    /* renamed from: a */
    private final Set<InterfaceC0959b> f5116a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f5117b;

    /* renamed from: a */
    public void m6136a(InterfaceC0959b interfaceC0959b) {
        if (this.f5117b != null) {
            interfaceC0959b.mo595a(this.f5117b);
        }
        this.f5116a.add(interfaceC0959b);
    }

    /* renamed from: b */
    public void m6137b() {
        this.f5117b = null;
    }

    /* renamed from: c */
    public void m6138c(Context context) {
        this.f5117b = context;
        Iterator<InterfaceC0959b> it = this.f5116a.iterator();
        while (it.hasNext()) {
            it.next().mo595a(context);
        }
    }
}
