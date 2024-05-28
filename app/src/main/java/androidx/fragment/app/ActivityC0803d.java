package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0131c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0142c;
import androidx.core.app.C0569b;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.C0846m;
import androidx.lifecycle.C0858y;
import androidx.lifecycle.InterfaceC0859z;
import androidx.loader.app.AbstractC0860a;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p013b.InterfaceC0959b;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class ActivityC0803d extends ComponentActivity implements C0569b.f, C0569b.h {

    /* renamed from: A */
    boolean f4021A;

    /* renamed from: z */
    boolean f4025z;

    /* renamed from: x */
    final C0807h f4023x = C0807h.m4631b(new c());

    /* renamed from: y */
    final C0846m f4024y = new C0846m(this);

    /* renamed from: B */
    boolean f4022B = true;

    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: classes.dex */
    public class a implements SavedStateRegistry.InterfaceC0925b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0925b
        /* renamed from: a */
        public Bundle mo594a() {
            Bundle bundle = new Bundle();
            ActivityC0803d.this.m4612B0();
            ActivityC0803d.this.f4024y.m4909h(AbstractC0839f.b.ON_STOP);
            Parcelable m4654x = ActivityC0803d.this.f4023x.m4654x();
            if (m4654x != null) {
                bundle.putParcelable("android:support:fragments", m4654x);
            }
            return bundle;
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0959b {
        b() {
        }

        @Override // p013b.InterfaceC0959b
        /* renamed from: a */
        public void mo595a(Context context) {
            ActivityC0803d.this.f4023x.m4632a(null);
            Bundle m5892a = ActivityC0803d.this.mo586l().m5892a("android:support:fragments");
            if (m5892a != null) {
                ActivityC0803d.this.f4023x.m4653w(m5892a.getParcelable("android:support:fragments"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$c */
    /* loaded from: classes.dex */
    public class c extends AbstractC0809j<ActivityC0803d> implements InterfaceC0859z, InterfaceC0131c, InterfaceC0142c, InterfaceC0814o {
        public c() {
            super(ActivityC0803d.this);
        }

        @Override // androidx.activity.result.InterfaceC0142c
        /* renamed from: Y */
        public ActivityResultRegistry mo582Y() {
            return ActivityC0803d.this.mo582Y();
        }

        @Override // androidx.fragment.app.InterfaceC0814o
        /* renamed from: a */
        public void mo4535a(FragmentManager fragmentManager, Fragment fragment) {
            ActivityC0803d.this.m4613D0(fragment);
        }

        @Override // androidx.fragment.app.AbstractC0809j, androidx.fragment.app.AbstractC0805f
        /* renamed from: c */
        public View mo4397c(int i10) {
            return ActivityC0803d.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC0809j, androidx.fragment.app.AbstractC0805f
        /* renamed from: d */
        public boolean mo4398d() {
            Window window = ActivityC0803d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.InterfaceC0845l
        /* renamed from: f */
        public AbstractC0839f mo583f() {
            return ActivityC0803d.this.f4024y;
        }

        @Override // androidx.fragment.app.AbstractC0809j
        /* renamed from: i */
        public void mo4619i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0803d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.lifecycle.InterfaceC0859z
        /* renamed from: i0 */
        public C0858y mo584i0() {
            return ActivityC0803d.this.mo584i0();
        }

        @Override // androidx.activity.InterfaceC0131c
        /* renamed from: k */
        public OnBackPressedDispatcher mo585k() {
            return ActivityC0803d.this.mo585k();
        }

        @Override // androidx.fragment.app.AbstractC0809j
        /* renamed from: m */
        public LayoutInflater mo4621m() {
            return ActivityC0803d.this.getLayoutInflater().cloneInContext(ActivityC0803d.this);
        }

        @Override // androidx.fragment.app.AbstractC0809j
        /* renamed from: n */
        public boolean mo4622n(Fragment fragment) {
            return !ActivityC0803d.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0809j
        /* renamed from: p */
        public void mo4623p() {
            ActivityC0803d.this.mo719G0();
        }

        @Override // androidx.fragment.app.AbstractC0809j
        /* renamed from: q */
        public ActivityC0803d mo4620j() {
            return ActivityC0803d.this;
        }
    }

    public ActivityC0803d() {
        m4610A0();
    }

    /* renamed from: A0 */
    private void m4610A0() {
        mo586l().m5895d("android:support:fragments", new a());
        m587r0(new b());
    }

    /* renamed from: C0 */
    private static boolean m4611C0(FragmentManager fragmentManager, AbstractC0839f.c cVar) {
        boolean z10 = false;
        for (Fragment fragment : fragmentManager.m4518u0()) {
            if (fragment != null) {
                if (fragment.m4276F() != null) {
                    z10 |= m4611C0(fragment.m4381v(), cVar);
                }
                C0823x c0823x = fragment.f3814g0;
                if (c0823x != null && c0823x.mo583f().mo4890b().m4895b(AbstractC0839f.c.STARTED)) {
                    fragment.f3814g0.m4819g(cVar);
                    z10 = true;
                }
                if (fragment.f3813f0.mo4890b().m4895b(AbstractC0839f.c.STARTED)) {
                    fragment.f3813f0.m4911o(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* renamed from: B0 */
    void m4612B0() {
        do {
        } while (m4611C0(m4617y0(), AbstractC0839f.c.CREATED));
    }

    @Deprecated
    /* renamed from: D0 */
    public void m4613D0(Fragment fragment) {
    }

    @Deprecated
    /* renamed from: E0 */
    protected boolean m4614E0(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: F0 */
    protected void m4615F0() {
        this.f4024y.m4909h(AbstractC0839f.b.ON_RESUME);
        this.f4023x.m4646p();
    }

    @Deprecated
    /* renamed from: G0 */
    public void mo719G0() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f4025z);
        printWriter.print(" mResumed=");
        printWriter.print(this.f4021A);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4022B);
        if (getApplication() != null) {
            AbstractC0860a.m4955b(this).mo4956a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f4023x.m4650t().m4477X(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.core.app.C0569b.h
    @Deprecated
    /* renamed from: j */
    public final void mo2743j(int i10) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f4023x.m4651u();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f4023x.m4651u();
        super.onConfigurationChanged(configuration);
        this.f4023x.m4634d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4024y.m4909h(AbstractC0839f.b.ON_CREATE);
        this.f4023x.m4636f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            return super.onCreatePanelMenu(i10, menu) | this.f4023x.m4637g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m4616x0 = m4616x0(view, str, context, attributeSet);
        return m4616x0 == null ? super.onCreateView(view, str, context, attributeSet) : m4616x0;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f4023x.m4638h();
        this.f4024y.m4909h(AbstractC0839f.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f4023x.m4639i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.f4023x.m4641k(menuItem);
        }
        if (i10 != 6) {
            return false;
        }
        return this.f4023x.m4635e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.f4023x.m4640j(z10);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f4023x.m4651u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.f4023x.m4642l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f4021A = false;
        this.f4023x.m4643m();
        this.f4024y.m4909h(AbstractC0839f.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.f4023x.m4644n(z10);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m4615F0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            return m4614E0(view, menu) | this.f4023x.m4645o(menu);
        }
        return super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f4023x.m4651u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f4023x.m4651u();
        super.onResume();
        this.f4021A = true;
        this.f4023x.m4649s();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f4023x.m4651u();
        super.onStart();
        this.f4022B = false;
        if (!this.f4025z) {
            this.f4025z = true;
            this.f4023x.m4633c();
        }
        this.f4023x.m4649s();
        this.f4024y.m4909h(AbstractC0839f.b.ON_START);
        this.f4023x.m4647q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f4023x.m4651u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f4022B = true;
        m4612B0();
        this.f4023x.m4648r();
        this.f4024y.m4909h(AbstractC0839f.b.ON_STOP);
    }

    /* renamed from: x0 */
    final View m4616x0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4023x.m4652v(view, str, context, attributeSet);
    }

    /* renamed from: y0 */
    public FragmentManager m4617y0() {
        return this.f4023x.m4650t();
    }

    @Deprecated
    /* renamed from: z0 */
    public AbstractC0860a m4618z0() {
        return AbstractC0860a.m4955b(this);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m4616x0 = m4616x0(null, str, context, attributeSet);
        return m4616x0 == null ? super.onCreateView(str, context, attributeSet) : m4616x0;
    }
}
