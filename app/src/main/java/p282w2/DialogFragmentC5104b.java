package p282w2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import p321z2.C5984j;

/* renamed from: w2.b */
/* loaded from: classes.dex */
public class DialogFragmentC5104b extends DialogFragment {

    /* renamed from: n */
    private Dialog f19367n;

    /* renamed from: o */
    private DialogInterface.OnCancelListener f19368o;

    /* renamed from: p */
    private Dialog f19369p;

    /* renamed from: a */
    public static DialogFragmentC5104b m19744a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC5104b dialogFragmentC5104b = new DialogFragmentC5104b();
        Dialog dialog2 = (Dialog) C5984j.m21287k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC5104b.f19367n = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC5104b.f19368o = onCancelListener;
        }
        return dialogFragmentC5104b;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f19368o;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f19367n;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f19369p == null) {
            this.f19369p = new AlertDialog.Builder((Context) C5984j.m21286j(getActivity())).create();
        }
        return this.f19369p;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
