package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.core.AbstractC0479u1;
import androidx.camera.core.impl.utils.C0432l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.l */
/* loaded from: classes.dex */
public class C0525l extends AbstractC0479u1 {

    /* renamed from: d */
    static final PointF f2335d = new PointF(2.0f, 2.0f);

    /* renamed from: b */
    private final C0519f f2336b;

    /* renamed from: c */
    private Matrix f2337c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0525l(C0519f c0519f) {
        this.f2336b = c0519f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2454a(Size size, int i10) {
        C0432l.m2119a();
        synchronized (this) {
            if (size.getWidth() != 0 && size.getHeight() != 0) {
                this.f2337c = this.f2336b.m2433c(size, i10);
                return;
            }
            this.f2337c = null;
        }
    }
}
