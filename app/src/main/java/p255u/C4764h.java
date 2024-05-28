package p255u;

import androidx.camera.core.C0463q1;
import java.util.Iterator;
import java.util.List;
import p242t.C4564a0;
import p242t.C4575j;
import p242t.C4588w;
import p279w.AbstractC5073r0;
import p279w.C5095y1;

/* renamed from: u.h */
/* loaded from: classes.dex */
public class C4764h {

    /* renamed from: a */
    private final boolean f18613a;

    /* renamed from: b */
    private final boolean f18614b;

    /* renamed from: c */
    private final boolean f18615c;

    public C4764h(C5095y1 c5095y1, C5095y1 c5095y12) {
        this.f18613a = c5095y12.m19724a(C4564a0.class);
        this.f18614b = c5095y1.m19724a(C4588w.class);
        this.f18615c = c5095y1.m19724a(C4575j.class);
    }

    /* renamed from: a */
    public void m18944a(List<AbstractC5073r0> list) {
        if (!m18945b() || list == null) {
            return;
        }
        Iterator<AbstractC5073r0> it = list.iterator();
        while (it.hasNext()) {
            it.next().m19676c();
        }
        C0463q1.m2202a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    /* renamed from: b */
    public boolean m18945b() {
        return this.f18613a || this.f18614b || this.f18615c;
    }
}
