package p321z2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p308y2.InterfaceC5612g;

/* renamed from: z2.w */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC6006w implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static AbstractDialogInterfaceOnClickListenerC6006w m21317b(Activity activity, Intent intent, int i10) {
        return new C6004u(intent, activity, i10);
    }

    /* renamed from: c */
    public static AbstractDialogInterfaceOnClickListenerC6006w m21318c(InterfaceC5612g interfaceC5612g, Intent intent, int i10) {
        return new C6005v(intent, interfaceC5612g, 2);
    }

    /* renamed from: a */
    protected abstract void mo21316a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            mo21316a();
        } catch (ActivityNotFoundException e10) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
