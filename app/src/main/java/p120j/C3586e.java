package p120j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0168e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p120j.AbstractC3583b;

/* renamed from: j.e */
/* loaded from: classes.dex */
public class C3586e extends AbstractC3583b implements C0168e.a {

    /* renamed from: p */
    private Context f15155p;

    /* renamed from: q */
    private ActionBarContextView f15156q;

    /* renamed from: r */
    private AbstractC3583b.a f15157r;

    /* renamed from: s */
    private WeakReference<View> f15158s;

    /* renamed from: t */
    private boolean f15159t;

    /* renamed from: u */
    private boolean f15160u;

    /* renamed from: v */
    private C0168e f15161v;

    public C3586e(Context context, ActionBarContextView actionBarContextView, AbstractC3583b.a aVar, boolean z10) {
        this.f15155p = context;
        this.f15156q = actionBarContextView;
        this.f15157r = aVar;
        C0168e m998S = new C0168e(actionBarContextView.getContext()).m998S(1);
        this.f15161v = m998S;
        m998S.mo997R(this);
        this.f15160u = z10;
    }

    @Override // androidx.appcompat.view.menu.C0168e.a
    /* renamed from: a */
    public boolean mo807a(C0168e c0168e, MenuItem menuItem) {
        return this.f15157r.mo826a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0168e.a
    /* renamed from: b */
    public void mo809b(C0168e c0168e) {
        mo911k();
        this.f15156q.showOverflowMenu();
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: c */
    public void mo905c() {
        if (this.f15159t) {
            return;
        }
        this.f15159t = true;
        this.f15156q.sendAccessibilityEvent(32);
        this.f15157r.mo828c(this);
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: d */
    public View mo906d() {
        WeakReference<View> weakReference = this.f15158s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: e */
    public Menu mo907e() {
        return this.f15161v;
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: f */
    public MenuInflater mo908f() {
        return new C3588g(this.f15156q.getContext());
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: g */
    public CharSequence mo909g() {
        return this.f15156q.getSubtitle();
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: i */
    public CharSequence mo910i() {
        return this.f15156q.getTitle();
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: k */
    public void mo911k() {
        this.f15157r.mo829d(this, this.f15161v);
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: l */
    public boolean mo912l() {
        return this.f15156q.isTitleOptional();
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: m */
    public void mo913m(View view) {
        this.f15156q.setCustomView(view);
        this.f15158s = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: n */
    public void mo914n(int i10) {
        mo915o(this.f15155p.getString(i10));
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: o */
    public void mo915o(CharSequence charSequence) {
        this.f15156q.setSubtitle(charSequence);
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: q */
    public void mo916q(int i10) {
        mo917r(this.f15155p.getString(i10));
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: r */
    public void mo917r(CharSequence charSequence) {
        this.f15156q.setTitle(charSequence);
    }

    @Override // p120j.AbstractC3583b
    /* renamed from: s */
    public void mo918s(boolean z10) {
        super.mo918s(z10);
        this.f15156q.setTitleOptional(z10);
    }
}
