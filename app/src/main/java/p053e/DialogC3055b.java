package p053e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0154d;
import androidx.core.view.C0672f;
import p039d.C2948a;
import p120j.AbstractC3583b;

/* renamed from: e.b */
/* loaded from: classes.dex */
public class DialogC3055b extends Dialog implements InterfaceC3054a {

    /* renamed from: n */
    private AbstractC0154d f12894n;

    /* renamed from: o */
    private final C0672f.a f12895o;

    /* renamed from: e.b$a */
    /* loaded from: classes.dex */
    class a implements C0672f.a {
        a() {
        }

        @Override // androidx.core.view.C0672f.a
        /* renamed from: v */
        public boolean mo2766v(KeyEvent keyEvent) {
            return DialogC3055b.this.m13507c(keyEvent);
        }
    }

    public DialogC3055b(Context context, int i10) {
        super(context, m13505b(context, i10));
        this.f12895o = new a();
        AbstractC0154d m13506a = m13506a();
        m13506a.mo741D(m13505b(context, i10));
        m13506a.mo753q(null);
    }

    /* renamed from: b */
    private static int m13505b(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2948a.f12132A, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p053e.InterfaceC3054a
    /* renamed from: D */
    public void mo718D(AbstractC3583b abstractC3583b) {
    }

    @Override // p053e.InterfaceC3054a
    /* renamed from: X */
    public AbstractC3583b mo729X(AbstractC3583b.a aVar) {
        return null;
    }

    /* renamed from: a */
    public AbstractC0154d m13506a() {
        if (this.f12894n == null) {
            this.f12894n = AbstractC0154d.m734h(this, this);
        }
        return this.f12894n;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m13506a().mo743d(view, layoutParams);
    }

    /* renamed from: c */
    boolean m13507c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean m13508d(int i10) {
        return m13506a().mo760z(i10);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m13506a().mo754r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0672f.m3649e(this.f12895o, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // p053e.InterfaceC3054a
    /* renamed from: e0 */
    public void mo731e0(AbstractC3583b abstractC3583b) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) m13506a().mo746i(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m13506a().mo751o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m13506a().mo750n();
        super.onCreate(bundle);
        m13506a().mo753q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m13506a().mo759w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        m13506a().mo738A(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m13506a().mo742E(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m13506a().mo739B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m13506a().mo740C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        m13506a().mo742E(getContext().getString(i10));
    }
}
