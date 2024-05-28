package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0690v;
import androidx.core.view.C0692x;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
class ViewOnLongClickListenerC0265r implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: w */
    private static ViewOnLongClickListenerC0265r f1205w;

    /* renamed from: x */
    private static ViewOnLongClickListenerC0265r f1206x;

    /* renamed from: n */
    private final View f1207n;

    /* renamed from: o */
    private final CharSequence f1208o;

    /* renamed from: p */
    private final int f1209p;

    /* renamed from: q */
    private final Runnable f1210q = new a();

    /* renamed from: r */
    private final Runnable f1211r = new b();

    /* renamed from: s */
    private int f1212s;

    /* renamed from: t */
    private int f1213t;

    /* renamed from: u */
    private C0266s f1214u;

    /* renamed from: v */
    private boolean f1215v;

    /* renamed from: androidx.appcompat.widget.r$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0265r.this.m1316g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.r$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0265r.this.m1315c();
        }
    }

    private ViewOnLongClickListenerC0265r(View view, CharSequence charSequence) {
        this.f1207n = view;
        this.f1208o = charSequence;
        this.f1209p = C0692x.m4016c(ViewConfiguration.get(view.getContext()));
        m1310b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m1309a() {
        this.f1207n.removeCallbacks(this.f1210q);
    }

    /* renamed from: b */
    private void m1310b() {
        this.f1212s = Integer.MAX_VALUE;
        this.f1213t = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1311d() {
        this.f1207n.postDelayed(this.f1210q, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m1312e(ViewOnLongClickListenerC0265r viewOnLongClickListenerC0265r) {
        ViewOnLongClickListenerC0265r viewOnLongClickListenerC0265r2 = f1205w;
        if (viewOnLongClickListenerC0265r2 != null) {
            viewOnLongClickListenerC0265r2.m1309a();
        }
        f1205w = viewOnLongClickListenerC0265r;
        if (viewOnLongClickListenerC0265r != null) {
            viewOnLongClickListenerC0265r.m1311d();
        }
    }

    /* renamed from: f */
    public static void m1313f(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC0265r viewOnLongClickListenerC0265r = f1205w;
        if (viewOnLongClickListenerC0265r != null && viewOnLongClickListenerC0265r.f1207n == view) {
            m1312e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC0265r viewOnLongClickListenerC0265r2 = f1206x;
            if (viewOnLongClickListenerC0265r2 != null && viewOnLongClickListenerC0265r2.f1207n == view) {
                viewOnLongClickListenerC0265r2.m1315c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC0265r(view, charSequence);
    }

    /* renamed from: h */
    private boolean m1314h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.f1212s) <= this.f1209p && Math.abs(y10 - this.f1213t) <= this.f1209p) {
            return false;
        }
        this.f1212s = x10;
        this.f1213t = y10;
        return true;
    }

    /* renamed from: c */
    void m1315c() {
        if (f1206x == this) {
            f1206x = null;
            C0266s c0266s = this.f1214u;
            if (c0266s != null) {
                c0266s.m1319c();
                this.f1214u = null;
                m1310b();
                this.f1207n.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1205w == this) {
            m1312e(null);
        }
        this.f1207n.removeCallbacks(this.f1211r);
    }

    /* renamed from: g */
    void m1316g(boolean z10) {
        long j10;
        int longPressTimeout;
        long j11;
        if (C0690v.m3813T(this.f1207n)) {
            m1312e(null);
            ViewOnLongClickListenerC0265r viewOnLongClickListenerC0265r = f1206x;
            if (viewOnLongClickListenerC0265r != null) {
                viewOnLongClickListenerC0265r.m1315c();
            }
            f1206x = this;
            this.f1215v = z10;
            C0266s c0266s = new C0266s(this.f1207n.getContext());
            this.f1214u = c0266s;
            c0266s.m1321e(this.f1207n, this.f1212s, this.f1213t, this.f1215v, this.f1208o);
            this.f1207n.addOnAttachStateChangeListener(this);
            if (this.f1215v) {
                j11 = 2500;
            } else {
                if ((C0690v.m3807N(this.f1207n) & 1) == 1) {
                    j10 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j10 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j11 = j10 - longPressTimeout;
            }
            this.f1207n.removeCallbacks(this.f1211r);
            this.f1207n.postDelayed(this.f1211r, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1214u != null && this.f1215v) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1207n.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1310b();
                m1315c();
            }
        } else if (this.f1207n.isEnabled() && this.f1214u == null && m1314h(motionEvent)) {
            m1312e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1212s = view.getWidth() / 2;
        this.f1213t = view.getHeight() / 2;
        m1316g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1315c();
    }
}
