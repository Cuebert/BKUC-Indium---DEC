package p295x2;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import p093h0.C3356a;
import p308y2.C5602b;
import p321z2.C5984j;

/* renamed from: x2.c */
/* loaded from: classes.dex */
public class C5508c extends Exception {

    /* renamed from: n */
    private final C3356a<C5602b<?>, ConnectionResult> f20539n;

    public C5508c(C3356a<C5602b<?>, ConnectionResult> c3356a) {
        this.f20539n = c3356a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (C5602b<?> c5602b : this.f20539n.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) C5984j.m21286j(this.f20539n.get(c5602b));
            z10 &= !connectionResult.m7379B();
            String m20622b = c5602b.m20622b();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m20622b).length() + 2 + valueOf.length());
            sb2.append(m20622b);
            sb2.append(": ");
            sb2.append(valueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }
}
