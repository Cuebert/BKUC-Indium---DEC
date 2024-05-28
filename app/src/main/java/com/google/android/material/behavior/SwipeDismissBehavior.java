package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import androidx.core.view.accessibility.InterfaceC0663f;
import p306y0.C5591c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0559c<V> {

    /* renamed from: a */
    C5591c f9001a;

    /* renamed from: b */
    InterfaceC2400c f9002b;

    /* renamed from: c */
    private boolean f9003c;

    /* renamed from: e */
    private boolean f9005e;

    /* renamed from: d */
    private float f9004d = 0.0f;

    /* renamed from: f */
    int f9006f = 2;

    /* renamed from: g */
    float f9007g = 0.5f;

    /* renamed from: h */
    float f9008h = 0.0f;

    /* renamed from: i */
    float f9009i = 0.5f;

    /* renamed from: j */
    private final C5591c.c f9010j = new C2398a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes.dex */
    public class C2398a extends C5591c.c {

        /* renamed from: a */
        private int f9011a;

        /* renamed from: b */
        private int f9012b = -1;

        C2398a() {
        }

        /* renamed from: n */
        private boolean m10582n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f9011a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f9007g);
            }
            boolean z10 = C0690v.m3791E(view) == 1;
            int i10 = SwipeDismissBehavior.this.f9006f;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z10) {
                    if (f10 >= 0.0f) {
                        return false;
                    }
                } else if (f10 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            if (z10) {
                if (f10 <= 0.0f) {
                    return false;
                }
            } else if (f10 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // p306y0.C5591c.c
        /* renamed from: a */
        public int mo10583a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = C0690v.m3791E(view) == 1;
            int i12 = SwipeDismissBehavior.this.f9006f;
            if (i12 == 0) {
                if (z10) {
                    width = this.f9011a - view.getWidth();
                    width2 = this.f9011a;
                } else {
                    width = this.f9011a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f9011a - view.getWidth();
                width2 = view.getWidth() + this.f9011a;
            } else if (z10) {
                width = this.f9011a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f9011a - view.getWidth();
                width2 = this.f9011a;
            }
            return SwipeDismissBehavior.m10574G(width, i10, width2);
        }

        @Override // p306y0.C5591c.c
        /* renamed from: b */
        public int mo10584b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // p306y0.C5591c.c
        /* renamed from: d */
        public int mo10585d(View view) {
            return view.getWidth();
        }

        @Override // p306y0.C5591c.c
        /* renamed from: i */
        public void mo10586i(View view, int i10) {
            this.f9012b = i10;
            this.f9011a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p306y0.C5591c.c
        /* renamed from: j */
        public void mo10587j(int i10) {
            InterfaceC2400c interfaceC2400c = SwipeDismissBehavior.this.f9002b;
            if (interfaceC2400c != null) {
                interfaceC2400c.m10592b(i10);
            }
        }

        @Override // p306y0.C5591c.c
        /* renamed from: k */
        public void mo10588k(View view, int i10, int i11, int i12, int i13) {
            float width = this.f9011a + (view.getWidth() * SwipeDismissBehavior.this.f9008h);
            float width2 = this.f9011a + (view.getWidth() * SwipeDismissBehavior.this.f9009i);
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m10573F(0.0f, 1.0f - SwipeDismissBehavior.m10576I(width, width2, f10), 1.0f));
            }
        }

        @Override // p306y0.C5591c.c
        /* renamed from: l */
        public void mo10589l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            InterfaceC2400c interfaceC2400c;
            this.f9012b = -1;
            int width = view.getWidth();
            if (m10582n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f9011a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.f9011a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f9001a.m20596F(i10, view.getTop())) {
                C0690v.m3837i0(view, new RunnableC2401d(view, z10));
            } else {
                if (!z10 || (interfaceC2400c = SwipeDismissBehavior.this.f9002b) == null) {
                    return;
                }
                interfaceC2400c.m10591a(view);
            }
        }

        @Override // p306y0.C5591c.c
        /* renamed from: m */
        public boolean mo10590m(View view, int i10) {
            int i11 = this.f9012b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.mo10578E(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes.dex */
    public class C2399b implements InterfaceC0663f {
        C2399b() {
        }

        @Override // androidx.core.view.accessibility.InterfaceC0663f
        /* renamed from: a */
        public boolean mo3595a(View view, InterfaceC0663f.a aVar) {
            boolean z10 = false;
            if (!SwipeDismissBehavior.this.mo10578E(view)) {
                return false;
            }
            boolean z11 = C0690v.m3791E(view) == 1;
            int i10 = SwipeDismissBehavior.this.f9006f;
            if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
                z10 = true;
            }
            int width = view.getWidth();
            if (z10) {
                width = -width;
            }
            C0690v.m3821a0(view, width);
            view.setAlpha(0.0f);
            InterfaceC2400c interfaceC2400c = SwipeDismissBehavior.this.f9002b;
            if (interfaceC2400c != null) {
                interfaceC2400c.m10591a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2400c {
        /* renamed from: a */
        void m10591a(View view);

        /* renamed from: b */
        void m10592b(int i10);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    /* loaded from: classes.dex */
    private class RunnableC2401d implements Runnable {

        /* renamed from: n */
        private final View f9015n;

        /* renamed from: o */
        private final boolean f9016o;

        RunnableC2401d(View view, boolean z10) {
            this.f9015n = view;
            this.f9016o = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2400c interfaceC2400c;
            C5591c c5591c = SwipeDismissBehavior.this.f9001a;
            if (c5591c != null && c5591c.m20602k(true)) {
                C0690v.m3837i0(this.f9015n, this);
            } else {
                if (!this.f9016o || (interfaceC2400c = SwipeDismissBehavior.this.f9002b) == null) {
                    return;
                }
                interfaceC2400c.m10591a(this.f9015n);
            }
        }
    }

    /* renamed from: F */
    static float m10573F(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    /* renamed from: G */
    static int m10574G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    /* renamed from: H */
    private void m10575H(ViewGroup viewGroup) {
        C5591c m20587m;
        if (this.f9001a == null) {
            if (this.f9005e) {
                m20587m = C5591c.m20586l(viewGroup, this.f9004d, this.f9010j);
            } else {
                m20587m = C5591c.m20587m(viewGroup, this.f9010j);
            }
            this.f9001a = m20587m;
        }
    }

    /* renamed from: I */
    static float m10576I(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    /* renamed from: M */
    private void m10577M(View view) {
        C0690v.m3841k0(view, 1048576);
        if (mo10578E(view)) {
            C0690v.m3845m0(view, C0660c.a.f3554y, null, new C2399b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: D */
    public boolean mo2661D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        C5591c c5591c = this.f9001a;
        if (c5591c == null) {
            return false;
        }
        c5591c.m20608z(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo10578E(View view) {
        return true;
    }

    /* renamed from: J */
    public void m10579J(float f10) {
        this.f9009i = m10573F(0.0f, f10, 1.0f);
    }

    /* renamed from: K */
    public void m10580K(float f10) {
        this.f9008h = m10573F(0.0f, f10, 1.0f);
    }

    /* renamed from: L */
    public void m10581L(int i10) {
        this.f9006f = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: k */
    public boolean mo2672k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f9003c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.m2654v(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9003c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f9003c = false;
        }
        if (!z10) {
            return false;
        }
        m10575H(coordinatorLayout);
        return this.f9001a.m20597G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: l */
    public boolean mo2673l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean mo2673l = super.mo2673l(coordinatorLayout, v10, i10);
        if (C0690v.m3787C(v10) == 0) {
            C0690v.m3871z0(v10, 1);
            m10577M(v10);
        }
        return mo2673l;
    }
}
