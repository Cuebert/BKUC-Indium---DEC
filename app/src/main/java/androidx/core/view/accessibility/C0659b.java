package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.accessibility.b */
/* loaded from: classes.dex */
public final class C0659b {

    /* renamed from: androidx.core.view.accessibility.b$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m3494a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        static void m3495b(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* renamed from: a */
    public static int m3492a(AccessibilityEvent accessibilityEvent) {
        return a.m3494a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m3493b(AccessibilityEvent accessibilityEvent, int i10) {
        a.m3495b(accessibilityEvent, i10);
    }
}
