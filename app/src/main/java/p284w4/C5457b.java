package p284w4;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.C0601a;

/* renamed from: w4.b */
/* loaded from: classes.dex */
public class C5457b {

    /* renamed from: a */
    public static final boolean f20338a = true;

    /* renamed from: b */
    private static final int[] f20339b = {R.attr.state_pressed};

    /* renamed from: c */
    private static final int[] f20340c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d */
    private static final int[] f20341d = {R.attr.state_focused};

    /* renamed from: e */
    private static final int[] f20342e = {R.attr.state_hovered};

    /* renamed from: f */
    private static final int[] f20343f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g */
    private static final int[] f20344g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h */
    private static final int[] f20345h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i */
    private static final int[] f20346i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j */
    private static final int[] f20347j = {R.attr.state_selected};

    /* renamed from: k */
    private static final int[] f20348k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l */
    static final String f20349l = C5457b.class.getSimpleName();

    private C5457b() {
    }

    /* renamed from: a */
    public static ColorStateList m20044a(ColorStateList colorStateList) {
        if (f20338a) {
            return new ColorStateList(new int[][]{f20347j, StateSet.NOTHING}, new int[]{m20046c(colorStateList, f20343f), m20046c(colorStateList, f20339b)});
        }
        int[] iArr = f20343f;
        int[] iArr2 = f20344g;
        int[] iArr3 = f20345h;
        int[] iArr4 = f20346i;
        int[] iArr5 = f20339b;
        int[] iArr6 = f20340c;
        int[] iArr7 = f20341d;
        int[] iArr8 = f20342e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f20347j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m20046c(colorStateList, iArr), m20046c(colorStateList, iArr2), m20046c(colorStateList, iArr3), m20046c(colorStateList, iArr4), 0, m20046c(colorStateList, iArr5), m20046c(colorStateList, iArr6), m20046c(colorStateList, iArr7), m20046c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m20045b(int i10) {
        return C0601a.m3180f(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    /* renamed from: c */
    private static int m20046c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f20338a ? m20045b(colorForState) : colorForState;
    }

    /* renamed from: d */
    public static ColorStateList m20047d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f20348k, 0)) != 0) {
                Log.w(f20349l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: e */
    public static boolean m20048e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
