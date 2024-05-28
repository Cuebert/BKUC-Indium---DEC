package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0166c;
import androidx.appcompat.view.menu.C0168e;
import androidx.appcompat.view.menu.InterfaceC0173j;
import androidx.appcompat.view.menu.InterfaceC0174k;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.app.C0576i;
import androidx.core.content.C0587a;
import androidx.core.content.res.C0596h;
import androidx.core.util.C0649c;
import androidx.core.view.C0665b0;
import androidx.core.view.C0669d0;
import androidx.core.view.C0672f;
import androidx.core.view.C0674g;
import androidx.core.view.C0675g0;
import androidx.core.view.C0690v;
import androidx.core.view.InterfaceC0684p;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0845l;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p039d.C2948a;
import p039d.C2950c;
import p039d.C2953f;
import p039d.C2954g;
import p039d.C2956i;
import p039d.C2957j;
import p053e.DialogC3055b;
import p053e.InterfaceC3054a;
import p066f.C3121a;
import p093h0.C3362g;
import p120j.AbstractC3583b;
import p120j.C3585d;
import p120j.C3587f;
import p120j.C3588g;
import p120j.WindowCallbackC3590i;

/* renamed from: androidx.appcompat.app.e */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0155e extends AbstractC0154d implements C0168e.a, LayoutInflater.Factory2 {

    /* renamed from: o0 */
    private static final C3362g<String, Integer> f599o0 = new C3362g<>();

    /* renamed from: p0 */
    private static final boolean f600p0 = false;

    /* renamed from: q0 */
    private static final int[] f601q0 = {R.attr.windowBackground};

    /* renamed from: r0 */
    private static final boolean f602r0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: s0 */
    private static final boolean f603s0 = true;

    /* renamed from: A */
    private s f604A;

    /* renamed from: B */
    AbstractC3583b f605B;

    /* renamed from: C */
    ActionBarContextView f606C;

    /* renamed from: D */
    PopupWindow f607D;

    /* renamed from: E */
    Runnable f608E;

    /* renamed from: F */
    C0665b0 f609F;

    /* renamed from: G */
    private boolean f610G;

    /* renamed from: H */
    private boolean f611H;

    /* renamed from: I */
    ViewGroup f612I;

    /* renamed from: J */
    private TextView f613J;

    /* renamed from: K */
    private View f614K;

    /* renamed from: L */
    private boolean f615L;

    /* renamed from: M */
    private boolean f616M;

    /* renamed from: N */
    boolean f617N;

    /* renamed from: O */
    boolean f618O;

    /* renamed from: P */
    boolean f619P;

    /* renamed from: Q */
    boolean f620Q;

    /* renamed from: R */
    boolean f621R;

    /* renamed from: S */
    private boolean f622S;

    /* renamed from: T */
    private r[] f623T;

    /* renamed from: U */
    private r f624U;

    /* renamed from: V */
    private boolean f625V;

    /* renamed from: W */
    private boolean f626W;

    /* renamed from: X */
    private boolean f627X;

    /* renamed from: Y */
    private boolean f628Y;

    /* renamed from: Z */
    boolean f629Z;

    /* renamed from: a0 */
    private int f630a0;

    /* renamed from: b0 */
    private int f631b0;

    /* renamed from: c0 */
    private boolean f632c0;

    /* renamed from: d0 */
    private boolean f633d0;

    /* renamed from: e0 */
    private n f634e0;

    /* renamed from: f0 */
    private n f635f0;

    /* renamed from: g0 */
    boolean f636g0;

    /* renamed from: h0 */
    int f637h0;

    /* renamed from: i0 */
    private final Runnable f638i0;

    /* renamed from: j0 */
    private boolean f639j0;

    /* renamed from: k0 */
    private Rect f640k0;

    /* renamed from: l0 */
    private Rect f641l0;

    /* renamed from: m0 */
    private C0156f f642m0;

    /* renamed from: n0 */
    private C0157g f643n0;

    /* renamed from: q */
    final Object f644q;

    /* renamed from: r */
    final Context f645r;

    /* renamed from: s */
    Window f646s;

    /* renamed from: t */
    private l f647t;

    /* renamed from: u */
    final InterfaceC3054a f648u;

    /* renamed from: v */
    AbstractC0151a f649v;

    /* renamed from: w */
    MenuInflater f650w;

    /* renamed from: x */
    private CharSequence f651x;

    /* renamed from: y */
    private DecorContentParent f652y;

    /* renamed from: z */
    private f f653z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.e$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e = LayoutInflaterFactory2C0155e.this;
            if ((layoutInflaterFactory2C0155e.f637h0 & 1) != 0) {
                layoutInflaterFactory2C0155e.m804U(0);
            }
            LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e2 = LayoutInflaterFactory2C0155e.this;
            if ((layoutInflaterFactory2C0155e2.f637h0 & 4096) != 0) {
                layoutInflaterFactory2C0155e2.m804U(108);
            }
            LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e3 = LayoutInflaterFactory2C0155e.this;
            layoutInflaterFactory2C0155e3.f636g0 = false;
            layoutInflaterFactory2C0155e3.f637h0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.e$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0684p {
        b() {
        }

        @Override // androidx.core.view.InterfaceC0684p
        /* renamed from: L */
        public C0675g0 mo823L(View view, C0675g0 c0675g0) {
            int m3669l = c0675g0.m3669l();
            int m798L0 = LayoutInflaterFactory2C0155e.this.m798L0(c0675g0, null);
            if (m3669l != m798L0) {
                c0675g0 = c0675g0.m3672p(c0675g0.m3667j(), m798L0, c0675g0.m3668k(), c0675g0.m3666i());
            }
            return C0690v.m3825c0(view, c0675g0);
        }
    }

    /* renamed from: androidx.appcompat.app.e$c */
    /* loaded from: classes.dex */
    public class c implements ContentFrameLayout.OnAttachListener {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onAttachedFromWindow() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C0155e.this.m802S();
        }
    }

    /* renamed from: androidx.appcompat.app.e$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: androidx.appcompat.app.e$d$a */
        /* loaded from: classes.dex */
        class a extends C0669d0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC0667c0
            public void onAnimationEnd(View view) {
                LayoutInflaterFactory2C0155e.this.f606C.setAlpha(1.0f);
                LayoutInflaterFactory2C0155e.this.f609F.m3605h(null);
                LayoutInflaterFactory2C0155e.this.f609F = null;
            }

            @Override // androidx.core.view.C0669d0, androidx.core.view.InterfaceC0667c0
            public void onAnimationStart(View view) {
                LayoutInflaterFactory2C0155e.this.f606C.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e = LayoutInflaterFactory2C0155e.this;
            layoutInflaterFactory2C0155e.f607D.showAtLocation(layoutInflaterFactory2C0155e.f606C, 55, 0, 0);
            LayoutInflaterFactory2C0155e.this.m805V();
            if (LayoutInflaterFactory2C0155e.this.m792D0()) {
                LayoutInflaterFactory2C0155e.this.f606C.setAlpha(0.0f);
                LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e2 = LayoutInflaterFactory2C0155e.this;
                layoutInflaterFactory2C0155e2.f609F = C0690v.m3828e(layoutInflaterFactory2C0155e2.f606C).m3600b(1.0f);
                LayoutInflaterFactory2C0155e.this.f609F.m3605h(new a());
                return;
            }
            LayoutInflaterFactory2C0155e.this.f606C.setAlpha(1.0f);
            LayoutInflaterFactory2C0155e.this.f606C.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.e$e */
    /* loaded from: classes.dex */
    public class e extends C0669d0 {
        e() {
        }

        @Override // androidx.core.view.InterfaceC0667c0
        public void onAnimationEnd(View view) {
            LayoutInflaterFactory2C0155e.this.f606C.setAlpha(1.0f);
            LayoutInflaterFactory2C0155e.this.f609F.m3605h(null);
            LayoutInflaterFactory2C0155e.this.f609F = null;
        }

        @Override // androidx.core.view.C0669d0, androidx.core.view.InterfaceC0667c0
        public void onAnimationStart(View view) {
            LayoutInflaterFactory2C0155e.this.f606C.setVisibility(0);
            LayoutInflaterFactory2C0155e.this.f606C.sendAccessibilityEvent(32);
            if (LayoutInflaterFactory2C0155e.this.f606C.getParent() instanceof View) {
                C0690v.m3847n0((View) LayoutInflaterFactory2C0155e.this.f606C.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.e$f */
    /* loaded from: classes.dex */
    public final class f implements InterfaceC0173j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0173j.a
        /* renamed from: a */
        public void mo824a(C0168e c0168e, boolean z10) {
            LayoutInflaterFactory2C0155e.this.m797L(c0168e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0173j.a
        /* renamed from: b */
        public boolean mo825b(C0168e c0168e) {
            Window.Callback m812f0 = LayoutInflaterFactory2C0155e.this.m812f0();
            if (m812f0 == null) {
                return true;
            }
            m812f0.onMenuOpened(108, c0168e);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.e$g */
    /* loaded from: classes.dex */
    public class g implements AbstractC3583b.a {

        /* renamed from: a */
        private AbstractC3583b.a f661a;

        /* renamed from: androidx.appcompat.app.e$g$a */
        /* loaded from: classes.dex */
        class a extends C0669d0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC0667c0
            public void onAnimationEnd(View view) {
                LayoutInflaterFactory2C0155e.this.f606C.setVisibility(8);
                LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e = LayoutInflaterFactory2C0155e.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0155e.f607D;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0155e.f606C.getParent() instanceof View) {
                    C0690v.m3847n0((View) LayoutInflaterFactory2C0155e.this.f606C.getParent());
                }
                LayoutInflaterFactory2C0155e.this.f606C.killMode();
                LayoutInflaterFactory2C0155e.this.f609F.m3605h(null);
                LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e2 = LayoutInflaterFactory2C0155e.this;
                layoutInflaterFactory2C0155e2.f609F = null;
                C0690v.m3847n0(layoutInflaterFactory2C0155e2.f612I);
            }
        }

        public g(AbstractC3583b.a aVar) {
            this.f661a = aVar;
        }

        @Override // p120j.AbstractC3583b.a
        /* renamed from: a */
        public boolean mo826a(AbstractC3583b abstractC3583b, MenuItem menuItem) {
            return this.f661a.mo826a(abstractC3583b, menuItem);
        }

        @Override // p120j.AbstractC3583b.a
        /* renamed from: b */
        public boolean mo827b(AbstractC3583b abstractC3583b, Menu menu) {
            return this.f661a.mo827b(abstractC3583b, menu);
        }

        @Override // p120j.AbstractC3583b.a
        /* renamed from: c */
        public void mo828c(AbstractC3583b abstractC3583b) {
            this.f661a.mo828c(abstractC3583b);
            LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e = LayoutInflaterFactory2C0155e.this;
            if (layoutInflaterFactory2C0155e.f607D != null) {
                layoutInflaterFactory2C0155e.f646s.getDecorView().removeCallbacks(LayoutInflaterFactory2C0155e.this.f608E);
            }
            LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e2 = LayoutInflaterFactory2C0155e.this;
            if (layoutInflaterFactory2C0155e2.f606C != null) {
                layoutInflaterFactory2C0155e2.m805V();
                LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e3 = LayoutInflaterFactory2C0155e.this;
                layoutInflaterFactory2C0155e3.f609F = C0690v.m3828e(layoutInflaterFactory2C0155e3.f606C).m3600b(0.0f);
                LayoutInflaterFactory2C0155e.this.f609F.m3605h(new a());
            }
            LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e4 = LayoutInflaterFactory2C0155e.this;
            InterfaceC3054a interfaceC3054a = layoutInflaterFactory2C0155e4.f648u;
            if (interfaceC3054a != null) {
                interfaceC3054a.mo718D(layoutInflaterFactory2C0155e4.f605B);
            }
            LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e5 = LayoutInflaterFactory2C0155e.this;
            layoutInflaterFactory2C0155e5.f605B = null;
            C0690v.m3847n0(layoutInflaterFactory2C0155e5.f612I);
        }

        @Override // p120j.AbstractC3583b.a
        /* renamed from: d */
        public boolean mo829d(AbstractC3583b abstractC3583b, Menu menu) {
            C0690v.m3847n0(LayoutInflaterFactory2C0155e.this.f612I);
            return this.f661a.mo829d(abstractC3583b, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.e$h */
    /* loaded from: classes.dex */
    public static class h {
        /* renamed from: a */
        static Context m830a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m831b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.e$i */
    /* loaded from: classes.dex */
    static class i {
        /* renamed from: a */
        static boolean m832a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* renamed from: androidx.appcompat.app.e$j */
    /* loaded from: classes.dex */
    public static class j {
        /* renamed from: a */
        static void m833a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* renamed from: androidx.appcompat.app.e$k */
    /* loaded from: classes.dex */
    public static class k {
        /* renamed from: a */
        static void m834a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.e$m */
    /* loaded from: classes.dex */
    public class m extends n {

        /* renamed from: c */
        private final PowerManager f665c;

        m(Context context) {
            super();
            this.f665c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0155e.n
        /* renamed from: b */
        IntentFilter mo836b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0155e.n
        /* renamed from: c */
        public int mo837c() {
            return i.m832a(this.f665c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0155e.n
        /* renamed from: d */
        public void mo838d() {
            LayoutInflaterFactory2C0155e.this.m793F();
        }
    }

    /* renamed from: androidx.appcompat.app.e$n */
    /* loaded from: classes.dex */
    public abstract class n {

        /* renamed from: a */
        private BroadcastReceiver f667a;

        /* renamed from: androidx.appcompat.app.e$n$a */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                n.this.mo838d();
            }
        }

        n() {
        }

        /* renamed from: a */
        void m839a() {
            BroadcastReceiver broadcastReceiver = this.f667a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C0155e.this.f645r.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f667a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo836b();

        /* renamed from: c */
        abstract int mo837c();

        /* renamed from: d */
        abstract void mo838d();

        /* renamed from: e */
        void m840e() {
            m839a();
            IntentFilter mo836b = mo836b();
            if (mo836b == null || mo836b.countActions() == 0) {
                return;
            }
            if (this.f667a == null) {
                this.f667a = new a();
            }
            LayoutInflaterFactory2C0155e.this.f645r.registerReceiver(this.f667a, mo836b);
        }
    }

    /* renamed from: androidx.appcompat.app.e$o */
    /* loaded from: classes.dex */
    public class o extends n {

        /* renamed from: c */
        private final C0160j f670c;

        o(C0160j c0160j) {
            super();
            this.f670c = c0160j;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0155e.n
        /* renamed from: b */
        IntentFilter mo836b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0155e.n
        /* renamed from: c */
        public int mo837c() {
            return this.f670c.m885d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0155e.n
        /* renamed from: d */
        public void mo838d() {
            LayoutInflaterFactory2C0155e.this.m793F();
        }
    }

    /* renamed from: androidx.appcompat.app.e$p */
    /* loaded from: classes.dex */
    private static class p {
        /* renamed from: a */
        static void m841a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.e$q */
    /* loaded from: classes.dex */
    public class q extends ContentFrameLayout {
        public q(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m842a(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0155e.this.m803T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m842a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                LayoutInflaterFactory2C0155e.this.m799N(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(C3121a.m13770d(getContext(), i10));
        }
    }

    /* renamed from: androidx.appcompat.app.e$r */
    /* loaded from: classes.dex */
    public static final class r {

        /* renamed from: a */
        int f673a;

        /* renamed from: b */
        int f674b;

        /* renamed from: c */
        int f675c;

        /* renamed from: d */
        int f676d;

        /* renamed from: e */
        int f677e;

        /* renamed from: f */
        int f678f;

        /* renamed from: g */
        ViewGroup f679g;

        /* renamed from: h */
        View f680h;

        /* renamed from: i */
        View f681i;

        /* renamed from: j */
        C0168e f682j;

        /* renamed from: k */
        C0166c f683k;

        /* renamed from: l */
        Context f684l;

        /* renamed from: m */
        boolean f685m;

        /* renamed from: n */
        boolean f686n;

        /* renamed from: o */
        boolean f687o;

        /* renamed from: p */
        public boolean f688p;

        /* renamed from: q */
        boolean f689q = false;

        /* renamed from: r */
        boolean f690r;

        /* renamed from: s */
        Bundle f691s;

        r(int i10) {
            this.f673a = i10;
        }

        /* renamed from: a */
        InterfaceC0174k m843a(InterfaceC0173j.a aVar) {
            if (this.f682j == null) {
                return null;
            }
            if (this.f683k == null) {
                C0166c c0166c = new C0166c(this.f684l, C2954g.f12303l);
                this.f683k = c0166c;
                c0166c.mo938i(aVar);
                this.f682j.m1007b(this.f683k);
            }
            return this.f683k.m967j(this.f679g);
        }

        /* renamed from: b */
        public boolean m844b() {
            if (this.f680h == null) {
                return false;
            }
            return this.f681i != null || this.f683k.m966e().getCount() > 0;
        }

        /* renamed from: c */
        void m845c(C0168e c0168e) {
            C0166c c0166c;
            C0168e c0168e2 = this.f682j;
            if (c0168e == c0168e2) {
                return;
            }
            if (c0168e2 != null) {
                c0168e2.m994O(this.f683k);
            }
            this.f682j = c0168e;
            if (c0168e == null || (c0166c = this.f683k) == null) {
                return;
            }
            c0168e.m1007b(c0166c);
        }

        /* renamed from: d */
        void m846d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C2948a.f12149a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(C2948a.f12138G, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(C2956i.f12333b, true);
            }
            C3585d c3585d = new C3585d(context, 0);
            c3585d.getTheme().setTo(newTheme);
            this.f684l = c3585d;
            TypedArray obtainStyledAttributes = c3585d.obtainStyledAttributes(C2957j.f12342B0);
            this.f674b = obtainStyledAttributes.getResourceId(C2957j.f12357E0, 0);
            this.f678f = obtainStyledAttributes.getResourceId(C2957j.f12352D0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.e$s */
    /* loaded from: classes.dex */
    public final class s implements InterfaceC0173j.a {
        s() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0173j.a
        /* renamed from: a */
        public void mo824a(C0168e c0168e, boolean z10) {
            C0168e mo984D = c0168e.mo984D();
            boolean z11 = mo984D != c0168e;
            LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e = LayoutInflaterFactory2C0155e.this;
            if (z11) {
                c0168e = mo984D;
            }
            r m806Y = layoutInflaterFactory2C0155e.m806Y(c0168e);
            if (m806Y != null) {
                if (z11) {
                    LayoutInflaterFactory2C0155e.this.m796K(m806Y.f673a, m806Y, mo984D);
                    LayoutInflaterFactory2C0155e.this.m800O(m806Y, true);
                } else {
                    LayoutInflaterFactory2C0155e.this.m800O(m806Y, z10);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0173j.a
        /* renamed from: b */
        public boolean mo825b(C0168e c0168e) {
            Window.Callback m812f0;
            if (c0168e != c0168e.mo984D()) {
                return true;
            }
            LayoutInflaterFactory2C0155e layoutInflaterFactory2C0155e = LayoutInflaterFactory2C0155e.this;
            if (!layoutInflaterFactory2C0155e.f617N || (m812f0 = layoutInflaterFactory2C0155e.m812f0()) == null || LayoutInflaterFactory2C0155e.this.f629Z) {
                return true;
            }
            m812f0.onMenuOpened(108, c0168e);
            return true;
        }
    }

    public LayoutInflaterFactory2C0155e(Activity activity, InterfaceC3054a interfaceC3054a) {
        this(activity, null, interfaceC3054a, activity);
    }

    /* renamed from: A0 */
    private boolean m761A0(r rVar, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.f629Z) {
            return false;
        }
        if (rVar.f685m) {
            return true;
        }
        r rVar2 = this.f624U;
        if (rVar2 != null && rVar2 != rVar) {
            m800O(rVar2, false);
        }
        Window.Callback m812f0 = m812f0();
        if (m812f0 != null) {
            rVar.f681i = m812f0.onCreatePanelView(rVar.f673a);
        }
        int i10 = rVar.f673a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (decorContentParent3 = this.f652y) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (rVar.f681i == null) {
            if (z10) {
                m822y0();
            }
            C0168e c0168e = rVar.f682j;
            if (c0168e == null || rVar.f690r) {
                if (c0168e == null && (!m785j0(rVar) || rVar.f682j == null)) {
                    return false;
                }
                if (z10 && this.f652y != null) {
                    if (this.f653z == null) {
                        this.f653z = new f();
                    }
                    this.f652y.setMenu(rVar.f682j, this.f653z);
                }
                rVar.f682j.m1011d0();
                if (!m812f0.onCreatePanelMenu(rVar.f673a, rVar.f682j)) {
                    rVar.m845c(null);
                    if (z10 && (decorContentParent = this.f652y) != null) {
                        decorContentParent.setMenu(null, this.f653z);
                    }
                    return false;
                }
                rVar.f690r = false;
            }
            rVar.f682j.m1011d0();
            Bundle bundle = rVar.f691s;
            if (bundle != null) {
                rVar.f682j.m995P(bundle);
                rVar.f691s = null;
            }
            if (!m812f0.onPreparePanel(0, rVar.f681i, rVar.f682j)) {
                if (z10 && (decorContentParent2 = this.f652y) != null) {
                    decorContentParent2.setMenu(null, this.f653z);
                }
                rVar.f682j.m1009c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            rVar.f688p = z11;
            rVar.f682j.setQwertyMode(z11);
            rVar.f682j.m1009c0();
        }
        rVar.f685m = true;
        rVar.f686n = false;
        this.f624U = rVar;
        return true;
    }

    /* renamed from: B0 */
    private void m762B0(boolean z10) {
        DecorContentParent decorContentParent = this.f652y;
        if (decorContentParent != null && decorContentParent.canShowOverflowMenu() && (!ViewConfiguration.get(this.f645r).hasPermanentMenuKey() || this.f652y.isOverflowMenuShowPending())) {
            Window.Callback m812f0 = m812f0();
            if (this.f652y.isOverflowMenuShowing() && z10) {
                this.f652y.hideOverflowMenu();
                if (this.f629Z) {
                    return;
                }
                m812f0.onPanelClosed(108, m810d0(0, true).f682j);
                return;
            }
            if (m812f0 == null || this.f629Z) {
                return;
            }
            if (this.f636g0 && (this.f637h0 & 1) != 0) {
                this.f646s.getDecorView().removeCallbacks(this.f638i0);
                this.f638i0.run();
            }
            r m810d0 = m810d0(0, true);
            C0168e c0168e = m810d0.f682j;
            if (c0168e == null || m810d0.f690r || !m812f0.onPreparePanel(0, m810d0.f681i, c0168e)) {
                return;
            }
            m812f0.onMenuOpened(108, m810d0.f682j);
            this.f652y.showOverflowMenu();
            return;
        }
        r m810d02 = m810d0(0, true);
        m810d02.f689q = true;
        m800O(m810d02, false);
        m790x0(m810d02, null);
    }

    /* renamed from: C0 */
    private int m763C0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    /* renamed from: E0 */
    private boolean m764E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f646s.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0690v.m3813T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: G */
    private boolean m765G(boolean z10) {
        if (this.f629Z) {
            return false;
        }
        int m770J = m770J();
        boolean m771J0 = m771J0(m814n0(this.f645r, m770J), z10);
        if (m770J == 0) {
            m781c0(this.f645r).m840e();
        } else {
            n nVar = this.f634e0;
            if (nVar != null) {
                nVar.m839a();
            }
        }
        if (m770J == 3) {
            m780b0(this.f645r).m840e();
        } else {
            n nVar2 = this.f635f0;
            if (nVar2 != null) {
                nVar2.m839a();
            }
        }
        return m771J0;
    }

    /* renamed from: H */
    private void m766H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f612I.findViewById(R.id.content);
        View decorView = this.f646s.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f645r.obtainStyledAttributes(C2957j.f12342B0);
        obtainStyledAttributes.getValue(C2957j.f12402N0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C2957j.f12407O0, contentFrameLayout.getMinWidthMinor());
        int i10 = C2957j.f12392L0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = C2957j.f12397M0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = C2957j.f12382J0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = C2957j.f12387K0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: H0 */
    private void m767H0() {
        if (this.f611H) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: I */
    private void m768I(Window window) {
        if (this.f646s == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof l)) {
                l lVar = new l(callback);
                this.f647t = lVar;
                window.setCallback(lVar);
                TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f645r, (AttributeSet) null, f601q0);
                Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
                if (drawableIfKnown != null) {
                    window.setBackgroundDrawable(drawableIfKnown);
                }
                obtainStyledAttributes.recycle();
                this.f646s = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: I0 */
    private ActivityC0153c m769I0() {
        for (Context context = this.f645r; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC0153c) {
                return (ActivityC0153c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: J */
    private int m770J() {
        int i10 = this.f630a0;
        return i10 != -100 ? i10 : AbstractC0154d.m735j();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m771J0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f645r
            r1 = 0
            android.content.res.Configuration r0 = r6.m775P(r0, r7, r1)
            boolean r2 = r6.m787l0()
            android.content.Context r3 = r6.f645r
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.f626W
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.LayoutInflaterFactory2C0155e.f602r0
            if (r8 != 0) goto L30
            boolean r8 = r6.f627X
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f644q
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f644q
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C0569b.m2728o(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.m772K0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f644q
            boolean r0 = r8 instanceof androidx.appcompat.app.ActivityC0153c
            if (r0 == 0) goto L5e
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.ActivityC0153c) r8
            r8.m723L0(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0155e.m771J0(int, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K0 */
    private void m772K0(int i10, boolean z10, Configuration configuration) {
        Resources resources = this.f645r.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            C0158h.m873a(resources);
        }
        int i12 = this.f631b0;
        if (i12 != 0) {
            this.f645r.setTheme(i12);
            if (i11 >= 23) {
                this.f645r.getTheme().applyStyle(this.f631b0, true);
            }
        }
        if (z10) {
            Object obj = this.f644q;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC0845l) {
                    if (((InterfaceC0845l) activity).mo583f().mo4890b().m4895b(AbstractC0839f.c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f628Y) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: M */
    private void m773M() {
        n nVar = this.f634e0;
        if (nVar != null) {
            nVar.m839a();
        }
        n nVar2 = this.f635f0;
        if (nVar2 != null) {
            nVar2.m839a();
        }
    }

    /* renamed from: M0 */
    private void m774M0(View view) {
        int m3029c;
        if ((C0690v.m3807N(view) & 8192) != 0) {
            m3029c = C0587a.m3029c(this.f645r, C2950c.f12177b);
        } else {
            m3029c = C0587a.m3029c(this.f645r, C2950c.f12176a);
        }
        view.setBackgroundColor(m3029c);
    }

    /* renamed from: P */
    private Configuration m775P(Context context, int i10, Configuration configuration) {
        int i11;
        if (i10 != 1) {
            i11 = i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: Q */
    private ViewGroup m776Q() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f645r.obtainStyledAttributes(C2957j.f12342B0);
        int i10 = C2957j.f12367G0;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(C2957j.f12412P0, false)) {
                mo760z(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                mo760z(108);
            }
            if (obtainStyledAttributes.getBoolean(C2957j.f12372H0, false)) {
                mo760z(109);
            }
            if (obtainStyledAttributes.getBoolean(C2957j.f12377I0, false)) {
                mo760z(10);
            }
            this.f620Q = obtainStyledAttributes.getBoolean(C2957j.f12347C0, false);
            obtainStyledAttributes.recycle();
            m778X();
            this.f646s.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f645r);
            if (!this.f621R) {
                if (this.f620Q) {
                    viewGroup = (ViewGroup) from.inflate(C2954g.f12299h, (ViewGroup) null);
                    this.f618O = false;
                    this.f617N = false;
                } else if (this.f617N) {
                    TypedValue typedValue = new TypedValue();
                    this.f645r.getTheme().resolveAttribute(C2948a.f12155g, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C3585d(this.f645r, typedValue.resourceId);
                    } else {
                        context = this.f645r;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C2954g.f12309r, (ViewGroup) null);
                    DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(C2953f.f12282q);
                    this.f652y = decorContentParent;
                    decorContentParent.setWindowCallback(m812f0());
                    if (this.f618O) {
                        this.f652y.initFeature(109);
                    }
                    if (this.f615L) {
                        this.f652y.initFeature(2);
                    }
                    if (this.f616M) {
                        this.f652y.initFeature(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.f619P ? (ViewGroup) from.inflate(C2954g.f12308q, (ViewGroup) null) : (ViewGroup) from.inflate(C2954g.f12307p, (ViewGroup) null);
            }
            if (viewGroup != null) {
                C0690v.m3786B0(viewGroup, new b());
                if (this.f652y == null) {
                    this.f613J = (TextView) viewGroup.findViewById(C2953f.f12262S);
                }
                ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C2953f.f12267b);
                ViewGroup viewGroup2 = (ViewGroup) this.f646s.findViewById(R.id.content);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(R.id.content);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f646s.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f617N + ", windowActionBarOverlay: " + this.f618O + ", android:windowIsFloating: " + this.f620Q + ", windowActionModeOverlay: " + this.f619P + ", windowNoTitle: " + this.f621R + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: W */
    private void m777W() {
        if (this.f611H) {
            return;
        }
        this.f612I = m776Q();
        CharSequence m811e0 = m811e0();
        if (!TextUtils.isEmpty(m811e0)) {
            DecorContentParent decorContentParent = this.f652y;
            if (decorContentParent != null) {
                decorContentParent.setWindowTitle(m811e0);
            } else if (m822y0() != null) {
                m822y0().mo682n(m811e0);
            } else {
                TextView textView = this.f613J;
                if (textView != null) {
                    textView.setText(m811e0);
                }
            }
        }
        m766H();
        m821w0(this.f612I);
        this.f611H = true;
        r m810d0 = m810d0(0, false);
        if (this.f629Z) {
            return;
        }
        if (m810d0 == null || m810d0.f682j == null) {
            m786k0(108);
        }
    }

    /* renamed from: X */
    private void m778X() {
        if (this.f646s == null) {
            Object obj = this.f644q;
            if (obj instanceof Activity) {
                m768I(((Activity) obj).getWindow());
            }
        }
        if (this.f646s == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: Z */
    private static Configuration m779Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                j.m833a(configuration, configuration2, configuration3);
            } else if (!C0649c.m3452a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                k.m834a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            h.m831b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: b0 */
    private n m780b0(Context context) {
        if (this.f635f0 == null) {
            this.f635f0 = new m(context);
        }
        return this.f635f0;
    }

    /* renamed from: c0 */
    private n m781c0(Context context) {
        if (this.f634e0 == null) {
            this.f634e0 = new o(C0160j.m880a(context));
        }
        return this.f634e0;
    }

    /* renamed from: g0 */
    private void m782g0() {
        m777W();
        if (this.f617N && this.f649v == null) {
            Object obj = this.f644q;
            if (obj instanceof Activity) {
                this.f649v = new C0161k((Activity) this.f644q, this.f618O);
            } else if (obj instanceof Dialog) {
                this.f649v = new C0161k((Dialog) this.f644q);
            }
            AbstractC0151a abstractC0151a = this.f649v;
            if (abstractC0151a != null) {
                abstractC0151a.mo680l(this.f639j0);
            }
        }
    }

    /* renamed from: h0 */
    private boolean m783h0(r rVar) {
        View view = rVar.f681i;
        if (view != null) {
            rVar.f680h = view;
            return true;
        }
        if (rVar.f682j == null) {
            return false;
        }
        if (this.f604A == null) {
            this.f604A = new s();
        }
        View view2 = (View) rVar.m843a(this.f604A);
        rVar.f680h = view2;
        return view2 != null;
    }

    /* renamed from: i0 */
    private boolean m784i0(r rVar) {
        rVar.m846d(m808a0());
        rVar.f679g = new q(rVar.f684l);
        rVar.f675c = 81;
        return true;
    }

    /* renamed from: j0 */
    private boolean m785j0(r rVar) {
        Context context = this.f645r;
        int i10 = rVar.f673a;
        if ((i10 == 0 || i10 == 108) && this.f652y != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C2948a.f12155g, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C2948a.f12156h, typedValue, true);
            } else {
                theme.resolveAttribute(C2948a.f12156h, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C3585d c3585d = new C3585d(context, 0);
                c3585d.getTheme().setTo(theme2);
                context = c3585d;
            }
        }
        C0168e c0168e = new C0168e(context);
        c0168e.mo997R(this);
        rVar.m845c(c0168e);
        return true;
    }

    /* renamed from: k0 */
    private void m786k0(int i10) {
        this.f637h0 = (1 << i10) | this.f637h0;
        if (this.f636g0) {
            return;
        }
        C0690v.m3837i0(this.f646s.getDecorView(), this.f638i0);
        this.f636g0 = true;
    }

    /* renamed from: l0 */
    private boolean m787l0() {
        if (!this.f633d0 && (this.f644q instanceof Activity)) {
            PackageManager packageManager = this.f645r.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f645r, this.f644q.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.f632c0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f632c0 = false;
            }
        }
        this.f633d0 = true;
        return this.f632c0;
    }

    /* renamed from: q0 */
    private boolean m788q0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        r m810d0 = m810d0(i10, true);
        if (m810d0.f687o) {
            return false;
        }
        return m761A0(m810d0, keyEvent);
    }

    /* renamed from: t0 */
    private boolean m789t0(int i10, KeyEvent keyEvent) {
        boolean z10;
        DecorContentParent decorContentParent;
        if (this.f605B != null) {
            return false;
        }
        boolean z11 = true;
        r m810d0 = m810d0(i10, true);
        if (i10 == 0 && (decorContentParent = this.f652y) != null && decorContentParent.canShowOverflowMenu() && !ViewConfiguration.get(this.f645r).hasPermanentMenuKey()) {
            if (!this.f652y.isOverflowMenuShowing()) {
                if (!this.f629Z && m761A0(m810d0, keyEvent)) {
                    z11 = this.f652y.showOverflowMenu();
                }
                z11 = false;
            } else {
                z11 = this.f652y.hideOverflowMenu();
            }
        } else {
            boolean z12 = m810d0.f687o;
            if (!z12 && !m810d0.f686n) {
                if (m810d0.f685m) {
                    if (m810d0.f690r) {
                        m810d0.f685m = false;
                        z10 = m761A0(m810d0, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        m790x0(m810d0, keyEvent);
                    }
                }
                z11 = false;
            } else {
                m800O(m810d0, true);
                z11 = z12;
            }
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f645r.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    /* renamed from: x0 */
    private void m790x0(r rVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (rVar.f687o || this.f629Z) {
            return;
        }
        if (rVar.f673a == 0) {
            if ((this.f645r.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m812f0 = m812f0();
        if (m812f0 != null && !m812f0.onMenuOpened(rVar.f673a, rVar.f682j)) {
            m800O(rVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f645r.getSystemService("window");
        if (windowManager != null && m761A0(rVar, keyEvent)) {
            ViewGroup viewGroup = rVar.f679g;
            if (viewGroup != null && !rVar.f689q) {
                View view = rVar.f681i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    rVar.f686n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, rVar.f676d, rVar.f677e, 1002, 8519680, -3);
                    layoutParams2.gravity = rVar.f675c;
                    layoutParams2.windowAnimations = rVar.f678f;
                    windowManager.addView(rVar.f679g, layoutParams2);
                    rVar.f687o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!m784i0(rVar) || rVar.f679g == null) {
                        return;
                    }
                } else if (rVar.f689q && viewGroup.getChildCount() > 0) {
                    rVar.f679g.removeAllViews();
                }
                if (m783h0(rVar) && rVar.m844b()) {
                    ViewGroup.LayoutParams layoutParams3 = rVar.f680h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    rVar.f679g.setBackgroundResource(rVar.f674b);
                    ViewParent parent = rVar.f680h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(rVar.f680h);
                    }
                    rVar.f679g.addView(rVar.f680h, layoutParams3);
                    if (!rVar.f680h.hasFocus()) {
                        rVar.f680h.requestFocus();
                    }
                } else {
                    rVar.f689q = true;
                    return;
                }
            }
            i10 = -2;
            rVar.f686n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i10, -2, rVar.f676d, rVar.f677e, 1002, 8519680, -3);
            layoutParams22.gravity = rVar.f675c;
            layoutParams22.windowAnimations = rVar.f678f;
            windowManager.addView(rVar.f679g, layoutParams22);
            rVar.f687o = true;
        }
    }

    /* renamed from: z0 */
    private boolean m791z0(r rVar, int i10, KeyEvent keyEvent, int i11) {
        C0168e c0168e;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.f685m || m761A0(rVar, keyEvent)) && (c0168e = rVar.f682j) != null) {
            z10 = c0168e.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f652y == null) {
            m800O(rVar, true);
        }
        return z10;
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: A */
    public void mo738A(int i10) {
        m777W();
        ViewGroup viewGroup = (ViewGroup) this.f612I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f645r).inflate(i10, viewGroup);
        this.f647t.m15407a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: B */
    public void mo739B(View view) {
        m777W();
        ViewGroup viewGroup = (ViewGroup) this.f612I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f647t.m15407a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: C */
    public void mo740C(View view, ViewGroup.LayoutParams layoutParams) {
        m777W();
        ViewGroup viewGroup = (ViewGroup) this.f612I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f647t.m15407a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: D */
    public void mo741D(int i10) {
        this.f631b0 = i10;
    }

    /* renamed from: D0 */
    final boolean m792D0() {
        ViewGroup viewGroup;
        return this.f611H && (viewGroup = this.f612I) != null && C0690v.m3814U(viewGroup);
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: E */
    public final void mo742E(CharSequence charSequence) {
        this.f651x = charSequence;
        DecorContentParent decorContentParent = this.f652y;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        if (m822y0() != null) {
            m822y0().mo682n(charSequence);
            return;
        }
        TextView textView = this.f613J;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: F */
    public boolean m793F() {
        return m765G(true);
    }

    /* renamed from: F0 */
    public AbstractC3583b m794F0(AbstractC3583b.a aVar) {
        InterfaceC3054a interfaceC3054a;
        if (aVar != null) {
            AbstractC3583b abstractC3583b = this.f605B;
            if (abstractC3583b != null) {
                abstractC3583b.mo905c();
            }
            g gVar = new g(aVar);
            AbstractC0151a mo749m = mo749m();
            if (mo749m != null) {
                AbstractC3583b mo683o = mo749m.mo683o(gVar);
                this.f605B = mo683o;
                if (mo683o != null && (interfaceC3054a = this.f648u) != null) {
                    interfaceC3054a.mo731e0(mo683o);
                }
            }
            if (this.f605B == null) {
                this.f605B = m795G0(gVar);
            }
            return this.f605B;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p120j.AbstractC3583b m795G0(p120j.AbstractC3583b.a r8) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0155e.m795G0(j.b$a):j.b");
    }

    /* renamed from: K */
    void m796K(int i10, r rVar, Menu menu) {
        if (menu == null) {
            if (rVar == null && i10 >= 0) {
                r[] rVarArr = this.f623T;
                if (i10 < rVarArr.length) {
                    rVar = rVarArr[i10];
                }
            }
            if (rVar != null) {
                menu = rVar.f682j;
            }
        }
        if ((rVar == null || rVar.f687o) && !this.f629Z) {
            this.f647t.m15407a().onPanelClosed(i10, menu);
        }
    }

    /* renamed from: L */
    void m797L(C0168e c0168e) {
        if (this.f622S) {
            return;
        }
        this.f622S = true;
        this.f652y.dismissPopups();
        Window.Callback m812f0 = m812f0();
        if (m812f0 != null && !this.f629Z) {
            m812f0.onPanelClosed(108, c0168e);
        }
        this.f622S = false;
    }

    /* renamed from: L0 */
    final int m798L0(C0675g0 c0675g0, Rect rect) {
        int i10;
        boolean z10;
        boolean z11;
        if (c0675g0 != null) {
            i10 = c0675g0.m3669l();
        } else {
            i10 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f606C;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f606C.getLayoutParams();
            if (this.f606C.isShown()) {
                if (this.f640k0 == null) {
                    this.f640k0 = new Rect();
                    this.f641l0 = new Rect();
                }
                Rect rect2 = this.f640k0;
                Rect rect3 = this.f641l0;
                if (c0675g0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0675g0.m3667j(), c0675g0.m3669l(), c0675g0.m3668k(), c0675g0.m3666i());
                }
                ViewUtils.computeFitSystemWindows(this.f612I, rect2, rect3);
                int i11 = rect2.top;
                int i12 = rect2.left;
                int i13 = rect2.right;
                C0675g0 m3803K = C0690v.m3803K(this.f612I);
                int m3667j = m3803K == null ? 0 : m3803K.m3667j();
                int m3668k = m3803K == null ? 0 : m3803K.m3668k();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && this.f614K == null) {
                    View view = new View(this.f645r);
                    this.f614K = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m3667j;
                    layoutParams.rightMargin = m3668k;
                    this.f612I.addView(this.f614K, -1, layoutParams);
                } else {
                    View view2 = this.f614K;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != m3667j || marginLayoutParams2.rightMargin != m3668k) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = m3667j;
                            marginLayoutParams2.rightMargin = m3668k;
                            this.f614K.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f614K;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    m774M0(this.f614K);
                }
                if (!this.f619P && r5) {
                    i10 = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.f606C.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f614K;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return i10;
    }

    /* renamed from: N */
    void m799N(int i10) {
        m800O(m810d0(i10, true), true);
    }

    /* renamed from: O */
    void m800O(r rVar, boolean z10) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z10 && rVar.f673a == 0 && (decorContentParent = this.f652y) != null && decorContentParent.isOverflowMenuShowing()) {
            m797L(rVar.f682j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f645r.getSystemService("window");
        if (windowManager != null && rVar.f687o && (viewGroup = rVar.f679g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                m796K(rVar.f673a, rVar, null);
            }
        }
        rVar.f685m = false;
        rVar.f686n = false;
        rVar.f687o = false;
        rVar.f680h = null;
        rVar.f689q = true;
        if (this.f624U == rVar) {
            this.f624U = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R */
    public View m801R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        boolean z11 = false;
        if (this.f642m0 == null) {
            String string = this.f645r.obtainStyledAttributes(C2957j.f12342B0).getString(C2957j.f12362F0);
            if (string == null) {
                this.f642m0 = new C0156f();
            } else {
                try {
                    this.f642m0 = (C0156f) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f642m0 = new C0156f();
                }
            }
        }
        boolean z12 = f600p0;
        if (z12) {
            if (this.f643n0 == null) {
                this.f643n0 = new C0157g();
            }
            if (this.f643n0.m872a(attributeSet)) {
                z10 = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                        z11 = true;
                    }
                } else {
                    z11 = m764E0((ViewParent) view);
                }
                z10 = z11;
            }
        } else {
            z10 = false;
        }
        return this.f642m0.m867q(view, str, context, attributeSet, z10, z12, true, VectorEnabledTintResources.shouldBeUsed());
    }

    /* renamed from: S */
    void m802S() {
        C0168e c0168e;
        DecorContentParent decorContentParent = this.f652y;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.f607D != null) {
            this.f646s.getDecorView().removeCallbacks(this.f608E);
            if (this.f607D.isShowing()) {
                try {
                    this.f607D.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f607D = null;
        }
        m805V();
        r m810d0 = m810d0(0, false);
        if (m810d0 == null || (c0168e = m810d0.f682j) == null) {
            return;
        }
        c0168e.close();
    }

    /* renamed from: T */
    boolean m803T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f644q;
        if (((obj instanceof C0672f.a) || (obj instanceof DialogC3055b)) && (decorView = this.f646s.getDecorView()) != null && C0672f.m3648d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f647t.m15407a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m816p0(keyCode, keyEvent) : m818s0(keyCode, keyEvent);
    }

    /* renamed from: U */
    void m804U(int i10) {
        r m810d0;
        r m810d02 = m810d0(i10, true);
        if (m810d02.f682j != null) {
            Bundle bundle = new Bundle();
            m810d02.f682j.m996Q(bundle);
            if (bundle.size() > 0) {
                m810d02.f691s = bundle;
            }
            m810d02.f682j.m1011d0();
            m810d02.f682j.clear();
        }
        m810d02.f690r = true;
        m810d02.f689q = true;
        if ((i10 != 108 && i10 != 0) || this.f652y == null || (m810d0 = m810d0(0, false)) == null) {
            return;
        }
        m810d0.f685m = false;
        m761A0(m810d0, null);
    }

    /* renamed from: V */
    void m805V() {
        C0665b0 c0665b0 = this.f609F;
        if (c0665b0 != null) {
            c0665b0.m3601c();
        }
    }

    /* renamed from: Y */
    r m806Y(Menu menu) {
        r[] rVarArr = this.f623T;
        int length = rVarArr != null ? rVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null && rVar.f682j == menu) {
                return rVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.C0168e.a
    /* renamed from: a */
    public boolean mo807a(C0168e c0168e, MenuItem menuItem) {
        r m806Y;
        Window.Callback m812f0 = m812f0();
        if (m812f0 == null || this.f629Z || (m806Y = m806Y(c0168e.mo984D())) == null) {
            return false;
        }
        return m812f0.onMenuItemSelected(m806Y.f673a, menuItem);
    }

    /* renamed from: a0 */
    final Context m808a0() {
        AbstractC0151a mo749m = mo749m();
        Context mo673e = mo749m != null ? mo749m.mo673e() : null;
        return mo673e == null ? this.f645r : mo673e;
    }

    @Override // androidx.appcompat.view.menu.C0168e.a
    /* renamed from: b */
    public void mo809b(C0168e c0168e) {
        m762B0(true);
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: d */
    public void mo743d(View view, ViewGroup.LayoutParams layoutParams) {
        m777W();
        ((ViewGroup) this.f612I.findViewById(R.id.content)).addView(view, layoutParams);
        this.f647t.m15407a().onContentChanged();
    }

    /* renamed from: d0 */
    protected r m810d0(int i10, boolean z10) {
        r[] rVarArr = this.f623T;
        if (rVarArr == null || rVarArr.length <= i10) {
            r[] rVarArr2 = new r[i10 + 1];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.f623T = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i10];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(i10);
        rVarArr[i10] = rVar2;
        return rVar2;
    }

    /* renamed from: e0 */
    final CharSequence m811e0() {
        Object obj = this.f644q;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f651x;
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: f */
    public Context mo745f(Context context) {
        this.f626W = true;
        int m814n0 = m814n0(context, m770J());
        if (f603s0 && (context instanceof ContextThemeWrapper)) {
            try {
                p.m841a((ContextThemeWrapper) context, m775P(context, m814n0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C3585d) {
            try {
                ((C3585d) context).m15381a(m775P(context, m814n0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f602r0) {
            return super.mo745f(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = h.m830a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration m775P = m775P(context, m814n0, configuration2.equals(configuration3) ? null : m779Z(configuration2, configuration3));
        C3585d c3585d = new C3585d(context, C2956i.f12334c);
        c3585d.m15381a(m775P);
        boolean z10 = false;
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            C0596h.f.m3149a(c3585d.getTheme());
        }
        return super.mo745f(c3585d);
    }

    /* renamed from: f0 */
    final Window.Callback m812f0() {
        return this.f646s.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: i */
    public <T extends View> T mo746i(int i10) {
        m777W();
        return (T) this.f646s.findViewById(i10);
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: k */
    public int mo747k() {
        return this.f630a0;
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: l */
    public MenuInflater mo748l() {
        if (this.f650w == null) {
            m782g0();
            AbstractC0151a abstractC0151a = this.f649v;
            this.f650w = new C3588g(abstractC0151a != null ? abstractC0151a.mo673e() : this.f645r);
        }
        return this.f650w;
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: m */
    public AbstractC0151a mo749m() {
        m782g0();
        return this.f649v;
    }

    /* renamed from: m0 */
    public boolean m813m0() {
        return this.f610G;
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: n */
    public void mo750n() {
        LayoutInflater from = LayoutInflater.from(this.f645r);
        if (from.getFactory() == null) {
            C0674g.m3654a(from, this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0155e) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: n0 */
    int m814n0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m781c0(context).mo837c();
                }
                return -1;
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return m780b0(context).mo837c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: o */
    public void mo751o() {
        AbstractC0151a mo749m = mo749m();
        if (mo749m == null || !mo749m.m674f()) {
            m786k0(0);
        }
    }

    /* renamed from: o0 */
    boolean m815o0() {
        AbstractC3583b abstractC3583b = this.f605B;
        if (abstractC3583b != null) {
            abstractC3583b.mo905c();
            return true;
        }
        AbstractC0151a mo749m = mo749m();
        return mo749m != null && mo749m.mo670b();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m801R(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: p */
    public void mo752p(Configuration configuration) {
        AbstractC0151a mo749m;
        if (this.f617N && this.f611H && (mo749m = mo749m()) != null) {
            mo749m.mo675g(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.f645r);
        m765G(false);
    }

    /* renamed from: p0 */
    boolean m816p0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f625V = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            m788q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: q */
    public void mo753q(Bundle bundle) {
        this.f626W = true;
        m765G(false);
        m778X();
        Object obj = this.f644q;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0576i.m2788c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0151a m822y0 = m822y0();
                if (m822y0 == null) {
                    this.f639j0 = true;
                } else {
                    m822y0.mo680l(true);
                }
            }
            AbstractC0154d.m732c(this);
        }
        this.f627X = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo754r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f644q
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AbstractC0154d.m736x(r3)
        L9:
            boolean r0 = r3.f636g0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f646s
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f638i0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.f628Y = r0
            r0 = 1
            r3.f629Z = r0
            int r0 = r3.f630a0
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f644q
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            h0.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflaterFactory2C0155e.f599o0
            java.lang.Object r1 = r3.f644q
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f630a0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            h0.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflaterFactory2C0155e.f599o0
            java.lang.Object r1 = r3.f644q
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.f649v
            if (r0 == 0) goto L5e
            r0.m676h()
        L5e:
            r3.m773M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0155e.mo754r():void");
    }

    /* renamed from: r0 */
    boolean m817r0(int i10, KeyEvent keyEvent) {
        AbstractC0151a mo749m = mo749m();
        if (mo749m != null && mo749m.mo677i(i10, keyEvent)) {
            return true;
        }
        r rVar = this.f624U;
        if (rVar != null && m791z0(rVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            r rVar2 = this.f624U;
            if (rVar2 != null) {
                rVar2.f686n = true;
            }
            return true;
        }
        if (this.f624U == null) {
            r m810d0 = m810d0(0, true);
            m761A0(m810d0, keyEvent);
            boolean m791z0 = m791z0(m810d0, keyEvent.getKeyCode(), keyEvent, 1);
            m810d0.f685m = false;
            if (m791z0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: s */
    public void mo755s(Bundle bundle) {
        m777W();
    }

    /* renamed from: s0 */
    boolean m818s0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.f625V;
            this.f625V = false;
            r m810d0 = m810d0(0, false);
            if (m810d0 != null && m810d0.f687o) {
                if (!z10) {
                    m800O(m810d0, true);
                }
                return true;
            }
            if (m815o0()) {
                return true;
            }
        } else if (i10 == 82) {
            m789t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: t */
    public void mo756t() {
        AbstractC0151a mo749m = mo749m();
        if (mo749m != null) {
            mo749m.mo681m(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: u */
    public void mo757u(Bundle bundle) {
    }

    /* renamed from: u0 */
    void m819u0(int i10) {
        AbstractC0151a mo749m;
        if (i10 != 108 || (mo749m = mo749m()) == null) {
            return;
        }
        mo749m.mo671c(true);
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: v */
    public void mo758v() {
        this.f628Y = true;
        m793F();
    }

    /* renamed from: v0 */
    void m820v0(int i10) {
        if (i10 == 108) {
            AbstractC0151a mo749m = mo749m();
            if (mo749m != null) {
                mo749m.mo671c(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            r m810d0 = m810d0(i10, true);
            if (m810d0.f687o) {
                m800O(m810d0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: w */
    public void mo759w() {
        this.f628Y = false;
        AbstractC0151a mo749m = mo749m();
        if (mo749m != null) {
            mo749m.mo681m(false);
        }
    }

    /* renamed from: w0 */
    void m821w0(ViewGroup viewGroup) {
    }

    /* renamed from: y0 */
    final AbstractC0151a m822y0() {
        return this.f649v;
    }

    @Override // androidx.appcompat.app.AbstractC0154d
    /* renamed from: z */
    public boolean mo760z(int i10) {
        int m763C0 = m763C0(i10);
        if (this.f621R && m763C0 == 108) {
            return false;
        }
        if (this.f617N && m763C0 == 1) {
            this.f617N = false;
        }
        if (m763C0 == 1) {
            m767H0();
            this.f621R = true;
            return true;
        }
        if (m763C0 == 2) {
            m767H0();
            this.f615L = true;
            return true;
        }
        if (m763C0 == 5) {
            m767H0();
            this.f616M = true;
            return true;
        }
        if (m763C0 == 10) {
            m767H0();
            this.f619P = true;
            return true;
        }
        if (m763C0 == 108) {
            m767H0();
            this.f617N = true;
            return true;
        }
        if (m763C0 != 109) {
            return this.f646s.requestFeature(m763C0);
        }
        m767H0();
        this.f618O = true;
        return true;
    }

    public LayoutInflaterFactory2C0155e(Dialog dialog, InterfaceC3054a interfaceC3054a) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC3054a, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflaterFactory2C0155e(Context context, Window window, InterfaceC3054a interfaceC3054a, Object obj) {
        C3362g<String, Integer> c3362g;
        Integer num;
        ActivityC0153c m769I0;
        this.f609F = null;
        this.f610G = true;
        this.f630a0 = -100;
        this.f638i0 = new a();
        this.f645r = context;
        this.f648u = interfaceC3054a;
        this.f644q = obj;
        if (this.f630a0 == -100 && (obj instanceof Dialog) && (m769I0 = m769I0()) != null) {
            this.f630a0 = m769I0.m720H0().mo747k();
        }
        if (this.f630a0 == -100 && (num = (c3362g = f599o0).get(obj.getClass().getName())) != null) {
            this.f630a0 = num.intValue();
            c3362g.remove(obj.getClass().getName());
        }
        if (window != null) {
            m768I(window);
        }
        AppCompatDrawableManager.preload();
    }

    /* renamed from: androidx.appcompat.app.e$l */
    /* loaded from: classes.dex */
    public class l extends WindowCallbackC3590i {
        l(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        final ActionMode m835b(ActionMode.Callback callback) {
            C3587f.a aVar = new C3587f.a(LayoutInflaterFactory2C0155e.this.f645r, callback);
            AbstractC3583b m794F0 = LayoutInflaterFactory2C0155e.this.m794F0(aVar);
            if (m794F0 != null) {
                return aVar.m15385e(m794F0);
            }
            return null;
        }

        @Override // p120j.WindowCallbackC3590i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0155e.this.m803T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p120j.WindowCallbackC3590i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C0155e.this.m817r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p120j.WindowCallbackC3590i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof C0168e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // p120j.WindowCallbackC3590i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            LayoutInflaterFactory2C0155e.this.m819u0(i10);
            return true;
        }

        @Override // p120j.WindowCallbackC3590i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            LayoutInflaterFactory2C0155e.this.m820v0(i10);
        }

        @Override // p120j.WindowCallbackC3590i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            C0168e c0168e = menu instanceof C0168e ? (C0168e) menu : null;
            if (i10 == 0 && c0168e == null) {
                return false;
            }
            if (c0168e != null) {
                c0168e.m1006a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (c0168e != null) {
                c0168e.m1006a0(false);
            }
            return onPreparePanel;
        }

        @Override // p120j.WindowCallbackC3590i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            C0168e c0168e;
            r m810d0 = LayoutInflaterFactory2C0155e.this.m810d0(0, true);
            if (m810d0 != null && (c0168e = m810d0.f682j) != null) {
                super.onProvideKeyboardShortcuts(list, c0168e, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // p120j.WindowCallbackC3590i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (LayoutInflaterFactory2C0155e.this.m813m0()) {
                return m835b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // p120j.WindowCallbackC3590i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (LayoutInflaterFactory2C0155e.this.m813m0() && i10 == 0) {
                return m835b(callback);
            }
            return super.onWindowStartingActionMode(callback, i10);
        }
    }
}
