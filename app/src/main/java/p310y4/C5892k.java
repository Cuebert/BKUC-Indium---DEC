package p310y4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p111i4.C3530l;

/* renamed from: y4.k */
/* loaded from: classes.dex */
public class C5892k {

    /* renamed from: m */
    public static final InterfaceC5884c f21665m = new C5890i(0.5f);

    /* renamed from: a */
    C5885d f21666a;

    /* renamed from: b */
    C5885d f21667b;

    /* renamed from: c */
    C5885d f21668c;

    /* renamed from: d */
    C5885d f21669d;

    /* renamed from: e */
    InterfaceC5884c f21670e;

    /* renamed from: f */
    InterfaceC5884c f21671f;

    /* renamed from: g */
    InterfaceC5884c f21672g;

    /* renamed from: h */
    InterfaceC5884c f21673h;

    /* renamed from: i */
    C5887f f21674i;

    /* renamed from: j */
    C5887f f21675j;

    /* renamed from: k */
    C5887f f21676k;

    /* renamed from: l */
    C5887f f21677l;

    /* renamed from: y4.k$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC5884c mo20855a(InterfaceC5884c interfaceC5884c);
    }

    /* renamed from: a */
    public static b m20862a() {
        return new b();
    }

    /* renamed from: b */
    public static b m20863b(Context context, int i10, int i11) {
        return m20864c(context, i10, i11, 0);
    }

    /* renamed from: c */
    private static b m20864c(Context context, int i10, int i11, int i12) {
        return m20865d(context, i10, i11, new C5882a(i12));
    }

