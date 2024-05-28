package p077fa;

import android.util.Log;
import com.roblox.universalapp.experience.JNIExperienceProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: fa.a */
/* loaded from: classes.dex */
public class C3214a {

    /* renamed from: c */
    private static C3214a f13522c;

    /* renamed from: d */
    private static AtomicInteger f13523d = new AtomicInteger();

    /* renamed from: a */
    private MessageBus f13524a = MessageBus.m13364e();

    /* renamed from: b */
    private Connection f13525b = null;

    /* renamed from: fa.a$a */
    /* loaded from: classes.dex */
    class a implements Callback {

        /* renamed from: a */
        final /* synthetic */ b f13526a;

        a(b bVar) {
            this.f13526a = bVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            this.f13526a.mo12242a(jSONObject);
        }
    }

    /* renamed from: fa.a$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo12242a(JSONObject jSONObject);
    }

    private C3214a() {
    }

    /* renamed from: a */
    public static C3214a m14292a() {
        if (f13523d.getAndIncrement() == 0) {
            f13522c = new C3214a();
        }
        return f13522c;
    }

    /* renamed from: b */
    public void m14293b(b bVar) {
        if (this.f13525b != null) {
            Log.w("ExperienceProtocol", "Attempted to set ExperienceProtocol java callback, but one is already set.");
        } else {
            this.f13525b = this.f13524a.m13372m(JNIExperienceProtocol.getLaunchId(), new a(bVar));
        }
    }

    /* renamed from: c */
    public void m14294c() {
        Connection connection = this.f13525b;
        if (connection == null) {
            Log.w("ExperienceProtocol", "Attempted to disconnect ExperienceProtocol java callback, but one is not connected.");
        } else {
            connection.m13359a();
            this.f13525b = null;
        }
    }
}
