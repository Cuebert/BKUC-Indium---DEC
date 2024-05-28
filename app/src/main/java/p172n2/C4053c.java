package p172n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C1381d;

/* renamed from: n2.c */
/* loaded from: classes.dex */
public final class C4053c {

    /* renamed from: a */
    private SharedPreferences f16465a;

    public C4053c(Context context) {
        try {
            Context m7598d = C1381d.m7598d(context);
            this.f16465a = m7598d == null ? null : m7598d.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f16465a = null;
        }
    }

    /* renamed from: a */
    public final boolean m16851a(String str, boolean z10) {
        try {
            SharedPreferences sharedPreferences = this.f16465a;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    /* renamed from: b */
    public final float m16852b(String str, float f10) {
        try {
            SharedPreferences sharedPreferences = this.f16465a;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* renamed from: c */
    public final String m16853c(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f16465a;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
