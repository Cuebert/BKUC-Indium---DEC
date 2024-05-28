package androidx.camera.core;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import backtraceio.library.breadcrumbs.BacktraceBreadcrumbs;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p279w.AbstractC5073r0;
import p279w.C5015c2;
import p279w.C5038i1;
import p279w.C5057n0;
import p279w.C5070q1;
import p279w.C5071q2;
import p279w.C5083u1;
import p279w.InterfaceC5026f1;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5063o2;
import p279w.InterfaceC5066p1;
import p279w.InterfaceC5067p2;
import p292x.C5493a;
import p318z.InterfaceC5941i;

/* renamed from: androidx.camera.core.d3 */
/* loaded from: classes.dex */
public final class C0398d3 extends AbstractC0496y2 {

    /* renamed from: J */
    public static final d f1774J = new d();

    /* renamed from: K */
    private static final int[] f1775K = {8, 6, 5, 4};

    /* renamed from: A */
    private volatile int f1776A;

    /* renamed from: B */
    private volatile boolean f1777B;

    /* renamed from: C */
    private int f1778C;

    /* renamed from: D */
    private int f1779D;

    /* renamed from: E */
    private int f1780E;

    /* renamed from: F */
    private AbstractC5073r0 f1781F;

    /* renamed from: G */
    private final AtomicBoolean f1782G;

    /* renamed from: H */
    private e f1783H;

    /* renamed from: I */
    private Throwable f1784I;

    /* renamed from: l */
    private final Object f1785l;

    /* renamed from: m */
    private final AtomicBoolean f1786m;

    /* renamed from: n */
    private final AtomicBoolean f1787n;

    /* renamed from: o */
    private HandlerThread f1788o;

    /* renamed from: p */
    private Handler f1789p;

    /* renamed from: q */
    private HandlerThread f1790q;

    /* renamed from: r */
    private Handler f1791r;

    /* renamed from: s */
    MediaCodec f1792s;

    /* renamed from: t */
    private MediaCodec f1793t;

    /* renamed from: u */
    private InterfaceFutureC2565m<Void> f1794u;

    /* renamed from: v */
    private C5015c2.b f1795v;

    /* renamed from: w */
    private int f1796w;

    /* renamed from: x */
    private int f1797x;

    /* renamed from: y */
    Surface f1798y;

    /* renamed from: z */
    private volatile AudioRecord f1799z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.d3$a */
    /* loaded from: classes.dex */
    public class a implements C5015c2.c {

        /* renamed from: a */
        final /* synthetic */ String f1800a;

        /* renamed from: b */
        final /* synthetic */ Size f1801b;

        a(String str, Size size) {
            this.f1800a = str;
            this.f1801b = size;
        }

        @Override // p279w.C5015c2.c
        /* renamed from: a */
        public void mo1878a(C5015c2 c5015c2, C5015c2.e eVar) {
            if (C0398d3.this.m2312p(this.f1800a)) {
                C0398d3.this.m1919X(this.f1800a, this.f1801b);
                C0398d3.this.m2316t();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.d3$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static int m1924a(MediaCodec.CodecException codecException) {
            return codecException.getErrorCode();
        }
    }

    /* renamed from: androidx.camera.core.d3$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC5063o2.a<C0398d3, C5071q2, c> {

        /* renamed from: a */
        private final C5070q1 f1803a;

        public c() {
            this(C5070q1.m19660L());
        }

        /* renamed from: c */
        static c m1925c(InterfaceC5061o0 interfaceC5061o0) {
            return new c(C5070q1.m19661M(interfaceC5061o0));
        }

        @Override // androidx.camera.core.InterfaceC0414h0
        /* renamed from: a */
        public InterfaceC5066p1 mo1926a() {
            return this.f1803a;
        }

        @Override // p279w.InterfaceC5063o2.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C5071q2 mo1927b() {
            return new C5071q2(C5083u1.m19702J(this.f1803a));
        }

