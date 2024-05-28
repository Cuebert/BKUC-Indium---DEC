package p162m4;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p247t4.C4731a;

/* renamed from: m4.d */
/* loaded from: classes.dex */
public interface InterfaceC3955d {

    /* renamed from: m4.d$b */
    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b */
        public static final TypeEvaluator<e> f16340b = new b();

        /* renamed from: a */
        private final e f16341a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f16341a.m16688a(C4731a.m18863c(eVar.f16344a, eVar2.f16344a, f10), C4731a.m18863c(eVar.f16345b, eVar2.f16345b, f10), C4731a.m18863c(eVar.f16346c, eVar2.f16346c, f10));
            return this.f16341a;
        }
    }

    /* renamed from: m4.d$c */
    /* loaded from: classes.dex */
    public static class c extends Property<InterfaceC3955d, e> {

        /* renamed from: a */
        public static final Property<InterfaceC3955d, e> f16342a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(InterfaceC3955d interfaceC3955d) {
            return interfaceC3955d.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC3955d interfaceC3955d, e eVar) {
            interfaceC3955d.setRevealInfo(eVar);
        }
    }

    /* renamed from: m4.d$d */
    /* loaded from: classes.dex */
    public static class d extends Property<InterfaceC3955d, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC3955d, Integer> f16343a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(InterfaceC3955d interfaceC3955d) {
            return Integer.valueOf(interfaceC3955d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC3955d interfaceC3955d, Integer num) {
            interfaceC3955d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: m4.d$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public float f16344a;

        /* renamed from: b */
        public float f16345b;

        /* renamed from: c */
        public float f16346c;

        private e() {
        }

        /* renamed from: a */
        public void m16688a(float f10, float f11, float f12) {
            this.f16344a = f10;
            this.f16345b = f11;
            this.f16346c = f12;
        }

        public e(float f10, float f11, float f12) {
            this.f16344a = f10;
            this.f16345b = f11;
            this.f16346c = f12;
        }
    }

    /* renamed from: a */
    void mo16681a();

    /* renamed from: b */
    void mo16682b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
