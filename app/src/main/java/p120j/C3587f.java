package p120j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p093h0.C3362g;
import p120j.AbstractC3583b;
import p133k.MenuC3702d;
import p133k.MenuItemC3701c;
import p195p0.InterfaceMenuC4210a;
import p195p0.InterfaceMenuItemC4211b;

/* renamed from: j.f */
/* loaded from: classes.dex */
public class C3587f extends ActionMode {

    /* renamed from: a */
    final Context f15162a;

    /* renamed from: b */
    final AbstractC3583b f15163b;

    /* renamed from: j.f$a */
    /* loaded from: classes.dex */
    public static class a implements AbstractC3583b.a {

        /* renamed from: a */
        final ActionMode.Callback f15164a;

        /* renamed from: b */
        final Context f15165b;

        /* renamed from: c */
        final ArrayList<C3587f> f15166c = new ArrayList<>();

        /* renamed from: d */
        final C3362g<Menu, Menu> f15167d = new C3362g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f15165b = context;
            this.f15164a = callback;
        }

        /* renamed from: f */
        private Menu m15384f(Menu menu) {
            Menu menu2 = this.f15167d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC3702d menuC3702d = new MenuC3702d(this.f15165b, (InterfaceMenuC4210a) menu);
            this.f15167d.put(menu, menuC3702d);
            return menuC3702d;
        }

        @Override // p120j.AbstractC3583b.a
        /* renamed from: a */
        public boolean mo826a(AbstractC3583b abstractC3583b, MenuItem menuItem) {
            return this.f15164a.onActionItemClicked(m15385e(abstractC3583b), new MenuItemC3701c(this.f15165b, (InterfaceMenuItemC4211b) menuItem));
        }

        @Override // p120j.AbstractC3583b.a
        /* renamed from: b */
        public boolean mo827b(AbstractC3583b abstractC3583b, Menu menu) {
            return this.f15164a.onCreateActionMode(m15385e(abstractC3583b), m15384f(menu));
        }

        @Override // p120j.AbstractC3583b.a
        /* renamed from: c */
        public void mo828c(AbstractC3583b abstractC3583b) {
            this.f15164a.onDestroyActionMode(m15385e(abstractC3583b));
        }

        @Override // p120j.AbstractC3583b.a
        /* renamed from: d */
        public boolean mo829d(AbstractC3583b abstractC3583b, Menu menu) {
            return this.f15164a.onPrepareActionMode(m15385e(abstractC3583b), m15384f(menu));
        }

        /* renamed from: e */
        public ActionMode m15385e(AbstractC3583b abstractC3583b) {
            int size = this.f15166c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C3587f c3587f = this.f15166c.get(i10);
                if (c3587f != null && c3587f.f15163b == abstractC3583b) {
                    return c3587f;
                }
            }
            C3587f c3587f2 = new C3587f(this.f15165b, abstractC3583b);
            this.f15166c.add(c3587f2);
            return c3587f2;
        }
    }

    public C3587f(Context context, AbstractC3583b abstractC3583b) {
        this.f15162a = context;
        this.f15163b = abstractC3583b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f15163b.mo905c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f15163b.mo906d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC3702d(this.f15162a, (InterfaceMenuC4210a) this.f15163b.mo907e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f15163b.mo908f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f15163b.mo909g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f15163b.m15376h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f15163b.mo910i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f15163b.m15377j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f15163b.mo911k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f15163b.mo912l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f15163b.mo913m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f15163b.mo915o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f15163b.m15378p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f15163b.mo917r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f15163b.mo918s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f15163b.mo914n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f15163b.mo916q(i10);
    }
}