        /* renamed from: e */
        public c m1929e(int i10) {
            mo1926a().mo19659g(C5071q2.f19298D, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: f */
        public c m1930f(int i10) {
            mo1926a().mo19659g(C5071q2.f19300F, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: g */
        public c m1931g(int i10) {
            mo1926a().mo19659g(C5071q2.f19301G, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: h */
        public c m1932h(int i10) {
            mo1926a().mo19659g(C5071q2.f19299E, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: i */
        public c m1933i(int i10) {
            mo1926a().mo19659g(C5071q2.f19296B, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: j */
        public c m1934j(int i10) {
            mo1926a().mo19659g(C5071q2.f19297C, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: k */
        public c m1935k(Size size) {
            mo1926a().mo19659g(InterfaceC5026f1.f19171l, size);
            return this;
        }

        /* renamed from: l */
        public c m1936l(int i10) {
            mo1926a().mo19659g(InterfaceC5063o2.f19282r, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: m */
        public c m1937m(int i10) {
            mo1926a().mo19659g(InterfaceC5026f1.f19166g, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: n */
        public c m1938n(Class<C0398d3> cls) {
            mo1926a().mo19659g(InterfaceC5941i.f21845w, cls);
            if (mo1926a().mo1365a(InterfaceC5941i.f21844v, null) == null) {
                m1939o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: o */
        public c m1939o(String str) {
            mo1926a().mo19659g(InterfaceC5941i.f21844v, str);
            return this;
        }

        /* renamed from: p */
        public c m1940p(int i10) {
            mo1926a().mo19659g(C5071q2.f19295A, Integer.valueOf(i10));
            return this;
        }

        private c(C5070q1 c5070q1) {
            this.f1803a = c5070q1;
            Class cls = (Class) c5070q1.mo1365a(InterfaceC5941i.f21845w, null);
            if (cls != null && !cls.equals(C0398d3.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m1938n(C0398d3.class);
        }
    }

    /* renamed from: androidx.camera.core.d3$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private static final Size f1804a;

        /* renamed from: b */
        private static final C5071q2 f1805b;

        static {
            Size size = new Size(1920, 1080);
            f1804a = size;
            f1805b = new c().m1940p(30).m1933i(8388608).m1934j(1).m1929e(BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES).m1932h(8000).m1930f(1).m1931g(1024).m1935k(size).m1936l(3).m1937m(1).mo1927b();
        }

        /* renamed from: a */
        public C5071q2 m1941a() {
            return f1805b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.d3$e */
    /* loaded from: classes.dex */
    public enum e {
        VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED,
        VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED,
        VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE,
        VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED
    }

    /* renamed from: N */
    private AudioRecord m1906N(C5071q2 c5071q2) {
        int i10 = this.f1778C == 1 ? 16 : 12;
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(this.f1779D, i10, 2);
            if (minBufferSize <= 0) {
                minBufferSize = c5071q2.m19665J();
            }
            int i11 = minBufferSize;
            AudioRecord audioRecord = new AudioRecord(5, this.f1779D, i10, 2, i11 * 2);
            if (audioRecord.getState() != 1) {
                return null;
            }
            this.f1776A = i11;
            C0463q1.m2206e("VideoCapture", "source: 5 audioSampleRate: " + this.f1779D + " channelConfig: " + i10 + " audioFormat: 2 bufferSize: " + i11);
            return audioRecord;
        } catch (Exception e10) {
            C0463q1.m2205d("VideoCapture", "Exception, keep trying.", e10);
            return null;
        }
    }

    /* renamed from: O */
    private MediaFormat m1907O() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.f1779D, this.f1778C);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", this.f1780E);
        return createAudioFormat;
    }

    /* renamed from: P */
    private static MediaFormat m1908P(C5071q2 c5071q2, Size size) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", c5071q2.m19667L());
        createVideoFormat.setInteger("frame-rate", c5071q2.m19669N());
        createVideoFormat.setInteger("i-frame-interval", c5071q2.m19668M());
        return createVideoFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static /* synthetic */ void m1910R(boolean z10, MediaCodec mediaCodec) {
        if (!z10 || mediaCodec == null) {
            return;
        }
        mediaCodec.release();
    }

    /* renamed from: T */
    private void m1912T() {
        this.f1790q.quitSafely();
        MediaCodec mediaCodec = this.f1793t;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f1793t = null;
        }
        if (this.f1799z != null) {
            this.f1799z.release();
            this.f1799z = null;
        }
    }

    /* renamed from: U */
    private void m1913U(final boolean z10) {
        AbstractC5073r0 abstractC5073r0 = this.f1781F;
        if (abstractC5073r0 == null) {
            return;
        }
        final MediaCodec mediaCodec = this.f1792s;
        abstractC5073r0.m19676c();
        this.f1781F.m19682i().mo2501b(new Runnable() { // from class: androidx.camera.core.c3
            @Override // java.lang.Runnable
            public final void run() {
                C0398d3.m1910R(z10, mediaCodec);
            }
        }, C5493a.m20222d());
        if (z10) {
            this.f1792s = null;
        }
        this.f1798y = null;
        this.f1781F = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void m1909Q() {
        this.f1788o.quitSafely();
        m1912T();
        if (this.f1798y != null) {
            m1913U(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r7.f1778C = r4.audioChannels;
        r7.f1779D = r4.audioSampleRate;
        r7.f1780E = r4.audioBitRate;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r0 = true;
     */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1915W(android.util.Size r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            int[] r1 = androidx.camera.core.C0398d3.f1775K     // Catch: java.lang.NumberFormatException -> L3d
            int r2 = r1.length     // Catch: java.lang.NumberFormatException -> L3d
            r3 = 0
        L5:
            if (r3 >= r2) goto L44
            r4 = r1[r3]     // Catch: java.lang.NumberFormatException -> L3d
            int r5 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L3d
            boolean r5 = android.media.CamcorderProfile.hasProfile(r5, r4)     // Catch: java.lang.NumberFormatException -> L3d
            if (r5 == 0) goto L3a
            int r5 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L3d
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r5, r4)     // Catch: java.lang.NumberFormatException -> L3d
            int r5 = r8.getWidth()     // Catch: java.lang.NumberFormatException -> L3d
            int r6 = r4.videoFrameWidth     // Catch: java.lang.NumberFormatException -> L3d
            if (r5 != r6) goto L3a
            int r5 = r8.getHeight()     // Catch: java.lang.NumberFormatException -> L3d
            int r6 = r4.videoFrameHeight     // Catch: java.lang.NumberFormatException -> L3d
            if (r5 != r6) goto L3a
            int r8 = r4.audioChannels     // Catch: java.lang.NumberFormatException -> L3d
            r7.f1778C = r8     // Catch: java.lang.NumberFormatException -> L3d
            int r8 = r4.audioSampleRate     // Catch: java.lang.NumberFormatException -> L3d
            r7.f1779D = r8     // Catch: java.lang.NumberFormatException -> L3d
            int r8 = r4.audioBitRate     // Catch: java.lang.NumberFormatException -> L3d
            r7.f1780E = r8     // Catch: java.lang.NumberFormatException -> L3d
            r8 = 1
            r0 = 1
            goto L44
        L3a:
            int r3 = r3 + 1
            goto L5
        L3d:
            java.lang.String r8 = "VideoCapture"
            java.lang.String r9 = "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings."
            androidx.camera.core.C0463q1.m2206e(r8, r9)
        L44:
            if (r0 != 0) goto L5e
            w.o2 r8 = r7.m2305g()
            w.q2 r8 = (p279w.C5071q2) r8
            int r9 = r8.m19664I()
            r7.f1778C = r9
            int r9 = r8.m19666K()
            r7.f1779D = r9
            int r8 = r8.m19663H()
            r7.f1780E = r8
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0398d3.m1915W(android.util.Size, java.lang.String):void");
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: A */
    public void mo1916A() {
        m1911S();
        InterfaceFutureC2565m<Void> interfaceFutureC2565m = this.f1794u;
        if (interfaceFutureC2565m != null) {
            interfaceFutureC2565m.mo2501b(new Runnable() { // from class: androidx.camera.core.b3
                @Override // java.lang.Runnable
                public final void run() {
                    C0398d3.this.m1909Q();
                }
            }, C5493a.m20222d());
        } else {
            m1909Q();
        }
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: D */
    public void mo1917D() {
        m1911S();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: E */
    protected Size mo1918E(Size size) {
        if (this.f1798y != null) {
            this.f1792s.stop();
            this.f1792s.release();
            this.f1793t.stop();
            this.f1793t.release();
            m1913U(false);
        }
        try {
            this.f1792s = MediaCodec.createEncoderByType("video/avc");
            this.f1793t = MediaCodec.createEncoderByType("audio/mp4a-latm");
            m1919X(m2304f(), size);
            m2314r();
            return size;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e10.getCause());
        }
    }

    /* renamed from: X */
    void m1919X(String str, Size size) {
        C5071q2 c5071q2 = (C5071q2) m2305g();
        this.f1792s.reset();
        this.f1783H = e.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
        try {
            this.f1792s.configure(m1908P(c5071q2, size), (Surface) null, (MediaCrypto) null, 1);
            if (this.f1798y != null) {
                m1913U(false);
            }
            final Surface createInputSurface = this.f1792s.createInputSurface();
            this.f1798y = createInputSurface;
            this.f1795v = C5015c2.b.m19501o(c5071q2);
            AbstractC5073r0 abstractC5073r0 = this.f1781F;
            if (abstractC5073r0 != null) {
                abstractC5073r0.m19676c();
            }
            C5038i1 c5038i1 = new C5038i1(this.f1798y, size, m2306i());
            this.f1781F = c5038i1;
            InterfaceFutureC2565m<Void> m19682i = c5038i1.m19682i();
            Objects.requireNonNull(createInputSurface);
            m19682i.mo2501b(new Runnable() { // from class: androidx.camera.core.z2
                @Override // java.lang.Runnable
                public final void run() {
                    createInputSurface.release();
                }
            }, C5493a.m20222d());
            this.f1795v.m19509h(this.f1781F);
            this.f1795v.m19507f(new a(str, size));
            m2298I(this.f1795v.m19514m());
            this.f1782G.set(true);
            m1915W(size, str);
            this.f1793t.reset();
            this.f1793t.configure(m1907O(), (Surface) null, (MediaCrypto) null, 1);
            if (this.f1799z != null) {
                this.f1799z.release();
            }
            this.f1799z = m1906N(c5071q2);
            if (this.f1799z == null) {
                C0463q1.m2204c("VideoCapture", "AudioRecord object cannot initialized correctly!");
                this.f1782G.set(false);
            }
            synchronized (this.f1785l) {
                this.f1796w = -1;
                this.f1797x = -1;
            }
            this.f1777B = false;
        } catch (MediaCodec.CodecException e10) {
            if (Build.VERSION.SDK_INT >= 23) {
                int m1924a = b.m1924a(e10);
                String diagnosticInfo = e10.getDiagnosticInfo();
                if (m1924a == 1100) {
                    C0463q1.m2206e("VideoCapture", "CodecException: code: " + m1924a + " diagnostic: " + diagnosticInfo);
                    this.f1783H = e.VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE;
                } else if (m1924a == 1101) {
                    C0463q1.m2206e("VideoCapture", "CodecException: code: " + m1924a + " diagnostic: " + diagnosticInfo);
                    this.f1783H = e.VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED;
                }
            } else {
                this.f1783H = e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            }
            this.f1784I = e10;
        } catch (IllegalArgumentException e11) {
            e = e11;
            this.f1783H = e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.f1784I = e;
        } catch (IllegalStateException e12) {
            e = e12;
            this.f1783H = e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.f1784I = e;
        }
    }

    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void m1911S() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C5493a.m20222d().execute(new Runnable() { // from class: androidx.camera.core.a3
                @Override // java.lang.Runnable
                public final void run() {
                    C0398d3.this.m1911S();
                }
            });
            return;
        }
        C0463q1.m2206e("VideoCapture", "stopRecording");
        this.f1795v.m19515n();
        this.f1795v.m19509h(this.f1781F);
        m2298I(this.f1795v.m19514m());
        m2318v();
        if (this.f1777B) {
            if (this.f1782G.get()) {
                this.f1787n.set(true);
            } else {
                this.f1786m.set(true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: h */
    public InterfaceC5063o2<?> mo1921h(boolean z10, InterfaceC5067p2 interfaceC5067p2) {
        InterfaceC5061o0 mo1381a = interfaceC5067p2.mo1381a(InterfaceC5067p2.b.VIDEO_CAPTURE, 1);
        if (z10) {
            mo1381a = C5057n0.m19631b(mo1381a, f1774J.m1941a());
        }
        if (mo1381a == null) {
            return null;
        }
        return mo1922n(mo1381a).mo1927b();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: n */
    public InterfaceC5063o2.a<?, ?, ?> mo1922n(InterfaceC5061o0 interfaceC5061o0) {
        return c.m1925c(interfaceC5061o0);
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: x */
    public void mo1923x() {
        this.f1788o = new HandlerThread("CameraX-video encoding thread");
        this.f1790q = new HandlerThread("CameraX-audio encoding thread");
        this.f1788o.start();
        this.f1789p = new Handler(this.f1788o.getLooper());
        this.f1790q.start();
        this.f1791r = new Handler(this.f1790q.getLooper());
    }
}
