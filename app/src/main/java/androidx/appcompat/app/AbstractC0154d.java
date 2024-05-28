package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p053e.InterfaceC3054a;
import p093h0.C3357b;

/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public abstract class AbstractC0154d {

    /* renamed from: n */
    private static int f596n = -100;

    /* renamed from: o */
    private static final C3357b<WeakReference<AbstractC0154d>> f597o = new C3357b<>();

    /* renamed from: p */
    private static final Object f598p = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m732c(AbstractC0154d abstractC0154d) {
        synchronized (f598p) {
            m737y(abstractC0154d);
            f597o.add(new WeakReference<>(abstractC0154d));
        }
    }

    /* renamed from: g */
    public static AbstractC0154d m733g(Activity activity, InterfaceC3054a interfaceC3054a) {
        return new LayoutInflaterFactory2C0155e(activity, interfaceC3054a);
    }

    /* renamed from: h */
    public static AbstractC0154d m734h(Dialog dialog, InterfaceC3054a interfaceC3054a) {
        return new LayoutInflaterFactory2C0155e(dialog, interfaceC3054a);
    }

    /* renamed from: j */
    public static int m735j() {
        return f596n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m736x(AbstractC0154d abstractC0154d) {
        synchronized (f598p) {
            m737y(abstractC0154d);
        }
    }

    /* renamed from: y */
    private static void m737y(AbstractC0154d abstractC0154d) {
        synchronized (f598p) {
            Iterator<WeakReference<AbstractC0154d>> it = f597o.iterator();
            while (it.hasNext()) {
                AbstractC0154d abstractC0154d2 = it.next().get();
                if (abstractC0154d2 == abstractC0154d || abstractC0154d2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo738A(int i10);

    /* renamed from: B */
    public abstract void mo739B(View view);

    /* renamed from: C */
    public abstract void mo740C(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: D */
    public void mo741D(int i10) {
    }

    /* renamed from: E */
    public abstract void mo742E(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo743d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void m744e(Context context) {
    }

    /* renamed from: f */
    public Context mo745f(Context context) {
        m744e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo746i(int i10);

    /* renamed from: k */
    public int mo747k() {
        return -100;
    }

    /* renamed from: l */
    public abstract MenuInflater mo748l();

    /* renamed from: m */
    public abstract AbstractC0151a mo749m();

    /* renamed from: n */
    public abstract void mo750n();

    /* renamed from: o */
    public abstract void mo751o();

    /* renamed from: p */
    public abstract void mo752p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo753q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo754r();

    /* renamed from: s */
    public abstract void mo755s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo756t();

    /* renamed from: u */
    public abstract void mo757u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo758v();

    /* renamed from: w */
    public abstract void mo759w();

    /* renamed from: z */
    public abstract boolean mo760z(int i10);
}
