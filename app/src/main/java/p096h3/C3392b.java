package p096h3;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p070f3.C3137k;

/* renamed from: h3.b */
/* loaded from: classes.dex */
public class C3392b {

    /* renamed from: a */
    protected final Context f14200a;

    public C3392b(Context context) {
        this.f14200a = context;
    }

    /* renamed from: a */
    public int m14946a(String str) {
        return this.f14200a.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: b */
    public ApplicationInfo m14947b(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f14200a.getPackageManager().getApplicationInfo(str, i10);
    }

    /* renamed from: c */
    public CharSequence m14948c(String str) throws PackageManager.NameNotFoundException {
        return this.f14200a.getPackageManager().getApplicationLabel(this.f14200a.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: d */
    public PackageInfo m14949d(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f14200a.getPackageManager().getPackageInfo(str, i10);
    }

    /* renamed from: e */
    public boolean m14950e() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C3391a.m14945a(this.f14200a);
        }
        if (!C3137k.m13804h() || (nameForUid = this.f14200a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f14200a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: f */
    public final boolean m14951f(int i10, String str) {
        if (C3137k.m13800d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f14200a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f14200a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
