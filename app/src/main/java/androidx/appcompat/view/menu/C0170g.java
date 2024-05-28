package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC0174k;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.AbstractC0664b;
import com.appsflyer.oaid.BuildConfig;
import p039d.C2955h;
import p066f.C3121a;
import p195p0.InterfaceMenuItemC4211b;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public final class C0170g implements InterfaceMenuItemC4211b {

    /* renamed from: A */
    private View f892A;

    /* renamed from: B */
    private AbstractC0664b f893B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f894C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f896E;

    /* renamed from: a */
    private final int f897a;

    /* renamed from: b */
    private final int f898b;

    /* renamed from: c */
    private final int f899c;

    /* renamed from: d */
    private final int f900d;

    /* renamed from: e */
    private CharSequence f901e;

    /* renamed from: f */
    private CharSequence f902f;

    /* renamed from: g */
    private Intent f903g;

    /* renamed from: h */
    private char f904h;

    /* renamed from: j */
    private char f906j;

    /* renamed from: l */
    private Drawable f908l;

    /* renamed from: n */
    C0168e f910n;

    /* renamed from: o */
    private SubMenuC0176m f911o;

    /* renamed from: p */
    private Runnable f912p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f913q;

    /* renamed from: r */
    private CharSequence f914r;

    /* renamed from: s */
    private CharSequence f915s;

    /* renamed from: z */
    private int f922z;

    /* renamed from: i */
    private int f905i = 4096;

    /* renamed from: k */
    private int f907k = 4096;

    /* renamed from: m */
    private int f909m = 0;

    /* renamed from: t */
    private ColorStateList f916t = null;

    /* renamed from: u */
    private PorterDuff.Mode f917u = null;

    /* renamed from: v */
    private boolean f918v = false;

    /* renamed from: w */
    private boolean f919w = false;

    /* renamed from: x */
    private boolean f920x = false;

    /* renamed from: y */
    private int f921y = 16;

    /* renamed from: D */
    private boolean f895D = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes.dex */
    class a implements AbstractC0664b.b {
        a() {
        }

        @Override // androidx.core.view.AbstractC0664b.b
        public void onActionProviderVisibilityChanged(boolean z10) {
            C0170g c0170g = C0170g.this;
            c0170g.f910n.m990J(c0170g);
        }
    }

    public C0170g(C0168e c0168e, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f910n = c0168e;
        this.f897a = i11;
        this.f898b = i10;
        this.f899c = i12;
        this.f900d = i13;
        this.f901e = charSequence;
        this.f922z = i14;
    }

    /* renamed from: d */
    private static void m1032d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m1033e(Drawable drawable) {
        if (drawable != null && this.f920x && (this.f918v || this.f919w)) {
            drawable = C0609a.m3263r(drawable).mutate();
            if (this.f918v) {
                C0609a.m3260o(drawable, this.f916t);
            }
            if (this.f919w) {
                C0609a.m3261p(drawable, this.f917u);
            }
            this.f920x = false;
        }
        return drawable;
    }

    /* renamed from: A */
    public boolean m1034A() {
        return this.f910n.mo988H() && m1040g() != 0;
    }

    /* renamed from: B */
    public boolean m1035B() {
        return (this.f922z & 4) == 4;
    }

    @Override // p195p0.InterfaceMenuItemC4211b
    /* renamed from: a */
    public InterfaceMenuItemC4211b mo1036a(AbstractC0664b abstractC0664b) {
        AbstractC0664b abstractC0664b2 = this.f893B;
        if (abstractC0664b2 != null) {
            abstractC0664b2.reset();
        }
        this.f892A = null;
        this.f893B = abstractC0664b;
        this.f910n.m991K(true);
        AbstractC0664b abstractC0664b3 = this.f893B;
        if (abstractC0664b3 != null) {
            abstractC0664b3.setVisibilityListener(new a());
        }
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b
    /* renamed from: b */
    public AbstractC0664b mo1037b() {
        return this.f893B;
    }

    /* renamed from: c */
    public void m1038c() {
        this.f910n.m989I(this);
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f922z & 8) == 0) {
            return false;
        }
        if (this.f892A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f894C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f910n.mo1013f(this);
        }
        return false;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m1043j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f894C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f910n.mo1015k(this);
        }
        return false;
    }

    /* renamed from: f */
    public int m1039f() {
        return this.f900d;
    }

    /* renamed from: g */
    public char m1040g() {
        return this.f910n.mo987G() ? this.f906j : this.f904h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public View getActionView() {
        View view = this.f892A;
        if (view != null) {
            return view;
        }
        AbstractC0664b abstractC0664b = this.f893B;
        if (abstractC0664b == null) {
            return null;
        }
        View onCreateActionView = abstractC0664b.onCreateActionView(this);
        this.f892A = onCreateActionView;
        return onCreateActionView;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f907k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f906j;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f914r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f898b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f908l;
        if (drawable != null) {
            return m1033e(drawable);
        }
        if (this.f909m == 0) {
            return null;
        }
        Drawable m13770d = C3121a.m13770d(this.f910n.m1024u(), this.f909m);
        this.f909m = 0;
        this.f908l = m13770d;
        return m1033e(m13770d);
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f916t;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f917u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f903g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f897a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f896E;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f905i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f904h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f899c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f911o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f901e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f902f;
        return charSequence != null ? charSequence : this.f901e;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f915s;
    }

    /* renamed from: h */
    public String m1041h() {
        char m1040g = m1040g();
        if (m1040g == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources resources = this.f910n.m1024u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f910n.m1024u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C2955h.f12328o));
        }
        int i10 = this.f910n.mo987G() ? this.f907k : this.f905i;
        m1032d(sb2, i10, 65536, resources.getString(C2955h.f12324k));
        m1032d(sb2, i10, 4096, resources.getString(C2955h.f12320g));
        m1032d(sb2, i10, 2, resources.getString(C2955h.f12319f));
        m1032d(sb2, i10, 1, resources.getString(C2955h.f12325l));
        m1032d(sb2, i10, 4, resources.getString(C2955h.f12327n));
        m1032d(sb2, i10, 8, resources.getString(C2955h.f12323j));
        if (m1040g == '\b') {
            sb2.append(resources.getString(C2955h.f12321h));
        } else if (m1040g == '\n') {
            sb2.append(resources.getString(C2955h.f12322i));
        } else if (m1040g != ' ') {
            sb2.append(m1040g);
        } else {
            sb2.append(resources.getString(C2955h.f12326m));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f911o != null;
    }

    /* renamed from: i */
    public CharSequence m1042i(InterfaceC0174k.a aVar) {
        if (aVar != null && aVar.mo922a()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f895D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f921y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f921y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f921y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0664b abstractC0664b = this.f893B;
        return (abstractC0664b == null || !abstractC0664b.overridesItemVisibility()) ? (this.f921y & 8) == 0 : (this.f921y & 8) == 0 && this.f893B.isVisible();
    }

    /* renamed from: j */
    public boolean m1043j() {
        AbstractC0664b abstractC0664b;
        if ((this.f922z & 8) == 0) {
            return false;
        }
        if (this.f892A == null && (abstractC0664b = this.f893B) != null) {
            this.f892A = abstractC0664b.onCreateActionView(this);
        }
        return this.f892A != null;
    }

    /* renamed from: k */
    public boolean m1044k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f913q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0168e c0168e = this.f910n;
        if (c0168e.mo1014h(c0168e, this)) {
            return true;
        }
        Runnable runnable = this.f912p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f903g != null) {
            try {
                this.f910n.m1024u().startActivity(this.f903g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC0664b abstractC0664b = this.f893B;
        return abstractC0664b != null && abstractC0664b.onPerformDefaultAction();
    }

    /* renamed from: l */
    public boolean m1045l() {
        return (this.f921y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m1046m() {
        return (this.f921y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m1047n() {
        return (this.f922z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m1048o() {
        return (this.f922z & 2) == 2;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    /* renamed from: p */
    public InterfaceMenuItemC4211b setActionView(int i10) {
        Context m1024u = this.f910n.m1024u();
        setActionView(LayoutInflater.from(m1024u).inflate(i10, (ViewGroup) new LinearLayout(m1024u), false));
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    /* renamed from: q */
    public InterfaceMenuItemC4211b setActionView(View view) {
        int i10;
        this.f892A = view;
        this.f893B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f897a) > 0) {
            view.setId(i10);
        }
        this.f910n.m989I(this);
        return this;
    }

    /* renamed from: r */
    public void m1051r(boolean z10) {
        this.f895D = z10;
        this.f910n.m991K(false);
    }

    /* renamed from: s */
    public void m1052s(boolean z10) {
        int i10 = this.f921y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f921y = i11;
        if (i10 != i11) {
            this.f910n.m991K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f906j == c10) {
            return this;
        }
        this.f906j = Character.toLowerCase(c10);
        this.f910n.m991K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f921y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f921y = i11;
        if (i10 != i11) {
            this.f910n.m991K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f921y & 4) != 0) {
            this.f910n.m999T(this);
        } else {
            m1052s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f921y |= 16;
        } else {
            this.f921y &= -17;
        }
        this.f910n.m991K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f909m = 0;
        this.f908l = drawable;
        this.f920x = true;
        this.f910n.m991K(false);
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f916t = colorStateList;
        this.f918v = true;
        this.f920x = true;
        this.f910n.m991K(false);
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f917u = mode;
        this.f919w = true;
        this.f920x = true;
        this.f910n.m991K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f903g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f904h == c10) {
            return this;
        }
        this.f904h = c10;
        this.f910n.m991K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f894C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f913q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f904h = c10;
        this.f906j = Character.toLowerCase(c11);
        this.f910n.m991K(false);
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f922z = i10;
        this.f910n.m989I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f901e = charSequence;
        this.f910n.m991K(false);
        SubMenuC0176m subMenuC0176m = this.f911o;
        if (subMenuC0176m != null) {
            subMenuC0176m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f902f = charSequence;
        this.f910n.m991K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (m1058y(z10)) {
            this.f910n.m990J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m1053t(boolean z10) {
        this.f921y = (z10 ? 4 : 0) | (this.f921y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f901e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m1054u(boolean z10) {
        if (z10) {
            this.f921y |= 32;
        } else {
            this.f921y &= -33;
        }
    }

    /* renamed from: v */
    public void m1055v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f896E = contextMenuInfo;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    /* renamed from: w */
    public InterfaceMenuItemC4211b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    /* renamed from: x */
    public void m1057x(SubMenuC0176m subMenuC0176m) {
        this.f911o = subMenuC0176m;
        subMenuC0176m.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    public boolean m1058y(boolean z10) {
        int i10 = this.f921y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f921y = i11;
        return i10 != i11;
    }

    /* renamed from: z */
    public boolean m1059z() {
        return this.f910n.m982A();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC4211b setContentDescription(CharSequence charSequence) {
        this.f914r = charSequence;
        this.f910n.m991K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC4211b setTooltipText(CharSequence charSequence) {
        this.f915s = charSequence;
        this.f910n.m991K(false);
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f906j == c10 && this.f907k == i10) {
            return this;
        }
        this.f906j = Character.toLowerCase(c10);
        this.f907k = KeyEvent.normalizeMetaState(i10);
        this.f910n.m991K(false);
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f904h == c10 && this.f905i == i10) {
            return this;
        }
        this.f904h = c10;
        this.f905i = KeyEvent.normalizeMetaState(i10);
        this.f910n.m991K(false);
        return this;
    }

    @Override // p195p0.InterfaceMenuItemC4211b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f904h = c10;
        this.f905i = KeyEvent.normalizeMetaState(i10);
        this.f906j = Character.toLowerCase(c11);
        this.f907k = KeyEvent.normalizeMetaState(i11);
        this.f910n.m991K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f908l = null;
        this.f909m = i10;
        this.f920x = true;
        this.f910n.m991K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f910n.m1024u().getString(i10));
    }
}
