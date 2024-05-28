package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.C1307d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p003a2.AbstractC0014i;
import p003a2.C0013h;
import p016b2.AbstractC0974f;
import p016b2.AbstractC0975g;
import p016b2.InterfaceC0981m;
import p056e2.C3061a;
import p069f2.C3125b;
import p069f2.InterfaceC3124a;
import p069f2.InterfaceC3126c;
import p136k2.InterfaceC3749a;
import p152l5.C3875b;
import p152l5.InterfaceC3874a;
import p307y1.C5593b;
import p320z1.AbstractC5950a;
import p320z1.AbstractC5959j;
import p320z1.AbstractC5960k;
import p320z1.AbstractC5961l;
import p320z1.AbstractC5962m;
import p320z1.AbstractC5963n;
import p320z1.AbstractC5964o;
import p320z1.EnumC5965p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes.dex */
public final class C1307d implements InterfaceC0981m {

    /* renamed from: a */
    private final InterfaceC3874a f5923a;

    /* renamed from: b */
    private final ConnectivityManager f5924b;

    /* renamed from: c */
    private final Context f5925c;

    /* renamed from: d */
    final URL f5926d;

    /* renamed from: e */
    private final InterfaceC3749a f5927e;

    /* renamed from: f */
    private final InterfaceC3749a f5928f;

    /* renamed from: g */
    private final int f5929g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final URL f5930a;

        /* renamed from: b */
        final AbstractC5959j f5931b;

        /* renamed from: c */
        final String f5932c;

        a(URL url, AbstractC5959j abstractC5959j, String str) {
            this.f5930a = url;
            this.f5931b = abstractC5959j;
            this.f5932c = str;
        }

