package p328z9;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: z9.c */
/* loaded from: classes.dex */
public class C6026c {

    /* renamed from: a */
    private MessageBus f22105a;

    /* renamed from: b */
    private Context f22106b;

    /* renamed from: c */
    private Connection f22107c;

    /* renamed from: d */
    private Connection f22108d;

    /* renamed from: z9.c$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        private static C6026c f22109a = new C6026c(MessageBus.m13364e());
    }

    /* renamed from: c */
    private static boolean m21343c() {
        return NativeSettingsInterface.nativeGetFFlag("EnableAndroidSMSProtocol");
    }

    /* renamed from: i */
    public static C6026c m21346i() {
        return b.f22109a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m21344d(JSONObject jSONObject) {
        Log.d("SMSProtocol", "onSendSMS: " + jSONObject.toString());
        if (m21343c()) {
            boolean z10 = false;
            try {
                String string = jSONObject.getString("address");
                String string2 = jSONObject.getString("message");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", string, null));
                intent.addFlags(268468224);
                intent.putExtra("sms_body", string2);
                this.f22106b.startActivity(intent);
                z10 = true;
            } catch (ActivityNotFoundException e10) {
                Log.e("SMSProtocol", "Exception while handling send SMS request: " + e10.toString());
            } catch (JSONException e11) {
                Log.e("SMSProtocol", "Exception while handling send SMS request: " + e11.toString());
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sent", z10);
                this.f22105a.m13370i("SMSProtocol", "sendSMS", jSONObject2, 0, new HashMap());
            } catch (JSONException e12) {
                Log.e("SMSProtocol", "Exception while handling send SMS request: " + e12.toString());
                this.f22105a.m13370i("SMSProtocol", "sendSMS", new JSONObject(), 13, new HashMap());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void m21345e(JSONObject jSONObject) {
        Log.d("SMSProtocol", "onSupportsSMS: " + jSONObject.toString());
        boolean hasSystemFeature = m21343c() ? this.f22106b.getPackageManager().hasSystemFeature("android.hardware.telephony") : false;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", hasSystemFeature);
            this.f22105a.m13370i("SMSProtocol", "supportsSMS", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("SMSProtocol", "JSON exception while handling supports sms request: " + e10.toString());
            this.f22105a.m13370i("SMSProtocol", "supportsSMS", new JSONObject(), 13, new HashMap());
        }
    }

    /* renamed from: h */
    public void m21349h(Context context) {
        this.f22106b = context;
    }

    private C6026c(MessageBus messageBus) {
        this.f22105a = messageBus;
        this.f22107c = messageBus.m13374o("SMSProtocol", "sendSMS", new Callback() { // from class: z9.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C6026c.this.m21344d(jSONObject);
            }
        });
        this.f22108d = messageBus.m13374o("SMSProtocol", "supportsSMS", new Callback() { // from class: z9.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C6026c.this.m21345e(jSONObject);
            }
        });
    }
}
