package p035c9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2748c0;
import com.roblox.client.C2822f0;

/* renamed from: c9.h */
/* loaded from: classes.dex */
public class C1148h {
    /* renamed from: a */
    public static void m6701a(Context context, String str) {
        if (context == null) {
            return;
        }
        C2822f0.m12500v(BuildConfig.FLAVOR, str);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(str));
        if (C1152l.m6730a(context, intent)) {
            context.startActivity(intent);
        } else {
            Toast.makeText(context, C2748c0.f10698n3, 0).show();
        }
    }

    /* renamed from: b */
    public static void m6702b(Context context) {
        m6701a(context, "mailto:info@roblox.com");
    }
}
