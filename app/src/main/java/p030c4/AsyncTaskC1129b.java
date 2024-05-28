package p030c4;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.C1379b;
import p030c4.C1128a;
import p282w2.C5105c;
import p282w2.C5106d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c4.b */
/* loaded from: classes.dex */
public final class AsyncTaskC1129b extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ Context f5462a;

    /* renamed from: b */
    final /* synthetic */ C1128a.a f5463b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncTaskC1129b(Context context, C1128a.a aVar) {
        this.f5462a = context;
        this.f5463b = aVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            C1128a.m6519a(this.f5462a);
            return 0;
        } catch (C5105c e10) {
            return Integer.valueOf(e10.f19370n);
        } catch (C5106d e11) {
            return Integer.valueOf(e11.m19745a());
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        C1379b c1379b;
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f5463b.onProviderInstalled();
            return;
        }
        c1379b = C1128a.f5458a;
        this.f5463b.onProviderInstallFailed(num.intValue(), c1379b.mo7387b(this.f5462a, num.intValue(), "pi"));
    }
}
