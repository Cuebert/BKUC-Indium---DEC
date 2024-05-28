package p255u;

import android.util.Size;
import p242t.C4577l;
import p242t.C4580o;
import p279w.AbstractC5035h2;

/* renamed from: u.j */
/* loaded from: classes.dex */
public class C4766j {

    /* renamed from: a */
    private final C4580o f18616a;

    public C4766j() {
        this((C4580o) C4577l.m18665a(C4580o.class));
    }

    /* renamed from: a */
    public Size m18947a(Size size) {
        Size m18678a;
        C4580o c4580o = this.f18616a;
        if (c4580o == null || (m18678a = c4580o.m18678a(AbstractC5035h2.b.PRIV)) == null) {
            return size;
        }
        return m18678a.getWidth() * m18678a.getHeight() > size.getWidth() * size.getHeight() ? m18678a : size;
    }

    C4766j(C4580o c4580o) {
        this.f18616a = c4580o;
    }
}
