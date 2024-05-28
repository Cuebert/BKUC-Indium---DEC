package p133k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p195p0.InterfaceMenuC4210a;

/* renamed from: k.d */
/* loaded from: classes.dex */
public class MenuC3702d extends AbstractC3700b implements Menu {

    /* renamed from: d */
    private final InterfaceMenuC4210a f15470d;

    public MenuC3702d(Context context, InterfaceMenuC4210a interfaceMenuC4210a) {
        super(context);
        if (interfaceMenuC4210a != null) {
            this.f15470d = interfaceMenuC4210a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m15702c(this.f15470d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f15470d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = m15702c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m15703d(this.f15470d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m15704e();
        this.f15470d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f15470d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return m15702c(this.f15470d.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return m15702c(this.f15470d.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f15470d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f15470d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f15470d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f15470d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        m15705f(i10);
        this.f15470d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m15706g(i10);
        this.f15470d.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f15470d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f15470d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f15470d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f15470d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f15470d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m15702c(this.f15470d.add(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return m15703d(this.f15470d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m15702c(this.f15470d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return m15703d(this.f15470d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m15702c(this.f15470d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return m15703d(this.f15470d.addSubMenu(i10, i11, i12, i13));
    }
}
