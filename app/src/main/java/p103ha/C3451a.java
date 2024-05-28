package p103ha;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.ActivityC0153c;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.universalapp.externalcontentsharing.JNIExternalContentSharingProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ha.a */
/* loaded from: classes.dex */
public class C3451a {

    /* renamed from: g */
    private static C3451a f14344g;

    /* renamed from: h */
    private static AtomicInteger f14345h = new AtomicInteger();

    /* renamed from: a */
    private MessageBus f14346a;

    /* renamed from: b */
    private Connection f14347b = null;

    /* renamed from: c */
    private Connection f14348c = null;

    /* renamed from: d */
    private Connection f14349d = null;

    /* renamed from: e */
    private Connection f14350e = null;

    /* renamed from: f */
    private boolean f14351f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.a$a */
    /* loaded from: classes.dex */
    public class a implements Callback {

        /* renamed from: a */
        final /* synthetic */ ActivityC0153c f14352a;

        /* renamed from: b */
        final /* synthetic */ Intent f14353b;

        /* renamed from: c */
        final /* synthetic */ int f14354c;

        /* renamed from: d */
        final /* synthetic */ e f14355d;

        a(ActivityC0153c activityC0153c, Intent intent, int i10, e eVar) {
            this.f14352a = activityC0153c;
            this.f14353b = intent;
            this.f14354c = i10;
            this.f14355d = eVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            try {
                C3451a.m15175e(this.f14352a, jSONObject.getString("text"), jSONObject.getString("context"), this.f14353b, this.f14354c, this.f14355d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share text data.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.a$b */
    /* loaded from: classes.dex */
    public class b implements Callback {

        /* renamed from: a */
        final /* synthetic */ ActivityC0153c f14357a;

        /* renamed from: b */
        final /* synthetic */ Intent f14358b;

        /* renamed from: c */
        final /* synthetic */ int f14359c;

        /* renamed from: d */
        final /* synthetic */ e f14360d;

        b(ActivityC0153c activityC0153c, Intent intent, int i10, e eVar) {
            this.f14357a = activityC0153c;
            this.f14358b = intent;
            this.f14359c = i10;
            this.f14360d = eVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            try {
                C3451a.m15175e(this.f14357a, jSONObject.getString("url"), jSONObject.getString("context"), this.f14358b, this.f14359c, this.f14360d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share url data.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.a$c */
    /* loaded from: classes.dex */
    public class c implements Callback {

        /* renamed from: a */
        final /* synthetic */ ActivityC0153c f14362a;

        /* renamed from: b */
        final /* synthetic */ Intent f14363b;

        /* renamed from: c */
        final /* synthetic */ int f14364c;

        /* renamed from: d */
        final /* synthetic */ e f14365d;

        c(ActivityC0153c activityC0153c, Intent intent, int i10, e eVar) {
            this.f14362a = activityC0153c;
            this.f14363b = intent;
            this.f14364c = i10;
            this.f14365d = eVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            try {
                C3451a.m15174d(this.f14362a, jSONObject.getString("image"), jSONObject.optString("url"), jSONObject.optString("context"), this.f14363b, this.f14364c, this.f14365d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share image data.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.a$d */
    /* loaded from: classes.dex */
    public class d implements Callback {

        /* renamed from: a */
        final /* synthetic */ ActivityC0153c f14367a;

        /* renamed from: b */
        final /* synthetic */ Intent f14368b;

        /* renamed from: c */
        final /* synthetic */ int f14369c;

        /* renamed from: d */
        final /* synthetic */ e f14370d;

        d(ActivityC0153c activityC0153c, Intent intent, int i10, e eVar) {
            this.f14367a = activityC0153c;
            this.f14368b = intent;
            this.f14369c = i10;
            this.f14370d = eVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            try {
                C3451a.m15176f(this.f14367a, jSONObject.getString("video"), jSONObject.optString("url"), jSONObject.optString("context"), this.f14368b, this.f14369c, this.f14370d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share video data.");
            }
        }
    }

    /* renamed from: ha.a$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo12461a(String str, String str2);
    }

    C3451a(MessageBus messageBus) {
        this.f14346a = messageBus == null ? MessageBus.m13364e() : messageBus;
    }

    /* renamed from: a */
    public static int m15171a(int i10) {
        return Build.VERSION.SDK_INT >= 31 ? i10 | 33554432 : i10;
    }

    /* renamed from: b */
    static void m15172b(ActivityC0153c activityC0153c, Intent intent, Intent intent2, int i10) {
        PendingIntent broadcast = PendingIntent.getBroadcast(activityC0153c, 0, intent2, m15171a(134217728));
        if (Build.VERSION.SDK_INT >= 22) {
            activityC0153c.startActivityForResult(Intent.createChooser(intent, null, broadcast.getIntentSender()), i10);
        } else {
            activityC0153c.startActivityForResult(Intent.createChooser(intent, null), i10);
        }
    }

    /* renamed from: c */
    static void m15173c(ActivityC0153c activityC0153c, String str, String str2, String str3, String str4, Intent intent, int i10, e eVar) {
        if (eVar != null) {
            eVar.mo12461a(str4, str3);
        }
        File filesDir = activityC0153c.getFilesDir();
        File parentFile = filesDir != null ? filesDir.getParentFile() : null;
        File parentFile2 = parentFile != null ? parentFile.getParentFile() : null;
        String absolutePath = parentFile2 != null ? parentFile2.getAbsolutePath() : BuildConfig.FLAVOR;
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        Uri parse = Uri.parse(str.replace(absolutePath, "content://"));
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setDataAndType(parse, str2);
        intent2.putExtra("android.intent.extra.STREAM", parse);
        intent2.addFlags(1);
        if (!TextUtils.isEmpty(str3)) {
            intent2.putExtra("android.intent.extra.TEXT", str3);
        }
        m15172b(activityC0153c, intent2, intent, i10);
    }

    /* renamed from: d */
    static void m15174d(ActivityC0153c activityC0153c, String str, String str2, String str3, Intent intent, int i10, e eVar) {
        m15173c(activityC0153c, str, "image/*", str2, str3, intent, i10, eVar);
    }

    /* renamed from: e */
    static void m15175e(ActivityC0153c activityC0153c, String str, String str2, Intent intent, int i10, e eVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (eVar != null) {
            eVar.mo12461a(str2, BuildConfig.FLAVOR);
        }
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", str);
        m15172b(activityC0153c, intent2, intent, i10);
    }

    /* renamed from: f */
    static void m15176f(ActivityC0153c activityC0153c, String str, String str2, String str3, Intent intent, int i10, e eVar) {
        m15173c(activityC0153c, str, "video/*", str2, str3, intent, i10, eVar);
    }

    /* renamed from: g */
    public static C3451a m15177g() {
        if (f14345h.getAndIncrement() == 0) {
            f14344g = new C3451a(null);
        }
        return f14344g;
    }

    /* renamed from: h */
    public synchronized void m15178h(ActivityC0153c activityC0153c, Intent intent, int i10, e eVar) {
        if (this.f14351f) {
            Log.w("ContentSharingProtocol", "Attempted to set ExternalContentSharingProtocol callback, but one is already set.");
            return;
        }
        this.f14351f = true;
        this.f14348c = this.f14346a.m13372m(JNIExternalContentSharingProtocol.getShareTextId(), new a(activityC0153c, intent, i10, eVar));
        this.f14349d = this.f14346a.m13372m(JNIExternalContentSharingProtocol.getShareUrlId(), new b(activityC0153c, intent, i10, eVar));
        this.f14347b = this.f14346a.m13372m(JNIExternalContentSharingProtocol.getShareImageId(), new c(activityC0153c, intent, i10, eVar));
        this.f14350e = this.f14346a.m13372m(JNIExternalContentSharingProtocol.getShareVideoId(), new d(activityC0153c, intent, i10, eVar));
    }

    /* renamed from: i */
    public synchronized void m15179i() {
        if (!this.f14351f) {
            Log.w("ContentSharingProtocol", "Attempted to disconnect ExternalContentSharingProtocol callback, but one is not connected.");
            return;
        }
        this.f14347b.m13359a();
        this.f14347b = null;
        this.f14348c.m13359a();
        this.f14348c = null;
        this.f14349d.m13359a();
        this.f14349d = null;
        this.f14350e.m13359a();
        this.f14350e = null;
        this.f14351f = false;
    }
}
