package p061e7;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.roblox.client.C2738a0;
import com.roblox.client.C2871m0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2915y;
import p008a7.C0051i;
import p024bc.C1100c;
import p035c9.C1151k;
import qa.C4359t;

/* renamed from: e7.a */
/* loaded from: classes.dex */
public class ViewOnClickListenerC3080a extends C2871m0 implements View.OnClickListener {

    /* renamed from: Q0 */
    private long f12912Q0;

    /* renamed from: R0 */
    private String f12913R0;

    /* renamed from: S0 */
    private String f12914S0;

    /* renamed from: T0 */
    private String f12915T0;

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2738a0.f10419j, viewGroup, false);
        ((TextView) inflate.findViewById(C2915y.f11896r1)).setText(this.f12913R0);
        ((TextView) inflate.findViewById(C2915y.f11882n)).setText(this.f12914S0);
        inflate.findViewById(C2915y.f11853d0).setOnClickListener(this);
        inflate.findViewById(C2915y.f11870j).setOnClickListener(this);
        C4359t.m18005p(m4384w()).m18013k(this.f12915T0).m18042c((ImageView) inflate.findViewById(C2915y.f11893q1));
        return inflate;
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        Dialog m4598d2 = m4598d2();
        if (m4598d2 != null) {
            Window window = m4598d2.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.6f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m4598d2() != null) {
            if (view.getId() == C2915y.f11870j) {
                m4598d2().dismiss();
                return;
            }
            if (view.getId() == C2915y.f11853d0) {
                m4598d2().dismiss();
                String m12922g = C2877p0.m12922g(this.f12912Q0);
                C1151k.m6714h("rbx.catalog", "assetPath:" + m12922g);
                C0051i c0051i = new C0051i("CATALOG_TAG");
                c0051i.m255i(m12922g);
                C1100c.m6458d().m6469j(c0051i);
            }
        }
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        Dialog m4598d2;
        super.mo270z0(bundle);
        Bundle m4378u = m4378u();
        this.f12912Q0 = m4378u.getLong("assetId", -1L);
        this.f12913R0 = m4378u.getString("title");
        this.f12914S0 = m4378u.getString("description");
        this.f12915T0 = m4378u.getString("thumbnail");
        if (this.f12912Q0 != -1 || (m4598d2 = m4598d2()) == null) {
            return;
        }
        m4598d2.dismiss();
    }
}
