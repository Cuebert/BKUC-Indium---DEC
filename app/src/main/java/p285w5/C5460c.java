package p285w5;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p098h5.C3399c;

/* renamed from: w5.c */
/* loaded from: classes.dex */
public class C5460c {

    /* renamed from: a */
    private final File f20367a;

    /* renamed from: b */
    private final C3399c f20368b;

    /* renamed from: w5.c$a */
    /* loaded from: classes.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C5460c(C3399c c3399c) {
        this.f20367a = new File(c3399c.m14987h().getFilesDir(), "PersistedInstallation." + c3399c.m14990l() + ".json");
        this.f20368b = c3399c;
    }

    /* renamed from: b */
    private JSONObject m20074b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f20367a);
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public AbstractC5461d m20075a(AbstractC5461d abstractC5461d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC5461d.mo20051d());
            jSONObject.put("Status", abstractC5461d.mo20054g().ordinal());
            jSONObject.put("AuthToken", abstractC5461d.mo20049b());
            jSONObject.put("RefreshToken", abstractC5461d.mo20053f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC5461d.mo20055h());
            jSONObject.put("ExpiresInSecs", abstractC5461d.mo20050c());
            jSONObject.put("FisError", abstractC5461d.mo20052e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f20368b.m14987h().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.f20367a)) {
            return abstractC5461d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: c */
    public AbstractC5461d m20076c() {
        JSONObject m20074b = m20074b();
        String optString = m20074b.optString("Fid", null);
        int optInt = m20074b.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m20074b.optString("AuthToken", null);
        String optString3 = m20074b.optString("RefreshToken", null);
        long optLong = m20074b.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m20074b.optLong("ExpiresInSecs", 0L);
        return AbstractC5461d.m20077a().mo20060d(optString).mo20063g(a.values()[optInt]).mo20058b(optString2).mo20062f(optString3).mo20064h(optLong).mo20059c(optLong2).mo20061e(m20074b.optString("FisError", null)).mo20057a();
    }
}
