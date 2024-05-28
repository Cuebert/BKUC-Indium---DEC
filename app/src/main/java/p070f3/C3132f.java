package p070f3;

import android.content.Context;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p321z2.C5984j;

/* renamed from: f3.f */
/* loaded from: classes.dex */
public final class C3132f {

    /* renamed from: a */
    private static final String[] f13141a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    /* renamed from: a */
    public static boolean m13785a(Context context, Throwable th) {
        try {
            C5984j.m21286j(context);
            C5984j.m21286j(th);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
