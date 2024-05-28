package androidx.camera.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.AbstractC0479u1;
import androidx.camera.core.C0403e3;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0492x2;
import androidx.camera.core.C0499z1;
import androidx.camera.core.impl.utils.C0432l;
import androidx.camera.view.AbstractC0524k;
import androidx.camera.view.PreviewView;
import androidx.core.content.C0587a;
import androidx.core.view.C0690v;
import androidx.lifecycle.C0851r;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p054e0.C3056a;
import p054e0.C3058c;
import p054e0.C3059d;
import p067f0.C3122a;
import p279w.InterfaceC5009b0;
import p279w.InterfaceC5017d0;

/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: A */
    private static final EnumC0510d f2263A = EnumC0510d.PERFORMANCE;

    /* renamed from: n */
    EnumC0510d f2264n;

    /* renamed from: o */
    AbstractC0524k f2265o;

    /* renamed from: p */
    final C0519f f2266p;

    /* renamed from: q */
    boolean f2267q;

    /* renamed from: r */
    final C0851r<EnumC0513g> f2268r;

    /* renamed from: s */
    final AtomicReference<C0518e> f2269s;

    /* renamed from: t */
    C0525l f2270t;

    /* renamed from: u */
    private final ScaleGestureDetector f2271u;

    /* renamed from: v */
    InterfaceC5009b0 f2272v;

    /* renamed from: w */
    private MotionEvent f2273w;

    /* renamed from: x */
    private final C0509c f2274x;

    /* renamed from: y */
    private final View.OnLayoutChangeListener f2275y;

    /* renamed from: z */
    final C0499z1.d f2276z;

    /* renamed from: androidx.camera.view.PreviewView$a */
    /* loaded from: classes.dex */
    public class C0507a implements C0499z1.d {
        C0507a() {
        }

        /* renamed from: e */
        public /* synthetic */ void m2406e(C0492x2 c0492x2) {
            PreviewView.this.f2276z.mo2355a(c0492x2);
        }

        /* renamed from: f */
        public /* synthetic */ void m2407f(InterfaceC5017d0 interfaceC5017d0, C0492x2 c0492x2, C0492x2.g gVar) {
            PreviewView previewView;
            AbstractC0524k abstractC0524k;
            C0463q1.m2202a("PreviewView", "Preview transformation info updated. " + gVar);
            PreviewView.this.f2266p.m2442p(gVar, c0492x2.m2267l(), interfaceC5017d0.mo1461h().mo1567a().intValue() == 0);
            if (gVar.mo2123c() != -1 && ((abstractC0524k = (previewView = PreviewView.this).f2265o) == null || !(abstractC0524k instanceof C0530q))) {
                previewView.f2267q = false;
            } else {
                PreviewView.this.f2267q = true;
            }
            PreviewView.this.m2402i();
            PreviewView.this.m2401e();
        }

        /* renamed from: g */
        public /* synthetic */ void m2408g(C0518e c0518e, InterfaceC5017d0 interfaceC5017d0) {
            if (PreviewView.this.f2269s.compareAndSet(c0518e, null)) {
                c0518e.m2425l(EnumC0513g.IDLE);
            }
            c0518e.m2423f();
            interfaceC5017d0.mo1467k().mo19637b(c0518e);
        }

        @Override // androidx.camera.core.C0499z1.d
        /* renamed from: a */
        public void mo2355a(C0492x2 c0492x2) {
            AbstractC0524k c0530q;
            if (!C0432l.m2120b()) {
                C0587a.m3032f(PreviewView.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.j

                    /* renamed from: o */
                    public final /* synthetic */ C0492x2 f2330o;

                    public /* synthetic */ RunnableC0523j(C0492x2 c0492x22) {
                        r2 = c0492x22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.C0507a.this.m2406e(r2);
                    }
                });
                return;
            }
            C0463q1.m2202a("PreviewView", "Surface requested by Preview.");
            InterfaceC5017d0 m2265j = c0492x22.m2265j();
            PreviewView.this.f2272v = m2265j.mo1461h();
            c0492x22.m2270w(C0587a.m3032f(PreviewView.this.getContext()), new C0492x2.h() { // from class: androidx.camera.view.h

                /* renamed from: b */
                public final /* synthetic */ InterfaceC5017d0 f2324b;

                /* renamed from: c */
                public final /* synthetic */ C0492x2 f2325c;

                public /* synthetic */ C0521h(InterfaceC5017d0 m2265j2, C0492x2 c0492x22) {
                    r2 = m2265j2;
                    r3 = c0492x22;
                }

                @Override // androidx.camera.core.C0492x2.h
                /* renamed from: a */
                public final void mo2278a(C0492x2.g gVar) {
                    PreviewView.C0507a.this.m2407f(r2, r3, gVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (PreviewView.m2397f(c0492x22, previewView.f2264n)) {
                PreviewView previewView2 = PreviewView.this;
                c0530q = new C0537x(previewView2, previewView2.f2266p);
            } else {
                PreviewView previewView3 = PreviewView.this;
                c0530q = new C0530q(previewView3, previewView3.f2266p);
            }
            previewView.f2265o = c0530q;
            InterfaceC5009b0 mo1461h = m2265j2.mo1461h();
            PreviewView previewView4 = PreviewView.this;
            C0518e c0518e = new C0518e(mo1461h, previewView4.f2268r, previewView4.f2265o);
            PreviewView.this.f2269s.set(c0518e);
            m2265j2.mo1467k().mo19636a(C0587a.m3032f(PreviewView.this.getContext()), c0518e);
            PreviewView.this.f2265o.mo2451g(c0492x22, new AbstractC0524k.a() { // from class: androidx.camera.view.i

                /* renamed from: b */
                public final /* synthetic */ C0518e f2327b;

                /* renamed from: c */
                public final /* synthetic */ InterfaceC5017d0 f2328c;

                public /* synthetic */ C0522i(C0518e c0518e2, InterfaceC5017d0 m2265j2) {
                    r2 = c0518e2;
                    r3 = m2265j2;
                }

                @Override // androidx.camera.view.AbstractC0524k.a
                /* renamed from: a */
                public final void mo2444a() {
                    PreviewView.C0507a.this.m2408g(r2, r3);
                }
            });
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0508b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2278a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2279b;

        static {
            int[] iArr = new int[EnumC0510d.values().length];
            f2279b = iArr;
            try {
                iArr[EnumC0510d.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2279b[EnumC0510d.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0512f.values().length];
            f2278a = iArr2;
            try {
                iArr2[EnumC0512f.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2278a[EnumC0512f.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2278a[EnumC0512f.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2278a[EnumC0512f.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2278a[EnumC0512f.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2278a[EnumC0512f.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$c */
    /* loaded from: classes.dex */
    public class C0509c implements DisplayManager.DisplayListener {
        C0509c() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i10) {
                return;
            }
            PreviewView.this.m2402i();
            PreviewView.this.m2401e();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$d */
    /* loaded from: classes.dex */
    public enum EnumC0510d {
        PERFORMANCE(0),
        COMPATIBLE(1);


        /* renamed from: n */
        private final int f2284n;

        EnumC0510d(int i10) {
            this.f2284n = i10;
        }

        /* renamed from: b */
        static EnumC0510d m2409b(int i10) {
            for (EnumC0510d enumC0510d : values()) {
                if (enumC0510d.f2284n == i10) {
                    return enumC0510d;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i10);
        }

        /* renamed from: c */
        int m2410c() {
            return this.f2284n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.PreviewView$e */
    /* loaded from: classes.dex */
    public class C0511e extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        C0511e() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            Objects.requireNonNull(PreviewView.this);
            return true;
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$f */
    /* loaded from: classes.dex */
    public enum EnumC0512f {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* renamed from: n */
        private final int f2293n;

        EnumC0512f(int i10) {
            this.f2293n = i10;
        }

        /* renamed from: b */
        static EnumC0512f m2411b(int i10) {
            for (EnumC0512f enumC0512f : values()) {
                if (enumC0512f.f2293n == i10) {
                    return enumC0512f;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i10);
        }

        /* renamed from: c */
        int m2412c() {
            return this.f2293n;
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$g */
    /* loaded from: classes.dex */
    public enum EnumC0513g {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m2395b(boolean z10) {
        C0432l.m2119a();
        getDisplay();
        getViewPort();
    }

    /* renamed from: d */
    public /* synthetic */ void m2396d(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if ((i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) ? false : true) {
            m2401e();
            m2395b(true);
        }
    }

    /* renamed from: f */
    static boolean m2397f(C0492x2 c0492x2, EnumC0510d enumC0510d) {
        int i10;
        boolean equals = c0492x2.m2265j().mo1461h().mo1570d().equals("androidx.camera.camera2.legacy");
        boolean z10 = (C3056a.m13509a(C3059d.class) == null && C3056a.m13509a(C3058c.class) == null) ? false : true;
        if (c0492x2.m2268m() || Build.VERSION.SDK_INT <= 24 || equals || z10 || (i10 = C0508b.f2279b[enumC0510d.ordinal()]) == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + enumC0510d);
    }

    /* renamed from: g */
    private void m2398g() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f2274x, new Handler(Looper.getMainLooper()));
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private int getViewPortScaleType() {
        switch (C0508b.f2278a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    /* renamed from: h */
    private void m2399h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f2274x);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: c */
    public C0403e3 m2400c(int i10) {
        C0432l.m2119a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new C0403e3.a(new Rational(getWidth(), getHeight()), i10).m2007c(getViewPortScaleType()).m2006b(getLayoutDirection()).m2005a();
    }

    /* renamed from: e */
    void m2401e() {
        C0432l.m2119a();
        AbstractC0524k abstractC0524k = this.f2265o;
        if (abstractC0524k != null) {
            abstractC0524k.m2452h();
        }
        this.f2270t.m2454a(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public Bitmap getBitmap() {
        C0432l.m2119a();
        AbstractC0524k abstractC0524k = this.f2265o;
        if (abstractC0524k == null) {
            return null;
        }
        return abstractC0524k.m2445a();
    }

    public AbstractC0514a getController() {
        C0432l.m2119a();
        return null;
    }

    public EnumC0510d getImplementationMode() {
        C0432l.m2119a();
        return this.f2264n;
    }

    public AbstractC0479u1 getMeteringPointFactory() {
        C0432l.m2119a();
        return this.f2270t;
    }

    public C3122a getOutputTransform() {
        Matrix matrix;
        C0432l.m2119a();
        try {
            matrix = this.f2266p.m2437h(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect m2436g = this.f2266p.m2436g();
        if (matrix != null && m2436g != null) {
            matrix.preConcat(C0538y.m2483a(m2436g));
            if (this.f2265o instanceof C0537x) {
                matrix.postConcat(getMatrix());
            } else {
                C0463q1.m2212k("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            return new C3122a(matrix, new Size(m2436g.width(), m2436g.height()));
        }
        C0463q1.m2202a("PreviewView", "Transform info is not ready");
        return null;
    }

    public LiveData<EnumC0513g> getPreviewStreamState() {
        return this.f2268r;
    }

    public EnumC0512f getScaleType() {
        C0432l.m2119a();
        return this.f2266p.m2435f();
    }

    public C0499z1.d getSurfaceProvider() {
        C0432l.m2119a();
        return this.f2276z;
    }

    public C0403e3 getViewPort() {
        C0432l.m2119a();
        if (getDisplay() == null) {
            return null;
        }
        return m2400c(getDisplay().getRotation());
    }

    /* renamed from: i */
    void m2402i() {
        Display display;
        InterfaceC5009b0 interfaceC5009b0;
        if (!this.f2267q || (display = getDisplay()) == null || (interfaceC5009b0 = this.f2272v) == null) {
            return;
        }
        this.f2266p.m2440m(interfaceC5009b0.mo1571e(display.getRotation()), display.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2402i();
        m2398g();
        addOnLayoutChangeListener(this.f2275y);
        AbstractC0524k abstractC0524k = this.f2265o;
        if (abstractC0524k != null) {
            abstractC0524k.mo2448d();
        }
        m2395b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f2275y);
        AbstractC0524k abstractC0524k = this.f2265o;
        if (abstractC0524k != null) {
            abstractC0524k.mo2449e();
        }
        m2399h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f2273w = null;
        return super.performClick();
    }

    public void setController(AbstractC0514a abstractC0514a) {
        C0432l.m2119a();
        m2395b(false);
    }

    public void setImplementationMode(EnumC0510d enumC0510d) {
        C0432l.m2119a();
        this.f2264n = enumC0510d;
    }

    public void setScaleType(EnumC0512f enumC0512f) {
        C0432l.m2119a();
        this.f2266p.m2441o(enumC0512f);
        m2401e();
        m2395b(false);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        EnumC0510d enumC0510d = f2263A;
        this.f2264n = enumC0510d;
        C0519f c0519f = new C0519f();
        this.f2266p = c0519f;
        this.f2267q = true;
        this.f2268r = new C0851r<>(EnumC0513g.IDLE);
        this.f2269s = new AtomicReference<>();
        this.f2270t = new C0525l(c0519f);
        this.f2274x = new C0509c();
        this.f2275y = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.g
            public /* synthetic */ ViewOnLayoutChangeListenerC0520g() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                PreviewView.this.m2396d(view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f2276z = new C0507a();
        C0432l.m2119a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C0526m.f2338a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        C0690v.m3849o0(this, context, iArr, attributeSet, obtainStyledAttributes, i10, i11);
        try {
            setScaleType(EnumC0512f.m2411b(obtainStyledAttributes.getInteger(C0526m.f2340c, c0519f.m2435f().m2412c())));
            setImplementationMode(EnumC0510d.m2409b(obtainStyledAttributes.getInteger(C0526m.f2339b, enumC0510d.m2410c())));
            obtainStyledAttributes.recycle();
            this.f2271u = new ScaleGestureDetector(context, new C0511e());
            if (getBackground() == null) {
                setBackgroundColor(C0587a.m3029c(getContext(), R.color.black));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
