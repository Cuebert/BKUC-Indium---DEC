package p205pb;

import ac.C0073c;
import ac.C0076f;
import ac.C0083m;
import ac.InterfaceC0075e;
import ac.InterfaceC0090t;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p193ob.AbstractC4179h0;
import p193ob.AbstractC4183j0;
import p193ob.C4200y;
import p193ob.C4201z;
import p266ub.C4911c;

/* renamed from: pb.e */
/* loaded from: classes.dex */
public final class C4286e {

    /* renamed from: a */
    public static final byte[] f17491a;

    /* renamed from: d */
    public static final AbstractC4183j0 f17494d;

    /* renamed from: e */
    public static final AbstractC4179h0 f17495e;

    /* renamed from: k */
    private static final Method f17501k;

    /* renamed from: l */
    private static final Pattern f17502l;

    /* renamed from: b */
    public static final String[] f17492b = new String[0];

    /* renamed from: c */
    public static final C4200y f17493c = C4200y.m17554g(new String[0]);

    /* renamed from: f */
    private static final C0083m f17496f = C0083m.m438k(C0076f.m385f("efbbbf"), C0076f.m385f("feff"), C0076f.m385f("fffe"), C0076f.m385f("0000ffff"), C0076f.m385f("ffff0000"));

    /* renamed from: g */
    private static final Charset f17497g = Charset.forName("UTF-32BE");

    /* renamed from: h */
    private static final Charset f17498h = Charset.forName("UTF-32LE");

    /* renamed from: i */
    public static final TimeZone f17499i = TimeZone.getTimeZone("GMT");

    /* renamed from: j */
    public static final Comparator<String> f17500j = C4284c.f17488n;

