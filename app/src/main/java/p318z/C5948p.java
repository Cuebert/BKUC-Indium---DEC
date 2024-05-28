package p318z;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0463q1;
import androidx.camera.core.InterfaceC0443l1;
import androidx.camera.core.impl.utils.C0427g;
import androidx.camera.core.impl.utils.C0428h;
import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import p001a0.C0001a;
import p040d0.C2958a;
import p279w.InterfaceC5030g1;
import p279w.InterfaceC5049l0;
import p305y.C5586f;

/* renamed from: z.p */
/* loaded from: classes.dex */
public class C5948p implements InterfaceC5049l0 {

    /* renamed from: k */
    private static final Rect f21849k = new Rect(0, 0, 0, 0);

    /* renamed from: a */
    private final int f21850a;

    /* renamed from: c */
    private int f21852c;

    /* renamed from: g */
    private ImageWriter f21856g;

    /* renamed from: i */
    C0541c.a<Void> f21858i;

    /* renamed from: j */
    private InterfaceFutureC2565m<Void> f21859j;

    /* renamed from: b */
    private final Object f21851b = new Object();

    /* renamed from: d */
    private int f21853d = 0;

    /* renamed from: e */
    private boolean f21854e = false;

    /* renamed from: f */
    private int f21855f = 0;

    /* renamed from: h */
    private Rect f21857h = f21849k;

    public C5948p(int i10, int i11) {
        this.f21852c = i10;
        this.f21850a = i11;
    }

