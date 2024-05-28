package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.core.app.C0569b;
import androidx.core.app.C0576i;
import androidx.core.app.C0586s;
import androidx.fragment.app.ActivityC0803d;
import androidx.lifecycle.C0833a0;
import androidx.lifecycle.C0835b0;
import androidx.savedstate.C0929d;
import androidx.savedstate.SavedStateRegistry;
import p013b.InterfaceC0959b;
import p053e.InterfaceC3054a;
import p120j.AbstractC3583b;

/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
public class ActivityC0153c extends ActivityC0803d implements InterfaceC3054a, C0586s.a {

    /* renamed from: C */
    private AbstractC0154d f592C;

    /* renamed from: D */
    private Resources f593D;

    /* renamed from: androidx.appcompat.app.c$a */
    /* loaded from: classes.dex */
    public class a implements SavedStateRegistry.InterfaceC0925b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0925b
        /* renamed from: a */
        public Bundle mo594a() {
            Bundle bundle = new Bundle();
            ActivityC0153c.this.m720H0().mo757u(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.c$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0959b {
        b() {
        }

        @Override // p013b.InterfaceC0959b
        /* renamed from: a */
        public void mo595a(Context context) {
            AbstractC0154d m720H0 = ActivityC0153c.this.m720H0();
            m720H0.mo750n();
            m720H0.mo753q(ActivityC0153c.this.mo586l().m5892a("androidx:appcompat"));
        }
    }

    public ActivityC0153c() {
        m715J0();
    }

    /* renamed from: J0 */
    private void m715J0() {
        mo586l().m5895d("androidx:appcompat", new a());
        m587r0(new b());
    }

    /* renamed from: P0 */
    private boolean m716P0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    /* renamed from: t0 */
    private void m717t0() {
        C0833a0.m4885a(getWindow().getDecorView(), this);
        C0835b0.m4886a(getWindow().getDecorView(), this);
        C0929d.m5901a(getWindow().getDecorView(), this);
    }

    @Override // p053e.InterfaceC3054a
    /* renamed from: D */
    public void mo718D(AbstractC3583b abstractC3583b) {
    }

    @Override // androidx.fragment.app.ActivityC0803d
    /* renamed from: G0 */
    public void mo719G0() {
        m720H0().mo751o();
    }

    /* renamed from: H0 */
    public AbstractC0154d m720H0() {
        if (this.f592C == null) {
            this.f592C = AbstractC0154d.m733g(this, this);
        }
        return this.f592C;
    }

    /* renamed from: I0 */
    public AbstractC0151a m721I0() {
        return m720H0().mo749m();
    }

    /* renamed from: K0 */
    public void m722K0(C0586s c0586s) {
        c0586s.m3023e(this);
    }

    /* renamed from: L0 */
    public void m723L0(int i10) {
    }

    /* renamed from: M0 */
    public void m724M0(C0586s c0586s) {
    }

    @Deprecated
    /* renamed from: N0 */
    public void m725N0() {
    }

    /* renamed from: O0 */
    public boolean m726O0() {
        Intent mo730d0 = mo730d0();
        if (mo730d0 == null) {
            return false;
        }
        if (m728R0(mo730d0)) {
            C0586s m3021k = C0586s.m3021k(this);
            m722K0(m3021k);
            m724M0(m3021k);
            m3021k.m3025l();
            try {
                C0569b.m2726m(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        m727Q0(mo730d0);
        return true;
    }

    /* renamed from: Q0 */
    public void m727Q0(Intent intent) {
        C0576i.m2790e(this, intent);
    }

    /* renamed from: R0 */
    public boolean m728R0(Intent intent) {
        return C0576i.m2791f(this, intent);
    }

    @Override // p053e.InterfaceC3054a
    /* renamed from: X */
    public AbstractC3583b mo729X(AbstractC3583b.a aVar) {
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m717t0();
        m720H0().mo743d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m720H0().mo745f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0151a m721I0 = m721I0();
        if (getWindow().hasFeature(0)) {
            if (m721I0 == null || !m721I0.m669a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.C0586s.a
    /* renamed from: d0 */
    public Intent mo730d0() {
        return C0576i.m2786a(this);
    }

    @Override // androidx.core.app.ActivityC0574g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0151a m721I0 = m721I0();
        if (keyCode == 82 && m721I0 != null && m721I0.m678j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p053e.InterfaceC3054a
    /* renamed from: e0 */
    public void mo731e0(AbstractC3583b abstractC3583b) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) m720H0().mo746i(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m720H0().mo748l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f593D == null && VectorEnabledTintResources.shouldBeUsed()) {
            this.f593D = new VectorEnabledTintResources(this, super.getResources());
        }
        Resources resources = this.f593D;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m720H0().mo751o();
    }

    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f593D != null) {
            this.f593D.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m720H0().mo752p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m725N0();
    }

    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m720H0().mo754r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (m716P0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC0151a m721I0 = m721I0();
        if (menuItem.getItemId() != 16908332 || m721I0 == null || (m721I0.mo672d() & 4) == 0) {
            return false;
        }
        return m726O0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m720H0().mo755s(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m720H0().mo756t();
    }

    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStart() {
        super.onStart();
        m720H0().mo758v();
    }

    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStop() {
        super.onStop();
        m720H0().mo759w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        m720H0().mo742E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0151a m721I0 = m721I0();
        if (getWindow().hasFeature(0)) {
            if (m721I0 == null || !m721I0.m679k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        m717t0();
        m720H0().mo738A(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        m720H0().mo741D(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m717t0();
        m720H0().mo739B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m717t0();
        m720H0().mo740C(view, layoutParams);
    }
}
