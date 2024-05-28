package p282w2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c;
import androidx.fragment.app.FragmentManager;
import p321z2.C5984j;

/* renamed from: w2.f */
/* loaded from: classes.dex */
public class C5108f extends DialogInterfaceOnCancelListenerC0802c {

    /* renamed from: E0 */
    private Dialog f19373E0;

    /* renamed from: F0 */
    private DialogInterface.OnCancelListener f19374F0;

    /* renamed from: G0 */
    private Dialog f19375G0;

    /* renamed from: p2 */
    public static C5108f m19746p2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C5108f c5108f = new C5108f();
        Dialog dialog2 = (Dialog) C5984j.m21287k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c5108f.f19373E0 = dialog2;
        if (onCancelListener != null) {
            c5108f.f19374F0 = onCancelListener;
        }
        return c5108f;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c
    /* renamed from: g2 */
    public Dialog mo4601g2(Bundle bundle) {
        Dialog dialog = this.f19373E0;
        if (dialog != null) {
            return dialog;
        }
        m4605l2(false);
        if (this.f19375G0 == null) {
            this.f19375G0 = new AlertDialog.Builder((Context) C5984j.m21286j(m4384w())).create();
        }
        return this.f19375G0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c
    /* renamed from: o2 */
    public void mo4608o2(FragmentManager fragmentManager, String str) {
        super.mo4608o2(fragmentManager, str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f19374F0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
