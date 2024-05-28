package p147l0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p134k0.C3707c;
import p134k0.C3713i;
import p158m0.C3921i;
import p158m0.C3927o;

/* renamed from: l0.d */
/* loaded from: classes.dex */
public class C3859d {

    /* renamed from: b */
    private int f15944b;

    /* renamed from: c */
    private boolean f15945c;

    /* renamed from: d */
    public final C3860e f15946d;

    /* renamed from: e */
    public final b f15947e;

    /* renamed from: f */
    public C3859d f15948f;

    /* renamed from: i */
    C3713i f15951i;

    /* renamed from: a */
    private HashSet<C3859d> f15943a = null;

    /* renamed from: g */
    public int f15949g = 0;

    /* renamed from: h */
    int f15950h = -1;

    /* renamed from: l0.d$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15952a;

        static {
            int[] iArr = new int[b.values().length];
            f15952a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15952a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15952a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15952a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15952a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15952a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15952a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15952a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15952a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: l0.d$b */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C3859d(C3860e c3860e, b bVar) {
        this.f15946d = c3860e;
        this.f15947e = bVar;
    }

    /* renamed from: a */
    public boolean m16301a(C3859d c3859d, int i10, int i11, boolean z10) {
        if (c3859d == null) {
            m16316p();
            return true;
        }
        if (!z10 && !m16315o(c3859d)) {
            return false;
        }
        this.f15948f = c3859d;
        if (c3859d.f15943a == null) {
            c3859d.f15943a = new HashSet<>();
        }
        HashSet<C3859d> hashSet = this.f15948f.f15943a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i10 > 0) {
            this.f15949g = i10;
        } else {
            this.f15949g = 0;
        }
        this.f15950h = i11;
        return true;
    }

    /* renamed from: b */
    public void m16302b(int i10, ArrayList<C3927o> arrayList, C3927o c3927o) {
        HashSet<C3859d> hashSet = this.f15943a;
        if (hashSet != null) {
            Iterator<C3859d> it = hashSet.iterator();
            while (it.hasNext()) {
                C3921i.m16633a(it.next().f15946d, i10, arrayList, c3927o);
            }
        }
    }

    /* renamed from: c */
    public HashSet<C3859d> m16303c() {
        return this.f15943a;
    }

    /* renamed from: d */
    public int m16304d() {
        if (this.f15945c) {
            return this.f15944b;
        }
        return 0;
    }

    /* renamed from: e */
    public int m16305e() {
        C3859d c3859d;
        if (this.f15946d.m16355Q() == 8) {
            return 0;
        }
        if (this.f15950h > -1 && (c3859d = this.f15948f) != null && c3859d.f15946d.m16355Q() == 8) {
            return this.f15950h;
        }
        return this.f15949g;
    }

    /* renamed from: f */
    public final C3859d m16306f() {
        switch (a.f15952a[this.f15947e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f15946d.f15975J;
            case 3:
                return this.f15946d.f15973H;
            case 4:
                return this.f15946d.f15976K;
            case 5:
                return this.f15946d.f15974I;
            default:
                throw new AssertionError(this.f15947e.name());
        }
    }

    /* renamed from: g */
    public C3860e m16307g() {
        return this.f15946d;
    }

    /* renamed from: h */
    public C3713i m16308h() {
        return this.f15951i;
    }

    /* renamed from: i */
    public C3859d m16309i() {
        return this.f15948f;
    }

    /* renamed from: j */
    public b m16310j() {
        return this.f15947e;
    }

    /* renamed from: k */
    public boolean m16311k() {
        HashSet<C3859d> hashSet = this.f15943a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C3859d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m16306f().m16314n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public boolean m16312l() {
        HashSet<C3859d> hashSet = this.f15943a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: m */
    public boolean m16313m() {
        return this.f15945c;
    }

    /* renamed from: n */
    public boolean m16314n() {
        return this.f15948f != null;
    }

    /* renamed from: o */
    public boolean m16315o(C3859d c3859d) {
        if (c3859d == null) {
            return false;
        }
        b m16310j = c3859d.m16310j();
        b bVar = this.f15947e;
        if (m16310j == bVar) {
            return bVar != b.BASELINE || (c3859d.m16307g().m16363U() && m16307g().m16363U());
        }
        switch (a.f15952a[bVar.ordinal()]) {
            case 1:
                return (m16310j == b.BASELINE || m16310j == b.CENTER_X || m16310j == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = m16310j == b.LEFT || m16310j == b.RIGHT;
                if (c3859d.m16307g() instanceof C3862g) {
                    return z10 || m16310j == b.CENTER_X;
                }
                return z10;
            case 4:
            case 5:
                boolean z11 = m16310j == b.TOP || m16310j == b.BOTTOM;
                if (c3859d.m16307g() instanceof C3862g) {
                    return z11 || m16310j == b.CENTER_Y;
                }
                return z11;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f15947e.name());
        }
    }

    /* renamed from: p */
    public void m16316p() {
        HashSet<C3859d> hashSet;
        C3859d c3859d = this.f15948f;
        if (c3859d != null && (hashSet = c3859d.f15943a) != null) {
            hashSet.remove(this);
            if (this.f15948f.f15943a.size() == 0) {
                this.f15948f.f15943a = null;
            }
        }
        this.f15943a = null;
        this.f15948f = null;
        this.f15949g = 0;
        this.f15950h = -1;
        this.f15945c = false;
        this.f15944b = 0;
    }

    /* renamed from: q */
    public void m16317q() {
        this.f15945c = false;
        this.f15944b = 0;
    }

    /* renamed from: r */
    public void m16318r(C3707c c3707c) {
        C3713i c3713i = this.f15951i;
        if (c3713i == null) {
            this.f15951i = new C3713i(C3713i.a.UNRESTRICTED, null);
        } else {
            c3713i.m15795d();
        }
    }

    /* renamed from: s */
    public void m16319s(int i10) {
        this.f15944b = i10;
        this.f15945c = true;
    }

    public String toString() {
        return this.f15946d.m16399r() + ":" + this.f15947e.toString();
    }
}
