package p043d3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p043d3.C2966a;
import p235s3.C4525h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d3.b */
/* loaded from: classes.dex */
public final class C2967b implements C2966a.a {
    @Override // p043d3.C2966a.a
    /* renamed from: a */
    public final ScheduledExecutorService mo13429a() {
        C4525h.m18546a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
