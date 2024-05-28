package androidx.camera.lifecycle;

import android.os.Build;
import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.InterfaceC0437k;
import androidx.camera.core.InterfaceC0465r;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0844k;
import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0853t;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p279w.InterfaceC5078t;
import p318z.C5937e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LifecycleCamera implements InterfaceC0844k, InterfaceC0437k {

    /* renamed from: o */
    private final InterfaceC0845l f2235o;

    /* renamed from: p */
    private final C5937e f2236p;

    /* renamed from: n */
    private final Object f2234n = new Object();

    /* renamed from: q */
    private volatile boolean f2237q = false;

    /* renamed from: r */
    private boolean f2238r = false;

    /* renamed from: s */
    private boolean f2239s = false;

    public LifecycleCamera(InterfaceC0845l interfaceC0845l, C5937e c5937e) {
        this.f2235o = interfaceC0845l;
        this.f2236p = c5937e;
        if (interfaceC0845l.mo583f().mo4890b().m4895b(AbstractC0839f.c.STARTED)) {
            c5937e.m21127j();
        } else {
            c5937e.m21128t();
        }
        interfaceC0845l.mo583f().mo4889a(this);
    }

    /* renamed from: b */
    public InterfaceC0465r m2356b() {
        return this.f2236p.m21124b();
    }

    /* renamed from: g */
    public void m2357g(InterfaceC5078t interfaceC5078t) {
        this.f2236p.m21125g(interfaceC5078t);
    }

    /* renamed from: i */
    public void m2358i(Collection<AbstractC0496y2> collection) throws C5937e.a {
        synchronized (this.f2234n) {
            this.f2236p.m21126i(collection);
        }
    }

    /* renamed from: j */
    public C5937e m2359j() {
        return this.f2236p;
    }

    /* renamed from: m */
    public InterfaceC0845l m2360m() {
        InterfaceC0845l interfaceC0845l;
        synchronized (this.f2234n) {
            interfaceC0845l = this.f2235o;
        }
        return interfaceC0845l;
    }

    /* renamed from: n */
    public List<AbstractC0496y2> m2361n() {
        List<AbstractC0496y2> unmodifiableList;
        synchronized (this.f2234n) {
            unmodifiableList = Collections.unmodifiableList(this.f2236p.m21130x());
        }
        return unmodifiableList;
    }

    /* renamed from: o */
    public boolean m2362o(AbstractC0496y2 abstractC0496y2) {
        boolean contains;
        synchronized (this.f2234n) {
            contains = this.f2236p.m21130x().contains(abstractC0496y2);
        }
        return contains;
    }

    @InterfaceC0853t(AbstractC0839f.b.ON_DESTROY)
    public void onDestroy(InterfaceC0845l interfaceC0845l) {
        synchronized (this.f2234n) {
            C5937e c5937e = this.f2236p;
            c5937e.m21121F(c5937e.m21130x());
        }
    }

    @InterfaceC0853t(AbstractC0839f.b.ON_PAUSE)
    public void onPause(InterfaceC0845l interfaceC0845l) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2236p.m21123a(false);
        }
    }

    @InterfaceC0853t(AbstractC0839f.b.ON_RESUME)
    public void onResume(InterfaceC0845l interfaceC0845l) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2236p.m21123a(true);
        }
    }

    @InterfaceC0853t(AbstractC0839f.b.ON_START)
    public void onStart(InterfaceC0845l interfaceC0845l) {
        synchronized (this.f2234n) {
            if (!this.f2238r && !this.f2239s) {
                this.f2236p.m21127j();
                this.f2237q = true;
            }
        }
    }

    @InterfaceC0853t(AbstractC0839f.b.ON_STOP)
    public void onStop(InterfaceC0845l interfaceC0845l) {
        synchronized (this.f2234n) {
            if (!this.f2238r && !this.f2239s) {
                this.f2236p.m21128t();
                this.f2237q = false;
            }
        }
    }

    /* renamed from: p */
    public void m2363p() {
        synchronized (this.f2234n) {
            if (this.f2238r) {
                return;
            }
            onStop(this.f2235o);
            this.f2238r = true;
        }
    }

    /* renamed from: q */
    public void m2364q() {
        synchronized (this.f2234n) {
            if (this.f2238r) {
                this.f2238r = false;
                if (this.f2235o.mo583f().mo4890b().m4895b(AbstractC0839f.c.STARTED)) {
                    onStart(this.f2235o);
                }
            }
        }
    }
}
