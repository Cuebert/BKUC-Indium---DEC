package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0690v;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p111i4.C3519a;
import p125j4.C3607h;
import p125j4.C3609j;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f10071i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m11778g0(View view, boolean z10) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f10071i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0562f) && (((CoordinatorLayout.C0562f) childAt.getLayoutParams()).m2696f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    if (!z10) {
                        Map<View, Integer> map = this.f10071i;
                        if (map != null && map.containsKey(childAt)) {
                            C0690v.m3871z0(childAt, this.f10071i.get(childAt).intValue());
                        }
                    } else {
                        this.f10071i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C0690v.m3871z0(childAt, 4);
                    }
                }
            }
            if (z10) {
                return;
            }
            this.f10071i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo11752H(View view, View view2, boolean z10, boolean z11) {
        m11778g0(view2, z10);
        return super.mo11752H(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: e0 */
    protected FabTransformationBehavior.C2551e mo11776e0(Context context, boolean z10) {
        int i10;
        if (z10) {
            i10 = C3519a.f14507d;
        } else {
            i10 = C3519a.f14506c;
        }
        FabTransformationBehavior.C2551e c2551e = new FabTransformationBehavior.C2551e();
        c2551e.f10064a = C3607h.m15431c(context, i10);
        c2551e.f10065b = new C3609j(17, 0.0f, 0.0f);
        return c2551e;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
