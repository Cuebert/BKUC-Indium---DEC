package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C1379b;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p070f3.C3132f;
import p110i3.BinderC3517b;
import p110i3.InterfaceC3516a;
import p124j3.C3597b;
import p124j3.C3599d;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h */
    private static Boolean f6437h = null;

    /* renamed from: i */
    private static String f6438i = null;

    /* renamed from: j */
    private static boolean f6439j = false;

    /* renamed from: k */
    private static int f6440k = -1;

    /* renamed from: l */
    private static Boolean f6441l;

    /* renamed from: q */
    private static C1440m f6446q;

    /* renamed from: r */
    private static C1441n f6447r;

    /* renamed from: a */
    private final Context f6448a;

    /* renamed from: m */
    private static final ThreadLocal f6442m = new ThreadLocal();

    /* renamed from: n */
    private static final ThreadLocal f6443n = new C1429b();

    /* renamed from: o */
    private static final InterfaceC1427b.a f6444o = new C1430c();

    /* renamed from: b */
    public static final InterfaceC1427b f6431b = new C1431d();

    /* renamed from: c */
    public static final InterfaceC1427b f6432c = new C1432e();

    /* renamed from: d */
    public static final InterfaceC1427b f6433d = new C1433f();

    /* renamed from: e */
    public static final InterfaceC1427b f6434e = new C1434g();

    /* renamed from: f */
    public static final InterfaceC1427b f6435f = new C1435h();

    /* renamed from: g */
    public static final InterfaceC1427b f6436g = new C1436i();

    /* renamed from: p */
    public static final InterfaceC1427b f6445p = new C1437j();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* loaded from: classes.dex */
    public static class C1426a extends Exception {
        /* synthetic */ C1426a(String str, C3599d c3599d) {
            super(str);
        }

        /* synthetic */ C1426a(String str, Throwable th, C3599d c3599d) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1427b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            int mo7767a(Context context, String str);

            /* renamed from: b */
            int mo7768b(Context context, String str, boolean z10) throws C1426a;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a */
            public int f6449a = 0;

            /* renamed from: b */
            public int f6450b = 0;

            /* renamed from: c */
            public int f6451c = 0;
        }

        /* renamed from: a */
        b mo7766a(Context context, String str, a aVar) throws C1426a;
    }

    private DynamiteModule(Context context) {
        C5984j.m21286j(context);
        this.f6448a = context;
    }

    /* renamed from: a */
    public static int m7754a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!C5980h.m21269b(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* renamed from: c */
    public static int m7755c(Context context, String str) {
        return m7757f(context, str, false);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: e */
    public static DynamiteModule m7756e(Context context, InterfaceC1427b interfaceC1427b, String str) throws C1426a {
        int i10;
        InterfaceC3516a m7771L0;
        DynamiteModule dynamiteModule;
        C1441n c1441n;
        Boolean valueOf;
        InterfaceC3516a m7777n;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f6442m;
            C1438k c1438k = (C1438k) threadLocal.get();
            C1438k c1438k2 = new C1438k(null);
            threadLocal.set(c1438k2);
            ThreadLocal threadLocal2 = f6443n;
            long longValue = ((Long) threadLocal2.get()).longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                InterfaceC1427b.b mo7766a = interfaceC1427b.mo7766a(context, str, f6444o);
                Log.i("DynamiteModule", "Considering local module " + str + ":" + mo7766a.f6449a + " and remote module " + str + ":" + mo7766a.f6450b);
                int i11 = mo7766a.f6451c;
                if (i11 != 0) {
                    if (i11 == -1) {
                        if (mo7766a.f6449a != 0) {
                            i11 = -1;
                        }
                    }
                    if (i11 != 1 || mo7766a.f6450b != 0) {
                        if (i11 == -1) {
                            DynamiteModule m7759h = m7759h(applicationContext, str);
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(longValue));
                            }
                            Cursor cursor = c1438k2.f6452a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(c1438k);
                            return m7759h;
                        }
                        if (i11 == 1) {
                            try {
                                try {
                                    int i12 = mo7766a.f6450b;
                                    try {
                                        try {
                                            try {
                                                synchronized (DynamiteModule.class) {
                                                    try {
                                                        if (m7762k(context)) {
                                                            Boolean bool = f6437h;
                                                            if (bool != null) {
                                                                if (bool.booleanValue()) {
                                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i12);
                                                                    synchronized (DynamiteModule.class) {
                                                                        try {
                                                                            c1441n = f6447r;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            while (true) {
                                                                                try {
                                                                                    break;
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                }
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    if (c1441n != null) {
                                                                        C1438k c1438k3 = (C1438k) threadLocal.get();
                                                                        if (c1438k3 != null && c1438k3.f6452a != null) {
                                                                            Context applicationContext2 = context.getApplicationContext();
                                                                            Cursor cursor2 = c1438k3.f6452a;
                                                                            BinderC3517b.m15328J0(null);
                                                                            synchronized (DynamiteModule.class) {
                                                                                valueOf = Boolean.valueOf(f6440k >= 2);
                                                                            }
                                                                            if (valueOf.booleanValue()) {
                                                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                                                m7777n = c1441n.m7776J0(BinderC3517b.m15328J0(applicationContext2), str, i12, BinderC3517b.m15328J0(cursor2));
                                                                            } else {
                                                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                                                m7777n = c1441n.m7777n(BinderC3517b.m15328J0(applicationContext2), str, i12, BinderC3517b.m15328J0(cursor2));
                                                                            }
                                                                            Context context2 = (Context) BinderC3517b.m15329n(m7777n);
                                                                            if (context2 != null) {
                                                                                dynamiteModule = new DynamiteModule(context2);
                                                                            } else {
                                                                                throw new C1426a("Failed to get module context", null);
                                                                            }
                                                                        } else {
                                                                            throw new C1426a("No result cursor", null);
                                                                        }
                                                                    } else {
                                                                        throw new C1426a("DynamiteLoaderV2 was not cached.", null);
                                                                    }
                                                                } else {
                                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i12);
                                                                    C1440m m7763l = m7763l(context);
                                                                    if (m7763l != null) {
                                                                        int m7775n = m7763l.m7775n();
                                                                        if (m7775n >= 3) {
                                                                            C1438k c1438k4 = (C1438k) threadLocal.get();
                                                                            if (c1438k4 != null) {
                                                                                m7771L0 = m7763l.m7772M0(BinderC3517b.m15328J0(context), str, i12, BinderC3517b.m15328J0(c1438k4.f6452a));
                                                                            } else {
                                                                                throw new C1426a("No cached result cursor holder", null);
                                                                            }
                                                                        } else if (m7775n == 2) {
                                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                                            m7771L0 = m7763l.m7773N0(BinderC3517b.m15328J0(context), str, i12);
                                                                        } else {
                                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                                            m7771L0 = m7763l.m7771L0(BinderC3517b.m15328J0(context), str, i12);
                                                                        }
                                                                        Object m15329n = BinderC3517b.m15329n(m7771L0);
                                                                        if (m15329n != null) {
                                                                            dynamiteModule = new DynamiteModule((Context) m15329n);
                                                                        } else {
                                                                            throw new C1426a("Failed to load remote module.", null);
                                                                        }
                                                                    } else {
                                                                        throw new C1426a("Failed to create IDynamiteLoader.", null);
                                                                    }
                                                                }
                                                                if (longValue == 0) {
                                                                    threadLocal2.remove();
                                                                } else {
                                                                    threadLocal2.set(Long.valueOf(longValue));
                                                                }
                                                                Cursor cursor3 = c1438k2.f6452a;
                                                                if (cursor3 != null) {
                                                                    cursor3.close();
                                                                }
                                                                threadLocal.set(c1438k);
                                                                return dynamiteModule;
                                                            }
                                                            throw new C1426a("Failed to determine which loading route to use.", null);
                                                        }
                                                        throw new C1426a("Remote loading disabled", null);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        throw th;
                                                    }
                                                }
                                            } catch (RemoteException e10) {
                                                e = e10;
                                                throw new C1426a("Failed to load remote module.", e, null);
                                            } catch (C1426a e11) {
                                                throw e11;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                C3132f.m13785a(context, th);
                                                throw new C1426a("Failed to load remote module.", th, null);
                                            }
                                        } catch (RemoteException e12) {
                                            e = e12;
                                            throw new C1426a("Failed to load remote module.", e, null);
                                        } catch (C1426a e13) {
                                            throw e13;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            C3132f.m13785a(context, th);
                                            throw new C1426a("Failed to load remote module.", th, null);
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (C1426a e14) {
                                    e = e14;
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                                    i10 = mo7766a.f6449a;
                                    if (i10 == 0) {
                                    }
                                    throw new C1426a("Remote load failed. No local fallback found.", e, null);
                                }
                            } catch (C1426a e15) {
                                e = e15;
                                Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                                i10 = mo7766a.f6449a;
                                if (i10 == 0 && interfaceC1427b.mo7766a(context, str, new C1439l(i10, 0)).f6451c == -1) {
                                    return m7759h(applicationContext, str);
                                }
                                throw new C1426a("Remote load failed. No local fallback found.", e, null);
                            }
                        } else {
                            throw new C1426a("VersionPolicy returned invalid code:" + i11, null);
                        }
                    }
                }
                throw new C1426a("No acceptable module " + str + " found. Local version is " + mo7766a.f6449a + " and remote version is " + mo7766a.f6450b + ".", null);
            } finally {
                if (longValue == 0) {
                    f6443n.remove();
                } else {
                    f6443n.set(Long.valueOf(longValue));
                }
                Cursor cursor4 = c1438k2.f6452a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                f6442m.set(c1438k);
            }
        }
        throw new C1426a("null application Context", null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01b1 -> B:24:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01b3 -> B:24:0x01b6). Please report as a decompilation issue!!! */
    /* renamed from: f */
    public static int m7757f(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th;
        RemoteException e10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f6437h;
                int i10 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                m7760i(classLoader);
                            } catch (C1426a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!m7762k(context)) {
                                return 0;
                            }
                            if (!f6439j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int m7758g = m7758g(context, str, z10, true);
                                        String str2 = f6438i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader m15416a = C3597b.m15416a();
                                            if (m15416a == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = f6438i;
                                                    C5984j.m21286j(str3);
                                                    m15416a = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f6438i;
                                                    C5984j.m21286j(str4);
                                                    m15416a = new C1428a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            m7760i(m15416a);
                                            declaredField.set(null, m15416a);
                                            f6437h = bool2;
                                            return m7758g;
                                        }
                                        return m7758g;
                                    } catch (C1426a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f6437h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m7758g(context, str, z10, false);
                    } catch (C1426a e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                C1440m m7763l = m7763l(context);
                try {
                    if (m7763l != null) {
                        try {
                            int m7775n = m7763l.m7775n();
                            if (m7775n >= 3) {
                                C1438k c1438k = (C1438k) f6442m.get();
                                if (c1438k != null && (cursor = c1438k.f6452a) != null) {
                                    i10 = cursor.getInt(0);
                                } else {
                                    Cursor cursor2 = (Cursor) BinderC3517b.m15329n(m7763l.m7774O0(BinderC3517b.m15328J0(context), str, z10, ((Long) f6443n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i11 = cursor2.getInt(0);
                                                r2 = (i11 <= 0 || !m7761j(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i10 = i11;
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i10;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            } else if (m7775n == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = m7763l.m7770K0(BinderC3517b.m15328J0(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = m7763l.m7769J0(BinderC3517b.m15328J0(context), str, z10);
                            }
                        } catch (RemoteException e14) {
                            e10 = e14;
                        }
                    }
                    return i10;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            C3132f.m13785a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m7758g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.C1426a {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m7758g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: h */
    private static DynamiteModule m7759h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    /* renamed from: i */
    private static void m7760i(ClassLoader classLoader) throws C1426a {
        C1441n c1441n;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c1441n = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C1441n) {
                    c1441n = (C1441n) queryLocalInterface;
                } else {
                    c1441n = new C1441n(iBinder);
                }
            }
            f6447r = c1441n;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new C1426a("Failed to instantiate dynamite loader", e10, null);
        }
    }

    /* renamed from: j */
    private static boolean m7761j(Cursor cursor) {
        C1438k c1438k = (C1438k) f6442m.get();
        if (c1438k == null || c1438k.f6452a != null) {
            return false;
        }
        c1438k.f6452a = cursor;
        return true;
    }

    /* renamed from: k */
    private static boolean m7762k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f6441l)) {
            return true;
        }
        boolean z10 = false;
        if (f6441l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C1379b.m7589f().mo7391h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f6441l = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f6439j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* renamed from: l */
    private static C1440m m7763l(Context context) {
        C1440m c1440m;
        synchronized (DynamiteModule.class) {
            C1440m c1440m2 = f6446q;
            if (c1440m2 != null) {
                return c1440m2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c1440m = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c1440m = queryLocalInterface instanceof C1440m ? (C1440m) queryLocalInterface : new C1440m(iBinder);
                }
                if (c1440m != null) {
                    f6446q = c1440m;
                    return c1440m;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: b */
    public Context m7764b() {
        return this.f6448a;
    }

    /* renamed from: d */
    public IBinder m7765d(String str) throws C1426a {
        try {
            return (IBinder) this.f6448a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new C1426a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
