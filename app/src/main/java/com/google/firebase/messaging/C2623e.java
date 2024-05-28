package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0587a;
import com.appsflyer.oaid.BuildConfig;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes.dex */
public final class C2623e {

    /* renamed from: a */
    private static final AtomicInteger f10282a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: a */
    private static int m12044a(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m12050g(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m12050g(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61);
            sb2.append("Icon resource ");
            sb2.append(str2);
            sb2.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb2.toString());
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !m12050g(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 35);
                sb3.append("Couldn't get own application info: ");
                sb3.append(valueOf);
                Log.w("FirebaseMessaging", sb3.toString());
            }
        }
        return (i10 == 0 || !m12050g(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    /* renamed from: b */
    private static PendingIntent m12045b(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, f10282a.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    /* renamed from: c */
    private static Bundle m12046c(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
            sb2.append("Couldn't get own application info: ");
            sb2.append(valueOf);
            Log.w("FirebaseMessaging", sb2.toString());
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ca  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.messaging.C2622d m12047d(android.content.Context r9, com.google.firebase.messaging.C2632n r10) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C2623e.m12047d(android.content.Context, com.google.firebase.messaging.n):com.google.firebase.messaging.d");
    }

    /* renamed from: e */
    private static CharSequence m12048e(String str, C2632n c2632n, PackageManager packageManager, Resources resources) {
        String m12065b = c2632n.m12065b(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(m12065b)) {
            return m12065b;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
            sb2.append("Couldn't get own application info: ");
            sb2.append(valueOf);
            Log.e("FirebaseMessaging", sb2.toString());
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: f */
    private static Integer m12049f(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 56);
                sb2.append("Color is invalid: ");
                sb2.append(str);
                sb2.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(C0587a.m3029c(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    @TargetApi(26)
    /* renamed from: g */
    private static boolean m12050g(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb2.append(i10);
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Couldn't find resource ");
            sb3.append(i10);
            sb3.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb3.toString());
            return false;
        }
    }

    @TargetApi(26)
    /* renamed from: h */
    private static String m12051h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 122);
                sb2.append("Notification Channel requested (");
                sb2.append(str);
                sb2.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", sb2.toString());
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string)) {
                if (notificationManager.getNotificationChannel(string) != null) {
                    return string;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
