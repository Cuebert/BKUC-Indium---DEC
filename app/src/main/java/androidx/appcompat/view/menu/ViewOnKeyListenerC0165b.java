package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0173j;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.C0670e;
import androidx.core.view.C0690v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p039d.C2951d;
import p039d.C2954g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0165b extends AbstractC0171h implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: O */
    private static final int f807O = C2954g.f12298g;

    /* renamed from: B */
    private View f809B;

    /* renamed from: C */
    View f810C;

    /* renamed from: E */
    private boolean f812E;

    /* renamed from: F */
    private boolean f813F;

    /* renamed from: G */
    private int f814G;

    /* renamed from: H */
    private int f815H;

    /* renamed from: J */
    private boolean f817J;

    /* renamed from: K */
    private InterfaceC0173j.a f818K;

    /* renamed from: L */
    ViewTreeObserver f819L;

    /* renamed from: M */
    private PopupWindow.OnDismissListener f820M;

    /* renamed from: N */
    boolean f821N;

    /* renamed from: o */
    private final Context f822o;

    /* renamed from: p */
    private final int f823p;

    /* renamed from: q */
    private final int f824q;

    /* renamed from: r */
    private final int f825r;

    /* renamed from: s */
    private final boolean f826s;

    /* renamed from: t */
    final Handler f827t;

    /* renamed from: u */
    private final List<C0168e> f828u = new ArrayList();

    /* renamed from: v */
    final List<d> f829v = new ArrayList();

    /* renamed from: w */
    final ViewTreeObserver.OnGlobalLayoutListener f830w = new a();

    /* renamed from: x */
    private final View.OnAttachStateChangeListener f831x = new b();

    /* renamed from: y */
    private final MenuItemHoverListener f832y = new c();

    /* renamed from: z */
    private int f833z = 0;

    /* renamed from: A */
    private int f808A = 0;

    /* renamed from: I */
    private boolean f816I = false;

    /* renamed from: D */
    private int f811D = m948A();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0165b.this.isShowing() || ViewOnKeyListenerC0165b.this.f829v.size() <= 0 || ViewOnKeyListenerC0165b.this.f829v.get(0).f841a.isModal()) {
                return;
            }
            View view = ViewOnKeyListenerC0165b.this.f810C;
            if (view != null && view.isShown()) {
                Iterator<d> it = ViewOnKeyListenerC0165b.this.f829v.iterator();
                while (it.hasNext()) {
                    it.next().f841a.show();
                }
                return;
            }
            ViewOnKeyListenerC0165b.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0165b.this.f819L;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0165b.this.f819L = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0165b viewOnKeyListenerC0165b = ViewOnKeyListenerC0165b.this;
                viewOnKeyListenerC0165b.f819L.removeGlobalOnLayoutListener(viewOnKeyListenerC0165b.f830w);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* loaded from: classes.dex */
    public class c implements MenuItemHoverListener {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ d f837n;

            /* renamed from: o */
            final /* synthetic */ MenuItem f838o;

            /* renamed from: p */
            final /* synthetic */ C0168e f839p;

            a(d dVar, MenuItem menuItem, C0168e c0168e) {
                this.f837n = dVar;
                this.f838o = menuItem;
                this.f839p = c0168e;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f837n;
                if (dVar != null) {
                    ViewOnKeyListenerC0165b.this.f821N = true;
                    dVar.f842b.m1012e(false);
                    ViewOnKeyListenerC0165b.this.f821N = false;
                }
                if (this.f838o.isEnabled() && this.f838o.hasSubMenu()) {
                    this.f839p.m992L(this.f838o, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(C0168e c0168e, MenuItem menuItem) {
            ViewOnKeyListenerC0165b.this.f827t.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0165b.this.f829v.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (c0168e == ViewOnKeyListenerC0165b.this.f829v.get(i10).f842b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            ViewOnKeyListenerC0165b.this.f827t.postAtTime(new a(i11 < ViewOnKeyListenerC0165b.this.f829v.size() ? ViewOnKeyListenerC0165b.this.f829v.get(i11) : null, menuItem, c0168e), c0168e, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(C0168e c0168e, MenuItem menuItem) {
            ViewOnKeyListenerC0165b.this.f827t.removeCallbacksAndMessages(c0168e);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final MenuPopupWindow f841a;

        /* renamed from: b */
        public final C0168e f842b;

        /* renamed from: c */
        public final int f843c;

        public d(MenuPopupWindow menuPopupWindow, C0168e c0168e, int i10) {
            this.f841a = menuPopupWindow;
            this.f842b = c0168e;
            this.f843c = i10;
        }

        /* renamed from: a */
        public ListView m965a() {
            return this.f841a.getListView();
        }
    }

    public ViewOnKeyListenerC0165b(Context context, View view, int i10, int i11, boolean z10) {
        this.f822o = context;
        this.f809B = view;
        this.f824q = i10;
        this.f825r = i11;
        this.f826s = z10;
        Resources resources = context.getResources();
        this.f823p = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2951d.f12187d));
        this.f827t = new Handler();
    }

    /* renamed from: A */
    private int m948A() {
        return C0690v.m3791E(this.f809B) == 1 ? 0 : 1;
    }

    /* renamed from: B */
    private int m949B(int i10) {
        List<d> list = this.f829v;
        ListView m965a = list.get(list.size() - 1).m965a();
        int[] iArr = new int[2];
        m965a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f810C.getWindowVisibleDisplayFrame(rect);
        return this.f811D == 1 ? (iArr[0] + m965a.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    /* renamed from: C */
    private void m950C(C0168e c0168e) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f822o);
        C0167d c0167d = new C0167d(c0168e, from, this.f826s, f807O);
        if (!isShowing() && this.f816I) {
            c0167d.m973d(true);
        } else if (isShowing()) {
            c0167d.m973d(AbstractC0171h.m1061u(c0168e));
        }
        int m1060l = AbstractC0171h.m1060l(c0167d, null, this.f822o, this.f823p);
        MenuPopupWindow m951w = m951w();
        m951w.setAdapter(c0167d);
        m951w.setContentWidth(m1060l);
        m951w.setDropDownGravity(this.f808A);
        if (this.f829v.size() > 0) {
            List<d> list = this.f829v;
            dVar = list.get(list.size() - 1);
            view = m954z(dVar, c0168e);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            m951w.setTouchModal(false);
            m951w.setEnterTransition(null);
            int m949B = m949B(m1060l);
            boolean z10 = m949B == 1;
            this.f811D = m949B;
            if (Build.VERSION.SDK_INT >= 26) {
                m951w.setAnchorView(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f809B.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f808A & 7) == 5) {
                    iArr[0] = iArr[0] + this.f809B.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f808A & 5) == 5) {
                if (!z10) {
                    m1060l = view.getWidth();
                    i12 = i10 - m1060l;
                }
                i12 = i10 + m1060l;
            } else {
                if (z10) {
                    m1060l = view.getWidth();
                    i12 = i10 + m1060l;
                }
                i12 = i10 - m1060l;
            }
            m951w.setHorizontalOffset(i12);
            m951w.setOverlapAnchor(true);
            m951w.setVerticalOffset(i11);
        } else {
            if (this.f812E) {
                m951w.setHorizontalOffset(this.f814G);
            }
            if (this.f813F) {
                m951w.setVerticalOffset(this.f815H);
            }
            m951w.setEpicenterBounds(m1063k());
        }
        this.f829v.add(new d(m951w, c0168e, this.f811D));
        m951w.show();
        ListView listView = m951w.getListView();
        listView.setOnKeyListener(this);
        if (dVar == null && this.f817J && c0168e.m1027x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C2954g.f12305n, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0168e.m1027x());
            listView.addHeaderView(frameLayout, null, false);
            m951w.show();
        }
    }

    /* renamed from: w */
    private MenuPopupWindow m951w() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f822o, null, this.f824q, this.f825r);
        menuPopupWindow.setHoverListener(this.f832y);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.f809B);
        menuPopupWindow.setDropDownGravity(this.f808A);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        return menuPopupWindow;
    }

    /* renamed from: x */
    private int m952x(C0168e c0168e) {
        int size = this.f829v.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (c0168e == this.f829v.get(i10).f842b) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: y */
    private MenuItem m953y(C0168e c0168e, C0168e c0168e2) {
        int size = c0168e.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0168e.getItem(i10);
            if (item.hasSubMenu() && c0168e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: z */
    private View m954z(d dVar, C0168e c0168e) {
        C0167d c0167d;
        int i10;
        int firstVisiblePosition;
        MenuItem m953y = m953y(dVar.f842b, c0168e);
        if (m953y == null) {
            return null;
        }
        ListView m965a = dVar.m965a();
        ListAdapter adapter = m965a.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            c0167d = (C0167d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0167d = (C0167d) adapter;
            i10 = 0;
        }
        int count = c0167d.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            }
            if (m953y == c0167d.getItem(i11)) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - m965a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m965a.getChildCount()) {
            return m965a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: a */
    public void mo932a(C0168e c0168e, boolean z10) {
        int m952x = m952x(c0168e);
        if (m952x < 0) {
            return;
        }
        int i10 = m952x + 1;
        if (i10 < this.f829v.size()) {
            this.f829v.get(i10).f842b.m1012e(false);
        }
        d remove = this.f829v.remove(m952x);
        remove.f842b.m994O(this);
        if (this.f821N) {
            remove.f841a.setExitTransition(null);
            remove.f841a.setAnimationStyle(0);
        }
        remove.f841a.dismiss();
        int size = this.f829v.size();
        if (size > 0) {
            this.f811D = this.f829v.get(size - 1).f843c;
        } else {
            this.f811D = m948A();
        }
        if (size != 0) {
            if (z10) {
                this.f829v.get(0).f842b.m1012e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0173j.a aVar = this.f818K;
        if (aVar != null) {
            aVar.mo824a(c0168e, true);
        }
        ViewTreeObserver viewTreeObserver = this.f819L;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f819L.removeGlobalOnLayoutListener(this.f830w);
            }
            this.f819L = null;
        }
        this.f810C.removeOnAttachStateChangeListener(this.f831x);
        this.f820M.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: c */
    public boolean mo934c(SubMenuC0176m subMenuC0176m) {
        for (d dVar : this.f829v) {
            if (subMenuC0176m == dVar.f842b) {
                dVar.m965a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0176m.hasVisibleItems()) {
            return false;
        }
        mo955e(subMenuC0176m);
        InterfaceC0173j.a aVar = this.f818K;
        if (aVar != null) {
            aVar.mo825b(subMenuC0176m);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: d */
    public void mo935d(boolean z10) {
        Iterator<d> it = this.f829v.iterator();
        while (it.hasNext()) {
            AbstractC0171h.m1062v(it.next().m965a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // p133k.InterfaceC3703e
    public void dismiss() {
        int size = this.f829v.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f829v.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f841a.isShowing()) {
                    dVar.f841a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: e */
    public void mo955e(C0168e c0168e) {
        c0168e.m1008c(this, this.f822o);
        if (isShowing()) {
            m950C(c0168e);
        } else {
            this.f828u.add(c0168e);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: f */
    public boolean mo956f() {
        return false;
    }

    @Override // p133k.InterfaceC3703e
    public ListView getListView() {
        if (this.f829v.isEmpty()) {
            return null;
        }
        return this.f829v.get(r0.size() - 1).m965a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: i */
    public void mo938i(InterfaceC0173j.a aVar) {
        this.f818K = aVar;
    }

    @Override // p133k.InterfaceC3703e
    public boolean isShowing() {
        return this.f829v.size() > 0 && this.f829v.get(0).f841a.isShowing();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: j */
    protected boolean mo957j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: m */
    public void mo958m(View view) {
        if (this.f809B != view) {
            this.f809B = view;
            this.f808A = C0670e.m3641b(this.f833z, C0690v.m3791E(view));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: o */
    public void mo959o(boolean z10) {
        this.f816I = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f829v.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f829v.get(i10);
            if (!dVar.f841a.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f842b.m1012e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: p */
    public void mo960p(int i10) {
        if (this.f833z != i10) {
            this.f833z = i10;
            this.f808A = C0670e.m3641b(i10, C0690v.m3791E(this.f809B));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: q */
    public void mo961q(int i10) {
        this.f812E = true;
        this.f814G = i10;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: r */
    public void mo962r(PopupWindow.OnDismissListener onDismissListener) {
        this.f820M = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: s */
    public void mo963s(boolean z10) {
        this.f817J = z10;
    }

    @Override // p133k.InterfaceC3703e
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator<C0168e> it = this.f828u.iterator();
        while (it.hasNext()) {
            m950C(it.next());
        }
        this.f828u.clear();
        View view = this.f809B;
        this.f810C = view;
        if (view != null) {
            boolean z10 = this.f819L == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f819L = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f830w);
            }
            this.f810C.addOnAttachStateChangeListener(this.f831x);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: t */
    public void mo964t(int i10) {
        this.f813F = true;
        this.f815H = i10;
    }
}
