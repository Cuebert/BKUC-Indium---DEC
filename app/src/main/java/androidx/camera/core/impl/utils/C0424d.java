package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* renamed from: androidx.camera.core.impl.utils.d */
/* loaded from: classes.dex */
public final class C0424d {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.utils.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static Context m2058a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        /* renamed from: b */
        static String m2059b(Context context) {
            return context.getAttributionTag();
        }
    }

    /* renamed from: a */
    public static Context m2055a(Context context) {
        String m2059b;
        Context applicationContext = context.getApplicationContext();
        return (Build.VERSION.SDK_INT < 30 || (m2059b = a.m2059b(context)) == null) ? applicationContext : a.m2058a(applicationContext, m2059b);
    }

    /* renamed from: b */
    public static Application m2056b(Context context) {
        for (Context m2055a = m2055a(context); m2055a instanceof ContextWrapper; m2055a = m2057c((ContextWrapper) m2055a)) {
            if (m2055a instanceof Application) {
                return (Application) m2055a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Context m2057c(ContextWrapper contextWrapper) {
        String m2059b;
        Context baseContext = contextWrapper.getBaseContext();
        return (Build.VERSION.SDK_INT < 30 || (m2059b = a.m2059b(contextWrapper)) == null) ? baseContext : a.m2058a(baseContext, m2059b);
    }
}
