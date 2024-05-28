package qa;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import qa.C4359t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.d0 */
/* loaded from: classes.dex */
public final class C4340d0 extends AbstractC4333a<InterfaceC4338c0> {
    public C4340d0(C4359t c4359t, InterfaceC4338c0 interfaceC4338c0, C4362w c4362w, int i10, int i11, Drawable drawable, String str, Object obj, int i12) {
        super(c4359t, interfaceC4338c0, c4362w, i10, i11, i12, drawable, str, obj, false);
    }

    @Override // qa.AbstractC4333a
    /* renamed from: b */
    public void mo17865b(Bitmap bitmap, C4359t.e eVar) {
        if (bitmap != null) {
            InterfaceC4338c0 m17874k = m17874k();
            if (m17874k != null) {
                m17874k.mo16001c(bitmap, eVar);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // qa.AbstractC4333a
    /* renamed from: c */
    public void mo17866c() {
        InterfaceC4338c0 m17874k = m17874k();
        if (m17874k != null) {
            if (this.f17597g != 0) {
                m17874k.mo15999a(this.f17591a.f17741e.getResources().getDrawable(this.f17597g));
            } else {
                m17874k.mo15999a(this.f17598h);
            }
        }
    }
}
