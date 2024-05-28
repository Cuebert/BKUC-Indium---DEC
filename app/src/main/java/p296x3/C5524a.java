package p296x3;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: x3.a */
/* loaded from: classes.dex */
public class C5524a implements IInterface {

    /* renamed from: c */
    private final IBinder f20559c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5524a(IBinder iBinder, String str) {
        this.f20559c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20559c;
    }
}
