package p134k0;

import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import p134k0.C3706b;

/* renamed from: k0.a */
/* loaded from: classes.dex */
public class C3705a implements C3706b.a {

    /* renamed from: l */
    private static float f15472l = 0.001f;

    /* renamed from: b */
    private final C3706b f15474b;

    /* renamed from: c */
    protected final C3707c f15475c;

    /* renamed from: a */
    int f15473a = 0;

    /* renamed from: d */
    private int f15476d = 8;

    /* renamed from: e */
    private C3713i f15477e = null;

    /* renamed from: f */
    private int[] f15478f = new int[8];

    /* renamed from: g */
    private int[] f15479g = new int[8];

    /* renamed from: h */
    private float[] f15480h = new float[8];

    /* renamed from: i */
    private int f15481i = -1;

    /* renamed from: j */
    private int f15482j = -1;

    /* renamed from: k */
    private boolean f15483k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3705a(C3706b c3706b, C3707c c3707c) {
        this.f15474b = c3706b;
        this.f15475c = c3707c;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: a */
    public float mo15709a(int i10) {
        int i11 = this.f15481i;
        for (int i12 = 0; i11 != -1 && i12 < this.f15473a; i12++) {
            if (i12 == i10) {
                return this.f15480h[i11];
            }
            i11 = this.f15479g[i11];
        }
        return 0.0f;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: b */
    public void mo15710b(C3713i c3713i, float f10, boolean z10) {
        float f11 = f15472l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f15481i;
            if (i10 == -1) {
                this.f15481i = 0;
                this.f15480h[0] = f10;
                this.f15478f[0] = c3713i.f15535c;
                this.f15479g[0] = -1;
                c3713i.f15545m++;
                c3713i.m15793a(this.f15474b);
                this.f15473a++;
                if (this.f15483k) {
                    return;
                }
                int i11 = this.f15482j + 1;
                this.f15482j = i11;
                int[] iArr = this.f15478f;
                if (i11 >= iArr.length) {
                    this.f15483k = true;
                    this.f15482j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f15473a; i13++) {
                int[] iArr2 = this.f15478f;
                int i14 = iArr2[i10];
                int i15 = c3713i.f15535c;
                if (i14 == i15) {
                    float[] fArr = this.f15480h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f15472l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f15481i) {
                            this.f15481i = this.f15479g[i10];
                        } else {
                            int[] iArr3 = this.f15479g;
                            iArr3[i12] = iArr3[i10];
                        }
                        if (z10) {
                            c3713i.m15794c(this.f15474b);
                        }
                        if (this.f15483k) {
                            this.f15482j = i10;
                        }
                        c3713i.f15545m--;
                        this.f15473a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i12 = i10;
                }
                i10 = this.f15479g[i10];
            }
            int i16 = this.f15482j;
            int i17 = i16 + 1;
            if (this.f15483k) {
                int[] iArr4 = this.f15478f;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f15478f;
            if (i16 >= iArr5.length && this.f15473a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f15478f;
                    if (i18 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    }
                    i18++;
                }
            }
            int[] iArr7 = this.f15478f;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.f15476d * 2;
                this.f15476d = i19;
                this.f15483k = false;
                this.f15482j = i16 - 1;
                this.f15480h = Arrays.copyOf(this.f15480h, i19);
                this.f15478f = Arrays.copyOf(this.f15478f, this.f15476d);
                this.f15479g = Arrays.copyOf(this.f15479g, this.f15476d);
            }
            this.f15478f[i16] = c3713i.f15535c;
            this.f15480h[i16] = f10;
            if (i12 != -1) {
                int[] iArr8 = this.f15479g;
                iArr8[i16] = iArr8[i12];
                iArr8[i12] = i16;
            } else {
                this.f15479g[i16] = this.f15481i;
                this.f15481i = i16;
            }
            c3713i.f15545m++;
            c3713i.m15793a(this.f15474b);
            this.f15473a++;
            if (!this.f15483k) {
                this.f15482j++;
            }
            int i20 = this.f15482j;
            int[] iArr9 = this.f15478f;
            if (i20 >= iArr9.length) {
                this.f15483k = true;
                this.f15482j = iArr9.length - 1;
            }
        }
    }

    @Override // p134k0.C3706b.a
    /* renamed from: c */
    public final float mo15711c(C3713i c3713i, boolean z10) {
        if (this.f15477e == c3713i) {
            this.f15477e = null;
        }
        int i10 = this.f15481i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f15473a) {
            if (this.f15478f[i10] == c3713i.f15535c) {
                if (i10 == this.f15481i) {
                    this.f15481i = this.f15479g[i10];
                } else {
                    int[] iArr = this.f15479g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    c3713i.m15794c(this.f15474b);
                }
                c3713i.f15545m--;
                this.f15473a--;
                this.f15478f[i10] = -1;
                if (this.f15483k) {
                    this.f15482j = i10;
                }
                return this.f15480h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f15479g[i10];
        }
        return 0.0f;
    }

