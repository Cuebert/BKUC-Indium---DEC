package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C0660c;
import androidx.core.view.accessibility.C0661d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p182o0.C4112e;

/* renamed from: androidx.core.view.a */
/* loaded from: classes.dex */
public class C0656a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f3500c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f3501a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f3502b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.a$a */
    /* loaded from: classes.dex */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0656a f3503a;

        a(C0656a c0656a) {
            this.f3503a = c0656a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3503a.mo3480a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0661d mo3481b = this.f3503a.mo3481b(view);
            if (mo3481b != null) {
                return (AccessibilityNodeProvider) mo3481b.m3585e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3503a.mo3483f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0660c m3511z0 = C0660c.m3511z0(accessibilityNodeInfo);
            m3511z0.m3560q0(C0690v.m3817X(view));
            m3511z0.m3546i0(C0690v.m3812S(view));
            m3511z0.m3553m0(C0690v.m3854r(view));
            m3511z0.m3566u0(C0690v.m3805L(view));
            this.f3503a.mo3484g(view, m3511z0);
            m3511z0.m3540e(accessibilityNodeInfo.getText(), view);
            List<C0660c.a> m3477c = C0656a.m3477c(view);
            for (int i10 = 0; i10 < m3477c.size(); i10++) {
                m3511z0.m3535b(m3477c.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3503a.mo3485h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3503a.mo3486i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f3503a.mo3487j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f3503a.mo3488l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3503a.mo3489m(view, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static AccessibilityNodeProvider m3490a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        static boolean m3491b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public C0656a() {
        this(f3500c);
    }

    /* renamed from: c */
    static List<C0660c.a> m3477c(View view) {
        List<C0660c.a> list = (List) view.getTag(C4112e.f16692H);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m3478e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m3506p = C0660c.m3506p(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; m3506p != null && i10 < m3506p.length; i10++) {
                if (clickableSpan.equals(m3506p[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m3479k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C4112e.f16693I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m3478e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo3480a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3501a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0661d mo3481b(View view) {
        AccessibilityNodeProvider m3490a = b.m3490a(this.f3501a, view);
        if (m3490a != null) {
            return new C0661d(m3490a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate m3482d() {
        return this.f3502b;
    }

    /* renamed from: f */
    public void mo3483f(View view, AccessibilityEvent accessibilityEvent) {
        this.f3501a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3484g(View view, C0660c c0660c) {
        this.f3501a.onInitializeAccessibilityNodeInfo(view, c0660c.m3573y0());
    }

    /* renamed from: h */
    public void mo3485h(View view, AccessibilityEvent accessibilityEvent) {
        this.f3501a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo3486i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3501a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo3487j(View view, int i10, Bundle bundle) {
        List<C0660c.a> m3477c = m3477c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= m3477c.size()) {
                break;
            }
            C0660c.a aVar = m3477c.get(i11);
            if (aVar.m3575b() == i10) {
                z10 = aVar.m3577d(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10) {
            z10 = b.m3491b(this.f3501a, view, i10, bundle);
        }
        return (z10 || i10 != C4112e.f16704a || bundle == null) ? z10 : m3479k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo3488l(View view, int i10) {
        this.f3501a.sendAccessibilityEvent(view, i10);
    }

    /* renamed from: m */
    public void mo3489m(View view, AccessibilityEvent accessibilityEvent) {
        this.f3501a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0656a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3501a = accessibilityDelegate;
        this.f3502b = new a(this);
    }
}
