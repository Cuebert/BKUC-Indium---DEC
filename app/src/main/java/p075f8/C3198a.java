package p075f8;

import android.app.Activity;
import com.android.billingclient.api.AbstractC1173c;
import com.android.billingclient.api.C1177e;
import com.android.billingclient.api.C1179f;
import com.android.billingclient.api.C1183h;
import com.android.billingclient.api.Purchase;
import java.util.List;
import p171n1.C4009a;
import p171n1.C4017e;
import p171n1.C4029k;
import p171n1.C4031l;
import p171n1.InterfaceC4011b;
import p171n1.InterfaceC4015d;
import p171n1.InterfaceC4019f;
import p171n1.InterfaceC4021g;
import p171n1.InterfaceC4023h;
import p171n1.InterfaceC4025i;

/* renamed from: f8.a */
/* loaded from: classes.dex */
public class C3198a implements InterfaceC3206i {

    /* renamed from: a */
    private AbstractC1173c f13342a;

    /* renamed from: k */
    public static String m14059k(Purchase purchase) {
        List<String> m6783e = purchase.m6783e();
        if (m6783e.size() > 0) {
            return m6783e.get(0);
        }
        return null;
    }

    @Override // p075f8.InterfaceC3206i
    /* renamed from: a */
    public void mo14060a(C1183h c1183h, InterfaceC4021g interfaceC4021g) {
        this.f13342a.mo6814g(c1183h, interfaceC4021g);
    }

    @Override // p075f8.InterfaceC3206i
    /* renamed from: b */
    public C1179f mo14061b(String str) {
        return this.f13342a.mo6811c(str);
    }

    @Override // p075f8.InterfaceC3206i
    /* renamed from: c */
    public void mo14062c(C4009a c4009a, InterfaceC4011b interfaceC4011b) {
        this.f13342a.mo6809a(c4009a, interfaceC4011b);
    }

    @Override // p075f8.InterfaceC3206i
    /* renamed from: d */
    public void mo14063d(AbstractC1173c abstractC1173c) {
        this.f13342a = abstractC1173c;
    }

    @Override // p075f8.InterfaceC3206i
    /* renamed from: e */
    public void mo14064e(C4017e c4017e, InterfaceC4019f interfaceC4019f) {
        this.f13342a.mo6810b(c4017e, interfaceC4019f);
    }

    @Override // p075f8.InterfaceC3206i
    /* renamed from: f */
    public boolean mo14065f() {
        return this.f13342a.mo6812d();
    }

    @Override // p075f8.InterfaceC3206i
    /* renamed from: g */
    public void mo14066g(C4029k c4029k, InterfaceC4023h interfaceC4023h) {
        this.f13342a.mo6815h(c4029k, interfaceC4023h);
    }

    @Override // p075f8.InterfaceC3206i
    /* renamed from: h */
    public C1179f mo14067h(Activity activity, C1177e c1177e) {
        return this.f13342a.mo6813e(activity, c1177e);
    }

    @Override // p075f8.InterfaceC3206i
    /* renamed from: i */
    public void mo14068i(InterfaceC4015d interfaceC4015d) {
        this.f13342a.mo6817j(interfaceC4015d);
    }

    @Override // p075f8.InterfaceC3206i
    /* renamed from: j */
    public void mo14069j(C4031l c4031l, InterfaceC4025i interfaceC4025i) {
        this.f13342a.mo6816i(c4031l, interfaceC4025i);
    }
}
