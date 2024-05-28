package p125j4;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: j4.f */
/* loaded from: classes.dex */
public class C3605f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f15232a;

    public C3605f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f15232a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f15232a.set(imageView.getImageMatrix());
        return this.f15232a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
