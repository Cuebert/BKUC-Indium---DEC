package p255u;

import android.util.Size;
import androidx.camera.core.impl.utils.C0423c;
import java.util.ArrayList;
import java.util.Comparator;
import p242t.C4577l;
import p242t.C4590y;

/* renamed from: u.p */
/* loaded from: classes.dex */
public class C4772p {

    /* renamed from: b */
    private static final Size f18622b = new Size(320, 240);

    /* renamed from: c */
    private static final Comparator<Size> f18623c = new C0423c();

    /* renamed from: a */
    private final C4590y f18624a = (C4590y) C4577l.m18665a(C4590y.class);

    /* renamed from: a */
    public Size[] m18954a(Size[] sizeArr) {
        if (this.f18624a == null || !C4590y.m18696a()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f18623c.compare(size, f18622b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
