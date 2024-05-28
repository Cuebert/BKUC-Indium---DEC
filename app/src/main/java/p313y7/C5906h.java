package p313y7;

import androidx.appcompat.widget.SearchView;
import com.roblox.client.C2748c0;
import com.roblox.client.C2906t0;
import p008a7.C0058p;
import p024bc.C1100c;
import p313y7.C5904f;
import p314y8.C5913g;
import p314y8.EnumC5912f;
import p314y8.InterfaceC5909c;

/* renamed from: y7.h */
/* loaded from: classes.dex */
public class C5906h implements C5904f.e {

    /* renamed from: a */
    private C2906t0 f21769a;

    /* renamed from: b */
    private String f21770b;

    /* renamed from: c */
    private final String f21771c;

    /* renamed from: d */
    private final String f21772d;

    /* renamed from: e */
    private final String f21773e;

    /* renamed from: f */
    private final String f21774f;

    /* renamed from: g */
    private InterfaceC5909c f21775g = new C5913g();

    public C5906h(C2906t0 c2906t0) {
        this.f21769a = c2906t0;
        this.f21771c = c2906t0.m4328Y(C2748c0.f10765y4);
        this.f21772d = this.f21769a.m4328Y(C2748c0.f10488A4);
        this.f21773e = this.f21769a.m4328Y(C2748c0.f10759x4);
        this.f21774f = this.f21769a.m4328Y(C2748c0.f10771z4);
    }

    /* renamed from: e */
    private String m21033e() {
        String str = this.f21770b;
        return str != null ? str : this.f21769a.m13200P2();
    }

    @Override // p313y7.C5904f.e
    /* renamed from: a */
    public String mo21029a() {
        int mo21030b = mo21030b();
        if (mo21030b != 1) {
            if (mo21030b == 3) {
                return this.f21773e;
            }
            if (mo21030b != 4) {
                if (mo21030b != 5) {
                    return this.f21771c;
                }
                return this.f21774f;
            }
        }
        return this.f21772d;
    }

    @Override // p313y7.C5904f.e
    /* renamed from: b */
    public int mo21030b() {
        String m21033e = m21033e();
        if (m21033e == null) {
            return 2;
        }
        if (m21033e.contains("profile") || m21033e.contains("friends") || m21033e.contains("users")) {
            return 1;
        }
        if (m21033e.contains("games")) {
            return 2;
        }
        if (m21033e.contains("catalog")) {
            return 3;
        }
        return m21033e.contains("groups") ? 5 : 2;
    }

    @Override // p314y8.InterfaceC5909c
    /* renamed from: c */
    public EnumC5912f mo21034c() {
        return this.f21775g.mo21034c();
    }

    @Override // p313y7.C5904f.e
    /* renamed from: d */
    public boolean mo21031d(SearchView searchView, String str) {
        C1100c.m6458d().m6469j(new C0058p(mo21030b(), str));
        searchView.onActionViewCollapsed();
        return true;
    }

    /* renamed from: f */
    public void m21035f(String str) {
        this.f21770b = str;
    }

    @Override // p313y7.C5904f.e
    public boolean onQueryTextChange(String str) {
        return false;
    }
}
