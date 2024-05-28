package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p181o.C4107a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: n */
    private final int f1225n;

    /* renamed from: o */
    private final int f1226o;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1225n = getResources().getDimensionPixelOffset(C4107a.f16674b);
        this.f1226o = getResources().getDimensionPixelOffset(C4107a.f16673a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1225n * 2), this.f1226o), 1073741824), i11);
    }
}
