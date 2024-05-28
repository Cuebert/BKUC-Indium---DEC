package com.roblox.client;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import org.greenrobot.eventbus.ThreadMode;
import p008a7.C0051i;
import p024bc.C1100c;
import p024bc.InterfaceC1107j;

/* renamed from: com.roblox.client.q */
/* loaded from: classes.dex */
public class C2885q extends C2871m0 {

    /* renamed from: Q0 */
    private d f11481Q0;

    /* renamed from: com.roblox.client.q$a */
    /* loaded from: classes.dex */
    class a implements DialogInterface.OnCancelListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C2822f0.m12481c("logout", "no");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.roblox.client.q$b */
    /* loaded from: classes.dex */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C2822f0.m12481c("logout", "no");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.roblox.client.q$c */
    /* loaded from: classes.dex */
    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C2822f0.m12481c("logout", "yes");
            dialogInterface.dismiss();
            C2885q.this.f11481Q0.mo13021a();
        }
    }

    /* renamed from: com.roblox.client.q$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo13021a();
    }

    /* renamed from: A2 */
    public void m13020A2(d dVar) {
        this.f11481Q0 = dVar;
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        C1100c.m6458d().m6470n(this);
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        C1100c.m6458d().m6471p(this);
        super.mo4327X0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c
    /* renamed from: g2 */
    public Dialog mo4601g2(Bundle bundle) {
        return new AlertDialog.Builder(m4363p()).setMessage(C2748c0.f10694n).setPositiveButton(C2748c0.f10688m, new c()).setNegativeButton(C2748c0.f10509E2, new b()).setOnCancelListener(new a()).create();
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onNavigatToFeatureEvent(C0051i c0051i) {
        if (m4599e2()) {
            m4598d2().dismiss();
        }
    }
}
