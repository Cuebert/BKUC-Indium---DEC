package p100h7;

import android.os.AsyncTask;
import com.appsflyer.oaid.BuildConfig;
import p100h7.C3409b;

/* renamed from: h7.p */
/* loaded from: classes.dex */
public class AsyncTaskC3423p extends AsyncTask<Void, Void, C3417j> implements InterfaceC3412e {

    /* renamed from: a */
    private C3417j f14298a;

    /* renamed from: b */
    private String f14299b;

    /* renamed from: c */
    private String f14300c;

    /* renamed from: d */
    private C3409b.a[] f14301d;

    /* renamed from: e */
    private String f14302e;

    /* renamed from: f */
    protected InterfaceC3420m f14303f;

    /* renamed from: g */
    protected int f14304g;

    /* renamed from: h */
    protected int f14305h;

    public AsyncTaskC3423p(String str, String str2, C3409b.a[] aVarArr, InterfaceC3420m interfaceC3420m) {
        this(str, str2, aVarArr, interfaceC3420m, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3417j doInBackground(Void... voidArr) {
        C3417j m15022l = C3409b.m15022l(this.f14299b, this.f14300c, this.f14301d, this.f14302e, this.f14304g, this.f14305h);
        this.f14298a = m15022l;
        return m15022l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C3417j c3417j) {
        super.onPostExecute(c3417j);
        InterfaceC3420m interfaceC3420m = this.f14303f;
        if (interfaceC3420m != null) {
            interfaceC3420m.mo12177a(this.f14298a);
        }
    }

    public AsyncTaskC3423p(String str, String str2, C3409b.a[] aVarArr, InterfaceC3420m interfaceC3420m, String str3) {
        this(str, str2, aVarArr, interfaceC3420m, str3, -1, -1);
    }

    public AsyncTaskC3423p(String str, String str2, C3409b.a[] aVarArr, InterfaceC3420m interfaceC3420m, String str3, int i10, int i11) {
        this.f14304g = -1;
        this.f14305h = -1;
        this.f14303f = interfaceC3420m;
        this.f14299b = str;
        this.f14300c = str2;
        this.f14301d = aVarArr;
        this.f14302e = str3;
        if (str2 == null) {
            this.f14300c = BuildConfig.FLAVOR;
        }
        this.f14304g = i10;
        this.f14305h = i11;
    }
}
