package p313y7;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0803d;
import androidx.lifecycle.InterfaceC0844k;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2745b0;
import com.roblox.client.C2816d0;
import com.roblox.client.C2822f0;
import com.roblox.client.C2871m0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2911w;
import com.roblox.client.C2913x;
import com.roblox.client.C2915y;
import p033c7.C1134c;
import p035c9.C1152l;
import p061e7.C3084e;
import p061e7.C3087h;
import p300x7.C5563e;
import p314y8.C5913g;
import p314y8.EnumC5912f;
import p314y8.InterfaceC5909c;

/* renamed from: y7.e */
/* loaded from: classes.dex */
public class C5903e extends AbstractC5899a {

    /* renamed from: b */
    private String f21752b;

    /* renamed from: c */
    private InterfaceC5909c f21753c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y7.e$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5903e.this.m21009f();
        }
    }

    /* renamed from: y7.e$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21755a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f21755a = iArr;
            try {
                iArr[EnumC5912f.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21755a[EnumC5912f.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21755a[EnumC5912f.CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C5903e(C2871m0 c2871m0, String str) {
        super(c2871m0.m4363p());
        this.f21752b = str;
        this.f21753c = new C5913g();
    }

    /* renamed from: c */
    private int m21006c(EnumC5912f enumC5912f) {
        if (b.f21755a[enumC5912f.ordinal()] != 1) {
            return C2816d0.f11008c;
        }
        return C2816d0.f11006a;
    }

    /* renamed from: d */
    private int m21007d(EnumC5912f enumC5912f) {
        return C2913x.f11747T;
    }

    /* renamed from: e */
    public MenuItem m21008e(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C2745b0.f10475b, menu);
        MenuItem findItem = menu.findItem(C2915y.f11849c);
        View actionView = findItem.getActionView();
        actionView.setOnClickListener(new a());
        ((ImageView) actionView.findViewById(C2915y.f11862g0)).setImageResource(m21007d(this.f21753c.mo21034c()));
        return findItem;
    }

    /* renamed from: f */
    public void m21009f() {
        m21010g(null);
    }

    /* renamed from: g */
    public void m21010g(InterfaceC0844k interfaceC0844k) {
        String m12867H0;
        int m20991b;
        if (m20990a()) {
            if (C1152l.m6736g() && C1134c.m6537a().mo6624l()) {
                m20991b = this.f21738a.getResources().getDimensionPixelSize(C2911w.f11725e);
                m12867H0 = BuildConfig.FLAVOR;
            } else {
                m12867H0 = C2877p0.m12867H0();
                m20991b = m20991b();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("showRobux", true);
            ActivityC0803d activityC0803d = this.f21738a;
            int i10 = C2915y.f11879m;
            if (activityC0803d.findViewById(i10) == null) {
                C5563e.m20379h().m20388A("robux_menuoption_no_container_for_purchase");
            }
            if (this.f21738a.findViewById(i10) != null) {
                C3087h c3087h = new C3087h();
                c3087h.m4282H1(bundle);
                c3087h.m13251x2(m12867H0);
                if (interfaceC0844k != null) {
                    c3087h.mo583f().mo4889a(interfaceC0844k);
                }
                this.f21738a.m4617y0().m4504m().m4751g("robuxPurchase").m4747c(i10, c3087h, "dialog").mo4559h();
            } else {
                bundle.putInt("dialogHeight", m20991b);
                C3084e c3084e = new C3084e();
                c3084e.m4282H1(bundle);
                c3084e.m13203X2(m12867H0);
                c3084e.m4606m2(1, m21006c(this.f21753c.mo21034c()));
                if (interfaceC0844k != null) {
                    c3084e.mo583f().mo4889a(interfaceC0844k);
                }
                c3084e.mo4608o2(this.f21738a.m4617y0(), "dialog");
            }
            C2822f0.m12482d("nativeMain", "robux", this.f21752b);
        }
    }
}
