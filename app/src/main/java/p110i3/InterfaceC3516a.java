package p110i3;

import android.os.IBinder;
import android.os.IInterface;
import p235s3.BinderC4519b;

/* renamed from: i3.a */
/* loaded from: classes.dex */
public interface InterfaceC3516a extends IInterface {

    /* renamed from: i3.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends BinderC4519b implements InterfaceC3516a {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: l */
        public static InterfaceC3516a m15327l(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC3516a ? (InterfaceC3516a) queryLocalInterface : new C3518c(iBinder);
        }
    }
}
