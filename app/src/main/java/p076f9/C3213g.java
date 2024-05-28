package p076f9;

import android.content.Context;
import android.os.SystemClock;
import android.system.Os;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p035c9.C1151k;

/* renamed from: f9.g */
/* loaded from: classes.dex */
public class C3213g {

    /* renamed from: c */
    private static c f13511c = new a();

    /* renamed from: d */
    private static final Lock f13512d = new ReentrantLock();

    /* renamed from: e */
    private static String f13513e = null;

    /* renamed from: f */
    private static Thread f13514f;

    /* renamed from: a */
    private f f13515a = new e();

    /* renamed from: b */
    private Context f13516b;

    /* renamed from: f9.g$a */
    /* loaded from: classes.dex */
    class a implements c {
        a() {
        }

        @Override // p076f9.C3213g.c
        /* renamed from: a */
        public C3213g mo14288a() {
            C1151k.m6712f("rbx.xapkmanager", "default XAPKManager created");
            return new C3213g();
        }
    }

    /* renamed from: f9.g$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Context f13517n;

        b(Context context) {
            this.f13517n = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1151k.m6712f("rbx.xapkmanager", "unpackAssetsAsync: RUN .....");
            C3213g.this.m14284r(this.f13517n);
            C1151k.m6712f("rbx.xapkmanager", "unpackAssetsAsync: ...... DONE");
            Thread unused = C3213g.f13514f = null;
        }
    }

    /* renamed from: f9.g$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        C3213g mo14288a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f9.g$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public String f13519a;

        /* renamed from: b */
        public String f13520b;

        public d(String str, String str2) {
            this.f13519a = str;
            this.f13520b = str2;
        }

