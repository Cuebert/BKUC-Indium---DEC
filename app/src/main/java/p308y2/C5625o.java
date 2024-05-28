package p308y2;

import com.google.android.gms.common.api.Status;
import p085g4.C3265m;
import p295x2.C5507b;

/* renamed from: y2.o */
/* loaded from: classes.dex */
public class C5625o {
    /* renamed from: a */
    public static void m20648a(Status status, C3265m<Void> c3265m) {
        m20649b(status, null, c3265m);
    }

    /* renamed from: b */
    public static <TResult> void m20649b(Status status, TResult tresult, C3265m<TResult> c3265m) {
        if (status.m7410B()) {
            c3265m.m14514c(tresult);
        } else {
            c3265m.m14513b(new C5507b(status));
        }
    }
}
