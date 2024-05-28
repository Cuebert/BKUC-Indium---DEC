package p154l7;

import org.json.JSONException;
import p008a7.C0046d;
import p008a7.C0052j;
import p024bc.C1100c;
import p035c9.C1151k;
import p156l9.AbstractC3900a;
import p156l9.C3901b;

/* renamed from: l7.g */
/* loaded from: classes.dex */
public class C3893g extends C3901b {

    /* renamed from: l7.g$b */
    /* loaded from: classes.dex */
    private class b implements C3901b.b {
        private b() {
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            C1151k.m6714h("RBHybridModuleOverlay", "RBHybridModuleOverlay CloseOverlay.execute() " + abstractC3900a.m16542f());
            C1100c.m6458d().m6469j(new C0046d());
        }
    }

    /* renamed from: l7.g$c */
    /* loaded from: classes.dex */
    private class c implements C3901b.b {
        private c() {
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            C1151k.m6714h("RBHybridModuleOverlay", "RBHybridModuleOverlay SetSubmitState.execute() " + abstractC3900a.m16542f());
            try {
                C1100c.m6458d().m6469j(new C0052j(abstractC3900a.m16542f().getString("submitButtonState")));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public C3893g() {
        super("Overlay");
        m16549d("close", new b());
        m16549d("setSubmitState", new c());
    }
}
