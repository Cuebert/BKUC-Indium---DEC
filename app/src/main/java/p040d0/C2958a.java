package p040d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C0463q1;
import androidx.camera.core.InterfaceC0443l1;
import java.nio.ByteBuffer;

/* renamed from: d0.a */
/* loaded from: classes.dex */
public final class C2958a {
    /* renamed from: a */
    public static Rect m13376a(Size size, Rational rational) {
        int i10;
        if (!m13380e(rational)) {
            C0463q1.m2212k("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i11 = 0;
        if (rational.floatValue() > f12) {
            int round = Math.round((f10 / numerator) * denominator);
            i10 = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f11 / denominator) * numerator);
            i11 = (width - round2) / 2;
            width = round2;
            i10 = 0;
        }
        return new Rect(i11, i10, width + i11, height + i10);
    }

    /* renamed from: b */
    public static Rect m13377b(Rect rect, int i10, Size size, int i11) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i11 - i10);
        float[] m13384i = m13384i(size);
        matrix.mapPoints(m13384i);
        matrix.postTranslate(-m13383h(m13384i[0], m13384i[2], m13384i[4], m13384i[6]), -m13383h(m13384i[1], m13384i[3], m13384i[5], m13384i[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: c */
    public static Rational m13378c(int i10, Rational rational) {
        if (i10 != 90 && i10 != 270) {
            return new Rational(rational.getNumerator(), rational.getDenominator());
        }
        return m13379d(rational);
    }

    /* renamed from: d */
    private static Rational m13379d(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    /* renamed from: e */
    public static boolean m13380e(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    /* renamed from: f */
    public static boolean m13381f(Size size, Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && m13382g(size, rational) && !rational.isNaN();
    }

    /* renamed from: g */
    private static boolean m13382g(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    /* renamed from: h */
    public static float m13383h(float f10, float f11, float f12, float f13) {
        return Math.min(Math.min(f10, f11), Math.min(f12, f13));
    }

    /* renamed from: i */
    public static float[] m13384i(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    /* renamed from: j */
    public static byte[] m13385j(InterfaceC0443l1 interfaceC0443l1) {
        InterfaceC0443l1.a aVar = interfaceC0443l1.mo1855k()[0];
        InterfaceC0443l1.a aVar2 = interfaceC0443l1.mo1855k()[1];
        InterfaceC0443l1.a aVar3 = interfaceC0443l1.mo1855k()[2];
        ByteBuffer mo1860d = aVar.mo1860d();
        ByteBuffer mo1860d2 = aVar2.mo1860d();
        ByteBuffer mo1860d3 = aVar3.mo1860d();
        mo1860d.rewind();
        mo1860d2.rewind();
        mo1860d3.rewind();
        int remaining = mo1860d.remaining();
        byte[] bArr = new byte[((interfaceC0443l1.mo1853g() * interfaceC0443l1.getHeight()) / 2) + remaining];
        int i10 = 0;
        for (int i11 = 0; i11 < interfaceC0443l1.getHeight(); i11++) {
            mo1860d.get(bArr, i10, interfaceC0443l1.mo1853g());
            i10 += interfaceC0443l1.mo1853g();
            mo1860d.position(Math.min(remaining, (mo1860d.position() - interfaceC0443l1.mo1853g()) + aVar.mo1858a()));
        }
        int height = interfaceC0443l1.getHeight() / 2;
        int mo1853g = interfaceC0443l1.mo1853g() / 2;
        int mo1858a = aVar3.mo1858a();
        int mo1858a2 = aVar2.mo1858a();
        int mo1859b = aVar3.mo1859b();
        int mo1859b2 = aVar2.mo1859b();
        byte[] bArr2 = new byte[mo1858a];
        byte[] bArr3 = new byte[mo1858a2];
        for (int i12 = 0; i12 < height; i12++) {
            mo1860d3.get(bArr2, 0, Math.min(mo1858a, mo1860d3.remaining()));
            mo1860d2.get(bArr3, 0, Math.min(mo1858a2, mo1860d2.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < mo1853g; i15++) {
                int i16 = i10 + 1;
                bArr[i10] = bArr2[i13];
                i10 = i16 + 1;
                bArr[i16] = bArr3[i14];
                i13 += mo1859b;
                i14 += mo1859b2;
            }
        }
        return bArr;
    }
}
