package qa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;
import qa.C4359t;
import qa.C4362w;

/* renamed from: qa.x */
/* loaded from: classes.dex */
public class C4363x {

    /* renamed from: m */
    private static final AtomicInteger f17819m = new AtomicInteger();

    /* renamed from: a */
    private final C4359t f17820a;

    /* renamed from: b */
    private final C4362w.b f17821b;

    /* renamed from: c */
    private boolean f17822c;

    /* renamed from: d */
    private boolean f17823d;

    /* renamed from: e */
    private boolean f17824e = true;

    /* renamed from: f */
    private int f17825f;

    /* renamed from: g */
    private int f17826g;

    /* renamed from: h */
    private int f17827h;

    /* renamed from: i */
    private int f17828i;

    /* renamed from: j */
    private Drawable f17829j;

    /* renamed from: k */
    private Drawable f17830k;

    /* renamed from: l */
    private Object f17831l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4363x(C4359t c4359t, Uri uri, int i10) {
        if (!c4359t.f17751o) {
            this.f17820a = c4359t;
            this.f17821b = new C4362w.b(uri, i10, c4359t.f17748l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: a */
    private C4362w m18040a(long j10) {
        int andIncrement = f17819m.getAndIncrement();
        C4362w m18035a = this.f17821b.m18035a();
        m18035a.f17786a = andIncrement;
        m18035a.f17787b = j10;
        boolean z10 = this.f17820a.f17750n;
        if (z10) {
            C4346g0.m17951v("Main", "created", m18035a.m18034g(), m18035a.toString());
        }
        C4362w m18017o = this.f17820a.m18017o(m18035a);
        if (m18017o != m18035a) {
            m18017o.f17786a = andIncrement;
            m18017o.f17787b = j10;
            if (z10) {
                C4346g0.m17951v("Main", "changed", m18017o.m18031d(), "into " + m18017o);
            }
        }
        return m18017o;
    }

    /* renamed from: b */
    private Drawable m18041b() {
        if (this.f17825f != 0) {
            return this.f17820a.f17741e.getResources().getDrawable(this.f17825f);
        }
        return this.f17829j;
    }

    /* renamed from: c */
    public void m18042c(ImageView imageView) {
        m18043d(imageView, null);
    }

    /* renamed from: d */
    public void m18043d(ImageView imageView, InterfaceC4341e interfaceC4341e) {
        Bitmap m18014l;
        long nanoTime = System.nanoTime();
        C4346g0.m17932c();
        if (imageView != null) {
            if (!this.f17821b.m18036b()) {
                this.f17820a.m18006c(imageView);
                if (this.f17824e) {
                    C4360u.m18024d(imageView, m18041b());
                    return;
                }
                return;
            }
            if (this.f17823d) {
                if (!this.f17821b.m18037c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.f17821b.m18038d(width, height);
                    } else {
                        if (this.f17824e) {
                            C4360u.m18024d(imageView, m18041b());
                        }
                        this.f17820a.m18009f(imageView, new ViewTreeObserverOnPreDrawListenerC4347h(this, imageView, interfaceC4341e));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C4362w m18040a = m18040a(nanoTime);
            String m17937h = C4346g0.m17937h(m18040a);
            if (EnumC4355p.m17993b(this.f17827h) && (m18014l = this.f17820a.m18014l(m17937h)) != null) {
                this.f17820a.m18006c(imageView);
                C4359t c4359t = this.f17820a;
                Context context = c4359t.f17741e;
                C4359t.e eVar = C4359t.e.MEMORY;
                C4360u.m18023c(imageView, context, m18014l, eVar, this.f17822c, c4359t.f17749m);
                if (this.f17820a.f17750n) {
                    C4346g0.m17951v("Main", "completed", m18040a.m18034g(), "from " + eVar);
                }
                if (interfaceC4341e != null) {
                    interfaceC4341e.onSuccess();
                    return;
                }
                return;
            }
            if (this.f17824e) {
                C4360u.m18024d(imageView, m18041b());
            }
            this.f17820a.m18010h(new C4351l(this.f17820a, imageView, m18040a, this.f17827h, this.f17828i, this.f17826g, this.f17830k, m17937h, this.f17831l, interfaceC4341e, this.f17822c));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    /* renamed from: e */
    public void m18044e(InterfaceC4338c0 interfaceC4338c0) {
        Bitmap m18014l;
        long nanoTime = System.nanoTime();
        C4346g0.m17932c();
        if (interfaceC4338c0 != null) {
            if (!this.f17823d) {
                if (!this.f17821b.m18036b()) {
                    this.f17820a.m18007d(interfaceC4338c0);
                    interfaceC4338c0.mo16000b(this.f17824e ? m18041b() : null);
                    return;
                }
                C4362w m18040a = m18040a(nanoTime);
                String m17937h = C4346g0.m17937h(m18040a);
                if (EnumC4355p.m17993b(this.f17827h) && (m18014l = this.f17820a.m18014l(m17937h)) != null) {
                    this.f17820a.m18007d(interfaceC4338c0);
                    interfaceC4338c0.mo16001c(m18014l, C4359t.e.MEMORY);
                    return;
                } else {
                    interfaceC4338c0.mo16000b(this.f17824e ? m18041b() : null);
                    this.f17820a.m18010h(new C4340d0(this.f17820a, interfaceC4338c0, m18040a, this.f17827h, this.f17828i, this.f17830k, m17937h, this.f17831l, this.f17826g));
                    return;
                }
            }
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    /* renamed from: f */
    public C4363x m18045f(int i10, int i11) {
        this.f17821b.m18038d(i10, i11);
        return this;
    }

    /* renamed from: g */
    public C4363x m18046g(InterfaceC4342e0 interfaceC4342e0) {
        this.f17821b.m18039e(interfaceC4342e0);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C4363x m18047h() {
        this.f17823d = false;
        return this;
    }
}
