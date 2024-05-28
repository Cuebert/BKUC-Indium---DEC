package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogC0152b;
import androidx.appcompat.view.menu.InterfaceC0173j;
import p039d.C2954g;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
class DialogInterfaceOnKeyListenerC0169f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0173j.a {

    /* renamed from: n */
    private C0168e f888n;

    /* renamed from: o */
    private DialogC0152b f889o;

    /* renamed from: p */
    C0166c f890p;

    /* renamed from: q */
    private InterfaceC0173j.a f891q;

    public DialogInterfaceOnKeyListenerC0169f(C0168e c0168e) {
        this.f888n = c0168e;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j.a
    /* renamed from: a */
    public void mo824a(C0168e c0168e, boolean z10) {
        if (z10 || c0168e == this.f888n) {
            m1030c();
        }
        InterfaceC0173j.a aVar = this.f891q;
        if (aVar != null) {
            aVar.mo824a(c0168e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0173j.a
    /* renamed from: b */
    public boolean mo825b(C0168e c0168e) {
        InterfaceC0173j.a aVar = this.f891q;
        if (aVar != null) {
            return aVar.mo825b(c0168e);
        }
        return false;
    }

    /* renamed from: c */
    public void m1030c() {
        DialogC0152b dialogC0152b = this.f889o;
        if (dialogC0152b != null) {
            dialogC0152b.dismiss();
        }
    }

    /* renamed from: d */
    public void m1031d(IBinder iBinder) {
        C0168e c0168e = this.f888n;
        DialogC0152b.a aVar = new DialogC0152b.a(c0168e.m1024u());
        C0166c c0166c = new C0166c(aVar.m696b(), C2954g.f12303l);
        this.f890p = c0166c;
        c0166c.mo938i(this);
        this.f888n.m1007b(this.f890p);
        aVar.m697c(this.f890p.m966e(), this);
        View m1028y = c0168e.m1028y();
        if (m1028y != null) {
            aVar.m699e(m1028y);
        } else {
            aVar.m700f(c0168e.m1026w()).m714t(c0168e.m1027x());
        }
        aVar.m709o(this);
        DialogC0152b m695a = aVar.m695a();
        this.f889o = m695a;
        m695a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f889o.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f889o.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f888n.m992L((C0170g) this.f890p.m966e().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f890p.mo932a(this.f888n, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f889o.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f889o.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f888n.m1012e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f888n.performShortcut(i10, keyEvent, 0);
    }
}
