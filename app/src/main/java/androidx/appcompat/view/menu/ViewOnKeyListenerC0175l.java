package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0173j;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.C0690v;
import p039d.C2951d;
import p039d.C2954g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0175l extends AbstractC0171h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: I */
    private static final int f938I = C2954g.f12306o;

    /* renamed from: A */
    View f939A;

    /* renamed from: B */
    private InterfaceC0173j.a f940B;

    /* renamed from: C */
    ViewTreeObserver f941C;

    /* renamed from: D */
    private boolean f942D;

    /* renamed from: E */
    private boolean f943E;

    /* renamed from: F */
    private int f944F;

    /* renamed from: H */
    private boolean f946H;

    /* renamed from: o */
    private final Context f947o;

    /* renamed from: p */
    private final C0168e f948p;

    /* renamed from: q */
    private final C0167d f949q;

    /* renamed from: r */
    private final boolean f950r;

    /* renamed from: s */
    private final int f951s;

    /* renamed from: t */
    private final int f952t;

    /* renamed from: u */
    private final int f953u;

    /* renamed from: v */
    final MenuPopupWindow f954v;

    /* renamed from: y */
    private PopupWindow.OnDismissListener f957y;

    /* renamed from: z */
    private View f958z;

    /* renamed from: w */
    final ViewTreeObserver.OnGlobalLayoutListener f955w = new a();

    /* renamed from: x */
    private final View.OnAttachStateChangeListener f956x = new b();

    /* renamed from: G */
    private int f945G = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0175l.this.isShowing() || ViewOnKeyListenerC0175l.this.f954v.isModal()) {
                return;
            }
            View view = ViewOnKeyListenerC0175l.this.f939A;
            if (view != null && view.isShown()) {
                ViewOnKeyListenerC0175l.this.f954v.show();
            } else {
                ViewOnKeyListenerC0175l.this.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0175l.this.f941C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0175l.this.f941C = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0175l viewOnKeyListenerC0175l = ViewOnKeyListenerC0175l.this;
                viewOnKeyListenerC0175l.f941C.removeGlobalOnLayoutListener(viewOnKeyListenerC0175l.f955w);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0175l(Context context, C0168e c0168e, View view, int i10, int i11, boolean z10) {
        this.f947o = context;
        this.f948p = c0168e;
        this.f950r = z10;
        this.f949q = new C0167d(c0168e, LayoutInflater.from(context), z10, f938I);
        this.f952t = i10;
        this.f953u = i11;
        Resources resources = context.getResources();
        this.f951s = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2951d.f12187d));
        this.f958z = view;
        this.f954v = new MenuPopupWindow(context, null, i10, i11);
        c0168e.m1008c(this, context);
    }

    /* renamed from: w */
    private boolean m1081w() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f942D || (view = this.f958z) == null) {
            return false;
        }
        this.f939A = view;
        this.f954v.setOnDismissListener(this);
        this.f954v.setOnItemClickListener(this);
        this.f954v.setModal(true);
        View view2 = this.f939A;
        boolean z10 = this.f941C == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f941C = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f955w);
        }
        view2.addOnAttachStateChangeListener(this.f956x);
        this.f954v.setAnchorView(view2);
        this.f954v.setDropDownGravity(this.f945G);
        if (!this.f943E) {
            this.f944F = AbstractC0171h.m1060l(this.f949q, null, this.f947o, this.f951s);
            this.f943E = true;
        }
        this.f954v.setContentWidth(this.f944F);
        this.f954v.setInputMethodMode(2);
        this.f954v.setEpicenterBounds(m1063k());
        this.f954v.show();
        ListView listView = this.f954v.getListView();
        listView.setOnKeyListener(this);
        if (this.f946H && this.f948p.m1027x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f947o).inflate(C2954g.f12305n, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f948p.m1027x());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.f954v.setAdapter(this.f949q);
        this.f954v.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: a */
    public void mo932a(C0168e c0168e, boolean z10) {
        if (c0168e != this.f948p) {
            return;
        }
        dismiss();
        InterfaceC0173j.a aVar = this.f940B;
        if (aVar != null) {
            aVar.mo824a(c0168e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: c */
    public boolean mo934c(SubMenuC0176m subMenuC0176m) {
        if (subMenuC0176m.hasVisibleItems()) {
            C0172i c0172i = new C0172i(this.f947o, subMenuC0176m, this.f939A, this.f950r, this.f952t, this.f953u);
            c0172i.m1077l(this.f940B);
            c0172i.m1074i(AbstractC0171h.m1061u(subMenuC0176m));
            c0172i.m1076k(this.f957y);
            this.f957y = null;
            this.f948p.m1012e(false);
            int horizontalOffset = this.f954v.getHorizontalOffset();
            int verticalOffset = this.f954v.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.f945G, C0690v.m3791E(this.f958z)) & 7) == 5) {
                horizontalOffset += this.f958z.getWidth();
            }
            if (c0172i.m1080p(horizontalOffset, verticalOffset)) {
                InterfaceC0173j.a aVar = this.f940B;
                if (aVar == null) {
                    return true;
                }
                aVar.mo825b(subMenuC0176m);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: d */
    public void mo935d(boolean z10) {
        this.f943E = false;
        C0167d c0167d = this.f949q;
        if (c0167d != null) {
            c0167d.notifyDataSetChanged();
        }
    }

    @Override // p133k.InterfaceC3703e
    public void dismiss() {
        if (isShowing()) {
            this.f954v.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: e */
    public void mo955e(C0168e c0168e) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: f */
    public boolean mo956f() {
        return false;
    }

    @Override // p133k.InterfaceC3703e
    public ListView getListView() {
        return this.f954v.getListView();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j
    /* renamed from: i */
    public void mo938i(InterfaceC0173j.a aVar) {
        this.f940B = aVar;
    }

    @Override // p133k.InterfaceC3703e
    public boolean isShowing() {
        return !this.f942D && this.f954v.isShowing();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: m */
    public void mo958m(View view) {
        this.f958z = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: o */
    public void mo959o(boolean z10) {
        this.f949q.m973d(z10);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f942D = true;
        this.f948p.close();
        ViewTreeObserver viewTreeObserver = this.f941C;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f941C = this.f939A.getViewTreeObserver();
            }
            this.f941C.removeGlobalOnLayoutListener(this.f955w);
            this.f941C = null;
        }
        this.f939A.removeOnAttachStateChangeListener(this.f956x);
        PopupWindow.OnDismissListener onDismissListener = this.f957y;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f945G = i10;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: q */
    public void mo961q(int i10) {
        this.f954v.setHorizontalOffset(i10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: r */
    public void mo962r(PopupWindow.OnDismissListener onDismissListener) {
        this.f957y = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: s */
    public void mo963s(boolean z10) {
        this.f946H = z10;
    }

    @Override // p133k.InterfaceC3703e
    public void show() {
        if (!m1081w()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0171h
    /* renamed from: t */
    public void mo964t(int i10) {
        this.f954v.setVerticalOffset(i10);
    }
}
