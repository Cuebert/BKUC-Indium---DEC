package p272v4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;
import p066f.C3121a;

/* renamed from: v4.c */
/* loaded from: classes.dex */
public class C4981c {
    /* renamed from: a */
    public static ColorStateList m19404a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList m13769c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (m13769c = C3121a.m13769c(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : m13769c;
    }

    /* renamed from: b */
    public static ColorStateList m19405b(Context context, TintTypedArray tintTypedArray, int i10) {
        int resourceId;
        ColorStateList m13769c;
        return (!tintTypedArray.hasValue(i10) || (resourceId = tintTypedArray.getResourceId(i10, 0)) == 0 || (m13769c = C3121a.m13769c(context, resourceId)) == null) ? tintTypedArray.getColorStateList(i10) : m13769c;
    }

    /* renamed from: c */
    public static int m19406c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i10, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i10, i11);
    }

    /* renamed from: d */
    public static Drawable m19407d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable m13770d;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (m13770d = C3121a.m13770d(context, resourceId)) == null) ? typedArray.getDrawable(i10) : m13770d;
    }

    /* renamed from: e */
    public static int m19408e(TypedArray typedArray, int i10, int i11) {
        return typedArray.hasValue(i10) ? i10 : i11;
    }

    /* renamed from: f */
    public static C4982d m19409f(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new C4982d(context, resourceId);
    }

    /* renamed from: g */
    public static boolean m19410g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: h */
    public static boolean m19411h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
