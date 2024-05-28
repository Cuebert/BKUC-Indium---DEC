package p218r;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import p218r.C4397m0;

/* renamed from: r.n0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C4399n0 {
    /* renamed from: a */
    public static C4397m0.b m18182a(Context context, Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new C4403p0(context);
        }
        if (i10 >= 28) {
            return C4401o0.m18183g(context);
        }
        return C4405q0.m18187f(context, handler);
    }
}
