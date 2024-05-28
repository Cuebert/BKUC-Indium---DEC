package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.os.C0632k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public final class RunnableC0910e implements Runnable {

    /* renamed from: r */
    static final ThreadLocal<RunnableC0910e> f4760r = new ThreadLocal<>();

    /* renamed from: s */
    static Comparator<c> f4761s = new a();

    /* renamed from: o */
    long f4763o;

    /* renamed from: p */
    long f4764p;

    /* renamed from: n */
    ArrayList<RecyclerView> f4762n = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<c> f4765q = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes.dex */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4773d;
            if ((recyclerView == null) != (cVar2.f4773d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f4770a;
            if (z10 != cVar2.f4770a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f4771b - cVar.f4771b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f4772c - cVar2.f4772c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.AbstractC0889p.c {

        /* renamed from: a */
        int f4766a;

        /* renamed from: b */
        int f4767b;

        /* renamed from: c */
        int[] f4768c;

        /* renamed from: d */
        int f4769d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p.c
        /* renamed from: a */
        public void mo5490a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 >= 0) {
                int i12 = this.f4769d * 2;
                int[] iArr = this.f4768c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4768c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i12 * 2];
                    this.f4768c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4768c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f4769d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m5781b() {
            int[] iArr = this.f4768c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4769d = 0;
        }

        /* renamed from: c */
        void m5782c(RecyclerView recyclerView, boolean z10) {
            this.f4769d = 0;
            int[] iArr = this.f4768c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0889p abstractC0889p = recyclerView.f4471z;
            if (recyclerView.f4469y == null || abstractC0889p == null || !abstractC0889p.m5475u0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f4453q.m5702p()) {
                    abstractC0889p.mo5095p(recyclerView.f4469y.mo5328d(), this);
                }
            } else if (!recyclerView.m5215k0()) {
                abstractC0889p.mo5094o(this.f4766a, this.f4767b, recyclerView.f4464v0, this);
            }
            int i10 = this.f4769d;
            if (i10 > abstractC0889p.f4554m) {
                abstractC0889p.f4554m = i10;
                abstractC0889p.f4555n = z10;
                recyclerView.f4449o.m5528K();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean m5783d(int i10) {
            if (this.f4768c != null) {
                int i11 = this.f4769d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f4768c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m5784e(int i10, int i11) {
            this.f4766a = i10;
            this.f4767b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f4770a;

        /* renamed from: b */
        public int f4771b;

        /* renamed from: c */
        public int f4772c;

        /* renamed from: d */
        public RecyclerView f4773d;

        /* renamed from: e */
        public int f4774e;

        c() {
        }

        /* renamed from: a */
        public void m5785a() {
            this.f4770a = false;
            this.f4771b = 0;
            this.f4772c = 0;
            this.f4773d = null;
            this.f4774e = 0;
        }
    }

    /* renamed from: b */
    private void m5770b() {
        c cVar;
        int size = this.f4762n.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f4762n.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4462u0.m5782c(recyclerView, false);
                i10 += recyclerView.f4462u0.f4769d;
            }
        }
        this.f4765q.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f4762n.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f4462u0;
                int abs = Math.abs(bVar.f4766a) + Math.abs(bVar.f4767b);
                for (int i14 = 0; i14 < bVar.f4769d * 2; i14 += 2) {
                    if (i12 >= this.f4765q.size()) {
                        cVar = new c();
                        this.f4765q.add(cVar);
                    } else {
                        cVar = this.f4765q.get(i12);
                    }
                    int[] iArr = bVar.f4768c;
                    int i15 = iArr[i14 + 1];
                    cVar.f4770a = i15 <= abs;
                    cVar.f4771b = abs;
                    cVar.f4772c = i15;
                    cVar.f4773d = recyclerView2;
                    cVar.f4774e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f4765q, f4761s);
    }

    /* renamed from: c */
    private void m5771c(c cVar, long j10) {
        RecyclerView.AbstractC0877d0 m5775i = m5775i(cVar.f4773d, cVar.f4774e, cVar.f4770a ? Long.MAX_VALUE : j10);
        if (m5775i == null || m5775i.f4503b == null || !m5775i.m5297s() || m5775i.m5298t()) {
            return;
        }
        m5774h(m5775i.f4503b.get(), j10);
    }

    /* renamed from: d */
    private void m5772d(long j10) {
        for (int i10 = 0; i10 < this.f4765q.size(); i10++) {
            c cVar = this.f4765q.get(i10);
            if (cVar.f4773d == null) {
                return;
            }
            m5771c(cVar, j10);
            cVar.m5785a();
        }
    }

    /* renamed from: e */
    static boolean m5773e(RecyclerView recyclerView, int i10) {
        int m5719j = recyclerView.f4455r.m5719j();
        for (int i11 = 0; i11 < m5719j; i11++) {
            RecyclerView.AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(recyclerView.f4455r.m5718i(i11));
            if (m5142e0.f4504c == i10 && !m5142e0.m5298t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m5774h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f4428R && recyclerView.f4455r.m5719j() != 0) {
            recyclerView.m5188T0();
        }
        b bVar = recyclerView.f4462u0;
        bVar.m5782c(recyclerView, true);
        if (bVar.f4769d != 0) {
            try {
                C0632k.m3360a("RV Nested Prefetch");
                recyclerView.f4464v0.m5255f(recyclerView.f4469y);
                for (int i10 = 0; i10 < bVar.f4769d * 2; i10 += 2) {
                    m5775i(recyclerView, bVar.f4768c[i10], j10);
                }
            } finally {
                C0632k.m3361b();
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.AbstractC0877d0 m5775i(RecyclerView recyclerView, int i10, long j10) {
        if (m5773e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.C0896w c0896w = recyclerView.f4449o;
        try {
            recyclerView.m5169F0();
            RecyclerView.AbstractC0877d0 m5526I = c0896w.m5526I(i10, false, j10);
            if (m5526I != null) {
                if (m5526I.m5297s() && !m5526I.m5298t()) {
                    c0896w.m5520B(m5526I.f4502a);
                } else {
                    c0896w.m5531a(m5526I, false);
                }
            }
            return m5526I;
        } finally {
            recyclerView.m5173H0(false);
        }
    }

    /* renamed from: a */
    public void m5776a(RecyclerView recyclerView) {
        this.f4762n.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m5777f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f4763o == 0) {
            this.f4763o = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4462u0.m5784e(i10, i11);
    }

    /* renamed from: g */
    void m5778g(long j10) {
        m5770b();
        m5772d(j10);
    }

    /* renamed from: j */
    public void m5779j(RecyclerView recyclerView) {
        this.f4762n.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0632k.m3360a("RV Prefetch");
            if (!this.f4762n.isEmpty()) {
                int size = this.f4762n.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f4762n.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    m5778g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f4764p);
                }
            }
        } finally {
            this.f4763o = 0L;
            C0632k.m3361b();
        }
    }
}
