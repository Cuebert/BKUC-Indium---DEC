package p250t7;

import android.content.Context;
import android.content.res.Resources;
import com.appsflyer.oaid.BuildConfig;
import java.util.IllegalFormatException;
import p035c9.C1151k;

/* renamed from: t7.a */
/* loaded from: classes.dex */
public class C4736a {
    /* renamed from: a */
    private static String m18879a() {
        C1151k.m6709c("rbx.strings", "context is null");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    private static String m18880b(Context context, int i10, Object... objArr) {
        try {
            C1151k.m6714h("rbx.strings", "ResourceId: " + i10);
            if (objArr.length > 0) {
                return context.getString(i10, objArr);
            }
            return context.getString(i10);
        } catch (Resources.NotFoundException unused) {
            C1151k.m6708b("Resources.NotFoundException thrown in getStringFromResources()");
            return BuildConfig.FLAVOR;
        } catch (IllegalFormatException unused2) {
            C1151k.m6708b("IllegalFormatException thrown in getStringFromResources()");
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: c */
    public static String m18881c(Context context, int i10, Object... objArr) {
        if (context == null) {
            return m18879a();
        }
        return m18880b(context, i10, objArr);
    }
}
