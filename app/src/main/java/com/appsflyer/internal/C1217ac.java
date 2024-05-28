package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* renamed from: com.appsflyer.internal.ac */
/* loaded from: classes.dex */
final class C1217ac {

    /* renamed from: com.appsflyer.internal.ac$b */
    /* loaded from: classes.dex */
    static final class b implements IInterface {
        private final IBinder AFKeystoreWrapper;

        b(IBinder iBinder) {
            this.AFKeystoreWrapper = iBinder;
        }

        public final String AFKeystoreWrapper() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFKeystoreWrapper.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFKeystoreWrapper;
        }

        final boolean values() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.AFKeystoreWrapper.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.appsflyer.internal.ac$c */
    /* loaded from: classes.dex */
    static final class c {
        private final boolean AFKeystoreWrapper;
        final String valueOf;

        c(String str, boolean z10) {
            this.valueOf = str;
            this.AFKeystoreWrapper = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean AFInAppEventParameterName() {
            return this.AFKeystoreWrapper;
        }
    }

    C1217ac() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c AFInAppEventParameterName(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            a aVar = new a((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, aVar, 1)) {
                    if (!aVar.values) {
                        aVar.values = true;
                        IBinder poll = aVar.AFInAppEventType.poll(10L, TimeUnit.SECONDS);
                        if (poll != null) {
                            b bVar = new b(poll);
                            return new c(bVar.AFKeystoreWrapper(), bVar.values());
                        }
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                context.unbindService(aVar);
                throw new IOException("Google Play connection failed");
            } finally {
                context.unbindService(aVar);
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    /* renamed from: com.appsflyer.internal.ac$a */
    /* loaded from: classes.dex */
    static final class a implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFInAppEventType;
        boolean values;

        private a() {
            this.AFInAppEventType = new LinkedBlockingQueue<>(1);
            this.values = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFInAppEventType.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }
}
