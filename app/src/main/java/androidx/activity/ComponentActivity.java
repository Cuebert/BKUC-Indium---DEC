package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.AbstractC0141b;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0140a;
import androidx.activity.result.InterfaceC0142c;
import androidx.core.app.ActivityC0574g;
import androidx.core.app.C0569b;
import androidx.core.app.C0570c;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.C0833a0;
import androidx.lifecycle.C0835b0;
import androidx.lifecycle.C0846m;
import androidx.lifecycle.C0858y;
import androidx.lifecycle.FragmentC0855v;
import androidx.lifecycle.InterfaceC0843j;
import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0859z;
import androidx.savedstate.C0927b;
import androidx.savedstate.C0929d;
import androidx.savedstate.InterfaceC0928c;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;
import p013b.C0958a;
import p013b.InterfaceC0959b;
import p025c.AbstractC1112a;
import p122j1.C3592a;

/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC0574g implements InterfaceC0859z, InterfaceC0928c, InterfaceC0131c, InterfaceC0142c {

    /* renamed from: s */
    private C0858y f405s;

    /* renamed from: u */
    private int f407u;

    /* renamed from: p */
    final C0958a f402p = new C0958a();

    /* renamed from: q */
    private final C0846m f403q = new C0846m(this);

    /* renamed from: r */
    final C0927b f404r = C0927b.m5897a(this);

    /* renamed from: t */
    private final OnBackPressedDispatcher f406t = new OnBackPressedDispatcher(new RunnableC0123a());

    /* renamed from: v */
    private final AtomicInteger f408v = new AtomicInteger();

    /* renamed from: w */
    private final ActivityResultRegistry f409w = new C0124b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$3 */
    /* loaded from: classes.dex */
    public class C01203 implements InterfaceC0843j {
        C01203() {
        }

        @Override // androidx.lifecycle.InterfaceC0843j
        /* renamed from: e */
        public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
            if (bVar == AbstractC0839f.b.ON_STOP) {
                Window window = ComponentActivity.this.getWindow();
                View peekDecorView = window != null ? window.peekDecorView() : null;
                if (peekDecorView != null) {
                    peekDecorView.cancelPendingInputEvents();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$4 */
    /* loaded from: classes.dex */
    public class C01214 implements InterfaceC0843j {
        C01214() {
        }

        @Override // androidx.lifecycle.InterfaceC0843j
        /* renamed from: e */
        public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
            if (bVar == AbstractC0839f.b.ON_DESTROY) {
                ComponentActivity.this.f402p.m6137b();
                if (ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.mo584i0().m4951a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$5 */
    /* loaded from: classes.dex */
    public class C01225 implements InterfaceC0843j {
        C01225() {
        }

        @Override // androidx.lifecycle.InterfaceC0843j
        /* renamed from: e */
        public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
            ComponentActivity.this.m588s0();
            ComponentActivity.this.mo583f().mo4891c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes.dex */
    public class RunnableC0123a implements Runnable {
        RunnableC0123a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes.dex */
    public class C0124b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ int f415n;

            /* renamed from: o */
            final /* synthetic */ AbstractC1112a.a f416o;

            a(int i10, AbstractC1112a.a aVar) {
                this.f415n = i10;
                this.f416o = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0124b.this.m616c(this.f415n, this.f416o.m6494a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: n */
            final /* synthetic */ int f418n;

            /* renamed from: o */
            final /* synthetic */ IntentSender.SendIntentException f419o;

            b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f418n = i10;
                this.f419o = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0124b.this.m615b(this.f418n, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f419o));
            }
        }

        C0124b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: f */
        public <I, O> void mo593f(int i10, AbstractC1112a<I, O> abstractC1112a, I i11, C0570c c0570c) {
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC1112a.a<O> mo6493b = abstractC1112a.mo6493b(componentActivity, i11);
            if (mo6493b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, mo6493b));
                return;
            }
            Intent mo4537a = abstractC1112a.mo4537a(componentActivity, i11);
            Bundle bundle = null;
            if (mo4537a.getExtras() != null && mo4537a.getExtras().getClassLoader() == null) {
                mo4537a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (mo4537a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = mo4537a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo4537a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo4537a.getAction())) {
                String[] stringArrayExtra = mo4537a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C0569b.m2729p(componentActivity, stringArrayExtra, i10);
                return;
            }
            if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo4537a.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) mo4537a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C0569b.m2732s(componentActivity, intentSenderRequest.m629d(), i10, intentSenderRequest.m626a(), intentSenderRequest.m627b(), intentSenderRequest.m628c(), 0, bundle2);
                    return;
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new b(i10, e10));
                    return;
                }
            }
            C0569b.m2731r(componentActivity, mo4537a, i10, bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: classes.dex */
    public class C0125c implements SavedStateRegistry.InterfaceC0925b {
        C0125c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0925b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public Bundle mo594a() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.f409w.m618h(bundle);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: classes.dex */
    public class C0126d implements InterfaceC0959b {
        C0126d() {
        }

        @Override // p013b.InterfaceC0959b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo595a(Context context) {
            Bundle m5892a = ComponentActivity.this.mo586l().m5892a("android:support:activity-result");
            if (m5892a != null) {
                ComponentActivity.this.f409w.m617g(m5892a);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    /* loaded from: classes.dex */
    public static final class C0127e {

        /* renamed from: a */
        Object f423a;

        /* renamed from: b */
        C0858y f424b;

        C0127e() {
        }
    }

    public ComponentActivity() {
        if (mo583f() != null) {
            int i10 = Build.VERSION.SDK_INT;
            mo583f().mo4889a(new InterfaceC0843j() { // from class: androidx.activity.ComponentActivity.3
                C01203() {
                }

                @Override // androidx.lifecycle.InterfaceC0843j
                /* renamed from: e */
                public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
                    if (bVar == AbstractC0839f.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            mo583f().mo4889a(new InterfaceC0843j() { // from class: androidx.activity.ComponentActivity.4
                C01214() {
                }

                @Override // androidx.lifecycle.InterfaceC0843j
                /* renamed from: e */
                public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
                    if (bVar == AbstractC0839f.b.ON_DESTROY) {
                        ComponentActivity.this.f402p.m6137b();
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.mo584i0().m4951a();
                    }
                }
            });
            mo583f().mo4889a(new InterfaceC0843j() { // from class: androidx.activity.ComponentActivity.5
                C01225() {
                }

                @Override // androidx.lifecycle.InterfaceC0843j
                /* renamed from: e */
                public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
                    ComponentActivity.this.m588s0();
                    ComponentActivity.this.mo583f().mo4891c(this);
                }
            });
            if (i10 <= 23) {
                mo583f().mo4889a(new ImmLeaksCleaner(this));
            }
            mo586l().m5895d("android:support:activity-result", new C0125c());
            m587r0(new C0126d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: t0 */
    private void m581t0() {
        C0833a0.m4885a(getWindow().getDecorView(), this);
        C0835b0.m4886a(getWindow().getDecorView(), this);
        C0929d.m5901a(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.result.InterfaceC0142c
    /* renamed from: Y */
    public final ActivityResultRegistry mo582Y() {
        return this.f409w;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m581t0();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.app.ActivityC0574g, androidx.lifecycle.InterfaceC0845l
    /* renamed from: f */
    public AbstractC0839f mo583f() {
        return this.f403q;
    }

    @Override // androidx.lifecycle.InterfaceC0859z
    /* renamed from: i0 */
    public C0858y mo584i0() {
        if (getApplication() != null) {
            m588s0();
            return this.f405s;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.activity.InterfaceC0131c
    /* renamed from: k */
    public final OnBackPressedDispatcher mo585k() {
        return this.f406t;
    }

    @Override // androidx.savedstate.InterfaceC0928c
    /* renamed from: l */
    public final SavedStateRegistry mo586l() {
        return this.f404r.m5898b();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f409w.m615b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f406t.m599c();
    }

    @Override // androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f404r.m5899c(bundle);
        this.f402p.m6138c(this);
        super.onCreate(bundle);
        FragmentC0855v.m4942g(this);
        int i10 = this.f407u;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.f409w.m615b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0127e c0127e;
        Object m589u0 = m589u0();
        C0858y c0858y = this.f405s;
        if (c0858y == null && (c0127e = (C0127e) getLastNonConfigurationInstance()) != null) {
            c0858y = c0127e.f424b;
        }
        if (c0858y == null && m589u0 == null) {
            return null;
        }
        C0127e c0127e2 = new C0127e();
        c0127e2.f423a = m589u0;
        c0127e2.f424b = c0858y;
        return c0127e2;
    }

    @Override // androidx.core.app.ActivityC0574g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0839f mo583f = mo583f();
        if (mo583f instanceof C0846m) {
            ((C0846m) mo583f).m4911o(AbstractC0839f.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f404r.m5900d(bundle);
    }

    /* renamed from: r0 */
    public final void m587r0(InterfaceC0959b interfaceC0959b) {
        this.f402p.m6136a(interfaceC0959b);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C3592a.m15412d()) {
                C3592a.m15409a("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            C3592a.m15410b();
        }
    }

    /* renamed from: s0 */
    void m588s0() {
        if (this.f405s == null) {
            C0127e c0127e = (C0127e) getLastNonConfigurationInstance();
            if (c0127e != null) {
                this.f405s = c0127e.f424b;
            }
            if (this.f405s == null) {
                this.f405s = new C0858y();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        m581t0();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Deprecated
    /* renamed from: u0 */
    public Object m589u0() {
        return null;
    }

    /* renamed from: v0 */
    public final <I, O> AbstractC0141b<I> m590v0(AbstractC1112a<I, O> abstractC1112a, InterfaceC0140a<O> interfaceC0140a) {
        return m591w0(abstractC1112a, this.f409w, interfaceC0140a);
    }

    /* renamed from: w0 */
    public final <I, O> AbstractC0141b<I> m591w0(AbstractC1112a<I, O> abstractC1112a, ActivityResultRegistry activityResultRegistry, InterfaceC0140a<O> interfaceC0140a) {
        return activityResultRegistry.m619i("activity_rq#" + this.f408v.getAndIncrement(), this, abstractC1112a, interfaceC0140a);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m581t0();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m581t0();
        super.setContentView(view, layoutParams);
    }
}
