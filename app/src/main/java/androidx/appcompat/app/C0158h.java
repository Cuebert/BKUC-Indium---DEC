package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes.dex */
class C0158h {

    /* renamed from: a */
    private static Field f703a;

    /* renamed from: b */
    private static boolean f704b;

    /* renamed from: c */
    private static Class<?> f705c;

    /* renamed from: d */
    private static boolean f706d;

    /* renamed from: e */
    private static Field f707e;

    /* renamed from: f */
    private static boolean f708f;

    /* renamed from: g */
    private static Field f709g;

    /* renamed from: h */
    private static boolean f710h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m873a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            m876d(resources);
        } else if (i10 >= 23) {
            m875c(resources);
        } else {
            m874b(resources);
        }
    }

    /* renamed from: b */
    private static void m874b(Resources resources) {
        if (!f704b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f703a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f704b = true;
        }
        Field field = f703a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m875c(Resources resources) {
        if (!f704b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f703a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f704b = true;
        }
        Object obj = null;
        Field field = f703a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
        }
        if (obj == null) {
            return;
        }
        m877e(obj);
    }

    /* renamed from: d */
    private static void m876d(Resources resources) {
        Object obj;
        if (!f710h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f709g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f710h = true;
        }
        Field field = f709g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f704b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f703a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f704b = true;
        }
        Field field2 = f703a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            m877e(obj2);
        }
    }

    /* renamed from: e */
    private static void m877e(Object obj) {
        if (!f706d) {
            try {
                f705c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f706d = true;
        }
        Class<?> cls = f705c;
        if (cls == null) {
            return;
        }
        if (!f708f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f707e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f708f = true;
        }
        Field field = f707e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
