package p153l6;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import java.nio.ByteBuffer;
import p032c6.C1131a;
import p140k6.C3759a;
import p321z2.C5984j;

/* renamed from: l6.c */
/* loaded from: classes.dex */
public class C3883c {

    /* renamed from: a */
    private static final C3883c f16122a = new C3883c();

    private C3883c() {
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static ByteBuffer m16490a(@RecentlyNonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static C3883c m16491d() {
        return f16122a;
    }

    @RecentlyNonNull
    /* renamed from: f */
    public static ByteBuffer m16492f(@RecentlyNonNull ByteBuffer byteBuffer, boolean z10) {
        ByteBuffer allocateDirect;
        int i10;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i11 = limit / 6;
        if (z10) {
            allocateDirect = ByteBuffer.allocate(limit);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(limit);
        }
        int i12 = 0;
        while (true) {
            i10 = i11 * 4;
            if (i12 >= i10) {
                break;
            }
            allocateDirect.put(i12, byteBuffer.get(i12));
            i12++;
        }
        for (int i13 = 0; i13 < i11 + i11; i13++) {
            allocateDirect.put(i10 + i13, byteBuffer.get(((i13 % 2) * i11) + i10 + (i13 / 2)));
        }
        return allocateDirect;
    }

    /* renamed from: g */
    private static Bitmap m16493g(Bitmap bitmap, int i10, int i11, int i12) {
        if (i10 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
    }

    @TargetApi(19)
    /* renamed from: h */
    private static final void m16494h(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit == 0) {
            return;
        }
        int i14 = i10 / (i11 / limit);
        int i15 = 0;
        for (int i16 = 0; i16 < limit; i16++) {
            int i17 = i15;
            for (int i18 = 0; i18 < i14; i18++) {
                bArr[i12] = buffer.get(i17);
                i12 += i13;
                i17 += plane.getPixelStride();
            }
            i15 += plane.getRowStride();
        }
    }

    /* renamed from: b */
    public Bitmap m16495b(@RecentlyNonNull Image image, int i10) {
        C5984j.m21278b(image.getFormat() == 256, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes != null && planes.length == 1) {
            ByteBuffer buffer = planes[0].getBuffer();
            buffer.rewind();
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr);
            return m16493g(BitmapFactory.decodeByteArray(bArr, 0, remaining), i10, image.getWidth(), image.getHeight());
        }
        throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
    }

    /* renamed from: c */
    public ByteBuffer m16496c(@RecentlyNonNull C3759a c3759a, boolean z10) throws C1131a {
        ByteBuffer allocateDirect;
        int m15972d = c3759a.m15972d();
        if (m15972d != -1) {
            if (m15972d == 17) {
                if (z10) {
                    return m16490a((ByteBuffer) C5984j.m21286j(c3759a.m15971c()));
                }
                return (ByteBuffer) C5984j.m21286j(c3759a.m15971c());
            }
            if (m15972d == 35) {
                return m16497e((Image.Plane[]) C5984j.m21286j(c3759a.m15975g()), c3759a.m15977i(), c3759a.m15973e());
            }
            if (m15972d == 842094169) {
                return m16492f((ByteBuffer) C5984j.m21286j(c3759a.m15971c()), z10);
            }
            throw new C1131a("Unsupported image format", 13);
        }
        Bitmap bitmap = (Bitmap) C5984j.m21286j(c3759a.m15970b());
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        int ceil2 = ((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i10;
        if (z10) {
            allocateDirect = ByteBuffer.allocate(ceil2);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(ceil2);
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < height; i13++) {
            int i14 = 0;
            while (i14 < width) {
                int i15 = iArr[i11];
                int i16 = (i15 >> 16) & 255;
                int i17 = (i15 >> 8) & 255;
                int i18 = i15 & 255;
                int i19 = (((((i16 * (-38)) - (i17 * 74)) + (i18 * 112)) + 128) >> 8) + 128;
                int i20 = (((((i16 * 112) - (i17 * 94)) - (i18 * 18)) + 128) >> 8) + 128;
                int i21 = i12 + 1;
                allocateDirect.put(i12, (byte) Math.min(255, (((((i16 * 66) + (i17 * 129)) + (i18 * 25)) + 128) >> 8) + 16));
                if (i13 % 2 == 0 && i11 % 2 == 0) {
                    int i22 = i10 + 1;
                    allocateDirect.put(i10, (byte) Math.min(255, i20));
                    i10 = i22 + 1;
                    allocateDirect.put(i22, (byte) Math.min(255, i19));
                }
                i11++;
                i14++;
                i12 = i21;
            }
        }
        return allocateDirect;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public ByteBuffer m16497e(@RecentlyNonNull Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        byte[] bArr = new byte[i13 + i13 + i12];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i14 = (i12 + i12) / 4;
        boolean z10 = buffer2.remaining() == i14 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z10) {
            planeArr[0].getBuffer().get(bArr, 0, i12);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i12, 1);
            buffer3.get(bArr, i12 + 1, i14 - 1);
        } else {
            m16494h(planeArr[0], i10, i11, bArr, 0, 1);
            m16494h(planeArr[1], i10, i11, bArr, i12 + 1, 2);
            m16494h(planeArr[2], i10, i11, bArr, i12, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
