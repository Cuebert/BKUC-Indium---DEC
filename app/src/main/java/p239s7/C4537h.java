package p239s7;

import android.content.Context;
import p035c9.C1151k;
import p239s7.C4531b;
import p263u7.C4869a;
import p300x7.C5565g;

/* renamed from: s7.h */
/* loaded from: classes.dex */
public class C4537h {

    /* renamed from: a */
    C4869a f18299a = new C4869a();

    /* renamed from: b */
    C4531b f18300b = C4531b.m18550f();

    /* renamed from: s7.h$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4536g {

        /* renamed from: a */
        final /* synthetic */ boolean f18301a;

        /* renamed from: b */
        final /* synthetic */ Context f18302b;

        /* renamed from: c */
        final /* synthetic */ c f18303c;

        a(boolean z10, Context context, c cVar) {
            this.f18301a = z10;
            this.f18302b = context;
            this.f18303c = cVar;
        }

        @Override // p239s7.InterfaceC4536g
        /* renamed from: a */
        public void mo18587a(C4535f c4535f, C4535f c4535f2, String str) {
            if (!this.f18301a && !C5565g.m20445e().m20459i()) {
                if (c4535f != null) {
                    C1151k.m6712f("rbx.locale", "persisting loginSignUpLocale locale: " + c4535f);
                    C4537h.this.f18300b.m18564o(c4535f, this.f18302b);
                } else {
                    c4535f = C4537h.this.f18300b.m18556d(this.f18302b);
                }
                C4537h.this.f18300b.m18568s(C4531b.b.LOCALE_MODE_LOGIN_SIGN_UP);
            } else {
                C4537h.this.f18300b.m18568s(C4531b.b.LOCALE_MODE_GENERAL_EXPERIENCE);
                c4535f = c4535f2;
            }
            C4537h.this.f18300b.m18569t(this.f18302b, str);
            C4537h.this.f18300b.m18567r(c4535f2);
            this.f18303c.mo13578a(C4537h.this.f18300b.m18563n(c4535f, this.f18302b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s7.h$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC4536g {

        /* renamed from: a */
        final /* synthetic */ Context f18305a;

        /* renamed from: b */
        final /* synthetic */ d f18306b;

        b(Context context, d dVar) {
            this.f18305a = context;
            this.f18306b = dVar;
        }

        @Override // p239s7.InterfaceC4536g
        /* renamed from: a */
        public void mo18587a(C4535f c4535f, C4535f c4535f2, String str) {
            if (C5565g.m20445e().m20459i() || C4537h.this.f18300b.m18558g() == C4531b.b.LOCALE_MODE_GENERAL_EXPERIENCE) {
                c4535f = c4535f2;
            }
            C4537h.this.f18300b.m18569t(this.f18305a, str);
            this.f18306b.mo12658a(C4537h.this.f18300b.m18563n(c4535f, this.f18305a));
        }
    }

    /* renamed from: s7.h$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo13578a(boolean z10);
    }

    /* renamed from: s7.h$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo12658a(boolean z10);
    }

    /* renamed from: a */
    public void m18588a(Context context, c cVar) {
        m18589b(context, false, cVar);
    }

    /* renamed from: b */
    public void m18589b(Context context, boolean z10, c cVar) {
        this.f18299a.m19068d(this.f18300b.m18557e(), new a(z10, context, cVar));
    }

    /* renamed from: c */
    public void m18590c(Context context, d dVar) {
        this.f18299a.m19068d(this.f18300b.m18557e(), new b(context, dVar));
    }
}
