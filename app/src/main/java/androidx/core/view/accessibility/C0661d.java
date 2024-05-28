package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.d */
/* loaded from: classes.dex */
public class C0661d {

    /* renamed from: a */
    private final Object f3562a;

    /* renamed from: androidx.core.view.accessibility.d$a */
    /* loaded from: classes.dex */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0661d f3563a;

        a(C0661d c0661d) {
            this.f3563a = c0661d;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            C0660c mo3582b = this.f3563a.mo3582b(i10);
            if (mo3582b == null) {
                return null;
            }
            return mo3582b.m3573y0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<C0660c> m3583c = this.f3563a.m3583c(str, i10);
            if (m3583c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m3583c.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(m3583c.get(i11).m3573y0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f3563a.mo3586f(i10, i11, bundle);
        }
    }

    /* renamed from: androidx.core.view.accessibility.d$b */
    /* loaded from: classes.dex */
    static class b extends a {
        b(C0661d c0661d) {
            super(c0661d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            C0660c mo3584d = this.f3563a.mo3584d(i10);
            if (mo3584d == null) {
                return null;
            }
            return mo3584d.m3573y0();
        }
    }

    /* renamed from: androidx.core.view.accessibility.d$c */
    /* loaded from: classes.dex */
    static class c extends b {
        c(C0661d c0661d) {
            super(c0661d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f3563a.m3581a(i10, C0660c.m3511z0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C0661d() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3562a = new c(this);
        } else {
            this.f3562a = new b(this);
        }
    }

    /* renamed from: a */
    public void m3581a(int i10, C0660c c0660c, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C0660c mo3582b(int i10) {
        return null;
    }

    /* renamed from: c */
    public List<C0660c> m3583c(String str, int i10) {
        return null;
    }

    /* renamed from: d */
    public C0660c mo3584d(int i10) {
        return null;
    }

    /* renamed from: e */
    public Object m3585e() {
        return this.f3562a;
    }

    /* renamed from: f */
    public boolean mo3586f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public C0661d(Object obj) {
        this.f3562a = obj;
    }
}
