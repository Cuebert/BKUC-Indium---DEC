package p326z7;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.C2871m0;
import p035c9.C1151k;

/* renamed from: z7.g */
/* loaded from: classes.dex */
public class C6020g extends C2871m0 {

    /* renamed from: Q0 */
    protected InterfaceC6018e f22099Q0;

    /* renamed from: z2 */
    private void m21335z2(EnumC6017d enumC6017d) {
        InterfaceC6018e interfaceC6018e = this.f22099Q0;
        if (interfaceC6018e != null) {
            interfaceC6018e.m21333a(enumC6017d);
        } else {
            C1151k.m6716j("RobloxMVPFragment", "Lifecycle listener is null.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo264D0 = super.mo264D0(layoutInflater, viewGroup, bundle);
        m21335z2(EnumC6017d.ON_CREATE_VIEW);
        return mo264D0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: G0 */
    public void mo4280G0() {
        super.mo4280G0();
        m21335z2(EnumC6017d.ON_DESTROY_VIEW);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public void mo267H0() {
        super.mo267H0();
        m21335z2(EnumC6017d.ON_DETACH);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P0 */
    public void mo4305P0() {
        super.mo4305P0();
        m21335z2(EnumC6017d.ON_PAUSE);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: U0 */
    public void mo4319U0() {
        super.mo4319U0();
        m21335z2(EnumC6017d.ON_RESUME);
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        m21335z2(EnumC6017d.ON_START);
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        super.mo4327X0();
        m21335z2(EnumC6017d.ON_STOP);
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public void mo4376t0(Bundle bundle) {
        super.mo4376t0(bundle);
        m21335z2(EnumC6017d.ON_ACTIVITY_CREATED);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo269w0(Context context) {
        super.mo269w0(context);
        m21335z2(EnumC6017d.ON_ATTACH);
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        m21335z2(EnumC6017d.ON_CREATE);
    }
}
