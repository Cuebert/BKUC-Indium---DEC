package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public abstract class AbstractC0130b {

    /* renamed from: a */
    private boolean f438a;

    /* renamed from: b */
    private CopyOnWriteArrayList<InterfaceC0129a> f439b = new CopyOnWriteArrayList<>();

    public AbstractC0130b(boolean z10) {
        this.f438a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m600a(InterfaceC0129a interfaceC0129a) {
        this.f439b.add(interfaceC0129a);
    }

    /* renamed from: b */
    public abstract void mo601b();

    /* renamed from: c */
    public final boolean m602c() {
        return this.f438a;
    }

    /* renamed from: d */
    public final void m603d() {
        Iterator<InterfaceC0129a> it = this.f439b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m604e(InterfaceC0129a interfaceC0129a) {
        this.f439b.remove(interfaceC0129a);
    }

    /* renamed from: f */
    public final void m605f(boolean z10) {
        this.f438a = z10;
    }
}
