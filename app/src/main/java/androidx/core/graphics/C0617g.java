package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.C0593e;
import androidx.core.provider.C0640g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.g */
/* loaded from: classes.dex */
public class C0617g extends C0615e {

    /* renamed from: g */
    protected final Class<?> f3366g;

    /* renamed from: h */
    protected final Constructor<?> f3367h;

    /* renamed from: i */
    protected final Method f3368i;

    /* renamed from: j */
    protected final Method f3369j;

    /* renamed from: k */
    protected final Method f3370k;

    /* renamed from: l */
    protected final Method f3371l;

    /* renamed from: m */
    protected final Method f3372m;

    public C0617g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> m3311v = m3311v();
            constructor = m3312w(m3311v);
            method2 = m3308s(m3311v);
            method3 = m3309t(m3311v);
            method4 = m3313x(m3311v);
            method5 = m3307r(m3311v);
            method = mo3310u(m3311v);
            cls = m3311v;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f3366g = cls;
        this.f3367h = constructor;
        this.f3368i = method2;
        this.f3369j = method3;
        this.f3370k = method4;
        this.f3371l = method5;
        this.f3372m = method;
    }

    /* renamed from: l */
    private Object m3299l() {
        try {
            return this.f3367h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    private void m3300m(Object obj) {
        try {
            this.f3371l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: n */
    private boolean m3301n(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3368i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    private boolean m3302o(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f3369j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    private boolean m3303p(Object obj) {
        try {
            return ((Boolean) this.f3370k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q */
    private boolean m3304q() {
        if (this.f3368i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f3368i != null;
    }

    @Override // androidx.core.graphics.C0615e, androidx.core.graphics.C0620j
    /* renamed from: a */
    public Typeface mo3293a(Context context, C0593e.c cVar, Resources resources, int i10) {
        if (!m3304q()) {
            return super.mo3293a(context, cVar, resources, i10);
        }
        Object m3299l = m3299l();
        if (m3299l == null) {
            return null;
        }
        for (C0593e.d dVar : cVar.m3107a()) {
            if (!m3301n(context, m3299l, dVar.m3108a(), dVar.m3110c(), dVar.m3112e(), dVar.m3113f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.m3111d()))) {
                m3300m(m3299l);
                return null;
            }
        }
        if (m3303p(m3299l)) {
            return mo3306i(m3299l);
        }
        return null;
    }

    @Override // androidx.core.graphics.C0615e, androidx.core.graphics.C0620j
    /* renamed from: b */
    public Typeface mo3294b(Context context, CancellationSignal cancellationSignal, C0640g.b[] bVarArr, int i10) {
        Typeface mo3306i;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m3304q()) {
            C0640g.b mo3316g = mo3316g(bVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo3316g.m3403d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo3316g.m3404e()).setItalic(mo3316g.m3405f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m3331h = C0621k.m3331h(context, bVarArr, cancellationSignal);
        Object m3299l = m3299l();
        if (m3299l == null) {
            return null;
        }
        boolean z10 = false;
        for (C0640g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = m3331h.get(bVar.m3403d());
            if (byteBuffer != null) {
                if (!m3302o(m3299l, byteBuffer, bVar.m3402c(), bVar.m3404e(), bVar.m3405f() ? 1 : 0)) {
                    m3300m(m3299l);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            m3300m(m3299l);
            return null;
        }
        if (m3303p(m3299l) && (mo3306i = mo3306i(m3299l)) != null) {
            return Typeface.create(mo3306i, i10);
        }
        return null;
    }

    @Override // androidx.core.graphics.C0620j
    /* renamed from: d */
    public Typeface mo3305d(Context context, Resources resources, int i10, String str, int i11) {
        if (!m3304q()) {
            return super.mo3305d(context, resources, i10, str, i11);
        }
        Object m3299l = m3299l();
        if (m3299l == null) {
            return null;
        }
        if (!m3301n(context, m3299l, str, 0, -1, -1, null)) {
            m3300m(m3299l);
            return null;
        }
        if (m3303p(m3299l)) {
            return mo3306i(m3299l);
        }
        return null;
    }

    /* renamed from: i */
    protected Typeface mo3306i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3366g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3372m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: r */
    protected Method m3307r(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: s */
    protected Method m3308s(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: t */
    protected Method m3309t(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: u */
    protected Method mo3310u(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: v */
    protected Class<?> m3311v() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: w */
    protected Constructor<?> m3312w(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: x */
    protected Method m3313x(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }
}
