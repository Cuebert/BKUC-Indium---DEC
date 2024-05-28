package p133k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0664b;
import java.lang.reflect.Method;
import p120j.InterfaceC3584c;
import p195p0.InterfaceMenuItemC4211b;

/* renamed from: k.c */
/* loaded from: classes.dex */
public class MenuItemC3701c extends AbstractC3700b implements MenuItem {

    /* renamed from: d */
    private final InterfaceMenuItemC4211b f15459d;

    /* renamed from: e */
    private Method f15460e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k.c$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0664b {

        /* renamed from: a */
        final ActionProvider f15461a;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f15461a = actionProvider;
        }

        @Override // androidx.core.view.AbstractC0664b
        public boolean hasSubMenu() {
            return this.f15461a.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0664b
        public View onCreateActionView() {
            return this.f15461a.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC0664b
        public boolean onPerformDefaultAction() {
            return this.f15461a.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0664b
        public void onPrepareSubMenu(SubMenu subMenu) {
            this.f15461a.onPrepareSubMenu(MenuItemC3701c.this.m15703d(subMenu));
        }
    }

    /* renamed from: k.c$b */
    /* loaded from: classes.dex */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: c */
        private AbstractC0664b.b f15463c;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC0664b
        public boolean isVisible() {
            return this.f15461a.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC0664b.b bVar = this.f15463c;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }

        @Override // androidx.core.view.AbstractC0664b
        public View onCreateActionView(MenuItem menuItem) {
            return this.f15461a.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC0664b
        public boolean overridesItemVisibility() {
            return this.f15461a.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0664b
        public void refreshVisibility() {
            this.f15461a.refreshVisibility();
        }

        @Override // androidx.core.view.AbstractC0664b
        public void setVisibilityListener(AbstractC0664b.b bVar) {
            this.f15463c = bVar;
            this.f15461a.setVisibilityListener(bVar != null ? this : null);
        }
    }

    /* renamed from: k.c$c */
    /* loaded from: classes.dex */
    static class c extends FrameLayout implements InterfaceC3584c {

        /* renamed from: n */
        final CollapsibleActionView f15465n;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f15465n = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m15708a() {
            return (View) this.f15465n;
        }

        @Override // p120j.InterfaceC3584c
        public void onActionViewCollapsed() {
            this.f15465n.onActionViewCollapsed();
        }

        @Override // p120j.InterfaceC3584c
        public void onActionViewExpanded() {
            this.f15465n.onActionViewExpanded();
        }
    }

    /* renamed from: k.c$d */
    /* loaded from: classes.dex */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f15466a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f15466a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f15466a.onMenuItemActionCollapse(MenuItemC3701c.this.m15702c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f15466a.onMenuItemActionExpand(MenuItemC3701c.this.m15702c(menuItem));
        }
    }

    /* renamed from: k.c$e */
    /* loaded from: classes.dex */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f15468a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f15468a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f15468a.onMenuItemClick(MenuItemC3701c.this.m15702c(menuItem));
        }
    }

    public MenuItemC3701c(Context context, InterfaceMenuItemC4211b interfaceMenuItemC4211b) {
        super(context);
        if (interfaceMenuItemC4211b != null) {
            this.f15459d = interfaceMenuItemC4211b;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f15459d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f15459d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0664b mo1037b = this.f15459d.mo1037b();
        if (mo1037b instanceof a) {
            return ((a) mo1037b).f15461a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f15459d.getActionView();
        return actionView instanceof c ? ((c) actionView).m15708a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f15459d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f15459d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f15459d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f15459d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f15459d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f15459d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f15459d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f15459d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f15459d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f15459d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f15459d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f15459d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f15459d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m15703d(this.f15459d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f15459d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f15459d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f15459d.getTooltipText();
    }

    /* renamed from: h */
    public void m15707h(boolean z10) {
        try {
            if (this.f15460e == null) {
                this.f15460e = this.f15459d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f15460e.invoke(this.f15459d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f15459d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f15459d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f15459d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f15459d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f15459d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f15459d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f15456a, actionProvider);
        InterfaceMenuItemC4211b interfaceMenuItemC4211b = this.f15459d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC4211b.mo1036a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f15459d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f15459d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f15459d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f15459d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f15459d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f15459d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f15459d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15459d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15459d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f15459d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f15459d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15459d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15459d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f15459d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f15459d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f15459d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f15459d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15459d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f15459d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f15459d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15459d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f15459d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f15459d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f15459d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f15459d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f15459d.setActionView(i10);
        View actionView = this.f15459d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f15459d.setActionView(new c(actionView));
        }
        return this;
    }
}
