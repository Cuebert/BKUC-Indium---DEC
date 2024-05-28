package p088g7;

import android.content.Context;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.RbxKeyboard;
import p074f7.InterfaceC3176h0;
import p076f9.C3211e;

/* renamed from: g7.a */
/* loaded from: classes.dex */
public abstract class AbstractC3316a implements InterfaceC3176h0 {

    /* renamed from: n */
    protected final String f13792n = "rbx.glview.text";

    /* renamed from: o */
    protected C3211e f13793o = new C3211e();

    /* renamed from: p */
    protected RbxKeyboard f13794p;

    public AbstractC3316a(RbxKeyboard rbxKeyboard) {
        this.f13794p = rbxKeyboard;
        rbxKeyboard.setVisibility(8);
        this.f13794p.setImeOptions(268435460);
        this.f13794p.setSingleLine(true);
        this.f13794p.setText(BuildConfig.FLAVOR);
        this.f13794p.m12208e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public Context m14584f() {
        return this.f13794p.getContext();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public float m14585g() {
        return this.f13793o.m14259b(m14584f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public long m14586h() {
        return this.f13794p.getCurrentTextBox();
    }

    /* renamed from: i */
    public void m14587i(String str) {
        if (this.f13794p.getText().toString().equals(str)) {
            return;
        }
        this.f13794p.setText(str);
        this.f13794p.setSelection(str.length());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void m14588j() {
        this.f13794p.m12212k();
    }
}
