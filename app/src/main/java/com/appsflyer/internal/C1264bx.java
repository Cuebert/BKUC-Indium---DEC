package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.bx */
/* loaded from: classes.dex */
public final class C1264bx extends FilterInputStream {
    private final int AFInAppEventParameterName;
    private short AFInAppEventType;
    private long[] AFKeystoreWrapper;
    private int AppsFlyer2dXConversionCallback;
    private int getLevel;
    private int init;
    private byte[] valueOf;
    private long[] values;

    public C1264bx(InputStream inputStream, int i10, int i11, short s10, int i12, int i13) throws IOException {
        super(inputStream);
        this.AppsFlyer2dXConversionCallback = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s10, 4), 8);
        this.AFInAppEventParameterName = min;
        this.valueOf = new byte[min];
        this.AFKeystoreWrapper = new long[4];
        this.values = new long[4];
        this.getLevel = min;
        this.init = min;
        this.AFKeystoreWrapper = C1269cb.values(i10 ^ i13, min ^ i13);
        this.values = C1269cb.values(i11 ^ i13, i12 ^ i13);
    }

    private void AFInAppEventParameterName() {
        long[] jArr = this.AFKeystoreWrapper;
        long[] jArr2 = this.values;
        short s10 = this.AFInAppEventType;
        int i10 = (s10 + 2) % 4;
        long j10 = ((jArr[s10 % 4] * 2147483085) + jArr2[i10]) % 2147483647L;
        int i11 = (s10 + 3) % 4;
        jArr2[i11] = ((jArr[i11] * 2147483085) + jArr2[i10]) / 2147483647L;
        jArr[i11] = j10;
        for (int i12 = 0; i12 < this.AFInAppEventParameterName; i12++) {
            this.valueOf[i12] = (byte) (r1[i12] ^ ((this.AFKeystoreWrapper[this.AFInAppEventType] >> (i12 << 3)) & 255));
        }
        this.AFInAppEventType = (short) ((this.AFInAppEventType + 1) % 4);
    }

    private int AFKeystoreWrapper() throws IOException {
        int i10;
        if (this.AppsFlyer2dXConversionCallback == Integer.MAX_VALUE) {
            this.AppsFlyer2dXConversionCallback = ((FilterInputStream) this).in.read();
        }
        if (this.getLevel == this.AFInAppEventParameterName) {
            byte[] bArr = this.valueOf;
            int i11 = this.AppsFlyer2dXConversionCallback;
            bArr[0] = (byte) i11;
            if (i11 >= 0) {
                int i12 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.valueOf, i12, this.AFInAppEventParameterName - i12);
                    if (read <= 0) {
                        break;
                    }
                    i12 += read;
                } while (i12 < this.AFInAppEventParameterName);
                if (i12 >= this.AFInAppEventParameterName) {
                    AFInAppEventParameterName();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.AppsFlyer2dXConversionCallback = read2;
                    this.getLevel = 0;
                    if (read2 < 0) {
                        int i13 = this.AFInAppEventParameterName;
                        i10 = i13 - (this.valueOf[i13 - 1] & 255);
                    } else {
                        i10 = this.AFInAppEventParameterName;
                    }
                    this.init = i10;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.init;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.init - this.getLevel;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i10 = this.getLevel;
        if (i10 >= this.init) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.getLevel = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFKeystoreWrapper();
            int i14 = this.getLevel;
            if (i14 >= this.init) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.valueOf;
            this.getLevel = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
