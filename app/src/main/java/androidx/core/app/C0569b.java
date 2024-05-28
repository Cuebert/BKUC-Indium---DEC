package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.C0587a;
import androidx.core.os.C0622a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: androidx.core.app.b */
/* loaded from: classes.dex */
public class C0569b extends C0587a {

    /* renamed from: c */
    private static g f3055c;

    /* renamed from: androidx.core.app.b$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ String[] f3056n;

        /* renamed from: o */
        final /* synthetic */ Activity f3057o;

        /* renamed from: p */
        final /* synthetic */ int f3058p;

        a(String[] strArr, Activity activity, int i10) {
            this.f3056n = strArr;
            this.f3057o = activity;
            this.f3058p = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f3056n.length];
            PackageManager packageManager = this.f3057o.getPackageManager();
            String packageName = this.f3057o.getPackageName();
            int length = this.f3056n.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f3056n[i10], packageName);
            }
            ((f) this.f3057o).onRequestPermissionsResult(this.f3058p, this.f3056n, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.b$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static void m2733a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        static void m2734b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        /* renamed from: c */
        static void m2735c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$c */
    /* loaded from: classes.dex */
    static class c {
        /* renamed from: a */
        static void m2736a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        static void m2737b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        /* renamed from: c */
        static boolean m2738c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$d */
    /* loaded from: classes.dex */
    static class d {
        /* renamed from: a */
        static boolean m2739a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        static boolean m2740b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: androidx.core.app.b$e */
    /* loaded from: classes.dex */
    static class e {
        /* renamed from: a */
        static boolean m2741a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$f */
    /* loaded from: classes.dex */
    public interface f {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.b$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        boolean m2742a(Activity activity, String[] strArr, int i10);
    }

    /* renamed from: androidx.core.app.b$h */
    /* loaded from: classes.dex */
    public interface h {
        /* renamed from: j */
        void mo2743j(int i10);
    }

    /* renamed from: m */
    public static void m2726m(Activity activity) {
        b.m2733a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m2727n(Activity activity) {
        if (activity.isFinishing() || C0571d.m2752i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* renamed from: o */
    public static void m2728o(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    C0569b.m2727n(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static void m2729p(Activity activity, String[] strArr, int i10) {
        g gVar = f3055c;
        if (gVar == null || !gVar.m2742a(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (!TextUtils.isEmpty(strArr[i11])) {
                    if (!C0622a.m3335c() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i11));
                    }
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof h) {
                    ((h) activity).mo2743j(i10);
                }
                c.m2737b(activity, strArr, i10);
            } else if (activity instanceof f) {
                new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i10));
            }
        }
    }

    /* renamed from: q */
    public static boolean m2730q(Activity activity, String str) {
        if (!C0622a.m3335c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 32) {
            return e.m2741a(activity, str);
        }
        if (i10 == 31) {
            return d.m2740b(activity, str);
        }
        if (i10 >= 23) {
            return c.m2738c(activity, str);
        }
        return false;
    }

    /* renamed from: r */
    public static void m2731r(Activity activity, Intent intent, int i10, Bundle bundle) {
        b.m2734b(activity, intent, i10, bundle);
    }

    /* renamed from: s */
    public static void m2732s(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        b.m2735c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
