package p283w3;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p085g4.InterfaceC3253g;
import p321z2.C5990m;
import p321z2.C5994o;
import p321z2.InterfaceC5992n;

/* renamed from: w3.ra */
/* loaded from: classes.dex */
public final class C5350ra {

    /* renamed from: a */
    private final InterfaceC5992n f20123a;

    /* renamed from: b */
    private final AtomicLong f20124b = new AtomicLong(-1);

    C5350ra(Context context, String str) {
        this.f20123a = C5990m.m21298b(context, C5994o.m21302a().m21305b("mlkit:vision").m21304a());
    }

    /* renamed from: a */
    public static C5350ra m19956a(Context context) {
        return new C5350ra(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void m19957b(long j10, Exception exc) {
        this.f20124b.set(j10);
    }

    /* renamed from: c */
    public final synchronized void m19958c(int i10, int i11, long j10, long j11) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f20124b.get() != -1 && elapsedRealtime - this.f20124b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f20123a.mo6180c(new TelemetryData(0, Arrays.asList(new MethodInvocation(i10, i11, 0, j10, j11, null, null, 0)))).mo14497d(new InterfaceC3253g() { // from class: w3.qa
            @Override // p085g4.InterfaceC3253g
            public final void onFailure(Exception exc) {
                C5350ra.this.m19957b(elapsedRealtime, exc);
            }
        });
    }
}
