package p140k6;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.nio.ByteBuffer;
import p087g6.InterfaceC3297h;
import p153l6.C3883c;
import p309y3.C5791p7;
import p309y3.C5809r7;
import p321z2.C5984j;

/* renamed from: k6.a */
/* loaded from: classes.dex */
public class C3759a implements InterfaceC3297h {

    /* renamed from: a */
    private volatile Bitmap f15763a;

    /* renamed from: b */
    private volatile ByteBuffer f15764b;

    /* renamed from: c */
    private volatile C3760b f15765c;

    /* renamed from: d */
    private final int f15766d;

    /* renamed from: e */
    private final int f15767e;

    /* renamed from: f */
    private final int f15768f;

    /* renamed from: g */
    private final int f15769g;

    private C3759a(Bitmap bitmap, int i10) {
        this.f15763a = (Bitmap) C5984j.m21286j(bitmap);
        this.f15766d = bitmap.getWidth();
        this.f15767e = bitmap.getHeight();
        this.f15768f = i10;
        this.f15769g = -1;
    }

    /* renamed from: a */
    public static C3759a m15968a(@RecentlyNonNull Image image, int i10) {
        int i11;
        boolean z10;
        C3759a c3759a;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C5984j.m21287k(image, "Please provide a valid image");
        boolean z11 = true;
        if (i10 == 0 || i10 == 90 || i10 == 180) {
            i11 = i10;
            z10 = true;
        } else if (i10 == 270) {
            z10 = true;
            i11 = 270;
        } else {
            i11 = i10;
            z10 = false;
        }
        C5984j.m21278b(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z11 = false;
        }
        C5984j.m21278b(z11, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            c3759a = new C3759a(C3883c.m16491d().m16495b(image, i11), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            c3759a = new C3759a(image, image.getWidth(), image.getHeight(), i11);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i12 = limit;
        C3759a c3759a2 = c3759a;
        m15969j(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i12, i11);
        return c3759a2;
    }

    /* renamed from: j */
    private static void m15969j(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        C5809r7.m20757a(C5791p7.m20741b("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }

    @RecentlyNullable
    /* renamed from: b */
    public Bitmap m15970b() {
        return this.f15763a;
    }

    @RecentlyNullable
    /* renamed from: c */
    public ByteBuffer m15971c() {
        return this.f15764b;
    }

    /* renamed from: d */
    public int m15972d() {
        return this.f15769g;
    }

    /* renamed from: e */
    public int m15973e() {
        return this.f15767e;
    }

    @RecentlyNullable
    /* renamed from: f */
    public Image m15974f() {
        if (this.f15765c == null) {
            return null;
        }
        return this.f15765c.m15978a();
    }

    @RecentlyNullable
    /* renamed from: g */
    public Image.Plane[] m15975g() {
        if (this.f15765c == null) {
            return null;
        }
        return this.f15765c.m15979b();
    }

    /* renamed from: h */
    public int m15976h() {
        return this.f15768f;
    }

    /* renamed from: i */
    public int m15977i() {
        return this.f15766d;
    }

    private C3759a(Image image, int i10, int i11, int i12) {
        C5984j.m21286j(image);
        this.f15765c = new C3760b(image);
        this.f15766d = i10;
        this.f15767e = i11;
        this.f15768f = i12;
        this.f15769g = 35;
    }
}
