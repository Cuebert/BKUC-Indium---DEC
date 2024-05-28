package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC0109b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0109b {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.b$a$a */
        /* loaded from: classes.dex */
        public static class C6031a implements InterfaceC0109b {

            /* renamed from: c */
            private IBinder f382c;

            C6031a(IBinder iBinder) {
                this.f382c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f382c;
            }

            @Override // android.support.v4.media.session.InterfaceC0109b
            /* renamed from: u */
            public void mo534u(InterfaceC0108a interfaceC0108a) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(interfaceC0108a != null ? interfaceC0108a.asBinder() : null);
                    this.f382c.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: i */
        public static InterfaceC0109b m535i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0109b)) {
                return (InterfaceC0109b) queryLocalInterface;
            }
            return new C6031a(iBinder);
        }
    }

    /* renamed from: u */
    void mo534u(InterfaceC0108a interfaceC0108a) throws RemoteException;
}
