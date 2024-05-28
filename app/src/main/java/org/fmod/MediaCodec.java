package org.fmod;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class MediaCodec {
    private long mCodecPtr = 0;
    private long mLength = 0;
    private int mSampleRate = 0;
    private int mChannelCount = 0;
    private boolean mInputFinished = false;
    private boolean mOutputFinished = false;
    private android.media.MediaCodec mDecoder = null;
    private Object mDataSourceProxy = null;
    private MediaExtractor mExtractor = null;
    private ByteBuffer[] mInputBuffers = null;
    private ByteBuffer[] mOutputBuffers = null;
    private int mCurrentOutputBufferIndex = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static native long fmodGetSize(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int fmodReadAt(long j10, long j11, byte[] bArr, int i10, int i11);

    public int getChannelCount() {
        return this.mChannelCount;
    }

    public long getLength() {
        return this.mLength;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public boolean init(long j10) {
        this.mCodecPtr = j10;
        if (Build.VERSION.SDK_INT < 23) {
            try {
                Class<?> cls = Class.forName("android.media.DataSource");
                Method method = Class.forName("android.media.MediaExtractor").getMethod("setDataSource", cls);
                this.mExtractor = new MediaExtractor();
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: org.fmod.MediaCodec.1DataSource
                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj, Method method2, Object[] objArr) {
                        if (method2.getName().equals("readAt")) {
                            return Integer.valueOf(MediaCodec.fmodReadAt(MediaCodec.this.mCodecPtr, ((Long) objArr[0]).longValue(), (byte[]) objArr[1], 0, ((Integer) objArr[2]).intValue()));
                        }
                        if (method2.getName().equals("getSize")) {
                            return Long.valueOf(MediaCodec.fmodGetSize(MediaCodec.this.mCodecPtr));
                        }
                        if (method2.getName().equals("close")) {
                            return null;
                        }
                        Log.w("fmod", "MediaCodec::DataSource::invoke : Unrecognised method found: " + method2.getName());
                        return null;
                    }
                });
                this.mDataSourceProxy = newProxyInstance;
                method.invoke(this.mExtractor, newProxyInstance);
            } catch (ClassNotFoundException e10) {
                Log.w("fmod", "MediaCodec::init : " + e10.toString());
                return false;
            } catch (IllegalAccessException e11) {
                Log.e("fmod", "MediaCodec::init : " + e11.toString());
                return false;
            } catch (NoSuchMethodException e12) {
                Log.w("fmod", "MediaCodec::init : " + e12.toString());
                return false;
            } catch (InvocationTargetException e13) {
                Log.e("fmod", "MediaCodec::init : " + e13.toString());
                return false;
            }
        } else {
            try {
                MediaExtractor mediaExtractor = new MediaExtractor();
                this.mExtractor = mediaExtractor;
                mediaExtractor.setDataSource(new MediaDataSource() { // from class: org.fmod.MediaCodec.2DataSource
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                    }

                    @Override // android.media.MediaDataSource
                    public long getSize() {
                        return MediaCodec.fmodGetSize(MediaCodec.this.mCodecPtr);
                    }

                    @Override // android.media.MediaDataSource
                    public int readAt(long j11, byte[] bArr, int i10, int i11) {
                        return MediaCodec.fmodReadAt(MediaCodec.this.mCodecPtr, j11, bArr, i10, i11);
                    }
                });
            } catch (IOException e14) {
                Log.w("fmod", "MediaCodec::init : " + e14.toString());
                return false;
            }
        }
        int trackCount = this.mExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            MediaFormat trackFormat = this.mExtractor.getTrackFormat(i10);
            String string = trackFormat.getString("mime");
            Log.d("fmod", "MediaCodec::init : Format " + i10 + " / " + trackCount + " -- " + trackFormat);
            if (string.equals("audio/mp4a-latm")) {
                try {
                    this.mDecoder = android.media.MediaCodec.createDecoderByType(string);
                    this.mExtractor.selectTrack(i10);
                    this.mDecoder.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                    this.mDecoder.start();
                    this.mInputBuffers = this.mDecoder.getInputBuffers();
                    this.mOutputBuffers = this.mDecoder.getOutputBuffers();
                    int integer = trackFormat.containsKey("encoder-delay") ? trackFormat.getInteger("encoder-delay") : 0;
                    int integer2 = trackFormat.containsKey("encoder-padding") ? trackFormat.getInteger("encoder-padding") : 0;
                    long j11 = trackFormat.getLong("durationUs");
                    this.mChannelCount = trackFormat.getInteger("channel-count");
                    this.mSampleRate = trackFormat.getInteger("sample-rate");
                    this.mLength = (((int) (((j11 * r10) + 999999) / 1000000)) - integer) - integer2;
                    return true;
                } catch (IOException e15) {
                    Log.e("fmod", "MediaCodec::init : " + e15.toString());
                    return false;
                }
            }
        }
        return false;
    }

    public int read(byte[] bArr, int i10) {
        int dequeueInputBuffer;
        int i11 = (this.mInputFinished && this.mOutputFinished && this.mCurrentOutputBufferIndex == -1) ? -1 : 0;
        while (!this.mInputFinished && (dequeueInputBuffer = this.mDecoder.dequeueInputBuffer(0L)) >= 0) {
            int readSampleData = this.mExtractor.readSampleData(this.mInputBuffers[dequeueInputBuffer], 0);
            if (readSampleData >= 0) {
                this.mDecoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mExtractor.getSampleTime(), 0);
                this.mExtractor.advance();
            } else {
                this.mDecoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                this.mInputFinished = true;
            }
        }
        if (!this.mOutputFinished && this.mCurrentOutputBufferIndex == -1) {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mDecoder.dequeueOutputBuffer(bufferInfo, 10000L);
            if (dequeueOutputBuffer >= 0) {
                this.mCurrentOutputBufferIndex = dequeueOutputBuffer;
                this.mOutputBuffers[dequeueOutputBuffer].limit(bufferInfo.size);
                this.mOutputBuffers[dequeueOutputBuffer].position(bufferInfo.offset);
            } else if (dequeueOutputBuffer == -3) {
                this.mOutputBuffers = this.mDecoder.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                Log.d("fmod", "MediaCodec::read : MediaCodec::dequeueOutputBuffer returned MediaCodec.INFO_OUTPUT_FORMAT_CHANGED " + this.mDecoder.getOutputFormat());
            } else if (dequeueOutputBuffer == -1) {
                Log.d("fmod", "MediaCodec::read : MediaCodec::dequeueOutputBuffer returned MediaCodec.INFO_TRY_AGAIN_LATER.");
            } else {
                Log.w("fmod", "MediaCodec::read : MediaCodec::dequeueOutputBuffer returned " + dequeueOutputBuffer);
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.mOutputFinished = true;
            }
        }
        int i12 = this.mCurrentOutputBufferIndex;
        if (i12 == -1) {
            return i11;
        }
        ByteBuffer byteBuffer = this.mOutputBuffers[i12];
        int min = Math.min(byteBuffer.remaining(), i10);
        byteBuffer.get(bArr, 0, min);
        if (!byteBuffer.hasRemaining()) {
            byteBuffer.clear();
            this.mDecoder.releaseOutputBuffer(this.mCurrentOutputBufferIndex, false);
            this.mCurrentOutputBufferIndex = -1;
        }
        return min;
    }

    public void release() {
        android.media.MediaCodec mediaCodec = this.mDecoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mDecoder.release();
            this.mDecoder = null;
        }
        MediaExtractor mediaExtractor = this.mExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mExtractor = null;
        }
    }

    public void seek(int i10) {
        int i11 = this.mCurrentOutputBufferIndex;
        if (i11 != -1) {
            this.mOutputBuffers[i11].clear();
            this.mCurrentOutputBufferIndex = -1;
        }
        this.mInputFinished = false;
        this.mOutputFinished = false;
        this.mDecoder.flush();
        long j10 = i10;
        this.mExtractor.seekTo((j10 * 1000000) / this.mSampleRate, 0);
        long sampleTime = ((this.mExtractor.getSampleTime() * this.mSampleRate) + 999999) / 1000000;
        int i12 = (int) ((j10 - sampleTime) * this.mChannelCount * 2);
        if (i12 >= 0) {
            byte[] bArr = new byte[1024];
            while (i12 > 0) {
                i12 -= read(bArr, Math.min(1024, i12));
            }
        } else {
            Log.w("fmod", "MediaCodec::seek : Seek to " + i10 + " resulted in position " + sampleTime);
        }
    }
}
