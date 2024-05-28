package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.C0593e;
import androidx.core.provider.C0640g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.e */
/* loaded from: classes.dex */
public class C0615e extends C0620j {

    /* renamed from: b */
    private static Class<?> f3357b;

    /* renamed from: c */
    private static Constructor<?> f3358c;

    /* renamed from: d */
    private static Method f3359d;

    /* renamed from: e */
    private static Method f3360e;

    /* renamed from: f */
    private static boolean f3361f;

    /* renamed from: h */
    private static boolean m3288h(Object obj, String str, int i10, boolean z10) {
        m3291k();
        try {
            return ((Boolean) f3359d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: i */
    private static Typeface m3289i(Object obj) {
        m3291k();
        try {
            Object newInstance = Array.newInstance(f3357b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3360e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: j */
    private File m3290j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: k */
    private static void m3291k() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3361f) {
            return;
        }
        f3361f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f3358c = constructor;
        f3357b = cls;
        f3359d = method2;
        f3360e = method;
    }

    /* renamed from: l */
    private static Object m3292l() {
        m3291k();
        try {
            return f3358c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.C0620j
    /* renamed from: a */
    public Typeface mo3293a(Context context, C0593e.c cVar, Resources resources, int i10) {
        Object m3292l = m3292l();
        for (C0593e.d dVar : cVar.m3107a()) {
            File m3328e = C0621k.m3328e(context);
            if (m3328e == null) {
                return null;
            }
            try {
                if (!C0621k.m3326c(m3328e, resources, dVar.m3109b())) {
                    return null;
                }
                if (!m3288h(m3292l, m3328e.getPath(), dVar.m3112e(), dVar.m3113f())) {
                    return null;
                }
                m3328e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m3328e.delete();
            }
        }
        return m3289i(m3292l);
    }

    @Override // androidx.core.graphics.C0620j
    /* renamed from: b */
    public Typeface mo3294b(Context context, CancellationSignal cancellationSignal, C0640g.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File m3290j = m3290j(openFileDescriptor);
                if (m3290j != null && m3290j.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m3290j);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface m3319c = super.m3319c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return m3319c;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
