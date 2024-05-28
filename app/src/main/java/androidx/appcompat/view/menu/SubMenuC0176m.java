package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0168e;

/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes.dex */
public class SubMenuC0176m extends C0168e implements SubMenu {

    /* renamed from: B */
    private C0168e f961B;

    /* renamed from: C */
    private C0170g f962C;

    public SubMenuC0176m(Context context, C0168e c0168e, C0170g c0170g) {
        super(context);
        this.f961B = c0168e;
        this.f962C = c0170g;
    }

    @Override // androidx.appcompat.view.menu.C0168e
    /* renamed from: D */
    public C0168e mo984D() {
        return this.f961B.mo984D();
    }

    @Override // androidx.appcompat.view.menu.C0168e
    /* renamed from: F */
    public boolean mo986F() {
        return this.f961B.mo986F();
    }

    @Override // androidx.appcompat.view.menu.C0168e
    /* renamed from: G */
    public boolean mo987G() {
        return this.f961B.mo987G();
    }

    @Override // androidx.appcompat.view.menu.C0168e
    /* renamed from: H */
    public boolean mo988H() {
        return this.f961B.mo988H();
    }

    @Override // androidx.appcompat.view.menu.C0168e
    /* renamed from: R */
    public void mo997R(C0168e.a aVar) {
        this.f961B.mo997R(aVar);
    }

    /* renamed from: e0 */
    public Menu m1082e0() {
        return this.f961B;
    }

    @Override // androidx.appcompat.view.menu.C0168e
    /* renamed from: f */
    public boolean mo1013f(C0170g c0170g) {
        return this.f961B.mo1013f(c0170g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f962C;
    }

    @Override // androidx.appcompat.view.menu.C0168e
    /* renamed from: h */
    public boolean mo1014h(C0168e c0168e, MenuItem menuItem) {
        return super.mo1014h(c0168e, menuItem) || this.f961B.mo1014h(c0168e, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0168e
    /* renamed from: k */
    public boolean mo1015k(C0170g c0170g) {
        return this.f961B.mo1015k(c0170g);
    }

    @Override // androidx.appcompat.view.menu.C0168e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f961B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m1001V(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m1003Y(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m1004Z(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f962C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0168e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f961B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.C0168e
    /* renamed from: t */
    public String mo1023t() {
        C0170g c0170g = this.f962C;
        int itemId = c0170g != null ? c0170g.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1023t() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.m1000U(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.m1002X(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f962C.setIcon(i10);
        return this;
    }
}
