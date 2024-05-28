package p300x7;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import p035c9.C1151k;

/* renamed from: x7.d */
/* loaded from: classes.dex */
public class C5562d {

    /* renamed from: a */
    private boolean f20644a;

    /* renamed from: b */
    private final Handler f20645b;

    /* renamed from: c */
    private final ArrayList<e> f20646c;

    /* renamed from: x7.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ e f20647n;

        a(e eVar) {
            this.f20647n = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5562d.this.f20646c.contains(this.f20647n)) {
                return;
            }
            C5562d.this.f20646c.add(this.f20647n);
        }
    }

    /* renamed from: x7.d$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ e f20649n;

        b(e eVar) {
            this.f20649n = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
            } while (C5562d.this.f20646c.remove(this.f20649n));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x7.d$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ int f20651n;

        /* renamed from: o */
        final /* synthetic */ Bundle f20652o;

        c(int i10, Bundle bundle) {
            this.f20651n = i10;
            this.f20652o = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = C5562d.this.f20646c.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                C1151k.m6712f("NotificationManager", "observer= " + eVar.getClass() + ". notificationId= " + this.f20651n + ".");
                eVar.mo12170q(this.f20651n, this.f20652o);
            }
        }
    }

    /* renamed from: x7.d$d */
    /* loaded from: classes.dex */
    private static class d {

        /* renamed from: a */
        static final C5562d f20654a = new C5562d(null);
    }

    /* renamed from: x7.d$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: q */
        void mo12170q(int i10, Bundle bundle);
    }

    /* synthetic */ C5562d(a aVar) {
        this();
    }

    /* renamed from: c */
    public static C5562d m20371c() {
        return d.f20654a;
    }

    /* renamed from: e */
    private void m20372e(int i10, Bundle bundle) {
        this.f20645b.post(new c(i10, bundle));
    }

    /* renamed from: b */
    public void m20373b(e eVar) {
        if (this.f20644a) {
            this.f20645b.post(new a(eVar));
            return;
        }
        throw new IllegalStateException("NotificationManager was not initialized");
    }

    /* renamed from: d */
    public void m20374d(Context context) {
        C1151k.m6712f("NotificationManager", "init:");
        this.f20644a = true;
    }

    /* renamed from: f */
    public void m20375f(int i10, Bundle bundle) {
        if (this.f20644a) {
            m20372e(i10, bundle);
            return;
        }
        throw new IllegalStateException("NotificationManager was not initialized");
    }

    /* renamed from: g */
    public void m20376g(e eVar) {
        if (this.f20644a) {
            this.f20645b.post(new b(eVar));
            return;
        }
        throw new IllegalStateException("NotificationManager was not initialized");
    }

    private C5562d() {
        this.f20645b = new Handler(Looper.getMainLooper());
        this.f20646c = new ArrayList<>();
    }
}
