package p151l4;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.C0701c;
import p111i4.C3520b;
import p111i4.C3529k;
import p186o4.C4133a;

/* renamed from: l4.a */
/* loaded from: classes.dex */
public class C3873a extends AppCompatCheckBox {

    /* renamed from: p */
    private static final int f16111p = C3529k.f14707q;

    /* renamed from: q */
    private static final int[][] f16112q = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: n */
    private ColorStateList f16113n;

    /* renamed from: o */
    private boolean f16114o;

    public C3873a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14518d);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f16113n == null) {
            int[][] iArr = f16112q;
            int[] iArr2 = new int[iArr.length];
            int m17130c = C4133a.m17130c(this, C3520b.f14521g);
            int m17130c2 = C4133a.m17130c(this, C3520b.f14526l);
            int m17130c3 = C4133a.m17130c(this, C3520b.f14523i);
            iArr2[0] = C4133a.m17133f(m17130c2, m17130c, 1.0f);
            iArr2[1] = C4133a.m17133f(m17130c2, m17130c3, 0.54f);
            iArr2[2] = C4133a.m17133f(m17130c2, m17130c3, 0.38f);
            iArr2[3] = C4133a.m17133f(m17130c2, m17130c3, 0.38f);
            this.f16113n = new ColorStateList(iArr, iArr2);
        }
        return this.f16113n;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16114o && C0701c.m4126b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f16114o = z10;
        if (z10) {
            C0701c.m4127c(this, getMaterialThemeColorsTintList());
        } else {
            C0701c.m4127c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3873a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = p151l4.C3873a.f16111p
            android.content.Context r8 = p323z4.C6011a.m21324c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p111i4.C3530l.f14852S2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C2487j.m11374h(r0, r1, r2, r3, r4, r5)
            int r10 = p111i4.C3530l.f14859T2
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = p272v4.C4981c.m19404a(r8, r9, r10)
            androidx.core.widget.C0701c.m4127c(r7, r8)
        L28:
            int r8 = p111i4.C3530l.f14866U2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f16114o = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p151l4.C3873a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
