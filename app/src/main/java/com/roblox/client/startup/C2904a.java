package com.roblox.client.startup;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.ActivityC0153c;
import androidx.appcompat.app.DialogC0152b;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c;
import androidx.fragment.app.Fragment;
import com.roblox.client.C2748c0;
import p035c9.C1151k;

/* renamed from: com.roblox.client.startup.a */
/* loaded from: classes.dex */
public class C2904a extends DialogInterfaceOnCancelListenerC0802c {

    /* renamed from: E0 */
    private b f11655E0;

    /* renamed from: com.roblox.client.startup.a$a */
    /* loaded from: classes.dex */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C1151k.m6712f("FragmentRetry", "... Dialog::onClick:");
            if (C2904a.this.f11655E0 != null) {
                C2904a.this.f11655E0.mo12166n0();
            }
        }
    }

    /* renamed from: com.roblox.client.startup.a$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: n */
        void mo12165n();

        /* renamed from: n0 */
        void mo12166n0();
    }

    /* renamed from: q2 */
    public static void m13171q2(ActivityC0153c activityC0153c) {
        C2904a m13172r2 = m13172r2(activityC0153c);
        if (m13172r2 != null) {
            C1151k.m6712f("FragmentRetry", "Dismiss the existing Retry UI...");
            m13172r2.m4597b2();
        }
    }

    /* renamed from: r2 */
    private static C2904a m13172r2(ActivityC0153c activityC0153c) {
        Fragment m4498j0 = activityC0153c.m4617y0().m4498j0("FragmentRetry");
        if (m4498j0 instanceof C2904a) {
            return (C2904a) m4498j0;
        }
        return null;
    }

    /* renamed from: t2 */
    public static void m13173t2(ActivityC0153c activityC0153c, int i10) {
        C1151k.m6712f("FragmentRetry", "showRetryFragment: ");
        C2904a m13172r2 = m13172r2(activityC0153c);
        if (m13172r2 != null) {
            C1151k.m6712f("FragmentRetry", "showRetryFragment: Found an existing Retry fragment.");
            m13172r2.m13174s2(activityC0153c.getString(i10));
            return;
        }
        C1151k.m6712f("FragmentRetry", "showRetryFragment: Create a new FragmentRetry...");
        C2904a c2904a = new C2904a();
        Bundle bundle = new Bundle();
        bundle.putInt("message", i10);
        c2904a.m4282H1(bundle);
        c2904a.mo4608o2(activityC0153c.m4617y0(), "FragmentRetry");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public void mo267H0() {
        super.mo267H0();
        this.f11655E0 = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c
    /* renamed from: g2 */
    public Dialog mo4601g2(Bundle bundle) {
        C1151k.m6712f("FragmentRetry", "onCreateDialog:");
        DialogC0152b.a m710p = new DialogC0152b.a(m4363p()).m713s(C2748c0.f10564P2).m701g(m4378u().getInt("message")).m710p(C2748c0.f10514F2, new a());
        m710p.m698d(true);
        return m710p.m695a();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C1151k.m6712f("FragmentRetry", "onCancel:");
        b bVar = this.f11655E0;
        if (bVar != null) {
            bVar.mo12165n();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C1151k.m6712f("FragmentRetry", "onDismiss: Do nothing.");
    }

    /* renamed from: s2 */
    public void m13174s2(CharSequence charSequence) {
        Dialog m4598d2 = m4598d2();
        if (m4598d2 instanceof DialogC0152b) {
            ((DialogC0152b) m4598d2).m693h(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo269w0(Context context) {
        super.mo269w0(context);
        if (context instanceof b) {
            this.f11655E0 = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener.");
    }
}
