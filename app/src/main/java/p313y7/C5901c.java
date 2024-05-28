package p313y7;

import android.app.Activity;
import androidx.fragment.app.ActivityC0803d;
import androidx.lifecycle.InterfaceC0844k;
import com.roblox.client.C2822f0;
import com.roblox.client.C2871m0;
import com.roblox.client.C2885q;
import p300x7.C5560b;

/* renamed from: y7.c */
/* loaded from: classes.dex */
public class C5901c {

    /* renamed from: a */
    private C2871m0 f21740a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y7.c$a */
    /* loaded from: classes.dex */
    public class a implements C2885q.d {

        /* renamed from: a */
        final /* synthetic */ ActivityC0803d f21741a;

        a(ActivityC0803d activityC0803d) {
            this.f21741a = activityC0803d;
        }

        @Override // com.roblox.client.C2885q.d
        /* renamed from: a */
        public void mo13021a() {
            C5901c.this.m20994b(this.f21741a);
        }
    }

    /* renamed from: y7.c$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo20368a();
    }

    public C5901c(C2871m0 c2871m0) {
        this.f21740a = c2871m0;
    }

    /* renamed from: b */
    public void m20994b(Activity activity) {
        if (activity != null) {
            C5560b.m20357e().m20364h(activity, C5560b.f.LOGOUT_BY_USER_IN_NATIVE);
        }
    }

    /* renamed from: c */
    public void m20995c(InterfaceC0844k interfaceC0844k) {
        if (this.f21740a == null) {
            return;
        }
        C2822f0.m12498t("logout");
        ActivityC0803d m4363p = this.f21740a.m4363p();
        C2885q c2885q = new C2885q();
        c2885q.m4606m2(2, 0);
        if (interfaceC0844k != null) {
            c2885q.mo583f().mo4889a(interfaceC0844k);
        }
        c2885q.m13020A2(new a(m4363p));
        c2885q.mo4608o2(m4363p.m4617y0(), "dialog");
    }
}
