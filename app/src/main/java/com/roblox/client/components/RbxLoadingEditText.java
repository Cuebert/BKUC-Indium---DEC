package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2913x;

/* loaded from: classes.dex */
public class RbxLoadingEditText extends RbxEditText {

    /* renamed from: G */
    protected ProgressBar f10903G;

    public RbxLoadingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup(context);
    }

    private void setup(Context context) {
        ProgressBar progressBar = (ProgressBar) LinearLayout.inflate(context, C2738a0.f10435z, null);
        this.f10903G = progressBar;
        progressBar.setIndeterminateDrawable(m12332n(context, C2913x.f11731D));
    }

    @Override // com.roblox.client.components.RbxEditText
    /* renamed from: B */
    public void mo12329B(String str) {
        super.mo12329B(str);
        m12364E();
    }

    /* renamed from: E */
    protected void m12364E() {
        View childAt = this.f10854o.getChildAt(0);
        if (childAt instanceof ProgressBar) {
            this.f10854o.removeView(childAt);
        }
    }

    /* renamed from: F */
    public void m12365F() {
        m12328A(C2748c0.f10680k3);
        this.f10854o.addView(this.f10903G, 0);
    }

    @Override // com.roblox.client.components.RbxEditText
    /* renamed from: w */
    public void mo12338w(String str) {
        super.mo12338w(str);
        m12364E();
    }
}
