package p263u7;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p035c9.C1155o;
import p091gc.C3348t;
import p091gc.InterfaceC3330b;
import p091gc.InterfaceC3332d;
import p100h7.C3418k;
import p179n9.C4083g;
import p193ob.AbstractC4183j0;
import p239s7.C4535f;
import p239s7.InterfaceC4536g;
import p275v7.C4990a;

/* renamed from: u7.a */
/* loaded from: classes.dex */
public class C4869a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u7.a$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC3332d<AbstractC4183j0> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4536g f18759a;

        a(InterfaceC4536g interfaceC4536g) {
            this.f18759a = interfaceC4536g;
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, C3348t<AbstractC4183j0> c3348t) {
            C4869a.this.m19067c(C1155o.m6742a(c3348t), c3348t.m14732b(), this.f18759a);
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, Throwable th) {
            C4869a.this.m19066b(this.f18759a);
        }
    }

    /* renamed from: a */
    void m19065a(String str, String str2, String str3, InterfaceC4536g interfaceC4536g) {
        if (interfaceC4536g != null) {
            interfaceC4536g.mo18587a(C4535f.m18584b(str), C4535f.m18584b(str2), str3);
        }
    }

    /* renamed from: b */
    void m19066b(InterfaceC4536g interfaceC4536g) {
        C1151k.m6712f("rbx.locale", " api failure");
        m19065a(null, null, null, interfaceC4536g);
    }

    /* renamed from: c */
    void m19067c(String str, int i10, InterfaceC4536g interfaceC4536g) {
        String m19434a;
        String m19436c;
        C1151k.m6712f("rbx.locale", "response: " + str + " ,response code:" + i10);
        String str2 = null;
        if (i10 == 200) {
            try {
                C4990a c4990a = new C4990a(new JSONObject(str));
                String m19435b = c4990a.m19435b();
                m19434a = c4990a.m19434a();
                str2 = m19435b;
                m19436c = c4990a.m19436c();
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            C1151k.m6712f("rbx.locale", "loginSignUpLocale = " + str2);
            C1151k.m6712f("rbx.locale", "generalExperienceLocale = " + m19434a);
            C1151k.m6712f("rbx.locale", "ugcLocale = " + m19436c);
            m19065a(str2, m19434a, m19436c, interfaceC4536g);
        }
        C1151k.m6712f("rbx.locale", "response code != 200, response code = " + i10);
        m19436c = null;
        m19434a = null;
        C1151k.m6712f("rbx.locale", "loginSignUpLocale = " + str2);
        C1151k.m6712f("rbx.locale", "generalExperienceLocale = " + m19434a);
        C1151k.m6712f("rbx.locale", "ugcLocale = " + m19436c);
        m19065a(str2, m19434a, m19436c, interfaceC4536g);
    }

    /* renamed from: d */
    public void m19068d(Locale locale, InterfaceC4536g interfaceC4536g) {
        if (locale != null) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            C1151k.m6712f("rbx.locale", "deviceLocale: " + language + "-" + country);
            C4083g.m16979d().mo16972e(C3418k.m15032a().m15033b()).m18291a(language + "-" + country).mo14636W(new a(interfaceC4536g));
            return;
        }
        C1151k.m6712f("rbx.locale", "device locale null");
        m19065a(null, null, null, interfaceC4536g);
    }
}
