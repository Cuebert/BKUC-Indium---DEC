package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
/* loaded from: classes.dex */
public interface InterfaceC0119a extends IInterface {

    /* renamed from: b */
    public static final String f400b = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: android.support.v4.os.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0119a {

        /* renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C6032a implements InterfaceC0119a {

            /* renamed from: c */
            private IBinder f401c;

            C6032a(IBinder iBinder) {
                this.f401c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f401c;
            }
        }

        public a() {
            attachInterface(this, InterfaceC0119a.f400b);
        }

        /* renamed from: i */
        public static InterfaceC0119a m576i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0119a.f400b);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0119a)) {
                return (InterfaceC0119a) queryLocalInterface;
            }
            return new C6032a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = InterfaceC0119a.f400b;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            mo575F0(parcel.readInt(), (Bundle) b.m578b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* renamed from: android.support.v4.os.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static <T> T m578b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* renamed from: F0 */
    void mo575F0(int i10, Bundle bundle) throws RemoteException;
}
