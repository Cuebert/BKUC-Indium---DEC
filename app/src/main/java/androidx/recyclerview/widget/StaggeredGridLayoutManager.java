package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0889p implements RecyclerView.AbstractC0899z.b {

    /* renamed from: B */
    private BitSet f4601B;

    /* renamed from: G */
    private boolean f4606G;

    /* renamed from: H */
    private boolean f4607H;

    /* renamed from: I */
    private SavedState f4608I;

    /* renamed from: J */
    private int f4609J;

    /* renamed from: O */
    private int[] f4614O;

    /* renamed from: t */
    C0905d[] f4617t;

    /* renamed from: u */
    AbstractC0914i f4618u;

    /* renamed from: v */
    AbstractC0914i f4619v;

    /* renamed from: w */
    private int f4620w;

    /* renamed from: x */
    private int f4621x;

    /* renamed from: y */
    private final C0911f f4622y;

    /* renamed from: s */
    private int f4616s = -1;

    /* renamed from: z */
    boolean f4623z = false;

    /* renamed from: A */
    boolean f4600A = false;

    /* renamed from: C */
    int f4602C = -1;

    /* renamed from: D */
    int f4603D = Integer.MIN_VALUE;

    /* renamed from: E */
    LazySpanLookup f4604E = new LazySpanLookup();

    /* renamed from: F */
    private int f4605F = 2;

    /* renamed from: K */
    private final Rect f4610K = new Rect();

    /* renamed from: L */
    private final C0903b f4611L = new C0903b();

    /* renamed from: M */
    private boolean f4612M = false;

    /* renamed from: N */
    private boolean f4613N = true;

    /* renamed from: P */
    private final Runnable f4615P = new RunnableC0902a();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0901a();

        /* renamed from: n */
        int f4630n;

        /* renamed from: o */
        int f4631o;

        /* renamed from: p */
        int f4632p;

        /* renamed from: q */
        int[] f4633q;

        /* renamed from: r */
        int f4634r;

        /* renamed from: s */
        int[] f4635s;

        /* renamed from: t */
        List<LazySpanLookup.FullSpanItem> f4636t;

        /* renamed from: u */
        boolean f4637u;

        /* renamed from: v */
        boolean f4638v;

        /* renamed from: w */
        boolean f4639w;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        /* loaded from: classes.dex */
        class C0901a implements Parcelable.Creator<SavedState> {
            C0901a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        /* renamed from: a */
        void m5654a() {
            this.f4633q = null;
            this.f4632p = 0;
            this.f4630n = -1;
            this.f4631o = -1;
        }

        /* renamed from: b */
        void m5655b() {
            this.f4633q = null;
            this.f4632p = 0;
            this.f4634r = 0;
            this.f4635s = null;
            this.f4636t = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4630n);
            parcel.writeInt(this.f4631o);
            parcel.writeInt(this.f4632p);
            if (this.f4632p > 0) {
                parcel.writeIntArray(this.f4633q);
            }
            parcel.writeInt(this.f4634r);
            if (this.f4634r > 0) {
                parcel.writeIntArray(this.f4635s);
            }
            parcel.writeInt(this.f4637u ? 1 : 0);
            parcel.writeInt(this.f4638v ? 1 : 0);
            parcel.writeInt(this.f4639w ? 1 : 0);
            parcel.writeList(this.f4636t);
        }

        SavedState(Parcel parcel) {
            this.f4630n = parcel.readInt();
            this.f4631o = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4632p = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4633q = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4634r = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4635s = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4637u = parcel.readInt() == 1;
            this.f4638v = parcel.readInt() == 1;
            this.f4639w = parcel.readInt() == 1;
            this.f4636t = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f4632p = savedState.f4632p;
            this.f4630n = savedState.f4630n;
            this.f4631o = savedState.f4631o;
            this.f4633q = savedState.f4633q;
            this.f4634r = savedState.f4634r;
            this.f4635s = savedState.f4635s;
            this.f4637u = savedState.f4637u;
            this.f4638v = savedState.f4638v;
            this.f4639w = savedState.f4639w;
            this.f4636t = savedState.f4636t;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    class RunnableC0902a implements Runnable {
        RunnableC0902a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m5626S1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    public class C0903b {

        /* renamed from: a */
        int f4641a;

        /* renamed from: b */
        int f4642b;

        /* renamed from: c */
        boolean f4643c;

        /* renamed from: d */
        boolean f4644d;

        /* renamed from: e */
        boolean f4645e;

        /* renamed from: f */
        int[] f4646f;

        C0903b() {
            m5660c();
        }

        /* renamed from: a */
        void m5658a() {
            this.f4642b = this.f4643c ? StaggeredGridLayoutManager.this.f4618u.mo5813i() : StaggeredGridLayoutManager.this.f4618u.mo5817m();
        }

        /* renamed from: b */
        void m5659b(int i10) {
            if (this.f4643c) {
                this.f4642b = StaggeredGridLayoutManager.this.f4618u.mo5813i() - i10;
            } else {
                this.f4642b = StaggeredGridLayoutManager.this.f4618u.mo5817m() + i10;
            }
        }

        /* renamed from: c */
        void m5660c() {
            this.f4641a = -1;
            this.f4642b = Integer.MIN_VALUE;
            this.f4643c = false;
            this.f4644d = false;
            this.f4645e = false;
            int[] iArr = this.f4646f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        void m5661d(C0905d[] c0905dArr) {
            int length = c0905dArr.length;
            int[] iArr = this.f4646f;
            if (iArr == null || iArr.length < length) {
                this.f4646f = new int[StaggeredGridLayoutManager.this.f4617t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f4646f[i10] = c0905dArr[i10].m5678p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0904c extends RecyclerView.C0890q {

        /* renamed from: e */
        C0905d f4648e;

        /* renamed from: f */
        boolean f4649f;

        public C0904c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public boolean m5662e() {
            return this.f4649f;
        }

        public C0904c(int i10, int i11) {
            super(i10, i11);
        }

        public C0904c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0904c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes.dex */
    public class C0905d {

        /* renamed from: a */
        ArrayList<View> f4650a = new ArrayList<>();

        /* renamed from: b */
        int f4651b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f4652c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f4653d = 0;

        /* renamed from: e */
        final int f4654e;

        C0905d(int i10) {
            this.f4654e = i10;
        }

        /* renamed from: a */
        void m5663a(View view) {
            C0904c m5676n = m5676n(view);
            m5676n.f4648e = this;
            this.f4650a.add(view);
            this.f4652c = Integer.MIN_VALUE;
            if (this.f4650a.size() == 1) {
                this.f4651b = Integer.MIN_VALUE;
            }
            if (m5676n.m5493c() || m5676n.m5492b()) {
                this.f4653d += StaggeredGridLayoutManager.this.f4618u.mo5809e(view);
            }
        }

        /* renamed from: b */
        void m5664b(boolean z10, int i10) {
            int m5678p;
            if (z10) {
                m5678p = m5674l(Integer.MIN_VALUE);
            } else {
                m5678p = m5678p(Integer.MIN_VALUE);
            }
            m5667e();
            if (m5678p == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || m5678p >= StaggeredGridLayoutManager.this.f4618u.mo5813i()) {
                if (z10 || m5678p <= StaggeredGridLayoutManager.this.f4618u.mo5817m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        m5678p += i10;
                    }
                    this.f4652c = m5678p;
                    this.f4651b = m5678p;
                }
            }
        }

        /* renamed from: c */
        void m5665c() {
            LazySpanLookup.FullSpanItem m5644f;
            ArrayList<View> arrayList = this.f4650a;
            View view = arrayList.get(arrayList.size() - 1);
            C0904c m5676n = m5676n(view);
            this.f4652c = StaggeredGridLayoutManager.this.f4618u.mo5808d(view);
            if (m5676n.f4649f && (m5644f = StaggeredGridLayoutManager.this.f4604E.m5644f(m5676n.m5491a())) != null && m5644f.f4627o == 1) {
                this.f4652c += m5644f.m5651a(this.f4654e);
            }
        }

        /* renamed from: d */
        void m5666d() {
            LazySpanLookup.FullSpanItem m5644f;
            View view = this.f4650a.get(0);
            C0904c m5676n = m5676n(view);
            this.f4651b = StaggeredGridLayoutManager.this.f4618u.mo5811g(view);
            if (m5676n.f4649f && (m5644f = StaggeredGridLayoutManager.this.f4604E.m5644f(m5676n.m5491a())) != null && m5644f.f4627o == -1) {
                this.f4651b -= m5644f.m5651a(this.f4654e);
            }
        }

        /* renamed from: e */
        void m5667e() {
            this.f4650a.clear();
            m5679q();
            this.f4653d = 0;
        }

        /* renamed from: f */
        public int m5668f() {
            if (StaggeredGridLayoutManager.this.f4623z) {
                return m5671i(this.f4650a.size() - 1, -1, true);
            }
            return m5671i(0, this.f4650a.size(), true);
        }

        /* renamed from: g */
        public int m5669g() {
            if (StaggeredGridLayoutManager.this.f4623z) {
                return m5671i(0, this.f4650a.size(), true);
            }
            return m5671i(this.f4650a.size() - 1, -1, true);
        }

        /* renamed from: h */
        int m5670h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int mo5817m = StaggeredGridLayoutManager.this.f4618u.mo5817m();
            int mo5813i = StaggeredGridLayoutManager.this.f4618u.mo5813i();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f4650a.get(i10);
                int mo5811g = StaggeredGridLayoutManager.this.f4618u.mo5811g(view);
                int mo5808d = StaggeredGridLayoutManager.this.f4618u.mo5808d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? mo5811g >= mo5813i : mo5811g > mo5813i;
                if (!z12 ? mo5808d > mo5817m : mo5808d >= mo5817m) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (mo5811g >= mo5817m && mo5808d <= mo5813i) {
                            return StaggeredGridLayoutManager.this.m5451h0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.m5451h0(view);
                        }
                        if (mo5811g < mo5817m || mo5808d > mo5813i) {
                            return StaggeredGridLayoutManager.this.m5451h0(view);
                        }
                    }
                }
                i10 += i12;
            }
            return -1;
        }

        /* renamed from: i */
        int m5671i(int i10, int i11, boolean z10) {
            return m5670h(i10, i11, false, false, z10);
        }

        /* renamed from: j */
        public int m5672j() {
            return this.f4653d;
        }

        /* renamed from: k */
        int m5673k() {
            int i10 = this.f4652c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            m5665c();
            return this.f4652c;
        }

        /* renamed from: l */
        int m5674l(int i10) {
            int i11 = this.f4652c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4650a.size() == 0) {
                return i10;
            }
            m5665c();
            return this.f4652c;
        }

        /* renamed from: m */
        public View m5675m(int i10, int i11) {
            View view = null;
            if (i11 == -1) {
                int size = this.f4650a.size();
                int i12 = 0;
                while (i12 < size) {
                    View view2 = this.f4650a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4623z && staggeredGridLayoutManager.m5451h0(view2) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4623z && staggeredGridLayoutManager2.m5451h0(view2) >= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view2;
                }
            } else {
                int size2 = this.f4650a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f4650a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4623z && staggeredGridLayoutManager3.m5451h0(view3) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4623z && staggeredGridLayoutManager4.m5451h0(view3) <= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        C0904c m5676n(View view) {
            return (C0904c) view.getLayoutParams();
        }

        /* renamed from: o */
        int m5677o() {
            int i10 = this.f4651b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            m5666d();
            return this.f4651b;
        }

        /* renamed from: p */
        int m5678p(int i10) {
            int i11 = this.f4651b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4650a.size() == 0) {
                return i10;
            }
            m5666d();
            return this.f4651b;
        }

        /* renamed from: q */
        void m5679q() {
            this.f4651b = Integer.MIN_VALUE;
            this.f4652c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        void m5680r(int i10) {
            int i11 = this.f4651b;
            if (i11 != Integer.MIN_VALUE) {
                this.f4651b = i11 + i10;
            }
            int i12 = this.f4652c;
            if (i12 != Integer.MIN_VALUE) {
                this.f4652c = i12 + i10;
            }
        }

        /* renamed from: s */
        void m5681s() {
            int size = this.f4650a.size();
            View remove = this.f4650a.remove(size - 1);
            C0904c m5676n = m5676n(remove);
            m5676n.f4648e = null;
            if (m5676n.m5493c() || m5676n.m5492b()) {
                this.f4653d -= StaggeredGridLayoutManager.this.f4618u.mo5809e(remove);
            }
            if (size == 1) {
                this.f4651b = Integer.MIN_VALUE;
            }
            this.f4652c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        void m5682t() {
            View remove = this.f4650a.remove(0);
            C0904c m5676n = m5676n(remove);
            m5676n.f4648e = null;
            if (this.f4650a.size() == 0) {
                this.f4652c = Integer.MIN_VALUE;
            }
            if (m5676n.m5493c() || m5676n.m5492b()) {
                this.f4653d -= StaggeredGridLayoutManager.this.f4618u.mo5809e(remove);
            }
            this.f4651b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        void m5683u(View view) {
            C0904c m5676n = m5676n(view);
            m5676n.f4648e = this;
            this.f4650a.add(0, view);
            this.f4651b = Integer.MIN_VALUE;
            if (this.f4650a.size() == 1) {
                this.f4652c = Integer.MIN_VALUE;
            }
            if (m5676n.m5493c() || m5676n.m5492b()) {
                this.f4653d += StaggeredGridLayoutManager.this.f4618u.mo5809e(view);
            }
        }

        /* renamed from: v */
        void m5684v(int i10) {
            this.f4651b = i10;
            this.f4652c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.AbstractC0889p.d m5386i0 = RecyclerView.AbstractC0889p.m5386i0(context, attributeSet, i10, i11);
        m5618H2(m5386i0.f4562a);
        m5620J2(m5386i0.f4563b);
        m5619I2(m5386i0.f4564c);
        this.f4622y = new C0911f();
        m5600a2();
    }

    /* renamed from: A2 */
    private void m5578A2(RecyclerView.C0896w c0896w, C0911f c0911f) {
        int min;
        int min2;
        if (!c0911f.f4775a || c0911f.f4783i) {
            return;
        }
        if (c0911f.f4776b == 0) {
            if (c0911f.f4779e == -1) {
                m5579B2(c0896w, c0911f.f4781g);
                return;
            } else {
                m5580C2(c0896w, c0911f.f4780f);
                return;
            }
        }
        if (c0911f.f4779e == -1) {
            int i10 = c0911f.f4780f;
            int m5607m2 = i10 - m5607m2(i10);
            if (m5607m2 < 0) {
                min2 = c0911f.f4781g;
            } else {
                min2 = c0911f.f4781g - Math.min(m5607m2, c0911f.f4776b);
            }
            m5579B2(c0896w, min2);
            return;
        }
        int m5608n2 = m5608n2(c0911f.f4781g) - c0911f.f4781g;
        if (m5608n2 < 0) {
            min = c0911f.f4780f;
        } else {
            min = Math.min(m5608n2, c0911f.f4776b) + c0911f.f4780f;
        }
        m5580C2(c0896w, min);
    }

    /* renamed from: B2 */
    private void m5579B2(RecyclerView.C0896w c0896w, int i10) {
        for (int m5411J = m5411J() - 1; m5411J >= 0; m5411J--) {
            View m5410I = m5410I(m5411J);
            if (this.f4618u.mo5811g(m5410I) < i10 || this.f4618u.mo5821q(m5410I) < i10) {
                return;
            }
            C0904c c0904c = (C0904c) m5410I.getLayoutParams();
            if (c0904c.f4649f) {
                for (int i11 = 0; i11 < this.f4616s; i11++) {
                    if (this.f4617t[i11].f4650a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f4616s; i12++) {
                    this.f4617t[i12].m5681s();
                }
            } else if (c0904c.f4648e.f4650a.size() == 1) {
                return;
            } else {
                c0904c.f4648e.m5681s();
            }
            m5462m1(m5410I, c0896w);
        }
    }

    /* renamed from: C2 */
    private void m5580C2(RecyclerView.C0896w c0896w, int i10) {
        while (m5411J() > 0) {
            View m5410I = m5410I(0);
            if (this.f4618u.mo5808d(m5410I) > i10 || this.f4618u.mo5820p(m5410I) > i10) {
                return;
            }
            C0904c c0904c = (C0904c) m5410I.getLayoutParams();
            if (c0904c.f4649f) {
                for (int i11 = 0; i11 < this.f4616s; i11++) {
                    if (this.f4617t[i11].f4650a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f4616s; i12++) {
                    this.f4617t[i12].m5682t();
                }
            } else if (c0904c.f4648e.f4650a.size() == 1) {
                return;
            } else {
                c0904c.f4648e.m5682t();
            }
            m5462m1(m5410I, c0896w);
        }
    }

    /* renamed from: D2 */
    private void m5581D2() {
        if (this.f4619v.mo5815k() == 1073741824) {
            return;
        }
        float f10 = 0.0f;
        int m5411J = m5411J();
        for (int i10 = 0; i10 < m5411J; i10++) {
            View m5410I = m5410I(i10);
            float mo5809e = this.f4619v.mo5809e(m5410I);
            if (mo5809e >= f10) {
                if (((C0904c) m5410I.getLayoutParams()).m5662e()) {
                    mo5809e = (mo5809e * 1.0f) / this.f4616s;
                }
                f10 = Math.max(f10, mo5809e);
            }
        }
        int i11 = this.f4621x;
        int round = Math.round(f10 * this.f4616s);
        if (this.f4619v.mo5815k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f4619v.mo5818n());
        }
        m5625P2(round);
        if (this.f4621x == i11) {
            return;
        }
        for (int i12 = 0; i12 < m5411J; i12++) {
            View m5410I2 = m5410I(i12);
            C0904c c0904c = (C0904c) m5410I2.getLayoutParams();
            if (!c0904c.f4649f) {
                if (m5634t2() && this.f4620w == 1) {
                    int i13 = this.f4616s;
                    int i14 = c0904c.f4648e.f4654e;
                    m5410I2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f4621x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = c0904c.f4648e.f4654e;
                    int i16 = this.f4621x * i15;
                    int i17 = i15 * i11;
                    if (this.f4620w == 1) {
                        m5410I2.offsetLeftAndRight(i16 - i17);
                    } else {
                        m5410I2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    /* renamed from: E2 */
    private void m5582E2() {
        if (this.f4620w != 1 && m5634t2()) {
            this.f4600A = !this.f4623z;
        } else {
            this.f4600A = this.f4623z;
        }
    }

    /* renamed from: G2 */
    private void m5583G2(int i10) {
        C0911f c0911f = this.f4622y;
        c0911f.f4779e = i10;
        c0911f.f4778d = this.f4600A != (i10 == -1) ? -1 : 1;
    }

    /* renamed from: K2 */
    private void m5584K2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f4616s; i12++) {
            if (!this.f4617t[i12].f4650a.isEmpty()) {
                m5590Q2(this.f4617t[i12], i10, i11);
            }
        }
    }

    /* renamed from: L2 */
    private boolean m5585L2(RecyclerView.C0871a0 c0871a0, C0903b c0903b) {
        int m5602c2;
        if (this.f4606G) {
            m5602c2 = m5603g2(c0871a0.m5251b());
        } else {
            m5602c2 = m5602c2(c0871a0.m5251b());
        }
        c0903b.f4641a = m5602c2;
        c0903b.f4642b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: M1 */
    private void m5586M1(View view) {
        for (int i10 = this.f4616s - 1; i10 >= 0; i10--) {
            this.f4617t[i10].m5663a(view);
        }
    }

    /* renamed from: N1 */
    private void m5587N1(C0903b c0903b) {
        int mo5817m;
        SavedState savedState = this.f4608I;
        int i10 = savedState.f4632p;
        if (i10 > 0) {
            if (i10 == this.f4616s) {
                for (int i11 = 0; i11 < this.f4616s; i11++) {
                    this.f4617t[i11].m5667e();
                    SavedState savedState2 = this.f4608I;
                    int i12 = savedState2.f4633q[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        if (savedState2.f4638v) {
                            mo5817m = this.f4618u.mo5813i();
                        } else {
                            mo5817m = this.f4618u.mo5817m();
                        }
                        i12 += mo5817m;
                    }
                    this.f4617t[i11].m5684v(i12);
                }
            } else {
                savedState.m5655b();
                SavedState savedState3 = this.f4608I;
                savedState3.f4630n = savedState3.f4631o;
            }
        }
        SavedState savedState4 = this.f4608I;
        this.f4607H = savedState4.f4639w;
        m5619I2(savedState4.f4637u);
        m5582E2();
        SavedState savedState5 = this.f4608I;
        int i13 = savedState5.f4630n;
        if (i13 != -1) {
            this.f4602C = i13;
            c0903b.f4643c = savedState5.f4638v;
        } else {
            c0903b.f4643c = this.f4600A;
        }
        if (savedState5.f4634r > 1) {
            LazySpanLookup lazySpanLookup = this.f4604E;
            lazySpanLookup.f4624a = savedState5.f4635s;
            lazySpanLookup.f4625b = savedState5.f4636t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* renamed from: O2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5588O2(int r5, androidx.recyclerview.widget.RecyclerView.C0871a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f4622y
            r1 = 0
            r0.f4776b = r1
            r0.f4777c = r5
            boolean r0 = r4.m5480x0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.m5252c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.f4600A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.i r5 = r4.f4618u
            int r5 = r5.mo5818n()
            goto L2f
        L25:
            androidx.recyclerview.widget.i r5 = r4.f4618u
            int r5 = r5.mo5818n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.m5415M()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.f r0 = r4.f4622y
            androidx.recyclerview.widget.i r3 = r4.f4618u
            int r3 = r3.mo5817m()
            int r3 = r3 - r6
            r0.f4780f = r3
            androidx.recyclerview.widget.f r6 = r4.f4622y
            androidx.recyclerview.widget.i r0 = r4.f4618u
            int r0 = r0.mo5813i()
            int r0 = r0 + r5
            r6.f4781g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.f r0 = r4.f4622y
            androidx.recyclerview.widget.i r3 = r4.f4618u
            int r3 = r3.mo5812h()
            int r3 = r3 + r5
            r0.f4781g = r3
            androidx.recyclerview.widget.f r5 = r4.f4622y
            int r6 = -r6
            r5.f4780f = r6
        L5d:
            androidx.recyclerview.widget.f r5 = r4.f4622y
            r5.f4782h = r1
            r5.f4775a = r2
            androidx.recyclerview.widget.i r6 = r4.f4618u
            int r6 = r6.mo5815k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.i r6 = r4.f4618u
            int r6 = r6.mo5812h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f4783i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5588O2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: Q1 */
    private void m5589Q1(View view, C0904c c0904c, C0911f c0911f) {
        if (c0911f.f4779e == 1) {
            if (c0904c.f4649f) {
                m5586M1(view);
                return;
            } else {
                c0904c.f4648e.m5663a(view);
                return;
            }
        }
        if (c0904c.f4649f) {
            m5616z2(view);
        } else {
            c0904c.f4648e.m5683u(view);
        }
    }

    /* renamed from: Q2 */
    private void m5590Q2(C0905d c0905d, int i10, int i11) {
        int m5672j = c0905d.m5672j();
        if (i10 == -1) {
            if (c0905d.m5677o() + m5672j <= i11) {
                this.f4601B.set(c0905d.f4654e, false);
            }
        } else if (c0905d.m5673k() - m5672j >= i11) {
            this.f4601B.set(c0905d.f4654e, false);
        }
    }

    /* renamed from: R1 */
    private int m5591R1(int i10) {
        if (m5411J() == 0) {
            return this.f4600A ? 1 : -1;
        }
        return (i10 < m5630j2()) != this.f4600A ? -1 : 1;
    }

    /* renamed from: R2 */
    private int m5592R2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    /* renamed from: T1 */
    private boolean m5593T1(C0905d c0905d) {
        if (this.f4600A) {
            if (c0905d.m5673k() < this.f4618u.mo5813i()) {
                ArrayList<View> arrayList = c0905d.f4650a;
                return !c0905d.m5676n(arrayList.get(arrayList.size() - 1)).f4649f;
            }
        } else if (c0905d.m5677o() > this.f4618u.mo5817m()) {
            return !c0905d.m5676n(c0905d.f4650a.get(0)).f4649f;
        }
        return false;
    }

    /* renamed from: U1 */
    private int m5594U1(RecyclerView.C0871a0 c0871a0) {
        if (m5411J() == 0) {
            return 0;
        }
        return C0917l.m5839a(c0871a0, this.f4618u, m5628e2(!this.f4613N), m5627d2(!this.f4613N), this, this.f4613N);
    }

    /* renamed from: V1 */
    private int m5595V1(RecyclerView.C0871a0 c0871a0) {
        if (m5411J() == 0) {
            return 0;
        }
        return C0917l.m5840b(c0871a0, this.f4618u, m5628e2(!this.f4613N), m5627d2(!this.f4613N), this, this.f4613N, this.f4600A);
    }

    /* renamed from: W1 */
    private int m5596W1(RecyclerView.C0871a0 c0871a0) {
        if (m5411J() == 0) {
            return 0;
        }
        return C0917l.m5841c(c0871a0, this.f4618u, m5628e2(!this.f4613N), m5627d2(!this.f4613N), this, this.f4613N);
    }

    /* renamed from: X1 */
    private int m5597X1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f4620w == 1) ? 1 : Integer.MIN_VALUE : this.f4620w == 0 ? 1 : Integer.MIN_VALUE : this.f4620w == 1 ? -1 : Integer.MIN_VALUE : this.f4620w == 0 ? -1 : Integer.MIN_VALUE : (this.f4620w != 1 && m5634t2()) ? -1 : 1 : (this.f4620w != 1 && m5634t2()) ? 1 : -1;
    }

    /* renamed from: Y1 */
    private LazySpanLookup.FullSpanItem m5598Y1(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4628p = new int[this.f4616s];
        for (int i11 = 0; i11 < this.f4616s; i11++) {
            fullSpanItem.f4628p[i11] = i10 - this.f4617t[i11].m5674l(i10);
        }
        return fullSpanItem;
    }

    /* renamed from: Z1 */
    private LazySpanLookup.FullSpanItem m5599Z1(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4628p = new int[this.f4616s];
        for (int i11 = 0; i11 < this.f4616s; i11++) {
            fullSpanItem.f4628p[i11] = this.f4617t[i11].m5678p(i10) - i10;
        }
        return fullSpanItem;
    }

    /* renamed from: a2 */
    private void m5600a2() {
        this.f4618u = AbstractC0914i.m5806b(this, this.f4620w);
        this.f4619v = AbstractC0914i.m5806b(this, 1 - this.f4620w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: b2 */
    private int m5601b2(RecyclerView.C0896w c0896w, C0911f c0911f, RecyclerView.C0871a0 c0871a0) {
        int i10;
        int i11;
        int mo5817m;
        int m5606l2;
        C0905d c0905d;
        int mo5809e;
        int i12;
        int i13;
        int mo5809e2;
        boolean m5624P1;
        ?? r92 = 0;
        this.f4601B.set(0, this.f4616s, true);
        if (this.f4622y.f4783i) {
            i11 = c0911f.f4779e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (c0911f.f4779e == 1) {
                i10 = c0911f.f4781g + c0911f.f4776b;
            } else {
                i10 = c0911f.f4780f - c0911f.f4776b;
            }
            i11 = i10;
        }
        m5584K2(c0911f.f4779e, i11);
        if (this.f4600A) {
            mo5817m = this.f4618u.mo5813i();
        } else {
            mo5817m = this.f4618u.mo5817m();
        }
        int i14 = mo5817m;
        boolean z10 = false;
        while (c0911f.m5786a(c0871a0) && (this.f4622y.f4783i || !this.f4601B.isEmpty())) {
            View m5787b = c0911f.m5787b(c0896w);
            C0904c c0904c = (C0904c) m5787b.getLayoutParams();
            int m5491a = c0904c.m5491a();
            int m5645g = this.f4604E.m5645g(m5491a);
            boolean z11 = m5645g == -1;
            if (z11) {
                c0905d = c0904c.f4649f ? this.f4617t[r92] : m5610p2(c0911f);
                this.f4604E.m5649n(m5491a, c0905d);
            } else {
                c0905d = this.f4617t[m5645g];
            }
            C0905d c0905d2 = c0905d;
            c0904c.f4648e = c0905d2;
            if (c0911f.f4779e == 1) {
                m5441d(m5787b);
            } else {
                m5443e(m5787b, r92);
            }
            m5613v2(m5787b, c0904c, r92);
            if (c0911f.f4779e == 1) {
                int m5606l22 = c0904c.f4649f ? m5606l2(i14) : c0905d2.m5674l(i14);
                int mo5809e3 = this.f4618u.mo5809e(m5787b) + m5606l22;
                if (z11 && c0904c.f4649f) {
                    LazySpanLookup.FullSpanItem m5598Y1 = m5598Y1(m5606l22);
                    m5598Y1.f4627o = -1;
                    m5598Y1.f4626n = m5491a;
                    this.f4604E.m5639a(m5598Y1);
                }
                i12 = mo5809e3;
                mo5809e = m5606l22;
            } else {
                int m5609o2 = c0904c.f4649f ? m5609o2(i14) : c0905d2.m5678p(i14);
                mo5809e = m5609o2 - this.f4618u.mo5809e(m5787b);
                if (z11 && c0904c.f4649f) {
                    LazySpanLookup.FullSpanItem m5599Z1 = m5599Z1(m5609o2);
                    m5599Z1.f4627o = 1;
                    m5599Z1.f4626n = m5491a;
                    this.f4604E.m5639a(m5599Z1);
                }
                i12 = m5609o2;
            }
            if (c0904c.f4649f && c0911f.f4778d == -1) {
                if (z11) {
                    this.f4612M = true;
                } else {
                    if (c0911f.f4779e == 1) {
                        m5624P1 = m5623O1();
                    } else {
                        m5624P1 = m5624P1();
                    }
                    if (!m5624P1) {
                        LazySpanLookup.FullSpanItem m5644f = this.f4604E.m5644f(m5491a);
                        if (m5644f != null) {
                            m5644f.f4629q = true;
                        }
                        this.f4612M = true;
                    }
                }
            }
            m5589Q1(m5787b, c0904c, c0911f);
            if (m5634t2() && this.f4620w == 1) {
                int mo5813i = c0904c.f4649f ? this.f4619v.mo5813i() : this.f4619v.mo5813i() - (((this.f4616s - 1) - c0905d2.f4654e) * this.f4621x);
                mo5809e2 = mo5813i;
                i13 = mo5813i - this.f4619v.mo5809e(m5787b);
            } else {
                int mo5817m2 = c0904c.f4649f ? this.f4619v.mo5817m() : (c0905d2.f4654e * this.f4621x) + this.f4619v.mo5817m();
                i13 = mo5817m2;
                mo5809e2 = this.f4619v.mo5809e(m5787b) + mo5817m2;
            }
            if (this.f4620w == 1) {
                m5483z0(m5787b, i13, mo5809e, mo5809e2, i12);
            } else {
                m5483z0(m5787b, mo5809e, i13, i12, mo5809e2);
            }
            if (c0904c.f4649f) {
                m5584K2(this.f4622y.f4779e, i11);
            } else {
                m5590Q2(c0905d2, this.f4622y.f4779e, i11);
            }
            m5578A2(c0896w, this.f4622y);
            if (this.f4622y.f4782h && m5787b.hasFocusable()) {
                if (c0904c.f4649f) {
                    this.f4601B.clear();
                } else {
                    this.f4601B.set(c0905d2.f4654e, false);
                    z10 = true;
                    r92 = 0;
                }
            }
            z10 = true;
            r92 = 0;
        }
        if (!z10) {
            m5578A2(c0896w, this.f4622y);
        }
        if (this.f4622y.f4779e == -1) {
            m5606l2 = this.f4618u.mo5817m() - m5609o2(this.f4618u.mo5817m());
        } else {
            m5606l2 = m5606l2(this.f4618u.mo5813i()) - this.f4618u.mo5813i();
        }
        if (m5606l2 > 0) {
            return Math.min(c0911f.f4776b, m5606l2);
        }
        return 0;
    }

    /* renamed from: c2 */
    private int m5602c2(int i10) {
        int m5411J = m5411J();
        for (int i11 = 0; i11 < m5411J; i11++) {
            int m5451h0 = m5451h0(m5410I(i11));
            if (m5451h0 >= 0 && m5451h0 < i10) {
                return m5451h0;
            }
        }
        return 0;
    }

    /* renamed from: g2 */
    private int m5603g2(int i10) {
        for (int m5411J = m5411J() - 1; m5411J >= 0; m5411J--) {
            int m5451h0 = m5451h0(m5410I(m5411J));
            if (m5451h0 >= 0 && m5451h0 < i10) {
                return m5451h0;
            }
        }
        return 0;
    }

    /* renamed from: h2 */
    private void m5604h2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, boolean z10) {
        int mo5813i;
        int m5606l2 = m5606l2(Integer.MIN_VALUE);
        if (m5606l2 != Integer.MIN_VALUE && (mo5813i = this.f4618u.mo5813i() - m5606l2) > 0) {
            int i10 = mo5813i - (-m5617F2(-mo5813i, c0896w, c0871a0));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f4618u.mo5822r(i10);
        }
    }

    /* renamed from: i2 */
    private void m5605i2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, boolean z10) {
        int mo5817m;
        int m5609o2 = m5609o2(Integer.MAX_VALUE);
        if (m5609o2 != Integer.MAX_VALUE && (mo5817m = m5609o2 - this.f4618u.mo5817m()) > 0) {
            int m5617F2 = mo5817m - m5617F2(mo5817m, c0896w, c0871a0);
            if (!z10 || m5617F2 <= 0) {
                return;
            }
            this.f4618u.mo5822r(-m5617F2);
        }
    }

    /* renamed from: l2 */
    private int m5606l2(int i10) {
        int m5674l = this.f4617t[0].m5674l(i10);
        for (int i11 = 1; i11 < this.f4616s; i11++) {
            int m5674l2 = this.f4617t[i11].m5674l(i10);
            if (m5674l2 > m5674l) {
                m5674l = m5674l2;
            }
        }
        return m5674l;
    }

    /* renamed from: m2 */
    private int m5607m2(int i10) {
        int m5678p = this.f4617t[0].m5678p(i10);
        for (int i11 = 1; i11 < this.f4616s; i11++) {
            int m5678p2 = this.f4617t[i11].m5678p(i10);
            if (m5678p2 > m5678p) {
                m5678p = m5678p2;
            }
        }
        return m5678p;
    }

    /* renamed from: n2 */
    private int m5608n2(int i10) {
        int m5674l = this.f4617t[0].m5674l(i10);
        for (int i11 = 1; i11 < this.f4616s; i11++) {
            int m5674l2 = this.f4617t[i11].m5674l(i10);
            if (m5674l2 < m5674l) {
                m5674l = m5674l2;
            }
        }
        return m5674l;
    }

    /* renamed from: o2 */
    private int m5609o2(int i10) {
        int m5678p = this.f4617t[0].m5678p(i10);
        for (int i11 = 1; i11 < this.f4616s; i11++) {
            int m5678p2 = this.f4617t[i11].m5678p(i10);
            if (m5678p2 < m5678p) {
                m5678p = m5678p2;
            }
        }
        return m5678p;
    }

    /* renamed from: p2 */
    private C0905d m5610p2(C0911f c0911f) {
        int i10;
        int i11;
        int i12 = -1;
        if (m5615x2(c0911f.f4779e)) {
            i10 = this.f4616s - 1;
            i11 = -1;
        } else {
            i10 = 0;
            i12 = this.f4616s;
            i11 = 1;
        }
        C0905d c0905d = null;
        if (c0911f.f4779e == 1) {
            int i13 = Integer.MAX_VALUE;
            int mo5817m = this.f4618u.mo5817m();
            while (i10 != i12) {
                C0905d c0905d2 = this.f4617t[i10];
                int m5674l = c0905d2.m5674l(mo5817m);
                if (m5674l < i13) {
                    c0905d = c0905d2;
                    i13 = m5674l;
                }
                i10 += i11;
            }
            return c0905d;
        }
        int i14 = Integer.MIN_VALUE;
        int mo5813i = this.f4618u.mo5813i();
        while (i10 != i12) {
            C0905d c0905d3 = this.f4617t[i10];
            int m5678p = c0905d3.m5678p(mo5813i);
            if (m5678p > i14) {
                c0905d = c0905d3;
                i14 = m5678p;
            }
            i10 += i11;
        }
        return c0905d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* renamed from: q2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5611q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4600A
            if (r0 == 0) goto L9
            int r0 = r6.m5631k2()
            goto Ld
        L9:
            int r0 = r6.m5630j2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f4604E
            r4.m5646h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4604E
            r9.m5648k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f4604E
            r7.m5647j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4604E
            r9.m5648k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4604E
            r9.m5647j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f4600A
            if (r7 == 0) goto L4d
            int r7 = r6.m5630j2()
            goto L51
        L4d:
            int r7 = r6.m5631k2()
        L51:
            if (r3 > r7) goto L56
            r6.m5474t1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5611q2(int, int, int):void");
    }

    /* renamed from: u2 */
    private void m5612u2(View view, int i10, int i11, boolean z10) {
        boolean m5404F1;
        m5455j(view, this.f4610K);
        C0904c c0904c = (C0904c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0904c).leftMargin;
        Rect rect = this.f4610K;
        int m5592R2 = m5592R2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) c0904c).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) c0904c).topMargin;
        Rect rect2 = this.f4610K;
        int m5592R22 = m5592R2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) c0904c).bottomMargin + rect2.bottom);
        if (z10) {
            m5404F1 = m5409H1(view, m5592R2, m5592R22, c0904c);
        } else {
            m5404F1 = m5404F1(view, m5592R2, m5592R22, c0904c);
        }
        if (m5404F1) {
            view.measure(m5592R2, m5592R22);
        }
    }

    /* renamed from: v2 */
    private void m5613v2(View view, C0904c c0904c, boolean z10) {
        if (c0904c.f4649f) {
            if (this.f4620w == 1) {
                m5612u2(view, this.f4609J, RecyclerView.AbstractC0889p.m5383K(m5429W(), m5430X(), m5448g0() + m5442d0(), ((ViewGroup.MarginLayoutParams) c0904c).height, true), z10);
                return;
            } else {
                m5612u2(view, RecyclerView.AbstractC0889p.m5383K(m5465o0(), m5467p0(), m5444e0() + m5446f0(), ((ViewGroup.MarginLayoutParams) c0904c).width, true), this.f4609J, z10);
                return;
            }
        }
        if (this.f4620w == 1) {
            m5612u2(view, RecyclerView.AbstractC0889p.m5383K(this.f4621x, m5467p0(), 0, ((ViewGroup.MarginLayoutParams) c0904c).width, false), RecyclerView.AbstractC0889p.m5383K(m5429W(), m5430X(), m5448g0() + m5442d0(), ((ViewGroup.MarginLayoutParams) c0904c).height, true), z10);
        } else {
            m5612u2(view, RecyclerView.AbstractC0889p.m5383K(m5465o0(), m5467p0(), m5444e0() + m5446f0(), ((ViewGroup.MarginLayoutParams) c0904c).width, true), RecyclerView.AbstractC0889p.m5383K(this.f4621x, m5430X(), 0, ((ViewGroup.MarginLayoutParams) c0904c).height, false), z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
    
        if (m5626S1() != false) goto L90;
     */
    /* renamed from: w2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5614w2(androidx.recyclerview.widget.RecyclerView.C0896w r9, androidx.recyclerview.widget.RecyclerView.C0871a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5614w2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: x2 */
    private boolean m5615x2(int i10) {
        if (this.f4620w == 0) {
            return (i10 == -1) != this.f4600A;
        }
        return ((i10 == -1) == this.f4600A) == m5634t2();
    }

    /* renamed from: z2 */
    private void m5616z2(View view) {
        for (int i10 = this.f4616s - 1; i10 >= 0; i10--) {
            this.f4617t[i10].m5683u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: C0 */
    public void mo5398C0(int i10) {
        super.mo5398C0(i10);
        for (int i11 = 0; i11 < this.f4616s; i11++) {
            this.f4617t[i11].m5680r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: C1 */
    public void mo5003C1(Rect rect, int i10, int i11) {
        int m5387n;
        int m5387n2;
        int m5444e0 = m5444e0() + m5446f0();
        int m5448g0 = m5448g0() + m5442d0();
        if (this.f4620w == 1) {
            m5387n2 = RecyclerView.AbstractC0889p.m5387n(i11, rect.height() + m5448g0, m5437b0());
            m5387n = RecyclerView.AbstractC0889p.m5387n(i10, (this.f4621x * this.f4616s) + m5444e0, m5440c0());
        } else {
            m5387n = RecyclerView.AbstractC0889p.m5387n(i10, rect.width() + m5444e0, m5440c0());
            m5387n2 = RecyclerView.AbstractC0889p.m5387n(i11, (this.f4621x * this.f4616s) + m5448g0, m5437b0());
        }
        m5397B1(m5387n, m5387n2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: D */
    public RecyclerView.C0890q mo5004D() {
        if (this.f4620w == 0) {
            return new C0904c(-2, -1);
        }
        return new C0904c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: D0 */
    public void mo5399D0(int i10) {
        super.mo5399D0(i10);
        for (int i11 = 0; i11 < this.f4616s; i11++) {
            this.f4617t[i11].m5680r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: E */
    public RecyclerView.C0890q mo5005E(Context context, AttributeSet attributeSet) {
        return new C0904c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: E0 */
    public void mo5401E0(RecyclerView.AbstractC0881h abstractC0881h, RecyclerView.AbstractC0881h abstractC0881h2) {
        this.f4604E.m5640b();
        for (int i10 = 0; i10 < this.f4616s; i10++) {
            this.f4617t[i10].m5667e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: F */
    public RecyclerView.C0890q mo5006F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0904c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0904c(layoutParams);
    }

    /* renamed from: F2 */
    int m5617F2(int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        if (m5411J() == 0 || i10 == 0) {
            return 0;
        }
        m5635y2(i10, c0871a0);
        int m5601b2 = m5601b2(c0896w, this.f4622y, c0871a0);
        if (this.f4622y.f4776b >= m5601b2) {
            i10 = i10 < 0 ? -m5601b2 : m5601b2;
        }
        this.f4618u.mo5822r(-i10);
        this.f4606G = this.f4600A;
        C0911f c0911f = this.f4622y;
        c0911f.f4776b = 0;
        m5578A2(c0896w, c0911f);
        return i10;
    }

    /* renamed from: H2 */
    public void m5618H2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo5087g(null);
        if (i10 == this.f4620w) {
            return;
        }
        this.f4620w = i10;
        AbstractC0914i abstractC0914i = this.f4618u;
        this.f4618u = this.f4619v;
        this.f4619v = abstractC0914i;
        m5474t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: I0 */
    public void mo5070I0(RecyclerView recyclerView, RecyclerView.C0896w c0896w) {
        super.mo5070I0(recyclerView, c0896w);
        m5466o1(this.f4615P);
        for (int i10 = 0; i10 < this.f4616s; i10++) {
            this.f4617t[i10].m5667e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: I1 */
    public void mo5071I1(RecyclerView recyclerView, RecyclerView.C0871a0 c0871a0, int i10) {
        C0912g c0912g = new C0912g(recyclerView.getContext());
        c0912g.m5570p(i10);
        m5412J1(c0912g);
    }

    /* renamed from: I2 */
    public void m5619I2(boolean z10) {
        mo5087g(null);
        SavedState savedState = this.f4608I;
        if (savedState != null && savedState.f4637u != z10) {
            savedState.f4637u = z10;
        }
        this.f4623z = z10;
        m5474t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: J0 */
    public View mo5007J0(View view, int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        View m5395B;
        int m5630j2;
        int m5669g;
        int m5669g2;
        int m5669g3;
        View m5675m;
        if (m5411J() == 0 || (m5395B = m5395B(view)) == null) {
            return null;
        }
        m5582E2();
        int m5597X1 = m5597X1(i10);
        if (m5597X1 == Integer.MIN_VALUE) {
            return null;
        }
        C0904c c0904c = (C0904c) m5395B.getLayoutParams();
        boolean z10 = c0904c.f4649f;
        C0905d c0905d = c0904c.f4648e;
        if (m5597X1 == 1) {
            m5630j2 = m5631k2();
        } else {
            m5630j2 = m5630j2();
        }
        m5588O2(m5630j2, c0871a0);
        m5583G2(m5597X1);
        C0911f c0911f = this.f4622y;
        c0911f.f4777c = c0911f.f4778d + m5630j2;
        c0911f.f4776b = (int) (this.f4618u.mo5818n() * 0.33333334f);
        C0911f c0911f2 = this.f4622y;
        c0911f2.f4782h = true;
        c0911f2.f4775a = false;
        m5601b2(c0896w, c0911f2, c0871a0);
        this.f4606G = this.f4600A;
        if (!z10 && (m5675m = c0905d.m5675m(m5630j2, m5597X1)) != null && m5675m != m5395B) {
            return m5675m;
        }
        if (m5615x2(m5597X1)) {
            for (int i11 = this.f4616s - 1; i11 >= 0; i11--) {
                View m5675m2 = this.f4617t[i11].m5675m(m5630j2, m5597X1);
                if (m5675m2 != null && m5675m2 != m5395B) {
                    return m5675m2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f4616s; i12++) {
                View m5675m3 = this.f4617t[i12].m5675m(m5630j2, m5597X1);
                if (m5675m3 != null && m5675m3 != m5395B) {
                    return m5675m3;
                }
            }
        }
        boolean z11 = (this.f4623z ^ true) == (m5597X1 == -1);
        if (!z10) {
            if (z11) {
                m5669g3 = c0905d.m5668f();
            } else {
                m5669g3 = c0905d.m5669g();
            }
            View mo5068C = mo5068C(m5669g3);
            if (mo5068C != null && mo5068C != m5395B) {
                return mo5068C;
            }
        }
        if (m5615x2(m5597X1)) {
            for (int i13 = this.f4616s - 1; i13 >= 0; i13--) {
                if (i13 != c0905d.f4654e) {
                    if (z11) {
                        m5669g2 = this.f4617t[i13].m5668f();
                    } else {
                        m5669g2 = this.f4617t[i13].m5669g();
                    }
                    View mo5068C2 = mo5068C(m5669g2);
                    if (mo5068C2 != null && mo5068C2 != m5395B) {
                        return mo5068C2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f4616s; i14++) {
                if (z11) {
                    m5669g = this.f4617t[i14].m5668f();
                } else {
                    m5669g = this.f4617t[i14].m5669g();
                }
                View mo5068C3 = mo5068C(m5669g);
                if (mo5068C3 != null && mo5068C3 != m5395B) {
                    return mo5068C3;
                }
            }
        }
        return null;
    }

    /* renamed from: J2 */
    public void m5620J2(int i10) {
        mo5087g(null);
        if (i10 != this.f4616s) {
            m5633s2();
            this.f4616s = i10;
            this.f4601B = new BitSet(this.f4616s);
            this.f4617t = new C0905d[this.f4616s];
            for (int i11 = 0; i11 < this.f4616s; i11++) {
                this.f4617t[i11] = new C0905d(i11);
            }
            m5474t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: K0 */
    public void mo5072K0(AccessibilityEvent accessibilityEvent) {
        super.mo5072K0(accessibilityEvent);
        if (m5411J() > 0) {
            View m5628e2 = m5628e2(false);
            View m5627d2 = m5627d2(false);
            if (m5628e2 == null || m5627d2 == null) {
                return;
            }
            int m5451h0 = m5451h0(m5628e2);
            int m5451h02 = m5451h0(m5627d2);
            if (m5451h0 < m5451h02) {
                accessibilityEvent.setFromIndex(m5451h0);
                accessibilityEvent.setToIndex(m5451h02);
            } else {
                accessibilityEvent.setFromIndex(m5451h02);
                accessibilityEvent.setToIndex(m5451h0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: L1 */
    public boolean mo5008L1() {
        return this.f4608I == null;
    }

    /* renamed from: M2 */
    boolean m5621M2(RecyclerView.C0871a0 c0871a0, C0903b c0903b) {
        int i10;
        int mo5817m;
        if (!c0871a0.m5254e() && (i10 = this.f4602C) != -1) {
            if (i10 >= 0 && i10 < c0871a0.m5251b()) {
                SavedState savedState = this.f4608I;
                if (savedState != null && savedState.f4630n != -1 && savedState.f4632p >= 1) {
                    c0903b.f4642b = Integer.MIN_VALUE;
                    c0903b.f4641a = this.f4602C;
                } else {
                    View mo5068C = mo5068C(this.f4602C);
                    if (mo5068C != null) {
                        c0903b.f4641a = this.f4600A ? m5631k2() : m5630j2();
                        if (this.f4603D != Integer.MIN_VALUE) {
                            if (c0903b.f4643c) {
                                c0903b.f4642b = (this.f4618u.mo5813i() - this.f4603D) - this.f4618u.mo5808d(mo5068C);
                            } else {
                                c0903b.f4642b = (this.f4618u.mo5817m() + this.f4603D) - this.f4618u.mo5811g(mo5068C);
                            }
                            return true;
                        }
                        if (this.f4618u.mo5809e(mo5068C) > this.f4618u.mo5818n()) {
                            if (c0903b.f4643c) {
                                mo5817m = this.f4618u.mo5813i();
                            } else {
                                mo5817m = this.f4618u.mo5817m();
                            }
                            c0903b.f4642b = mo5817m;
                            return true;
                        }
                        int mo5811g = this.f4618u.mo5811g(mo5068C) - this.f4618u.mo5817m();
                        if (mo5811g < 0) {
                            c0903b.f4642b = -mo5811g;
                            return true;
                        }
                        int mo5813i = this.f4618u.mo5813i() - this.f4618u.mo5808d(mo5068C);
                        if (mo5813i < 0) {
                            c0903b.f4642b = mo5813i;
                            return true;
                        }
                        c0903b.f4642b = Integer.MIN_VALUE;
                    } else {
                        int i11 = this.f4602C;
                        c0903b.f4641a = i11;
                        int i12 = this.f4603D;
                        if (i12 == Integer.MIN_VALUE) {
                            c0903b.f4643c = m5591R1(i11) == 1;
                            c0903b.m5658a();
                        } else {
                            c0903b.m5659b(i12);
                        }
                        c0903b.f4644d = true;
                    }
                }
                return true;
            }
            this.f4602C = -1;
            this.f4603D = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: N2 */
    void m5622N2(RecyclerView.C0871a0 c0871a0, C0903b c0903b) {
        if (m5621M2(c0871a0, c0903b) || m5585L2(c0871a0, c0903b)) {
            return;
        }
        c0903b.m5658a();
        c0903b.f4641a = 0;
    }

    /* renamed from: O1 */
    boolean m5623O1() {
        int m5674l = this.f4617t[0].m5674l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f4616s; i10++) {
            if (this.f4617t[i10].m5674l(Integer.MIN_VALUE) != m5674l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P1 */
    boolean m5624P1() {
        int m5678p = this.f4617t[0].m5678p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f4616s; i10++) {
            if (this.f4617t[i10].m5678p(Integer.MIN_VALUE) != m5678p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P2 */
    void m5625P2(int i10) {
        this.f4621x = i10 / this.f4616s;
        this.f4609J = View.MeasureSpec.makeMeasureSpec(i10, this.f4619v.mo5815k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: R0 */
    public void mo5012R0(RecyclerView recyclerView, int i10, int i11) {
        m5611q2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: S0 */
    public void mo5013S0(RecyclerView recyclerView) {
        this.f4604E.m5640b();
        m5474t1();
    }

    /* renamed from: S1 */
    boolean m5626S1() {
        int m5630j2;
        int m5631k2;
        if (m5411J() == 0 || this.f4605F == 0 || !m5471r0()) {
            return false;
        }
        if (this.f4600A) {
            m5630j2 = m5631k2();
            m5631k2 = m5630j2();
        } else {
            m5630j2 = m5630j2();
            m5631k2 = m5631k2();
        }
        if (m5630j2 == 0 && m5632r2() != null) {
            this.f4604E.m5640b();
            m5476u1();
            m5474t1();
            return true;
        }
        if (!this.f4612M) {
            return false;
        }
        int i10 = this.f4600A ? -1 : 1;
        int i11 = m5631k2 + 1;
        LazySpanLookup.FullSpanItem m5643e = this.f4604E.m5643e(m5630j2, i11, i10, true);
        if (m5643e == null) {
            this.f4612M = false;
            this.f4604E.m5642d(i11);
            return false;
        }
        LazySpanLookup.FullSpanItem m5643e2 = this.f4604E.m5643e(m5630j2, m5643e.f4626n, i10 * (-1), true);
        if (m5643e2 == null) {
            this.f4604E.m5642d(m5643e.f4626n);
        } else {
            this.f4604E.m5642d(m5643e2.f4626n + 1);
        }
        m5476u1();
        m5474t1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: T0 */
    public void mo5015T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        m5611q2(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: U0 */
    public void mo5017U0(RecyclerView recyclerView, int i10, int i11) {
        m5611q2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: W0 */
    public void mo5018W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        m5611q2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: X0 */
    public void mo5019X0(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        m5614w2(c0896w, c0871a0, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: Y0 */
    public void mo5020Y0(RecyclerView.C0871a0 c0871a0) {
        super.mo5020Y0(c0871a0);
        this.f4602C = -1;
        this.f4603D = Integer.MIN_VALUE;
        this.f4608I = null;
        this.f4611L.m5660c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0899z.b
    /* renamed from: a */
    public PointF mo5081a(int i10) {
        int m5591R1 = m5591R1(i10);
        PointF pointF = new PointF();
        if (m5591R1 == 0) {
            return null;
        }
        if (this.f4620w == 0) {
            pointF.x = m5591R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m5591R1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: c1 */
    public void mo5084c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f4608I = savedState;
            if (this.f4602C != -1) {
                savedState.m5654a();
                this.f4608I.m5655b();
            }
            m5474t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: d1 */
    public Parcelable mo5086d1() {
        int m5678p;
        int mo5817m;
        int[] iArr;
        if (this.f4608I != null) {
            return new SavedState(this.f4608I);
        }
        SavedState savedState = new SavedState();
        savedState.f4637u = this.f4623z;
        savedState.f4638v = this.f4606G;
        savedState.f4639w = this.f4607H;
        LazySpanLookup lazySpanLookup = this.f4604E;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.f4624a) != null) {
            savedState.f4635s = iArr;
            savedState.f4634r = iArr.length;
            savedState.f4636t = lazySpanLookup.f4625b;
        } else {
            savedState.f4634r = 0;
        }
        if (m5411J() > 0) {
            savedState.f4630n = this.f4606G ? m5631k2() : m5630j2();
            savedState.f4631o = m5629f2();
            int i10 = this.f4616s;
            savedState.f4632p = i10;
            savedState.f4633q = new int[i10];
            for (int i11 = 0; i11 < this.f4616s; i11++) {
                if (this.f4606G) {
                    m5678p = this.f4617t[i11].m5674l(Integer.MIN_VALUE);
                    if (m5678p != Integer.MIN_VALUE) {
                        mo5817m = this.f4618u.mo5813i();
                        m5678p -= mo5817m;
                        savedState.f4633q[i11] = m5678p;
                    } else {
                        savedState.f4633q[i11] = m5678p;
                    }
                } else {
                    m5678p = this.f4617t[i11].m5678p(Integer.MIN_VALUE);
                    if (m5678p != Integer.MIN_VALUE) {
                        mo5817m = this.f4618u.mo5817m();
                        m5678p -= mo5817m;
                        savedState.f4633q[i11] = m5678p;
                    } else {
                        savedState.f4633q[i11] = m5678p;
                    }
                }
            }
        } else {
            savedState.f4630n = -1;
            savedState.f4631o = -1;
            savedState.f4632p = 0;
        }
        return savedState;
    }

    /* renamed from: d2 */
    View m5627d2(boolean z10) {
        int mo5817m = this.f4618u.mo5817m();
        int mo5813i = this.f4618u.mo5813i();
        View view = null;
        for (int m5411J = m5411J() - 1; m5411J >= 0; m5411J--) {
            View m5410I = m5410I(m5411J);
            int mo5811g = this.f4618u.mo5811g(m5410I);
            int mo5808d = this.f4618u.mo5808d(m5410I);
            if (mo5808d > mo5817m && mo5811g < mo5813i) {
                if (mo5808d <= mo5813i || !z10) {
                    return m5410I;
                }
                if (view == null) {
                    view = m5410I;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: e1 */
    public void mo5445e1(int i10) {
        if (i10 == 0) {
            m5626S1();
        }
    }

    /* renamed from: e2 */
    View m5628e2(boolean z10) {
        int mo5817m = this.f4618u.mo5817m();
        int mo5813i = this.f4618u.mo5813i();
        int m5411J = m5411J();
        View view = null;
        for (int i10 = 0; i10 < m5411J; i10++) {
            View m5410I = m5410I(i10);
            int mo5811g = this.f4618u.mo5811g(m5410I);
            if (this.f4618u.mo5808d(m5410I) > mo5817m && mo5811g < mo5813i) {
                if (mo5811g >= mo5817m || !z10) {
                    return m5410I;
                }
                if (view == null) {
                    view = m5410I;
                }
            }
        }
        return view;
    }

    /* renamed from: f2 */
    int m5629f2() {
        View m5627d2 = this.f4600A ? m5627d2(true) : m5628e2(true);
        if (m5627d2 == null) {
            return -1;
        }
        return m5451h0(m5627d2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: g */
    public void mo5087g(String str) {
        if (this.f4608I == null) {
            super.mo5087g(str);
        }
    }

    /* renamed from: j2 */
    int m5630j2() {
        if (m5411J() == 0) {
            return 0;
        }
        return m5451h0(m5410I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: k */
    public boolean mo5088k() {
        return this.f4620w == 0;
    }

    /* renamed from: k2 */
    int m5631k2() {
        int m5411J = m5411J();
        if (m5411J == 0) {
            return 0;
        }
        return m5451h0(m5410I(m5411J - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: l */
    public boolean mo5090l() {
        return this.f4620w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: m */
    public boolean mo5024m(RecyclerView.C0890q c0890q) {
        return c0890q instanceof C0904c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: o */
    public void mo5094o(int i10, int i11, RecyclerView.C0871a0 c0871a0, RecyclerView.AbstractC0889p.c cVar) {
        int m5674l;
        int i12;
        if (this.f4620w != 0) {
            i10 = i11;
        }
        if (m5411J() == 0 || i10 == 0) {
            return;
        }
        m5635y2(i10, c0871a0);
        int[] iArr = this.f4614O;
        if (iArr == null || iArr.length < this.f4616s) {
            this.f4614O = new int[this.f4616s];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f4616s; i14++) {
            C0911f c0911f = this.f4622y;
            if (c0911f.f4778d == -1) {
                m5674l = c0911f.f4780f;
                i12 = this.f4617t[i14].m5678p(m5674l);
            } else {
                m5674l = this.f4617t[i14].m5674l(c0911f.f4781g);
                i12 = this.f4622y.f4781g;
            }
            int i15 = m5674l - i12;
            if (i15 >= 0) {
                this.f4614O[i13] = i15;
                i13++;
            }
        }
        Arrays.sort(this.f4614O, 0, i13);
        for (int i16 = 0; i16 < i13 && this.f4622y.m5786a(c0871a0); i16++) {
            cVar.mo5490a(this.f4622y.f4777c, this.f4614O[i16]);
            C0911f c0911f2 = this.f4622y;
            c0911f2.f4777c += c0911f2.f4778d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: q */
    public int mo5096q(RecyclerView.C0871a0 c0871a0) {
        return m5594U1(c0871a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: r */
    public int mo5027r(RecyclerView.C0871a0 c0871a0) {
        return m5595V1(c0871a0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* renamed from: r2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View m5632r2() {
        /*
            r12 = this;
            int r0 = r12.m5411J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4616s
            r2.<init>(r3)
            int r3 = r12.f4616s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4620w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.m5634t2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.f4600A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.m5410I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0904c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f4648e
            int r9 = r9.f4654e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f4648e
            boolean r9 = r12.m5593T1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f4648e
            int r9 = r9.f4654e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f4649f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.m5410I(r9)
            boolean r10 = r12.f4600A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.i r10 = r12.f4618u
            int r10 = r10.mo5808d(r7)
            androidx.recyclerview.widget.i r11 = r12.f4618u
            int r11 = r11.mo5808d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.i r10 = r12.f4618u
            int r10 = r10.mo5811g(r7)
            androidx.recyclerview.widget.i r11 = r12.f4618u
            int r11 = r11.mo5811g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0904c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f4648e
            int r8 = r8.f4654e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f4648e
            int r9 = r9.f4654e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5632r2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: s */
    public int mo5028s(RecyclerView.C0871a0 c0871a0) {
        return m5596W1(c0871a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: s0 */
    public boolean mo5097s0() {
        return this.f4605F != 0;
    }

    /* renamed from: s2 */
    public void m5633s2() {
        this.f4604E.m5640b();
        m5474t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: t */
    public int mo5098t(RecyclerView.C0871a0 c0871a0) {
        return m5594U1(c0871a0);
    }

    /* renamed from: t2 */
    boolean m5634t2() {
        return m5432Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: u */
    public int mo5029u(RecyclerView.C0871a0 c0871a0) {
        return m5595V1(c0871a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: v */
    public int mo5030v(RecyclerView.C0871a0 c0871a0) {
        return m5596W1(c0871a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: w1 */
    public int mo5031w1(int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        return m5617F2(i10, c0896w, c0871a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: x1 */
    public void mo5100x1(int i10) {
        SavedState savedState = this.f4608I;
        if (savedState != null && savedState.f4630n != i10) {
            savedState.m5654a();
        }
        this.f4602C = i10;
        this.f4603D = Integer.MIN_VALUE;
        m5474t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: y1 */
    public int mo5032y1(int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        return m5617F2(i10, c0896w, c0871a0);
    }

    /* renamed from: y2 */
    void m5635y2(int i10, RecyclerView.C0871a0 c0871a0) {
        int m5630j2;
        int i11;
        if (i10 > 0) {
            m5630j2 = m5631k2();
            i11 = 1;
        } else {
            m5630j2 = m5630j2();
            i11 = -1;
        }
        this.f4622y.f4775a = true;
        m5588O2(m5630j2, c0871a0);
        m5583G2(i11);
        C0911f c0911f = this.f4622y;
        c0911f.f4777c = m5630j2 + c0911f.f4778d;
        c0911f.f4776b = Math.abs(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class LazySpanLookup {

        /* renamed from: a */
        int[] f4624a;

        /* renamed from: b */
        List<FullSpanItem> f4625b;

        LazySpanLookup() {
        }

        /* renamed from: i */
        private int m5636i(int i10) {
            if (this.f4625b == null) {
                return -1;
            }
            FullSpanItem m5644f = m5644f(i10);
            if (m5644f != null) {
                this.f4625b.remove(m5644f);
            }
            int size = this.f4625b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.f4625b.get(i11).f4626n >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f4625b.get(i11);
            this.f4625b.remove(i11);
            return fullSpanItem.f4626n;
        }

        /* renamed from: l */
        private void m5637l(int i10, int i11) {
            List<FullSpanItem> list = this.f4625b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4625b.get(size);
                int i12 = fullSpanItem.f4626n;
                if (i12 >= i10) {
                    fullSpanItem.f4626n = i12 + i11;
                }
            }
        }

        /* renamed from: m */
        private void m5638m(int i10, int i11) {
            List<FullSpanItem> list = this.f4625b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4625b.get(size);
                int i13 = fullSpanItem.f4626n;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f4625b.remove(size);
                    } else {
                        fullSpanItem.f4626n = i13 - i11;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m5639a(FullSpanItem fullSpanItem) {
            if (this.f4625b == null) {
                this.f4625b = new ArrayList();
            }
            int size = this.f4625b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.f4625b.get(i10);
                if (fullSpanItem2.f4626n == fullSpanItem.f4626n) {
                    this.f4625b.remove(i10);
                }
                if (fullSpanItem2.f4626n >= fullSpanItem.f4626n) {
                    this.f4625b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f4625b.add(fullSpanItem);
        }

        /* renamed from: b */
        void m5640b() {
            int[] iArr = this.f4624a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4625b = null;
        }

        /* renamed from: c */
        void m5641c(int i10) {
            int[] iArr = this.f4624a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f4624a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[m5650o(i10)];
                this.f4624a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4624a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        int m5642d(int i10) {
            List<FullSpanItem> list = this.f4625b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4625b.get(size).f4626n >= i10) {
                        this.f4625b.remove(size);
                    }
                }
            }
            return m5646h(i10);
        }

        /* renamed from: e */
        public FullSpanItem m5643e(int i10, int i11, int i12, boolean z10) {
            List<FullSpanItem> list = this.f4625b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.f4625b.get(i13);
                int i14 = fullSpanItem.f4626n;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.f4627o == i12 || (z10 && fullSpanItem.f4629q))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem m5644f(int i10) {
            List<FullSpanItem> list = this.f4625b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4625b.get(size);
                if (fullSpanItem.f4626n == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        int m5645g(int i10) {
            int[] iArr = this.f4624a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        /* renamed from: h */
        int m5646h(int i10) {
            int[] iArr = this.f4624a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int m5636i = m5636i(i10);
            if (m5636i == -1) {
                int[] iArr2 = this.f4624a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f4624a.length;
            }
            int min = Math.min(m5636i + 1, this.f4624a.length);
            Arrays.fill(this.f4624a, i10, min, -1);
            return min;
        }

        /* renamed from: j */
        void m5647j(int i10, int i11) {
            int[] iArr = this.f4624a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            m5641c(i12);
            int[] iArr2 = this.f4624a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f4624a, i10, i12, -1);
            m5637l(i10, i11);
        }

        /* renamed from: k */
        void m5648k(int i10, int i11) {
            int[] iArr = this.f4624a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            m5641c(i12);
            int[] iArr2 = this.f4624a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f4624a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m5638m(i10, i11);
        }

        /* renamed from: n */
        void m5649n(int i10, C0905d c0905d) {
            m5641c(i10);
            this.f4624a[i10] = c0905d.f4654e;
        }

        /* renamed from: o */
        int m5650o(int i10) {
            int length = this.f4624a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0900a();

            /* renamed from: n */
            int f4626n;

            /* renamed from: o */
            int f4627o;

            /* renamed from: p */
            int[] f4628p;

            /* renamed from: q */
            boolean f4629q;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            /* loaded from: classes.dex */
            class C0900a implements Parcelable.Creator<FullSpanItem> {
                C0900a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f4626n = parcel.readInt();
                this.f4627o = parcel.readInt();
                this.f4629q = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4628p = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m5651a(int i10) {
                int[] iArr = this.f4628p;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4626n + ", mGapDir=" + this.f4627o + ", mHasUnwantedGapAfter=" + this.f4629q + ", mGapPerSpan=" + Arrays.toString(this.f4628p) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f4626n);
                parcel.writeInt(this.f4627o);
                parcel.writeInt(this.f4629q ? 1 : 0);
                int[] iArr = this.f4628p;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4628p);
                } else {
                    parcel.writeInt(0);
                }
            }

            FullSpanItem() {
            }
        }
    }
}
