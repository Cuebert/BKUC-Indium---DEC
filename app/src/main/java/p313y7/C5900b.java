package p313y7;

import android.os.Bundle;
import androidx.fragment.app.ActivityC0803d;
import androidx.lifecycle.InterfaceC0844k;
import com.roblox.client.C2822f0;
import com.roblox.client.C2871m0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2915y;
import p061e7.C3084e;
import p061e7.C3087h;
import p300x7.C5563e;

/* renamed from: y7.b */
/* loaded from: classes.dex */
public class C5900b extends AbstractC5899a {

    /* renamed from: b */
    private String f21739b;

    public C5900b(C2871m0 c2871m0, String str) {
        super(c2871m0.m4363p());
        this.f21739b = str;
    }

    /* renamed from: c */
    public void m20992c(InterfaceC0844k interfaceC0844k) {
        if (m20990a()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("showPremium", true);
            ActivityC0803d activityC0803d = this.f21738a;
            int i10 = C2915y.f11879m;
            if (activityC0803d.findViewById(i10) == null) {
                C5563e.m20379h().m20388A("robux_buildsclub_no_container_for_purchase");
            }
            if (this.f21738a.findViewById(i10) != null) {
                C3087h c3087h = new C3087h();
                if (interfaceC0844k != null) {
                    c3087h.mo583f().mo4889a(interfaceC0844k);
                }
                c3087h.m4282H1(bundle);
                c3087h.m13251x2(C2877p0.m12942q());
                this.f21738a.m4617y0().m4504m().m4751g("robuxPurchase").m4747c(i10, c3087h, "dialog").mo4559h();
            } else {
                bundle.putInt("dialogHeight", m20991b());
                C3084e c3084e = new C3084e();
                if (interfaceC0844k != null) {
                    c3084e.mo583f().mo4889a(interfaceC0844k);
                }
                c3084e.m4282H1(bundle);
                c3084e.m13203X2(C2877p0.m12942q());
                c3084e.m4606m2(1, c3084e.m4600f2());
                c3084e.mo4608o2(this.f21738a.m4617y0(), "dialog");
            }
            C2822f0.m12482d("nativeMain", "buildersClub", this.f21739b);
        }
    }
}