        /* renamed from: a */
        a m7209a(URL url) {
            return new a(url, this.f5931b, this.f5932c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f5933a;

        /* renamed from: b */
        final URL f5934b;

        /* renamed from: c */
        final long f5935c;

        b(int i10, URL url, long j10) {
            this.f5933a = i10;
            this.f5934b = url;
            this.f5935c = j10;
        }
    }

    C1307d(Context context, InterfaceC3749a interfaceC3749a, InterfaceC3749a interfaceC3749a2, int i10) {
        this.f5923a = AbstractC5959j.m21223b();
        this.f5925c = context;
        this.f5924b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5926d = m7208n(C1304a.f5913c);
        this.f5927e = interfaceC3749a2;
        this.f5928f = interfaceC3749a;
        this.f5929g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public b m7199e(a aVar) throws IOException {
        C3061a.m13520f("CctTransportBackend", "Making request to: %s", aVar.f5930a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f5930a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f5929g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f5932c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f5923a.mo16476b(aVar.f5931b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C3061a.m13520f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    C3061a.m13516b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C3061a.m13516b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m7207m = m7207m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC5963n.m21232b(new BufferedReader(new InputStreamReader(m7207m))).mo21216c());
                            if (m7207m != null) {
                                m7207m.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e10) {
            e = e10;
            C3061a.m13518d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            C3061a.m13518d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            C3061a.m13518d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (C3875b e13) {
            e = e13;
            C3061a.m13518d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* renamed from: f */
    private static int m7200f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC5964o.b.UNKNOWN_MOBILE_SUBTYPE.m21235c();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC5964o.b.COMBINED.m21235c();
        }
        if (AbstractC5964o.b.m21234b(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    private static int m7201g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC5964o.c.NONE.m21237c();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    private static int m7202h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            C3061a.m13518d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    /* renamed from: i */
    private AbstractC5959j m7203i(AbstractC0974f abstractC0974f) {
        AbstractC5961l.a m21227j;
        HashMap hashMap = new HashMap();
        for (AbstractC0014i abstractC0014i : abstractC0974f.mo6146b()) {
            String mo91j = abstractC0014i.mo91j();
            if (!hashMap.containsKey(mo91j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC0014i);
                hashMap.put(mo91j, arrayList);
            } else {
                ((List) hashMap.get(mo91j)).add(abstractC0014i);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC0014i abstractC0014i2 = (AbstractC0014i) ((List) entry.getValue()).get(0);
            AbstractC5962m.a mo21209b = AbstractC5962m.m21228a().mo21213f(EnumC5965p.DEFAULT).mo21214g(this.f5928f.mo15955a()).mo21215h(this.f5927e.mo15955a()).mo21209b(AbstractC5960k.m21224a().mo21185c(AbstractC5960k.b.ANDROID_FIREBASE).mo21184b(AbstractC5950a.m21148a().mo21173m(Integer.valueOf(abstractC0014i2.m132g("sdk-version"))).mo21170j(abstractC0014i2.m131b("model")).mo21166f(abstractC0014i2.m131b("hardware")).mo21164d(abstractC0014i2.m131b("device")).mo21172l(abstractC0014i2.m131b("product")).mo21171k(abstractC0014i2.m131b("os-uild")).mo21168h(abstractC0014i2.m131b("manufacturer")).mo21165e(abstractC0014i2.m131b("fingerprint")).mo21163c(abstractC0014i2.m131b("country")).mo21167g(abstractC0014i2.m131b("locale")).mo21169i(abstractC0014i2.m131b("mcc_mnc")).mo21162b(abstractC0014i2.m131b("application_build")).mo21161a()).mo21183a());
            try {
                mo21209b.m21229i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo21209b.m21230j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC0014i abstractC0014i3 : (List) entry.getValue()) {
                C0013h mo89e = abstractC0014i3.mo89e();
                C5593b m129b = mo89e.m129b();
                if (m129b.equals(C5593b.m20616b("proto"))) {
                    m21227j = AbstractC5961l.m21227j(mo89e.m128a());
                } else if (m129b.equals(C5593b.m20616b("json"))) {
                    m21227j = AbstractC5961l.m21226i(new String(mo89e.m128a(), Charset.forName("UTF-8")));
                } else {
                    C3061a.m13521g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m129b);
                }
                m21227j.mo21195c(abstractC0014i3.mo90f()).mo21196d(abstractC0014i3.mo92k()).mo21200h(abstractC0014i3.m133h("tz-offset")).mo21197e(AbstractC5964o.m21233a().mo21221c(AbstractC5964o.c.m21236b(abstractC0014i3.m132g("net-type"))).mo21220b(AbstractC5964o.b.m21234b(abstractC0014i3.m132g("mobile-subtype"))).mo21219a());
                if (abstractC0014i3.mo88d() != null) {
                    m21227j.mo21194b(abstractC0014i3.mo88d());
                }
                arrayList3.add(m21227j.mo21193a());
            }
            mo21209b.mo21210c(arrayList3);
            arrayList2.add(mo21209b.mo21208a());
        }
        return AbstractC5959j.m21222a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m7204j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    static long m7205k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ a m7206l(a aVar, b bVar) {
        URL url = bVar.f5934b;
        if (url == null) {
            return null;
        }
        C3061a.m13516b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m7209a(bVar.f5934b);
    }

    /* renamed from: m */
    private static InputStream m7207m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    private static URL m7208n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // p016b2.InterfaceC0981m
    /* renamed from: a */
    public AbstractC0014i mo6175a(AbstractC0014i abstractC0014i) {
        NetworkInfo activeNetworkInfo = this.f5924b.getActiveNetworkInfo();
        return abstractC0014i.m135l().m136a("sdk-version", Build.VERSION.SDK_INT).m138c("model", Build.MODEL).m138c("hardware", Build.HARDWARE).m138c("device", Build.DEVICE).m138c("product", Build.PRODUCT).m138c("os-uild", Build.ID).m138c("manufacturer", Build.MANUFACTURER).m138c("fingerprint", Build.FINGERPRINT).m137b("tz-offset", m7205k()).m136a("net-type", m7201g(activeNetworkInfo)).m136a("mobile-subtype", m7200f(activeNetworkInfo)).m138c("country", Locale.getDefault().getCountry()).m138c("locale", Locale.getDefault().getLanguage()).m138c("mcc_mnc", m7204j(this.f5925c).getSimOperator()).m138c("application_build", Integer.toString(m7202h(this.f5925c))).mo93d();
    }

    @Override // p016b2.InterfaceC0981m
    /* renamed from: b */
    public AbstractC0975g mo6176b(AbstractC0974f abstractC0974f) {
        AbstractC5959j m7203i = m7203i(abstractC0974f);
        URL url = this.f5926d;
        if (abstractC0974f.mo6147c() != null) {
            try {
                C1304a m7191d = C1304a.m7191d(abstractC0974f.mo6147c());
                r3 = m7191d.m7193e() != null ? m7191d.m7193e() : null;
                if (m7191d.m7194f() != null) {
                    url = m7208n(m7191d.m7194f());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC0975g.m6159a();
            }
        }
        try {
            b bVar = (b) C3125b.m13774a(5, new a(url, m7203i, r3), new InterfaceC3124a() { // from class: com.google.android.datatransport.cct.b
                @Override // p069f2.InterfaceC3124a
                /* renamed from: a */
                public final Object mo7195a(Object obj) {
                    C1307d.b m7199e;
                    m7199e = C1307d.this.m7199e((C1307d.a) obj);
                    return m7199e;
                }
            }, new InterfaceC3126c() { // from class: com.google.android.datatransport.cct.c
                @Override // p069f2.InterfaceC3126c
                /* renamed from: a */
                public final Object mo7196a(Object obj, Object obj2) {
                    C1307d.a m7206l;
                    m7206l = C1307d.m7206l((C1307d.a) obj, (C1307d.b) obj2);
                    return m7206l;
                }
            });
            int i10 = bVar.f5933a;
            if (i10 == 200) {
                return AbstractC0975g.m6161e(bVar.f5935c);
            }
            if (i10 < 500 && i10 != 404) {
                if (i10 == 400) {
                    return AbstractC0975g.m6160d();
                }
                return AbstractC0975g.m6159a();
            }
            return AbstractC0975g.m6162f();
        } catch (IOException e10) {
            C3061a.m13518d("CctTransportBackend", "Could not make request to the backend", e10);
            return AbstractC0975g.m6162f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1307d(Context context, InterfaceC3749a interfaceC3749a, InterfaceC3749a interfaceC3749a2) {
        this(context, interfaceC3749a, interfaceC3749a2, 130000);
    }
}
