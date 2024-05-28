package com.roblox.client.signup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.roblox.client.C2913x;
import com.roblox.client.components.RbxLoadingEditText;

/* loaded from: classes.dex */
public class UsernameSignUpEditText extends RbxLoadingEditText {

    /* renamed from: H */
    private InterfaceC2898b f11516H;

    /* renamed from: I */
    private final View.OnClickListener f11517I;

    /* renamed from: com.roblox.client.signup.UsernameSignUpEditText$a */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC2896a implements View.OnClickListener {
        ViewOnClickListenerC2896a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UsernameSignUpEditText.this.f11516H != null) {
                UsernameSignUpEditText.this.f11516H.m13142a();
            }
        }
    }

    public UsernameSignUpEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11517I = new ViewOnClickListenerC2896a();
        m13062p();
    }

    /* renamed from: p */
    private void m13062p() {
        this.f10856q = false;
    }

    /* renamed from: H */
    public void m13063H() {
        setRightDrawableClickListener(null);
        setRightIcon(C2913x.f11762k);
    }

    /* renamed from: I */
    public void m13064I() {
        setRightIcon(0);
    }

    /* renamed from: J */
    public void m13065J() {
        setRightDrawableClickListener(this.f11517I);
        setRightIcon(C2913x.f11761j);
    }

    /* renamed from: K */
    public void m13066K() {
        setRightDrawableClickListener(null);
        setRightIcon(C2913x.f11763l);
    }

    public void setGenerateUsernameIconTouchListener(InterfaceC2898b interfaceC2898b) {
        this.f11516H = interfaceC2898b;
    }

    @Override // com.roblox.client.components.RbxEditText
    protected void setRightIcon(int i10) {
    }
}
