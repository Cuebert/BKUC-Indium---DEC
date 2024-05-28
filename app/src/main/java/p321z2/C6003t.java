package p321z2;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.os.C0624c;
import com.google.android.gms.common.C1380c;
import java.util.Locale;
import p070f3.C3134h;
import p093h0.C3362g;
import p096h3.C3393c;
import p270v2.C4940b;
import p282w2.C5107e;

/* renamed from: z2.t */
/* loaded from: classes.dex */
public final class C6003t {

    /* renamed from: a */
    private static final C3362g<String, String> f22068a = new C3362g<>();

    /* renamed from: b */
    private static Locale f22069b;

    /* renamed from: a */
    public static String m21307a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C3393c.m14952a(context).m14948c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m21308b(Context context) {
        return context.getResources().getString(C4940b.f19000g);
    }

    /* renamed from: c */
    public static String m21309c(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(C4940b.f18997d);
        }
        if (i10 == 2) {
            return resources.getString(C4940b.f19003j);
        }
        if (i10 != 3) {
            return resources.getString(R.string.ok);
        }
        return resources.getString(C4940b.f18994a);
    }

    /* renamed from: d */
    public static String m21310d(Context context, int i10) {
        Resources resources = context.getResources();
        String m21307a = m21307a(context);
        if (i10 == 1) {
            return resources.getString(C4940b.f18998e, m21307a);
        }
        if (i10 == 2) {
            return C3134h.m13790d(context) ? resources.getString(C4940b.f19007n) : resources.getString(C4940b.f19004k, m21307a);
        }
        if (i10 == 3) {
            return resources.getString(C4940b.f18995b, m21307a);
        }
        if (i10 == 5) {
            return m21314h(context, "common_google_play_services_invalid_account_text", m21307a);
        }
        if (i10 == 7) {
            return m21314h(context, "common_google_play_services_network_error_text", m21307a);
        }
        if (i10 == 9) {
            return resources.getString(C4940b.f19002i, m21307a);
        }
        if (i10 != 20) {
            switch (i10) {
                case 16:
                    return m21314h(context, "common_google_play_services_api_unavailable_text", m21307a);
                case 17:
                    return m21314h(context, "common_google_play_services_sign_in_failed_text", m21307a);
                case 18:
                    return resources.getString(C4940b.f19006m, m21307a);
                default:
                    return resources.getString(C5107e.f19372a, m21307a);
            }
        }
        return m21314h(context, "common_google_play_services_restricted_profile_text", m21307a);
    }

    /* renamed from: e */
    public static String m21311e(Context context, int i10) {
        if (i10 != 6 && i10 != 19) {
            return m21310d(context, i10);
        }
        return m21314h(context, "common_google_play_services_resolution_required_text", m21307a(context));
    }

    /* renamed from: f */
    public static String m21312f(Context context, int i10) {
        String m21313g;
        if (i10 == 6) {
            m21313g = m21315i(context, "common_google_play_services_resolution_required_title");
        } else {
            m21313g = m21313g(context, i10);
        }
        return m21313g == null ? context.getResources().getString(C4940b.f19001h) : m21313g;
    }

    /* renamed from: g */
    public static String m21313g(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(C4940b.f18999f);
            case 2:
                return resources.getString(C4940b.f19005l);
            case 3:
                return resources.getString(C4940b.f18996c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m21315i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m21315i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m21315i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m21315i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    private static String m21314h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m21315i = m21315i(context, str);
        if (m21315i == null) {
            m21315i = resources.getString(C5107e.f19372a);
        }
        return String.format(resources.getConfiguration().locale, m21315i, str2);
    }

    /* renamed from: i */
    private static String m21315i(Context context, String str) {
        String str2;
        String str3;
        C3362g<String, String> c3362g = f22068a;
        synchronized (c3362g) {
            Locale m3353c = C0624c.m3343a(context.getResources().getConfiguration()).m3353c(0);
            if (!m3353c.equals(f22069b)) {
                c3362g.clear();
                f22069b = m3353c;
            }
            String str4 = c3362g.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources m7594e = C1380c.m7594e(context);
            if (m7594e == null) {
                return null;
            }
            int identifier = m7594e.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = m7594e.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                c3362g.put(str, string);
                return string;
            }
            if (str.length() != 0) {
                str2 = "Got empty resource: ".concat(str);
            } else {
                str2 = new String("Got empty resource: ");
            }
            Log.w("GoogleApiAvailability", str2);
            return null;
        }
    }
}
