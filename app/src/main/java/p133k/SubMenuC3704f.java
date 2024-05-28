package p133k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p195p0.InterfaceSubMenuC4212c;

/* renamed from: k.f */
/* loaded from: classes.dex */
public class SubMenuC3704f extends MenuC3702d implements SubMenu {

    /* renamed from: e */
    private final InterfaceSubMenuC4212c f15471e;

    public SubMenuC3704f(Context context, InterfaceSubMenuC4212c interfaceSubMenuC4212c) {
        super(context, interfaceSubMenuC4212c);
        this.f15471e = interfaceSubMenuC4212c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f15471e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m15702c(this.f15471e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        this.f15471e.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        this.f15471e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f15471e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f15471e.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f15471e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f15471e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f15471e.setIcon(drawable);
        return this;
    }
}
