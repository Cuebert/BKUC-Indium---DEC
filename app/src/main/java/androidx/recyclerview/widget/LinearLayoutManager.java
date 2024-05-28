package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0889p implements RecyclerView.AbstractC0899z.b {

    /* renamed from: A */
    int f4346A;

    /* renamed from: B */
    int f4347B;

    /* renamed from: C */
    private boolean f4348C;

    /* renamed from: D */
    SavedState f4349D;

    /* renamed from: E */
    final C0866a f4350E;

    /* renamed from: F */
    private final C0867b f4351F;

    /* renamed from: G */
    private int f4352G;

    /* renamed from: H */
    private int[] f4353H;

    /* renamed from: s */
    int f4354s;

    /* renamed from: t */
    private C0868c f4355t;

    /* renamed from: u */
    AbstractC0914i f4356u;

    /* renamed from: v */
    private boolean f4357v;

    /* renamed from: w */
    private boolean f4358w;

    /* renamed from: x */
    boolean f4359x;

    /* renamed from: y */
    private boolean f4360y;

    /* renamed from: z */
    private boolean f4361z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0865a();

        /* renamed from: n */
        int f4362n;

        /* renamed from: o */
        int f4363o;

        /* renamed from: p */
        boolean f4364p;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        /* loaded from: classes.dex */
        class C0865a implements Parcelable.Creator<SavedState> {
            C0865a() {
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
        boolean m5104a() {
            return this.f4362n >= 0;
        }

        /* renamed from: b */
        void m5105b() {
            this.f4362n = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4362n);
            parcel.writeInt(this.f4363o);
            parcel.writeInt(this.f4364p ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f4362n = parcel.readInt();
            this.f4363o = parcel.readInt();
            this.f4364p = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f4362n = savedState.f4362n;
            this.f4363o = savedState.f4363o;
            this.f4364p = savedState.f4364p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C0866a {

        /* renamed from: a */
        AbstractC0914i f4365a;

        /* renamed from: b */
        int f4366b;

        /* renamed from: c */
        int f4367c;

        /* renamed from: d */
        boolean f4368d;

        /* renamed from: e */
        boolean f4369e;

        C0866a() {
            m5112e();
        }

        /* renamed from: a */
        void m5108a() {
            int mo5817m;
            if (this.f4368d) {
                mo5817m = this.f4365a.mo5813i();
            } else {
                mo5817m = this.f4365a.mo5817m();
            }
            this.f4367c = mo5817m;
        }

        /* renamed from: b */
        public void m5109b(View view, int i10) {
            if (this.f4368d) {
                this.f4367c = this.f4365a.mo5808d(view) + this.f4365a.m5819o();
            } else {
                this.f4367c = this.f4365a.mo5811g(view);
            }
            this.f4366b = i10;
        }

        /* renamed from: c */
        public void m5110c(View view, int i10) {
            int m5819o = this.f4365a.m5819o();
            if (m5819o >= 0) {
                m5109b(view, i10);
                return;
            }
            this.f4366b = i10;
            if (this.f4368d) {
                int mo5813i = (this.f4365a.mo5813i() - m5819o) - this.f4365a.mo5808d(view);
                this.f4367c = this.f4365a.mo5813i() - mo5813i;
                if (mo5813i > 0) {
                    int mo5809e = this.f4367c - this.f4365a.mo5809e(view);
                    int mo5817m = this.f4365a.mo5817m();
                    int min = mo5809e - (mo5817m + Math.min(this.f4365a.mo5811g(view) - mo5817m, 0));
                    if (min < 0) {
                        this.f4367c += Math.min(mo5813i, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo5811g = this.f4365a.mo5811g(view);
            int mo5817m2 = mo5811g - this.f4365a.mo5817m();
            this.f4367c = mo5811g;
            if (mo5817m2 > 0) {
                int mo5813i2 = (this.f4365a.mo5813i() - Math.min(0, (this.f4365a.mo5813i() - m5819o) - this.f4365a.mo5808d(view))) - (mo5811g + this.f4365a.mo5809e(view));
                if (mo5813i2 < 0) {
                    this.f4367c -= Math.min(mo5817m2, -mo5813i2);
                }
            }
        }

        /* renamed from: d */
        boolean m5111d(View view, RecyclerView.C0871a0 c0871a0) {
            RecyclerView.C0890q c0890q = (RecyclerView.C0890q) view.getLayoutParams();
            return !c0890q.m5493c() && c0890q.m5491a() >= 0 && c0890q.m5491a() < c0871a0.m5251b();
        }

        /* renamed from: e */
        void m5112e() {
            this.f4366b = -1;
            this.f4367c = Integer.MIN_VALUE;
            this.f4368d = false;
            this.f4369e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4366b + ", mCoordinate=" + this.f4367c + ", mLayoutFromEnd=" + this.f4368d + ", mValid=" + this.f4369e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0867b {

        /* renamed from: a */
        public int f4370a;

        /* renamed from: b */
        public boolean f4371b;

        /* renamed from: c */
        public boolean f4372c;

        /* renamed from: d */
        public boolean f4373d;

        protected C0867b() {
        }

        /* renamed from: a */
        void m5113a() {
            this.f4370a = 0;
            this.f4371b = false;
            this.f4372c = false;
            this.f4373d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0868c {

        /* renamed from: b */
        int f4375b;

        /* renamed from: c */
        int f4376c;

        /* renamed from: d */
        int f4377d;

        /* renamed from: e */
        int f4378e;

        /* renamed from: f */
        int f4379f;

        /* renamed from: g */
        int f4380g;

        /* renamed from: k */
        int f4384k;

        /* renamed from: m */
        boolean f4386m;

        /* renamed from: a */
        boolean f4374a = true;

        /* renamed from: h */
        int f4381h = 0;

        /* renamed from: i */
        int f4382i = 0;

        /* renamed from: j */
        boolean f4383j = false;

        /* renamed from: l */
        List<RecyclerView.AbstractC0877d0> f4385l = null;

        C0868c() {
        }

        /* renamed from: e */
        private View m5114e() {
            int size = this.f4385l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f4385l.get(i10).f4502a;
                RecyclerView.C0890q c0890q = (RecyclerView.C0890q) view.getLayoutParams();
                if (!c0890q.m5493c() && this.f4377d == c0890q.m5491a()) {
                    m5116b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m5115a() {
            m5116b(null);
        }

        /* renamed from: b */
        public void m5116b(View view) {
            View m5119f = m5119f(view);
            if (m5119f == null) {
                this.f4377d = -1;
            } else {
                this.f4377d = ((RecyclerView.C0890q) m5119f.getLayoutParams()).m5491a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m5117c(RecyclerView.C0871a0 c0871a0) {
            int i10 = this.f4377d;
            return i10 >= 0 && i10 < c0871a0.m5251b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public View m5118d(RecyclerView.C0896w c0896w) {
            if (this.f4385l != null) {
                return m5114e();
            }
            View m5544o = c0896w.m5544o(this.f4377d);
            this.f4377d += this.f4378e;
            return m5544o;
        }

        /* renamed from: f */
        public View m5119f(View view) {
            int m5491a;
            int size = this.f4385l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f4385l.get(i11).f4502a;
                RecyclerView.C0890q c0890q = (RecyclerView.C0890q) view3.getLayoutParams();
                if (view3 != view && !c0890q.m5493c() && (m5491a = (c0890q.m5491a() - this.f4377d) * this.f4378e) >= 0 && m5491a < i10) {
                    view2 = view3;
                    if (m5491a == 0) {
                        break;
                    }
                    i10 = m5491a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f4354s = 1;
        this.f4358w = false;
        this.f4359x = false;
        this.f4360y = false;
        this.f4361z = true;
        this.f4346A = -1;
        this.f4347B = Integer.MIN_VALUE;
        this.f4349D = null;
        this.f4350E = new C0866a();
        this.f4351F = new C0867b();
        this.f4352G = 2;
        this.f4353H = new int[2];
        m5102y2(i10);
        m5103z2(z10);
    }

    /* renamed from: B2 */
    private boolean m5043B2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, C0866a c0866a) {
        View mo5022f2;
        boolean z10 = false;
        if (m5411J() == 0) {
            return false;
        }
        View m5427V = m5427V();
        if (m5427V != null && c0866a.m5111d(m5427V, c0871a0)) {
            c0866a.m5110c(m5427V, m5451h0(m5427V));
            return true;
        }
        boolean z11 = this.f4357v;
        boolean z12 = this.f4360y;
        if (z11 != z12 || (mo5022f2 = mo5022f2(c0896w, c0871a0, c0866a.f4368d, z12)) == null) {
            return false;
        }
        c0866a.m5109b(mo5022f2, m5451h0(mo5022f2));
        if (!c0871a0.m5254e() && mo5008L1()) {
            int mo5811g = this.f4356u.mo5811g(mo5022f2);
            int mo5808d = this.f4356u.mo5808d(mo5022f2);
            int mo5817m = this.f4356u.mo5817m();
            int mo5813i = this.f4356u.mo5813i();
            boolean z13 = mo5808d <= mo5817m && mo5811g < mo5817m;
            if (mo5811g >= mo5813i && mo5808d > mo5813i) {
                z10 = true;
            }
            if (z13 || z10) {
                if (c0866a.f4368d) {
                    mo5817m = mo5813i;
                }
                c0866a.f4367c = mo5817m;
            }
        }
        return true;
    }

    /* renamed from: C2 */
    private boolean m5044C2(RecyclerView.C0871a0 c0871a0, C0866a c0866a) {
        int i10;
        int mo5811g;
        if (!c0871a0.m5254e() && (i10 = this.f4346A) != -1) {
            if (i10 >= 0 && i10 < c0871a0.m5251b()) {
                c0866a.f4366b = this.f4346A;
                SavedState savedState = this.f4349D;
                if (savedState != null && savedState.m5104a()) {
                    boolean z10 = this.f4349D.f4364p;
                    c0866a.f4368d = z10;
                    if (z10) {
                        c0866a.f4367c = this.f4356u.mo5813i() - this.f4349D.f4363o;
                    } else {
                        c0866a.f4367c = this.f4356u.mo5817m() + this.f4349D.f4363o;
                    }
                    return true;
                }
                if (this.f4347B == Integer.MIN_VALUE) {
                    View mo5068C = mo5068C(this.f4346A);
                    if (mo5068C != null) {
                        if (this.f4356u.mo5809e(mo5068C) > this.f4356u.mo5818n()) {
                            c0866a.m5108a();
                            return true;
                        }
                        if (this.f4356u.mo5811g(mo5068C) - this.f4356u.mo5817m() < 0) {
                            c0866a.f4367c = this.f4356u.mo5817m();
                            c0866a.f4368d = false;
                            return true;
                        }
                        if (this.f4356u.mo5813i() - this.f4356u.mo5808d(mo5068C) < 0) {
                            c0866a.f4367c = this.f4356u.mo5813i();
                            c0866a.f4368d = true;
                            return true;
                        }
                        if (c0866a.f4368d) {
                            mo5811g = this.f4356u.mo5808d(mo5068C) + this.f4356u.m5819o();
                        } else {
                            mo5811g = this.f4356u.mo5811g(mo5068C);
                        }
                        c0866a.f4367c = mo5811g;
                    } else {
                        if (m5411J() > 0) {
                            c0866a.f4368d = (this.f4346A < m5451h0(m5410I(0))) == this.f4359x;
                        }
                        c0866a.m5108a();
                    }
                    return true;
                }
                boolean z11 = this.f4359x;
                c0866a.f4368d = z11;
                if (z11) {
                    c0866a.f4367c = this.f4356u.mo5813i() - this.f4347B;
                } else {
                    c0866a.f4367c = this.f4356u.mo5817m() + this.f4347B;
                }
                return true;
            }
            this.f4346A = -1;
            this.f4347B = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: D2 */
    private void m5045D2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, C0866a c0866a) {
        if (m5044C2(c0871a0, c0866a) || m5043B2(c0896w, c0871a0, c0866a)) {
            return;
        }
        c0866a.m5108a();
        c0866a.f4366b = this.f4360y ? c0871a0.m5251b() - 1 : 0;
    }

    /* renamed from: E2 */
    private void m5046E2(int i10, int i11, boolean z10, RecyclerView.C0871a0 c0871a0) {
        int mo5817m;
        this.f4355t.f4386m = m5099v2();
        this.f4355t.f4379f = i10;
        int[] iArr = this.f4353H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5073M1(c0871a0, iArr);
        int max = Math.max(0, this.f4353H[0]);
        int max2 = Math.max(0, this.f4353H[1]);
        boolean z11 = i10 == 1;
        C0868c c0868c = this.f4355t;
        int i12 = z11 ? max2 : max;
        c0868c.f4381h = i12;
        if (!z11) {
            max = max2;
        }
        c0868c.f4382i = max;
        if (z11) {
            c0868c.f4381h = i12 + this.f4356u.mo5814j();
            View m5060i2 = m5060i2();
            C0868c c0868c2 = this.f4355t;
            c0868c2.f4378e = this.f4359x ? -1 : 1;
            int m5451h0 = m5451h0(m5060i2);
            C0868c c0868c3 = this.f4355t;
            c0868c2.f4377d = m5451h0 + c0868c3.f4378e;
            c0868c3.f4375b = this.f4356u.mo5808d(m5060i2);
            mo5817m = this.f4356u.mo5808d(m5060i2) - this.f4356u.mo5813i();
        } else {
            View m5061j2 = m5061j2();
            this.f4355t.f4381h += this.f4356u.mo5817m();
            C0868c c0868c4 = this.f4355t;
            c0868c4.f4378e = this.f4359x ? 1 : -1;
            int m5451h02 = m5451h0(m5061j2);
            C0868c c0868c5 = this.f4355t;
            c0868c4.f4377d = m5451h02 + c0868c5.f4378e;
            c0868c5.f4375b = this.f4356u.mo5811g(m5061j2);
            mo5817m = (-this.f4356u.mo5811g(m5061j2)) + this.f4356u.mo5817m();
        }
        C0868c c0868c6 = this.f4355t;
        c0868c6.f4376c = i11;
        if (z10) {
            c0868c6.f4376c = i11 - mo5817m;
        }
        c0868c6.f4380g = mo5817m;
    }

    /* renamed from: F2 */
    private void m5047F2(int i10, int i11) {
        this.f4355t.f4376c = this.f4356u.mo5813i() - i11;
        C0868c c0868c = this.f4355t;
        c0868c.f4378e = this.f4359x ? -1 : 1;
        c0868c.f4377d = i10;
        c0868c.f4379f = 1;
        c0868c.f4375b = i11;
        c0868c.f4380g = Integer.MIN_VALUE;
    }

    /* renamed from: G2 */
    private void m5048G2(C0866a c0866a) {
        m5047F2(c0866a.f4366b, c0866a.f4367c);
    }

    /* renamed from: H2 */
    private void m5049H2(int i10, int i11) {
        this.f4355t.f4376c = i11 - this.f4356u.mo5817m();
        C0868c c0868c = this.f4355t;
        c0868c.f4377d = i10;
        c0868c.f4378e = this.f4359x ? 1 : -1;
        c0868c.f4379f = -1;
        c0868c.f4375b = i11;
        c0868c.f4380g = Integer.MIN_VALUE;
    }

    /* renamed from: I2 */
    private void m5050I2(C0866a c0866a) {
        m5049H2(c0866a.f4366b, c0866a.f4367c);
    }

    /* renamed from: O1 */
    private int m5051O1(RecyclerView.C0871a0 c0871a0) {
        if (m5411J() == 0) {
            return 0;
        }
        m5076T1();
        return C0917l.m5839a(c0871a0, this.f4356u, m5079X1(!this.f4361z, true), m5078W1(!this.f4361z, true), this, this.f4361z);
    }

    /* renamed from: P1 */
    private int m5052P1(RecyclerView.C0871a0 c0871a0) {
        if (m5411J() == 0) {
            return 0;
        }
        m5076T1();
        return C0917l.m5840b(c0871a0, this.f4356u, m5079X1(!this.f4361z, true), m5078W1(!this.f4361z, true), this, this.f4361z, this.f4359x);
    }

    /* renamed from: Q1 */
    private int m5053Q1(RecyclerView.C0871a0 c0871a0) {
        if (m5411J() == 0) {
            return 0;
        }
        m5076T1();
        return C0917l.m5841c(c0871a0, this.f4356u, m5079X1(!this.f4361z, true), m5078W1(!this.f4361z, true), this, this.f4361z);
    }

    /* renamed from: V1 */
    private View m5054V1() {
        return m5083b2(0, m5411J());
    }

    /* renamed from: Z1 */
    private View m5055Z1() {
        return m5083b2(m5411J() - 1, -1);
    }

    /* renamed from: d2 */
    private View m5056d2() {
        return this.f4359x ? m5054V1() : m5055Z1();
    }

    /* renamed from: e2 */
    private View m5057e2() {
        return this.f4359x ? m5055Z1() : m5054V1();
    }

    /* renamed from: g2 */
    private int m5058g2(int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, boolean z10) {
        int mo5813i;
        int mo5813i2 = this.f4356u.mo5813i() - i10;
        if (mo5813i2 <= 0) {
            return 0;
        }
        int i11 = -m5101x2(-mo5813i2, c0896w, c0871a0);
        int i12 = i10 + i11;
        if (!z10 || (mo5813i = this.f4356u.mo5813i() - i12) <= 0) {
            return i11;
        }
        this.f4356u.mo5822r(mo5813i);
        return mo5813i + i11;
    }

    /* renamed from: h2 */
    private int m5059h2(int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, boolean z10) {
        int mo5817m;
        int mo5817m2 = i10 - this.f4356u.mo5817m();
        if (mo5817m2 <= 0) {
            return 0;
        }
        int i11 = -m5101x2(mo5817m2, c0896w, c0871a0);
        int i12 = i10 + i11;
        if (!z10 || (mo5817m = i12 - this.f4356u.mo5817m()) <= 0) {
            return i11;
        }
        this.f4356u.mo5822r(-mo5817m);
        return i11 - mo5817m;
    }

    /* renamed from: i2 */
    private View m5060i2() {
        return m5410I(this.f4359x ? 0 : m5411J() - 1);
    }

    /* renamed from: j2 */
    private View m5061j2() {
        return m5410I(this.f4359x ? m5411J() - 1 : 0);
    }

    /* renamed from: p2 */
    private void m5062p2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, int i10, int i11) {
        if (!c0871a0.m5256g() || m5411J() == 0 || c0871a0.m5254e() || !mo5008L1()) {
            return;
        }
        List<RecyclerView.AbstractC0877d0> m5540k = c0896w.m5540k();
        int size = m5540k.size();
        int m5451h0 = m5451h0(m5410I(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.AbstractC0877d0 abstractC0877d0 = m5540k.get(i14);
            if (!abstractC0877d0.m5300v()) {
                if (((abstractC0877d0.m5291m() < m5451h0) != this.f4359x ? (char) 65535 : (char) 1) == 65535) {
                    i12 += this.f4356u.mo5809e(abstractC0877d0.f4502a);
                } else {
                    i13 += this.f4356u.mo5809e(abstractC0877d0.f4502a);
                }
            }
        }
        this.f4355t.f4385l = m5540k;
        if (i12 > 0) {
            m5049H2(m5451h0(m5061j2()), i10);
            C0868c c0868c = this.f4355t;
            c0868c.f4381h = i12;
            c0868c.f4376c = 0;
            c0868c.m5115a();
            m5077U1(c0896w, this.f4355t, c0871a0, false);
        }
        if (i13 > 0) {
            m5047F2(m5451h0(m5060i2()), i11);
            C0868c c0868c2 = this.f4355t;
            c0868c2.f4381h = i13;
            c0868c2.f4376c = 0;
            c0868c2.m5115a();
            m5077U1(c0896w, this.f4355t, c0871a0, false);
        }
        this.f4355t.f4385l = null;
    }

    /* renamed from: r2 */
    private void m5063r2(RecyclerView.C0896w c0896w, C0868c c0868c) {
        if (!c0868c.f4374a || c0868c.f4386m) {
            return;
        }
        int i10 = c0868c.f4380g;
        int i11 = c0868c.f4382i;
        if (c0868c.f4379f == -1) {
            m5065t2(c0896w, i10, i11);
        } else {
            m5066u2(c0896w, i10, i11);
        }
    }

    /* renamed from: s2 */
    private void m5064s2(RecyclerView.C0896w c0896w, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                m5464n1(i10, c0896w);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                m5464n1(i12, c0896w);
            }
        }
    }

    /* renamed from: t2 */
    private void m5065t2(RecyclerView.C0896w c0896w, int i10, int i11) {
        int m5411J = m5411J();
        if (i10 < 0) {
            return;
        }
        int mo5812h = (this.f4356u.mo5812h() - i10) + i11;
        if (this.f4359x) {
            for (int i12 = 0; i12 < m5411J; i12++) {
                View m5410I = m5410I(i12);
                if (this.f4356u.mo5811g(m5410I) < mo5812h || this.f4356u.mo5821q(m5410I) < mo5812h) {
                    m5064s2(c0896w, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = m5411J - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View m5410I2 = m5410I(i14);
            if (this.f4356u.mo5811g(m5410I2) < mo5812h || this.f4356u.mo5821q(m5410I2) < mo5812h) {
                m5064s2(c0896w, i13, i14);
                return;
            }
        }
    }

    /* renamed from: u2 */
    private void m5066u2(RecyclerView.C0896w c0896w, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int m5411J = m5411J();
        if (!this.f4359x) {
            for (int i13 = 0; i13 < m5411J; i13++) {
                View m5410I = m5410I(i13);
                if (this.f4356u.mo5808d(m5410I) > i12 || this.f4356u.mo5820p(m5410I) > i12) {
                    m5064s2(c0896w, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = m5411J - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View m5410I2 = m5410I(i15);
            if (this.f4356u.mo5808d(m5410I2) > i12 || this.f4356u.mo5820p(m5410I2) > i12) {
                m5064s2(c0896w, i14, i15);
                return;
            }
        }
    }

    /* renamed from: w2 */
    private void m5067w2() {
        if (this.f4354s != 1 && m5092m2()) {
            this.f4359x = !this.f4358w;
        } else {
            this.f4359x = this.f4358w;
        }
    }

    /* renamed from: A2 */
    public void mo5002A2(boolean z10) {
        mo5087g(null);
        if (this.f4360y == z10) {
            return;
        }
        this.f4360y = z10;
        m5474t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: C */
    public View mo5068C(int i10) {
        int m5411J = m5411J();
        if (m5411J == 0) {
            return null;
        }
        int m5451h0 = i10 - m5451h0(m5410I(0));
        if (m5451h0 >= 0 && m5451h0 < m5411J) {
            View m5410I = m5410I(m5451h0);
            if (m5451h0(m5410I) == i10) {
                return m5410I;
            }
        }
        return super.mo5068C(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: D */
    public RecyclerView.C0890q mo5004D() {
        return new RecyclerView.C0890q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: G1 */
    boolean mo5069G1() {
        return (m5430X() == 1073741824 || m5467p0() == 1073741824 || !m5469q0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: I0 */
    public void mo5070I0(RecyclerView recyclerView, RecyclerView.C0896w c0896w) {
        super.mo5070I0(recyclerView, c0896w);
        if (this.f4348C) {
            m5458k1(c0896w);
            c0896w.m5532c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: I1 */
    public void mo5071I1(RecyclerView recyclerView, RecyclerView.C0871a0 c0871a0, int i10) {
        C0912g c0912g = new C0912g(recyclerView.getContext());
        c0912g.m5570p(i10);
        m5412J1(c0912g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: J0 */
    public View mo5007J0(View view, int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        int m5074R1;
        View m5056d2;
        View m5060i2;
        m5067w2();
        if (m5411J() == 0 || (m5074R1 = m5074R1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        m5076T1();
        m5046E2(m5074R1, (int) (this.f4356u.mo5818n() * 0.33333334f), false, c0871a0);
        C0868c c0868c = this.f4355t;
        c0868c.f4380g = Integer.MIN_VALUE;
        c0868c.f4374a = false;
        m5077U1(c0896w, c0868c, c0871a0, true);
        if (m5074R1 == -1) {
            m5056d2 = m5057e2();
        } else {
            m5056d2 = m5056d2();
        }
        if (m5074R1 == -1) {
            m5060i2 = m5061j2();
        } else {
            m5060i2 = m5060i2();
        }
        if (!m5060i2.hasFocusable()) {
            return m5056d2;
        }
        if (m5056d2 == null) {
            return null;
        }
        return m5060i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: K0 */
    public void mo5072K0(AccessibilityEvent accessibilityEvent) {
        super.mo5072K0(accessibilityEvent);
        if (m5411J() > 0) {
            accessibilityEvent.setFromIndex(m5080Y1());
            accessibilityEvent.setToIndex(m5082a2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: L1 */
    public boolean mo5008L1() {
        return this.f4349D == null && this.f4357v == this.f4360y;
    }

    /* renamed from: M1 */
    protected void mo5073M1(RecyclerView.C0871a0 c0871a0, int[] iArr) {
        int i10;
        int m5089k2 = m5089k2(c0871a0);
        if (this.f4355t.f4379f == -1) {
            i10 = 0;
        } else {
            i10 = m5089k2;
            m5089k2 = 0;
        }
        iArr[0] = m5089k2;
        iArr[1] = i10;
    }

    /* renamed from: N1 */
    void mo5010N1(RecyclerView.C0871a0 c0871a0, C0868c c0868c, RecyclerView.AbstractC0889p.c cVar) {
        int i10 = c0868c.f4377d;
        if (i10 < 0 || i10 >= c0871a0.m5251b()) {
            return;
        }
        cVar.mo5490a(i10, Math.max(0, c0868c.f4380g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R1 */
    public int m5074R1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f4354s == 1) ? 1 : Integer.MIN_VALUE : this.f4354s == 0 ? 1 : Integer.MIN_VALUE : this.f4354s == 1 ? -1 : Integer.MIN_VALUE : this.f4354s == 0 ? -1 : Integer.MIN_VALUE : (this.f4354s != 1 && m5092m2()) ? -1 : 1 : (this.f4354s != 1 && m5092m2()) ? 1 : -1;
    }

    /* renamed from: S1 */
    C0868c m5075S1() {
        return new C0868c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T1 */
    public void m5076T1() {
        if (this.f4355t == null) {
            this.f4355t = m5075S1();
        }
    }

    /* renamed from: U1 */
    int m5077U1(RecyclerView.C0896w c0896w, C0868c c0868c, RecyclerView.C0871a0 c0871a0, boolean z10) {
        int i10 = c0868c.f4376c;
        int i11 = c0868c.f4380g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                c0868c.f4380g = i11 + i10;
            }
            m5063r2(c0896w, c0868c);
        }
        int i12 = c0868c.f4376c + c0868c.f4381h;
        C0867b c0867b = this.f4351F;
        while (true) {
            if ((!c0868c.f4386m && i12 <= 0) || !c0868c.m5117c(c0871a0)) {
                break;
            }
            c0867b.m5113a();
            mo5025o2(c0896w, c0871a0, c0868c, c0867b);
            if (!c0867b.f4371b) {
                c0868c.f4375b += c0867b.f4370a * c0868c.f4379f;
                if (!c0867b.f4372c || c0868c.f4385l != null || !c0871a0.m5254e()) {
                    int i13 = c0868c.f4376c;
                    int i14 = c0867b.f4370a;
                    c0868c.f4376c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = c0868c.f4380g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + c0867b.f4370a;
                    c0868c.f4380g = i16;
                    int i17 = c0868c.f4376c;
                    if (i17 < 0) {
                        c0868c.f4380g = i16 + i17;
                    }
                    m5063r2(c0896w, c0868c);
                }
                if (z10 && c0867b.f4373d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - c0868c.f4376c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W1 */
    public View m5078W1(boolean z10, boolean z11) {
        if (this.f4359x) {
            return m5085c2(0, m5411J(), z10, z11);
        }
        return m5085c2(m5411J() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: X0 */
    public void mo5019X0(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        int i10;
        int i11;
        int i12;
        int i13;
        int m5058g2;
        int i14;
        View mo5068C;
        int mo5811g;
        int i15;
        int i16 = -1;
        if ((this.f4349D != null || this.f4346A != -1) && c0871a0.m5251b() == 0) {
            m5458k1(c0896w);
            return;
        }
        SavedState savedState = this.f4349D;
        if (savedState != null && savedState.m5104a()) {
            this.f4346A = this.f4349D.f4362n;
        }
        m5076T1();
        this.f4355t.f4374a = false;
        m5067w2();
        View m5427V = m5427V();
        C0866a c0866a = this.f4350E;
        if (c0866a.f4369e && this.f4346A == -1 && this.f4349D == null) {
            if (m5427V != null && (this.f4356u.mo5811g(m5427V) >= this.f4356u.mo5813i() || this.f4356u.mo5808d(m5427V) <= this.f4356u.mo5817m())) {
                this.f4350E.m5110c(m5427V, m5451h0(m5427V));
            }
        } else {
            c0866a.m5112e();
            C0866a c0866a2 = this.f4350E;
            c0866a2.f4368d = this.f4359x ^ this.f4360y;
            m5045D2(c0896w, c0871a0, c0866a2);
            this.f4350E.f4369e = true;
        }
        C0868c c0868c = this.f4355t;
        c0868c.f4379f = c0868c.f4384k >= 0 ? 1 : -1;
        int[] iArr = this.f4353H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5073M1(c0871a0, iArr);
        int max = Math.max(0, this.f4353H[0]) + this.f4356u.mo5817m();
        int max2 = Math.max(0, this.f4353H[1]) + this.f4356u.mo5814j();
        if (c0871a0.m5254e() && (i14 = this.f4346A) != -1 && this.f4347B != Integer.MIN_VALUE && (mo5068C = mo5068C(i14)) != null) {
            if (this.f4359x) {
                i15 = this.f4356u.mo5813i() - this.f4356u.mo5808d(mo5068C);
                mo5811g = this.f4347B;
            } else {
                mo5811g = this.f4356u.mo5811g(mo5068C) - this.f4356u.mo5817m();
                i15 = this.f4347B;
            }
            int i17 = i15 - mo5811g;
            if (i17 > 0) {
                max += i17;
            } else {
                max2 -= i17;
            }
        }
        C0866a c0866a3 = this.f4350E;
        if (!c0866a3.f4368d ? !this.f4359x : this.f4359x) {
            i16 = 1;
        }
        mo5026q2(c0896w, c0871a0, c0866a3, i16);
        m5478w(c0896w);
        this.f4355t.f4386m = m5099v2();
        this.f4355t.f4383j = c0871a0.m5254e();
        this.f4355t.f4382i = 0;
        C0866a c0866a4 = this.f4350E;
        if (c0866a4.f4368d) {
            m5050I2(c0866a4);
            C0868c c0868c2 = this.f4355t;
            c0868c2.f4381h = max;
            m5077U1(c0896w, c0868c2, c0871a0, false);
            C0868c c0868c3 = this.f4355t;
            i11 = c0868c3.f4375b;
            int i18 = c0868c3.f4377d;
            int i19 = c0868c3.f4376c;
            if (i19 > 0) {
                max2 += i19;
            }
            m5048G2(this.f4350E);
            C0868c c0868c4 = this.f4355t;
            c0868c4.f4381h = max2;
            c0868c4.f4377d += c0868c4.f4378e;
            m5077U1(c0896w, c0868c4, c0871a0, false);
            C0868c c0868c5 = this.f4355t;
            i10 = c0868c5.f4375b;
            int i20 = c0868c5.f4376c;
            if (i20 > 0) {
                m5049H2(i18, i11);
                C0868c c0868c6 = this.f4355t;
                c0868c6.f4381h = i20;
                m5077U1(c0896w, c0868c6, c0871a0, false);
                i11 = this.f4355t.f4375b;
            }
        } else {
            m5048G2(c0866a4);
            C0868c c0868c7 = this.f4355t;
            c0868c7.f4381h = max2;
            m5077U1(c0896w, c0868c7, c0871a0, false);
            C0868c c0868c8 = this.f4355t;
            i10 = c0868c8.f4375b;
            int i21 = c0868c8.f4377d;
            int i22 = c0868c8.f4376c;
            if (i22 > 0) {
                max += i22;
            }
            m5050I2(this.f4350E);
            C0868c c0868c9 = this.f4355t;
            c0868c9.f4381h = max;
            c0868c9.f4377d += c0868c9.f4378e;
            m5077U1(c0896w, c0868c9, c0871a0, false);
            C0868c c0868c10 = this.f4355t;
            i11 = c0868c10.f4375b;
            int i23 = c0868c10.f4376c;
            if (i23 > 0) {
                m5047F2(i21, i10);
                C0868c c0868c11 = this.f4355t;
                c0868c11.f4381h = i23;
                m5077U1(c0896w, c0868c11, c0871a0, false);
                i10 = this.f4355t.f4375b;
            }
        }
        if (m5411J() > 0) {
            if (this.f4359x ^ this.f4360y) {
                int m5058g22 = m5058g2(i10, c0896w, c0871a0, true);
                i12 = i11 + m5058g22;
                i13 = i10 + m5058g22;
                m5058g2 = m5059h2(i12, c0896w, c0871a0, false);
            } else {
                int m5059h2 = m5059h2(i11, c0896w, c0871a0, true);
                i12 = i11 + m5059h2;
                i13 = i10 + m5059h2;
                m5058g2 = m5058g2(i13, c0896w, c0871a0, false);
            }
            i11 = i12 + m5058g2;
            i10 = i13 + m5058g2;
        }
        m5062p2(c0896w, c0871a0, i11, i10);
        if (!c0871a0.m5254e()) {
            this.f4356u.m5823s();
        } else {
            this.f4350E.m5112e();
        }
        this.f4357v = this.f4360y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X1 */
    public View m5079X1(boolean z10, boolean z11) {
        if (this.f4359x) {
            return m5085c2(m5411J() - 1, -1, z10, z11);
        }
        return m5085c2(0, m5411J(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: Y0 */
    public void mo5020Y0(RecyclerView.C0871a0 c0871a0) {
        super.mo5020Y0(c0871a0);
        this.f4349D = null;
        this.f4346A = -1;
        this.f4347B = Integer.MIN_VALUE;
        this.f4350E.m5112e();
    }

    /* renamed from: Y1 */
    public int m5080Y1() {
        View m5085c2 = m5085c2(0, m5411J(), false, true);
        if (m5085c2 == null) {
            return -1;
        }
        return m5451h0(m5085c2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0899z.b
    /* renamed from: a */
    public PointF mo5081a(int i10) {
        if (m5411J() == 0) {
            return null;
        }
        int i11 = (i10 < m5451h0(m5410I(0))) != this.f4359x ? -1 : 1;
        if (this.f4354s == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    /* renamed from: a2 */
    public int m5082a2() {
        View m5085c2 = m5085c2(m5411J() - 1, -1, false, true);
        if (m5085c2 == null) {
            return -1;
        }
        return m5451h0(m5085c2);
    }

    /* renamed from: b2 */
    View m5083b2(int i10, int i11) {
        int i12;
        int i13;
        m5076T1();
        if ((i11 > i10 ? (char) 1 : i11 < i10 ? (char) 65535 : (char) 0) == 0) {
            return m5410I(i10);
        }
        if (this.f4356u.mo5811g(m5410I(i10)) < this.f4356u.mo5817m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        if (this.f4354s == 0) {
            return this.f4546e.m5863a(i10, i11, i12, i13);
        }
        return this.f4547f.m5863a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: c1 */
    public void mo5084c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f4349D = savedState;
            if (this.f4346A != -1) {
                savedState.m5105b();
            }
            m5474t1();
        }
    }

    /* renamed from: c2 */
    View m5085c2(int i10, int i11, boolean z10, boolean z11) {
        m5076T1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        if (this.f4354s == 0) {
            return this.f4546e.m5863a(i10, i11, i12, i13);
        }
        return this.f4547f.m5863a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: d1 */
    public Parcelable mo5086d1() {
        if (this.f4349D != null) {
            return new SavedState(this.f4349D);
        }
        SavedState savedState = new SavedState();
        if (m5411J() > 0) {
            m5076T1();
            boolean z10 = this.f4357v ^ this.f4359x;
            savedState.f4364p = z10;
            if (z10) {
                View m5060i2 = m5060i2();
                savedState.f4363o = this.f4356u.mo5813i() - this.f4356u.mo5808d(m5060i2);
                savedState.f4362n = m5451h0(m5060i2);
            } else {
                View m5061j2 = m5061j2();
                savedState.f4362n = m5451h0(m5061j2);
                savedState.f4363o = this.f4356u.mo5811g(m5061j2) - this.f4356u.mo5817m();
            }
        } else {
            savedState.m5105b();
        }
        return savedState;
    }

    /* renamed from: f2 */
    View mo5022f2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, boolean z10, boolean z11) {
        int i10;
        int i11;
        m5076T1();
        int m5411J = m5411J();
        int i12 = -1;
        if (z11) {
            i10 = m5411J() - 1;
            i11 = -1;
        } else {
            i12 = m5411J;
            i10 = 0;
            i11 = 1;
        }
        int m5251b = c0871a0.m5251b();
        int mo5817m = this.f4356u.mo5817m();
        int mo5813i = this.f4356u.mo5813i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i12) {
            View m5410I = m5410I(i10);
            int m5451h0 = m5451h0(m5410I);
            int mo5811g = this.f4356u.mo5811g(m5410I);
            int mo5808d = this.f4356u.mo5808d(m5410I);
            if (m5451h0 >= 0 && m5451h0 < m5251b) {
                if (!((RecyclerView.C0890q) m5410I.getLayoutParams()).m5493c()) {
                    boolean z12 = mo5808d <= mo5817m && mo5811g < mo5817m;
                    boolean z13 = mo5811g >= mo5813i && mo5808d > mo5813i;
                    if (!z12 && !z13) {
                        return m5410I;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = m5410I;
                        }
                        view2 = m5410I;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = m5410I;
                        }
                        view2 = m5410I;
                    }
                } else if (view3 == null) {
                    view3 = m5410I;
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: g */
    public void mo5087g(String str) {
        if (this.f4349D == null) {
            super.mo5087g(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: k */
    public boolean mo5088k() {
        return this.f4354s == 0;
    }

    @Deprecated
    /* renamed from: k2 */
    protected int m5089k2(RecyclerView.C0871a0 c0871a0) {
        if (c0871a0.m5253d()) {
            return this.f4356u.mo5818n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: l */
    public boolean mo5090l() {
        return this.f4354s == 1;
    }

    /* renamed from: l2 */
    public int m5091l2() {
        return this.f4354s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m2 */
    public boolean m5092m2() {
        return m5432Z() == 1;
    }

    /* renamed from: n2 */
    public boolean m5093n2() {
        return this.f4361z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: o */
    public void mo5094o(int i10, int i11, RecyclerView.C0871a0 c0871a0, RecyclerView.AbstractC0889p.c cVar) {
        if (this.f4354s != 0) {
            i10 = i11;
        }
        if (m5411J() == 0 || i10 == 0) {
            return;
        }
        m5076T1();
        m5046E2(i10 > 0 ? 1 : -1, Math.abs(i10), true, c0871a0);
        mo5010N1(c0871a0, this.f4355t, cVar);
    }

    /* renamed from: o2 */
    void mo5025o2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, C0868c c0868c, C0867b c0867b) {
        int i10;
        int i11;
        int i12;
        int i13;
        int mo5810f;
        View m5118d = c0868c.m5118d(c0896w);
        if (m5118d == null) {
            c0867b.f4371b = true;
            return;
        }
        RecyclerView.C0890q c0890q = (RecyclerView.C0890q) m5118d.getLayoutParams();
        if (c0868c.f4385l == null) {
            if (this.f4359x == (c0868c.f4379f == -1)) {
                m5441d(m5118d);
            } else {
                m5443e(m5118d, 0);
            }
        } else {
            if (this.f4359x == (c0868c.f4379f == -1)) {
                m5436b(m5118d);
            } else {
                m5439c(m5118d, 0);
            }
        }
        m5393A0(m5118d, 0, 0);
        c0867b.f4370a = this.f4356u.mo5809e(m5118d);
        if (this.f4354s == 1) {
            if (m5092m2()) {
                mo5810f = m5465o0() - m5446f0();
                i13 = mo5810f - this.f4356u.mo5810f(m5118d);
            } else {
                i13 = m5444e0();
                mo5810f = this.f4356u.mo5810f(m5118d) + i13;
            }
            if (c0868c.f4379f == -1) {
                int i14 = c0868c.f4375b;
                i12 = i14;
                i11 = mo5810f;
                i10 = i14 - c0867b.f4370a;
            } else {
                int i15 = c0868c.f4375b;
                i10 = i15;
                i11 = mo5810f;
                i12 = c0867b.f4370a + i15;
            }
        } else {
            int m5448g0 = m5448g0();
            int mo5810f2 = this.f4356u.mo5810f(m5118d) + m5448g0;
            if (c0868c.f4379f == -1) {
                int i16 = c0868c.f4375b;
                i11 = i16;
                i10 = m5448g0;
                i12 = mo5810f2;
                i13 = i16 - c0867b.f4370a;
            } else {
                int i17 = c0868c.f4375b;
                i10 = m5448g0;
                i11 = c0867b.f4370a + i17;
                i12 = mo5810f2;
                i13 = i17;
            }
        }
        m5483z0(m5118d, i13, i10, i11, i12);
        if (c0890q.m5493c() || c0890q.m5492b()) {
            c0867b.f4372c = true;
        }
        c0867b.f4373d = m5118d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: p */
    public void mo5095p(int i10, RecyclerView.AbstractC0889p.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.f4349D;
        if (savedState != null && savedState.m5104a()) {
            SavedState savedState2 = this.f4349D;
            z10 = savedState2.f4364p;
            i11 = savedState2.f4362n;
        } else {
            m5067w2();
            z10 = this.f4359x;
            i11 = this.f4346A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f4352G && i11 >= 0 && i11 < i10; i13++) {
            cVar.mo5490a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: q */
    public int mo5096q(RecyclerView.C0871a0 c0871a0) {
        return m5051O1(c0871a0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q2 */
    public void mo5026q2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, C0866a c0866a, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: r */
    public int mo5027r(RecyclerView.C0871a0 c0871a0) {
        return m5052P1(c0871a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: s */
    public int mo5028s(RecyclerView.C0871a0 c0871a0) {
        return m5053Q1(c0871a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: s0 */
    public boolean mo5097s0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: t */
    public int mo5098t(RecyclerView.C0871a0 c0871a0) {
        return m5051O1(c0871a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: u */
    public int mo5029u(RecyclerView.C0871a0 c0871a0) {
        return m5052P1(c0871a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: v */
    public int mo5030v(RecyclerView.C0871a0 c0871a0) {
        return m5053Q1(c0871a0);
    }

    /* renamed from: v2 */
    boolean m5099v2() {
        return this.f4356u.mo5815k() == 0 && this.f4356u.mo5812h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: w1 */
    public int mo5031w1(int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        if (this.f4354s == 1) {
            return 0;
        }
        return m5101x2(i10, c0896w, c0871a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: x1 */
    public void mo5100x1(int i10) {
        this.f4346A = i10;
        this.f4347B = Integer.MIN_VALUE;
        SavedState savedState = this.f4349D;
        if (savedState != null) {
            savedState.m5105b();
        }
        m5474t1();
    }

    /* renamed from: x2 */
    int m5101x2(int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        if (m5411J() == 0 || i10 == 0) {
            return 0;
        }
        m5076T1();
        this.f4355t.f4374a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        m5046E2(i11, abs, true, c0871a0);
        C0868c c0868c = this.f4355t;
        int m5077U1 = c0868c.f4380g + m5077U1(c0896w, c0868c, c0871a0, false);
        if (m5077U1 < 0) {
            return 0;
        }
        if (abs > m5077U1) {
            i10 = i11 * m5077U1;
        }
        this.f4356u.mo5822r(-i10);
        this.f4355t.f4384k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: y1 */
    public int mo5032y1(int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        if (this.f4354s == 0) {
            return 0;
        }
        return m5101x2(i10, c0896w, c0871a0);
    }

    /* renamed from: y2 */
    public void m5102y2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        mo5087g(null);
        if (i10 != this.f4354s || this.f4356u == null) {
            AbstractC0914i m5806b = AbstractC0914i.m5806b(this, i10);
            this.f4356u = m5806b;
            this.f4350E.f4365a = m5806b;
            this.f4354s = i10;
            m5474t1();
        }
    }

    /* renamed from: z2 */
    public void m5103z2(boolean z10) {
        mo5087g(null);
        if (z10 == this.f4358w) {
            return;
        }
        this.f4358w = z10;
        m5474t1();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f4354s = 1;
        this.f4358w = false;
        this.f4359x = false;
        this.f4360y = false;
        this.f4361z = true;
        this.f4346A = -1;
        this.f4347B = Integer.MIN_VALUE;
        this.f4349D = null;
        this.f4350E = new C0866a();
        this.f4351F = new C0867b();
        this.f4352G = 2;
        this.f4353H = new int[2];
        RecyclerView.AbstractC0889p.d m5386i0 = RecyclerView.AbstractC0889p.m5386i0(context, attributeSet, i10, i11);
        m5102y2(m5386i0.f4562a);
        m5103z2(m5386i0.f4564c);
        mo5002A2(m5386i0.f4565d);
    }
}
