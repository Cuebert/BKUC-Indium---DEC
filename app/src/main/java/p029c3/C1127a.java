package p029c3;

import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.util.Locale;
import p321z2.C5970c;

/* renamed from: c3.a */
/* loaded from: classes.dex */
public class C1127a {

    /* renamed from: a */
    private final String f5454a;

    /* renamed from: b */
    private final String f5455b;

    /* renamed from: c */
    private final C5970c f5456c;

    /* renamed from: d */
    private final int f5457d;

    public C1127a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = BuildConfig.FLAVOR;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f5455b = sb2;
        this.f5454a = str;
        this.f5456c = new C5970c(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f5454a, i10)) {
            i10++;
        }
        this.f5457d = i10;
    }

    /* renamed from: a */
    public void m6515a(String str, Object... objArr) {
        if (m6518d(3)) {
            Log.d(this.f5454a, m6517c(str, objArr));
        }
    }

    /* renamed from: b */
    public void m6516b(String str, Object... objArr) {
        Log.e(this.f5454a, m6517c(str, objArr));
    }

    /* renamed from: c */
    protected String m6517c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f5455b.concat(str);
    }

    /* renamed from: d */
    public boolean m6518d(int i10) {
        return this.f5457d <= i10;
    }
}
