package p325z6;

import android.os.AsyncTask;
import com.roblox.client.components.InterfaceC2810k;
import p035c9.C1151k;
import p076f9.C3213g;

/* renamed from: z6.a */
/* loaded from: classes.dex */
public class AsyncTaskC6013a extends AsyncTask<Void, Void, Void> implements InterfaceC2810k {

    /* renamed from: b */
    public static InterfaceC2810k.a<a> f22083b = new b();

    /* renamed from: a */
    private a f22084a;

    /* renamed from: z6.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo12478a(int i10);
    }

    /* renamed from: z6.a$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC2810k.a<a> {
        @Override // com.roblox.client.components.InterfaceC2810k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC2810k mo12449a(a aVar) {
            return new AsyncTaskC6013a(aVar);
        }
    }

    public AsyncTaskC6013a(a aVar) {
        this.f22084a = aVar;
    }

    /* renamed from: b */
    public static InterfaceC2810k m21329b(a aVar) {
        return f22083b.mo12449a(aVar);
    }

    @Override // com.roblox.client.components.InterfaceC2810k
    /* renamed from: a */
    public void mo12448a() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... voidArr) {
        C3213g.m14269i().m14282l();
        C1151k.m6707a("rbx.xapkmanager", "Unpacking complete");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void r22) {
        a aVar = this.f22084a;
        if (aVar != null) {
            aVar.mo12478a(0);
        }
    }
}
