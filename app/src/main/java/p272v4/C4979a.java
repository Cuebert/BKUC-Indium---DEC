package p272v4;

import android.graphics.Typeface;

/* renamed from: v4.a */
/* loaded from: classes.dex */
public final class C4979a extends AbstractC4984f {

    /* renamed from: a */
    private final Typeface f19052a;

    /* renamed from: b */
    private final a f19053b;

    /* renamed from: c */
    private boolean f19054c;

    /* renamed from: v4.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo11338a(Typeface typeface);
    }

    public C4979a(a aVar, Typeface typeface) {
        this.f19052a = typeface;
        this.f19053b = aVar;
    }

    /* renamed from: d */
    private void m19398d(Typeface typeface) {
        if (this.f19054c) {
            return;
        }
        this.f19053b.mo11338a(typeface);
    }

    @Override // p272v4.AbstractC4984f
    /* renamed from: a */
    public void mo10834a(int i10) {
        m19398d(this.f19052a);
    }

    @Override // p272v4.AbstractC4984f
    /* renamed from: b */
    public void mo10835b(Typeface typeface, boolean z10) {
        m19398d(typeface);
    }

    /* renamed from: c */
    public void m19399c() {
        this.f19054c = true;
    }
}