        /* renamed from: a */
        public boolean m14289a() {
            return TextUtils.equals(this.f13519a, this.f13520b);
        }
    }

    /* renamed from: f9.g$e */
    /* loaded from: classes.dex */
    public static class e implements f {
        @Override // p076f9.C3213g.f
        /* renamed from: a */
        public void mo14290a(boolean z10) {
        }

        @Override // p076f9.C3213g.f
        /* renamed from: b */
        public void mo14291b() {
        }
    }

    /* renamed from: f9.g$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo14290a(boolean z10);

        /* renamed from: b */
        void mo14291b();
    }

    /* renamed from: f9.g$g */
    /* loaded from: classes.dex */
    private static class g {

        /* renamed from: a */
        public static final C3213g f13521a = C3213g.f13511c.mo14288a();
    }

    /* renamed from: d */
    private void m14265d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                C1151k.m6709c("rbx.xapkmanager", "Ignore Exception: " + e10.getMessage());
            }
        }
    }

    /* renamed from: f */
    public static String m14266f(Context context) {
        return m14268h(context) + "/android";
    }

    /* renamed from: g */
    public static String m14267g() {
        return f13513e;
    }

    /* renamed from: h */
    private static String m14268h(Context context) {
        return context.getDir("assets", 0).getPath();
    }

    /* renamed from: i */
    public static C3213g m14269i() {
        return g.f13521a;
    }

    /* renamed from: j */
    public static boolean m14270j() {
        String str = f13513e;
        return str != null && str.length() > 0;
    }

    /* renamed from: m */
    private String m14271m(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        File file = new File(str, "fingerprint.txt");
        C1151k.m6707a("rbx.xapkmanager", "readAssetsFingerprint: pathname = " + file.getPath());
        String str2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    str2 = bufferedReader.readLine();
                } catch (FileNotFoundException unused) {
                    C1151k.m6707a("rbx.xapkmanager", "Assets fingerprint file not yet created. Expected for 1st time.");
                    m14265d(bufferedReader);
                    return str2;
                } catch (IOException e10) {
                    e = e10;
                    C1151k.m6709c("rbx.xapkmanager", "Exception: " + e.getMessage());
                    m14265d(bufferedReader);
                    return str2;
                }
            } catch (FileNotFoundException unused2) {
                bufferedReader = null;
            } catch (IOException e11) {
                e = e11;
                bufferedReader = null;
            } catch (Throwable th2) {
                bufferedReader = null;
                th = th2;
                m14265d(bufferedReader);
                throw th;
            }
            m14265d(bufferedReader);
            return str2;
        } catch (Throwable th3) {
            th = th3;
            m14265d(bufferedReader);
            throw th;
        }
    }

    /* renamed from: n */
    private d m14272n(Context context) {
        String m14273o = m14273o(context);
        if (TextUtils.isEmpty(m14273o)) {
            return null;
        }
        return new d(m14273o, m14271m(m14268h(context)));
    }

    /* renamed from: o */
    private String m14273o(Context context) {
        BufferedReader bufferedReader;
        Throwable th;
        InputStream inputStream;
        String str = null;
        try {
            inputStream = context.getAssets().open("fingerprint.txt");
        } catch (IOException e10) {
            e = e10;
            inputStream = null;
            bufferedReader = null;
        } catch (Throwable th2) {
            bufferedReader = null;
            th = th2;
            inputStream = null;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        } catch (IOException e11) {
            e = e11;
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            m14265d(bufferedReader);
            m14265d(inputStream);
            throw th;
        }
        try {
            try {
                str = bufferedReader.readLine();
            } catch (Throwable th4) {
                th = th4;
                m14265d(bufferedReader);
                m14265d(inputStream);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            C1151k.m6709c("rbx.xapkmanager", "Exception: " + e.getMessage());
            m14265d(bufferedReader);
            m14265d(inputStream);
            return str;
        }
        m14265d(bufferedReader);
        m14265d(inputStream);
        return str;
    }

    /* renamed from: q */
    public static void m14274q(c cVar) {
        f13511c = cVar;
    }

    /* renamed from: t */
    private String m14275t(Context context) {
        String m14268h = m14268h(context);
        String str = m14268h + "/content";
        d m14272n = m14272n(context);
        if (m14272n == null) {
            C1151k.m6709c("rbx.xapkmanager", "unpackAssets_internal: Unable to read OBB fingerprint.");
            this.f13515a.mo14291b();
            return null;
        }
        C1151k.m6707a("rbx.xapkmanager", "unpackAssets_internal: Compare fingerprint: obb:" + m14272n.f13519a + " vs. assets:" + m14272n.f13520b);
        if (m14272n.m14289a()) {
            C1151k.m6712f("rbx.xapkmanager", "Assets are up to date");
            return str;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            m14276u(context, m14268h);
            this.f13515a.mo14290a(true);
        } catch (Exception e10) {
            C1151k.m6709c("rbx.xapkmanager", "unpackAssets_internal: Unzip exception = " + e10);
            this.f13515a.mo14290a(false);
        }
        C1151k.m6707a("rbx.xapkmanager", "unpackAssets_internal: unzipContainer took (ms) " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        m14278y(m14272n.f13519a, m14268h);
        C1151k.m6712f("rbx.xapkmanager", "unpackAssets_internal: SUCCESS. cached-asset-path = " + str);
        return str;
    }

    /* renamed from: u */
    private void m14276u(Context context, String str) throws Exception {
        C1151k.m6712f("rbx.xapkmanager", "unzipContainer: baseAssetPath = " + str);
        byte[] bArr = new byte[8192];
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(context.getAssets().open("main.1.com.roblox.client.obb")));
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    return;
                }
                File file = new File(str + "/" + nextEntry.getName());
                if (file.getCanonicalPath().startsWith(new File(str).getCanonicalPath())) {
                    if (nextEntry.isDirectory()) {
                        if (!file.isDirectory()) {
                            file.mkdirs();
                        }
                    } else {
                        File parentFile = file.getParentFile();
                        if (parentFile != null && !parentFile.isDirectory()) {
                            parentFile.mkdirs();
                        }
                        m14277v(nextEntry, zipInputStream, bArr, file);
                    }
                }
            } finally {
                zipInputStream.close();
            }
        }
    }

    /* renamed from: v */
    private void m14277v(ZipEntry zipEntry, ZipInputStream zipInputStream, byte[] bArr, File file) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, bArr.length);
        FileDescriptor fd = fileOutputStream.getFD();
        long size = zipEntry.getSize();
        if (fd != null && size >= 0) {
            Os.ftruncate(fd, size);
        }
        while (true) {
            try {
                int read = zipInputStream.read(bArr, 0, bArr.length);
                if (read == -1) {
                    break;
                } else {
                    bufferedOutputStream.write(bArr, 0, read);
                }
            } finally {
                bufferedOutputStream.flush();
                if (fd != null) {
                    Os.fsync(fd);
                }
                bufferedOutputStream.close();
            }
        }
        zipInputStream.closeEntry();
    }

    /* renamed from: y */
    private void m14278y(String str, String str2) {
        File file = new File(str2, "fingerprint.txt");
        C1151k.m6707a("rbx.xapkmanager", "Write fingerprint file: " + file.getPath());
        Closeable closeable = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(str.getBytes());
                    m14265d(fileOutputStream);
                } catch (Exception e10) {
                    e = e10;
                    closeable = fileOutputStream;
                    C1151k.m6709c("rbx.xapkmanager", "Exception " + e.getMessage());
                    m14265d(closeable);
                } catch (Throwable th) {
                    th = th;
                    closeable = fileOutputStream;
                    m14265d(closeable);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* renamed from: c */
    public boolean m14279c(Context context) {
        d m14272n = m14272n(context);
        if (m14272n == null || !m14272n.m14289a()) {
            return false;
        }
        C1151k.m6707a("rbx.xapkmanager", "assets already up to date");
        return true;
    }

    /* renamed from: e */
    protected void mo14280e(Context context, String str) {
    }

    /* renamed from: k */
    public boolean m14281k(Context context) {
        return new File(context.getFilesDir().getAbsolutePath() + "/exe/ssl/cacert.pem").exists();
    }

    /* renamed from: l */
    public boolean m14282l() {
        if (!TextUtils.isEmpty(f13513e)) {
            return true;
        }
        Thread thread = f13514f;
        if (thread != null) {
            C1151k.m6712f("rbx.xapkmanager", "joinOrUnpack() join existing worker");
            try {
                thread.join();
                return true;
            } catch (InterruptedException e10) {
                C1151k.m6712f("rbx.xapkmanager", "InterruptedException in waiting for thread to complete: " + e10.getMessage());
                return false;
            }
        }
        C1151k.m6712f("rbx.xapkmanager", "joinOrUnpack() unpack");
        return true ^ TextUtils.isEmpty(m14284r(this.f13516b));
    }

    /* renamed from: p */
    public void m14283p(Context context) {
        this.f13516b = context;
    }

    /* renamed from: r */
    public String m14284r(Context context) {
        Lock lock = f13512d;
        lock.lock();
        try {
            if (f13513e == null) {
                C1151k.m6712f("rbx.xapkmanager", "unpackAssets: Asset path not yet set.");
                String m14275t = m14275t(context);
                f13513e = m14275t;
                mo14280e(context, m14275t);
            }
            lock.unlock();
            C1151k.m6707a("rbx.xapkmanager", "unpackAssets: cached-asset-path = " + f13513e);
            return f13513e;
        } catch (Throwable th) {
            f13512d.unlock();
            throw th;
        }
    }

    /* renamed from: s */
    public void m14285s(Context context) {
        C1151k.m6712f("rbx.xapkmanager", "unpackAssetsAsync:");
        if (f13513e == null && f13514f == null) {
            Thread thread = new Thread(new b(context));
            f13514f = thread;
            thread.setName("AssetUnpack");
            f13514f.start();
        }
    }

    /* renamed from: w */
    public String m14286w(Context context, String str, String str2) throws IOException {
        InputStream open = context.getAssets().open(str);
        byte[] bArr = new byte[open.available()];
        open.read(bArr);
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        new FileOutputStream(file2).write(bArr);
        return file2.getAbsolutePath();
    }

    /* renamed from: x */
    public void m14287x(Context context) {
        try {
            boolean m14279c = m14279c(context);
            boolean m14281k = m14281k(context);
            if (m14279c && m14281k) {
                C1151k.m6707a("rbx.xapkmanager", "cacert.pem up to date");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Assets are ");
            String str = BuildConfig.FLAVOR;
            sb2.append(m14279c ? BuildConfig.FLAVOR : "not ");
            sb2.append("ready. cacert.pem is ");
            if (!m14281k) {
                str = "not ";
            }
            sb2.append(str);
            sb2.append("ready.");
            C1151k.m6707a("rbx.xapkmanager", sb2.toString());
            C1151k.m6707a("rbx.xapkmanager", "written: " + m14286w(context, "cacert.pem", context.getFilesDir().getAbsolutePath() + "/exe/ssl"));
        } catch (IOException unused) {
            C1151k.m6709c("rbx.xapkmanager", "Unable to write cacert.pem");
        }
    }
}
