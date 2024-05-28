package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public class zzf implements Parcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C2607v();

    /* renamed from: n */
    private Messenger f10243n;

    /* renamed from: o */
    private InterfaceC2585e0 f10244o;

    /* renamed from: com.google.firebase.iid.zzf$a */
    /* loaded from: classes.dex */
    public static final class C2612a extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z10) throws ClassNotFoundException {
            if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
                if (FirebaseInstanceId.m11890v()) {
                    Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
                    return zzf.class;
                }
                return zzf.class;
            }
            return super.loadClass(str, z10);
        }
    }

    public zzf(IBinder iBinder) {
        this.f10243n = new Messenger(iBinder);
    }

    /* renamed from: a */
    private final IBinder m11996a() {
        Messenger messenger = this.f10243n;
        return messenger != null ? messenger.getBinder() : this.f10244o.asBinder();
    }

    /* renamed from: b */
    public final void m11997b(Message message) throws RemoteException {
        Messenger messenger = this.f10243n;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f10244o.m11933j0(message);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m11996a().equals(((zzf) obj).m11996a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m11996a().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f10243n;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f10244o.asBinder());
        }
    }
}
