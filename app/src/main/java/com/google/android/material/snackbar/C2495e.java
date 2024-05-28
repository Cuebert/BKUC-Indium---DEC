package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.e */
/* loaded from: classes.dex */
class C2495e {

    /* renamed from: e */
    private static C2495e f9684e;

    /* renamed from: a */
    private final Object f9685a = new Object();

    /* renamed from: b */
    private final Handler f9686b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c */
    private c f9687c;

    /* renamed from: d */
    private c f9688d;

    /* renamed from: com.google.android.material.snackbar.e$a */
    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C2495e.this.m11396c((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.e$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m11399a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.e$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final WeakReference<b> f9690a;

        /* renamed from: b */
        int f9691b;

        /* renamed from: c */
        boolean f9692c;

        /* renamed from: a */
        boolean m11400a(b bVar) {
            return bVar != null && this.f9690a.get() == bVar;
        }
    }

    private C2495e() {
    }

    /* renamed from: a */
    private boolean m11392a(c cVar, int i10) {
        b bVar = cVar.f9690a.get();
        if (bVar == null) {
            return false;
        }
        this.f9686b.removeCallbacksAndMessages(cVar);
        bVar.m11399a(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2495e m11393b() {
        if (f9684e == null) {
            f9684e = new C2495e();
        }
        return f9684e;
    }

    /* renamed from: d */
    private boolean m11394d(b bVar) {
        c cVar = this.f9687c;
        return cVar != null && cVar.m11400a(bVar);
    }

    /* renamed from: g */
    private void m11395g(c cVar) {
        int i10 = cVar.f9691b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f9686b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f9686b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    /* renamed from: c */
    void m11396c(c cVar) {
        synchronized (this.f9685a) {
            if (this.f9687c == cVar || this.f9688d == cVar) {
                m11392a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public void m11397e(b bVar) {
        synchronized (this.f9685a) {
            if (m11394d(bVar)) {
                c cVar = this.f9687c;
                if (!cVar.f9692c) {
                    cVar.f9692c = true;
                    this.f9686b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: f */
    public void m11398f(b bVar) {
        synchronized (this.f9685a) {
            if (m11394d(bVar)) {
                c cVar = this.f9687c;
                if (cVar.f9692c) {
                    cVar.f9692c = false;
                    m11395g(cVar);
                }
            }
        }
    }
}
