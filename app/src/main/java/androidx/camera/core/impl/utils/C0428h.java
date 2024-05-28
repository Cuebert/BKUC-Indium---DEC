package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.C0427g;
import androidx.core.util.C0654h;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.utils.h */
/* loaded from: classes.dex */
public final class C0428h extends FilterOutputStream {

    /* renamed from: t */
    private static final byte[] f1969t = "Exif\u0000\u0000".getBytes(C0426f.f1935e);

    /* renamed from: n */
    private final C0427g f1970n;

    /* renamed from: o */
    private final byte[] f1971o;

    /* renamed from: p */
    private final ByteBuffer f1972p;

    /* renamed from: q */
    private int f1973q;

    /* renamed from: r */
    private int f1974r;

    /* renamed from: s */
    private int f1975s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.impl.utils.h$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static boolean m2115a(short s10) {
            return (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) ? false : true;
        }
    }

    public C0428h(OutputStream outputStream, C0427g c0427g) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f1971o = new byte[1];
        this.f1972p = ByteBuffer.allocate(4);
        this.f1973q = 0;
        this.f1970n = c0427g;
    }

    /* renamed from: b */
    private int m2113b(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(i12, i10 - this.f1972p.position());
        this.f1972p.put(bArr, i11, min);
        return min;
    }

    /* renamed from: c */
    private void m2114c(C0421a c0421a) throws IOException {
        C0429i[][] c0429iArr = C0427g.f1949i;
        int[] iArr = new int[c0429iArr.length];
        int[] iArr2 = new int[c0429iArr.length];
        for (C0429i c0429i : C0427g.f1947g) {
            for (int i10 = 0; i10 < C0427g.f1949i.length; i10++) {
                this.f1970n.m2094b(i10).remove(c0429i.f1977b);
            }
        }
        if (!this.f1970n.m2094b(1).isEmpty()) {
            this.f1970n.m2094b(0).put(C0427g.f1947g[1].f1977b, C0426f.m2088f(0L, this.f1970n.m2095c()));
        }
        if (!this.f1970n.m2094b(2).isEmpty()) {
            this.f1970n.m2094b(0).put(C0427g.f1947g[2].f1977b, C0426f.m2088f(0L, this.f1970n.m2095c()));
        }
        if (!this.f1970n.m2094b(3).isEmpty()) {
            this.f1970n.m2094b(1).put(C0427g.f1947g[3].f1977b, C0426f.m2088f(0L, this.f1970n.m2095c()));
        }
        for (int i11 = 0; i11 < C0427g.f1949i.length; i11++) {
            Iterator<Map.Entry<String, C0426f>> it = this.f1970n.m2094b(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int m2092j = it.next().getValue().m2092j();
                if (m2092j > 4) {
                    i12 += m2092j;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < C0427g.f1949i.length; i14++) {
            if (!this.f1970n.m2094b(i14).isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f1970n.m2094b(i14).size() * 12) + 2 + 4 + iArr2[i14];
            }
        }
        int i15 = i13 + 8;
        if (!this.f1970n.m2094b(1).isEmpty()) {
            this.f1970n.m2094b(0).put(C0427g.f1947g[1].f1977b, C0426f.m2088f(iArr[1], this.f1970n.m2095c()));
        }
        if (!this.f1970n.m2094b(2).isEmpty()) {
            this.f1970n.m2094b(0).put(C0427g.f1947g[2].f1977b, C0426f.m2088f(iArr[2], this.f1970n.m2095c()));
        }
        if (!this.f1970n.m2094b(3).isEmpty()) {
            this.f1970n.m2094b(1).put(C0427g.f1947g[3].f1977b, C0426f.m2088f(iArr[3], this.f1970n.m2095c()));
        }
        c0421a.m2051z(i15);
        c0421a.write(f1969t);
        c0421a.m2049i(this.f1970n.m2095c() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        c0421a.m2046b(this.f1970n.m2095c());
        c0421a.m2051z(42);
        c0421a.m2050l(8L);
        for (int i16 = 0; i16 < C0427g.f1949i.length; i16++) {
            if (!this.f1970n.m2094b(i16).isEmpty()) {
                c0421a.m2051z(this.f1970n.m2094b(i16).size());
                int size = iArr[i16] + 2 + (this.f1970n.m2094b(i16).size() * 12) + 4;
                for (Map.Entry<String, C0426f> entry : this.f1970n.m2094b(i16).entrySet()) {
                    int i17 = ((C0429i) C0654h.m3468g(C0427g.b.f1958f.get(i16).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f1976a;
                    C0426f value = entry.getValue();
                    int m2092j2 = value.m2092j();
                    c0421a.m2051z(i17);
                    c0421a.m2051z(value.f1939a);
                    c0421a.m2048e(value.f1940b);
                    if (m2092j2 > 4) {
                        c0421a.m2050l(size);
                        size += m2092j2;
                    } else {
                        c0421a.write(value.f1942d);
                        if (m2092j2 < 4) {
                            while (m2092j2 < 4) {
                                c0421a.m2047c(0);
                                m2092j2++;
                            }
                        }
                    }
                }
                c0421a.m2050l(0L);
                Iterator<Map.Entry<String, C0426f>> it2 = this.f1970n.m2094b(i16).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f1942d;
                    if (bArr.length > 4) {
                        c0421a.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        c0421a.m2046b(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0106, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0108, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.C0428h.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f1971o;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
