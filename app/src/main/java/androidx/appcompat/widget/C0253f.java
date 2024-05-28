package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0706h;
import p039d.C2957j;

/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
class C0253f extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1125b = false;

    /* renamed from: a */
    private boolean f1126a;

    public C0253f(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        m1194a(context, attributeSet, i10, i11);
    }

    /* renamed from: a */
    private void m1194a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C2957j.f12485d2, i10, i11);
        int i12 = C2957j.f12495f2;
        if (obtainStyledAttributes.hasValue(i12)) {
            m1195b(obtainStyledAttributes.getBoolean(i12, false));
        }
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(C2957j.f12490e2));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m1195b(boolean z10) {
        if (f1125b) {
            this.f1126a = z10;
        } else {
            C0706h.m4154a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1125b && this.f1126a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1125b && this.f1126a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1125b && this.f1126a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
