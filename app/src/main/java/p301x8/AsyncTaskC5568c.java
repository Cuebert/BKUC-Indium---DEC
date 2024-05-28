package p301x8;

import android.os.AsyncTask;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.io.PrintWriter;
import p177n7.C4074b;

/* renamed from: x8.c */
/* loaded from: classes.dex */
public class AsyncTaskC5568c extends AsyncTask<Void, Void, C5569d> {

    /* renamed from: a */
    protected String f20671a;

    /* renamed from: b */
    protected int f20672b;

    /* renamed from: c */
    protected String f20673c;

    /* renamed from: d */
    InterfaceC5566a f20674d;

    public AsyncTaskC5568c(String str, int i10, String str2, InterfaceC5566a interfaceC5566a) {
        this.f20674d = interfaceC5566a;
        this.f20671a = str;
        this.f20673c = str2;
        this.f20672b = i10;
        if (str2 == null) {
            this.f20673c = BuildConfig.FLAVOR;
        }
    }

    /* renamed from: c */
    private static C5569d m20466c(C4074b.d dVar, String str) {
        C5569d c5569d = new C5569d(dVar.f16550a, dVar.f16551b);
        c5569d.m20469a(str);
        try {
            PrintWriter printWriter = new PrintWriter(dVar.f16552c.getOutputStream(), true);
            if (!printWriter.checkError()) {
                printWriter.println(str);
                printWriter.flush();
                c5569d.m20469a(BuildConfig.FLAVOR);
            } else {
                c5569d.m20470b(false);
            }
        } catch (Exception e10) {
            Log.w("RbxTcpRequest", "Error sending influx data over TCP = " + e10.getMessage());
            c5569d.m20470b(false);
        }
        return c5569d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5569d doInBackground(Void... voidArr) {
        C4074b.d m16958g = C4074b.m16955d().m16958g();
        if (m16958g != null && m16958g.f16552c != null) {
            C5569d m20466c = m20466c(m16958g, this.f20673c);
            if (m16958g.f16553d == 0) {
                try {
                    Log.d("RbxTcpRequest", "doInBackground: timeToLive is 0. Close socket immediately...");
                    m16958g.f16552c.close();
                } catch (IOException e10) {
                    Log.w("RbxTcpRequest", "Error closing the socket: " + e10.getMessage());
                }
            }
            return m20466c;
        }
        C5569d c5569d = new C5569d(this.f20671a, this.f20672b);
        c5569d.m20469a(this.f20673c);
        c5569d.m20470b(false);
        return c5569d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C5569d c5569d) {
        super.onPostExecute(c5569d);
        if (c5569d == null) {
            c5569d = new C5569d(this.f20671a, this.f20672b);
            c5569d.m20470b(false);
        }
        InterfaceC5566a interfaceC5566a = this.f20674d;
        if (interfaceC5566a != null) {
            interfaceC5566a.mo16954a(c5569d);
        }
    }
}
