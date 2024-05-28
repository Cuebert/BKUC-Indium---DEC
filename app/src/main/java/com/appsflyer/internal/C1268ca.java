package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.ca */
/* loaded from: classes.dex */
public final class C1268ca extends FilterInputStream {
    private static final short AFInAppEventParameterName = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFInAppEventType;
    private int AFKeystoreWrapper;
    private int AFLogger$LogLevel;
    private int AFVersionDeclaration;
    private int AppsFlyer2dXConversionCallback;
    private int getLevel;
    private int init;
    private int onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private int onDeepLinkingNative;
    private byte[] valueOf;
    private byte[] values;

    public C1268ca(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12) throws IOException {
        super(inputStream);
        this.AFVersionDeclaration = Integer.MAX_VALUE;
        this.valueOf = new byte[8];
        this.values = new byte[8];
        this.AFInAppEventType = new byte[8];
        this.AFKeystoreWrapper = 8;
        this.getLevel = 8;
        this.init = Math.min(Math.max(i11, 5), 16);
        this.AppsFlyer2dXConversionCallback = i12;
        if (i12 == 3) {
            System.arraycopy(bArr, 0, this.values, 0, 8);
        }
        long j10 = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i10 == 0) {
            this.AFLogger$LogLevel = (int) j10;
            long j11 = j10 >> 3;
            short s10 = AFInAppEventParameterName;
            this.onAppOpenAttributionNative = (int) ((s10 * j11) >> 32);
            this.onAttributionFailureNative = (int) (j10 >> 32);
            this.onDeepLinkingNative = (int) (j11 + s10);
            return;
        }
        int i13 = (int) j10;
        this.AFLogger$LogLevel = i13;
        this.onAppOpenAttributionNative = i13 * i10;
        this.onAttributionFailureNative = i13 ^ i10;
        this.onDeepLinkingNative = (int) (j10 >> 32);
    }

    private int valueOf() throws IOException {
        if (this.AFVersionDeclaration == Integer.MAX_VALUE) {
            this.AFVersionDeclaration = ((FilterInputStream) this).in.read();
        }
        if (this.AFKeystoreWrapper == 8) {
            byte[] bArr = this.valueOf;
            int i10 = this.AFVersionDeclaration;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.valueOf, i11, 8 - i11);
                if (read <= 0) {
                    break;
                }
                i11 += read;
            } while (i11 < 8);
            if (i11 >= 8) {
                values();
                int read2 = ((FilterInputStream) this).in.read();
                this.AFVersionDeclaration = read2;
                this.AFKeystoreWrapper = 0;
                this.getLevel = read2 < 0 ? 8 - (this.valueOf[7] & 255) : 8;
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.getLevel;
    }

    private void values() {
        if (this.AppsFlyer2dXConversionCallback == 3) {
            byte[] bArr = this.valueOf;
            System.arraycopy(bArr, 0, this.AFInAppEventType, 0, bArr.length);
        }
        byte[] bArr2 = this.valueOf;
        int i10 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = 0;
        while (true) {
            int i13 = this.init;
            if (i12 >= i13) {
                break;
            }
            short s10 = AFInAppEventParameterName;
            i11 -= ((((i13 - i12) * s10) + i10) ^ ((i10 << 4) + this.onAttributionFailureNative)) ^ ((i10 >>> 5) + this.onDeepLinkingNative);
            i10 -= (((i11 << 4) + this.AFLogger$LogLevel) ^ ((s10 * (i13 - i12)) + i11)) ^ ((i11 >>> 5) + this.onAppOpenAttributionNative);
            i12++;
        }
        byte[] bArr3 = this.valueOf;
        bArr3[0] = (byte) (i10 >> 24);
        bArr3[1] = (byte) (i10 >> 16);
        bArr3[2] = (byte) (i10 >> 8);
        bArr3[3] = (byte) i10;
        bArr3[4] = (byte) (i11 >> 24);
        bArr3[5] = (byte) (i11 >> 16);
        bArr3[6] = (byte) (i11 >> 8);
        bArr3[7] = (byte) i11;
        if (this.AppsFlyer2dXConversionCallback == 3) {
            for (int i14 = 0; i14 < 8; i14++) {
                byte[] bArr4 = this.valueOf;
                bArr4[i14] = (byte) (bArr4[i14] ^ this.values[i14]);
            }
            byte[] bArr5 = this.AFInAppEventType;
            System.arraycopy(bArr5, 0, this.values, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        valueOf();
        return this.getLevel - this.AFKeystoreWrapper;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        valueOf();
        int i10 = this.AFKeystoreWrapper;
        if (i10 >= this.getLevel) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.AFKeystoreWrapper = i10 + 1;
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
            valueOf();
            int i14 = this.AFKeystoreWrapper;
            if (i14 >= this.getLevel) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.valueOf;
            this.AFKeystoreWrapper = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
