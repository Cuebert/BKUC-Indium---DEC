package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0173j;
import androidx.core.view.C0670e;
import androidx.core.view.C0690v;
import p039d.C2951d;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public class C0172i {

    /* renamed from: a */
    private final Context f925a;

    /* renamed from: b */
    private final C0168e f926b;

    /* renamed from: c */
    private final boolean f927c;

    /* renamed from: d */
    private final int f928d;

    /* renamed from: e */
    private final int f929e;

    /* renamed from: f */
    private View f930f;

    /* renamed from: g */
    private int f931g;

    /* renamed from: h */
    private boolean f932h;

    /* renamed from: i */
    private InterfaceC0173j.a f933i;

    /* renamed from: j */
    private AbstractC0171h f934j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f935k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f936l;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0172i.this.mo1072g();
        }
    }

    public C0172i(Context context, C0168e c0168e, View view, boolean z10, int i10) {
        this(context, c0168e, view, z10, i10, 0);
    }

    /* renamed from: a */
    private AbstractC0171h m1065a() {
        AbstractC0171h viewOnKeyListenerC0175l;
        Display defaultDisplay = ((WindowManager) this.f925a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (Math.min(point.x, point.y) >= this.f925a.getResources().getDimensionPixelSize(C2951d.f12186c)) {
            viewOnKeyListenerC0175l = new ViewOnKeyListenerC0165b(this.f925a, this.f930f, this.f928d, this.f929e, this.f927c);
        } else {
            viewOnKeyListenerC0175l = new ViewOnKeyListenerC0175l(this.f925a, this.f926b, this.f930f, this.f928d, this.f929e, this.f927c);
        }
        viewOnKeyListenerC0175l.mo955e(this.f926b);
        viewOnKeyListenerC0175l.mo962r(this.f936l);
        viewOnKeyListenerC0175l.mo958m(this.f930f);
        viewOnKeyListenerC0175l.mo938i(this.f933i);
        viewOnKeyListenerC0175l.mo959o(this.f932h);
        viewOnKeyListenerC0175l.mo960p(this.f931g);
        return viewOnKeyListenerC0175l;
    }

    /* renamed from: n */
    private void m1066n(int i10, int i11, boolean z10, boolean z11) {
        AbstractC0171h m1070e = m1070e();
        m1070e.mo963s(z11);
        if (z10) {
            if ((C0670e.m3641b(this.f931g, C0690v.m3791E(this.f930f)) & 7) == 5) {
                i10 -= this.f930f.getWidth();
            }
            m1070e.mo961q(i10);
            m1070e.mo964t(i11);
            int i12 = (int) ((this.f925a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m1070e.m1064n(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        m1070e.show();
    }

    /* renamed from: b */
    public void m1067b() {
        if (m1071f()) {
            this.f934j.dismiss();
        }
    }

    /* renamed from: c */
    public int m1068c() {
        return this.f931g;
    }

    /* renamed from: d */
    public ListView m1069d() {
        return m1070e().getListView();
    }

    /* renamed from: e */
    public AbstractC0171h m1070e() {
        if (this.f934j == null) {
            this.f934j = m1065a();
        }
        return this.f934j;
    }

    /* renamed from: f */
    public boolean m1071f() {
        AbstractC0171h abstractC0171h = this.f934j;
        return abstractC0171h != null && abstractC0171h.isShowing();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void mo1072g() {
        this.f934j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f935k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: h */
    public void m1073h(View view) {
        this.f930f = view;
    }

    /* renamed from: i */
    public void m1074i(boolean z10) {
        this.f932h = z10;
        AbstractC0171h abstractC0171h = this.f934j;
        if (abstractC0171h != null) {
            abstractC0171h.mo959o(z10);
        }
    }

    /* renamed from: j */
    public void m1075j(int i10) {
        this.f931g = i10;
    }

    /* renamed from: k */
    public void m1076k(PopupWindow.OnDismissListener onDismissListener) {
        this.f935k = onDismissListener;
    }

    /* renamed from: l */
    public void m1077l(InterfaceC0173j.a aVar) {
        this.f933i = aVar;
        AbstractC0171h abstractC0171h = this.f934j;
        if (abstractC0171h != null) {
            abstractC0171h.mo938i(aVar);
        }
    }

    /* renamed from: m */
    public void m1078m() {
        if (!m1079o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: o */
    public boolean m1079o() {
        if (m1071f()) {
            return true;
        }
        if (this.f930f == null) {
            return false;
        }
        m1066n(0, 0, false, false);
        return true;
    }

    /* renamed from: p */
    public boolean m1080p(int i10, int i11) {
        if (m1071f()) {
            return true;
        }
        if (this.f930f == null) {
            return false;
        }
        m1066n(i10, i11, true, true);
        return true;
    }

    public C0172i(Context context, C0168e c0168e, View view, boolean z10, int i10, int i11) {
        this.f931g = 8388611;
        this.f936l = new a();
        this.f925a = context;
        this.f926b = c0168e;
        this.f930f = view;
        this.f927c = z10;
        this.f928d = i10;
        this.f929e = i11;
    }
}
