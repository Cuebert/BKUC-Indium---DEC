package qa;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import qa.AbstractC4364y;
import qa.C4359t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.z */
/* loaded from: classes.dex */
public class C4365z extends AbstractC4364y {

    /* renamed from: a */
    private final Context f17836a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4365z(Context context) {
        this.f17836a = context;
    }

    /* renamed from: j */
    private static Bitmap m18056j(Resources resources, int i10, C4362w c4362w) {
        BitmapFactory.Options m18050d = AbstractC4364y.m18050d(c4362w);
        if (AbstractC4364y.m18051g(m18050d)) {
            BitmapFactory.decodeResource(resources, i10, m18050d);
            AbstractC4364y.m18049b(c4362w.f17793h, c4362w.f17794i, m18050d, c4362w);
        }
        return BitmapFactory.decodeResource(resources, i10, m18050d);
    }

    @Override // qa.AbstractC4364y
    /* renamed from: c */
    public boolean mo17891c(C4362w c4362w) {
        if (c4362w.f17790e != 0) {
            return true;
        }
        return "android.resource".equals(c4362w.f17789d.getScheme());
    }

    @Override // qa.AbstractC4364y
    /* renamed from: f */
    public AbstractC4364y.a mo17892f(C4362w c4362w, int i10) throws IOException {
        Resources m17944o = C4346g0.m17944o(this.f17836a, c4362w);
        return new AbstractC4364y.a(m18056j(m17944o, C4346g0.m17943n(m17944o, c4362w), c4362w), C4359t.e.DISK);
    }
}
