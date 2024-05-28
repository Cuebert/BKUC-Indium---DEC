package p133k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0587a;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.AbstractC0664b;
import p195p0.InterfaceMenuItemC4211b;

/* renamed from: k.a */
/* loaded from: classes.dex */
public class C3699a implements InterfaceMenuItemC4211b {

    /* renamed from: a */
    private final int f15436a;

    /* renamed from: b */
    private final int f15437b;

    /* renamed from: c */
    private final int f15438c;

    /* renamed from: d */
    private CharSequence f15439d;

    /* renamed from: e */
    private CharSequence f15440e;

    /* renamed from: f */
    private Intent f15441f;

    /* renamed from: g */
    private char f15442g;

    /* renamed from: i */
    private char f15444i;

    /* renamed from: k */
    private Drawable f15446k;

    /* renamed from: l */
    private Context f15447l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f15448m;

    /* renamed from: n */
    private CharSequence f15449n;

    /* renamed from: o */
    private CharSequence f15450o;

    /* renamed from: h */
    private int f15443h = 4096;

    /* renamed from: j */
    private int f15445j = 4096;

    /* renamed from: p */
    private ColorStateList f15451p = null;

    /* renamed from: q */
    private PorterDuff.Mode f15452q = null;

    /* renamed from: r */
    private boolean f15453r = false;

    /* renamed from: s */
    private boolean f15454s = false;

    /* renamed from: t */
    private int f15455t = 16;

    public C3699a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f15447l = context;
        this.f15436a = i11;
        this.f15437b = i10;
        this.f15438c = i13;
        this.f15439d = charSequence;
    }

    /* renamed from: c */
    private void m15698c() {
        Drawable drawable = this.f15446k;
        if (drawable != null) {
            if (this.f15453r || this.f15454s) {
                Drawable m3263r = C0609a.m3263r(drawable);
                this.f15446k = m3263r;
                Drawable mutate = m3263r.mutate();
                this.f15446k = mutate;
                if (this.f15453r) {
                    C0609a.m3260o(mutate, this.f15451p);
                }
                if (this.f15454s) {
                    C0609a.m3261p(this.f15446k, this.f15452q);
                }
            }
        }
    }

    @Override // p195p0.InterfaceMenuItemC4211b
    /* renamed from: a */
    public InterfaceMenuItemC4211b mo1036a(AbstractC0664b abstractC0664b) {
        throw new UnsupportedOperationException();
    }

    @Override // p195p0.InterfaceMenuItemC4211b
    /* renamed from: b */
    public AbstractC0664b mo1037b() {
        return null;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC4211b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC4211b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC4211b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f15445j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f15444i;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f15449n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f15437b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f15446k;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f15451p;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f15452q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f15441f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f15436a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f15443h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f15442g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f15438c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f15439d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15440e;
        return charSequence != null ? charSequence : this.f15439d;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f15450o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f15455t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f15455t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f15455t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f15455t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f15444i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f15455t = (z10 ? 1 : 0) | (this.f15455t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f15455t = (z10 ? 2 : 0) | (this.f15455t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f15455t = (z10 ? 16 : 0) | (this.f15455t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f15446k = drawable;
        m15698c();
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15451p = colorStateList;
        this.f15453r = true;
        m15698c();
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15452q = mode;
        this.f15454s = true;
        m15698c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f15441f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f15442g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15448m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f15442g = c10;
        this.f15444i = Character.toLowerCase(c11);
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f15439d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15440e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f15455t = (this.f15455t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15444i = Character.toLowerCase(c10);
        this.f15445j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC4211b setContentDescription(CharSequence charSequence) {
        this.f15449n = charSequence;
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f15442g = c10;
        this.f15443h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f15439d = this.f15447l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC4211b setTooltipText(CharSequence charSequence) {
        this.f15450o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f15446k = C0587a.m3031e(this.f15447l, i10);
        m15698c();
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f15442g = c10;
        this.f15443h = KeyEvent.normalizeMetaState(i10);
        this.f15444i = Character.toLowerCase(c11);
        this.f15445j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
