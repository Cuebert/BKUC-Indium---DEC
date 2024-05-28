package p000a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: a.a */
/* loaded from: classes.dex */
public interface InterfaceC0000a extends IInterface {

    /* renamed from: a */
    public static final String f0a = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: a.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0000a {

        /* renamed from: a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C6030a implements InterfaceC0000a {

            /* renamed from: c */
            private IBinder f1c;

            C6030a(IBinder iBinder) {
                this.f1c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1c;
            }

            @Override // p000a.InterfaceC0000a
            /* renamed from: x0 */
            public void mo0x0(String str, int i10, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0000a.f0a);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.m3b(obtain, notification, 0);
                    this.f1c.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: i */
        public static InterfaceC0000a m1i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0000a.f0a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0000a)) {
                return (InterfaceC0000a) queryLocalInterface;
            }
            return new C6030a(iBinder);
        }
    }

    /* renamed from: a.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static <T extends Parcelable> void m3b(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    /* renamed from: x0 */
    void mo0x0(String str, int i10, String str2, Notification notification) throws RemoteException;
}
