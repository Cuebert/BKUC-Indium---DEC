package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.graphics.C0604d;
import androidx.core.provider.C0640g;
import androidx.core.util.InterfaceC0647a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p093h0.C3360e;
import p093h0.C3362g;

/* renamed from: androidx.core.provider.f */
/* loaded from: classes.dex */
public class C0639f {

    /* renamed from: a */
    static final C3360e<String, Typeface> f3418a = new C3360e<>(16);

    /* renamed from: b */
    private static final ExecutorService f3419b = C0641h.m3406a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f3420c = new Object();

    /* renamed from: d */
    static final C3362g<String, ArrayList<InterfaceC0647a<e>>> f3421d = new C3362g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$a */
    /* loaded from: classes.dex */
    public class a implements Callable<e> {

        /* renamed from: a */
        final /* synthetic */ String f3422a;

        /* renamed from: b */
        final /* synthetic */ Context f3423b;

        /* renamed from: c */
        final /* synthetic */ C0638e f3424c;

        /* renamed from: d */
        final /* synthetic */ int f3425d;

        a(String str, Context context, C0638e c0638e, int i10) {
            this.f3422a = str;
            this.f3423b = context;
            this.f3424c = c0638e;
            this.f3425d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            return C0639f.m3388c(this.f3422a, this.f3423b, this.f3424c, this.f3425d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0647a<e> {

        /* renamed from: a */
        final /* synthetic */ C0634a f3426a;

        b(C0634a c0634a) {
            this.f3426a = c0634a;
        }

        @Override // androidx.core.util.InterfaceC0647a
        /* renamed from: b */
        public void mo2469a(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f3426a.m3368b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$c */
    /* loaded from: classes.dex */
    public class c implements Callable<e> {

        /* renamed from: a */
        final /* synthetic */ String f3427a;

        /* renamed from: b */
        final /* synthetic */ Context f3428b;

        /* renamed from: c */
        final /* synthetic */ C0638e f3429c;

        /* renamed from: d */
        final /* synthetic */ int f3430d;

        c(String str, Context context, C0638e c0638e, int i10) {
            this.f3427a = str;
            this.f3428b = context;
            this.f3429c = c0638e;
            this.f3430d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            try {
                return C0639f.m3388c(this.f3427a, this.f3428b, this.f3429c, this.f3430d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC0647a<e> {

        /* renamed from: a */
        final /* synthetic */ String f3431a;

        d(String str) {
            this.f3431a = str;
        }

        @Override // androidx.core.util.InterfaceC0647a
        /* renamed from: b */
        public void mo2469a(e eVar) {
            synchronized (C0639f.f3420c) {
                C3362g<String, ArrayList<InterfaceC0647a<e>>> c3362g = C0639f.f3421d;
                ArrayList<InterfaceC0647a<e>> arrayList = c3362g.get(this.f3431a);
                if (arrayList == null) {
                    return;
                }
                c3362g.remove(this.f3431a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).mo2469a(eVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m3386a(C0638e c0638e, int i10) {
        return c0638e.m3382d() + "-" + i10;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m3387b(C0640g.a aVar) {
        int i10 = 1;
        if (aVar.m3399c() != 0) {
            return aVar.m3399c() != 1 ? -3 : -2;
        }
        C0640g.b[] m3398b = aVar.m3398b();
        if (m3398b != null && m3398b.length != 0) {
            i10 = 0;
            for (C0640g.b bVar : m3398b) {
                int m3401b = bVar.m3401b();
                if (m3401b != 0) {
                    if (m3401b < 0) {
                        return -3;
                    }
                    return m3401b;
                }
            }
        }
        return i10;
    }

    /* renamed from: c */
    static e m3388c(String str, Context context, C0638e c0638e, int i10) {
        C3360e<String, Typeface> c3360e = f3418a;
        Typeface m14815c = c3360e.m14815c(str);
        if (m14815c != null) {
            return new e(m14815c);
        }
        try {
            C0640g.a m3374e = C0637d.m3374e(context, c0638e, null);
            int m3387b = m3387b(m3374e);
            if (m3387b != 0) {
                return new e(m3387b);
            }
            Typeface m3203b = C0604d.m3203b(context, null, m3374e.m3398b(), i10);
            if (m3203b != null) {
                c3360e.m14816d(str, m3203b);
                return new e(m3203b);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* renamed from: d */
    public static Typeface m3389d(Context context, C0638e c0638e, int i10, Executor executor, C0634a c0634a) {
        String m3386a = m3386a(c0638e, i10);
        Typeface m14815c = f3418a.m14815c(m3386a);
        if (m14815c != null) {
            c0634a.m3368b(new e(m14815c));
            return m14815c;
        }
        b bVar = new b(c0634a);
        synchronized (f3420c) {
            C3362g<String, ArrayList<InterfaceC0647a<e>>> c3362g = f3421d;
            ArrayList<InterfaceC0647a<e>> arrayList = c3362g.get(m3386a);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<InterfaceC0647a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            c3362g.put(m3386a, arrayList2);
            c cVar = new c(m3386a, context, c0638e, i10);
            if (executor == null) {
                executor = f3419b;
            }
            C0641h.m3407b(executor, cVar, new d(m3386a));
            return null;
        }
    }

    /* renamed from: e */
    public static Typeface m3390e(Context context, C0638e c0638e, C0634a c0634a, int i10, int i11) {
        String m3386a = m3386a(c0638e, i10);
        Typeface m14815c = f3418a.m14815c(m3386a);
        if (m14815c != null) {
            c0634a.m3368b(new e(m14815c));
            return m14815c;
        }
        if (i11 == -1) {
            e m3388c = m3388c(m3386a, context, c0638e, i10);
            c0634a.m3368b(m3388c);
            return m3388c.f3432a;
        }
        try {
            e eVar = (e) C0641h.m3408c(f3419b, new a(m3386a, context, c0638e, i10), i11);
            c0634a.m3368b(eVar);
            return eVar.f3432a;
        } catch (InterruptedException unused) {
            c0634a.m3368b(new e(-3));
            return null;
        }
    }

    /* renamed from: androidx.core.provider.f$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        final Typeface f3432a;

        /* renamed from: b */
        final int f3433b;

        e(int i10) {
            this.f3432a = null;
            this.f3433b = i10;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean m3395a() {
            return this.f3433b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f3432a = typeface;
            this.f3433b = 0;
        }
    }
}