    /* renamed from: f */
    private static C0427g m21144f(InterfaceC0443l1 interfaceC0443l1, int i10) {
        C0427g.b m2093a = C0427g.m2093a();
        interfaceC0443l1.mo1857q().mo2037b(m2093a);
        m2093a.m2108m(i10);
        return m2093a.m2105j(interfaceC0443l1.mo1853g()).m2104i(interfaceC0443l1.getHeight()).m2099a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Object m21145g(C0541c.a aVar) throws Exception {
        synchronized (this.f21851b) {
            this.f21858i = aVar;
        }
        return "YuvToJpegProcessor-close";
    }

    @Override // p279w.InterfaceC5049l0
    /* renamed from: a */
    public void mo2023a(InterfaceC5030g1 interfaceC5030g1) {
        ImageWriter imageWriter;
        boolean z10;
        Rect rect;
        int i10;
        int i11;
        InterfaceC0443l1 interfaceC0443l1;
        Image image;
        C0541c.a<Void> aVar;
        C0541c.a<Void> aVar2;
        C0541c.a<Void> aVar3;
        List<Integer> mo2165b = interfaceC5030g1.mo2165b();
        boolean z11 = false;
        C0654h.m3463b(mo2165b.size() == 1, "Processing image bundle have single capture id, but found " + mo2165b.size());
        InterfaceFutureC2565m<InterfaceC0443l1> mo2164a = interfaceC5030g1.mo2164a(mo2165b.get(0).intValue());
        C0654h.m3462a(mo2164a.isDone());
        synchronized (this.f21851b) {
            imageWriter = this.f21856g;
            z10 = !this.f21854e;
            rect = this.f21857h;
            if (z10) {
                this.f21855f++;
            }
            i10 = this.f21852c;
            i11 = this.f21853d;
        }
        try {
            try {
                interfaceC0443l1 = mo2164a.get();
                try {
                } catch (Exception e10) {
                    e = e10;
                    image = null;
                } catch (Throwable th) {
                    th = th;
                    image = null;
                }
            } catch (Exception e11) {
                e = e11;
                interfaceC0443l1 = null;
                image = null;
            } catch (Throwable th2) {
                th = th2;
                interfaceC0443l1 = null;
                image = null;
            }
            if (!z10) {
                C0463q1.m2212k("YuvToJpegProcessor", "Image enqueued for processing on closed processor.");
                interfaceC0443l1.close();
                synchronized (this.f21851b) {
                    if (z10) {
                        try {
                            int i12 = this.f21855f;
                            this.f21855f = i12 - 1;
                            if (i12 == 0 && this.f21854e) {
                                z11 = true;
                            }
                        } finally {
                        }
                    }
                    aVar3 = this.f21858i;
                }
                if (z11) {
                    imageWriter.close();
                    C0463q1.m2202a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                    if (aVar3 != null) {
                        aVar3.m2519c(null);
                        return;
                    }
                    return;
                }
                return;
            }
            image = imageWriter.dequeueInputImage();
            try {
                InterfaceC0443l1 interfaceC0443l12 = mo2164a.get();
                try {
                    C0654h.m3470i(interfaceC0443l12.mo1854h0() == 35, "Input image is not expected YUV_420_888 image format");
                    YuvImage yuvImage = new YuvImage(C2958a.m13385j(interfaceC0443l12), 17, interfaceC0443l12.mo1853g(), interfaceC0443l12.getHeight(), null);
                    ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                    int position = buffer.position();
                    yuvImage.compressToJpeg(rect, i10, new C0428h(new a(buffer), m21144f(interfaceC0443l12, i11)));
                    interfaceC0443l12.close();
                    try {
                        buffer.limit(buffer.position());
                        buffer.position(position);
                        imageWriter.queueInputImage(image);
                        synchronized (this.f21851b) {
                            if (z10) {
                                try {
                                    int i13 = this.f21855f;
                                    this.f21855f = i13 - 1;
                                    if (i13 == 0 && this.f21854e) {
                                        z11 = true;
                                    }
                                } finally {
                                }
                            }
                            aVar2 = this.f21858i;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        interfaceC0443l1 = null;
                        if (z10) {
                            C0463q1.m2205d("YuvToJpegProcessor", "Failed to process YUV -> JPEG", e);
                            image = imageWriter.dequeueInputImage();
                            ByteBuffer buffer2 = image.getPlanes()[0].getBuffer();
                            buffer2.rewind();
                            buffer2.limit(0);
                            imageWriter.queueInputImage(image);
                        }
                        synchronized (this.f21851b) {
                            if (z10) {
                                try {
                                    int i14 = this.f21855f;
                                    this.f21855f = i14 - 1;
                                    if (i14 == 0 && this.f21854e) {
                                        z11 = true;
                                    }
                                } finally {
                                }
                            }
                            aVar2 = this.f21858i;
                        }
                        if (image != null) {
                            image.close();
                        }
                        if (interfaceC0443l1 != null) {
                            interfaceC0443l1.close();
                        }
                        if (z11) {
                            imageWriter.close();
                            C0463q1.m2202a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                            if (aVar2 == null) {
                                return;
                            }
                            aVar2.m2519c(null);
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC0443l1 = null;
                        synchronized (this.f21851b) {
                            if (z10) {
                                try {
                                    int i15 = this.f21855f;
                                    this.f21855f = i15 - 1;
                                    if (i15 == 0 && this.f21854e) {
                                        z11 = true;
                                    }
                                } finally {
                                }
                            }
                            aVar = this.f21858i;
                        }
                        if (image != null) {
                            image.close();
                        }
                        if (interfaceC0443l1 != null) {
                            interfaceC0443l1.close();
                        }
                        if (z11) {
                            imageWriter.close();
                            C0463q1.m2202a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                            if (aVar != null) {
                                aVar.m2519c(null);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    interfaceC0443l1 = interfaceC0443l12;
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC0443l1 = interfaceC0443l12;
                }
            } catch (Exception e14) {
                e = e14;
            }
            if (z11) {
                imageWriter.close();
                C0463q1.m2202a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                if (aVar2 == null) {
                    return;
                }
                aVar2.m2519c(null);
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // p279w.InterfaceC5049l0
    /* renamed from: b */
    public void mo2024b(Size size) {
        synchronized (this.f21851b) {
            this.f21857h = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    @Override // p279w.InterfaceC5049l0
    /* renamed from: c */
    public void mo2025c(Surface surface, int i10) {
        C0654h.m3470i(i10 == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.f21851b) {
            if (!this.f21854e) {
                if (this.f21856g == null) {
                    this.f21856g = C0001a.m7d(surface, this.f21850a, i10);
                } else {
                    throw new IllegalStateException("Output surface already set.");
                }
            } else {
                C0463q1.m2212k("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
            }
        }
    }

    @Override // p279w.InterfaceC5049l0
    public void close() {
        C0541c.a<Void> aVar;
        synchronized (this.f21851b) {
            if (this.f21854e) {
                return;
            }
            this.f21854e = true;
            if (this.f21855f == 0 && this.f21856g != null) {
                C0463q1.m2202a("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                this.f21856g.close();
                aVar = this.f21858i;
            } else {
                C0463q1.m2202a("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                aVar = null;
            }
            if (aVar != null) {
                aVar.m2519c(null);
            }
        }
    }

    @Override // p279w.InterfaceC5049l0
    /* renamed from: d */
    public InterfaceFutureC2565m<Void> mo2026d() {
        InterfaceFutureC2565m<Void> m20510j;
        synchronized (this.f21851b) {
            if (this.f21854e && this.f21855f == 0) {
                m20510j = C5586f.m20508h(null);
            } else {
                if (this.f21859j == null) {
                    this.f21859j = C0541c.m2515a(new C0541c.c() { // from class: z.o
                        @Override // androidx.concurrent.futures.C0541c.c
                        /* renamed from: a */
                        public final Object mo1498a(C0541c.a aVar) {
                            Object m21145g;
                            m21145g = C5948p.this.m21145g(aVar);
                            return m21145g;
                        }
                    });
                }
                m20510j = C5586f.m20510j(this.f21859j);
            }
        }
        return m20510j;
    }

    /* renamed from: h */
    public void m21146h(int i10) {
        synchronized (this.f21851b) {
            this.f21852c = i10;
        }
    }

    /* renamed from: i */
    public void m21147i(int i10) {
        synchronized (this.f21851b) {
            this.f21853d = i10;
        }
    }

    /* renamed from: z.p$a */
    /* loaded from: classes.dex */
    private static final class a extends OutputStream {

        /* renamed from: n */
        private final ByteBuffer f21860n;

        a(ByteBuffer byteBuffer) {
            this.f21860n = byteBuffer;
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            if (this.f21860n.hasRemaining()) {
                this.f21860n.put((byte) i10);
                return;
            }
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            int i12;
            Objects.requireNonNull(bArr);
            if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i11 == 0) {
                return;
            }
            if (this.f21860n.remaining() >= i11) {
                this.f21860n.put(bArr, i10, i11);
                return;
            }
            throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
    }
}
