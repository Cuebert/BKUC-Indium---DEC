package p224r5;

import android.os.Bundle;
import android.util.Log;
import p085g4.C3265m;

/* renamed from: r5.i */
/* loaded from: classes.dex */
abstract class AbstractC4437i<T> {

    /* renamed from: a */
    final int f18024a;

    /* renamed from: b */
    final C3265m<T> f18025b = new C3265m<>();

    /* renamed from: c */
    final int f18026c;

    /* renamed from: d */
    final Bundle f18027d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4437i(int i10, int i11, Bundle bundle) {
        this.f18024a = i10;
        this.f18026c = i11;
        this.f18027d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo18234a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m18238b(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f18025b.m14514c(t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m18239c(C4436h c4436h) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(c4436h);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f18025b.m14513b(c4436h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo18235d();

    public String toString() {
        int i10 = this.f18026c;
        int i11 = this.f18024a;
        boolean mo18235d = mo18235d();
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(mo18235d);
        sb2.append("}");
        return sb2.toString();
    }
}
