package p259u3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: u3.i */
/* loaded from: classes.dex */
public final class C4849i {

    /* renamed from: a */
    private static final OutputStream f18714a = new C4848h();

    /* renamed from: a */
    public static InputStream m19035a(InputStream inputStream, long j10) {
        return new C4851k(inputStream, 1048577L);
    }

    /* renamed from: b */
    public static byte[] m19036b(InputStream inputStream) throws IOException {
        C4847g.m19034a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i10 = 8192;
        int i11 = 0;
        while (i11 < 2147483639) {
            int min = Math.min(i10, 2147483639 - i11);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < min) {
                int read = inputStream.read(bArr, i12, min - i12);
                if (read == -1) {
                    return m19037c(arrayDeque, i11);
                }
                i12 += read;
                i11 += read;
            }
            i10 = C4853m.m19042a(i10, 2);
        }
        if (inputStream.read() == -1) {
            return m19037c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: c */
    private static byte[] m19037c(Deque<byte[]> deque, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = i10;
        while (i11 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i11, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i10 - i11, min);
            i11 -= min;
        }
        return bArr;
    }
}
