package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
class C0920o {

    /* renamed from: a */
    final b f4809a;

    /* renamed from: b */
    a f4810b = new a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        int f4811a = 0;

        /* renamed from: b */
        int f4812b;

        /* renamed from: c */
        int f4813c;

        /* renamed from: d */
        int f4814d;

        /* renamed from: e */
        int f4815e;

        a() {
        }

        /* renamed from: a */
        void m5865a(int i10) {
            this.f4811a = i10 | this.f4811a;
        }

        /* renamed from: b */
        boolean m5866b() {
            int i10 = this.f4811a;
            if ((i10 & 7) != 0 && (i10 & (m5867c(this.f4814d, this.f4812b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f4811a;
            if ((i11 & 112) != 0 && (i11 & (m5867c(this.f4814d, this.f4813c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f4811a;
            if ((i12 & 1792) != 0 && (i12 & (m5867c(this.f4815e, this.f4812b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f4811a;
            return (i13 & 28672) == 0 || (i13 & (m5867c(this.f4815e, this.f4813c) << 12)) != 0;
        }

        /* renamed from: c */
        int m5867c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* renamed from: d */
        void m5868d() {
            this.f4811a = 0;
        }

        /* renamed from: e */
        void m5869e(int i10, int i11, int i12, int i13) {
            this.f4812b = i10;
            this.f4813c = i11;
            this.f4814d = i12;
            this.f4815e = i13;
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    /* loaded from: classes.dex */
    interface b {
        /* renamed from: a */
        View mo5485a(int i10);

        /* renamed from: b */
        int mo5486b();

        /* renamed from: c */
        int mo5487c(View view);

        /* renamed from: d */
        int mo5488d();

        /* renamed from: e */
        int mo5489e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0920o(b bVar) {
        this.f4809a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m5863a(int i10, int i11, int i12, int i13) {
        int mo5488d = this.f4809a.mo5488d();
        int mo5486b = this.f4809a.mo5486b();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View mo5485a = this.f4809a.mo5485a(i10);
            this.f4810b.m5869e(mo5488d, mo5486b, this.f4809a.mo5487c(mo5485a), this.f4809a.mo5489e(mo5485a));
            if (i12 != 0) {
                this.f4810b.m5868d();
                this.f4810b.m5865a(i12);
                if (this.f4810b.m5866b()) {
                    return mo5485a;
                }
            }
            if (i13 != 0) {
                this.f4810b.m5868d();
                this.f4810b.m5865a(i13);
                if (this.f4810b.m5866b()) {
                    view = mo5485a;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m5864b(View view, int i10) {
        this.f4810b.m5869e(this.f4809a.mo5488d(), this.f4809a.mo5486b(), this.f4809a.mo5487c(view), this.f4809a.mo5489e(view));
        if (i10 == 0) {
            return false;
        }
        this.f4810b.m5868d();
        this.f4810b.m5865a(i10);
        return this.f4810b.m5866b();
    }
}
