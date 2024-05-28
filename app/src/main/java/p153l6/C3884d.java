package p153l6;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.appsflyer.oaid.BuildConfig;
import java.nio.ByteBuffer;
import p032c6.C1131a;
import p110i3.BinderC3517b;
import p110i3.InterfaceC3516a;
import p140k6.C3759a;
import p321z2.C5970c;
import p321z2.C5984j;

/* renamed from: l6.d */
/* loaded from: classes.dex */
public class C3884d {

    /* renamed from: a */
    private static final C5970c f16123a = new C5970c("MLKitImageUtils", BuildConfig.FLAVOR);

    /* renamed from: b */
    private static C3884d f16124b = new C3884d();

    private C3884d() {
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C3884d m16498b() {
        return f16124b;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public InterfaceC3516a m16499a(@RecentlyNonNull C3759a c3759a) throws C1131a {
        int m15972d = c3759a.m15972d();
        if (m15972d != -1) {
            if (m15972d != 17) {
                if (m15972d == 35) {
                    return BinderC3517b.m15328J0(c3759a.m15974f());
                }
                if (m15972d != 842094169) {
                    int m15972d2 = c3759a.m15972d();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unsupported image format: ");
                    sb2.append(m15972d2);
                    throw new C1131a(sb2.toString(), 3);
                }
            }
            return BinderC3517b.m15328J0((ByteBuffer) C5984j.m21286j(c3759a.m15971c()));
        }
        return BinderC3517b.m15328J0((Bitmap) C5984j.m21286j(c3759a.m15970b()));
    }

    @TargetApi(19)
    /* renamed from: c */
    public int m16500c(@RecentlyNonNull C3759a c3759a) {
        if (c3759a.m15972d() == -1) {
            return ((Bitmap) C5984j.m21286j(c3759a.m15970b())).getAllocationByteCount();
        }
        if (c3759a.m15972d() != 17 && c3759a.m15972d() != 842094169) {
            if (c3759a.m15972d() != 35) {
                return 0;
            }
            return (((Image.Plane[]) C5984j.m21286j(c3759a.m15975g()))[0].getBuffer().limit() * 3) / 2;
        }
        return ((ByteBuffer) C5984j.m21286j(c3759a.m15971c())).limit();
    }

    @RecentlyNullable
    /* renamed from: d */
    public Matrix m16501d(int i10, int i11, int i12) {
        if (i12 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
        matrix.postRotate(i12 * 90);
        int i13 = i12 % 2;
        int i14 = i13 != 0 ? i11 : i10;
        if (i13 == 0) {
            i10 = i11;
        }
        matrix.postTranslate(i14 / 2.0f, i10 / 2.0f);
        return matrix;
    }
}
