package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.C0639f;
import androidx.core.provider.C0640g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.a */
/* loaded from: classes.dex */
public class C0634a {

    /* renamed from: a */
    private final C0640g.c f3402a;

    /* renamed from: b */
    private final Handler f3403b;

    /* renamed from: androidx.core.provider.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ C0640g.c f3404n;

        /* renamed from: o */
        final /* synthetic */ Typeface f3405o;

        a(C0640g.c cVar, Typeface typeface) {
            this.f3404n = cVar;
            this.f3405o = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3404n.mo3210b(this.f3405o);
        }
    }

    /* renamed from: androidx.core.provider.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ C0640g.c f3407n;

        /* renamed from: o */
        final /* synthetic */ int f3408o;

        b(C0640g.c cVar, int i10) {
            this.f3407n = cVar;
            this.f3408o = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3407n.mo3209a(this.f3408o);
        }
    }

    public C0634a(C0640g.c cVar, Handler handler) {
        this.f3402a = cVar;
        this.f3403b = handler;
    }

    /* renamed from: a */
    private void m3366a(int i10) {
        this.f3403b.post(new b(this.f3402a, i10));
    }

    /* renamed from: c */
    private void m3367c(Typeface typeface) {
        this.f3403b.post(new a(this.f3402a, typeface));
    }

    /* renamed from: b */
    public void m3368b(C0639f.e eVar) {
        if (eVar.m3395a()) {
            m3367c(eVar.f3432a);
        } else {
            m3366a(eVar.f3433b);
        }
    }
}
