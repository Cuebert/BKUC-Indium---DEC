package p185o3;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: o3.a */
/* loaded from: classes.dex */
public class C4129a implements IInterface {

    /* renamed from: c */
    private final IBinder f16838c;

    /* renamed from: d */
    private final String f16839d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4129a(IBinder iBinder, String str) {
        this.f16838c = iBinder;
        this.f16839d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16838c;
    }
}
