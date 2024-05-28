package p035c9;

import android.content.Context;
import android.os.AsyncTask;
import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import p172n2.C4051a;
import p282w2.C5105c;
import p282w2.C5106d;

/* renamed from: c9.a */
/* loaded from: classes.dex */
public class AsyncTaskC1141a extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    protected Context f5482a;

    /* renamed from: b */
    protected a f5483b;

    /* renamed from: c9.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo6677a(String str);
    }

    public AsyncTaskC1141a(Context context, a aVar) {
        this.f5482a = context;
        this.f5483b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        C4051a.a aVar;
        String str;
        try {
            aVar = C4051a.m16839b(this.f5482a);
        } catch (IOException | C5105c | C5106d unused) {
            aVar = null;
        }
        if (aVar != null) {
            str = aVar.m16849b() ? "00000000-0000-0000-0000-000000000000" : aVar.m16848a();
        } else {
            str = BuildConfig.FLAVOR;
        }
        C1151k.m6712f("AdvertisingIdAsyncTask", "advertisingId:" + str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        this.f5483b.mo6677a(str);
    }
}
