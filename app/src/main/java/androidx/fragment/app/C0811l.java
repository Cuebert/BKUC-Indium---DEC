package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public class C0811l {

    /* renamed from: a */
    private final CopyOnWriteArrayList<a> f4061a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final FragmentManager f4062b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.l$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final boolean f4063a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0811l(FragmentManager fragmentManager) {
        this.f4062b = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4662a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4662a(fragment, bundle, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4663b(Fragment fragment, boolean z10) {
        this.f4062b.m4519v0().m4659g();
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4663b(fragment, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m4664c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4664c(fragment, bundle, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m4665d(Fragment fragment, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4665d(fragment, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m4666e(Fragment fragment, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4666e(fragment, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m4667f(Fragment fragment, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4667f(fragment, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m4668g(Fragment fragment, boolean z10) {
        this.f4062b.m4519v0().m4659g();
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4668g(fragment, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m4669h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4669h(fragment, bundle, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m4670i(Fragment fragment, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4670i(fragment, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m4671j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4671j(fragment, bundle, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m4672k(Fragment fragment, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4672k(fragment, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m4673l(Fragment fragment, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4673l(fragment, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m4674m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4674m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m4675n(Fragment fragment, boolean z10) {
        Fragment m4524y0 = this.f4062b.m4524y0();
        if (m4524y0 != null) {
            m4524y0.m4289K().m4522x0().m4675n(fragment, true);
        }
        Iterator<a> it = this.f4061a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4063a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }
}
