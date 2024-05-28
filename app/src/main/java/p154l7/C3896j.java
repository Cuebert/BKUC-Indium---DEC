package p154l7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import androidx.appcompat.app.DialogC0152b;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2748c0;
import com.roblox.client.C2822f0;
import org.json.JSONObject;
import p035c9.C1152l;
import p156l9.AbstractC3900a;
import p156l9.C3901b;
import p300x7.C5563e;

/* renamed from: l7.j */
/* loaded from: classes.dex */
public class C3896j extends C3901b {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l7.j$b */
    /* loaded from: classes.dex */
    public class b implements C3901b.b {
        private b() {
        }

        /* renamed from: b */
        private void m16508b(Context context, int i10) {
            DialogC0152b.a aVar = new DialogC0152b.a(context);
            aVar.m702h(context.getString(i10));
            aVar.m705k(C2748c0.f10519G2, null);
            aVar.m695a().show();
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            String obj;
            String obj2;
            JSONObject m16542f = abstractC3900a.m16542f();
            String optString = m16542f.optString("text");
            String optString2 = m16542f.optString("link");
            C5563e.m20379h().m20388A("Android-AppMain-GameShare-ChooserShown");
            if (!TextUtils.isEmpty(optString2) && optString != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    obj = Html.fromHtml(optString, 63).toString();
                    obj2 = Html.fromHtml(optString2, 63).toString();
                } else {
                    obj = Html.fromHtml(optString).toString();
                    obj2 = Html.fromHtml(optString2).toString();
                }
                String string = abstractC3900a.mo16539c().getString(C2748c0.f10487A3, obj);
                C2822f0.m12500v(BuildConfig.FLAVOR, obj2);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", string + " " + obj2);
                intent.putExtra("android.intent.extra.SUBJECT", string);
                if (C1152l.m6730a(abstractC3900a.mo16539c(), intent)) {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.PICK_ACTIVITY");
                    intent2.putExtra("android.intent.extra.INTENT", intent);
                    ((Activity) abstractC3900a.mo16539c()).startActivityForResult(intent2, 20103);
                    abstractC3900a.mo16537a(true, null);
                    return;
                }
                m16508b(abstractC3900a.mo16539c(), C2748c0.f10540K3);
                abstractC3900a.mo16537a(false, null);
                return;
            }
            m16508b(abstractC3900a.mo16539c(), C2748c0.f10545L3);
            abstractC3900a.mo16537a(false, null);
        }

        /* synthetic */ b(C3896j c3896j, a aVar) {
            this();
        }
    }

    public C3896j() {
        super("Social");
        m16549d("presentShareDialog", new b());
    }
}
