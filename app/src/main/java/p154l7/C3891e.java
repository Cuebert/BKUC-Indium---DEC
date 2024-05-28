package p154l7;

import android.text.TextUtils;
import p008a7.C0043a;
import p024bc.C1100c;
import p035c9.C1151k;
import p156l9.AbstractC3900a;
import p156l9.C3901b;
import p239s7.C4535f;

/* renamed from: l7.e */
/* loaded from: classes.dex */
public class C3891e extends C3901b {

    /* renamed from: l7.e$a */
    /* loaded from: classes.dex */
    class a implements C3901b.b {
        a() {
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            m16504b(abstractC3900a, C1100c.m6458d());
        }

        /* renamed from: b */
        void m16504b(AbstractC3900a abstractC3900a, C1100c c1100c) {
            C1151k.m6714h("rbx.locale", "RBHybridModuleLocalization LanguageChangeTrigger.execute() " + abstractC3900a.m16542f());
            String optString = abstractC3900a.m16542f().optString("newRobloxLanguageValue");
            if (!TextUtils.isEmpty(optString)) {
                C1151k.m6714h("rbx.locale", "newRobloxLocaleValue " + optString);
                C4535f m18584b = C4535f.m18584b(optString);
                if (m18584b != null) {
                    c1100c.m6469j(new C0043a(m18584b));
                }
                abstractC3900a.mo16537a(true, null);
                return;
            }
            abstractC3900a.mo16537a(false, null);
        }
    }

    public C3891e() {
        super("Localization");
        m16549d("languageChangeTrigger", new a());
    }
}
