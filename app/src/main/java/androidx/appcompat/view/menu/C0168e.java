package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0587a;
import androidx.core.view.AbstractC0664b;
import androidx.core.view.C0692x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p195p0.InterfaceMenuC4210a;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C0168e implements InterfaceMenuC4210a {

    /* renamed from: A */
    private static final int[] f861A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f862a;

    /* renamed from: b */
    private final Resources f863b;

    /* renamed from: c */
    private boolean f864c;

    /* renamed from: d */
    private boolean f865d;

    /* renamed from: e */
    private a f866e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f874m;

    /* renamed from: n */
    CharSequence f875n;

    /* renamed from: o */
    Drawable f876o;

    /* renamed from: p */
    View f877p;

    /* renamed from: x */
    private C0170g f885x;

    /* renamed from: z */
    private boolean f887z;

    /* renamed from: l */
    private int f873l = 0;

    /* renamed from: q */
    private boolean f878q = false;

    /* renamed from: r */
    private boolean f879r = false;

    /* renamed from: s */
    private boolean f880s = false;

    /* renamed from: t */
    private boolean f881t = false;

    /* renamed from: u */
    private boolean f882u = false;

    /* renamed from: v */
    private ArrayList<C0170g> f883v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0173j>> f884w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f886y = false;

    /* renamed from: f */
    private ArrayList<C0170g> f867f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C0170g> f868g = new ArrayList<>();

    /* renamed from: h */
    private boolean f869h = true;

    /* renamed from: i */
    private ArrayList<C0170g> f870i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0170g> f871j = new ArrayList<>();

    /* renamed from: k */
    private boolean f872k = true;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo807a(C0168e c0168e, MenuItem menuItem);

        /* renamed from: b */
        void mo809b(C0168e c0168e);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes.dex */
    public interface b {
        boolean invokeItem(C0170g c0170g);
    }

    public C0168e(Context context) {
        this.f862a = context;
        this.f863b = context.getResources();
        m977b0(true);
    }

    /* renamed from: B */
    private static int m974B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f861A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m975N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f867f.size()) {
            return;
        }
        this.f867f.remove(i10);
        if (z10) {
            m991K(true);
        }
    }

    /* renamed from: W */
    private void m976W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources m983C = m983C();
        if (view != null) {
            this.f877p = view;
            this.f875n = null;
            this.f876o = null;
        } else {
            if (i10 > 0) {
                this.f875n = m983C.getText(i10);
            } else if (charSequence != null) {
                this.f875n = charSequence;
            }
            if (i11 > 0) {
                this.f876o = C0587a.m3031e(m1024u(), i11);
            } else if (drawable != null) {
                this.f876o = drawable;
            }
            this.f877p = null;
        }
        m991K(false);
    }

    /* renamed from: b0 */
    private void m977b0(boolean z10) {
        this.f865d = z10 && this.f863b.getConfiguration().keyboard != 1 && C0692x.m4018e(ViewConfiguration.get(this.f862a), this.f862a);
    }

    /* renamed from: g */
    private C0170g m978g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new C0170g(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* renamed from: i */
    private void m979i(boolean z10) {
        if (this.f884w.isEmpty()) {
            return;
        }
        m1011d0();
        Iterator<WeakReference<InterfaceC0173j>> it = this.f884w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0173j> next = it.next();
            InterfaceC0173j interfaceC0173j = next.get();
            if (interfaceC0173j == null) {
                this.f884w.remove(next);
            } else {
                interfaceC0173j.mo935d(z10);
            }
        }
        m1009c0();
    }

    /* renamed from: j */
    private boolean m980j(SubMenuC0176m subMenuC0176m, InterfaceC0173j interfaceC0173j) {
        if (this.f884w.isEmpty()) {
            return false;
        }
        boolean mo934c = interfaceC0173j != null ? interfaceC0173j.mo934c(subMenuC0176m) : false;
        Iterator<WeakReference<InterfaceC0173j>> it = this.f884w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0173j> next = it.next();
            InterfaceC0173j interfaceC0173j2 = next.get();
            if (interfaceC0173j2 == null) {
                this.f884w.remove(next);
            } else if (!mo934c) {
                mo934c = interfaceC0173j2.mo934c(subMenuC0176m);
            }
        }
        return mo934c;
    }

    /* renamed from: n */
    private static int m981n(ArrayList<C0170g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m1039f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public boolean m982A() {
        return this.f881t;
    }

    /* renamed from: C */
    Resources m983C() {
        return this.f863b;
    }

    /* renamed from: D */
    public C0168e mo984D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0170g> m985E() {
        if (!this.f869h) {
            return this.f868g;
        }
        this.f868g.clear();
        int size = this.f867f.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0170g c0170g = this.f867f.get(i10);
            if (c0170g.isVisible()) {
                this.f868g.add(c0170g);
            }
        }
        this.f869h = false;
        this.f872k = true;
        return this.f868g;
    }

    /* renamed from: F */
    public boolean mo986F() {
        return this.f886y;
    }

    /* renamed from: G */
    public boolean mo987G() {
        return this.f864c;
    }

    /* renamed from: H */
    public boolean mo988H() {
        return this.f865d;
    }

    /* renamed from: I */
    public void m989I(C0170g c0170g) {
        this.f872k = true;
        m991K(true);
    }

    /* renamed from: J */
    public void m990J(C0170g c0170g) {
        this.f869h = true;
        m991K(true);
    }

    /* renamed from: K */
    public void m991K(boolean z10) {
        if (!this.f878q) {
            if (z10) {
                this.f869h = true;
                this.f872k = true;
            }
            m979i(z10);
            return;
        }
        this.f879r = true;
        if (z10) {
            this.f880s = true;
        }
    }

    /* renamed from: L */
    public boolean m992L(MenuItem menuItem, int i10) {
        return m993M(menuItem, null, i10);
    }

    /* renamed from: M */
    public boolean m993M(MenuItem menuItem, InterfaceC0173j interfaceC0173j, int i10) {
        C0170g c0170g = (C0170g) menuItem;
        if (c0170g == null || !c0170g.isEnabled()) {
            return false;
        }
        boolean m1044k = c0170g.m1044k();
        AbstractC0664b mo1037b = c0170g.mo1037b();
        boolean z10 = mo1037b != null && mo1037b.hasSubMenu();
        if (c0170g.m1043j()) {
            m1044k |= c0170g.expandActionView();
            if (m1044k) {
                m1012e(true);
            }
        } else if (c0170g.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                m1012e(false);
            }
            if (!c0170g.hasSubMenu()) {
                c0170g.m1057x(new SubMenuC0176m(m1024u(), this, c0170g));
            }
            SubMenuC0176m subMenuC0176m = (SubMenuC0176m) c0170g.getSubMenu();
            if (z10) {
                mo1037b.onPrepareSubMenu(subMenuC0176m);
            }
            m1044k |= m980j(subMenuC0176m, interfaceC0173j);
            if (!m1044k) {
                m1012e(true);
            }
        } else if ((i10 & 1) == 0) {
            m1012e(true);
        }
        return m1044k;
    }

    /* renamed from: O */
    public void m994O(InterfaceC0173j interfaceC0173j) {
        Iterator<WeakReference<InterfaceC0173j>> it = this.f884w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0173j> next = it.next();
            InterfaceC0173j interfaceC0173j2 = next.get();
            if (interfaceC0173j2 == null || interfaceC0173j2 == interfaceC0173j) {
                this.f884w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void m995P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1023t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0176m) item.getSubMenu()).m995P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: Q */
    public void m996Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0176m) item.getSubMenu()).m996Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1023t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo997R(a aVar) {
        this.f866e = aVar;
    }

    /* renamed from: S */
    public C0168e m998S(int i10) {
        this.f873l = i10;
        return this;
    }

    /* renamed from: T */
    public void m999T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f867f.size();
        m1011d0();
        for (int i10 = 0; i10 < size; i10++) {
            C0170g c0170g = this.f867f.get(i10);
            if (c0170g.getGroupId() == groupId && c0170g.m1046m() && c0170g.isCheckable()) {
                c0170g.m1052s(c0170g == menuItem);
            }
        }
        m1009c0();
    }

    /* renamed from: U */
    public C0168e m1000U(int i10) {
        m976W(0, null, i10, null, null);
        return this;
    }

    /* renamed from: V */
    public C0168e m1001V(Drawable drawable) {
        m976W(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: X */
    public C0168e m1002X(int i10) {
        m976W(i10, null, 0, null, null);
        return this;
    }

    /* renamed from: Y */
    public C0168e m1003Y(CharSequence charSequence) {
        m976W(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: Z */
    public C0168e m1004Z(View view) {
        m976W(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    protected MenuItem m1005a(int i10, int i11, int i12, CharSequence charSequence) {
        int m974B = m974B(i12);
        C0170g m978g = m978g(i10, i11, i12, m974B, charSequence, this.f873l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f874m;
        if (contextMenuInfo != null) {
            m978g.m1055v(contextMenuInfo);
        }
        ArrayList<C0170g> arrayList = this.f867f;
        arrayList.add(m981n(arrayList, m974B), m978g);
        m991K(true);
        return m978g;
    }

    /* renamed from: a0 */
    public void m1006a0(boolean z10) {
        this.f887z = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m1005a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f862a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m1007b(InterfaceC0173j interfaceC0173j) {
        m1008c(interfaceC0173j, this.f862a);
    }

    /* renamed from: c */
    public void m1008c(InterfaceC0173j interfaceC0173j, Context context) {
        this.f884w.add(new WeakReference<>(interfaceC0173j));
        interfaceC0173j.mo933b(context, this);
        this.f872k = true;
    }

    /* renamed from: c0 */
    public void m1009c0() {
        this.f878q = false;
        if (this.f879r) {
            this.f879r = false;
            m991K(this.f880s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C0170g c0170g = this.f885x;
        if (c0170g != null) {
            mo1013f(c0170g);
        }
        this.f867f.clear();
        m991K(true);
    }

    public void clearHeader() {
        this.f876o = null;
        this.f875n = null;
        this.f877p = null;
        m991K(false);
    }

    @Override // android.view.Menu
    public void close() {
        m1012e(true);
    }

    /* renamed from: d */
    public void m1010d() {
        a aVar = this.f866e;
        if (aVar != null) {
            aVar.mo809b(this);
        }
    }

    /* renamed from: d0 */
    public void m1011d0() {
        if (this.f878q) {
            return;
        }
        this.f878q = true;
        this.f879r = false;
        this.f880s = false;
    }

    /* renamed from: e */
    public final void m1012e(boolean z10) {
        if (this.f882u) {
            return;
        }
        this.f882u = true;
        Iterator<WeakReference<InterfaceC0173j>> it = this.f884w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0173j> next = it.next();
            InterfaceC0173j interfaceC0173j = next.get();
            if (interfaceC0173j == null) {
                this.f884w.remove(next);
            } else {
                interfaceC0173j.mo932a(this, z10);
            }
        }
        this.f882u = false;
    }

    /* renamed from: f */
    public boolean mo1013f(C0170g c0170g) {
        boolean z10 = false;
        if (!this.f884w.isEmpty() && this.f885x == c0170g) {
            m1011d0();
            Iterator<WeakReference<InterfaceC0173j>> it = this.f884w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0173j> next = it.next();
                InterfaceC0173j interfaceC0173j = next.get();
                if (interfaceC0173j == null) {
                    this.f884w.remove(next);
                } else {
                    z10 = interfaceC0173j.mo936g(this, c0170g);
                    if (z10) {
                        break;
                    }
                }
            }
            m1009c0();
            if (z10) {
                this.f885x = null;
            }
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            C0170g c0170g = this.f867f.get(i11);
            if (c0170g.getItemId() == i10) {
                return c0170g;
            }
            if (c0170g.hasSubMenu() && (findItem = c0170g.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f867f.get(i10);
    }

    /* renamed from: h */
    public boolean mo1014h(C0168e c0168e, MenuItem menuItem) {
        a aVar = this.f866e;
        return aVar != null && aVar.mo807a(c0168e, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f887z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f867f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return m1019p(i10, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo1015k(C0170g c0170g) {
        boolean z10 = false;
        if (this.f884w.isEmpty()) {
            return false;
        }
        m1011d0();
        Iterator<WeakReference<InterfaceC0173j>> it = this.f884w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0173j> next = it.next();
            InterfaceC0173j interfaceC0173j = next.get();
            if (interfaceC0173j == null) {
                this.f884w.remove(next);
            } else {
                z10 = interfaceC0173j.mo937h(this, c0170g);
                if (z10) {
                    break;
                }
            }
        }
        m1009c0();
        if (z10) {
            this.f885x = c0170g;
        }
        return z10;
    }

    /* renamed from: l */
    public int m1016l(int i10) {
        return m1017m(i10, 0);
    }

    /* renamed from: m */
    public int m1017m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f867f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: o */
    public int m1018o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f867f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: p */
    C0170g m1019p(int i10, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<C0170g> arrayList = this.f883v;
        arrayList.clear();
        m1020q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo987G = mo987G();
        for (int i11 = 0; i11 < size; i11++) {
            C0170g c0170g = arrayList.get(i11);
            if (mo987G) {
                numericShortcut = c0170g.getAlphabeticShortcut();
            } else {
                numericShortcut = c0170g.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (mo987G && numericShortcut == '\b' && i10 == 67))) {
                return c0170g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return m992L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        C0170g m1019p = m1019p(i10, keyEvent);
        boolean m992L = m1019p != null ? m992L(m1019p, i11) : false;
        if ((i11 & 2) != 0) {
            m1012e(true);
        }
        return m992L;
    }

    /* renamed from: q */
    void m1020q(List<C0170g> list, int i10, KeyEvent keyEvent) {
        boolean mo987G = mo987G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f867f.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0170g c0170g = this.f867f.get(i11);
                if (c0170g.hasSubMenu()) {
                    ((C0168e) c0170g.getSubMenu()).m1020q(list, i10, keyEvent);
                }
                char alphabeticShortcut = mo987G ? c0170g.getAlphabeticShortcut() : c0170g.getNumericShortcut();
                if (((modifiers & 69647) == ((mo987G ? c0170g.getAlphabeticModifiers() : c0170g.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo987G && alphabeticShortcut == '\b' && i10 == 67)) && c0170g.isEnabled()) {
                        list.add(c0170g);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void m1021r() {
        ArrayList<C0170g> m985E = m985E();
        if (this.f872k) {
            Iterator<WeakReference<InterfaceC0173j>> it = this.f884w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0173j> next = it.next();
                InterfaceC0173j interfaceC0173j = next.get();
                if (interfaceC0173j == null) {
                    this.f884w.remove(next);
                } else {
                    z10 |= interfaceC0173j.mo956f();
                }
            }
            if (z10) {
                this.f870i.clear();
                this.f871j.clear();
                int size = m985E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C0170g c0170g = m985E.get(i10);
                    if (c0170g.m1045l()) {
                        this.f870i.add(c0170g);
                    } else {
                        this.f871j.add(c0170g);
                    }
                }
            } else {
                this.f870i.clear();
                this.f871j.clear();
                this.f871j.addAll(m985E());
            }
            this.f872k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int m1016l = m1016l(i10);
        if (m1016l >= 0) {
            int size = this.f867f.size() - m1016l;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f867f.get(m1016l).getGroupId() != i10) {
                    break;
                }
                m975N(m1016l, false);
                i11 = i12;
            }
            m991K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m975N(m1018o(i10), true);
    }

    /* renamed from: s */
    public ArrayList<C0170g> m1022s() {
        m1021r();
        return this.f870i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f867f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0170g c0170g = this.f867f.get(i11);
            if (c0170g.getGroupId() == i10) {
                c0170g.m1053t(z11);
                c0170g.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f886y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f867f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0170g c0170g = this.f867f.get(i11);
            if (c0170g.getGroupId() == i10) {
                c0170g.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f867f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C0170g c0170g = this.f867f.get(i11);
            if (c0170g.getGroupId() == i10 && c0170g.m1058y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            m991K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f864c = z10;
        m991K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f867f.size();
    }

    /* renamed from: t */
    public String mo1023t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context m1024u() {
        return this.f862a;
    }

    /* renamed from: v */
    public C0170g m1025v() {
        return this.f885x;
    }

    /* renamed from: w */
    public Drawable m1026w() {
        return this.f876o;
    }

    /* renamed from: x */
    public CharSequence m1027x() {
        return this.f875n;
    }

    /* renamed from: y */
    public View m1028y() {
        return this.f877p;
    }

    /* renamed from: z */
    public ArrayList<C0170g> m1029z() {
        m1021r();
        return this.f871j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m1005a(0, 0, 0, this.f863b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f863b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m1005a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        C0170g c0170g = (C0170g) m1005a(i10, i11, i12, charSequence);
        SubMenuC0176m subMenuC0176m = new SubMenuC0176m(this.f862a, this, c0170g);
        c0170g.m1057x(subMenuC0176m);
        return subMenuC0176m;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m1005a(i10, i11, i12, this.f863b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f863b.getString(i13));
    }
}
