package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0656a;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import androidx.core.view.accessibility.C0661d;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C0916k extends C0656a {

    /* renamed from: d */
    final RecyclerView f4799d;

    /* renamed from: e */
    private final a f4800e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes.dex */
    public static class a extends C0656a {

        /* renamed from: d */
        final C0916k f4801d;

        /* renamed from: e */
        private Map<View, C0656a> f4802e = new WeakHashMap();

        public a(C0916k c0916k) {
            this.f4801d = c0916k;
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: a */
        public boolean mo3480a(View view, AccessibilityEvent accessibilityEvent) {
            C0656a c0656a = this.f4802e.get(view);
            if (c0656a != null) {
                return c0656a.mo3480a(view, accessibilityEvent);
            }
            return super.mo3480a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: b */
        public C0661d mo3481b(View view) {
            C0656a c0656a = this.f4802e.get(view);
            if (c0656a != null) {
                return c0656a.mo3481b(view);
            }
            return super.mo3481b(view);
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: f */
        public void mo3483f(View view, AccessibilityEvent accessibilityEvent) {
            C0656a c0656a = this.f4802e.get(view);
            if (c0656a != null) {
                c0656a.mo3483f(view, accessibilityEvent);
            } else {
                super.mo3483f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            if (!this.f4801d.m5836o() && this.f4801d.f4799d.getLayoutManager() != null) {
                this.f4801d.f4799d.getLayoutManager().m5419O0(view, c0660c);
                C0656a c0656a = this.f4802e.get(view);
                if (c0656a != null) {
                    c0656a.mo3484g(view, c0660c);
                    return;
                } else {
                    super.mo3484g(view, c0660c);
                    return;
                }
            }
            super.mo3484g(view, c0660c);
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: h */
        public void mo3485h(View view, AccessibilityEvent accessibilityEvent) {
            C0656a c0656a = this.f4802e.get(view);
            if (c0656a != null) {
                c0656a.mo3485h(view, accessibilityEvent);
            } else {
                super.mo3485h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: i */
        public boolean mo3486i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0656a c0656a = this.f4802e.get(viewGroup);
            if (c0656a != null) {
                return c0656a.mo3486i(viewGroup, view, accessibilityEvent);
            }
            return super.mo3486i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: j */
        public boolean mo3487j(View view, int i10, Bundle bundle) {
            if (!this.f4801d.m5836o() && this.f4801d.f4799d.getLayoutManager() != null) {
                C0656a c0656a = this.f4802e.get(view);
                if (c0656a != null) {
                    if (c0656a.mo3487j(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.mo3487j(view, i10, bundle)) {
                    return true;
                }
                return this.f4801d.f4799d.getLayoutManager().m5454i1(view, i10, bundle);
            }
            return super.mo3487j(view, i10, bundle);
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: l */
        public void mo3488l(View view, int i10) {
            C0656a c0656a = this.f4802e.get(view);
            if (c0656a != null) {
                c0656a.mo3488l(view, i10);
            } else {
                super.mo3488l(view, i10);
            }
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: m */
        public void mo3489m(View view, AccessibilityEvent accessibilityEvent) {
            C0656a c0656a = this.f4802e.get(view);
            if (c0656a != null) {
                c0656a.mo3489m(view, accessibilityEvent);
            } else {
                super.mo3489m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public C0656a m5837n(View view) {
            return this.f4802e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public void m5838o(View view) {
            C0656a m3846n = C0690v.m3846n(view);
            if (m3846n == null || m3846n == this) {
                return;
            }
            this.f4802e.put(view, m3846n);
        }
    }

    public C0916k(RecyclerView recyclerView) {
        this.f4799d = recyclerView;
        C0656a m5835n = m5835n();
        if (m5835n != null && (m5835n instanceof a)) {
            this.f4800e = (a) m5835n;
        } else {
            this.f4800e = new a(this);
        }
    }

    @Override // androidx.core.view.C0656a
    /* renamed from: f */
    public void mo3483f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3483f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m5836o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo5072K0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C0656a
    /* renamed from: g */
    public void mo3484g(View view, C0660c c0660c) {
        super.mo3484g(view, c0660c);
        if (m5836o() || this.f4799d.getLayoutManager() == null) {
            return;
        }
        this.f4799d.getLayoutManager().m5416M0(c0660c);
    }

    @Override // androidx.core.view.C0656a
    /* renamed from: j */
    public boolean mo3487j(View view, int i10, Bundle bundle) {
        if (super.mo3487j(view, i10, bundle)) {
            return true;
        }
        if (m5836o() || this.f4799d.getLayoutManager() == null) {
            return false;
        }
        return this.f4799d.getLayoutManager().m5449g1(i10, bundle);
    }

    /* renamed from: n */
    public C0656a m5835n() {
        return this.f4800e;
    }

    /* renamed from: o */
    boolean m5836o() {
        return this.f4799d.m5215k0();
    }
}
