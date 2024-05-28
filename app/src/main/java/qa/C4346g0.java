package qa;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.g0 */
/* loaded from: classes.dex */
public final class C4346g0 {

    /* renamed from: a */
    static final StringBuilder f17672a = new StringBuilder();

    /* renamed from: qa.g0$a */
    /* loaded from: classes.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    @TargetApi(11)
    /* renamed from: qa.g0$b */
    /* loaded from: classes.dex */
    private static class b {
        /* renamed from: a */
        static int m17954a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    /* renamed from: qa.g0$c */
    /* loaded from: classes.dex */
    private static class c {
        /* renamed from: a */
        static int m17955a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* renamed from: qa.g0$d */
    /* loaded from: classes.dex */
    private static class d {
        /* renamed from: a */
        static InterfaceC4349j m17956a(Context context) {
            return new C4358s(context);
        }
    }

    /* renamed from: qa.g0$e */
    /* loaded from: classes.dex */
    private static class e extends Thread {
        public e(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: qa.g0$f */
    /* loaded from: classes.dex */
    static class f implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new e(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m17930a(File file) {
        long j10;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j10 = (statFs.getBlockCount() * statFs.getBlockSize()) / 50;
        } catch (IllegalArgumentException unused) {
            j10 = 5242880;
        }
        return Math.max(Math.min(j10, 52428800L), 5242880L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m17931b(Context context) {
        ActivityManager activityManager = (ActivityManager) m17945p(context, "activity");
        boolean z10 = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z10) {
            memoryClass = b.m17954a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m17932c() {
        if (!m17948s()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <T> T m17933d(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m17934e(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static File m17935f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static InterfaceC4349j m17936g(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return d.m17956a(context);
        } catch (ClassNotFoundException unused) {
            return new C4344f0(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static String m17937h(C4362w c4362w) {
        StringBuilder sb2 = f17672a;
        String m17938i = m17938i(c4362w, sb2);
        sb2.setLength(0);
        return m17938i;
    }

    /* renamed from: i */
    static String m17938i(C4362w c4362w, StringBuilder sb2) {
        String str = c4362w.f17791f;
        if (str != null) {
            sb2.ensureCapacity(str.length() + 50);
            sb2.append(c4362w.f17791f);
        } else {
            Uri uri = c4362w.f17789d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb2.ensureCapacity(uri2.length() + 50);
                sb2.append(uri2);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(c4362w.f17790e);
            }
        }
        sb2.append('\n');
        if (c4362w.f17798m != 0.0f) {
            sb2.append("rotation:");
            sb2.append(c4362w.f17798m);
            if (c4362w.f17801p) {
                sb2.append('@');
                sb2.append(c4362w.f17799n);
                sb2.append('x');
                sb2.append(c4362w.f17800o);
            }
            sb2.append('\n');
        }
        if (c4362w.m18030c()) {
            sb2.append("resize:");
            sb2.append(c4362w.f17793h);
            sb2.append('x');
            sb2.append(c4362w.f17794i);
            sb2.append('\n');
        }
        if (c4362w.f17795j) {
            sb2.append("centerCrop");
            sb2.append('\n');
        } else if (c4362w.f17796k) {
            sb2.append("centerInside");
            sb2.append('\n');
        }
        List<InterfaceC4342e0> list = c4362w.f17792g;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(c4362w.f17792g.get(i10).mo6705b());
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m17939j(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m17940k(Bitmap bitmap) {
        int m17955a = c.m17955a(bitmap);
        if (m17955a >= 0) {
            return m17955a;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static String m17941l(RunnableC4337c runnableC4337c) {
        return m17942m(runnableC4337c, BuildConfig.FLAVOR);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static String m17942m(RunnableC4337c runnableC4337c, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        AbstractC4333a m17904h = runnableC4337c.m17904h();
        if (m17904h != null) {
            sb2.append(m17904h.f17592b.m18031d());
        }
        List<AbstractC4333a> m17905i = runnableC4337c.m17905i();
        if (m17905i != null) {
            int size = m17905i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0 || m17904h != null) {
                    sb2.append(", ");
                }
                sb2.append(m17905i.get(i10).f17592b.m18031d());
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m17943n(Resources resources, C4362w c4362w) throws FileNotFoundException {
        Uri uri;
        int i10 = c4362w.f17790e;
        if (i10 != 0 || (uri = c4362w.f17789d) == null) {
            return i10;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = c4362w.f17789d.getPathSegments();
            if (pathSegments != null && !pathSegments.isEmpty()) {
                if (pathSegments.size() == 1) {
                    try {
                        return Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new FileNotFoundException("Last path segment is not a resource ID: " + c4362w.f17789d);
                    }
                }
                if (pathSegments.size() == 2) {
                    return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                }
                throw new FileNotFoundException("More than two path segments: " + c4362w.f17789d);
            }
            throw new FileNotFoundException("No path segments: " + c4362w.f17789d);
        }
        throw new FileNotFoundException("No package provided: " + c4362w.f17789d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static Resources m17944o(Context context, C4362w c4362w) throws FileNotFoundException {
        Uri uri;
        if (c4362w.f17790e == 0 && (uri = c4362w.f17789d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                try {
                    return context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new FileNotFoundException("Unable to obtain resources for package: " + c4362w.f17789d);
                }
            }
            throw new FileNotFoundException("No package provided: " + c4362w.f17789d);
        }
        return context.getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static <T> T m17945p(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static boolean m17946q(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m17947r(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: s */
    static boolean m17948s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static boolean m17949t(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m17950u(String str, String str2, String str3) {
        m17951v(str, str2, str3, BuildConfig.FLAVOR);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m17951v(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static boolean m17952w(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if ("CONDITIONAL_CACHE".equals(split[0])) {
                return Integer.parseInt(split[1]) == 304;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static byte[] m17953x(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
