package qa;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import qa.C4359t;

/* renamed from: qa.l */
/* loaded from: classes.dex */
public class C4351l extends AbstractC4333a<ImageView> {

    /* renamed from: m */
    InterfaceC4341e f17702m;

    public C4351l(C4359t c4359t, ImageView imageView, C4362w c4362w, int i10, int i11, int i12, Drawable drawable, String str, Object obj, InterfaceC4341e interfaceC4341e, boolean z10) {
        super(c4359t, imageView, c4362w, i10, i11, i12, drawable, str, obj, z10);
        this.f17702m = interfaceC4341e;
    }

    @Override // qa.AbstractC4333a
    /* renamed from: a */
    public void mo17864a() {
        super.mo17864a();
        if (this.f17702m != null) {
            this.f17702m = null;
        }
    }

    @Override // qa.AbstractC4333a
    /* renamed from: b */
    public void mo17865b(Bitmap bitmap, C4359t.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f17593c.get();
            if (imageView == null) {
                return;
            }
            C4359t c4359t = this.f17591a;
            C4360u.m18023c(imageView, c4359t.f17741e, bitmap, eVar, this.f17594d, c4359t.f17749m);
            InterfaceC4341e interfaceC4341e = this.f17702m;
            if (interfaceC4341e != null) {
                interfaceC4341e.onSuccess();
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // qa.AbstractC4333a
    /* renamed from: c */
    public void mo17866c() {
        ImageView imageView = (ImageView) this.f17593c.get();
        if (imageView == null) {
            return;
        }
        int i10 = this.f17597g;
        if (i10 != 0) {
            imageView.setImageResource(i10);
        } else {
            Drawable drawable = this.f17598h;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        InterfaceC4341e interfaceC4341e = this.f17702m;
        if (interfaceC4341e != null) {
            interfaceC4341e.mo15170a();
        }
    }
}
