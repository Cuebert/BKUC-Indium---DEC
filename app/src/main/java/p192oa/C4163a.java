package p192oa;

import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p033c7.C1134c;

/* renamed from: oa.a */
/* loaded from: classes.dex */
public class C4163a {

    /* renamed from: c */
    private static C4163a f16947c;

    /* renamed from: d */
    private static AtomicInteger f16948d = new AtomicInteger();

    /* renamed from: e */
    private static final String f16949e = MessageBus.getMessageId("Realtime", "appResume");

    /* renamed from: f */
    private static final String f16950f = MessageBus.getMessageId("Realtime", "appStop");

    /* renamed from: a */
    private final MessageBus f16951a;

    /* renamed from: b */
    private final int f16952b;

    public C4163a(MessageBus messageBus) {
        this.f16951a = messageBus == null ? MessageBus.m13364e() : messageBus;
        if (C1134c.m6537a().mo6554H0()) {
            this.f16952b = new SecureRandom().nextInt(10000) + 1;
        } else {
            this.f16952b = new Random().nextInt(10000) + 1;
        }
    }

    /* renamed from: c */
    public static C4163a m17255c() {
        if (f16948d.getAndIncrement() == 0) {
            f16947c = new C4163a(null);
        }
        return f16947c;
    }

    /* renamed from: a */
    public void m17256a() {
        Log.v("RealtimeProtocol", "App Resumed");
        this.f16951a.m13369h(f16949e, new JSONObject());
    }

    /* renamed from: b */
    public void m17257b() {
        Log.v("RealtimeProtocol", "App Stopped");
        this.f16951a.m13369h(f16950f, new JSONObject());
    }
}
