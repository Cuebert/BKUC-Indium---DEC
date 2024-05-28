package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.C0599k;
import androidx.core.graphics.C0603c;
import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.d */
/* loaded from: classes.dex */
public class C0936d {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.d$a */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<C0603c.b[]> {

        /* renamed from: a */
        private C0603c.b[] f4949a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0603c.b[] evaluate(float f10, C0603c.b[] bVarArr, C0603c.b[] bVarArr2) {
            if (C0603c.m3188b(bVarArr, bVarArr2)) {
                if (!C0603c.m3188b(this.f4949a, bVarArr)) {
                    this.f4949a = C0603c.m3192f(bVarArr);
                }
                for (int i10 = 0; i10 < bVarArr.length; i10++) {
                    this.f4949a[i10].m3201d(bVarArr[i10], bVarArr2[i10], f10);
                }
                return this.f4949a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static Animator m5971a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f10) throws XmlPullParserException, IOException {
        return m5972b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator m5972b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C0936d.m5972b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m5973c(Keyframe keyframe, float f10) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f10);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f10);
        }
        return Keyframe.ofObject(f10);
    }

    /* renamed from: d */
    private static void m5974d(Keyframe[] keyframeArr, float f10, int i10, int i11) {
        float f11 = f10 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f11);
            i10++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m5975e(TypedArray typedArray, int i10, int i11, int i12, String str) {
        int i13;
        int i14;
        int i15;
        float f10;
        PropertyValuesHolder ofFloat;
        float f11;
        float f12;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z10 = peekValue != null;
        int i16 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z11 = peekValue2 != null;
        int i17 = z11 ? peekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && m5978h(i16)) || (z11 && m5978h(i17))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            C0603c.b[] m3190d = C0603c.m3190d(string);
            C0603c.b[] m3190d2 = C0603c.m3190d(string2);
            if (m3190d == null && m3190d2 == null) {
                return null;
            }
            if (m3190d == null) {
                if (m3190d2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), m3190d2);
                }
                return null;
            }
            a aVar = new a();
            if (m3190d2 != null) {
                if (C0603c.m3188b(m3190d, m3190d2)) {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, m3190d, m3190d2);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, aVar, m3190d);
            }
            return ofObject;
        }
        C0937e m5991a = i10 == 3 ? C0937e.m5991a() : null;
        if (z12) {
            if (z10) {
                if (i16 == 5) {
                    f11 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f11 = typedArray.getFloat(i11, 0.0f);
                }
                if (z11) {
                    if (i17 == 5) {
                        f12 = typedArray.getDimension(i12, 0.0f);
                    } else {
                        f12 = typedArray.getFloat(i12, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11, f12);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11);
                }
            } else {
                if (i17 == 5) {
                    f10 = typedArray.getDimension(i12, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i12, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f10);
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            if (i16 == 5) {
                i14 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (m5978h(i16)) {
                i14 = typedArray.getColor(i11, 0);
            } else {
                i14 = typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i17 == 5) {
                    i15 = (int) typedArray.getDimension(i12, 0.0f);
                } else if (m5978h(i17)) {
                    i15 = typedArray.getColor(i12, 0);
                } else {
                    i15 = typedArray.getInt(i12, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14, i15);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14);
            }
        } else if (z11) {
            if (i17 == 5) {
                i13 = (int) typedArray.getDimension(i12, 0.0f);
            } else if (m5978h(i17)) {
                i13 = typedArray.getColor(i12, 0);
            } else {
                i13 = typedArray.getInt(i12, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i13);
        }
        if (propertyValuesHolder == null || m5991a == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(m5991a);
        return propertyValuesHolder;
    }

    /* renamed from: f */
    private static int m5976f(TypedArray typedArray, int i10, int i11) {
        TypedValue peekValue = typedArray.peekValue(i10);
        boolean z10 = peekValue != null;
        int i12 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i11);
        boolean z11 = peekValue2 != null;
        return ((z10 && m5978h(i12)) || (z11 && m5978h(z11 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: g */
    private static int m5977g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C0933a.f4933j);
        int i10 = 0;
        TypedValue m3163l = C0599k.m3163l(m3162k, xmlPullParser, "value", 0);
        if ((m3163l != null) && m5978h(m3163l.type)) {
            i10 = 3;
        }
        m3162k.recycle();
        return i10;
    }

    /* renamed from: h */
    private static boolean m5978h(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    /* renamed from: i */
    public static Animator m5979i(Context context, int i10) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i10);
        }
        return m5980j(context, context.getResources(), context.getTheme(), i10);
    }

    /* renamed from: j */
    public static Animator m5980j(Context context, Resources resources, Resources.Theme theme, int i10) throws Resources.NotFoundException {
        return m5981k(context, resources, theme, i10, 1.0f);
    }

    /* renamed from: k */
    public static Animator m5981k(Context context, Resources resources, Resources.Theme theme, int i10, float f10) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i10);
                    return m5971a(context, resources, theme, xmlResourceParser, f10);
                } catch (IOException e10) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                    notFoundException.initCause(e10);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e11) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e11);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m5982l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C0933a.f4930g);
        TypedArray m3162k2 = C0599k.m3162k(resources, theme, attributeSet, C0933a.f4934k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m5987q(valueAnimator, m3162k, m3162k2, f10, xmlPullParser);
        int m3159h = C0599k.m3159h(m3162k, xmlPullParser, "interpolator", 0, 0);
        if (m3159h > 0) {
            valueAnimator.setInterpolator(C0935c.m5970a(context, m3159h));
        }
        m3162k.recycle();
        if (m3162k2 != null) {
            m3162k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m5983m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe ofInt;
        TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C0933a.f4933j);
        float m3157f = C0599k.m3157f(m3162k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m3163l = C0599k.m3163l(m3162k, xmlPullParser, "value", 0);
        boolean z10 = m3163l != null;
        if (i10 == 4) {
            i10 = (z10 && m5978h(m3163l.type)) ? 3 : 0;
        }
        if (z10) {
            if (i10 != 0) {
                ofInt = (i10 == 1 || i10 == 3) ? Keyframe.ofInt(m3157f, C0599k.m3158g(m3162k, xmlPullParser, "value", 0, 0)) : null;
            } else {
                ofInt = Keyframe.ofFloat(m3157f, C0599k.m3157f(m3162k, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i10 == 0) {
            ofInt = Keyframe.ofFloat(m3157f);
        } else {
            ofInt = Keyframe.ofInt(m3157f);
        }
        int m3159h = C0599k.m3159h(m3162k, xmlPullParser, "interpolator", 1, 0);
        if (m3159h > 0) {
            ofInt.setInterpolator(C0935c.m5970a(context, m3159h));
        }
        m3162k.recycle();
        return ofInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m5984n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m5982l(context, resources, theme, attributeSet, objectAnimator, f10, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m5985o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i10 == 4) {
                    i10 = m5977g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m5983m = m5983m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i10, xmlPullParser);
                if (m5983m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m5983m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m5973c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m5973c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i11 = 0; i11 < size; i11++) {
                Keyframe keyframe3 = keyframeArr[i11];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i11 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i12 = size - 1;
                        if (i11 == i12) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i13 = i11;
                            for (int i14 = i11 + 1; i14 < i12 && keyframeArr[i14].getFraction() < 0.0f; i14++) {
                                i13 = i14;
                            }
                            m5974d(keyframeArr, keyframeArr[i13 + 1].getFraction() - keyframeArr[i11 - 1].getFraction(), i11, i13);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i10 == 3) {
                propertyValuesHolder.setEvaluator(C0937e.m5991a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m5986p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i10;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C0933a.f4932i);
                    String m3160i = C0599k.m3160i(m3162k, xmlPullParser, "propertyName", 3);
                    int m3158g = C0599k.m3158g(m3162k, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder m5985o = m5985o(context, resources, theme, xmlPullParser, m3160i, m3158g);
                    if (m5985o == null) {
                        m5985o = m5975e(m3162k, m3158g, 0, 1, m3160i);
                    }
                    if (m5985o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(m5985o);
                    }
                    m3162k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i10 = 0; i10 < size; i10++) {
                propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList.get(i10);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m5987q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f10, XmlPullParser xmlPullParser) {
        long m3158g = C0599k.m3158g(typedArray, xmlPullParser, "duration", 1, 300);
        long m3158g2 = C0599k.m3158g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m3158g3 = C0599k.m3158g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0599k.m3161j(xmlPullParser, "valueFrom") && C0599k.m3161j(xmlPullParser, "valueTo")) {
            if (m3158g3 == 4) {
                m3158g3 = m5976f(typedArray, 5, 6);
            }
            PropertyValuesHolder m5975e = m5975e(typedArray, m3158g3, 5, 6, BuildConfig.FLAVOR);
            if (m5975e != null) {
                valueAnimator.setValues(m5975e);
            }
        }
        valueAnimator.setDuration(m3158g);
        valueAnimator.setStartDelay(m3158g2);
        valueAnimator.setRepeatCount(C0599k.m3158g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0599k.m3158g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m5988r(valueAnimator, typedArray2, m3158g3, f10, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m5988r(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m3160i = C0599k.m3160i(typedArray, xmlPullParser, "pathData", 1);
        if (m3160i != null) {
            String m3160i2 = C0599k.m3160i(typedArray, xmlPullParser, "propertyXName", 2);
            String m3160i3 = C0599k.m3160i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i10 != 2) {
            }
            if (m3160i2 == null && m3160i3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m5989s(C0603c.m3191e(m3160i), objectAnimator, f10 * 0.5f, m3160i2, m3160i3);
            return;
        }
        objectAnimator.setPropertyName(C0599k.m3160i(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: s */
    private static void m5989s(Path path, ObjectAnimator objectAnimator, float f10, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f12 = 0.0f;
        do {
            f12 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f12));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f12 / f10)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f13 = f12 / (min - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f11 += f13;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f11 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
