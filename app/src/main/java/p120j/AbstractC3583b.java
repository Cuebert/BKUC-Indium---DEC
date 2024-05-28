package p120j;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: j.b */
/* loaded from: classes.dex */
public abstract class AbstractC3583b {

    /* renamed from: n */
    private Object f15148n;

    /* renamed from: o */
    private boolean f15149o;

    /* renamed from: j.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo826a(AbstractC3583b abstractC3583b, MenuItem menuItem);

        /* renamed from: b */
        boolean mo827b(AbstractC3583b abstractC3583b, Menu menu);

        /* renamed from: c */
        void mo828c(AbstractC3583b abstractC3583b);

        /* renamed from: d */
        boolean mo829d(AbstractC3583b abstractC3583b, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo905c();

    /* renamed from: d */
    public abstract View mo906d();

    /* renamed from: e */
    public abstract Menu mo907e();

    /* renamed from: f */
    public abstract MenuInflater mo908f();

    /* renamed from: g */
    public abstract CharSequence mo909g();

    /* renamed from: h */
    public Object m15376h() {
        return this.f15148n;
    }

    /* renamed from: i */
    public abstract CharSequence mo910i();

    /* renamed from: j */
    public boolean m15377j() {
        return this.f15149o;
    }

    /* renamed from: k */
    public abstract void mo911k();

    /* renamed from: l */
    public abstract boolean mo912l();

    /* renamed from: m */
    public abstract void mo913m(View view);

    /* renamed from: n */
    public abstract void mo914n(int i10);

    /* renamed from: o */
    public abstract void mo915o(CharSequence charSequence);

    /* renamed from: p */
    public void m15378p(Object obj) {
        this.f15148n = obj;
    }

    /* renamed from: q */
    public abstract void mo916q(int i10);

    /* renamed from: r */
    public abstract void mo917r(CharSequence charSequence);

    /* renamed from: s */
    public void mo918s(boolean z10) {
        this.f15149o = z10;
    }
}
