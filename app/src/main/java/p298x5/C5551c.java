package p298x5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.google.firebase.installations.C2615c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p007a6.InterfaceC0042i;
import p070f3.C3127a;
import p070f3.C3135i;
import p212q5.InterfaceC4319f;
import p248t5.InterfaceC4733b;
import p298x5.AbstractC5552d;
import p298x5.AbstractC5554f;
import p321z2.C5984j;

/* renamed from: x5.c */
/* loaded from: classes.dex */
public class C5551c {

    /* renamed from: e */
    private static final Pattern f20589e = Pattern.compile("[0-9]+s");

    /* renamed from: f */
    private static final Charset f20590f = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f20591a;

    /* renamed from: b */
    private final InterfaceC4733b<InterfaceC0042i> f20592b;

    /* renamed from: c */
    private final InterfaceC4733b<InterfaceC4319f> f20593c;

    /* renamed from: d */
    private final C5553e f20594d = new C5553e();

    public C5551c(Context context, InterfaceC4733b<InterfaceC0042i> interfaceC4733b, InterfaceC4733b<InterfaceC4319f> interfaceC4733b2) {
        this.f20591a = context;
        this.f20592b = interfaceC4733b;
        this.f20593c = interfaceC4733b2;
    }

    /* renamed from: a */
    private static String m20319a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = BuildConfig.FLAVOR;
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m20320b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: c */
    private static JSONObject m20321c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: f */
    private String m20322f() {
        try {
            Context context = this.f20591a;
            byte[] m13775a = C3127a.m13775a(context, context.getPackageName());
            if (m13775a == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f20591a.getPackageName());
                return null;
            }
            return C3135i.m13795b(m13775a, false);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f20591a.getPackageName(), e10);
            return null;
        }
    }

    /* renamed from: g */
    private URL m20323g(String str) throws C2615c {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new C2615c(e10.getMessage(), C2615c.a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m20324h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m20325i(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    /* renamed from: j */
    private static void m20326j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m20327k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m20331o = m20331o(httpURLConnection);
        if (TextUtils.isEmpty(m20331o)) {
            return;
        }
        Log.w("Firebase-Installations", m20331o);
        Log.w("Firebase-Installations", m20319a(str, str2, str3));
    }

    /* renamed from: l */
    private HttpURLConnection m20328l(URL url, String str) throws C2615c {
        InterfaceC4319f.a mo17831a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f20591a.getPackageName());
            if (this.f20593c.get() != null && this.f20592b.get() != null && (mo17831a = this.f20593c.get().mo17831a("fire-installations-id")) != InterfaceC4319f.a.NONE) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f20592b.get().mo235a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(mo17831a.m17832b()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m20322f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C2615c("Firebase Installations Service is unavailable. Please try again later.", C2615c.a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m20329m(String str) {
        C5984j.m21278b(f20589e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private AbstractC5552d m20330n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f20590f));
        AbstractC5554f.a m20345a = AbstractC5554f.m20345a();
        AbstractC5552d.a m20338a = AbstractC5552d.m20338a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m20338a.mo20311f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m20338a.mo20308c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m20338a.mo20309d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m20345a.mo20317c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m20345a.mo20318d(m20329m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m20338a.mo20307b(m20345a.mo20315a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m20338a.mo20310e(AbstractC5552d.b.OK).mo20306a();
    }

    /* renamed from: o */
    private static String m20331o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f20590f));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    /* renamed from: p */
    private AbstractC5554f m20332p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f20590f));
        AbstractC5554f.a m20345a = AbstractC5554f.m20345a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m20345a.mo20317c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m20345a.mo20318d(m20329m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m20345a.mo20316b(AbstractC5554f.b.OK).mo20315a();
    }

    /* renamed from: q */
    private void m20333q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m20335s(httpURLConnection, m20324h(m20320b(str, str2)));
    }

    /* renamed from: r */
    private void m20334r(HttpURLConnection httpURLConnection) throws IOException {
        m20335s(httpURLConnection, m20324h(m20321c()));
    }

    /* renamed from: s */
    private static void m20335s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* renamed from: d */
    public AbstractC5552d m20336d(String str, String str2, String str3, String str4, String str5) throws C2615c {
        int responseCode;
        AbstractC5552d m20330n;
        if (this.f20594d.m20343b()) {
            URL m20323g = m20323g(String.format("projects/%s/installations", str3));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection m20328l = m20328l(m20323g, str);
                try {
                    try {
                        m20328l.setRequestMethod("POST");
                        m20328l.setDoOutput(true);
                        if (str5 != null) {
                            m20328l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                        }
                        m20333q(m20328l, str2, str4);
                        responseCode = m20328l.getResponseCode();
                        this.f20594d.m20344f(responseCode);
                    } finally {
                        m20328l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (m20325i(responseCode)) {
                    m20330n = m20330n(m20328l);
                } else {
                    m20327k(m20328l, str4, str, str3);
                    if (responseCode == 429) {
                        throw new C2615c("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C2615c.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m20326j();
                        m20330n = AbstractC5552d.m20338a().mo20310e(AbstractC5552d.b.BAD_CONFIG).mo20306a();
                    } else {
                        m20328l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                return m20330n;
            }
            throw new C2615c("Firebase Installations Service is unavailable. Please try again later.", C2615c.a.UNAVAILABLE);
        }
        throw new C2615c("Firebase Installations Service is unavailable. Please try again later.", C2615c.a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC5554f m20337e(String str, String str2, String str3, String str4) throws C2615c {
        int responseCode;
        AbstractC5554f m20332p;
        if (this.f20594d.m20343b()) {
            URL m20323g = m20323g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection m20328l = m20328l(m20323g, str);
                try {
                    try {
                        m20328l.setRequestMethod("POST");
                        m20328l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        m20328l.setDoOutput(true);
                        m20334r(m20328l);
                        responseCode = m20328l.getResponseCode();
                        this.f20594d.m20344f(responseCode);
                    } catch (IOException | AssertionError unused) {
                    }
                    if (m20325i(responseCode)) {
                        m20332p = m20332p(m20328l);
                    } else {
                        m20327k(m20328l, null, str, str3);
                        if (responseCode != 401 && responseCode != 404) {
                            if (responseCode == 429) {
                                throw new C2615c("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C2615c.a.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                m20326j();
                                m20332p = AbstractC5554f.m20345a().mo20316b(AbstractC5554f.b.BAD_CONFIG).mo20315a();
                            } else {
                                m20328l.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        }
                        m20332p = AbstractC5554f.m20345a().mo20316b(AbstractC5554f.b.AUTH_ERROR).mo20315a();
                    }
                    return m20332p;
                } finally {
                    m20328l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new C2615c("Firebase Installations Service is unavailable. Please try again later.", C2615c.a.UNAVAILABLE);
        }
        throw new C2615c("Firebase Installations Service is unavailable. Please try again later.", C2615c.a.UNAVAILABLE);
    }
}
