package p227r8;

import android.content.Context;
import android.text.TextUtils;
import com.roblox.client.components.InterfaceC2811l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;

/* renamed from: r8.a */
/* loaded from: classes.dex */
public class C4453a {

    /* renamed from: a */
    private InterfaceC2811l f18058a;

    /* renamed from: b */
    private Context f18059b;

    public C4453a(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private File m18273b() {
        return new File("/data/local/tmp/ClientAppSettings.json");
    }

    /* renamed from: c */
    private File m18274c() {
        return this.f18059b.getApplicationContext().getFilesDir();
    }

    /* renamed from: d */
    private File m18275d() {
        return new File(m18274c(), "exe/ClientSettings/ClientAppSettings.json");
    }

    /* renamed from: f */
    private String m18276f(File file) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append('\n');
            }
            bufferedReader.close();
        } catch (IOException e10) {
            C1151k.m6709c("rbx.settings.local", "Exception caught when readLocalSettings: file: " + file.getName() + ": " + e10);
            m18277i("Exception caught when readLocalSettings.");
        }
        return sb2.toString();
    }

    /* renamed from: i */
    private void m18277i(String str) {
        InterfaceC2811l interfaceC2811l = this.f18058a;
        if (interfaceC2811l != null) {
            interfaceC2811l.m12450a(str, 1);
        }
    }

    /* renamed from: a */
    public void m18278a() {
        File m18275d = m18275d();
        if (m18275d.exists()) {
            C1151k.m6707a("rbx.settings.local", "saveLocalSettings: file: " + m18275d.getName() + ", DeletedOK = " + m18275d.delete());
        }
    }

    /* renamed from: e */
    public String m18279e() {
        try {
            return new JSONObject(m18276f(m18273b())).toString();
        } catch (JSONException unused) {
            C1151k.m6709c("rbx.settings.local", "Failed to read external JSON");
            return null;
        }
    }

    /* renamed from: g */
    public String m18280g() {
        File m18275d = m18275d();
        if (m18275d.exists()) {
            return m18276f(m18275d);
        }
        return null;
    }

    /* renamed from: h */
    public void m18281h(String str) {
        if (TextUtils.isEmpty(str)) {
            m18278a();
            m18277i("Clear the existing settings.");
            return;
        }
        try {
            String jSONObject = new JSONObject(str).toString();
            File file = new File(m18274c(), "exe/ClientSettings/");
            if (!file.exists() && !file.mkdirs()) {
                m18277i("Failed to create the directory to hold Local settings.");
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(m18275d());
                fileOutputStream.write(jSONObject.getBytes());
                fileOutputStream.close();
                m18277i("Finished saving to the device.");
            } catch (IOException e10) {
                C1151k.m6709c("rbx.settings.local", "File writing failed: " + e10.toString());
                m18277i("Failed to write file to the device.");
            }
        } catch (JSONException unused) {
            m18277i("The input is not a valid JSON string");
        }
    }

    public C4453a(Context context, InterfaceC2811l interfaceC2811l) {
        this.f18059b = context;
        this.f18058a = interfaceC2811l;
    }
}
