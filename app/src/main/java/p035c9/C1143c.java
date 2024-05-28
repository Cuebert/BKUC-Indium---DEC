package p035c9;

import android.content.Context;
import android.os.AsyncTask;
import com.appsflyer.oaid.BuildConfig;
import com.google.common.util.concurrent.C2569q;
import p023b9.C1079c;
import p033c7.C1134c;
import p035c9.AsyncTaskC1141a;

/* renamed from: c9.c */
/* loaded from: classes.dex */
public class C1143c implements AsyncTaskC1141a.a {

    /* renamed from: b */
    private static C1143c f5486b;

    /* renamed from: c */
    private static String f5487c;

    /* renamed from: d */
    public static C2569q<String> f5488d = C2569q.m11863E();

    /* renamed from: a */
    private boolean f5489a = false;

    /* renamed from: d */
    public static String m6679d() {
        String str;
        if (C1134c.m6537a().mo6659x0()) {
            if (!C1079c.m6380c().m6392m() && (str = f5487c) != null) {
                return str;
            }
            f5487c = null;
            return BuildConfig.FLAVOR;
        }
        return f5487c;
    }

    /* renamed from: g */
    public static C1143c m6680g() {
        if (f5486b == null) {
            synchronized (C1143c.class) {
                if (f5486b == null) {
                    f5486b = new C1143c();
                }
            }
        }
        return f5486b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m6681h(AsyncTaskC1141a.a aVar, String str) {
        mo6677a(str);
        if (aVar != null) {
            aVar.mo6677a(str);
        }
    }

    @Override // p035c9.AsyncTaskC1141a.a
    /* renamed from: a */
    public void mo6677a(String str) {
        f5487c = str;
    }

    /* renamed from: c */
    public void m6682c() {
        f5487c = null;
        this.f5489a = false;
    }

    /* renamed from: e */
    public void m6683e(Context context) {
        m6684f(context, null);
    }

    /* renamed from: f */
    public void m6684f(Context context, final AsyncTaskC1141a.a aVar) {
        if (C1134c.m6537a().mo6659x0() && C1079c.m6380c().m6392m()) {
            return;
        }
        if (!this.f5489a) {
            this.f5489a = true;
            new AsyncTaskC1141a(context, new AsyncTaskC1141a.a() { // from class: c9.b
                @Override // p035c9.AsyncTaskC1141a.a
                /* renamed from: a */
                public final void mo6677a(String str) {
                    C1143c.this.m6681h(aVar, str);
                }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else if (aVar != null) {
            aVar.mo6677a(f5487c);
        }
    }
}
