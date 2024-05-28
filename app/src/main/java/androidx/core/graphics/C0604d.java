package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.C0593e;
import androidx.core.content.res.C0596h;
import androidx.core.provider.C0640g;
import p093h0.C3360e;

/* renamed from: androidx.core.graphics.d */
/* loaded from: classes.dex */
public class C0604d {

    /* renamed from: a */
    private static final C0620j f3327a;

    /* renamed from: b */
    private static final C3360e<String, Typeface> f3328b;

    /* renamed from: androidx.core.graphics.d$a */
    /* loaded from: classes.dex */
    public static class a extends C0640g.c {

        /* renamed from: a */
        private C0596h.e f3329a;

        public a(C0596h.e eVar) {
            this.f3329a = eVar;
        }

        @Override // androidx.core.provider.C0640g.c
        /* renamed from: a */
        public void mo3209a(int i10) {
            C0596h.e eVar = this.f3329a;
            if (eVar != null) {
                eVar.m3145f(i10);
            }
        }

        @Override // androidx.core.provider.C0640g.c
        /* renamed from: b */
        public void mo3210b(Typeface typeface) {
            C0596h.e eVar = this.f3329a;
            if (eVar != null) {
                eVar.m3146g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f3327a = new C0619i();
        } else if (i10 >= 28) {
            f3327a = new C0618h();
        } else if (i10 >= 26) {
            f3327a = new C0617g();
        } else if (i10 >= 24 && C0616f.m3297j()) {
            f3327a = new C0616f();
        } else {
            f3327a = new C0615e();
        }
        f3328b = new C3360e<>(16);
    }

    /* renamed from: a */
    public static Typeface m3202a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m3203b(Context context, CancellationSignal cancellationSignal, C0640g.b[] bVarArr, int i10) {
        return f3327a.mo3294b(context, cancellationSignal, bVarArr, i10);
    }

    /* renamed from: c */
    public static Typeface m3204c(Context context, C0593e.b bVar, Resources resources, int i10, String str, int i11, int i12, C0596h.e eVar, Handler handler, boolean z10) {
        Typeface mo3293a;
        if (bVar instanceof C0593e.e) {
            C0593e.e eVar2 = (C0593e.e) bVar;
            Typeface m3208g = m3208g(eVar2.m3116c());
            if (m3208g != null) {
                if (eVar != null) {
                    eVar.m3148d(m3208g, handler);
                }
                return m3208g;
            }
            mo3293a = C0640g.m3396a(context, eVar2.m3115b(), i12, !z10 ? eVar != null : eVar2.m3114a() != 0, z10 ? eVar2.m3117d() : -1, C0596h.e.m3144e(handler), new a(eVar));
        } else {
            mo3293a = f3327a.mo3293a(context, (C0593e.c) bVar, resources, i12);
            if (eVar != null) {
                if (mo3293a != null) {
                    eVar.m3148d(mo3293a, handler);
                } else {
                    eVar.m3147c(-3, handler);
                }
            }
        }
        if (mo3293a != null) {
            f3328b.m14816d(m3206e(resources, i10, str, i11, i12), mo3293a);
        }
        return mo3293a;
    }

    /* renamed from: d */
    public static Typeface m3205d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface mo3305d = f3327a.mo3305d(context, resources, i10, str, i12);
        if (mo3305d != null) {
            f3328b.m14816d(m3206e(resources, i10, str, i11, i12), mo3305d);
        }
        return mo3305d;
    }

    /* renamed from: e */
    private static String m3206e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    /* renamed from: f */
    public static Typeface m3207f(Resources resources, int i10, String str, int i11, int i12) {
        return f3328b.m14815c(m3206e(resources, i10, str, i11, i12));
    }

    /* renamed from: g */
    private static Typeface m3208g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