    static {
        byte[] bArr = new byte[0];
        f17491a = bArr;
        Method method = null;
        f17494d = AbstractC4183j0.m17458O(null, bArr);
        f17495e = AbstractC4179h0.m17412e(null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f17501k = method;
        f17502l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* renamed from: A */
    public static boolean m17724A(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: B */
    public static /* synthetic */ Thread m17725B(String str, boolean z10, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    /* renamed from: C */
    public static boolean m17726C(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    public static X509TrustManager m17727D() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS", e10);
        }
    }

    /* renamed from: E */
    public static boolean m17728E(C4201z c4201z, C4201z c4201z2) {
        return c4201z.m17593m().equals(c4201z2.m17593m()) && c4201z.m17598y() == c4201z2.m17598y() && c4201z.m17585D().equals(c4201z2.m17585D());
    }

    /* renamed from: F */
    public static boolean m17729F(InterfaceC0090t interfaceC0090t, int i10, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long mo409c = interfaceC0090t.mo316f().mo411e() ? interfaceC0090t.mo316f().mo409c() - nanoTime : Long.MAX_VALUE;
        interfaceC0090t.mo316f().mo410d(Math.min(mo409c, timeUnit.toNanos(i10)) + nanoTime);
        try {
            C0073c c0073c = new C0073c();
            while (interfaceC0090t.mo315V(c0073c, 8192L) != -1) {
                c0073c.m347Y();
            }
            if (mo409c == Long.MAX_VALUE) {
                interfaceC0090t.mo316f().mo407a();
            } else {
                interfaceC0090t.mo316f().mo410d(nanoTime + mo409c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (mo409c == Long.MAX_VALUE) {
                interfaceC0090t.mo316f().mo407a();
            } else {
                interfaceC0090t.mo316f().mo410d(nanoTime + mo409c);
            }
            return false;
        } catch (Throwable th) {
            if (mo409c == Long.MAX_VALUE) {
                interfaceC0090t.mo316f().mo407a();
            } else {
                interfaceC0090t.mo316f().mo410d(nanoTime + mo409c);
            }
            throw th;
        }
    }

    /* renamed from: G */
    public static int m17730G(String str, int i10, int i11) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: H */
    public static int m17731H(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char charAt = str.charAt(i12);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    /* renamed from: I */
    public static ThreadFactory m17732I(String str, boolean z10) {
        return new ThreadFactory() { // from class: pb.d

            /* renamed from: a */
            public final /* synthetic */ String f17489a;

            /* renamed from: b */
            public final /* synthetic */ boolean f17490b;

            public /* synthetic */ ThreadFactoryC4285d(String str2, boolean z102) {
                r1 = str2;
                r2 = z102;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m17725B;
                m17725B = C4286e.m17725B(r1, r2, runnable);
                return m17725B;
            }
        };
    }

    /* renamed from: J */
    public static List<C4911c> m17733J(C4200y c4200y) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c4200y.m17558h(); i10++) {
            arrayList.add(new C4911c(c4200y.m17556e(i10), c4200y.m17559i(i10)));
        }
        return arrayList;
    }

    /* renamed from: K */
    public static C4200y m17734K(List<C4911c> list) {
        C4200y.a aVar = new C4200y.a();
        for (C4911c c4911c : list) {
            AbstractC4282a.f17486a.mo17320b(aVar, c4911c.f18800a.mo404w(), c4911c.f18801b.mo404w());
        }
        return aVar.m17565e();
    }

    /* renamed from: L */
    public static String m17735L(String str, int i10, int i11) {
        int m17730G = m17730G(str, i10, i11);
        return str.substring(m17730G, m17731H(str, m17730G, i11));
    }

    /* renamed from: M */
    public static boolean m17736M(String str) {
        return f17502l.matcher(str).matches();
    }

    /* renamed from: b */
    public static void m17738b(Throwable th, Throwable th2) {
        Method method = f17501k;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: c */
    public static Charset m17739c(InterfaceC0075e interfaceC0075e, Charset charset) throws IOException {
        int mo336K = interfaceC0075e.mo336K(f17496f);
        if (mo336K == -1) {
            return charset;
        }
        if (mo336K == 0) {
            return StandardCharsets.UTF_8;
        }
        if (mo336K == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (mo336K == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (mo336K == 3) {
            return f17497g;
        }
        if (mo336K == 4) {
            return f17498h;
        }
        throw new AssertionError();
    }

    /* renamed from: d */
    public static String m17740d(String str) {
        InetAddress m17749m;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                m17749m = m17749m(str, 1, str.length() - 1);
            } else {
                m17749m = m17749m(str, 0, str.length());
            }
            if (m17749m == null) {
                return null;
            }
            byte[] address = m17749m.getAddress();
            if (address.length == 16) {
                return m17761y(address);
            }
            if (address.length == 4) {
                return m17749m.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (m17746j(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static int m17741e(String str, long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            Objects.requireNonNull(timeUnit, "unit == null");
            long millis = timeUnit.toMillis(j10);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j10 <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }
        throw new IllegalArgumentException(str + " < 0");
    }

    /* renamed from: f */
    public static void m17742f(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: g */
    public static void m17743g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static void m17744h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!m17724A(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    public static String[] m17745i(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* renamed from: j */
    private static boolean m17746j(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static int m17747k(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    /* renamed from: l */
    private static boolean m17748l(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress m17749m(java.lang.String r11, int r12, int r13) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        L9:
            r7 = 0
            if (r12 >= r13) goto L7a
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L27
            java.lang.String r9 = "::"
            r10 = 2
            boolean r9 = r11.regionMatches(r12, r9, r3, r10)
            if (r9 == 0) goto L27
            if (r5 == r2) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L25
            goto L7a
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L4a
            java.lang.String r8 = ":"
            r9 = 1
            boolean r8 = r11.regionMatches(r12, r8, r3, r9)
            if (r8 == 0) goto L35
            int r12 = r12 + 1
            goto L4a
        L35:
            java.lang.String r8 = "."
            boolean r12 = r11.regionMatches(r12, r8, r3, r9)
            if (r12 == 0) goto L49
            int r12 = r4 + (-2)
            boolean r11 = m17748l(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L46
            return r7
        L46:
            int r4 = r4 + 2
            goto L7a
        L49:
            return r7
        L4a:
            r6 = r12
        L4b:
            r12 = r6
            r8 = 0
        L4d:
            if (r12 >= r13) goto L60
            char r9 = r11.charAt(r12)
            int r9 = m17747k(r9)
            if (r9 != r2) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4d
        L60:
            int r9 = r12 - r6
            if (r9 == 0) goto L79
            r10 = 4
            if (r9 <= r10) goto L68
            goto L79
        L68:
            int r7 = r4 + 1
            int r9 = r8 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r7 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L79:
            return r7
        L7a:
            if (r4 == r0) goto L8b
            if (r5 != r2) goto L7f
            return r7
        L7f:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r3)
        L8b:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
            return r11
        L90:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p205pb.C4286e.m17749m(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: n */
    public static int m17750n(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: o */
    public static int m17751o(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: p */
    public static boolean m17752p(InterfaceC0090t interfaceC0090t, int i10, TimeUnit timeUnit) {
        try {
            return m17729F(interfaceC0090t, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static String m17753q(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: r */
    public static String m17754r(String str, String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    /* renamed from: s */
    public static String m17755s(C4201z c4201z, boolean z10) {
        String m17593m;
        if (c4201z.m17593m().contains(":")) {
            m17593m = "[" + c4201z.m17593m() + "]";
        } else {
            m17593m = c4201z.m17593m();
        }
        if (!z10 && c4201z.m17598y() == C4201z.m17574e(c4201z.m17585D())) {
            return m17593m;
        }
        return m17593m + ":" + c4201z.m17598y();
    }

    /* renamed from: t */
    public static <T> List<T> m17756t(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    /* renamed from: u */
    public static <T> List<T> m17757u(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: v */
    public static <K, V> Map<K, V> m17758v(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: w */
    public static int m17759w(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: x */
    public static int m17760x(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: y */
    private static String m17761y(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        C0073c c0073c = new C0073c();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                c0073c.mo330G(58);
                i10 += i13;
                if (i10 == 16) {
                    c0073c.mo330G(58);
                }
            } else {
                if (i10 > 0) {
                    c0073c.mo330G(58);
                }
                c0073c.mo363n(((bArr[i10] & 255) << 8) | (bArr[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return c0073c.m374t0();
    }

    /* renamed from: z */
    public static String[] m17762z(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
