package p087g6;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import p271v3.AbstractC4955h;

/* renamed from: g6.m */
/* loaded from: classes.dex */
public class C3302m {
    /* renamed from: a */
    public static void m14575a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        m14576b(context, AbstractC4955h.m19378o(str));
    }

    /* renamed from: b */
    public static void m14576b(@RecentlyNonNull Context context, @RecentlyNonNull List<String> list) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        context.sendBroadcast(intent);
    }
}
