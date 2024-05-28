package p188o6;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c;
import com.roblox.client.C2738a0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2915y;
import p035c9.C1151k;

/* renamed from: o6.b */
/* loaded from: classes.dex */
public class ViewOnClickListenerC4144b extends DialogInterfaceOnCancelListenerC0802c implements View.OnClickListener {

    /* renamed from: E0 */
    private a f16883E0;

    /* renamed from: o6.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo17172a(Context context);

        /* renamed from: b */
        void mo17173b();

        /* renamed from: c */
        void mo17174c();

        /* renamed from: d */
        void mo17175d();
    }

    /* renamed from: p2 */
    private void m17183p2() {
        m4596a2();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2738a0.f10420k, viewGroup, false);
        inflate.findViewById(C2915y.f11894r).setOnClickListener(this);
        inflate.findViewById(C2915y.f11891q).setOnClickListener(this);
        inflate.findViewById(C2915y.f11897s).setOnClickListener(this);
        inflate.findViewById(C2915y.f11888p).setOnClickListener(this);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: G0 */
    public void mo4280G0() {
        Dialog m4598d2 = m4598d2();
        if (m4598d2 != null && m4310R()) {
            m4598d2.setDismissMessage(null);
        }
        super.mo4280G0();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: U0 */
    public void mo4319U0() {
        Window window = m4598d2().getWindow();
        Point point = new Point();
        if (window != null) {
            window.getWindowManager().getDefaultDisplay().getSize(point);
            window.setLayout((int) (point.x * (C2877p0.m12933l0() ? 1.0f : 0.5f)), -2);
            window.setGravity(17);
        }
        super.mo4319U0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a aVar = this.f16883E0;
        if (aVar != null) {
            aVar.mo17174c();
        } else {
            C1151k.m6709c("RateMeMaybeFragment", "onCancel - mInterface is null");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f16883E0 == null) {
            C1151k.m6709c("RateMeMaybeFragment", "onClick - mInterface is null");
            return;
        }
        if (view.getId() == C2915y.f11888p) {
            this.f16883E0.mo17174c();
        } else if (view.getId() == C2915y.f11891q) {
            this.f16883E0.mo17173b();
        } else if (view.getId() == C2915y.f11894r) {
            this.f16883E0.mo17172a(m4384w());
        } else if (view.getId() == C2915y.f11897s) {
            this.f16883E0.mo17175d();
        }
        m17183p2();
    }

    /* renamed from: q2 */
    public void m17184q2(a aVar) {
        this.f16883E0 = aVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        m4309Q1(true);
        m4606m2(1, m4600f2());
    }
}
