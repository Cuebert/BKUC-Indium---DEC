package qa;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import qa.AbstractC4364y;
import qa.C4359t;
import qa.InterfaceC4349j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.r */
/* loaded from: classes.dex */
public class C4357r extends AbstractC4364y {

    /* renamed from: a */
    private final InterfaceC4349j f17732a;

    /* renamed from: b */
    private final C4334a0 f17733b;

    /* renamed from: qa.r$a */
    /* loaded from: classes.dex */
    static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public C4357r(InterfaceC4349j interfaceC4349j, C4334a0 c4334a0) {
        this.f17732a = interfaceC4349j;
        this.f17733b = c4334a0;
    }

    @Override // qa.AbstractC4364y
    /* renamed from: c */
    public boolean mo17891c(C4362w c4362w) {
        String scheme = c4362w.f17789d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // qa.AbstractC4364y
    /* renamed from: e */
    public int mo17998e() {
        return 2;
    }

    @Override // qa.AbstractC4364y
    /* renamed from: f */
    public AbstractC4364y.a mo17892f(C4362w c4362w, int i10) throws IOException {
        InterfaceC4349j.a mo17925a = this.f17732a.mo17925a(c4362w.f17789d, c4362w.f17788c);
        if (mo17925a == null) {
            return null;
        }
        C4359t.e eVar = mo17925a.f17698c ? C4359t.e.DISK : C4359t.e.NETWORK;
        Bitmap m17982a = mo17925a.m17982a();
        if (m17982a != null) {
            return new AbstractC4364y.a(m17982a, eVar);
        }
        InputStream m17984c = mo17925a.m17984c();
        if (m17984c == null) {
            return null;
        }
        if (eVar == C4359t.e.DISK && mo17925a.m17983b() == 0) {
            C4346g0.m17934e(m17984c);
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == C4359t.e.NETWORK && mo17925a.m17983b() > 0) {
            this.f17733b.m17884f(mo17925a.m17983b());
        }
        return new AbstractC4364y.a(m17984c, eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // qa.AbstractC4364y
    /* renamed from: h */
    public boolean mo17999h(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // qa.AbstractC4364y
    /* renamed from: i */
    public boolean mo18000i() {
        return true;
    }
}
