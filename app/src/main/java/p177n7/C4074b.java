package p177n7;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import p033c7.C1134c;
import p286w6.AbstractC5463b;
import p286w6.InterfaceC5462a;
import p286w6.InterfaceC5464c;

/* renamed from: n7.b */
/* loaded from: classes.dex */
public class C4074b extends AbstractC5463b {

    /* renamed from: f */
    private d f16544f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n7.b$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4074b.m16955d().m20091b(new b(C4074b.this, null));
        }
    }

    /* renamed from: n7.b$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC5464c {

        /* renamed from: n7.b$b$a */
        /* loaded from: classes.dex */
        class a extends AsyncTask<Void, Void, Void> {

            /* renamed from: a */
            final /* synthetic */ InterfaceC5462a f16547a;

            a(InterfaceC5462a interfaceC5462a) {
                this.f16547a = interfaceC5462a;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                Socket socket = C4074b.this.f16544f.f16552c;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e10) {
                        Log.w("InfluxV2Queue", "[Close-connection-item] Error closing socket: " + e10.getMessage());
                    }
                    C4074b.this.f16544f.f16552c = null;
                }
                C4074b.this.f16544f = null;
                return null;
            }

            @Override // android.os.AsyncTask
            /* renamed from: b */
            public void onPostExecute(Void r12) {
                InterfaceC5462a interfaceC5462a = this.f16547a;
                if (interfaceC5462a != null) {
                    interfaceC5462a.mo20089a();
                }
            }
        }

        private b() {
        }

        @Override // p286w6.InterfaceC5464c
        /* renamed from: a */
        public boolean mo16944a() {
            return true;
        }

        @Override // p286w6.InterfaceC5464c
        /* renamed from: b */
        public void mo16945b(InterfaceC5462a interfaceC5462a) {
            if (C4074b.this.f16544f == null) {
                return;
            }
            Log.d("InfluxV2Queue", "fireAction: Close the existing socket...");
            new a(interfaceC5462a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }

        /* synthetic */ b(C4074b c4074b, a aVar) {
            this();
        }
    }

    /* renamed from: n7.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        static final C4074b f16549a = new C4074b();
    }

    /* renamed from: n7.b$d */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a */
        public String f16550a;

        /* renamed from: b */
        public int f16551b;

        /* renamed from: c */
        public Socket f16552c;

        /* renamed from: d */
        public int f16553d;

        public d() {
        }
    }

    /* renamed from: d */
    public static C4074b m16955d() {
        return c.f16549a;
    }

    /* renamed from: g */
    public d m16958g() {
        d dVar = this.f16544f;
        if (dVar != null && dVar.f16552c != null) {
            return dVar;
        }
        String mo6540A0 = C1134c.m6537a().mo6540A0();
        int mo6599c1 = C1134c.m6537a().mo6599c1();
        int mo6590Z0 = C1134c.m6537a().mo6590Z0();
        d dVar2 = new d();
        this.f16544f = dVar2;
        dVar2.f16550a = mo6540A0;
        dVar2.f16551b = mo6599c1;
        dVar2.f16553d = mo6590Z0;
        try {
            Log.d("InfluxV2Queue", "getSocketInfo: Create a socket to " + mo6540A0 + ":" + mo6599c1 + "...");
            Socket socket = new Socket(InetAddress.getByName(mo6540A0), mo6599c1);
            d dVar3 = this.f16544f;
            dVar3.f16552c = socket;
            if (dVar3.f16553d > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                Log.d("InfluxV2Queue", "Schedule a special close-connection item with delay=" + this.f16544f.f16553d + "s...");
                handler.postDelayed(new a(), ((long) this.f16544f.f16553d) * 1000);
            }
            return this.f16544f;
        } catch (IOException e10) {
            Log.w("InfluxV2Queue", "Error creating the socket: " + e10.getMessage());
            return this.f16544f;
        }
    }
}
