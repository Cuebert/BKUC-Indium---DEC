package p017b3;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC1352d;
import com.google.android.gms.common.internal.TelemetryData;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p222r3.C4425d;
import p295x2.AbstractC5510e;
import p295x2.C5506a;
import p308y2.InterfaceC5620k;
import p321z2.C5994o;
import p321z2.InterfaceC5992n;

/* renamed from: b3.d */
/* loaded from: classes.dex */
public final class C0985d extends AbstractC5510e<C5994o> implements InterfaceC5992n {

    /* renamed from: k */
    private static final C5506a.g<C0986e> f5169k;

    /* renamed from: l */
    private static final C5506a.a<C0986e, C5994o> f5170l;

    /* renamed from: m */
    private static final C5506a<C5994o> f5171m;

    /* renamed from: n */
    public static final /* synthetic */ int f5172n = 0;

    static {
        C5506a.g<C0986e> gVar = new C5506a.g<>();
        f5169k = gVar;
        C0984c c0984c = new C0984c();
        f5170l = c0984c;
        f5171m = new C5506a<>("ClientTelemetry.API", c0984c, gVar);
    }

    public C0985d(Context context, C5994o c5994o) {
        super(context, f5171m, c5994o, AbstractC5510e.a.f20550c);
    }

    @Override // p321z2.InterfaceC5992n
    /* renamed from: c */
    public final AbstractC3263l<Void> mo6180c(final TelemetryData telemetryData) {
        AbstractC1352d.a m7497a = AbstractC1352d.m7497a();
        m7497a.m7506d(C4425d.f18008a);
        m7497a.m7505c(false);
        m7497a.m7504b(new InterfaceC5620k() { // from class: b3.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p308y2.InterfaceC5620k
            /* renamed from: a */
            public final void mo6178a(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                int i10 = C0985d.f5172n;
                ((C0982a) ((C0986e) obj).m7646D()).m6177J0(telemetryData2);
                ((C3265m) obj2).m14514c(null);
            }
        });
        return m20267l(m7497a.m7503a());
    }
}
