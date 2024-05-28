package qa;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import java.io.IOException;
import qa.AbstractC4364y;
import qa.C4359t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.k */
/* loaded from: classes.dex */
public class C4350k extends C4345g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4350k(Context context) {
        super(context);
    }

    /* renamed from: k */
    static int m17985k(Uri uri) throws IOException {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    @Override // qa.C4345g, qa.AbstractC4364y
    /* renamed from: c */
    public boolean mo17891c(C4362w c4362w) {
        return "file".equals(c4362w.f17789d.getScheme());
    }

    @Override // qa.C4345g, qa.AbstractC4364y
    /* renamed from: f */
    public AbstractC4364y.a mo17892f(C4362w c4362w, int i10) throws IOException {
        return new AbstractC4364y.a(null, m17929j(c4362w), C4359t.e.DISK, m17985k(c4362w.f17789d));
    }
}
