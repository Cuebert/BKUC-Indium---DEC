package p272v4;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: v4.b */
/* loaded from: classes.dex */
public class C4980b {
    /* renamed from: a */
    public static TypedValue m19400a(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m19401b(Context context, int i10, boolean z10) {
        TypedValue m19400a = m19400a(context, i10);
        return (m19400a == null || m19400a.type != 18) ? z10 : m19400a.data != 0;
    }

    /* renamed from: c */
    public static int m19402c(Context context, int i10, String str) {
        TypedValue m19400a = m19400a(context, i10);
        if (m19400a != null) {
            return m19400a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    /* renamed from: d */
    public static int m19403d(View view, int i10) {
        return m19402c(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}
