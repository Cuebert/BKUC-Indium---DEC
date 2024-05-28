package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.C0593e;
import androidx.core.provider.C0640g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p093h0.C3362g;

/* renamed from: androidx.core.graphics.f */
/* loaded from: classes.dex */
class C0616f extends C0620j {

    /* renamed from: b */
    private static final Class<?> f3362b;

    /* renamed from: c */
    private static final Constructor<?> f3363c;

    /* renamed from: d */
    private static final Method f3364d;

    /* renamed from: e */
    private static final Method f3365e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f3363c = constructor;
        f3362b = cls;
        f3364d = method2;
        f3365e = method;
    }

    /* renamed from: h */
    private static boolean m3295h(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f3364d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    private static Typeface m3296i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f3362b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3365e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m3297j() {
        Method method = f3364d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: k */
    private static Object m3298k() {
        try {
            return f3363c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0620j
    /* renamed from: a */
    public Typeface mo3293a(Context context, C0593e.c cVar, Resources resources, int i10) {
        Object m3298k = m3298k();
        if (m3298k == null) {
            return null;
        }
        for (C0593e.d dVar : cVar.m3107a()) {
            ByteBuffer m3325b = C0621k.m3325b(context, resources, dVar.m3109b());
            if (m3325b == null || !m3295h(m3298k, m3325b, dVar.m3110c(), dVar.m3112e(), dVar.m3113f())) {
                return null;
            }
        }
        return m3296i(m3298k);
    }

    @Override // androidx.core.graphics.C0620j
    /* renamed from: b */
    public Typeface mo3294b(Context context, CancellationSignal cancellationSignal, C0640g.b[] bVarArr, int i10) {
        Object m3298k = m3298k();
        if (m3298k == null) {
            return null;
        }
        C3362g c3362g = new C3362g();
        for (C0640g.b bVar : bVarArr) {
            Uri m3403d = bVar.m3403d();
            ByteBuffer byteBuffer = (ByteBuffer) c3362g.get(m3403d);
            if (byteBuffer == null) {
                byteBuffer = C0621k.m3329f(context, cancellationSignal, m3403d);
                c3362g.put(m3403d, byteBuffer);
            }
            if (byteBuffer == null || !m3295h(m3298k, byteBuffer, bVar.m3402c(), bVar.m3404e(), bVar.m3405f())) {
                return null;
            }
        }
        Typeface m3296i = m3296i(m3298k);
        if (m3296i == null) {
            return null;
        }
        return Typeface.create(m3296i, i10);
    }
}
