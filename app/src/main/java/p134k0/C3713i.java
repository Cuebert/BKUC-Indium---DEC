package p134k0;

import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: k0.i */
/* loaded from: classes.dex */
public class C3713i {

    /* renamed from: r */
    private static int f15532r = 1;

    /* renamed from: a */
    public boolean f15533a;

    /* renamed from: b */
    private String f15534b;

    /* renamed from: f */
    public float f15538f;

    /* renamed from: j */
    a f15542j;

    /* renamed from: c */
    public int f15535c = -1;

    /* renamed from: d */
    int f15536d = -1;

    /* renamed from: e */
    public int f15537e = 0;

    /* renamed from: g */
    public boolean f15539g = false;

    /* renamed from: h */
    float[] f15540h = new float[9];

    /* renamed from: i */
    float[] f15541i = new float[9];

    /* renamed from: k */
    C3706b[] f15543k = new C3706b[16];

    /* renamed from: l */
    int f15544l = 0;

    /* renamed from: m */
    public int f15545m = 0;

    /* renamed from: n */
    boolean f15546n = false;

    /* renamed from: o */
    int f15547o = -1;

    /* renamed from: p */
    float f15548p = 0.0f;

    /* renamed from: q */
    HashSet<C3706b> f15549q = null;

    /* renamed from: k0.i$a */
    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C3713i(a aVar, String str) {
        this.f15542j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m15792b() {
        f15532r++;
    }

    /* renamed from: a */
    public final void m15793a(C3706b c3706b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f15544l;
            if (i10 < i11) {
                if (this.f15543k[i10] == c3706b) {
                    return;
                } else {
                    i10++;
                }
            } else {
                C3706b[] c3706bArr = this.f15543k;
                if (i11 >= c3706bArr.length) {
                    this.f15543k = (C3706b[]) Arrays.copyOf(c3706bArr, c3706bArr.length * 2);
                }
                C3706b[] c3706bArr2 = this.f15543k;
                int i12 = this.f15544l;
                c3706bArr2[i12] = c3706b;
                this.f15544l = i12 + 1;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m15794c(C3706b c3706b) {
        int i10 = this.f15544l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f15543k[i11] == c3706b) {
                while (i11 < i10 - 1) {
                    C3706b[] c3706bArr = this.f15543k;
                    int i12 = i11 + 1;
                    c3706bArr[i11] = c3706bArr[i12];
                    i11 = i12;
                }
                this.f15544l--;
                return;
            }
            i11++;
        }
    }

    /* renamed from: d */
    public void m15795d() {
        this.f15534b = null;
        this.f15542j = a.UNKNOWN;
        this.f15537e = 0;
        this.f15535c = -1;
        this.f15536d = -1;
        this.f15538f = 0.0f;
        this.f15539g = false;
        this.f15546n = false;
        this.f15547o = -1;
        this.f15548p = 0.0f;
        int i10 = this.f15544l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f15543k[i11] = null;
        }
        this.f15544l = 0;
        this.f15545m = 0;
        this.f15533a = false;
        Arrays.fill(this.f15541i, 0.0f);
    }

    /* renamed from: e */
    public void m15796e(C3708d c3708d, float f10) {
        this.f15538f = f10;
        this.f15539g = true;
        this.f15546n = false;
        this.f15547o = -1;
        this.f15548p = 0.0f;
        int i10 = this.f15544l;
        this.f15536d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f15543k[i11].m15722A(c3708d, this, false);
        }
        this.f15544l = 0;
    }

    /* renamed from: f */
    public void m15797f(a aVar, String str) {
        this.f15542j = aVar;
    }

    /* renamed from: g */
    public final void m15798g(C3708d c3708d, C3706b c3706b) {
        int i10 = this.f15544l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f15543k[i11].mo15723B(c3708d, c3706b, false);
        }
        this.f15544l = 0;
    }

    public String toString() {
        if (this.f15534b != null) {
            return BuildConfig.FLAVOR + this.f15534b;
        }
        return BuildConfig.FLAVOR + this.f15535c;
    }
}
