package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0843j;
import androidx.lifecycle.InterfaceC0845l;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f430a;

    /* renamed from: b */
    final ArrayDeque<AbstractC0130b> f431b = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements InterfaceC0843j, InterfaceC0129a {

        /* renamed from: n */
        private final AbstractC0839f f432n;

        /* renamed from: o */
        private final AbstractC0130b f433o;

        /* renamed from: p */
        private InterfaceC0129a f434p;

        LifecycleOnBackPressedCancellable(AbstractC0839f abstractC0839f, AbstractC0130b abstractC0130b) {
            this.f432n = abstractC0839f;
            this.f433o = abstractC0130b;
            abstractC0839f.mo4889a(this);
        }

        @Override // androidx.activity.InterfaceC0129a
        public void cancel() {
            this.f432n.mo4891c(this);
            this.f433o.m604e(this);
            InterfaceC0129a interfaceC0129a = this.f434p;
            if (interfaceC0129a != null) {
                interfaceC0129a.cancel();
                this.f434p = null;
            }
        }

        @Override // androidx.lifecycle.InterfaceC0843j
        /* renamed from: e */
        public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
            if (bVar == AbstractC0839f.b.ON_START) {
                this.f434p = OnBackPressedDispatcher.this.m598b(this.f433o);
                return;
            }
            if (bVar == AbstractC0839f.b.ON_STOP) {
                InterfaceC0129a interfaceC0129a = this.f434p;
                if (interfaceC0129a != null) {
                    interfaceC0129a.cancel();
                    return;
                }
                return;
            }
            if (bVar == AbstractC0839f.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes.dex */
    public class C0128a implements InterfaceC0129a {

        /* renamed from: n */
        private final AbstractC0130b f436n;

        C0128a(AbstractC0130b abstractC0130b) {
            this.f436n = abstractC0130b;
        }

        @Override // androidx.activity.InterfaceC0129a
        public void cancel() {
            OnBackPressedDispatcher.this.f431b.remove(this.f436n);
            this.f436n.m604e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f430a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void m597a(InterfaceC0845l interfaceC0845l, AbstractC0130b abstractC0130b) {
        AbstractC0839f mo583f = interfaceC0845l.mo583f();
        if (mo583f.mo4890b() == AbstractC0839f.c.DESTROYED) {
            return;
        }
        abstractC0130b.m600a(new LifecycleOnBackPressedCancellable(mo583f, abstractC0130b));
    }

    /* renamed from: b */
    InterfaceC0129a m598b(AbstractC0130b abstractC0130b) {
        this.f431b.add(abstractC0130b);
        C0128a c0128a = new C0128a(abstractC0130b);
        abstractC0130b.m600a(c0128a);
        return c0128a;
    }

    /* renamed from: c */
    public void m599c() {
        Iterator<AbstractC0130b> descendingIterator = this.f431b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC0130b next = descendingIterator.next();
            if (next.m602c()) {
                next.mo601b();
                return;
            }
        }
        Runnable runnable = this.f430a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
