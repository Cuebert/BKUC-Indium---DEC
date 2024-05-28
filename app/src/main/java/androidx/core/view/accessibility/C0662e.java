package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.accessibility.e */
/* loaded from: classes.dex */
public class C0662e {

    /* renamed from: androidx.core.view.accessibility.e$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m3590a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        static int m3591b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        static void m3592c(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollX(i10);
        }

        /* renamed from: d */
        static void m3593d(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollY(i10);
        }
    }

    /* renamed from: androidx.core.view.accessibility.e$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static void m3594a(AccessibilityRecord accessibilityRecord, View view, int i10) {
            accessibilityRecord.setSource(view, i10);
        }
    }

    /* renamed from: a */
    public static void m3587a(AccessibilityRecord accessibilityRecord, int i10) {
        a.m3592c(accessibilityRecord, i10);
    }

    /* renamed from: b */
    public static void m3588b(AccessibilityRecord accessibilityRecord, int i10) {
        a.m3593d(accessibilityRecord, i10);
    }

    /* renamed from: c */
    public static void m3589c(AccessibilityRecord accessibilityRecord, View view, int i10) {
        b.m3594a(accessibilityRecord, view, i10);
    }
}
