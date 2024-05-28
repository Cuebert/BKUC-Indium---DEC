package p133k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p093h0.C3362g;
import p195p0.InterfaceMenuItemC4211b;
import p195p0.InterfaceSubMenuC4212c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k.b */
/* loaded from: classes.dex */
public abstract class AbstractC3700b {

    /* renamed from: a */
    final Context f15456a;

    /* renamed from: b */
    private C3362g<InterfaceMenuItemC4211b, MenuItem> f15457b;

    /* renamed from: c */
    private C3362g<InterfaceSubMenuC4212c, SubMenu> f15458c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3700b(Context context) {
        this.f15456a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem m15702c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC4211b)) {
            return menuItem;
        }
        InterfaceMenuItemC4211b interfaceMenuItemC4211b = (InterfaceMenuItemC4211b) menuItem;
        if (this.f15457b == null) {
            this.f15457b = new C3362g<>();
        }
        MenuItem menuItem2 = this.f15457b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC3701c menuItemC3701c = new MenuItemC3701c(this.f15456a, interfaceMenuItemC4211b);
        this.f15457b.put(interfaceMenuItemC4211b, menuItemC3701c);
        return menuItemC3701c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu m15703d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC4212c)) {
            return subMenu;
        }
        InterfaceSubMenuC4212c interfaceSubMenuC4212c = (InterfaceSubMenuC4212c) subMenu;
        if (this.f15458c == null) {
            this.f15458c = new C3362g<>();
        }
        SubMenu subMenu2 = this.f15458c.get(interfaceSubMenuC4212c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC3704f subMenuC3704f = new SubMenuC3704f(this.f15456a, interfaceSubMenuC4212c);
        this.f15458c.put(interfaceSubMenuC4212c, subMenuC3704f);
        return subMenuC3704f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m15704e() {
        C3362g<InterfaceMenuItemC4211b, MenuItem> c3362g = this.f15457b;
        if (c3362g != null) {
            c3362g.clear();
        }
        C3362g<InterfaceSubMenuC4212c, SubMenu> c3362g2 = this.f15458c;
        if (c3362g2 != null) {
            c3362g2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m15705f(int i10) {
        if (this.f15457b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f15457b.size()) {
            if (this.f15457b.m14840i(i11).getGroupId() == i10) {
                this.f15457b.m14842k(i11);
                i11--;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m15706g(int i10) {
        if (this.f15457b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f15457b.size(); i11++) {
            if (this.f15457b.m14840i(i11).getItemId() == i10) {
                this.f15457b.m14842k(i11);
                return;
            }
        }
    }
}
