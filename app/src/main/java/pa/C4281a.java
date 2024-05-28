package pa;

import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pa.a */
/* loaded from: classes.dex */
public class C4281a {

    /* renamed from: c */
    private static C4281a f17483c;

    /* renamed from: a */
    private final MessageBus f17485a = MessageBus.m13364e();

    /* renamed from: b */
    private static final String f17482b = MessageBus.getMessageId("Screen", "safeAreaInsets");

    /* renamed from: d */
    private static final AtomicInteger f17484d = new AtomicInteger();

    /* renamed from: b */
    public static C4281a m17722b() {
        if (f17484d.getAndIncrement() == 0) {
            f17483c = new C4281a();
        }
        return f17483c;
    }

    /* renamed from: a */
    public void m17723a(float f10, float f11, float f12, float f13) {
        Log.d("ScreenProtocol", String.format("Sending safe area insets: left: %f, top: %f, right: %f, bottom: %f", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("left", f10);
            jSONObject.put("top", f11);
            jSONObject.put("right", f12);
            jSONObject.put("bottom", f13);
            this.f17485a.m13369h(f17482b, jSONObject);
        } catch (JSONException e10) {
            Log.e("ScreenProtocol", "Sending safe area insets failed with error: " + e10.getMessage());
        }
    }
}
