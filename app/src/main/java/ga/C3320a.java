package ga;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ga.a */
/* loaded from: classes.dex */
public class C3320a {

    /* renamed from: a */
    private long f13808a;

    /* renamed from: b */
    private final long f13809b;

    public C3320a(JSONObject jSONObject, long j10) {
        this.f13808a = -1L;
        this.f13809b = j10;
        if (jSONObject == null) {
            Log.e("BackgroundExperiment", "Background experiment constructed with null JSON payload.");
            return;
        }
        try {
            this.f13808a = jSONObject.getLong("background_delay");
        } catch (JSONException e10) {
            Log.e("BackgroundExperiment", "Failed to get background delay from JSON payload. Error: " + e10.getMessage());
        }
    }

    /* renamed from: a */
    public long m14599a() {
        long j10 = this.f13808a;
        return j10 == -1 ? this.f13809b : j10;
    }
}
