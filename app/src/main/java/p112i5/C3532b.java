package p112i5;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1774s2;
import com.google.firebase.analytics.connector.internal.C2573b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p005a4.C0031a;
import p098h5.C3397a;
import p098h5.C3399c;
import p200p5.C4269a;
import p200p5.InterfaceC4270b;
import p200p5.InterfaceC4272d;
import p321z2.C5984j;

/* renamed from: i5.b */
/* loaded from: classes.dex */
public class C3532b implements InterfaceC3531a {

    /* renamed from: c */
    private static volatile InterfaceC3531a f15113c;

    /* renamed from: a */
    final C0031a f15114a;

    /* renamed from: b */
    final Map<String, Object> f15115b;

    C3532b(C0031a c0031a) {
        C5984j.m21286j(c0031a);
        this.f15114a = c0031a;
        this.f15115b = new ConcurrentHashMap();
    }

    /* renamed from: c */
    public static InterfaceC3531a m15332c(C3399c c3399c, Context context, InterfaceC4272d interfaceC4272d) {
        C5984j.m21286j(c3399c);
        C5984j.m21286j(context);
        C5984j.m21286j(interfaceC4272d);
        C5984j.m21286j(context.getApplicationContext());
        if (f15113c == null) {
            synchronized (C3532b.class) {
                if (f15113c == null) {
                    Bundle bundle = new Bundle(1);
                    if (c3399c.m14992r()) {
                        interfaceC4272d.mo15541b(C3397a.class, new Executor() { // from class: i5.d
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC4270b() { // from class: i5.c
                            @Override // p200p5.InterfaceC4270b
                            /* renamed from: a */
                            public final void mo11920a(C4269a c4269a) {
                                C3532b.m15333d(c4269a);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", c3399c.m14991q());
                    }
                    f15113c = new C3532b(C1774s2.m8783r(context, null, null, null, bundle).m8797o());
                }
            }
        }
        return f15113c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m15333d(C4269a c4269a) {
        boolean z10 = ((C3397a) c4269a.m17684a()).f14230a;
        synchronized (C3532b.class) {
            ((C3532b) C5984j.m21286j(f15113c)).f15114a.m227c(z10);
        }
    }

    @Override // p112i5.InterfaceC3531a
    /* renamed from: a */
    public void mo15330a(String str, String str2, Object obj) {
        if (C2573b.m11877d(str) && C2573b.m11878e(str, str2)) {
            this.f15114a.m226b(str, str2, obj);
        }
    }

    @Override // p112i5.InterfaceC3531a
    /* renamed from: b */
    public void mo15331b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C2573b.m11877d(str) && C2573b.m11876c(str2, bundle) && C2573b.m11875b(str, str2, bundle)) {
            C2573b.m11874a(str, str2, bundle);
            this.f15114a.m225a(str, str2, bundle);
        }
    }
}