    /* renamed from: d */
    private static b m20865d(Context context, int i10, int i11, InterfaceC5884c interfaceC5884c) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, C3530l.f14825O3);
        try {
            int i12 = obtainStyledAttributes.getInt(C3530l.f14832P3, 0);
            int i13 = obtainStyledAttributes.getInt(C3530l.f14853S3, i12);
            int i14 = obtainStyledAttributes.getInt(C3530l.f14860T3, i12);
            int i15 = obtainStyledAttributes.getInt(C3530l.f14846R3, i12);
            int i16 = obtainStyledAttributes.getInt(C3530l.f14839Q3, i12);
            InterfaceC5884c m20869m = m20869m(obtainStyledAttributes, C3530l.f14867U3, interfaceC5884c);
            InterfaceC5884c m20869m2 = m20869m(obtainStyledAttributes, C3530l.f14888X3, m20869m);
            InterfaceC5884c m20869m3 = m20869m(obtainStyledAttributes, C3530l.f14895Y3, m20869m);
            InterfaceC5884c m20869m4 = m20869m(obtainStyledAttributes, C3530l.f14881W3, m20869m);
            return new b().m20917y(i13, m20869m2).m20902C(i14, m20869m3).m20913u(i15, m20869m4).m20909q(i16, m20869m(obtainStyledAttributes, C3530l.f14874V3, m20869m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static b m20866e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return m20867f(context, attributeSet, i10, i11, 0);
    }

    /* renamed from: f */
    public static b m20867f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return m20868g(context, attributeSet, i10, i11, new C5882a(i12));
    }

    /* renamed from: g */
    public static b m20868g(Context context, AttributeSet attributeSet, int i10, int i11, InterfaceC5884c interfaceC5884c) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f14894Y2, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(C3530l.f14901Z2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C3530l.f14909a3, 0);
        obtainStyledAttributes.recycle();
        return m20865d(context, resourceId, resourceId2, interfaceC5884c);
    }

    /* renamed from: m */
    private static InterfaceC5884c m20869m(TypedArray typedArray, int i10, InterfaceC5884c interfaceC5884c) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return interfaceC5884c;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new C5882a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new C5890i(peekValue.getFraction(1.0f, 1.0f)) : interfaceC5884c;
    }

    /* renamed from: h */
    public C5887f m20870h() {
        return this.f21676k;
    }

    /* renamed from: i */
    public C5885d m20871i() {
        return this.f21669d;
    }

    /* renamed from: j */
    public InterfaceC5884c m20872j() {
        return this.f21673h;
    }

    /* renamed from: k */
    public C5885d m20873k() {
        return this.f21668c;
    }

    /* renamed from: l */
    public InterfaceC5884c m20874l() {
        return this.f21672g;
    }

    /* renamed from: n */
    public C5887f m20875n() {
        return this.f21677l;
    }

    /* renamed from: o */
    public C5887f m20876o() {
        return this.f21675j;
    }

    /* renamed from: p */
    public C5887f m20877p() {
        return this.f21674i;
    }

    /* renamed from: q */
    public C5885d m20878q() {
        return this.f21666a;
    }

    /* renamed from: r */
    public InterfaceC5884c m20879r() {
        return this.f21670e;
    }

    /* renamed from: s */
    public C5885d m20880s() {
        return this.f21667b;
    }

    /* renamed from: t */
    public InterfaceC5884c m20881t() {
        return this.f21671f;
    }

    /* renamed from: u */
    public boolean m20882u(RectF rectF) {
        boolean z10 = this.f21677l.getClass().equals(C5887f.class) && this.f21675j.getClass().equals(C5887f.class) && this.f21674i.getClass().equals(C5887f.class) && this.f21676k.getClass().equals(C5887f.class);
        float mo20790a = this.f21670e.mo20790a(rectF);
        return z10 && ((this.f21671f.mo20790a(rectF) > mo20790a ? 1 : (this.f21671f.mo20790a(rectF) == mo20790a ? 0 : -1)) == 0 && (this.f21673h.mo20790a(rectF) > mo20790a ? 1 : (this.f21673h.mo20790a(rectF) == mo20790a ? 0 : -1)) == 0 && (this.f21672g.mo20790a(rectF) > mo20790a ? 1 : (this.f21672g.mo20790a(rectF) == mo20790a ? 0 : -1)) == 0) && ((this.f21667b instanceof C5891j) && (this.f21666a instanceof C5891j) && (this.f21668c instanceof C5891j) && (this.f21669d instanceof C5891j));
    }

    /* renamed from: v */
    public b m20883v() {
        return new b(this);
    }

    /* renamed from: w */
    public C5892k m20884w(float f10) {
        return m20883v().m20907o(f10).m20906m();
    }

    /* renamed from: x */
    public C5892k m20885x(InterfaceC5884c interfaceC5884c) {
        return m20883v().m20908p(interfaceC5884c).m20906m();
    }

    /* renamed from: y */
    public C5892k m20886y(c cVar) {
        return m20883v().m20901B(cVar.mo20855a(m20879r())).m20905F(cVar.mo20855a(m20881t())).m20912t(cVar.mo20855a(m20872j())).m20916x(cVar.mo20855a(m20874l())).m20906m();
    }

    private C5892k(b bVar) {
        this.f21666a = bVar.f21678a;
        this.f21667b = bVar.f21679b;
        this.f21668c = bVar.f21680c;
        this.f21669d = bVar.f21681d;
        this.f21670e = bVar.f21682e;
        this.f21671f = bVar.f21683f;
        this.f21672g = bVar.f21684g;
        this.f21673h = bVar.f21685h;
        this.f21674i = bVar.f21686i;
        this.f21675j = bVar.f21687j;
        this.f21676k = bVar.f21688k;
        this.f21677l = bVar.f21689l;
    }

    /* renamed from: y4.k$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private C5885d f21678a;

        /* renamed from: b */
        private C5885d f21679b;

        /* renamed from: c */
        private C5885d f21680c;

        /* renamed from: d */
        private C5885d f21681d;

        /* renamed from: e */
        private InterfaceC5884c f21682e;

        /* renamed from: f */
        private InterfaceC5884c f21683f;

        /* renamed from: g */
        private InterfaceC5884c f21684g;

        /* renamed from: h */
        private InterfaceC5884c f21685h;

        /* renamed from: i */
        private C5887f f21686i;

        /* renamed from: j */
        private C5887f f21687j;

        /* renamed from: k */
        private C5887f f21688k;

        /* renamed from: l */
        private C5887f f21689l;

        public b() {
            this.f21678a = C5889h.m20857b();
            this.f21679b = C5889h.m20857b();
            this.f21680c = C5889h.m20857b();
            this.f21681d = C5889h.m20857b();
            this.f21682e = new C5882a(0.0f);
            this.f21683f = new C5882a(0.0f);
            this.f21684g = new C5882a(0.0f);
            this.f21685h = new C5882a(0.0f);
            this.f21686i = C5889h.m20858c();
            this.f21687j = C5889h.m20858c();
            this.f21688k = C5889h.m20858c();
            this.f21689l = C5889h.m20858c();
        }

        /* renamed from: n */
        private static float m20899n(C5885d c5885d) {
            if (c5885d instanceof C5891j) {
                return ((C5891j) c5885d).f21664a;
            }
            if (c5885d instanceof C5886e) {
                return ((C5886e) c5885d).f21613a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public b m20900A(float f10) {
            this.f21682e = new C5882a(f10);
            return this;
        }

        /* renamed from: B */
        public b m20901B(InterfaceC5884c interfaceC5884c) {
            this.f21682e = interfaceC5884c;
            return this;
        }

        /* renamed from: C */
        public b m20902C(int i10, InterfaceC5884c interfaceC5884c) {
            return m20903D(C5889h.m20856a(i10)).m20905F(interfaceC5884c);
        }

        /* renamed from: D */
        public b m20903D(C5885d c5885d) {
            this.f21679b = c5885d;
            float m20899n = m20899n(c5885d);
            if (m20899n != -1.0f) {
                m20904E(m20899n);
            }
            return this;
        }

        /* renamed from: E */
        public b m20904E(float f10) {
            this.f21683f = new C5882a(f10);
            return this;
        }

        /* renamed from: F */
        public b m20905F(InterfaceC5884c interfaceC5884c) {
            this.f21683f = interfaceC5884c;
            return this;
        }

        /* renamed from: m */
        public C5892k m20906m() {
            return new C5892k(this);
        }

        /* renamed from: o */
        public b m20907o(float f10) {
            return m20900A(f10).m20904E(f10).m20915w(f10).m20911s(f10);
        }

        /* renamed from: p */
        public b m20908p(InterfaceC5884c interfaceC5884c) {
            return m20901B(interfaceC5884c).m20905F(interfaceC5884c).m20916x(interfaceC5884c).m20912t(interfaceC5884c);
        }

        /* renamed from: q */
        public b m20909q(int i10, InterfaceC5884c interfaceC5884c) {
            return m20910r(C5889h.m20856a(i10)).m20912t(interfaceC5884c);
        }

        /* renamed from: r */
        public b m20910r(C5885d c5885d) {
            this.f21681d = c5885d;
            float m20899n = m20899n(c5885d);
            if (m20899n != -1.0f) {
                m20911s(m20899n);
            }
            return this;
        }

        /* renamed from: s */
        public b m20911s(float f10) {
            this.f21685h = new C5882a(f10);
            return this;
        }

        /* renamed from: t */
        public b m20912t(InterfaceC5884c interfaceC5884c) {
            this.f21685h = interfaceC5884c;
            return this;
        }

        /* renamed from: u */
        public b m20913u(int i10, InterfaceC5884c interfaceC5884c) {
            return m20914v(C5889h.m20856a(i10)).m20916x(interfaceC5884c);
        }

        /* renamed from: v */
        public b m20914v(C5885d c5885d) {
            this.f21680c = c5885d;
            float m20899n = m20899n(c5885d);
            if (m20899n != -1.0f) {
                m20915w(m20899n);
            }
            return this;
        }

        /* renamed from: w */
        public b m20915w(float f10) {
            this.f21684g = new C5882a(f10);
            return this;
        }

        /* renamed from: x */
        public b m20916x(InterfaceC5884c interfaceC5884c) {
            this.f21684g = interfaceC5884c;
            return this;
        }

        /* renamed from: y */
        public b m20917y(int i10, InterfaceC5884c interfaceC5884c) {
            return m20918z(C5889h.m20856a(i10)).m20901B(interfaceC5884c);
        }

        /* renamed from: z */
        public b m20918z(C5885d c5885d) {
            this.f21678a = c5885d;
            float m20899n = m20899n(c5885d);
            if (m20899n != -1.0f) {
                m20900A(m20899n);
            }
            return this;
        }

        public b(C5892k c5892k) {
            this.f21678a = C5889h.m20857b();
            this.f21679b = C5889h.m20857b();
            this.f21680c = C5889h.m20857b();
            this.f21681d = C5889h.m20857b();
            this.f21682e = new C5882a(0.0f);
            this.f21683f = new C5882a(0.0f);
            this.f21684g = new C5882a(0.0f);
            this.f21685h = new C5882a(0.0f);
            this.f21686i = C5889h.m20858c();
            this.f21687j = C5889h.m20858c();
            this.f21688k = C5889h.m20858c();
            this.f21689l = C5889h.m20858c();
            this.f21678a = c5892k.f21666a;
            this.f21679b = c5892k.f21667b;
            this.f21680c = c5892k.f21668c;
            this.f21681d = c5892k.f21669d;
            this.f21682e = c5892k.f21670e;
            this.f21683f = c5892k.f21671f;
            this.f21684g = c5892k.f21672g;
            this.f21685h = c5892k.f21673h;
            this.f21686i = c5892k.f21674i;
            this.f21687j = c5892k.f21675j;
            this.f21688k = c5892k.f21676k;
            this.f21689l = c5892k.f21677l;
        }
    }

    public C5892k() {
        this.f21666a = C5889h.m20857b();
        this.f21667b = C5889h.m20857b();
        this.f21668c = C5889h.m20857b();
        this.f21669d = C5889h.m20857b();
        this.f21670e = new C5882a(0.0f);
        this.f21671f = new C5882a(0.0f);
        this.f21672g = new C5882a(0.0f);
        this.f21673h = new C5882a(0.0f);
        this.f21674i = C5889h.m20858c();
        this.f21675j = C5889h.m20858c();
        this.f21676k = C5889h.m20858c();
        this.f21677l = C5889h.m20858c();
    }
}
