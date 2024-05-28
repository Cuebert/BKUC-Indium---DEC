package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class BarhopperV2 implements Closeable {

    /* renamed from: o */
    private static final String f8886o = BarhopperV2.class.getSimpleName();

    /* renamed from: n */
    private long f8887n;

    public BarhopperV2() {
        System.loadLibrary("barhopper_v2");
    }

    private native void closeNative(long j10);

    private native long createNative();

    private native Barcode[] recognizeBitmapNative(long j10, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native Barcode[] recognizeBufferNative(long j10, int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native Barcode[] recognizeNative(long j10, int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions);

    /* renamed from: b */
    public void m10418b() {
        if (this.f8887n != 0) {
            Log.w(f8886o, "Native context already exists.");
            return;
        }
        long createNative = createNative();
        this.f8887n = createNative;
        if (createNative == 0) {
            throw new RuntimeException("Failed to create native context.");
        }
    }

    @RecentlyNonNull
    /* renamed from: c */
    public Barcode[] m10419c(int i10, int i11, @RecentlyNonNull ByteBuffer byteBuffer, @RecentlyNonNull RecognitionOptions recognitionOptions) {
        long j10 = this.f8887n;
        if (j10 != 0) {
            return recognizeBufferNative(j10, i10, i11, byteBuffer, recognitionOptions);
        }
        throw new RuntimeException("Native context does not exist.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f8887n;
        if (j10 != 0) {
            closeNative(j10);
            this.f8887n = 0L;
        }
    }

    @RecentlyNonNull
    /* renamed from: e */
    public Barcode[] m10420e(int i10, int i11, @RecentlyNonNull byte[] bArr, @RecentlyNonNull RecognitionOptions recognitionOptions) {
        long j10 = this.f8887n;
        if (j10 != 0) {
            return recognizeNative(j10, i10, i11, bArr, recognitionOptions);
        }
        throw new RuntimeException("Native context does not exist.");
    }

    protected void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @RecentlyNonNull
    /* renamed from: i */
    public Barcode[] m10421i(@RecentlyNonNull Bitmap bitmap, @RecentlyNonNull RecognitionOptions recognitionOptions) {
        long j10 = this.f8887n;
        if (j10 != 0) {
            return recognizeBitmapNative(j10, bitmap, recognitionOptions);
        }
        throw new RuntimeException("Native context does not exist.");
    }
}
