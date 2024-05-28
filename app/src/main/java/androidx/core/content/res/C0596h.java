package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.C0596h;
import androidx.core.util.C0649c;
import androidx.core.util.C0654h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.h */
/* loaded from: classes.dex */
public final class C0596h {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3291a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<d, SparseArray<c>> f3292b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3293c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.h$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static Drawable m3138a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        /* renamed from: b */
        static Drawable m3139b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static int m3140a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        /* renamed from: b */
        static ColorStateList m3141b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final ColorStateList f3294a;

        /* renamed from: b */
        final Configuration f3295b;

        /* renamed from: c */
        final int f3296c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f3294a = colorStateList;
            this.f3295b = configuration;
            this.f3296c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: androidx.core.content.res.h$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        final Resources f3297a;

        /* renamed from: b */
        final Resources.Theme f3298b;

        d(Resources resources, Resources.Theme theme) {
            this.f3297a = resources;
            this.f3298b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f3297a.equals(dVar.f3297a) && C0649c.m3452a(this.f3298b, dVar.f3298b);
        }

        public int hashCode() {
            return C0649c.m3453b(this.f3297a, this.f3298b);
        }
    }

    /* renamed from: androidx.core.content.res.h$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        /* renamed from: e */
        public static Handler m3144e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void m3147c(int i10, Handler handler) {
            m3144e(handler).post(new Runnable() { // from class: androidx.core.content.res.i

                /* renamed from: o */
                public final /* synthetic */ int f3303o;

                public /* synthetic */ RunnableC0597i(int i102) {
                    r2 = i102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0596h.e.this.m3145f(r2);
                }
            });
        }

        /* renamed from: d */
        public final void m3148d(Typeface typeface, Handler handler) {
            m3144e(handler).post(new Runnable() { // from class: androidx.core.content.res.j

                /* renamed from: o */
                public final /* synthetic */ Typeface f3305o;

                public /* synthetic */ RunnableC0598j(Typeface typeface2) {
                    r2 = typeface2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0596h.e.this.m3146g(r2);
                }
            });
        }

        /* renamed from: h */
        public abstract void m3145f(int i10);

        /* renamed from: i */
        public abstract void m3146g(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.h$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.res.h$f$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private static final Object f3299a = new Object();

            /* renamed from: b */
            private static Method f3300b;

            /* renamed from: c */
            private static boolean f3301c;

            @SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            static void m3150a(Resources.Theme theme) {
                synchronized (f3299a) {
                    if (!f3301c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f3300b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f3301c = true;
                    }
                    Method method = f3300b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f3300b = null;
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.res.h$f$b */
        /* loaded from: classes.dex */
        public static class b {
            /* renamed from: a */
            static void m3151a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m3149a(Resources.Theme theme) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.m3151a(theme);
            } else if (i10 >= 23) {
                a.m3150a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m3125a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f3293c) {
            WeakHashMap<d, SparseArray<c>> weakHashMap = f3292b;
            SparseArray<c> sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i10, new c(colorStateList, dVar.f3297a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    private static ColorStateList m3126b(d dVar, int i10) {
        c cVar;
        Resources.Theme theme;
        synchronized (f3293c) {
            SparseArray<c> sparseArray = f3292b.get(dVar);
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i10)) != null) {
                if (cVar.f3295b.equals(dVar.f3297a.getConfiguration()) && (((theme = dVar.f3298b) == null && cVar.f3296c == 0) || (theme != null && cVar.f3296c == theme.hashCode()))) {
                    return cVar.f3294a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static Typeface m3127c(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m3136l(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    /* renamed from: d */
    public static ColorStateList m3128d(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        d dVar = new d(resources, theme);
        ColorStateList m3126b = m3126b(dVar, i10);
        if (m3126b != null) {
            return m3126b;
        }
        ColorStateList m3134j = m3134j(resources, i10, theme);
        if (m3134j != null) {
            m3125a(dVar, i10, m3134j, theme);
            return m3134j;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return b.m3141b(resources, i10, theme);
        }
        return resources.getColorStateList(i10);
    }

    /* renamed from: e */
    public static Drawable m3129e(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return a.m3138a(resources, i10, theme);
    }

    /* renamed from: f */
    public static Typeface m3130f(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m3136l(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: g */
    public static Typeface m3131g(Context context, int i10, TypedValue typedValue, int i11, e eVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m3136l(context, i10, typedValue, i11, eVar, null, true, false);
    }

    /* renamed from: h */
    public static void m3132h(Context context, int i10, e eVar, Handler handler) throws Resources.NotFoundException {
        C0654h.m3467f(eVar);
        if (context.isRestricted()) {
            eVar.m3147c(-4, handler);
        } else {
            m3136l(context, i10, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    /* renamed from: i */
    private static TypedValue m3133i() {
        ThreadLocal<TypedValue> threadLocal = f3291a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: j */
    private static ColorStateList m3134j(Resources resources, int i10, Resources.Theme theme) {
        if (m3135k(resources, i10)) {
            return null;
        }
        try {
            return C0591c.m3078a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    /* renamed from: k */
    private static boolean m3135k(Resources resources, int i10) {
        TypedValue m3133i = m3133i();
        resources.getValue(i10, m3133i, true);
        int i11 = m3133i.type;
        return i11 >= 28 && i11 <= 31;
    }

    /* renamed from: l */
    private static Typeface m3136l(Context context, int i10, TypedValue typedValue, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface m3137m = m3137m(context, resources, typedValue, i10, i11, eVar, handler, z10, z11);
        if (m3137m != null || eVar != null || z11) {
            return m3137m;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m3137m(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.C0596h.e r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lbb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L25
            if (r11 == 0) goto L24
            r11.m3147c(r15, r12)
        L24:
            return r16
        L25:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.C0604d.m3207f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L35
            if (r11 == 0) goto L34
            r11.m3148d(r2, r12)
        L34:
            return r2
        L35:
            if (r25 == 0) goto L38
            return r16
        L38:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 == 0) goto L6f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            androidx.core.content.res.e$b r2 = androidx.core.content.res.C0593e.m3099b(r2, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 != 0) goto L59
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L58
            r11.m3147c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L58:
            return r16
        L59:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.C0604d.m3204c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            return r0
        L6f:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.C0604d.m3205d(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L89
            if (r0 == 0) goto L86
            r11.m3148d(r0, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            goto L89
        L86:
            r11.m3147c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L89:
            return r0
        L8a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto Lb5
        La0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        Lb5:
            if (r11 == 0) goto Lba
            r11.m3147c(r15, r12)
        Lba:
            return r16
        Lbb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0596h.m3137m(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
