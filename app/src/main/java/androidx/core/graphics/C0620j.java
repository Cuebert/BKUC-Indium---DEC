package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.C0593e;
import androidx.core.provider.C0640g;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.core.graphics.j */
/* loaded from: classes.dex */
public class C0620j {

    /* renamed from: a */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, C0593e.c> f3373a = new ConcurrentHashMap<>();

    /* renamed from: androidx.core.graphics.j$a */
    /* loaded from: classes.dex */
    public class a implements b<C0640g.b> {
        a() {
        }

        @Override // androidx.core.graphics.C0620j.b
        /* renamed from: c */
        public int mo3320a(C0640g.b bVar) {
            return bVar.m3404e();
        }

        @Override // androidx.core.graphics.C0620j.b
        /* renamed from: d */
        public boolean mo3321b(C0640g.b bVar) {
            return bVar.m3405f();
        }
    }

    /* renamed from: androidx.core.graphics.j$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        /* renamed from: a */
        int mo3320a(T t10);

        /* renamed from: b */
        boolean mo3321b(T t10);
    }

    /* renamed from: e */
    private static <T> T m3317e(T[] tArr, int i10, b<T> bVar) {
        return (T) m3318f(tArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    /* renamed from: f */
    private static <T> T m3318f(T[] tArr, int i10, boolean z10, b<T> bVar) {
        T t10 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int abs = (Math.abs(bVar.mo3320a(t11) - i10) * 2) + (bVar.mo3321b(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > abs) {
                t10 = t11;
                i11 = abs;
            }
        }
        return t10;
    }

    /* renamed from: a */
    public Typeface mo3293a(Context context, C0593e.c cVar, Resources resources, int i10) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo3294b(Context context, CancellationSignal cancellationSignal, C0640g.b[] bVarArr, int i10) {
        throw null;
    }

    /* renamed from: c */
    public Typeface m3319c(Context context, InputStream inputStream) {
        File m3328e = C0621k.m3328e(context);
        if (m3328e == null) {
            return null;
        }
        try {
            if (C0621k.m3327d(m3328e, inputStream)) {
                return Typeface.createFromFile(m3328e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m3328e.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo3305d(Context context, Resources resources, int i10, String str, int i11) {
        File m3328e = C0621k.m3328e(context);
        if (m3328e == null) {
            return null;
        }
        try {
            if (C0621k.m3326c(m3328e, resources, i10)) {
                return Typeface.createFromFile(m3328e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m3328e.delete();
        }
    }

    /* renamed from: g */
    public C0640g.b mo3316g(C0640g.b[] bVarArr, int i10) {
        return (C0640g.b) m3317e(bVarArr, i10, new a());
    }
}
