package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.C0672f;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.C0846m;
import androidx.lifecycle.FragmentC0855v;
import androidx.lifecycle.InterfaceC0845l;
import p093h0.C3362g;

/* renamed from: androidx.core.app.g */
/* loaded from: classes.dex */
public class ActivityC0574g extends Activity implements InterfaceC0845l, C0672f.a {

    /* renamed from: n */
    private C3362g<Class<Object>, Object> f3078n = new C3362g<>();

    /* renamed from: o */
    private C0846m f3079o = new C0846m(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0672f.m3648d(decorView, keyEvent)) {
            return C0672f.m3649e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0672f.m3648d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: f */
    public AbstractC0839f mo583f() {
        return this.f3079o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0855v.m4942g(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f3079o.m4910j(AbstractC0839f.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.core.view.C0672f.a
    /* renamed from: v */
    public boolean mo2766v(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
