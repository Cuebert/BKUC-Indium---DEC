package p134k0;

import java.util.Arrays;
import p134k0.C3706b;

/* renamed from: k0.j */
/* loaded from: classes.dex */
public class C3714j implements C3706b.a {

    /* renamed from: n */
    private static float f15556n = 0.001f;

    /* renamed from: a */
    private final int f15557a = -1;

    /* renamed from: b */
    private int f15558b = 16;

    /* renamed from: c */
    private int f15559c = 16;

    /* renamed from: d */
    int[] f15560d = new int[16];

    /* renamed from: e */
    int[] f15561e = new int[16];

    /* renamed from: f */
    int[] f15562f = new int[16];

    /* renamed from: g */
    float[] f15563g = new float[16];

    /* renamed from: h */
    int[] f15564h = new int[16];

    /* renamed from: i */
    int[] f15565i = new int[16];

    /* renamed from: j */
    int f15566j = 0;

    /* renamed from: k */
    int f15567k = -1;

    /* renamed from: l */
    private final C3706b f15568l;

    /* renamed from: m */
    protected final C3707c f15569m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3714j(C3706b c3706b, C3707c c3707c) {
        this.f15568l = c3706b;
        this.f15569m = c3707c;
        clear();
    }

    /* renamed from: l */
    private void m15799l(C3713i c3713i, int i10) {
        int[] iArr;
        int i11 = c3713i.f15535c % this.f15559c;
        int[] iArr2 = this.f15560d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f15561e;
                if (iArr[i12] == -1) {
                    break;
                } else {
                    i12 = iArr[i12];
                }
            }
            iArr[i12] = i10;
        }
        this.f15561e[i10] = -1;
    }

    /* renamed from: m */
    private void m15800m(int i10, C3713i c3713i, float f10) {
        this.f15562f[i10] = c3713i.f15535c;
        this.f15563g[i10] = f10;
        this.f15564h[i10] = -1;
        this.f15565i[i10] = -1;
        c3713i.m15793a(this.f15568l);
        c3713i.f15545m++;
        this.f15566j++;
    }

    /* renamed from: n */
    private int m15801n() {
        for (int i10 = 0; i10 < this.f15558b; i10++) {
            if (this.f15562f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m15802o() {
        int i10 = this.f15558b * 2;
        this.f15562f = Arrays.copyOf(this.f15562f, i10);
        this.f15563g = Arrays.copyOf(this.f15563g, i10);
        this.f15564h = Arrays.copyOf(this.f15564h, i10);
        this.f15565i = Arrays.copyOf(this.f15565i, i10);
        this.f15561e = Arrays.copyOf(this.f15561e, i10);
        for (int i11 = this.f15558b; i11 < i10; i11++) {
            this.f15562f[i11] = -1;
            this.f15561e[i11] = -1;
        }
        this.f15558b = i10;
    }

    /* renamed from: q */
    private void m15803q(int i10, C3713i c3713i, float f10) {
        int m15801n = m15801n();
        m15800m(m15801n, c3713i, f10);
        if (i10 != -1) {
            this.f15564h[m15801n] = i10;
            int[] iArr = this.f15565i;
            iArr[m15801n] = iArr[i10];
            iArr[i10] = m15801n;
        } else {
            this.f15564h[m15801n] = -1;
            if (this.f15566j > 0) {
                this.f15565i[m15801n] = this.f15567k;
                this.f15567k = m15801n;
            } else {
                this.f15565i[m15801n] = -1;
            }
        }
        int[] iArr2 = this.f15565i;
        if (iArr2[m15801n] != -1) {
            this.f15564h[iArr2[m15801n]] = m15801n;
        }
        m15799l(c3713i, m15801n);
    }

    /* renamed from: r */
    private void m15804r(C3713i c3713i) {
        int[] iArr;
        int i10 = c3713i.f15535c;
        int i11 = i10 % this.f15559c;
        int[] iArr2 = this.f15560d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            return;
        }
        if (this.f15562f[i12] == i10) {
            int[] iArr3 = this.f15561e;
            iArr2[i11] = iArr3[i12];
            iArr3[i12] = -1;
            return;
        }
        while (true) {
            iArr = this.f15561e;
            if (iArr[i12] == -1 || this.f15562f[iArr[i12]] == i10) {
                break;
            } else {
                i12 = iArr[i12];
            }
        }
        int i13 = iArr[i12];
        if (i13 == -1 || this.f15562f[i13] != i10) {
            return;
        }
        iArr[i12] = iArr[i13];
        iArr[i13] = -1;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: a */
    public float mo15709a(int i10) {
        int i11 = this.f15566j;
        int i12 = this.f15567k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f15563g[i12];
            }
            i12 = this.f15565i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: b */
    public void mo15710b(C3713i c3713i, float f10, boolean z10) {
        float f11 = f15556n;
        if (f10 <= (-f11) || f10 >= f11) {
            int m15805p = m15805p(c3713i);
            if (m15805p == -1) {
                mo15718j(c3713i, f10);
                return;
            }
            float[] fArr = this.f15563g;
            fArr[m15805p] = fArr[m15805p] + f10;
            float f12 = fArr[m15805p];
            float f13 = f15556n;
            if (f12 <= (-f13) || fArr[m15805p] >= f13) {
                return;
            }
            fArr[m15805p] = 0.0f;
            mo15711c(c3713i, z10);
        }
    }

    @Override // p134k0.C3706b.a
    /* renamed from: c */
    public float mo15711c(C3713i c3713i, boolean z10) {
        int m15805p = m15805p(c3713i);
        if (m15805p == -1) {
            return 0.0f;
        }
        m15804r(c3713i);
        float f10 = this.f15563g[m15805p];
        if (this.f15567k == m15805p) {
            this.f15567k = this.f15565i[m15805p];
        }
        this.f15562f[m15805p] = -1;
        int[] iArr = this.f15564h;
        if (iArr[m15805p] != -1) {
            int[] iArr2 = this.f15565i;
            iArr2[iArr[m15805p]] = iArr2[m15805p];
        }
        int[] iArr3 = this.f15565i;
        if (iArr3[m15805p] != -1) {
            iArr[iArr3[m15805p]] = iArr[m15805p];
        }
        this.f15566j--;
        c3713i.f15545m--;
        if (z10) {
            c3713i.m15794c(this.f15568l);
        }
        return f10;
    }

    @Override // p134k0.C3706b.a
    public void clear() {
        int i10 = this.f15566j;
        for (int i11 = 0; i11 < i10; i11++) {
            C3713i mo15716h = mo15716h(i11);
            if (mo15716h != null) {
                mo15716h.m15794c(this.f15568l);
            }
        }
        for (int i12 = 0; i12 < this.f15558b; i12++) {
            this.f15562f[i12] = -1;
            this.f15561e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f15559c; i13++) {
            this.f15560d[i13] = -1;
        }
        this.f15566j = 0;
        this.f15567k = -1;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: d */
    public float mo15712d(C3706b c3706b, boolean z10) {
        float mo15715g = mo15715g(c3706b.f15484a);
        mo15711c(c3706b.f15484a, z10);
        C3714j c3714j = (C3714j) c3706b.f15488e;
        int mo15714f = c3714j.mo15714f();
        int i10 = 0;
        int i11 = 0;
        while (i10 < mo15714f) {
            int[] iArr = c3714j.f15562f;
            if (iArr[i11] != -1) {
                mo15710b(this.f15569m.f15493d[iArr[i11]], c3714j.f15563g[i11] * mo15715g, z10);
                i10++;
            }
            i11++;
        }
        return mo15715g;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: e */
    public boolean mo15713e(C3713i c3713i) {
        return m15805p(c3713i) != -1;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: f */
    public int mo15714f() {
        return this.f15566j;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: g */
    public float mo15715g(C3713i c3713i) {
        int m15805p = m15805p(c3713i);
        if (m15805p != -1) {
            return this.f15563g[m15805p];
        }
        return 0.0f;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: h */
    public C3713i mo15716h(int i10) {
        int i11 = this.f15566j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f15567k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f15569m.f15493d[this.f15562f[i12]];
            }
            i12 = this.f15565i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: i */
    public void mo15717i(float f10) {
        int i10 = this.f15566j;
        int i11 = this.f15567k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f15563g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f15565i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // p134k0.C3706b.a
    /* renamed from: j */
    public void mo15718j(C3713i c3713i, float f10) {
        float f11 = f15556n;
        if (f10 > (-f11) && f10 < f11) {
            mo15711c(c3713i, true);
            return;
        }
        if (this.f15566j == 0) {
            m15800m(0, c3713i, f10);
            m15799l(c3713i, 0);
            this.f15567k = 0;
            return;
        }
        int m15805p = m15805p(c3713i);
        if (m15805p != -1) {
            this.f15563g[m15805p] = f10;
            return;
        }
        if (this.f15566j + 1 >= this.f15558b) {
            m15802o();
        }
        int i10 = this.f15566j;
        int i11 = this.f15567k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int[] iArr = this.f15562f;
            int i14 = iArr[i11];
            int i15 = c3713i.f15535c;
            if (i14 == i15) {
                this.f15563g[i11] = f10;
                return;
            }
            if (iArr[i11] < i15) {
                i12 = i11;
            }
            i11 = this.f15565i[i11];
            if (i11 == -1) {
                break;
            }
        }
        m15803q(i12, c3713i, f10);
    }

    @Override // p134k0.C3706b.a
    /* renamed from: k */
    public void mo15719k() {
        int i10 = this.f15566j;
        int i11 = this.f15567k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f15563g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f15565i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    /* renamed from: p */
    public int m15805p(C3713i c3713i) {
        int[] iArr;
        if (this.f15566j != 0 && c3713i != null) {
            int i10 = c3713i.f15535c;
            int i11 = this.f15560d[i10 % this.f15559c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f15562f[i11] == i10) {
                return i11;
            }
            while (true) {
                iArr = this.f15561e;
                if (iArr[i11] == -1 || this.f15562f[iArr[i11]] == i10) {
                    break;
                }
                i11 = iArr[i11];
            }
            if (iArr[i11] != -1 && this.f15562f[iArr[i11]] == i10) {
                return iArr[i11];
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f15566j;
        for (int i11 = 0; i11 < i10; i11++) {
            C3713i mo15716h = mo15716h(i11);
            if (mo15716h != null) {
                String str2 = str + mo15716h + " = " + mo15709a(i11) + " ";
                int m15805p = m15805p(mo15716h);
                String str3 = str2 + "[p: ";
                String str4 = (this.f15564h[m15805p] != -1 ? str3 + this.f15569m.f15493d[this.f15562f[this.f15564h[m15805p]]] : str3 + "none") + ", n: ";
                str = (this.f15565i[m15805p] != -1 ? str4 + this.f15569m.f15493d[this.f15562f[this.f15565i[m15805p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
