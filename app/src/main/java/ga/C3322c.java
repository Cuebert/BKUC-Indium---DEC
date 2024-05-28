package ga;

import android.util.Log;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1134c;

/* renamed from: ga.c */
/* loaded from: classes.dex */
public class C3322c {

    /* renamed from: a */
    private boolean f13823a;

    /* renamed from: b */
    private List<String> f13824b;

    public C3322c(JSONObject jSONObject, long j10) {
        this.f13823a = false;
        if (jSONObject == null) {
            Log.e("NotchScreenSupportExp", "NotchScreenSupportExperiment constructed with null JSON payload.");
            return;
        }
        try {
            this.f13823a = jSONObject.getBoolean("notchEnabled");
            Log.i("NotchScreenSupportExp", "Got notch support enabled value: " + this.f13823a);
        } catch (JSONException e10) {
            Log.e("NotchScreenSupportExp", "Failed to get notch support enabled value from JSON payload. Error: " + e10.getMessage());
        }
        if (C1134c.m6537a().mo6628m0()) {
            this.f13824b = Arrays.asList(C1134c.m6537a().mo6611g1().split(";"));
            Log.i("NotchScreenSupportExp", "Checking notch experiment value for place: " + j10);
            if (this.f13824b.contains(Long.toString(j10))) {
                Log.i("NotchScreenSupportExp", "Notch support blocked for place: " + j10);
                this.f13823a = false;
            }
        }
    }

    /* renamed from: a */
    public boolean m14609a() {
        return this.f13823a;
    }
}
