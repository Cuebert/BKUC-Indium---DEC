package p074f7;

import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.roblox.client.RbxKeyboard;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.util.Objects;
import p033c7.C1134c;
import p035c9.C1151k;
import p088g7.AbstractC3316a;

/* renamed from: f7.d0 */
/* loaded from: classes.dex */
public class C3168d0 extends AbstractC3316a {

    /* renamed from: q */
    protected NativeTextBoxInfo f13230q;

    public C3168d0(RbxKeyboard rbxKeyboard) {
        super(rbxKeyboard);
    }

    /* renamed from: k */
    private void m13875k(NativeTextBoxInfo nativeTextBoxInfo, RbxKeyboard rbxKeyboard) {
        m13876l(nativeTextBoxInfo, rbxKeyboard);
        if (nativeTextBoxInfo != null) {
            rbxKeyboard.m12213l(nativeTextBoxInfo);
            rbxKeyboard.m12214m(nativeTextBoxInfo.font, nativeTextBoxInfo.fontSize, m14585g());
        }
        rbxKeyboard.setVisibility(0);
        if (C1134c.m6537a().mo6557J()) {
            rbxKeyboard.requestFocus();
        }
    }

    /* renamed from: l */
    private void m13876l(NativeTextBoxInfo nativeTextBoxInfo, RbxKeyboard rbxKeyboard) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rbxKeyboard.getLayoutParams();
        float m14585g = m14585g();
        float f10 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.f12087x : 0.0f) * m14585g;
        float f11 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.f12088y : 0.0f) * m14585g;
        float f12 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.width : 0.0f) * m14585g;
        float f13 = nativeTextBoxInfo != null ? nativeTextBoxInfo.height : 0.0f;
        layoutParams.topMargin = (int) f11;
        layoutParams.width = (int) f12;
        layoutParams.height = (int) (m14585g * f13);
        layoutParams.leftMargin = (int) f10;
        rbxKeyboard.setLayoutParams(layoutParams);
    }

    @Override // p074f7.InterfaceC3176h0
    /* renamed from: a */
    public void mo13877a() {
        C1151k.m6707a("rbx.glview.text", "hideKeyboard()");
        this.f13794p.m12207d();
        this.f13230q = null;
    }

    @Override // p074f7.InterfaceC3176h0
    /* renamed from: b */
    public void mo13878b(long j10, boolean z10, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        C1151k.m6707a("rbx.glview.text", "showKeyboard() " + str);
        this.f13794p.setCurrentTextBox(j10);
        this.f13794p.setText(str);
        if (z10) {
            this.f13230q = nativeTextBoxInfo;
            m13875k(nativeTextBoxInfo, this.f13794p);
        }
        this.f13794p.setVisibility(0);
        this.f13794p.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) m14584f().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f13794p, 2);
        }
        this.f13794p.setSelection(str.length());
        m14588j();
    }

    @Override // p074f7.InterfaceC3176h0
    /* renamed from: c */
    public void mo13879c(String str) {
        m14587i(str);
    }

    @Override // p074f7.InterfaceC3176h0
    /* renamed from: d */
    public void mo13880d() {
        RbxKeyboard rbxKeyboard = this.f13794p;
        if (rbxKeyboard != null) {
            rbxKeyboard.m12210i();
        }
    }

    @Override // p074f7.InterfaceC3176h0
    /* renamed from: e */
    public void mo13881e() {
        NativeTextBoxInfo nativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeGetTextBoxInfo != null) {
            C1151k.m6707a("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeGetTextBoxInfo.f12087x + " y:" + nativeGetTextBoxInfo.f12088y + " width:" + nativeGetTextBoxInfo.width + " height:" + nativeGetTextBoxInfo.height + " fontSize:" + nativeGetTextBoxInfo.fontSize);
        }
        if (Objects.equals(nativeGetTextBoxInfo, this.f13230q)) {
            return;
        }
        this.f13230q = nativeGetTextBoxInfo;
        m13875k(nativeGetTextBoxInfo, this.f13794p);
    }
}
