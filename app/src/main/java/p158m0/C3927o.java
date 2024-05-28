package p158m0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p134k0.C3708d;
import p147l0.C3857b;
import p147l0.C3860e;
import p147l0.C3861f;

/* renamed from: m0.o */
/* loaded from: classes.dex */
public class C3927o {

    /* renamed from: g */
    static int f16283g;

    /* renamed from: b */
    int f16285b;

    /* renamed from: d */
    int f16287d;

    /* renamed from: a */
    ArrayList<C3860e> f16284a = new ArrayList<>();

    /* renamed from: c */
    boolean f16286c = false;

    /* renamed from: e */
    ArrayList<a> f16288e = null;

    /* renamed from: f */
    private int f16289f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0.o$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        WeakReference<C3860e> f16290a;

        /* renamed from: b */
        int f16291b;

        /* renamed from: c */
        int f16292c;

        /* renamed from: d */
        int f16293d;

        /* renamed from: e */
        int f16294e;

        /* renamed from: f */
        int f16295f;

        /* renamed from: g */
        int f16296g;

        public a(C3860e c3860e, C3708d c3708d, int i10) {
            this.f16290a = new WeakReference<>(c3860e);
            this.f16291b = c3708d.m15778x(c3860e.f15973H);
            this.f16292c = c3708d.m15778x(c3860e.f15974I);
            this.f16293d = c3708d.m15778x(c3860e.f15975J);
            this.f16294e = c3708d.m15778x(c3860e.f15976K);
            this.f16295f = c3708d.m15778x(c3860e.f15977L);
            this.f16296g = i10;
        }
    }

    public C3927o(int i10) {
        int i11 = f16283g;
        f16283g = i11 + 1;
        this.f16285b = i11;
        this.f16287d = i10;
    }

    /* renamed from: e */
    private String m16646e() {
        int i10 = this.f16287d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    /* renamed from: j */
    private int m16647j(C3708d c3708d, ArrayList<C3860e> arrayList, int i10) {
        int m15778x;
        int m15778x2;
        C3861f c3861f = (C3861f) arrayList.get(0).m16339I();
        c3708d.m15760D();
        c3861f.mo16289g(c3708d, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).mo16289g(c3708d, false);
        }
        if (i10 == 0 && c3861f.f16060N0 > 0) {
            C3857b.m16297b(c3861f, c3708d, arrayList, 0);
        }
        if (i10 == 1 && c3861f.f16061O0 > 0) {
            C3857b.m16297b(c3861f, c3708d, arrayList, 1);
        }
        try {
            c3708d.m15779z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f16288e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f16288e.add(new a(arrayList.get(i12), c3708d, i10));
        }
        if (i10 == 0) {
            m15778x = c3708d.m15778x(c3861f.f15973H);
            m15778x2 = c3708d.m15778x(c3861f.f15975J);
            c3708d.m15760D();
        } else {
            m15778x = c3708d.m15778x(c3861f.f15974I);
            m15778x2 = c3708d.m15778x(c3861f.f15976K);
            c3708d.m15760D();
        }
        return m15778x2 - m15778x;
    }

    /* renamed from: a */
    public boolean m16648a(C3860e c3860e) {
        if (this.f16284a.contains(c3860e)) {
            return false;
        }
        this.f16284a.add(c3860e);
        return true;
    }

    /* renamed from: b */
    public void m16649b(ArrayList<C3927o> arrayList) {
        int size = this.f16284a.size();
        if (this.f16289f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                C3927o c3927o = arrayList.get(i10);
                if (this.f16289f == c3927o.f16285b) {
                    m16653g(this.f16287d, c3927o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int m16650c() {
        return this.f16285b;
    }

    /* renamed from: d */
    public int m16651d() {
        return this.f16287d;
    }

    /* renamed from: f */
    public int m16652f(C3708d c3708d, int i10) {
        if (this.f16284a.size() == 0) {
            return 0;
        }
        return m16647j(c3708d, this.f16284a, i10);
    }

    /* renamed from: g */
    public void m16653g(int i10, C3927o c3927o) {
        Iterator<C3860e> it = this.f16284a.iterator();
        while (it.hasNext()) {
            C3860e next = it.next();
            c3927o.m16648a(next);
            if (i10 == 0) {
                next.f15965A0 = c3927o.m16650c();
            } else {
                next.f15967B0 = c3927o.m16650c();
            }
        }
        this.f16289f = c3927o.f16285b;
    }

    /* renamed from: h */
    public void m16654h(boolean z10) {
        this.f16286c = z10;
    }

    /* renamed from: i */
    public void m16655i(int i10) {
        this.f16287d = i10;
    }

    public String toString() {
        String str = m16646e() + " [" + this.f16285b + "] <";
        Iterator<C3860e> it = this.f16284a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().m16399r();
        }
        return str + " >";
    }
}
