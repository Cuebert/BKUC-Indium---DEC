package p255u;

import p242t.C4569d;
import p279w.C5095y1;

/* renamed from: u.l */
/* loaded from: classes.dex */
public class C4768l {

    /* renamed from: a */
    private final boolean f18618a;

    /* renamed from: b */
    private boolean f18619b = false;

    public C4768l(C5095y1 c5095y1) {
        this.f18618a = c5095y1.m19725b(C4569d.class) != null;
    }

    /* renamed from: a */
    public void m18948a() {
        this.f18619b = false;
    }

    /* renamed from: b */
    public void m18949b() {
        this.f18619b = true;
    }

    /* renamed from: c */
    public boolean m18950c(int i10) {
        return this.f18619b && i10 == 0 && this.f18618a;
    }
}
