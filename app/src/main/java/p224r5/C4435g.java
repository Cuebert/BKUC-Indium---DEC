package p224r5;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.zzf;

/* renamed from: r5.g */
/* loaded from: classes.dex */
final class C4435g {

    /* renamed from: a */
    private final Messenger f18021a;

    /* renamed from: b */
    private final zzf f18022b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4435g(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f18021a = new Messenger(iBinder);
            this.f18022b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f18022b = new zzf(iBinder);
            this.f18021a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m18236a(Message message) throws RemoteException {
        Messenger messenger = this.f18021a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzf zzfVar = this.f18022b;
        if (zzfVar != null) {
            zzfVar.m11997b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
