package p070f3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.C0587a;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p096h3.C3393c;
import p321z2.C5984j;

/* renamed from: f3.o */
/* loaded from: classes.dex */
public class C3141o {

    /* renamed from: a */
    private static final int f13152a = Process.myUid();

    /* renamed from: b */
    private static final Method f13153b;

    /* renamed from: c */
    private static final Method f13154c;

    /* renamed from: d */
    private static final Method f13155d;

    /* renamed from: e */
    private static final Method f13156e;

    /* renamed from: f */
    private static final Method f13157f;

    /* renamed from: g */
    private static final Method f13158g;

    /* renamed from: h */
    private static final Method f13159h;

    /* renamed from: i */
    private static final Method f13160i;

    /* renamed from: j */
    private static Boolean f13161j;

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|3)|4|(22:54|55|7|8|9|10|11|12|13|(13:46|47|16|(10:41|42|19|(7:36|37|22|(6:28|29|30|31|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0053, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0041, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            int r2 = android.os.Process.myUid()
            p070f3.C3141o.f13152a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1a
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L1a
            r6[r3] = r7     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Method r5 = r5.getMethod(r1, r6)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r5 = r4
        L1b:
            p070f3.C3141o.f13153b = r5
            boolean r5 = p070f3.C3137k.m13799c()
            r6 = 2
            if (r5 == 0) goto L33
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L33
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L33
            r7[r3] = r8     // Catch: java.lang.Exception -> L33
            r7[r2] = r0     // Catch: java.lang.Exception -> L33
            java.lang.reflect.Method r1 = r5.getMethod(r1, r7)     // Catch: java.lang.Exception -> L33
            goto L34
        L33:
            r1 = r4
        L34:
            p070f3.C3141o.f13154c = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L41
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L41
            goto L42
        L41:
            r1 = r4
        L42:
            p070f3.C3141o.f13155d = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L53
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L53
            r7[r3] = r8     // Catch: java.lang.Exception -> L53
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L53
            goto L54
        L53:
            r1 = r4
        L54:
            p070f3.C3141o.f13156e = r1
            boolean r1 = p070f3.C3137k.m13799c()
            if (r1 == 0) goto L6b
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "getName"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L6b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L6b
            r7[r3] = r8     // Catch: java.lang.Exception -> L6b
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L6b
            goto L6c
        L6b:
            r1 = r4
        L6c:
            p070f3.C3141o.f13157f = r1
            boolean r1 = p070f3.C3137k.m13805i()
            java.lang.String r5 = "WorkSourceUtil"
            if (r1 == 0) goto L87
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r7 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L81
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch: java.lang.Exception -> L81
            goto L88
        L81:
            r1 = move-exception
            java.lang.String r7 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r7, r1)
        L87:
            r1 = r4
        L88:
            p070f3.C3141o.f13158g = r1
            boolean r1 = p070f3.C3137k.m13805i()
            if (r1 == 0) goto Lab
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> La5
            java.lang.String r7 = "addNode"
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> La5
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> La5
            r6[r3] = r8     // Catch: java.lang.Exception -> La5
            r6[r2] = r0     // Catch: java.lang.Exception -> La5
            java.lang.reflect.Method r0 = r1.getMethod(r7, r6)     // Catch: java.lang.Exception -> La5
            goto Lac
        La5:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r5, r1, r0)
        Lab:
            r0 = r4
        Lac:
            p070f3.C3141o.f13159h = r0
            boolean r0 = p070f3.C3137k.m13805i()
            if (r0 == 0) goto Lc2
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lc2
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> Lc2
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> Lc3
            goto Lc3
        Lc2:
            r0 = r4
        Lc3:
            p070f3.C3141o.f13160i = r0
            p070f3.C3141o.f13161j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p070f3.C3141o.<clinit>():void");
    }

    /* renamed from: a */
    public static void m13813a(WorkSource workSource, int i10, String str) {
        Method method = f13154c;
        if (method != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f13153b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m13814b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo m14947b = C3393c.m14952a(context).m14947b(str, 0);
                if (m14947b == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = m14947b.uid;
                WorkSource workSource = new WorkSource();
                m13813a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m13815c(WorkSource workSource, int i10) {
        Method method = f13157f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i10));
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return null;
        }
    }

    /* renamed from: d */
    public static List<String> m13816d(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int m13818f = workSource == null ? 0 : m13818f(workSource);
        if (m13818f != 0) {
            for (int i10 = 0; i10 < m13818f; i10++) {
                String m13815c = m13815c(workSource, i10);
                if (!C3139m.m13810a(m13815c)) {
                    C5984j.m21286j(m13815c);
                    arrayList.add(m13815c);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static synchronized boolean m13817e(Context context) {
        synchronized (C3141o.class) {
            Boolean bool = f13161j;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(C0587a.m3027a(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
            f13161j = valueOf;
            return valueOf.booleanValue();
        }
    }

    /* renamed from: f */
    public static int m13818f(WorkSource workSource) {
        Method method = f13155d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C5984j.m21286j(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }
}
