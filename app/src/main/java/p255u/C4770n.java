package p255u;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p242t.C4577l;
import p242t.C4580o;
import p279w.AbstractC5035h2;

/* renamed from: u.n */
/* loaded from: classes.dex */
public class C4770n {

    /* renamed from: a */
    private final C4580o f18620a;

    public C4770n() {
        this((C4580o) C4577l.m18665a(C4580o.class));
    }

    /* renamed from: a */
    public List<Size> m18952a(AbstractC5035h2.b bVar, List<Size> list) {
        Size m18678a;
        C4580o c4580o = this.f18620a;
        if (c4580o == null || (m18678a = c4580o.m18678a(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m18678a);
        for (Size size : list) {
            if (!size.equals(m18678a)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    C4770n(C4580o c4580o) {
        this.f18620a = c4580o;
    }
}
