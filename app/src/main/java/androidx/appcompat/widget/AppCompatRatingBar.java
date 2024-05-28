package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p039d.C2948a;

/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {
    private final C0254g mAppCompatProgressBarHelper;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap m1199b = this.mAppCompatProgressBarHelper.m1199b();
        if (m1199b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m1199b.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2948a.f12141J);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        C0254g c0254g = new C0254g(this);
        this.mAppCompatProgressBarHelper = c0254g;
        c0254g.mo1200c(attributeSet, i10);
    }
}
