package p156l9;

import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.util.HashMap;

/* renamed from: l9.b */
/* loaded from: classes.dex */
public class C3901b {

    /* renamed from: a */
    private String f16172a;

    /* renamed from: b */
    private HashMap<String, b> f16173b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l9.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo16503a(AbstractC3900a abstractC3900a);
    }

    /* renamed from: l9.b$c */
    /* loaded from: classes.dex */
    private class c implements b {
        private c() {
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            abstractC3900a.mo16537a(C3901b.this.m16548c(abstractC3900a.m16542f().optString("functionName", BuildConfig.FLAVOR)), null);
        }
    }

    public C3901b(String str) {
        this.f16172a = str;
        m16549d("supports", new c());
    }

    /* renamed from: a */
    public void mo16502a(AbstractC3900a abstractC3900a) {
        String m16540d = abstractC3900a.m16540d();
        b bVar = this.f16173b.get(m16540d);
        if (bVar != null) {
            bVar.mo16503a(abstractC3900a);
            return;
        }
        Log.e("RBHybridModule", "Cannot find function " + m16540d + " in module " + this.f16172a);
        abstractC3900a.mo16537a(false, null);
    }

    /* renamed from: b */
    public String m16547b() {
        return this.f16172a;
    }

    /* renamed from: c */
    protected boolean m16548c(String str) {
        return this.f16173b.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m16549d(String str, b bVar) {
        this.f16173b.put(str, bVar);
    }
}
