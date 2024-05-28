package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.InterfaceC0611c;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
class C0254g {

    /* renamed from: c */
    private static final int[] f1127c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    private final ProgressBar f1128a;

    /* renamed from: b */
    private Bitmap f1129b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0254g(ProgressBar progressBar) {
        this.f1128a = progressBar;
    }

    /* renamed from: a */
    private Shape m1196a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private Drawable m1197d(Drawable drawable, boolean z10) {
        if (drawable instanceof InterfaceC0611c) {
            InterfaceC0611c interfaceC0611c = (InterfaceC0611c) drawable;
            Drawable mo3281b = interfaceC0611c.mo3281b();
            if (mo3281b != null) {
                interfaceC0611c.mo3280a(m1197d(mo3281b, z10));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id = layerDrawable.getId(i10);
                    drawableArr[i10] = m1197d(layerDrawable.getDrawable(i10), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1129b == null) {
                    this.f1129b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m1196a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m1198e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i10 = 0; i10 < numberOfFrames; i10++) {
            Drawable m1197d = m1197d(animationDrawable.getFrame(i10), true);
            m1197d.setLevel(10000);
            animationDrawable2.addFrame(m1197d, animationDrawable.getDuration(i10));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap m1199b() {
        return this.f1129b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1200c(AttributeSet attributeSet, int i10) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f1128a.getContext(), attributeSet, f1127c, i10, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.f1128a.setIndeterminateDrawable(m1198e(drawableIfKnown));
        }
        Drawable drawableIfKnown2 = obtainStyledAttributes.getDrawableIfKnown(1);
        if (drawableIfKnown2 != null) {
            this.f1128a.setProgressDrawable(m1197d(drawableIfKnown2, false));
        }
        obtainStyledAttributes.recycle();
    }
}
