package qa;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import qa.C4359t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.a */
/* loaded from: classes.dex */
public abstract class AbstractC4333a<T> {

    /* renamed from: a */
    final C4359t f17591a;

    /* renamed from: b */
    final C4362w f17592b;

    /* renamed from: c */
    final WeakReference<T> f17593c;

    /* renamed from: d */
    final boolean f17594d;

    /* renamed from: e */
    final int f17595e;

    /* renamed from: f */
    final int f17596f;

    /* renamed from: g */
    final int f17597g;

    /* renamed from: h */
    final Drawable f17598h;

    /* renamed from: i */
    final String f17599i;

    /* renamed from: j */
    final Object f17600j;

    /* renamed from: k */
    boolean f17601k;

    /* renamed from: l */
    boolean f17602l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qa.a$a */
    /* loaded from: classes.dex */
    public static class a<M> extends WeakReference<M> {

        /* renamed from: a */
        final AbstractC4333a f17603a;

        public a(AbstractC4333a abstractC4333a, M m10, ReferenceQueue<? super M> referenceQueue) {
            super(m10, referenceQueue);
            this.f17603a = abstractC4333a;
        }
    }

    public AbstractC4333a(C4359t c4359t, T t10, C4362w c4362w, int i10, int i11, int i12, Drawable drawable, String str, Object obj, boolean z10) {
        this.f17591a = c4359t;
        this.f17592b = c4362w;
        this.f17593c = t10 == null ? null : new a(this, t10, c4359t.f17747k);
        this.f17595e = i10;
        this.f17596f = i11;
        this.f17594d = z10;
        this.f17597g = i12;
        this.f17598h = drawable;
        this.f17599i = str;
        this.f17600j = obj == null ? this : obj;
    }

    /* renamed from: a */
    public void mo17864a() {
        this.f17602l = true;
    }

    /* renamed from: b */
    public abstract void mo17865b(Bitmap bitmap, C4359t.e eVar);

    /* renamed from: c */
    public abstract void mo17866c();

    /* renamed from: d */
    public String m17867d() {
        return this.f17599i;
    }

    /* renamed from: e */
    public int m17868e() {
        return this.f17595e;
    }

    /* renamed from: f */
    public int m17869f() {
        return this.f17596f;
    }

    /* renamed from: g */
    public C4359t m17870g() {
        return this.f17591a;
    }

    /* renamed from: h */
    public C4359t.f m17871h() {
        return this.f17592b.f17803r;
    }

    /* renamed from: i */
    public C4362w m17872i() {
        return this.f17592b;
    }

    /* renamed from: j */
    public Object m17873j() {
        return this.f17600j;
    }

    /* renamed from: k */
    public T m17874k() {
        WeakReference<T> weakReference = this.f17593c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: l */
    public boolean m17875l() {
        return this.f17602l;
    }

    /* renamed from: m */
    public boolean m17876m() {
        return this.f17601k;
    }
}
