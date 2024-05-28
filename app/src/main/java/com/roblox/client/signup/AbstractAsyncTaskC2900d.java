package com.roblox.client.signup;

import android.os.AsyncTask;
import com.roblox.client.C2877p0;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p035c9.C1157q;
import p100h7.C3409b;

/* renamed from: com.roblox.client.signup.d */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC2900d extends AsyncTask<Void, Void, C2902f> {

    /* renamed from: a */
    private String f11611a = "Z^#q";

    /* renamed from: b */
    private String f11612b = "Fu.*mJ";

    /* renamed from: c */
    private String f11613c = "l%=f~RIW";

    /* renamed from: d */
    private String f11614d = "L65HQ,v?K";

    /* renamed from: e */
    private String f11615e = "hC39$";

    /* renamed from: f */
    private String f11616f = "qb@Wl";

    /* renamed from: g */
    private String f11617g = "Av=M";

    /* renamed from: h */
    private String f11618h = "B7YpO";

    /* renamed from: i */
    private String f11619i = "jEda0J~i";

    /* renamed from: j */
    private String f11620j = "HZmfcyG9,F";

    /* renamed from: k */
    private final boolean f11621k = true;

    /* renamed from: l */
    protected String f11622l;

    /* renamed from: m */
    protected String f11623m;

    /* renamed from: n */
    protected int f11624n;

    /* renamed from: o */
    protected int f11625o;

    /* renamed from: p */
    protected int f11626p;

    /* renamed from: q */
    protected int f11627q;

    /* renamed from: r */
    protected String f11628r;

    /* renamed from: s */
    protected String f11629s;

    /* renamed from: t */
    protected String f11630t;

    /* renamed from: u */
    protected a f11631u;

    /* renamed from: com.roblox.client.signup.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo13140a(C2902f c2902f);

        /* renamed from: b */
        void mo13141b(C2902f c2902f);
    }

    public AbstractAsyncTaskC2900d(int i10, int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5, a aVar) {
        this.f11631u = aVar;
        this.f11622l = str2;
        this.f11623m = str3;
        this.f11624n = i10;
        this.f11625o = i11;
        this.f11626p = i12;
        this.f11627q = i13;
        this.f11628r = str;
        this.f11629s = str4;
        this.f11630t = str5;
    }

    /* renamed from: a */
    private String m13150a(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.reset();
        byte[] digest = messageDigest.digest(str.getBytes("UTF-8"));
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : digest) {
            stringBuffer.append(Integer.toString((b10 & 255) + 256, 16).substring(1));
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m13151d(int i10, int i11, int i12) {
        return C1157q.m6753c("%d/%d/%d", Integer.valueOf(i10 + 1), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* renamed from: g */
    private C2902f m13152g() {
        C2902f c2902f = new C2902f();
        c2902f.f11633a.add("PasswordInvalid");
        return c2902f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2902f doInBackground(Void... voidArr) {
        if (this.f11623m.trim().length() == 0) {
            return m13152g();
        }
        return mo13146c(this.f11622l, this.f11623m, this.f11628r, this.f11629s, this.f11630t, m13155f(this.f11622l));
    }

    /* renamed from: c */
    protected abstract C2902f mo13146c(String str, String str2, String str3, String str4, String str5, C3409b.a[] aVarArr);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public String m13154e() {
        int i10 = this.f11624n;
        return i10 == 1 ? "Male" : i10 == 2 ? "Female" : "Unknown";
    }

    /* renamed from: f */
    protected C3409b.a[] m13155f(String str) {
        String str2;
        String str3;
        try {
            if (C2877p0.m12941p0()) {
                str3 = this.f11619i + this.f11616f + this.f11617g + this.f11620j + this.f11618h + str;
            } else {
                str3 = this.f11612b + this.f11614d + this.f11611a + this.f11613c + this.f11615e + str;
            }
            str2 = m13150a(str3);
        } catch (Exception unused) {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        C3409b.a aVar = new C3409b.a();
        aVar.f14278a = "X-RBXUSER-TOKEN";
        aVar.f14279b = str2;
        return new C3409b.a[]{aVar};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C2902f c2902f) {
        super.onPostExecute(c2902f);
        if (this.f11631u != null) {
            if (c2902f.m13157a()) {
                this.f11631u.mo13140a(c2902f);
            } else {
                this.f11631u.mo13141b(c2902f);
            }
        }
    }
}
