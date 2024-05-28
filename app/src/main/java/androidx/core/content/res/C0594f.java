package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p182o0.C4114g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.res.f */
/* loaded from: classes.dex */
public final class C0594f {
    /* renamed from: a */
    private static a m3118a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        if (z10) {
            return new a(i10, i12, i11);
        }
        return new a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Shader m3119b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C4114g.f16737A);
            float m3157f = C0599k.m3157f(m3162k, xmlPullParser, "startX", C4114g.f16746J, 0.0f);
            float m3157f2 = C0599k.m3157f(m3162k, xmlPullParser, "startY", C4114g.f16747K, 0.0f);
            float m3157f3 = C0599k.m3157f(m3162k, xmlPullParser, "endX", C4114g.f16748L, 0.0f);
            float m3157f4 = C0599k.m3157f(m3162k, xmlPullParser, "endY", C4114g.f16749M, 0.0f);
            float m3157f5 = C0599k.m3157f(m3162k, xmlPullParser, "centerX", C4114g.f16741E, 0.0f);
            float m3157f6 = C0599k.m3157f(m3162k, xmlPullParser, "centerY", C4114g.f16742F, 0.0f);
            int m3158g = C0599k.m3158g(m3162k, xmlPullParser, "type", C4114g.f16740D, 0);
            int m3153b = C0599k.m3153b(m3162k, xmlPullParser, "startColor", C4114g.f16738B, 0);
            boolean m3161j = C0599k.m3161j(xmlPullParser, "centerColor");
            int m3153b2 = C0599k.m3153b(m3162k, xmlPullParser, "centerColor", C4114g.f16745I, 0);
            int m3153b3 = C0599k.m3153b(m3162k, xmlPullParser, "endColor", C4114g.f16739C, 0);
            int m3158g2 = C0599k.m3158g(m3162k, xmlPullParser, "tileMode", C4114g.f16744H, 0);
            float m3157f7 = C0599k.m3157f(m3162k, xmlPullParser, "gradientRadius", C4114g.f16743G, 0.0f);
            m3162k.recycle();
            a m3118a = m3118a(m3120c(resources, xmlPullParser, attributeSet, theme), m3153b, m3153b3, m3161j, m3153b2);
            if (m3158g != 1) {
                if (m3158g != 2) {
                    return new LinearGradient(m3157f, m3157f2, m3157f3, m3157f4, m3118a.f3289a, m3118a.f3290b, m3121d(m3158g2));
                }
                return new SweepGradient(m3157f5, m3157f6, m3118a.f3289a, m3118a.f3290b);
            }
            if (m3157f7 > 0.0f) {
                return new RadialGradient(m3157f5, m3157f6, m3157f7, m3118a.f3289a, m3118a.f3290b, m3121d(m3158g2));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.res.C0594f.a m3120c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p182o0.C4114g.f16750N
            android.content.res.TypedArray r3 = androidx.core.content.res.C0599k.m3162k(r9, r12, r11, r3)
            int r5 = p182o0.C4114g.f16751O
            boolean r6 = r3.hasValue(r5)
            int r7 = p182o0.C4114g.f16752P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0594f.m3120c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m3121d(int i10) {
        if (i10 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i10 != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final int[] f3289a;

        /* renamed from: b */
        final float[] f3290b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f3289a = new int[size];
            this.f3290b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f3289a[i10] = list.get(i10).intValue();
                this.f3290b[i10] = list2.get(i10).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f3289a = new int[]{i10, i11};
            this.f3290b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f3289a = new int[]{i10, i11, i12};
            this.f3290b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
