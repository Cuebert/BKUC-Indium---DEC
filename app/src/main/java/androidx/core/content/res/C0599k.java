package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.res.k */
/* loaded from: classes.dex */
public class C0599k {
    /* renamed from: a */
    public static boolean m3152a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        return !m3161j(xmlPullParser, str) ? z10 : typedArray.getBoolean(i10, z10);
    }

    /* renamed from: b */
    public static int m3153b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m3161j(xmlPullParser, str) ? i11 : typedArray.getColor(i10, i11);
    }

    /* renamed from: c */
    public static ColorStateList m3154c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        if (!m3161j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        int i11 = typedValue.type;
        if (i11 != 2) {
            if (i11 >= 28 && i11 <= 31) {
                return m3155d(typedValue);
            }
            return C0591c.m3081d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
    }

    /* renamed from: d */
    private static ColorStateList m3155d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C0592d m3156e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        if (m3161j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return C0592d.m3087b(typedValue.data);
            }
            C0592d m3090g = C0592d.m3090g(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (m3090g != null) {
                return m3090g;
            }
        }
        return C0592d.m3087b(i11);
    }

    /* renamed from: f */
    public static float m3157f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !m3161j(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    /* renamed from: g */
    public static int m3158g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m3161j(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    /* renamed from: h */
    public static int m3159h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m3161j(xmlPullParser, str) ? i11 : typedArray.getResourceId(i10, i11);
    }

    /* renamed from: i */
    public static String m3160i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (m3161j(xmlPullParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m3161j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m3162k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m3163l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (m3161j(xmlPullParser, str)) {
            return typedArray.peekValue(i10);
        }
        return null;
    }
}
