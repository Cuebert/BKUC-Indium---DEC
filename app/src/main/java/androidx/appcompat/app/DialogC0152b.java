package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p039d.C2948a;
import p053e.DialogC3055b;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class DialogC0152b extends DialogC3055b {

    /* renamed from: p */
    final AlertController f589p;

    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final AlertController.C0148f f590a;

        /* renamed from: b */
        private final int f591b;

        public a(Context context) {
            this(context, DialogC0152b.m690g(context, 0));
        }

        /* renamed from: a */
        public DialogC0152b m695a() {
            DialogC0152b dialogC0152b = new DialogC0152b(this.f590a.f550a, this.f591b);
            this.f590a.m667a(dialogC0152b.f589p);
            dialogC0152b.setCancelable(this.f590a.f567r);
            if (this.f590a.f567r) {
                dialogC0152b.setCanceledOnTouchOutside(true);
            }
            dialogC0152b.setOnCancelListener(this.f590a.f568s);
            dialogC0152b.setOnDismissListener(this.f590a.f569t);
            DialogInterface.OnKeyListener onKeyListener = this.f590a.f570u;
            if (onKeyListener != null) {
                dialogC0152b.setOnKeyListener(onKeyListener);
            }
            return dialogC0152b;
        }

        /* renamed from: b */
        public Context m696b() {
            return this.f590a.f550a;
        }

        /* renamed from: c */
        public a m697c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0148f c0148f = this.f590a;
            c0148f.f572w = listAdapter;
            c0148f.f573x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public a m698d(boolean z10) {
            this.f590a.f567r = z10;
            return this;
        }

        /* renamed from: e */
        public a m699e(View view) {
            this.f590a.f556g = view;
            return this;
        }

        /* renamed from: f */
        public a m700f(Drawable drawable) {
            this.f590a.f553d = drawable;
            return this;
        }

        /* renamed from: g */
        public a m701g(int i10) {
            AlertController.C0148f c0148f = this.f590a;
            c0148f.f557h = c0148f.f550a.getText(i10);
            return this;
        }

        /* renamed from: h */
        public a m702h(CharSequence charSequence) {
            this.f590a.f557h = charSequence;
            return this;
        }

        /* renamed from: i */
        public a m703i(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0148f c0148f = this.f590a;
            c0148f.f561l = c0148f.f550a.getText(i10);
            this.f590a.f563n = onClickListener;
            return this;
        }

        /* renamed from: j */
        public a m704j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0148f c0148f = this.f590a;
            c0148f.f561l = charSequence;
            c0148f.f563n = onClickListener;
            return this;
        }

        /* renamed from: k */
        public a m705k(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0148f c0148f = this.f590a;
            c0148f.f564o = c0148f.f550a.getText(i10);
            this.f590a.f566q = onClickListener;
            return this;
        }

        /* renamed from: l */
        public a m706l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0148f c0148f = this.f590a;
            c0148f.f564o = charSequence;
            c0148f.f566q = onClickListener;
            return this;
        }

        /* renamed from: m */
        public a m707m(DialogInterface.OnCancelListener onCancelListener) {
            this.f590a.f568s = onCancelListener;
            return this;
        }

        /* renamed from: n */
        public a m708n(DialogInterface.OnDismissListener onDismissListener) {
            this.f590a.f569t = onDismissListener;
            return this;
        }

        /* renamed from: o */
        public a m709o(DialogInterface.OnKeyListener onKeyListener) {
            this.f590a.f570u = onKeyListener;
            return this;
        }

        /* renamed from: p */
        public a m710p(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0148f c0148f = this.f590a;
            c0148f.f558i = c0148f.f550a.getText(i10);
            this.f590a.f560k = onClickListener;
            return this;
        }

        /* renamed from: q */
        public a m711q(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0148f c0148f = this.f590a;
            c0148f.f558i = charSequence;
            c0148f.f560k = onClickListener;
            return this;
        }

        /* renamed from: r */
        public a m712r(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0148f c0148f = this.f590a;
            c0148f.f572w = listAdapter;
            c0148f.f573x = onClickListener;
            c0148f.f542I = i10;
            c0148f.f541H = true;
            return this;
        }

        /* renamed from: s */
        public a m713s(int i10) {
            AlertController.C0148f c0148f = this.f590a;
            c0148f.f555f = c0148f.f550a.getText(i10);
            return this;
        }

        /* renamed from: t */
        public a m714t(CharSequence charSequence) {
            this.f590a.f555f = charSequence;
            return this;
        }

        public a(Context context, int i10) {
            this.f590a = new AlertController.C0148f(new ContextThemeWrapper(context, DialogC0152b.m690g(context, i10)));
            this.f591b = i10;
        }
    }

    protected DialogC0152b(Context context, int i10) {
        super(context, m690g(context, i10));
        this.f589p = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: g */
    static int m690g(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2948a.f12165q, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public Button m691e(int i10) {
        return this.f589p.m649c(i10);
    }

    /* renamed from: f */
    public ListView m692f() {
        return this.f589p.m651e();
    }

    /* renamed from: h */
    public void m693h(CharSequence charSequence) {
        this.f589p.m659p(charSequence);
    }

    /* renamed from: i */
    public void m694i(View view, int i10, int i11, int i12, int i13) {
        this.f589p.m663u(view, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p053e.DialogC3055b, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f589p.m652f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f589p.m653h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f589p.m654i(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // p053e.DialogC3055b, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f589p.m660r(charSequence);
    }
}
