package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C0690v;
import p039d.C2957j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public class C0250c {

    /* renamed from: a */
    private final View f1113a;

    /* renamed from: d */
    private TintInfo f1116d;

    /* renamed from: e */
    private TintInfo f1117e;

    /* renamed from: f */
    private TintInfo f1118f;

    /* renamed from: c */
    private int f1115c = -1;

    /* renamed from: b */
    private final AppCompatDrawableManager f1114b = AppCompatDrawableManager.get();

    public C0250c(View view) {
        this.f1113a = view;
    }

    /* renamed from: a */
    private boolean m1174a(Drawable drawable) {
        if (this.f1118f == null) {
            this.f1118f = new TintInfo();
        }
        TintInfo tintInfo = this.f1118f;
        tintInfo.clear();
        ColorStateList m3860u = C0690v.m3860u(this.f1113a);
        if (m3860u != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = m3860u;
        }
        PorterDuff.Mode m3862v = C0690v.m3862v(this.f1113a);
        if (m3862v != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = m3862v;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.f1113a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1175k() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f1116d != null : i10 == 21;
    }

    /* renamed from: b */
    public void m1176b() {
        Drawable background = this.f1113a.getBackground();
        if (background != null) {
            if (m1175k() && m1174a(background)) {
                return;
            }
            TintInfo tintInfo = this.f1117e;
            if (tintInfo != null) {
                AppCompatDrawableManager.tintDrawable(background, tintInfo, this.f1113a.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.f1116d;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.tintDrawable(background, tintInfo2, this.f1113a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m1177c() {
        TintInfo tintInfo = this.f1117e;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m1178d() {
        TintInfo tintInfo = this.f1117e;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    /* renamed from: e */
    public void m1179e(AttributeSet attributeSet, int i10) {
        Context context = this.f1113a.getContext();
        int[] iArr = C2957j.f12435T3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        View view = this.f1113a;
        C0690v.m3849o0(view, view.getContext(), iArr, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            int i11 = C2957j.f12440U3;
            if (obtainStyledAttributes.hasValue(i11)) {
                this.f1115c = obtainStyledAttributes.getResourceId(i11, -1);
                ColorStateList tintList = this.f1114b.getTintList(this.f1113a.getContext(), this.f1115c);
                if (tintList != null) {
                    m1182h(tintList);
                }
            }
            int i12 = C2957j.f12445V3;
            if (obtainStyledAttributes.hasValue(i12)) {
                C0690v.m3861u0(this.f1113a, obtainStyledAttributes.getColorStateList(i12));
            }
            int i13 = C2957j.f12450W3;
            if (obtainStyledAttributes.hasValue(i13)) {
                C0690v.m3863v0(this.f1113a, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(i13, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: f */
    public void m1180f(Drawable drawable) {
        this.f1115c = -1;
        m1182h(null);
        m1176b();
    }

    /* renamed from: g */
    public void m1181g(int i10) {
        this.f1115c = i10;
        AppCompatDrawableManager appCompatDrawableManager = this.f1114b;
        m1182h(appCompatDrawableManager != null ? appCompatDrawableManager.getTintList(this.f1113a.getContext(), i10) : null);
        m1176b();
    }

    /* renamed from: h */
    void m1182h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1116d == null) {
                this.f1116d = new TintInfo();
            }
            TintInfo tintInfo = this.f1116d;
            tintInfo.mTintList = colorStateList;
            tintInfo.mHasTintList = true;
        } else {
            this.f1116d = null;
        }
        m1176b();
    }

    /* renamed from: i */
    public void m1183i(ColorStateList colorStateList) {
        if (this.f1117e == null) {
            this.f1117e = new TintInfo();
        }
        TintInfo tintInfo = this.f1117e;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = true;
        m1176b();
    }

    /* renamed from: j */
    public void m1184j(PorterDuff.Mode mode) {
        if (this.f1117e == null) {
            this.f1117e = new TintInfo();
        }
        TintInfo tintInfo = this.f1117e;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = true;
        m1176b();
    }
}
