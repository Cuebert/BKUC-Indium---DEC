package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.C0544b c0544b = (ConstraintLayout.C0544b) getLayoutParams();
        c0544b.f2463a = i10;
        setLayoutParams(c0544b);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.C0544b c0544b = (ConstraintLayout.C0544b) getLayoutParams();
        c0544b.f2465b = i10;
        setLayoutParams(c0544b);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.C0544b c0544b = (ConstraintLayout.C0544b) getLayoutParams();
        c0544b.f2467c = f10;
        setLayoutParams(c0544b);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