    @Override // p134k0.C3706b.a
    public final void clear() {
        int i10 = this.f15481i;
        for (int i11 = 0; i10 != -1 && i11 < this.f15473a; i11++) {
            C3713i c3713i = this.f15475c.f15493d[this.f15478f[i10]];
            if (c3713i != null) {
                c3713i.m15794c(this.f15474b);
            }
            i10 = this.f15479g[i10];
        }
        this.f15481i = -1;
        this.f15482j = -1;
        this.f15483k = false;
        this.f15473a = 0;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: d */
    public float mo15712d(C3706b c3706b, boolean z10) {
        float mo15715g = mo15715g(c3706b.f15484a);
        mo15711c(c3706b.f15484a, z10);
        C3706b.a aVar = c3706b.f15488e;
        int mo15714f = aVar.mo15714f();
        for (int i10 = 0; i10 < mo15714f; i10++) {
            C3713i mo15716h = aVar.mo15716h(i10);
            mo15710b(mo15716h, aVar.mo15715g(mo15716h) * mo15715g, z10);
        }
        return mo15715g;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: e */
    public boolean mo15713e(C3713i c3713i) {
        int i10 = this.f15481i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f15473a; i11++) {
            if (this.f15478f[i10] == c3713i.f15535c) {
                return true;
            }
            i10 = this.f15479g[i10];
        }
        return false;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: f */
    public int mo15714f() {
        return this.f15473a;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: g */
    public final float mo15715g(C3713i c3713i) {
        int i10 = this.f15481i;
        for (int i11 = 0; i10 != -1 && i11 < this.f15473a; i11++) {
            if (this.f15478f[i10] == c3713i.f15535c) {
                return this.f15480h[i10];
            }
            i10 = this.f15479g[i10];
        }
        return 0.0f;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: h */
    public C3713i mo15716h(int i10) {
        int i11 = this.f15481i;
        for (int i12 = 0; i11 != -1 && i12 < this.f15473a; i12++) {
            if (i12 == i10) {
                return this.f15475c.f15493d[this.f15478f[i11]];
            }
            i11 = this.f15479g[i11];
        }
        return null;
    }

    @Override // p134k0.C3706b.a
    /* renamed from: i */
    public void mo15717i(float f10) {
        int i10 = this.f15481i;
        for (int i11 = 0; i10 != -1 && i11 < this.f15473a; i11++) {
            float[] fArr = this.f15480h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f15479g[i10];
        }
    }

    @Override // p134k0.C3706b.a
    /* renamed from: j */
    public final void mo15718j(C3713i c3713i, float f10) {
        if (f10 == 0.0f) {
            mo15711c(c3713i, true);
            return;
        }
        int i10 = this.f15481i;
        if (i10 == -1) {
            this.f15481i = 0;
            this.f15480h[0] = f10;
            this.f15478f[0] = c3713i.f15535c;
            this.f15479g[0] = -1;
            c3713i.f15545m++;
            c3713i.m15793a(this.f15474b);
            this.f15473a++;
            if (this.f15483k) {
                return;
            }
            int i11 = this.f15482j + 1;
            this.f15482j = i11;
            int[] iArr = this.f15478f;
            if (i11 >= iArr.length) {
                this.f15483k = true;
                this.f15482j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f15473a; i13++) {
            int[] iArr2 = this.f15478f;
            int i14 = iArr2[i10];
            int i15 = c3713i.f15535c;
            if (i14 == i15) {
                this.f15480h[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i12 = i10;
            }
            i10 = this.f15479g[i10];
        }
        int i16 = this.f15482j;
        int i17 = i16 + 1;
        if (this.f15483k) {
            int[] iArr3 = this.f15478f;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f15478f;
        if (i16 >= iArr4.length && this.f15473a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f15478f;
                if (i18 >= iArr5.length) {
                    break;
                }
                if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr6 = this.f15478f;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f15476d * 2;
            this.f15476d = i19;
            this.f15483k = false;
            this.f15482j = i16 - 1;
            this.f15480h = Arrays.copyOf(this.f15480h, i19);
            this.f15478f = Arrays.copyOf(this.f15478f, this.f15476d);
            this.f15479g = Arrays.copyOf(this.f15479g, this.f15476d);
        }
        this.f15478f[i16] = c3713i.f15535c;
        this.f15480h[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f15479g;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f15479g[i16] = this.f15481i;
            this.f15481i = i16;
        }
        c3713i.f15545m++;
        c3713i.m15793a(this.f15474b);
        int i20 = this.f15473a + 1;
        this.f15473a = i20;
        if (!this.f15483k) {
            this.f15482j++;
        }
        int[] iArr8 = this.f15478f;
        if (i20 >= iArr8.length) {
            this.f15483k = true;
        }
        if (this.f15482j >= iArr8.length) {
            this.f15483k = true;
            this.f15482j = iArr8.length - 1;
        }
    }

    @Override // p134k0.C3706b.a
    /* renamed from: k */
    public void mo15719k() {
        int i10 = this.f15481i;
        for (int i11 = 0; i10 != -1 && i11 < this.f15473a; i11++) {
            float[] fArr = this.f15480h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f15479g[i10];
        }
    }

    public String toString() {
        int i10 = this.f15481i;
        String str = BuildConfig.FLAVOR;
        for (int i11 = 0; i10 != -1 && i11 < this.f15473a; i11++) {
            str = ((str + " -> ") + this.f15480h[i10] + " : ") + this.f15475c.f15493d[this.f15478f[i10]];
            i10 = this.f15479g[i10];
        }
        return str;
    }
}
