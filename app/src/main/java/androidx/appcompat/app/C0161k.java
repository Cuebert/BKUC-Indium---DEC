package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.AbstractC0151a;
import androidx.appcompat.view.menu.C0168e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0665b0;
import androidx.core.view.C0669d0;
import androidx.core.view.C0690v;
import androidx.core.view.InterfaceC0667c0;
import androidx.core.view.InterfaceC0671e0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p039d.C2948a;
import p039d.C2953f;
import p039d.C2957j;
import p120j.AbstractC3583b;
import p120j.C3582a;
import p120j.C3588g;
import p120j.C3589h;

/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes.dex */
public class C0161k extends AbstractC0151a implements ActionBarOverlayLayout.ActionBarVisibilityCallback {

    /* renamed from: E */
    private static final Interpolator f725E = new AccelerateInterpolator();

    /* renamed from: F */
    private static final Interpolator f726F = new DecelerateInterpolator();

    /* renamed from: A */
    boolean f727A;

    /* renamed from: a */
    Context f731a;

    /* renamed from: b */
    private Context f732b;

    /* renamed from: c */
    private Activity f733c;

    /* renamed from: d */
    ActionBarOverlayLayout f734d;

    /* renamed from: e */
    ActionBarContainer f735e;

    /* renamed from: f */
    DecorToolbar f736f;

    /* renamed from: g */
    ActionBarContextView f737g;

    /* renamed from: h */
    View f738h;

    /* renamed from: i */
    ScrollingTabContainerView f739i;

    /* renamed from: l */
    private boolean f742l;

    /* renamed from: m */
    d f743m;

    /* renamed from: n */
    AbstractC3583b f744n;

    /* renamed from: o */
    AbstractC3583b.a f745o;

    /* renamed from: p */
    private boolean f746p;

    /* renamed from: r */
    private boolean f748r;

    /* renamed from: u */
    boolean f751u;

    /* renamed from: v */
    boolean f752v;

    /* renamed from: w */
    private boolean f753w;

    /* renamed from: y */
    C3589h f755y;

    /* renamed from: z */
    private boolean f756z;

    /* renamed from: j */
    private ArrayList<Object> f740j = new ArrayList<>();

    /* renamed from: k */
    private int f741k = -1;

    /* renamed from: q */
    private ArrayList<AbstractC0151a.b> f747q = new ArrayList<>();

    /* renamed from: s */
    private int f749s = 0;

    /* renamed from: t */
    boolean f750t = true;

    /* renamed from: x */
    private boolean f754x = true;

    /* renamed from: B */
    final InterfaceC0667c0 f728B = new a();

    /* renamed from: C */
    final InterfaceC0667c0 f729C = new b();

    /* renamed from: D */
    final InterfaceC0671e0 f730D = new c();

