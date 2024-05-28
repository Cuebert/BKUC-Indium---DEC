package p321z2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p096h3.C3393c;

/* renamed from: z2.j0 */
/* loaded from: classes.dex */
public final class C5985j0 {

    /* renamed from: a */
    private static final Object f22049a = new Object();

    /* renamed from: b */
    private static boolean f22050b;

    /* renamed from: c */
    private static String f22051c;

    /* renamed from: d */
    private static int f22052d;

    /* renamed from: a */
    public static int m21291a(Context context) {
        m21292b(context);
        return f22052d;
    }

    /* renamed from: b */
    private static void m21292b(Context context) {
        Bundle bundle;
        synchronized (f22049a) {
            if (f22050b) {
                return;
            }
            f22050b = true;
            try {
                bundle = C3393c.m14952a(context).m14947b(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
            if (bundle == null) {
                return;
            }
            f22051c = bundle.getString("com.google.app.id");
            f22052d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
