package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.C0690v;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p039d.C2957j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
public class C0259l {

    /* renamed from: l */
    private static final RectF f1160l = new RectF();

    /* renamed from: m */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f1161m = new ConcurrentHashMap<>();

    /* renamed from: n */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f1162n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1163a = 0;

    /* renamed from: b */
    private boolean f1164b = false;

    /* renamed from: c */
    private float f1165c = -1.0f;

    /* renamed from: d */
    private float f1166d = -1.0f;

    /* renamed from: e */
    private float f1167e = -1.0f;

    /* renamed from: f */
    private int[] f1168f = new int[0];

    /* renamed from: g */
    private boolean f1169g = false;

    /* renamed from: h */
    private TextPaint f1170h;

    /* renamed from: i */
    private final TextView f1171i;

    /* renamed from: j */
    private final Context f1172j;

    /* renamed from: k */
    private final c f1173k;

    /* renamed from: androidx.appcompat.widget.l$a */
    /* loaded from: classes.dex */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.C0259l.c
        /* renamed from: a */
        void mo1274a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0259l.m1254o(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.l$b */
    /* loaded from: classes.dex */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.C0259l.a, androidx.appcompat.widget.C0259l.c
        /* renamed from: a */
        void mo1274a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C0259l.c
        /* renamed from: b */
        boolean mo1275b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.l$c */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        /* renamed from: a */
        void mo1274a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        boolean mo1275b(TextView textView) {
            return ((Boolean) C0259l.m1254o(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0259l(TextView textView) {
        this.f1171i = textView;
        this.f1172j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f1173k = new b();
        } else if (i10 >= 23) {
            this.f1173k = new a();
        } else {
            this.f1173k = new c();
        }
    }

    /* renamed from: A */
    private boolean m1246A() {
        return !(this.f1171i instanceof AppCompatEditText);
    }

    /* renamed from: B */
    private void m1247B(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 > 0.0f) {
            this.f1163a = 1;
            this.f1166d = f10;
            this.f1167e = f11;
            this.f1165c = f12;
            this.f1169g = false;
            return;
        }
        throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
    }

    /* renamed from: b */
    private int[] m1248b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m1249c() {
        this.f1163a = 0;
        this.f1166d = -1.0f;
        this.f1167e = -1.0f;
        this.f1165c = -1.0f;
        this.f1168f = new int[0];
        this.f1164b = false;
    }

    /* renamed from: e */
    private StaticLayout m1250e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1170h, i10);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1171i.getLineSpacingExtra(), this.f1171i.getLineSpacingMultiplier()).setIncludePad(this.f1171i.getIncludeFontPadding()).setBreakStrategy(this.f1171i.getBreakStrategy()).setHyphenationFrequency(this.f1171i.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            this.f1173k.mo1274a(obtain, this.f1171i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: f */
    private StaticLayout m1251f(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f1170h, i10, alignment, this.f1171i.getLineSpacingMultiplier(), this.f1171i.getLineSpacingExtra(), this.f1171i.getIncludeFontPadding());
    }

    /* renamed from: g */
    private int m1252g(RectF rectF) {
        int length = this.f1168f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                if (m1259z(this.f1168f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i11;
                    i11 = i14;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f1168f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: m */
    private static Method m1253m(String str) {
        try {
            Method method = f1161m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1161m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    /* renamed from: o */
    static <T> T m1254o(Object obj, String str, T t10) {
        try {
            return (T) m1253m(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    /* renamed from: u */
    private void m1255u(float f10) {
        if (f10 != this.f1171i.getPaint().getTextSize()) {
            this.f1171i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f1171i.isInLayout();
            if (this.f1171i.getLayout() != null) {
                this.f1164b = false;
                try {
                    Method m1253m = m1253m("nullLayouts");
                    if (m1253m != null) {
                        m1253m.invoke(this.f1171i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!isInLayout) {
                    this.f1171i.requestLayout();
                } else {
                    this.f1171i.forceLayout();
                }
                this.f1171i.invalidate();
            }
        }
    }

    /* renamed from: w */
    private boolean m1256w() {
        if (m1246A() && this.f1163a == 1) {
            if (!this.f1169g || this.f1168f.length == 0) {
                int floor = ((int) Math.floor((this.f1167e - this.f1166d) / this.f1165c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1166d + (i10 * this.f1165c));
                }
                this.f1168f = m1248b(iArr);
            }
            this.f1164b = true;
        } else {
            this.f1164b = false;
        }
        return this.f1164b;
    }

    /* renamed from: x */
    private void m1257x(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1168f = m1248b(iArr);
            m1258y();
        }
    }

    /* renamed from: y */
    private boolean m1258y() {
        boolean z10 = this.f1168f.length > 0;
        this.f1169g = z10;
        if (z10) {
            this.f1163a = 1;
            this.f1166d = r0[0];
            this.f1167e = r0[r1 - 1];
            this.f1165c = -1.0f;
        }
        return z10;
    }

    /* renamed from: z */
    private boolean m1259z(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1171i.getText();
        TransformationMethod transformationMethod = this.f1171i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1171i)) != null) {
            text = transformation;
        }
        int maxLines = this.f1171i.getMaxLines();
        m1267n(i10);
        StaticLayout m1261d = m1261d(text, (Layout.Alignment) m1254o(this.f1171i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (m1261d.getLineCount() <= maxLines && m1261d.getLineEnd(m1261d.getLineCount() - 1) == text.length())) && ((float) m1261d.getHeight()) <= rectF.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1260a() {
        if (m1268p()) {
            if (this.f1164b) {
                if (this.f1171i.getMeasuredHeight() <= 0 || this.f1171i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1173k.mo1275b(this.f1171i) ? 1048576 : (this.f1171i.getMeasuredWidth() - this.f1171i.getTotalPaddingLeft()) - this.f1171i.getTotalPaddingRight();
                int height = (this.f1171i.getHeight() - this.f1171i.getCompoundPaddingBottom()) - this.f1171i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1160l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m1252g = m1252g(rectF);
                    if (m1252g != this.f1171i.getTextSize()) {
                        m1273v(0, m1252g);
                    }
                }
            }
            this.f1164b = true;
        }
    }

    /* renamed from: d */
    StaticLayout m1261d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            return m1250e(charSequence, alignment, i10, i11);
        }
        return m1251f(charSequence, alignment, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m1262h() {
        return Math.round(this.f1167e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m1263i() {
        return Math.round(this.f1166d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m1264j() {
        return Math.round(this.f1165c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] m1265k() {
        return this.f1168f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m1266l() {
        return this.f1163a;
    }

    /* renamed from: n */
    void m1267n(int i10) {
        TextPaint textPaint = this.f1170h;
        if (textPaint == null) {
            this.f1170h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1170h.set(this.f1171i.getPaint());
        this.f1170h.setTextSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m1268p() {
        return m1246A() && this.f1163a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1269q(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1172j;
        int[] iArr = C2957j.f12518k0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1171i;
        C0690v.m3849o0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = C2957j.f12543p0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1163a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = C2957j.f12538o0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = C2957j.f12528m0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = C2957j.f12523l0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = C2957j.f12533n0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1257x(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (m1246A()) {
            if (this.f1163a == 1) {
                if (!this.f1169g) {
                    DisplayMetrics displayMetrics = this.f1172j.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    m1247B(dimension2, dimension3, dimension);
                }
                m1256w();
                return;
            }
            return;
        }
        this.f1163a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m1270r(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (m1246A()) {
            DisplayMetrics displayMetrics = this.f1172j.getResources().getDisplayMetrics();
            m1247B(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (m1256w()) {
                m1260a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m1271s(int[] iArr, int i10) throws IllegalArgumentException {
        if (m1246A()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1172j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1168f = m1248b(iArr2);
                if (!m1258y()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1169g = false;
            }
            if (m1256w()) {
                m1260a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m1272t(int i10) {
        if (m1246A()) {
            if (i10 == 0) {
                m1249c();
                return;
            }
            if (i10 == 1) {
                DisplayMetrics displayMetrics = this.f1172j.getResources().getDisplayMetrics();
                m1247B(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (m1256w()) {
                    m1260a();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m1273v(int i10, float f10) {
        Resources resources;
        Context context = this.f1172j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m1255u(TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics()));
    }
}
