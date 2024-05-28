package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0690v;
import p111i4.C3524f;
import p111i4.C3530l;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: n */
    private TextView f9671n;

    /* renamed from: o */
    private Button f9672o;

    /* renamed from: p */
    private int f9673p;

    /* renamed from: q */
    private int f9674q;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f14926c4);
        this.f9673p = obtainStyledAttributes.getDimensionPixelSize(C3530l.f14934d4, -1);
        this.f9674q = obtainStyledAttributes.getDimensionPixelSize(C3530l.f14990k4, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static void m11386a(View view, int i10, int i11) {
        if (C0690v.m3816W(view)) {
            C0690v.m3788C0(view, C0690v.m3801J(view), i10, C0690v.m3799I(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    /* renamed from: b */
    private boolean m11387b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9671n.getPaddingTop() == i11 && this.f9671n.getPaddingBottom() == i12) {
            return z10;
        }
        m11386a(this.f9671n, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f9672o;
    }

    public TextView getMessageView() {
        return this.f9671n;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f9671n = (TextView) findViewById(C3524f.f14615I);
        this.f9672o = (Button) findViewById(C3524f.f14614H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (m11387b(1, r0, r0 - r1) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (m11387b(0, r0, r0) != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f9673p
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f9673p
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p111i4.C3522d.f14580g
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p111i4.C3522d.f14579f
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f9671n
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f9674q
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f9672o
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f9674q
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.m11387b(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.m11387b(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f9674q = i10;
    }
}
