package p159m1;

import android.content.Context;
import backtraceio.library.base.BacktraceBase;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.interfaces.Database;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.watchdog.BacktraceANRWatchdog;
import backtraceio.library.watchdog.OnApplicationNotRespondingEvent;
import java.util.List;
import java.util.Map;

/* renamed from: m1.a */
/* loaded from: classes.dex */
public class C3929a extends BacktraceBase {

    /* renamed from: a */
    private BacktraceANRWatchdog f16314a;

    public C3929a(Context context, C3930b c3930b, List<String> list) {
        this(context, c3930b, null, list);
    }

    /* renamed from: a */
    public void m16666a(int i10, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent) {
        m16667b(i10, onApplicationNotRespondingEvent, false);
    }

    /* renamed from: b */
    public void m16667b(int i10, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent, boolean z10) {
        BacktraceANRWatchdog backtraceANRWatchdog = new BacktraceANRWatchdog(this, i10, z10);
        this.f16314a = backtraceANRWatchdog;
        backtraceANRWatchdog.setOnApplicationNotRespondingEvent(onApplicationNotRespondingEvent);
    }

    /* renamed from: c */
    public void m16668c(Exception exc) {
        m16669d(exc, null);
    }

    /* renamed from: d */
    public void m16669d(Exception exc, OnServerResponseEventListener onServerResponseEventListener) {
        super.send(new BacktraceReport(exc), onServerResponseEventListener);
    }

    @Override // backtraceio.library.base.BacktraceBase, backtraceio.library.interfaces.Client
    public void send(BacktraceReport backtraceReport) {
        send(backtraceReport, null);
    }

    public C3929a(Context context, C3930b c3930b, Database database, List<String> list) {
        this(context, c3930b, database, null, list);
    }

    @Override // backtraceio.library.base.BacktraceBase
    public void send(BacktraceReport backtraceReport, OnServerResponseEventListener onServerResponseEventListener) {
        super.send(backtraceReport, onServerResponseEventListener);
    }

    public C3929a(Context context, C3930b c3930b, Database database, Map<String, Object> map, List<String> list) {
        super(context, c3930b, database, map, list);
    }
}
