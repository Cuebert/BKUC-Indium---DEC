package p285w5;

import p285w5.C5458a;
import p285w5.C5460c;

/* renamed from: w5.d */
/* loaded from: classes.dex */
public abstract class AbstractC5461d {

    /* renamed from: a */
    public static AbstractC5461d f20375a = m20077a().mo20057a();

    /* renamed from: w5.d$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC5461d mo20057a();

        /* renamed from: b */
        public abstract a mo20058b(String str);

        /* renamed from: c */
        public abstract a mo20059c(long j10);

        /* renamed from: d */
        public abstract a mo20060d(String str);

        /* renamed from: e */
        public abstract a mo20061e(String str);

        /* renamed from: f */
        public abstract a mo20062f(String str);

        /* renamed from: g */
        public abstract a mo20063g(C5460c.a aVar);

        /* renamed from: h */
        public abstract a mo20064h(long j10);
    }

    /* renamed from: a */
    public static a m20077a() {
        return new C5458a.b().mo20064h(0L).mo20063g(C5460c.a.ATTEMPT_MIGRATION).mo20059c(0L);
    }

    /* renamed from: b */
    public abstract String mo20049b();

    /* renamed from: c */
    public abstract long mo20050c();

    /* renamed from: d */
    public abstract String mo20051d();

    /* renamed from: e */
    public abstract String mo20052e();

    /* renamed from: f */
    public abstract String mo20053f();

    /* renamed from: g */
    public abstract C5460c.a mo20054g();

    /* renamed from: h */
    public abstract long mo20055h();

    /* renamed from: i */
    public boolean m20078i() {
        return mo20054g() == C5460c.a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m20079j() {
        return mo20054g() == C5460c.a.NOT_GENERATED || mo20054g() == C5460c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean m20080k() {
        return mo20054g() == C5460c.a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m20081l() {
        return mo20054g() == C5460c.a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m20082m() {
        return mo20054g() == C5460c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract a mo20056n();

    /* renamed from: o */
    public AbstractC5461d m20083o(String str, long j10, long j11) {
        return mo20056n().mo20058b(str).mo20059c(j10).mo20064h(j11).mo20057a();
    }

    /* renamed from: p */
    public AbstractC5461d m20084p() {
        return mo20056n().mo20058b(null).mo20057a();
    }

    /* renamed from: q */
    public AbstractC5461d m20085q(String str) {
        return mo20056n().mo20061e(str).mo20063g(C5460c.a.REGISTER_ERROR).mo20057a();
    }

    /* renamed from: r */
    public AbstractC5461d m20086r() {
        return mo20056n().mo20063g(C5460c.a.NOT_GENERATED).mo20057a();
    }

    /* renamed from: s */
    public AbstractC5461d m20087s(String str, String str2, long j10, String str3, long j11) {
        return mo20056n().mo20060d(str).mo20063g(C5460c.a.REGISTERED).mo20058b(str3).mo20062f(str2).mo20059c(j11).mo20064h(j10).mo20057a();
    }

    /* renamed from: t */
    public AbstractC5461d m20088t(String str) {
        return mo20056n().mo20060d(str).mo20063g(C5460c.a.UNREGISTERED).mo20057a();
    }
}
