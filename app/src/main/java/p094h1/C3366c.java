package p094h1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: h1.c */
/* loaded from: classes.dex */
final class C3366c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        long f14123a;

        /* renamed from: b */
        long f14124b;

        a() {
        }
    }

    /* renamed from: a */
    static long m14884a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j10 = aVar.f14124b;
        randomAccessFile.seek(aVar.f14123a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j10 -= read;
            if (j10 == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    static a m14885b(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        if (length >= 0) {
            long j10 = length - 65536;
            long j11 = j10 >= 0 ? j10 : 0L;
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    a aVar = new a();
                    aVar.f14124b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    aVar.f14123a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j11);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static long m14886c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m14884a(randomAccessFile, m14885b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
