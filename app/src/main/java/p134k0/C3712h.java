package p134k0;

import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.Comparator;
import p134k0.C3706b;

/* renamed from: k0.h */
/* loaded from: classes.dex */
public class C3712h extends C3706b {

    /* renamed from: g */
    private int f15522g;

    /* renamed from: h */
    private C3713i[] f15523h;

    /* renamed from: i */
    private C3713i[] f15524i;

    /* renamed from: j */
    private int f15525j;

    /* renamed from: k */
    b f15526k;

    /* renamed from: l */
    C3707c f15527l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0.h$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<C3713i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C3713i c3713i, C3713i c3713i2) {
            return c3713i.f15535c - c3713i2.f15535c;
        }
    }

    /* renamed from: k0.h$b */
    /* loaded from: classes.dex */
    class b implements Comparable {

        /* renamed from: n */
        C3713i f15529n;

        /* renamed from: o */
        C3712h f15530o;

        public b(C3712h c3712h) {
            this.f15530o = c3712h;
        }

        /* renamed from: b */
        public boolean m15787b(C3713i c3713i, float f10) {
            boolean z10 = true;
            if (!this.f15529n.f15533a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = c3713i.f15541i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f15529n.f15541i[i10] = f12;
                    } else {
                        this.f15529n.f15541i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f15529n.f15541i;
                fArr[i11] = fArr[i11] + (c3713i.f15541i[i11] * f10);
                if (Math.abs(fArr[i11]) < 1.0E-4f) {
                    this.f15529n.f15541i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                C3712h.this.m15785G(this.f15529n);
            }
            return false;
        }

        /* renamed from: c */
        public void m15788c(C3713i c3713i) {
            this.f15529n = c3713i;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f15529n.f15535c - ((C3713i) obj).f15535c;
        }

        /* renamed from: d */
        public final boolean m15789d() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f15529n.f15541i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public final boolean m15790e(C3713i c3713i) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = c3713i.f15541i[i10];
                float f11 = this.f15529n.f15541i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public void m15791f() {
            Arrays.fill(this.f15529n.f15541i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f15529n != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f15529n.f15541i[i10] + " ";
                }
            }
            return str + "] " + this.f15529n;
        }
    }

    public C3712h(C3707c c3707c) {
        super(c3707c);
        this.f15522g = 128;
        this.f15523h = new C3713i[128];
        this.f15524i = new C3713i[128];
        this.f15525j = 0;
        this.f15526k = new b(this);
        this.f15527l = c3707c;
    }

    /* renamed from: F */
    private final void m15784F(C3713i c3713i) {
        int i10;
        int i11 = this.f15525j + 1;
        C3713i[] c3713iArr = this.f15523h;
        if (i11 > c3713iArr.length) {
            C3713i[] c3713iArr2 = (C3713i[]) Arrays.copyOf(c3713iArr, c3713iArr.length * 2);
            this.f15523h = c3713iArr2;
            this.f15524i = (C3713i[]) Arrays.copyOf(c3713iArr2, c3713iArr2.length * 2);
        }
        C3713i[] c3713iArr3 = this.f15523h;
        int i12 = this.f15525j;
        c3713iArr3[i12] = c3713i;
        int i13 = i12 + 1;
        this.f15525j = i13;
        if (i13 > 1 && c3713iArr3[i13 - 1].f15535c > c3713i.f15535c) {
            int i14 = 0;
            while (true) {
                i10 = this.f15525j;
                if (i14 >= i10) {
                    break;
                }
                this.f15524i[i14] = this.f15523h[i14];
                i14++;
            }
            Arrays.sort(this.f15524i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f15525j; i15++) {
                this.f15523h[i15] = this.f15524i[i15];
            }
        }
        c3713i.f15533a = true;
        c3713i.m15793a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m15785G(C3713i c3713i) {
        int i10 = 0;
        while (i10 < this.f15525j) {
            if (this.f15523h[i10] == c3713i) {
                while (true) {
                    int i11 = this.f15525j;
                    if (i10 < i11 - 1) {
                        C3713i[] c3713iArr = this.f15523h;
                        int i12 = i10 + 1;
                        c3713iArr[i10] = c3713iArr[i12];
                        i10 = i12;
                    } else {
                        this.f15525j = i11 - 1;
                        c3713i.f15533a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // p134k0.C3706b
    /* renamed from: B */
    public void mo15723B(C3708d c3708d, C3706b c3706b, boolean z10) {
        C3713i c3713i = c3706b.f15484a;
        if (c3713i == null) {
            return;
        }
        C3706b.a aVar = c3706b.f15488e;
        int mo15714f = aVar.mo15714f();
        for (int i10 = 0; i10 < mo15714f; i10++) {
            C3713i mo15716h = aVar.mo15716h(i10);
            float mo15709a = aVar.mo15709a(i10);
            this.f15526k.m15788c(mo15716h);
            if (this.f15526k.m15787b(c3713i, mo15709a)) {
                m15784F(mo15716h);
            }
            this.f15485b += c3706b.f15485b * mo15709a;
        }
        m15785G(c3713i);
    }

    @Override // p134k0.C3706b, p134k0.C3708d.a
    /* renamed from: a */
    public C3713i mo15726a(C3708d c3708d, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f15525j; i11++) {
            C3713i c3713i = this.f15523h[i11];
            if (!zArr[c3713i.f15535c]) {
                this.f15526k.m15788c(c3713i);
                if (i10 == -1) {
                    if (!this.f15526k.m15789d()) {
                    }
                    i10 = i11;
                } else {
                    if (!this.f15526k.m15790e(this.f15523h[i10])) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f15523h[i10];
    }

    @Override // p134k0.C3706b, p134k0.C3708d.a
    /* renamed from: c */
    public void mo15728c(C3713i c3713i) {
        this.f15526k.m15788c(c3713i);
        this.f15526k.m15791f();
        c3713i.f15541i[c3713i.f15537e] = 1.0f;
        m15784F(c3713i);
    }

    @Override // p134k0.C3706b, p134k0.C3708d.a
    public void clear() {
        this.f15525j = 0;
        this.f15485b = 0.0f;
    }

    @Override // p134k0.C3706b, p134k0.C3708d.a
    public boolean isEmpty() {
        return this.f15525j == 0;
    }

    @Override // p134k0.C3706b
    public String toString() {
        String str = BuildConfig.FLAVOR + " goal -> (" + this.f15485b + ") : ";
        for (int i10 = 0; i10 < this.f15525j; i10++) {
            this.f15526k.m15788c(this.f15523h[i10]);
            str = str + this.f15526k + " ";
        }
        return str;
    }
}
