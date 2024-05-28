package p011aa;

import android.util.Log;
import com.roblox.universalapp.account.JNIAccountProtocol;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aa.g */
/* loaded from: classes.dex */
public class C0068g {
    /* renamed from: a */
    public static JSONObject m298a(String str, EnumC0069h enumC0069h) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(JNIAccountProtocol.getTokenKey(), str);
            jSONObject.put(JNIAccountProtocol.getResultKey(), enumC0069h);
        } catch (JSONException e10) {
            Log.e("DeviceIntegrityUtil", "JSON exception on retrieving integrity token: " + e10);
        }
        return jSONObject;
    }
}
