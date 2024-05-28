package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.g */
/* loaded from: classes.dex */
public final class C0705g {

    /* renamed from: androidx.core.widget.g$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static boolean m4152a(ListView listView, int i10) {
            return listView.canScrollList(i10);
        }

        /* renamed from: b */
        static void m4153b(ListView listView, int i10) {
            listView.scrollListBy(i10);
        }
    }

    /* renamed from: a */
    public static boolean m4150a(ListView listView, int i10) {
        return a.m4152a(listView, i10);
    }

    /* renamed from: b */
    public static void m4151b(ListView listView, int i10) {
        a.m4153b(listView, i10);
    }
}
