package p066f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.C0587a;
import androidx.core.content.res.C0591c;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: f.a */
/* loaded from: classes.dex */
public final class C3121a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f13133a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<a>> f13134b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f13135c = new Object();

    /* renamed from: f.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final ColorStateList f13136a;

        /* renamed from: b */
        final Configuration f13137b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f13136a = colorStateList;
            this.f13137b = configuration;
        }
    }

    /* renamed from: a */
    private static void m13767a(Context context, int i10, ColorStateList colorStateList) {
        synchronized (f13135c) {
            WeakHashMap<Context, SparseArray<a>> weakHashMap = f13134b;
            SparseArray<a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i10, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m13768b(Context context, int i10) {
        a aVar;
        synchronized (f13135c) {
            SparseArray<a> sparseArray = f13134b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i10)) != null) {
                if (aVar.f13137b.equals(context.getResources().getConfiguration())) {
                    return aVar.f13136a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m13769c(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i10);
        }
        ColorStateList m13768b = m13768b(context, i10);
        if (m13768b != null) {
            return m13768b;
        }
        ColorStateList m13772f = m13772f(context, i10);
        if (m13772f != null) {
            m13767a(context, i10, m13772f);
            return m13772f;
        }
        return C0587a.m3030d(context, i10);
    }

    /* renamed from: d */
    public static Drawable m13770d(Context context, int i10) {
        return ResourceManagerInternal.get().getDrawable(context, i10);
    }

    /* renamed from: e */
    private static TypedValue m13771e() {
        ThreadLocal<TypedValue> threadLocal = f13133a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: f */
    private static ColorStateList m13772f(Context context, int i10) {
        if (m13773g(context, i10)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0591c.m3078a(resources, resources.getXml(i10), context.getTheme());
        } catch (Exception e10) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m13773g(Context context, int i10) {
        Resources resources = context.getResources();
        TypedValue m13771e = m13771e();
        resources.getValue(i10, m13771e, true);
        int i11 = m13771e.type;
        return i11 >= 28 && i11 <= 31;
    }
}
