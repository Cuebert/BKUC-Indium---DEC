package p100h7;

import android.os.AsyncTask;
import p035c9.C1151k;
import p100h7.C3409b;
import p128j7.C3656c;
import p128j7.InterfaceC3657d;

/* renamed from: h7.a */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC3408a extends AsyncTask<Void, Void, C3417j> implements InterfaceC3412e {

    /* renamed from: a */
    protected C3417j f14270a;

    /* renamed from: b */
    protected String f14271b;

    /* renamed from: c */
    protected C3409b.a[] f14272c;

    /* renamed from: d */
    protected InterfaceC3419l f14273d;

    /* renamed from: e */
    protected String f14274e = null;

    /* renamed from: f */
    protected String f14275f = null;

    /* renamed from: g */
    protected InterfaceC3657d<C3417j> f14276g;

    public AbstractAsyncTaskC3408a(String str, InterfaceC3419l interfaceC3419l, C3409b.a[] aVarArr) {
        this.f14273d = interfaceC3419l;
        this.f14271b = str;
        this.f14272c = aVarArr;
        m15010g(new C3656c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3417j doInBackground(Void... voidArr) {
        this.f14270a = C3409b.m15020j(this.f14271b, this.f14274e, this.f14272c, this.f14275f);
        do {
            InterfaceC3657d<C3417j> interfaceC3657d = this.f14276g;
            if (interfaceC3657d != null && interfaceC3657d.mo6373d(this.f14270a) && this.f14276g.mo15564b()) {
                if (this.f14276g.mo15565c() > 0) {
                    try {
                        Thread.sleep(this.f14276g.mo15565c());
                    } catch (InterruptedException e10) {
                        C1151k.m6712f("rbx.httprequest", "Thread sleep error: " + e10.getMessage());
                    }
                }
                this.f14270a = C3409b.m15020j(this.f14271b, this.f14274e, this.f14272c, this.f14275f);
                this.f14276g.mo15563a();
                m15009f();
            } else {
                return this.f14270a;
            }
        } while (!m15005b());
        return null;
    }

    /* renamed from: b */
    public boolean m15005b() {
        return isCancelled();
    }

    @Override // p100h7.InterfaceC3412e
    /* renamed from: c */
    public void mo15006c() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C3417j c3417j) {
        super.onPostExecute(c3417j);
        InterfaceC3419l interfaceC3419l = this.f14273d;
        if (interfaceC3419l != null) {
            interfaceC3419l.mo281b(this.f14270a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Void... voidArr) {
        super.onProgressUpdate(voidArr);
        InterfaceC3419l interfaceC3419l = this.f14273d;
        if (interfaceC3419l != null) {
            interfaceC3419l.mo12250a(this.f14270a);
        }
    }

    /* renamed from: f */
    public void m15009f() {
        publishProgress(new Void[0]);
    }

    /* renamed from: g */
    public void m15010g(InterfaceC3657d<C3417j> interfaceC3657d) {
        this.f14276g = interfaceC3657d;
    }
}