    /* renamed from: androidx.appcompat.app.k$a */
    /* loaded from: classes.dex */
    class a extends C0669d0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC0667c0
        public void onAnimationEnd(View view) {
            View view2;
            C0161k c0161k = C0161k.this;
            if (c0161k.f750t && (view2 = c0161k.f738h) != null) {
                view2.setTranslationY(0.0f);
                C0161k.this.f735e.setTranslationY(0.0f);
            }
            C0161k.this.f735e.setVisibility(8);
            C0161k.this.f735e.setTransitioning(false);
            C0161k c0161k2 = C0161k.this;
            c0161k2.f755y = null;
            c0161k2.m898r();
            ActionBarOverlayLayout actionBarOverlayLayout = C0161k.this.f734d;
            if (actionBarOverlayLayout != null) {
                C0690v.m3847n0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.k$b */
    /* loaded from: classes.dex */
    class b extends C0669d0 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC0667c0
        public void onAnimationEnd(View view) {
            C0161k c0161k = C0161k.this;
            c0161k.f755y = null;
            c0161k.f735e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.k$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC0671e0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC0671e0
        /* renamed from: a */
        public void mo904a(View view) {
            ((View) C0161k.this.f735e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.k$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC3583b implements C0168e.a {

        /* renamed from: p */
        private final Context f760p;

        /* renamed from: q */
        private final C0168e f761q;

        /* renamed from: r */
        private AbstractC3583b.a f762r;

        /* renamed from: s */
        private WeakReference<View> f763s;

        public d(Context context, AbstractC3583b.a aVar) {
            this.f760p = context;
            this.f762r = aVar;
            C0168e m998S = new C0168e(context).m998S(1);
            this.f761q = m998S;
            m998S.mo997R(this);
        }

        @Override // androidx.appcompat.view.menu.C0168e.a
        /* renamed from: a */
        public boolean mo807a(C0168e c0168e, MenuItem menuItem) {
            AbstractC3583b.a aVar = this.f762r;
            if (aVar != null) {
                return aVar.mo826a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0168e.a
        /* renamed from: b */
        public void mo809b(C0168e c0168e) {
            if (this.f762r == null) {
                return;
            }
            mo911k();
            C0161k.this.f737g.showOverflowMenu();
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: c */
        public void mo905c() {
            C0161k c0161k = C0161k.this;
            if (c0161k.f743m != this) {
                return;
            }
            if (!C0161k.m890q(c0161k.f751u, c0161k.f752v, false)) {
                C0161k c0161k2 = C0161k.this;
                c0161k2.f744n = this;
                c0161k2.f745o = this.f762r;
            } else {
                this.f762r.mo828c(this);
            }
            this.f762r = null;
            C0161k.this.m897p(false);
            C0161k.this.f737g.closeMode();
            C0161k.this.f736f.getViewGroup().sendAccessibilityEvent(32);
            C0161k c0161k3 = C0161k.this;
            c0161k3.f734d.setHideOnContentScrollEnabled(c0161k3.f727A);
            C0161k.this.f743m = null;
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: d */
        public View mo906d() {
            WeakReference<View> weakReference = this.f763s;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: e */
        public Menu mo907e() {
            return this.f761q;
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: f */
        public MenuInflater mo908f() {
            return new C3588g(this.f760p);
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: g */
        public CharSequence mo909g() {
            return C0161k.this.f737g.getSubtitle();
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: i */
        public CharSequence mo910i() {
            return C0161k.this.f737g.getTitle();
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: k */
        public void mo911k() {
            if (C0161k.this.f743m != this) {
                return;
            }
            this.f761q.m1011d0();
            try {
                this.f762r.mo829d(this, this.f761q);
            } finally {
                this.f761q.m1009c0();
            }
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: l */
        public boolean mo912l() {
            return C0161k.this.f737g.isTitleOptional();
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: m */
        public void mo913m(View view) {
            C0161k.this.f737g.setCustomView(view);
            this.f763s = new WeakReference<>(view);
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: n */
        public void mo914n(int i10) {
            mo915o(C0161k.this.f731a.getResources().getString(i10));
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: o */
        public void mo915o(CharSequence charSequence) {
            C0161k.this.f737g.setSubtitle(charSequence);
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: q */
        public void mo916q(int i10) {
            mo917r(C0161k.this.f731a.getResources().getString(i10));
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: r */
        public void mo917r(CharSequence charSequence) {
            C0161k.this.f737g.setTitle(charSequence);
        }

        @Override // p120j.AbstractC3583b
        /* renamed from: s */
        public void mo918s(boolean z10) {
            super.mo918s(z10);
            C0161k.this.f737g.setTitleOptional(z10);
        }

        /* renamed from: t */
        public boolean m919t() {
            this.f761q.m1011d0();
            try {
                return this.f762r.mo827b(this, this.f761q);
            } finally {
                this.f761q.m1009c0();
            }
        }
    }

    public C0161k(Activity activity, boolean z10) {
        this.f733c = activity;
        View decorView = activity.getWindow().getDecorView();
        m893x(decorView);
        if (z10) {
            return;
        }
        this.f738h = decorView.findViewById(R.id.content);
    }

    /* renamed from: B */
    private void m886B(boolean z10) {
        this.f748r = z10;
        if (!z10) {
            this.f736f.setEmbeddedTabView(null);
            this.f735e.setTabContainer(this.f739i);
        } else {
            this.f735e.setTabContainer(null);
            this.f736f.setEmbeddedTabView(this.f739i);
        }
        boolean z11 = m901v() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f739i;
        if (scrollingTabContainerView != null) {
            if (z11) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f734d;
                if (actionBarOverlayLayout != null) {
                    C0690v.m3847n0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f736f.setCollapsible(!this.f748r && z11);
        this.f734d.setHasNonEmbeddedTabs(!this.f748r && z11);
    }

    /* renamed from: E */
    private boolean m887E() {
        return C0690v.m3814U(this.f735e);
    }

    /* renamed from: F */
    private void m888F() {
        if (this.f753w) {
            return;
        }
        this.f753w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f734d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m889G(false);
    }

    /* renamed from: G */
    private void m889G(boolean z10) {
        if (m890q(this.f751u, this.f752v, this.f753w)) {
            if (this.f754x) {
                return;
            }
            this.f754x = true;
            m900t(z10);
            return;
        }
        if (this.f754x) {
            this.f754x = false;
            m899s(z10);
        }
    }

    /* renamed from: q */
    static boolean m890q(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private DecorToolbar m891u(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: w */
    private void m892w() {
        if (this.f753w) {
            this.f753w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f734d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m889G(false);
        }
    }

    /* renamed from: x */
    private void m893x(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C2953f.f12282q);
        this.f734d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f736f = m891u(view.findViewById(C2953f.f12266a));
        this.f737g = (ActionBarContextView) view.findViewById(C2953f.f12271f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C2953f.f12268c);
        this.f735e = actionBarContainer;
        DecorToolbar decorToolbar = this.f736f;
        if (decorToolbar != null && this.f737g != null && actionBarContainer != null) {
            this.f731a = decorToolbar.getContext();
            boolean z10 = (this.f736f.getDisplayOptions() & 4) != 0;
            if (z10) {
                this.f742l = true;
            }
            C3582a m15368b = C3582a.m15368b(this.f731a);
            m896D(m15368b.m15369a() || z10);
            m886B(m15368b.m15374g());
            TypedArray obtainStyledAttributes = this.f731a.obtainStyledAttributes(null, C2957j.f12466a, C2948a.f12151c, 0);
            if (obtainStyledAttributes.getBoolean(C2957j.f12517k, false)) {
                m895C(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2957j.f12507i, 0);
            if (dimensionPixelSize != 0) {
                m894A(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    /* renamed from: A */
    public void m894A(float f10) {
        C0690v.m3867x0(this.f735e, f10);
    }

    /* renamed from: C */
    public void m895C(boolean z10) {
        if (z10 && !this.f734d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f727A = z10;
        this.f734d.setHideOnContentScrollEnabled(z10);
    }

    /* renamed from: D */
    public void m896D(boolean z10) {
        this.f736f.setHomeButtonEnabled(z10);
    }

    @Override // androidx.appcompat.app.AbstractC0151a
    /* renamed from: b */
    public boolean mo670b() {
        DecorToolbar decorToolbar = this.f736f;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.f736f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0151a
    /* renamed from: c */
    public void mo671c(boolean z10) {
        if (z10 == this.f746p) {
            return;
        }
        this.f746p = z10;
        int size = this.f747q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f747q.get(i10).m684a(z10);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0151a
    /* renamed from: d */
    public int mo672d() {
        return this.f736f.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.AbstractC0151a
    /* renamed from: e */
    public Context mo673e() {
        if (this.f732b == null) {
            TypedValue typedValue = new TypedValue();
            this.f731a.getTheme().resolveAttribute(C2948a.f12156h, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f732b = new ContextThemeWrapper(this.f731a, i10);
            } else {
                this.f732b = this.f731a;
            }
        }
        return this.f732b;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z10) {
        this.f750t = z10;
    }

    @Override // androidx.appcompat.app.AbstractC0151a
    /* renamed from: g */
    public void mo675g(Configuration configuration) {
        m886B(C3582a.m15368b(this.f731a).m15374g());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (this.f752v) {
            return;
        }
        this.f752v = true;
        m889G(true);
    }

    @Override // androidx.appcompat.app.AbstractC0151a
    /* renamed from: i */
    public boolean mo677i(int i10, KeyEvent keyEvent) {
        Menu mo907e;
        d dVar = this.f743m;
        if (dVar == null || (mo907e = dVar.mo907e()) == null) {
            return false;
        }
        mo907e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo907e.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0151a
    /* renamed from: l */
    public void mo680l(boolean z10) {
        if (this.f742l) {
            return;
        }
        m902y(z10);
    }

    @Override // androidx.appcompat.app.AbstractC0151a
    /* renamed from: m */
    public void mo681m(boolean z10) {
        C3589h c3589h;
        this.f756z = z10;
        if (z10 || (c3589h = this.f755y) == null) {
            return;
        }
        c3589h.m15398a();
    }

    @Override // androidx.appcompat.app.AbstractC0151a
    /* renamed from: n */
    public void mo682n(CharSequence charSequence) {
        this.f736f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0151a
    /* renamed from: o */
    public AbstractC3583b mo683o(AbstractC3583b.a aVar) {
        d dVar = this.f743m;
        if (dVar != null) {
            dVar.mo905c();
        }
        this.f734d.setHideOnContentScrollEnabled(false);
        this.f737g.killMode();
        d dVar2 = new d(this.f737g.getContext(), aVar);
        if (!dVar2.m919t()) {
            return null;
        }
        this.f743m = dVar2;
        dVar2.mo911k();
        this.f737g.initForMode(dVar2);
        m897p(true);
        this.f737g.sendAccessibilityEvent(32);
        return dVar2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        C3589h c3589h = this.f755y;
        if (c3589h != null) {
            c3589h.m15398a();
            this.f755y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i10) {
        this.f749s = i10;
    }

    /* renamed from: p */
    public void m897p(boolean z10) {
        C0665b0 c0665b0;
        C0665b0 c0665b02;
        if (z10) {
            m888F();
        } else {
            m892w();
        }
        if (!m887E()) {
            if (z10) {
                this.f736f.setVisibility(4);
                this.f737g.setVisibility(0);
                return;
            } else {
                this.f736f.setVisibility(0);
                this.f737g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            c0665b02 = this.f736f.setupAnimatorToVisibility(4, 100L);
            c0665b0 = this.f737g.setupAnimatorToVisibility(0, 200L);
        } else {
            c0665b0 = this.f736f.setupAnimatorToVisibility(0, 200L);
            c0665b02 = this.f737g.setupAnimatorToVisibility(8, 100L);
        }
        C3589h c3589h = new C3589h();
        c3589h.m15401d(c0665b02, c0665b0);
        c3589h.m15405h();
    }

    /* renamed from: r */
    void m898r() {
        AbstractC3583b.a aVar = this.f745o;
        if (aVar != null) {
            aVar.mo828c(this.f744n);
            this.f744n = null;
            this.f745o = null;
        }
    }

    /* renamed from: s */
    public void m899s(boolean z10) {
        View view;
        C3589h c3589h = this.f755y;
        if (c3589h != null) {
            c3589h.m15398a();
        }
        if (this.f749s == 0 && (this.f756z || z10)) {
            this.f735e.setAlpha(1.0f);
            this.f735e.setTransitioning(true);
            C3589h c3589h2 = new C3589h();
            float f10 = -this.f735e.getHeight();
            if (z10) {
                this.f735e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            C0665b0 m3609m = C0690v.m3828e(this.f735e).m3609m(f10);
            m3609m.m3607k(this.f730D);
            c3589h2.m15400c(m3609m);
            if (this.f750t && (view = this.f738h) != null) {
                c3589h2.m15400c(C0690v.m3828e(view).m3609m(f10));
            }
            c3589h2.m15403f(f725E);
            c3589h2.m15402e(250L);
            c3589h2.m15404g(this.f728B);
            this.f755y = c3589h2;
            c3589h2.m15405h();
            return;
        }
        this.f728B.onAnimationEnd(null);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.f752v) {
            this.f752v = false;
            m889G(true);
        }
    }

    /* renamed from: t */
    public void m900t(boolean z10) {
        View view;
        View view2;
        C3589h c3589h = this.f755y;
        if (c3589h != null) {
            c3589h.m15398a();
        }
        this.f735e.setVisibility(0);
        if (this.f749s == 0 && (this.f756z || z10)) {
            this.f735e.setTranslationY(0.0f);
            float f10 = -this.f735e.getHeight();
            if (z10) {
                this.f735e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f735e.setTranslationY(f10);
            C3589h c3589h2 = new C3589h();
            C0665b0 m3609m = C0690v.m3828e(this.f735e).m3609m(0.0f);
            m3609m.m3607k(this.f730D);
            c3589h2.m15400c(m3609m);
            if (this.f750t && (view2 = this.f738h) != null) {
                view2.setTranslationY(f10);
                c3589h2.m15400c(C0690v.m3828e(this.f738h).m3609m(0.0f));
            }
            c3589h2.m15403f(f726F);
            c3589h2.m15402e(250L);
            c3589h2.m15404g(this.f729C);
            this.f755y = c3589h2;
            c3589h2.m15405h();
        } else {
            this.f735e.setAlpha(1.0f);
            this.f735e.setTranslationY(0.0f);
            if (this.f750t && (view = this.f738h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f729C.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f734d;
        if (actionBarOverlayLayout != null) {
            C0690v.m3847n0(actionBarOverlayLayout);
        }
    }

    /* renamed from: v */
    public int m901v() {
        return this.f736f.getNavigationMode();
    }

    /* renamed from: y */
    public void m902y(boolean z10) {
        m903z(z10 ? 4 : 0, 4);
    }

    /* renamed from: z */
    public void m903z(int i10, int i11) {
        int displayOptions = this.f736f.getDisplayOptions();
        if ((i11 & 4) != 0) {
            this.f742l = true;
        }
        this.f736f.setDisplayOptions((i10 & i11) | ((~i11) & displayOptions));
    }

    public C0161k(Dialog dialog) {
        m893x(dialog.getWindow().getDecorView());
    }
}
